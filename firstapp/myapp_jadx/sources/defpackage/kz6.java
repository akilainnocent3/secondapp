package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public enum kz6 implements su6 {
    BiggestNetProfitBg("https://s.sporty.net/cms/challenge_biggest_net_profit_bg_3x_d21b05d4a7.png"),
    BiggestSingleWinBg("https://s.sporty.net/cms/challenge_biggest_single_win_bg_3x_2253f741f7.png"),
    CardBg("https://s.sporty.net/cms/challenge_card_default_bg_50c8932bf6.png"),
    CardExpandedBg("https://s.sporty.net/cms/challenage_Card_Bg_3x_df8eb29a85.png"),
    LongestOddsWinBg("https://s.sporty.net/cms/challenge_longest_odds_win_bg_3x_d394aefb6b.png"),
    New("https://s.sporty.net/cms/challenge_new_img_3x_56e2af334d.png"),
    Win("https://s.sporty.net/cms/challenge_won_img_3x_5ec8e037ee.png");

    public final String a;

    kz6(String str) {
        this.a = str;
    }

    @Override // defpackage.su6
    public final String getUrl() {
        return this.a;
    }
}
