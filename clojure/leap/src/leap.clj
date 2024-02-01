(ns leap)

(defn leap-year? [year] ;; <- argslist goes here
  ;; your code goes here
  (or (and (zero? (mod year 4)) (not (zero? (mod year 100))))
      (zero? (mod year 400)))
  )

