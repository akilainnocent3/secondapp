package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dd2 implements wa3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k83 f148178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f83 f148179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xo2 f148180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final be0 f148181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f148182e;

    public /* synthetic */ dd2(Context context, d4 d4Var, lu2 lu2Var, k83 k83Var) {
        f83 f83Var = new f83(context, d4Var, lu2Var);
        Object obj = xo2.f157949a;
        this(context, k83Var, f83Var, wo2.a(), new be0());
    }

    @Override // yads.wa3
    public final void a(String str, Map map) {
        String strA = this.f148181d.a(str, map);
        Object obj = dw2.f148384j;
        bd2 bd2Var = new bd2(this.f148182e, strA, new cd2(str, cw2.a().a(this.f148182e), this.f148179b, this.f148178a));
        xo2 xo2Var = this.f148180c;
        Context context = this.f148182e;
        synchronized (xo2Var) {
            r82.a(context).a(bd2Var);
        }
    }

    public dd2(Context context, k83 k83Var, f83 f83Var, xo2 xo2Var, be0 be0Var) {
        this.f148178a = k83Var;
        this.f148179b = f83Var;
        this.f148180c = xo2Var;
        this.f148181d = be0Var;
        this.f148182e = context.getApplicationContext();
    }
}
