package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh1 f150131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc2 f150132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gh1 f150133c;

    public /* synthetic */ hh1(Context context, String str) {
        this(new fh1(context, str), new gc2(context), null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final gh1 a() {
        Class<?> cls;
        yy0 yy0Var;
        Object objA;
        fh1 fh1Var = this.f150131a;
        pm2 pm2Var = fh1Var.f149114b;
        String str = fh1Var.f149113a;
        pm2Var.getClass();
        try {
            cls = Class.forName(str);
        } catch (Throwable unused) {
            boolean z10 = ad1.f146762a;
            cls = null;
        }
        if (cls != null) {
            pm2 pm2Var2 = fh1Var.f149114b;
            Object[] objArr = {fh1Var.f149115c};
            pm2Var2.getClass();
            Object objA2 = pm2.a(cls, "getFusedLocationProviderClient", objArr);
            if (objA2 != null) {
                yy0Var = new yy0(objA2);
            } else {
                yy0Var = null;
            }
        } else {
            yy0Var = null;
        }
        if (yy0Var == null) {
            return null;
        }
        boolean zA = this.f150132b.a("android.permission.ACCESS_COARSE_LOCATION");
        boolean zA2 = this.f150132b.a("android.permission.ACCESS_FINE_LOCATION");
        if ((zA || zA2) && (objA = om2.a(yy0Var.f158523a, "getLastLocation", new Object[0])) != null) {
            return new gh1(objA);
        }
        return null;
    }

    public hh1(fh1 fh1Var, gc2 gc2Var, gh1 gh1Var) {
        this.f150131a = fh1Var;
        this.f150132b = gc2Var;
        this.f150133c = gh1Var;
    }
}
