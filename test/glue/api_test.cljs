(ns glue.api-test
   (:require [cljs.test :refer-macros [deftest is testing run-tests]]
             [glue.api :as glue]))

(deftest kebab->camel
  (testing :basic
    (is (= "clickMe" (glue/kebab->camel "click-me")))))

(deftest adjust-name
  (testing :basic
    (is (= "clickMe" (glue/adjust-name :click-me)))))

(deftest adjust-data
  (testing :basic
    (let [f (fn [] {:a "A"})]
      (is (= "A" (.-a ((glue/adjust-data f))))))))
