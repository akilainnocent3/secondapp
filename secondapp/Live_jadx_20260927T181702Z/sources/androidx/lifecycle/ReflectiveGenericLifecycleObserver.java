package androidx.lifecycle;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f13242c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f13241b = obj;
        this.f13242c = c.f13302c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.x
    public void onStateChanged(@NonNull b0 b0Var, @NonNull r.a aVar) {
        this.f13242c.a(b0Var, aVar, this.f13241b);
    }
}
