(ns 미생.예제.pbkdf2
  (:use [미생.기본]
        [미생.검사])
  (:import [javax.crypto SecretKeyFactory]
           [javax.crypto.spec PBEKeySpec]
           [java.util Base64]))

(함수 pbkdf2 [password salt iterations derived-bits]
  (가정 [spec (PBEKeySpec. (.toCharArray password) (.getBytes salt) iterations derived-bits)
         factory (SecretKeyFactory/getInstance "PBKDF2WithHmacSHA1")]
    (->> (.generateSecret factory spec)
         (.getEncoded)
         (.encodeToString (Base64/getEncoder)))))

(검사정의 PBKDF2검사
  (검사 "안전한 해시 함수, PBKDF2"
    (확인* [raw password salt] (= raw (pbkdf2 password salt 100 160))
           "tZAN6pbki7Xbhzo1tlSWauh1W3k=" "password" "salt1234"
           "I+0idwzKyHtv9INcaB3Sc5Sj2LQ=" "password" "1234salt"
           "0w+Mux/NDZVb40FDdu58nBCRat4=" "other" "salt1234"
           "BXOtJZEp5TJTnFBQNtu1LUzGHtM=" "other" "1234salt")))
