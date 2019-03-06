(ns overtone-project.core
  (:use [overtone.live]))

(recording-start "G:/overtone-tunes/p6.wav")

(def intro (sample (freesound-path 235536)))
(def so (intro :amp 0.5 :rate 2 :loop? 1))
(kill so)

(def  beat (sample (freesound-path 332024)))
(def c (beat))
(kill c)

(def fan (sample (freesound-path 348275)))
(def so (fan :amp 0.4 :rate 1 :loop? 1))
(kill so)

(def bath (sample (freesound-path 320955)))
(def b2 (bath))
(kill b2)

(recording-stop)
