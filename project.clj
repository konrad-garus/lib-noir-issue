(defproject bpng "0.1.0-SNAPSHOT"
  :description "Demo for issue with lib-noir"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring "1.1.6"]
                 [lib-noir "0.2.0"]]
  :min-lein-version "2.0.0"
  :plugins [[lein-eclipse "1.0.0"]]
  :main lib-noir-issue.server)