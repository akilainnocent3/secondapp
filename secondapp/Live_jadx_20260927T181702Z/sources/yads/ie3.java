package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ie3 {
    public static String a(long j10, lf3 lf3Var, ud3 ud3Var) {
        int iA = lf3Var.a();
        String strValueOf = ud3Var.f156377l;
        if (strValueOf == null) {
            strValueOf = String.valueOf(y21.f158106a.getAndIncrement());
        }
        return "ad_break_#" + j10 + "|position_" + iA + "|video_ad_#" + strValueOf;
    }
}
