// @SOURCE:/Users/mdotson/akka-cluster-example/frontend/conf/routes
// @HASH:4f41fe2b6f59f0d1d4aec1fd7f4615d1d3133677
// @DATE:Tue Oct 07 15:59:25 CDT 2014

package controllers;

public class routes {
public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets();
public static final controllers.ReverseApplication Application = new controllers.ReverseApplication();

public static class javascript {
public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets();
public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication();
}
          

public static class ref {
public static final controllers.ref.ReverseAssets Assets = new controllers.ref.ReverseAssets();
public static final controllers.ref.ReverseApplication Application = new controllers.ref.ReverseApplication();
}
          
}
          