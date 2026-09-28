package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class q9s {

    public interface a<T> {
        String a(Context context);
    }

    public static kn8<?> a(String str, String str2) {
        hj1 hj1Var = new hj1(str, str2);
        kn8.a aVarB = kn8.b(o9s.class);
        aVarB.e = 1;
        aVarB.f = new ki3(hj1Var);
        return aVarB.b();
    }

    public static kn8<?> b(final String str, final a<Context> aVar) {
        kn8.a aVarB = kn8.b(o9s.class);
        aVarB.e = 1;
        aVarB.a(rmd.c(Context.class));
        aVarB.f = new do8() { // from class: p9s
            @Override // defpackage.do8
            public final Object a(hi50 hi50Var) {
                return new hj1(str, aVar.a((Context) hi50Var.a(Context.class)));
            }
        };
        return aVarB.b();
    }
}
