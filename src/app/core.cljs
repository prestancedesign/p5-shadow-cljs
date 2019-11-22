(ns app.core)

(defn ^:export setup []
  (js/createCanvas 640 480))

(defn ^:export draw
  []
  (if js/mouseIsPressed
    (js/fill 255)
    (js/fill 155))
  (js/ellipse js/mouseX js/mouseY 80 80))
