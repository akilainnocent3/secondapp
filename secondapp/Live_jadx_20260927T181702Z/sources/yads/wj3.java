package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mh3 f157400a;

    public wj3(Context context) {
        this.f157400a = new mh3(context);
    }

    public final void a(vj3 vj3Var, String str) {
        List list = (List) vj3Var.a().get(str);
        if (list != null) {
            this.f157400a.a(list, fr.n1.z());
        }
    }
}
