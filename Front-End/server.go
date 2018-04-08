package main

import (	
  "log"
  "net/http"
  "fmt"
  "html/template"
  "os/exec"

  
)

func main() {
  fs := http.FileServer(http.Dir("Proyecto"))
  http.Handle("/", fs)
  http.HandleFunc("/login", login)


  log.Println("Listening...")
  http.ListenAndServe(":8448", nil)
}

func login(w http.ResponseWriter, r *http.Request) {
    fmt.Println("method:", r.Method) //get request method
    if r.Method == "GET" {
        t, _ := template.ParseFiles("index.gtpl")
        t.Execute(w, nil)
    } else {
        r.ParseForm()
        // logic part of log in
        fmt.Println("appName:", r.Form["appName"])

        out, err := exec.Command("date").Output()
        if err != nil {
          log.Fatal(err)
        }

        fmt.Printf("", out)

    }
}

