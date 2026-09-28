package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public final class ird0 {
    public static volatile a a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lird0$a;", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a {
        nzm e();

        hrd0 f();
    }

    public static final nzm a() {
        nzm nzmVarE;
        a aVarC = c();
        return (aVarC == null || (nzmVarE = aVarC.e()) == null) ? q9h.a : nzmVarE;
    }

    public static final hrd0 b() {
        hrd0 hrd0VarF;
        a aVarC = c();
        return (aVarC == null || (hrd0VarF = aVarC.f()) == null) ? r9h.a : hrd0VarF;
    }

    public static a c() {
        a aVar = a;
        if (aVar != null) {
            return aVar;
        }
        try {
            hp0 hp0Var = hp0.A;
            hp0Var.getClass();
            Object objA = qag.a(hp0Var, a.class);
            a = (a) objA;
            return (a) objA;
        } catch (IllegalStateException | NullPointerException unused) {
            return null;
        }
    }
}
