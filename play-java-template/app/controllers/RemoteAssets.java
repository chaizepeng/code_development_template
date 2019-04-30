package controllers;


/**
 * 用于访问系统的静态资源信息
 * @author 13979
 *
 */
public class RemoteAssets {
	
	public static String base = "/assets/ace/";

    public static String versioned(String url) {
        return base + url;
    }
}
