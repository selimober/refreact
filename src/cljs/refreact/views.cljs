(ns refreact.views
  (:require [re-frame.core :as re-frame]
            ["react-notification" :refer [NotificationStack]]))

(defn main-panel []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [:div "Hello from " @name
       [:> NotificationStack {:notifications [{:key 1 :message "Hola!"}]
                              :onDismiss #()}]])))
