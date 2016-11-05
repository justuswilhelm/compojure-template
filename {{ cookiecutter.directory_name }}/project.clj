(defproject {{ cookiecutter.project_name }} "0.1.0"
  :description "{{ cookiecutter.description }}"
  :url "{{ cookiecutter.url }}"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.2.1"]
                 [ring/ring-jetty-adapter "1.2.1"]
                 [compojure "1.1.6"]]
  :plugins [[lein-ring "0.8.10"]
            [lein-kibit "0.1.2"]]

  ; See https://github.com/weavejester/lein-ring#web-server-options for the
  ; various options available for the lein-ring plugin
  :ring {:handler {{ cookiecutter.project_name }}.handler/app
         :nrepl {:start? true
                 :port 9998}}
  :main ^:skip-aot rest.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring-mock "0.1.5"]]}})
