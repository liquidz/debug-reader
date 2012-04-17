# debug-reader

Gauche's `?=` like debug print reader

## Usage

add dependencies

```clojure
[debug-reader "0.0.1"]
```

require debug-reader.core

```clojure
(ns foo
  (:require debug-reader.core))
```

## Sample

debug print with `#?=`

```clojure
(println (map inc #?=(range 10)))
;?= (0 1 2 3 4 5 6 7 8 9)
;=> (1 2 3 4 5 6 7 8 9 10)
```

## License

Copyright (C) 2012 [@uochan](http://twitter.com/uochan)

Distributed under the Eclipse Public License, the same as Clojure.