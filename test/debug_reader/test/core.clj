(ns debug-reader.test.core
  (:use [debug-reader.core])
  (:use [clojure.test]))

(deftest debug-print-test
  (are [x y] (= x y)
    true   #?= true
    'sym   #?= 'sym
    3      #?=(+ 1 2)
    "str"  #?="str"
    [1]    #?=[1]
    {:a 1} #?={:a 1}
    #{1}   #?= #{1}
    +      #?= +))
