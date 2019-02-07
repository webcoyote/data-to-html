(ns dev
  (:require
    [clojure.tools.namespace.repl :refer [refresh]]))

(println "\n\ntype (refresh) to reload code\n\n")

(def example-data
  {:a "foo" :b "bar" :other-stuff
   {:item-1 ["hello" "clojure"],
    :item-2 ["hello" "hiccup"],
    :another-map
    {:x "foo" :y "bar" :z "baz"}}
:c "wowza sauce"})

(defn example []
    (data-to-html.core/inspect example-data))