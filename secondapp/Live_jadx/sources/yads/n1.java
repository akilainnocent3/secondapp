package yads;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n1 extends kotlin.jvm.internal.o0 implements ds.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f152820b = new n1();

    public n1() {
        super(1);
    }

    @Override // ds.l
    public final Object invoke(Object obj) {
        Activity activity = (Activity) ((WeakReference) obj).get();
        return Boolean.valueOf(activity == null || activity.isFinishing() || activity.isDestroyed());
    }
}
