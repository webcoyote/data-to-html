(ns data-to-html.css
  (:require [garden.core :refer [css]]
            [garden.units :refer [px]]))

(def min-size
  "The minimum size of the divs displaying data structures."
  {:min-width (px 20) :min-height (px 20)})

(def ^:dynamic *colors*
  "Rebind this var to change the color of different elements."
  {:vector  "#159"
   :map     "#AAB"
   :set     "#575"
   :key     "#F66"
   :value   "#644"
   :index   "#DA6"
   :string  "#FFD"
   :keyword "#FAB"
   :type    "#BBF"})

(defn get-css
  "Creates a string with css that styles the hierarchy of divs generated by data-to-html.core/convert."
  []
  (css [:body     {:font-size (px 16)}]
       [:div      {:background "#FFF" :font-family "sans-serif" :float 'left :margin (px 10) :padding (px 5) :box-shadow [(px 3) (px 3) (px 4) "#000"]}]
       [:.vector  (merge {:background (:vector *colors*)} min-size)]
       [:.map     (merge {:background (:map    *colors*)} min-size)]
       [:.set     (merge {:background (:set    *colors*)} min-size)]
       [:.key     {:background (:key     *colors*) :margin-right (px -7)}]
       [:.value   {:background (:value   *colors*) :margin-left  (px 0) :padding (px 0)}]
       [:.index   {:background (:index   *colors*) :margin-right (px -7) :clear 'both}]
       [:.string  {:background (:string  *colors*)}]
       [:.keyword {:background (:keyword *colors*)}]
       [:.type    {:background (:type    *colors*)}]))

