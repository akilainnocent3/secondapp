package androidx.leanback.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13090a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f13091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f13092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f13093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f13094e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends w0.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f13095g;

        public a(int i10) {
            this.f13095g = i10;
        }

        public int m(View view) {
            return x0.a(view, this, this.f13095g);
        }
    }

    public v0() {
        a aVar = new a(1);
        this.f13091b = aVar;
        a aVar2 = new a(0);
        this.f13092c = aVar2;
        this.f13093d = aVar2;
        this.f13094e = aVar;
    }

    public final int a() {
        return this.f13090a;
    }

    public final a b() {
        return this.f13093d;
    }

    public final a c() {
        return this.f13094e;
    }

    public final void d(int i10) {
        this.f13090a = i10;
        if (i10 == 0) {
            this.f13093d = this.f13092c;
            this.f13094e = this.f13091b;
        } else {
            this.f13093d = this.f13091b;
            this.f13094e = this.f13092c;
        }
    }
}
