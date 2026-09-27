package androidx.navigation;

import kotlin.jvm.internal.m0;
import t7.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@x
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final d.a f18030a = new d.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public r<?> f18031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public Object f18033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18034e;

    @oy.l
    public final d a() {
        return this.f18030a.a();
    }

    @oy.m
    public final Object b() {
        return this.f18033d;
    }

    public final boolean c() {
        return this.f18032c;
    }

    @oy.l
    public final r<?> d() {
        r<?> rVar = this.f18031b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    public final boolean e() {
        return this.f18034e;
    }

    public final void f(@oy.m Object obj) {
        this.f18033d = obj;
        this.f18030a.b(obj);
    }

    public final void g(boolean z10) {
        this.f18032c = z10;
        this.f18030a.c(z10);
    }

    public final void h(@oy.l r<?> value) {
        m0.p(value, "value");
        this.f18031b = value;
        this.f18030a.d(value);
    }

    public final void i(boolean z10) {
        this.f18034e = z10;
        this.f18030a.e(z10);
    }
}
