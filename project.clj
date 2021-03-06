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
                 [secretary "1.2.3"]
                 [cheshire "5.6.3"]
                 [binaryage/devtools "0.8.2"]
                 [figwheel-sidecar "0.5.9"]
                 [com.cemerick/piggieback "0.2.1"]]

  :plugins [[lein-shell "0.4.0"]
            [lein-cljsbuild "1.1.4"]
            ;[cljs-simple-cache-buster "0.2.0"]
            [s3-wagon-private "1.3.0"]]
  :profiles
  {:dev
   {:dependencies [[cheshire "5.6.3"]
                   [binaryage/devtools "0.8.2"]
                   [figwheel-sidecar "0.5.9"]
                   [com.cemerick/piggieback "0.2.1"]]

    :plugins      [[lein-figwheel "0.5.9"]
                   [lein-doo "0.1.7"]]
    }}
  )
