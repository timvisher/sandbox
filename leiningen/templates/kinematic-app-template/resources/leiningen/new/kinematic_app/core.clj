(ns {{name}}.core
  (:require
   [clojure.tools.nrepl.server :refer [start-server stop-server]]
   [cider.nrepl                :refer [cider-nrepl-handler]]
   [{{name}}.web            :as web]
   [clojure.tools.logging      :as log]
   [clojure.data.json          :as json]
   [schema.core                :as s]
   [{{name}}.helpers        :refer [date->string]]))

(defonce nrepl-server (atom nil))

(defonce config
  (atom
   {:nrepl {:port 4210}
    :apps  []}))

(defn init [config]
  (swap! config assoc :apps
         [{:description "Public Api"
           :app         :api-v1
           :port        8210
           :mount-point "/api/{{name}}/v1"
           :ns-prefix   "{{name}}.api.v1"}]))


;; NB: move this into some kind of helpers
(extend
    java.util.Date
  json/JSONWriter
  {:-write (fn [d pw]
             (.print pw "\"")
             (.print pw (date->string d))
             (.print pw "\""))})

(defn restart [config]
  (init config)
  (web/restart config))

(defn -main
  "Start the service."
  [& args]
  (init config)
  (s/set-fn-validation! true)
  (reset! nrepl-server (start-server
                        :port (-> @config :nrepl :port)
                        :handler cider-nrepl-handler))
  (log/infof "nREPL server started: %s" (-> @config :nrepl :port))
  (web/restart config)
  (log/infof "websever started: %s" config))

