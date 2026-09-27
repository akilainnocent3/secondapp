package yads;

import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n12 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f152824b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile n12 f152825c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f152826a;

    public n12(Map map) {
        this.f152826a = map;
    }

    public final void a(View view, p32 p32Var) {
        synchronized (f152824b) {
            this.f152826a.put(view, p32Var);
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }
}
