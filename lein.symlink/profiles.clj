{
 :repl {:plugins []
        :dependencies [[alembic "0.3.2"]]}
 :user {
        :dependencies [
                       [cljfmt "0.1.10"]
                       [jonase/eastwood "0.2.1" :exclusions [org.clojure/clojure]]
                       ]
        :test-refresh {:notify-command ["reattach-to-user-namespace" "terminal-notifier" "-title" "Tests" "-message"]}
        :plugins [
                  ;; 27 jan 2017
                  [cider/cider-nrepl "0.8.1"]
                  ;; 14 aug 2016
                  [lein-ancient "0.6.10"]
                  [lein-bikeshed "0.3.0"]
                  [lein-kibit "0.1.2"]
                  [jonase/eastwood "0.2.3" :exclusions [org.clojure/clojure]]
                  ;; older
                  [lein-pprint "1.1.1"]
                  [lein-midje "3.1.3"]
                  [slamhound "1.5.5"]
                  [lein-ubersource "0.1.1"]
                  [com.jakemccrary/lein-test-refresh "0.14.0"]
                  [pjstadig/humane-test-output "0.7.1"]
                  [venantius/ultra "0.4.0"]]
        :ultra {:color-scheme :solarized_dark}
        :android {:sdk-path "/Users/laurent/dev/android-sdk-macosx"}
        :aliases {"slamhound" ["run" "-m" "slam.hound"]}}}