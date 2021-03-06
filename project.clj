(defproject peridottest "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://peridottest.herokuapp.com"
  :license {:name "FIXME: choose"
            :url "http://example.com/FIXME"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.1"]
                 [ring/ring-jetty-adapter "1.1.0"]
                 [ring/ring-devel "1.1.0"]
                 [ring-basic-authentication "1.0.1"]
                 [environ "0.2.1"]
                 [com.cemerick/drawbridge "0.0.6"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]
            [speclj "2.5.0"]]
  :hooks [environ.leiningen.hooks]
  :profiles {:production {:env {:production true}}
             :dev {:dependencies [[speclj "2.7.0"]
                                  [peridot "0.2.2"]]}})

