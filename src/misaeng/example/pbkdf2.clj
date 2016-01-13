(ns misaeng.example.pbkdf2
  (:use [misaeng.core])
  (:import [javax.crypto SecretKeyFactory]
           [javax.crypto.spec PBEKeySpec]
           [java.util Base64]))

(함수 pbkdf2 [password salt iterations derived-bits]
  (가정 [spec (PBEKeySpec. (.toCharArray password) (.getBytes salt) iterations derived-bits)
        factory (SecretKeyFactory/getInstance "PBKDF2WithHmacSHA1")]
    (->> (.generateSecret factory spec)
         (.getEncoded)
         (.encodeToString (Base64/getEncoder)))))
