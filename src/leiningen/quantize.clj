(ns leiningen.quantize
  (:require [leiningen.core.eval :as eval]))

(defn quantize
  [project & args]
  (eval/eval-in-project '{:dependencies [[quantize "0.1.0-SNAPSHOT"]]}
                        `(quantize.core/run '~project ~@args)
                        '(require 'quantize.core)))


