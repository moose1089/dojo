(ns us2.core
  (:gen-class))



(def in1 '{a {p 1, q 2}
         b {m 3, n 4}})

(def in1-part '[a {p 1, q 2}])

(def out
  '{[a p] 1, [a q] 2
    [b m] 3, [b n] 4})


(defn f [[k v]]
  (into {} (map (fn [[ki vi]]
                  [[k ki] vi] )
                v)))

(defn g [m]
  (into {} (map f m))
  )
 
(defn combined [m]
  (into {} (map
            (fn [[k v]]
              (into {} (map (fn [[ki vi]]
                              [[k ki] vi] ) v)))
            m))
  )


(f in1-part)
 
(combined in1)

 




