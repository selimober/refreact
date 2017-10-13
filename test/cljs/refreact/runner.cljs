(ns refreact.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [refreact.core-test]))

(doo-tests 'refreact.core-test)
