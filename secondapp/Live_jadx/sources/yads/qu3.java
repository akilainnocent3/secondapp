package yads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qu3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x92 f154610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f154611b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f154612c = new ArrayList();

    public qu3(Context context) {
        this.f154610a = x92.f157741g.a(context);
    }

    public final void a(ld3 ld3Var) {
        synchronized (this.f154611b) {
            this.f154612c.add(ld3Var);
            this.f154610a.b(ld3Var);
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }
}
