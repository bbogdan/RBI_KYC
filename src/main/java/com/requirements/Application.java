package com.requirements;

import net.thucydides.core.annotations.Feature;

public class Application {
   
	@Feature
    public class Search {
        public class SearchByKeyword {}
        public class SearchByMultipleKeywords {}
    }
	
	@Feature
	public class Navigation{
		public class ToDashboard{}
	}
}