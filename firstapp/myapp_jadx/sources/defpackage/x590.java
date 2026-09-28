package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 x590[], still in use, count: 1, list:
  (r0v1 x590[]) from 0x00d5: CONSTRUCTOR (r0v1 x590[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:215) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class x590 {
    Home(1, R.drawable.ic_home_shortcut_widget, R.string.app_widget__shortcut_home, wae.HOME),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(2, R.drawable.ic_az_menu, R.string.app_widget__shortcut_az_menu, wae.v),
    /* JADX INFO: Fake field, exist only in values array */
    LoadCode(3, R.drawable.ic_load_code, R.string.app_widget__shortcut_load_code, wae.BET_SLIP),
    /* JADX INFO: Fake field, exist only in values array */
    SportyTv(4, R.drawable.ic_sporty_tv_shortcut, R.string.app_widget__shortcut_sporty_tv, wae.TV_STREAM),
    /* JADX INFO: Fake field, exist only in values array */
    Live(5, R.drawable.ic_live, R.string.app_widget__shortcut_live, wae.LIVE_HOST),
    Virtuals(6, R.drawable.ic_virtuals, R.string.app_widget__shortcut_virtuals, wae.VIRTUALS_LOBBY),
    /* JADX INFO: Fake field, exist only in values array */
    News(7, R.drawable.ic_sportynews, R.string.app_widget__shortcut_sporty_news, wae.NEWS),
    Jackpot(8, R.drawable.ic_jackpot, R.string.app_widget__shortcut_jackpot, wae.JACKPOT),
    /* JADX INFO: Fake field, exist only in values array */
    OpenBets(9, R.drawable.ic_open_bets, R.string.app_widget__shortcut_open_bets, wae.OPEN_BETS_IN_MAIN_TAB),
    /* JADX INFO: Fake field, exist only in values array */
    Games(10, R.drawable.ic_games, R.string.app_widget__shortcut_games, wae.GAMES_LOBBY),
    /* JADX INFO: Fake field, exist only in values array */
    MyFavorites(11, R.drawable.ic_my_favorites, R.string.app_widget__shortcut_my_favorites, wae.MY_FAVORITE),
    /* JADX INFO: Fake field, exist only in values array */
    Betslip(12, R.drawable.ic_betslip_shortcut_widget, R.string.app_widget__shortcut_betslip, wae.ME_SPORTS_BET_HISTORY_IN_MAIN_TAB);

    public static final /* synthetic */ uag w;
    public final int a;
    public final int b;
    public final int c;
    public final wae d;

    public x590(int i, int i2, int i3, wae waeVar) {
        super(str, i);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = waeVar;
    }

    public static x590 valueOf(String str) {
        return (x590) Enum.valueOf(x590.class, str);
    }

    public static x590[] values() {
        return (x590[]) v.clone();
    }

    static {
        w = new uag(x590VarArr);
    }
}
