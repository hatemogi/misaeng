(ns misaeng.example.pbkdf2-test
  (:use [misaeng.core]
        [misaeng.test]
        [misaeng.example.pbkdf2]))

(실험함수 PBKDF2
  (실험 "안전한 해시 함수, PBKDF2"
    (확인* [raw password salt] (= raw (pbkdf2 password salt 100 160))
           "tZAN6pbki7Xbhzo1tlSWauh1W3k=" "password" "salt1234"
           "I+0idwzKyHtv9INcaB3Sc5Sj2LQ=" "password" "1234salt"
           "0w+Mux/NDZVb40FDdu58nBCRat4=" "other" "salt1234"
           "BXOtJZEp5TJTnFBQNtu1LUzGHtM=" "other" "1234salt")))
