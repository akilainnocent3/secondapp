package defpackage;

import com.sportybet.android.router.Sender;

/* JADX INFO: loaded from: classes6.dex */
public final class djr {

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Sender.values().length];
            try {
                iArr[Sender.HOMEPAGE_SPORTY_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Sender.APP_LINK_FROM_GAME_LOBBY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Sender.HOMEPAGE_SPORTY_STORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Sender.LUCKY_NUMBER_WINNING_POPUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Sender.HOMEPAGE_LUCKY_NUMBER_HIGH_ODDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Sender.HOMEPAGE_FEATURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public static final void a(rdd0 rdd0Var, cjr cjrVar) {
        rdd0Var.getClass();
        cjrVar.getClass();
        rdd0Var.a(cjrVar, k00.d);
    }
}
