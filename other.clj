#(into {}
       (for 
         [[k v] %
          [k2 v2] v]
         [[k k2] v2]))
