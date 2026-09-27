package d6;

import android.view.Surface;
import androidx.annotation.Nullable;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public class k extends o5.c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f78229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f78230f;

    public k(Throwable th2, @Nullable o5.d0 d0Var, @Nullable Surface surface) {
        super(th2, d0Var);
        this.f78229e = System.identityHashCode(surface);
        this.f78230f = surface == null || surface.isValid();
    }
}
