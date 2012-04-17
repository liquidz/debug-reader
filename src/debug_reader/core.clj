(ns debug-reader.core)

(defn debug-print
  "Gauche like debug print reader"
  [x]
  `(let [res# ~x]
     (println "?=" res#)
     res#))
