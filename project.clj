(defproject geo-intersection "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"osgeo-geotools" "http://download.osgeo.org/webdav/geotools"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [org.geotools/gt-main "9.0"]
                 [org.geotools/gt-shapefile "9.0"]
                 [org.geotools/gt-epsg-hsql "9.0"]
                 [org.geotools/gt-swing "9.0"]]
  :dev-dependencies [[swank-clojure "1.4.5"]]
  :main geo-intersection.core)
