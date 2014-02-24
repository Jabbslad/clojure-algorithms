(defproject algos "0.1.0-SNAPSHOT"
  :description "Algorithms in Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot algos.quick-find
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
