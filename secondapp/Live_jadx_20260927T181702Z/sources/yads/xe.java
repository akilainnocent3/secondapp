package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ve f157802a;

    public static final dg a(Context context) {
        ve veVar;
        ve veVar2 = f157802a;
        if (veVar2 != null) {
            return veVar2;
        }
        synchronized (ve.f156924c) {
            Context contextA = uz.a(context);
            veVar = f157802a;
            if (veVar == null) {
                te teVar = new te(contextA);
                Object obj = og1.f153484d;
                veVar = new ve(teVar, ng1.a().a());
                f157802a = veVar;
            }
        }
        return veVar;
    }
}
