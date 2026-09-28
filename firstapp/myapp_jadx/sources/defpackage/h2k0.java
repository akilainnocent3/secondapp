package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public enum h2k0 implements su6 {
    /* JADX INFO: Fake field, exist only in values array */
    WorldCupPassPopupImg("https://s.sporty.net/cms/fifa_world_cup_pass_popup_img_3ab4438e28.png"),
    /* JADX INFO: Fake field, exist only in values array */
    WorldCupPassTopSectionBg("https://s.sporty.net/cms/fifa_World_Cup_Pass_Page_Bg_3x_ae51038593.png"),
    /* JADX INFO: Fake field, exist only in values array */
    WorldCupPassTrophy("https://s.sporty.net/cms/fifa_world_cup_pass_trophy_img_82fa1afd43.png");

    public final String a;

    h2k0(String str) {
        this.a = str;
    }

    @Override // defpackage.su6
    public final String getUrl() {
        return this.a;
    }
}
