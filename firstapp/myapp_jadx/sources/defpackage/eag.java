package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public enum eag implements bag {
    AZ_MENU("az_menu"),
    HOME_BANNER("home_banner"),
    DEEPLINK("deeplink"),
    UNKNOWN("unknown"),
    HOMEPAGE_SPORTY_STORY("homepage_sporty_story"),
    HOMEPAGE_TOP_BANNER("homepage_top_banner"),
    HOMEPAGE_POPULAR_BANNER("homepage_popular_banner"),
    HOMEPAGE_POPUP_BANNER("homepage_popup_banner"),
    HOMEPAGE_FEATUREDGAMES_SECTION("homepage_featuredgames_section"),
    GIFT("gift"),
    GAME_LOBBY("game_lobby");

    public final String a;

    eag(String str) {
        this.a = str;
    }

    @Override // defpackage.bag
    public final String K0() {
        return this.a;
    }
}
