package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class a31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm0 f146628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5 f146629b;

    public a31(jm0 jm0Var, a5 a5Var) {
        this.f146628a = jm0Var;
        this.f146629b = a5Var;
    }

    public final void a(Context context, z21 z21Var) {
        String strA;
        tg tgVar = z21Var.f158568a;
        String str = z21Var.f158569b;
        e31 e31Var = z21Var.f158570c;
        a5 a5Var = this.f146629b;
        a5Var.getClass();
        int iOrdinal = e31Var.ordinal();
        if (iOrdinal == 0) {
            strA = a5Var.a(context);
        } else {
            if (iOrdinal != 1) {
                throw new dr.o0();
            }
            strA = tgVar.f155882a;
            if (strA == null) {
                strA = a5Var.a(context);
            }
        }
        jm0 jm0Var = this.f146628a;
        jm0Var.f151157e = strA;
        jm0Var.f151153a = tgVar.f155883b;
        String str2 = tgVar.f155884c;
        synchronized (jm0.f151152h) {
            if (str2 != null) {
                try {
                    if (str2.length() != 0) {
                        jm0Var.f151159g = str2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dr.w2 w2Var = dr.w2.f79517a;
        }
        this.f146628a.f151156d = str;
    }
}
