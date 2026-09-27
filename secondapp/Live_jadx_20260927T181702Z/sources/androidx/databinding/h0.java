package androidx.databinding;

import androidx.annotation.Nullable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP})
public class h0<T> extends WeakReference<ViewDataBinding> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0<T> f9501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f9503c;

    public h0(ViewDataBinding viewDataBinding, int i10, a0<T> a0Var, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f9502b = i10;
        this.f9501a = a0Var;
    }

    @Nullable
    public ViewDataBinding a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            e();
        }
        return viewDataBinding;
    }

    public T b() {
        return this.f9503c;
    }

    public void c(androidx.lifecycle.b0 b0Var) {
        this.f9501a.b(b0Var);
    }

    public void d(T t10) {
        e();
        this.f9503c = t10;
        if (t10 != null) {
            this.f9501a.d(t10);
        }
    }

    public boolean e() {
        boolean z10;
        T t10 = this.f9503c;
        if (t10 != null) {
            this.f9501a.c(t10);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9503c = null;
        return z10;
    }
}
