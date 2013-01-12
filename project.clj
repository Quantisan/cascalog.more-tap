(defproject cascalog-more-taps "0.3.1-SNAPSHOT"
  :description "More taps for Cascalog"
  :url "https://github.com/Quantisan/cascalog.more-tap"
  :min-lein-version "2.0.0"
  :license {:name "MIT License"
            :url "http://www.opensource.org/licenses/MIT"}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.4.0"]
                                  [cascalog "1.10.0"]
                                  [cascading/cascading-hadoop "2.0.4"]
                                  [org.apache.hadoop/hadoop-core "0.20.2-dev"]]}}
  :repositories {"conjars.org" "http://conjars.org/repo"})