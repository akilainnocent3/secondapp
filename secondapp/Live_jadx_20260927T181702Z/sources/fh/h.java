package fh;

import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class h extends nf.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f84372e;

    public h(Throwable th2, @Nullable nf.n nVar, @Nullable Surface surface) {
        super(th2, nVar);
        this.f84371d = System.identityHashCode(surface);
        this.f84372e = surface == null || surface.isValid();
    }
}
