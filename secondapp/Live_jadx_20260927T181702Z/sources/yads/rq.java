package yads;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f155103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f155104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qq f155105c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rq(lu2 lu2Var) {
        iu3 iu3Var = (iu3) lu2Var;
        this(lu2Var, iu3Var.a(), new qq(iu3Var.c()));
    }

    public final boolean a(Context context, v9 v9Var, z9 z9Var, d4 d4Var, String str) {
        Object obj = z1.f158558b;
        z1 z1VarA = y1.a();
        long jA = y21.a();
        Intent intentA = this.f155105c.a(context, str, jA);
        z1VarA.a(jA, new x1(v9Var, d4Var, z9Var, this.f155103a, null, 0, null, 112));
        try {
            context.startActivity(intentA);
            return true;
        } catch (Exception e10) {
            z1VarA.a(jA);
            e10.toString();
            boolean z10 = ad1.f146762a;
            this.f155104b.reportError("Failed to show Browser", e10);
            return false;
        }
    }

    public rq(lu2 lu2Var, io2 io2Var, qq qqVar) {
        this.f155103a = lu2Var;
        this.f155104b = io2Var;
        this.f155105c = qqVar;
    }
}
