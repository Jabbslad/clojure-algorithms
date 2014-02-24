(ns algos.quick-union
    (:use [algos.core :only [ids]]))

(defn root 
    "returns the root of a vector"
    [v x]
    (if (== x (v x))
        x
        (recur v (v x))))

(defn connected? 
    "are two nodes are connected"
    [v p q]
    (== (root p) (root q)))

(defn union 
    "union two nodes within a vector"
    [v p q]
    (assoc v (root p) (root q)))