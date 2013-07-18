(ns data-to-html.css
  (require [garden.core :refer [css]]
           [garden.units :refer [px]]))

(def min-size {:min-width (px 20) :min-height (px 20)})

(defn get-css []
  (css [:body     {:font-size (px 16)}]
       [:div      {:background "#f00" :font-family "sans-serif" :float 'left :margin (px 10) :padding (px 5) :box-shadow [(px 3) (px 3) (px 4) "#000"]}]
       [:.vector  (merge {:background "#159"} min-size)]
       [:.map     (merge {:background "#AAB"} min-size)]
       [:.set     (merge {:background "#575"} min-size)]
       [:.key     {:background "#F66" :margin-right (px -7)}]
       [:.value   {:background "#644" :margin-left (px 0) :padding (px 0)}]
       [:.index   {:background "#DA6" :margin-right (px -7) :clear 'both}]
       [:.string  {:background "#FFD"}]
       [:.keyword {:background "#FAB"}]
       [:.type    {:background "#BBF"}]))
