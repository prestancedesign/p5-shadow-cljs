(ns app.core
  (:require [goog.object :as g]))

(defn setup []
  (let [cnv (js/createCanvas 640 480)
        x (/ (- (.-windowWidth js/window) (.-width js/window)) 2)
        y (/ (- (.-windowHeight js/window) (.-height js/window)) 2)]
    (.position cnv x y)
    (js/background 235)))

(defn draw []
  (if js/mouseIsPressed
    (js/fill 255)
    (js/fill 155))
  (js/ellipse js/mouseX js/mouseY 80 80))

(doto js/window
  (g/set "setup" setup)
  (g/set "draw" draw))
