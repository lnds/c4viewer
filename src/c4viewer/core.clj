(ns c4viewer.core
  (:gen-class))

(require '[dali.io :as io])

(defn document [components]
  [:dali/page
    {:xmlns:inkscape "http://www.inkscape.org/namespaces/inkscape"
     :xmlns:sodipodi "http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd"}
    components])


(defn person 
  ([id name] (person id name 179.74365 676.70203 ))
  ([id name x y]
    [:dali/page
    {:xmlns:inkscape "http://www.inkscape.org/namespaces/inkscape"
     :xmlns:sodipodi "http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd"}
    [:path 
      { :id (str "path-" id)
        :inkscape:connector-curvature "0"
        :style "opacity:1;fill:#000080;fill-opacity:1;fill-rule:nonzero;stroke:none;stroke-width:2;stroke-linecap:round;stroke-linejoin:round;stroke-miterlimit:4;stroke-dasharray:none;stroke-dashoffset:0;stroke-opacity:1"}
      :m [(+ x 0.25635) (- y 184.33987)]
      :a [53.658658 53.776951] 0 0 0 [-53.6586 53.77813] 
      :a [53.658658 53.776951] 0 0 0 [19.40703 41.37171]
      :l [-43.05423 0]
      :C [(- x 100.70263) (- y 89.19003)] [(- x 119.74365) (- y 70.10596)] [(- x 119.74365) (- y 46.40111)]
      :l [0 59.27228]
      :c [0 23.7047] [19.04102 42.789] [42.6942 42.789]
      :l [154.61159 0]
      :C [(+ x 101.21533) (+ y 55.66017)] [(+ x 120.25635) (+ y 36.52587)] [(+ x 120.25635) (+ y 12.87117)]
      :l [0 -59.27228]
      :C [(+ x 120.25635) (- y 70.10596)] [(+ x 101.21533) (- y 89.19003)] [(+ x 77.56214) (- y 89.19003)]
      :l [-43.09599 0]
      :A [53.658658 53.776951] 0 0 0 [(+ x 53.91495) (- y 130.56174)] 
      :A [53.658658 53.776951] 0 0 0 [(+ x 0.25635) (- y 184.33987)]
      :Z]
    [:text
      {:sodipodi:linespacing "125%"
       :id (str "text-" id)
       :y y
       :x x
       :style "font-style:normal;font-variant:normal;font-weight:bold;font-stretch:normal;font-size:24pt;line-height:125%;font-family:Verdana;-inkscape-font-specification:'Verdana, Bold';text-align:center;letter-spacing:0px;word-spacing:0px;writing-mode:lr-tb;text-anchor:middle;fill:#ffffff;fill-opacity:1;stroke:none;stroke-width:1px;stroke-linecap:butt;stroke-linejoin:miter;stroke-opacity:1"
       :xml:space "preserve"}
       [:tspan 
        {:y y
         :x x
         :id (str "tspan-" id)
         :sodipodi:role "line"} name]]]))

  ;d="m 180,492.36216 a 53.658658,53.776951 0 0 0 -53.6586,53.77813 53.658658,53.776951 0 0 0 19.40703,41.37171 l -43.05423,0 
  ;C 79.04102,587.512 60,606.59607 60,630.30092 
  ;l 0,59.27228 
  ;c 0,23.7047 19.04102,42.789 42.6942,42.789 
  ;l 154.61159,0 
  ;C 280.95898,732.3622 300,713.2779 300,689.5732 
  ;l 0,-59.27228 C 300,606.59607 280.95898,587.512 257.30579,587.512 
  ;l -43.09599,0 
  ;A 53.658658,53.776951 0 0 0 233.6586,546.14029 53.658658,53.776951 0 0 0 180,492.36216 Z"
        
        
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (io/render-svg (person "persona" "Usuario" 500 400) "hello-world.svg"))
