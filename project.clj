(defproject account-dashboard "1.0"
  :dependencies [[cljs-ajax "0.5.8"]
                 [com.cemerick/url "0.1.1"]
                 [day8.re-frame/http-fx "0.1.3"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.229"]
                 [org.clojure/core.async "0.2.391"]
                 [cljsjs/d3 "3.5.7-1"]
                 [reagent "0.6.0"]
                 [reagent-utils "0.2.0"]
                 [re-frame "0.9.4"]
                 [re-com "2.0.0"]
                 [secretary "1.2.3"]]

  :plugins [[s3-wagon-private "1.3.0"]
            [lein-doo "0.1.7"]]
  )
