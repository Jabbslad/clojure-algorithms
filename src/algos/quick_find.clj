(ns algos.quick-find)

(defn ids [n]
    (apply vector (range n)))

(defn connected? [v p q]
    (== (v p) (v q)))

(defn union [v p q]
    (let [pid (v p) qid (v q)]
        (vec (map #(if (== % pid) qid %) v))))
