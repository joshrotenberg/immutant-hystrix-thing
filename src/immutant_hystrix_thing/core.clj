(ns immutant-hystrix-thing.core
  (:require [immutant.web :as web]
            [com.netflix.hystrix.core :refer  [defcommand]]
            [clojure.pprint     :refer (pprint)]
            [ring.util.response :refer (response content-type)])
  (:import [com.netflix.hystrix HystrixCommandMetrics])
  (:gen-class))

(defcommand echo
  [request]
  (println "found" (count (HystrixCommandMetrics/getInstances)) "command(s) registered")
  (-> (response (with-out-str (pprint request)))
      (content-type "text/plain")))

(defn -main [& args]
  (web/run echo))
