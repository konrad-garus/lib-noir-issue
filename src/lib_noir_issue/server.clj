(ns lib-noir-issue.server
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [ring.middleware.session :refer [wrap-session]]
            [noir.session :refer [wrap-noir-session]]))

(def app
  (-> (fn [request] {:body "Hello, world"})
    wrap-noir-session))
    
(defn -main [& m]
  (run-jetty #'app {:port 8080 :join? false}))
