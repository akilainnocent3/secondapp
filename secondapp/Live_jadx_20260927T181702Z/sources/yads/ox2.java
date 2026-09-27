package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ox2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dz f153641a;

    public /* synthetic */ ox2() {
        this(new dz());
    }

    public static boolean a(Context context) {
        Object obj = dw2.f148384j;
        nt2 nt2VarA = cw2.a().a(context);
        return nt2VarA == null || nt2VarA.f153166j;
    }

    public final boolean b(Context context) {
        Object obj = dw2.f148384j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || !nt2VarA.f153164i || a(context)) {
            return true;
        }
        this.f153641a.getClass();
        return !kotlin.jvm.internal.m0.g(cw2.a().b(), nt2VarA.M) && kotlin.jvm.internal.m0.g(cw2.a().b(), Boolean.TRUE);
    }

    public ox2(dz dzVar) {
        this.f153641a = dzVar;
    }
}
