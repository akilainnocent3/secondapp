package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ro0 {
    public static so0 a(Context context, boolean z10) {
        Object objInvoke;
        e71 e71Var = so0.f155507c;
        qo0 qo0Var = new qo0(context, z10);
        Object obj = e71Var.f148543a;
        if (obj == null) {
            synchronized (e71Var.f148544b) {
                objInvoke = e71Var.f148543a;
                if (objInvoke == null) {
                    objInvoke = qo0Var.invoke();
                    e71Var.f148543a = objInvoke;
                }
            }
            obj = objInvoke;
        }
        return (so0) obj;
    }
}
