 (defproject fff "0.1.0-SNAPSHOT"
   :description "FIXME: write description"
   :dependencies [[org.clojure/clojure "1.8.0"]
                  [metosin/muuntaja-yaml "0.6.0-alpha3"]
                  [metosin/compojure-api "2.0.0-alpha23"]]
   :ring {:handler fff.handler/app, :async? true}
   :uberjar-name "server.jar"
   :profiles {:dev {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]]
                   :plugins [[lein-ring "0.12.0"]]}})
