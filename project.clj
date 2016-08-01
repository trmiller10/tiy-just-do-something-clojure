(defproject tiy-just-do-something-clojure "0.0.1-SNAPSHOT"
  :description "This web app will do something."
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.4.0"]
                 [hiccup "1.0.5"]
                 [compojure "1.5.0"]
                 [org.clojure/java.jdbc "0.6.1"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [tiy-just-do-something-clojure.core]
  :main tiy-just-do-something-clojure.core)
