package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class aid implements vzm {
    @Override // defpackage.vzm
    public final String a(jgg0 jgg0Var, String str, long j, String str2, String str3) {
        str.getClass();
        str2.getClass();
        int iOrdinal = jgg0Var.ordinal();
        if (iOrdinal == 0) {
            return o3g0.a("rank_data", str, str2, str3, j);
        }
        if (iOrdinal == 1) {
            return o3g0.a("leaderboard_data", str, str2, str3, j);
        }
        if (iOrdinal == 2) {
            return o3g0.a("tournament_status", str, str2, str3, j);
        }
        if (iOrdinal == 3) {
            return o3g0.a("tournament_info", str, str2, str3, j);
        }
        uhc.a();
        return null;
    }
}
