(defproject for-clojure "0.1.0-SNAPSHOT"
  :description "4clojure.com Solutions Collection"
  :url "https://www.4clojure.com/user/ktrzewiczek"
  :license {:name "MIT"
            :url "https://github.com/trzewiczek/for-clojure-solutions/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot for-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
