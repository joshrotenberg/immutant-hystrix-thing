(defproject immutant-hystrix-thing "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :immutant {
             :war {
                   :resource-paths ["war-resources"]}}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.immutant/immutant "2.0.2"]
                 [compojure "1.3.1"]
                 [ring/ring-devel "1.3.1"]
                 [com.netflix.hystrix/hystrix-clj "1.3.1"]
                 [com.netflix.hystrix/hystrix-metrics-event-stream "1.4.10"]]
  :plugins [[lein-immutant "2.0.0"]]
  :main immutant-hystrix-thing.core
  :profiles {:uberjar {:aot [immutant-hystrix-thing.core]}}
  :min-lein-version "2.4.0"
  :jvm-opts ["-Dhornetq.data.dir=target/hornetq-data"
             "-Dcom.arjuna.ats.arjuna.objectstore.objectStoreDir=target/ObjectStore"])
