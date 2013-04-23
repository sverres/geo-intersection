(ns geo-intersection.core
  (:import [org.geotools.geometry.jts JTSFactoryFinder WKTReader2]))

(defn make-geometry-WKT
  "Make geometry object from WKT text string"
  [geometry-source]
  (.read (WKTReader2. (JTSFactoryFinder/getGeometryFactory nil)) geometry-source))

(defn -main [] 
  (let [geometry-A (make-geometry-WKT "POLYGON ((10 10, 15 0, 25 0, 30 10, 25 20, 15 20, 10 10))")
        geometry-B (make-geometry-WKT "POLYGON ((20 10, 30 0, 40 10, 30 20, 20 10))")]
    (do
    
      (println (str geometry-A))
    
      (println (str geometry-B))
      
      (println "Buffer on geometry-A:")
      (println (str (.buffer geometry-A 5)))

      (println "Intersection of geometry-A and geometry-B:")
      (println (str (.intersection geometry-A geometry-B)))
     
      (println "Union of geometry-A and geometry-B:")
      (println (str (.union geometry-A geometry-B)))
      
      (println "Symmetrical difference of geometry-A and geometry-B:")
      (println (str (.symDifference geometry-A geometry-B)))
      
      (println "Convex hull of geometry-A and geometry-B:")
      (println (str (.convexHull (.union geometry-A geometry-B))))
      
      )))
