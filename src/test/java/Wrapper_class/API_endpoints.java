package Wrapper_class;

public enum API_endpoints {
    HOME("https://app.vwo.com","Homepage"),
    LOGIN("https://app.vwo.com/login","Loginpage"),
    DASHBOARD("https://app.vwo.com/dashboard","Dshboard page");

    String url;
    String page;
    // Home-> https://app.vwo.com
    // login ->https://app.vwo.com/login
    // Dashboard-> https://app.vwo.com/dashboard


    API_endpoints(String url, String page) {
        this.url = url;
        this.page = page;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
