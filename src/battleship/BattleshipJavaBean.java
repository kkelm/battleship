package battleship;

public class BattleshipJavaBean {

    private String headerTemplate;
    private String footerTemplate;
    private String pageTitle;

    /**
     *  Constructor
     */
    public BattleshipJavaBean() {
        pageTitle = "Battleship v1.0";
    }

    public String getHeaderTemplate() {
        return headerTemplate;
    }

    public void setHeaderTemplate(String headerTemplate) {
        this.headerTemplate = headerTemplate;
    }

    public String getFooterTemplate() {
        return footerTemplate;
    }

    public void setFooterTemplate(String footerTemplate) {
        this.footerTemplate = footerTemplate;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

}