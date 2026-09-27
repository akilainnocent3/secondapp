package nc;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c implements g<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f116423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f116424c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f116425c = 300;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f116426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f116427b;

        public a() {
            this(300);
        }

        public c a() {
            return new c(this.f116426a, this.f116427b);
        }

        public a b(boolean z10) {
            this.f116427b = z10;
            return this;
        }

        public a(int i10) {
            this.f116426a = i10;
        }
    }

    public c(int i10, boolean z10) {
        this.f116422a = i10;
        this.f116423b = z10;
    }

    @Override // nc.g
    public f<Drawable> a(tb.a aVar, boolean z10) {
        return aVar == tb.a.MEMORY_CACHE ? e.b() : b();
    }

    public final f<Drawable> b() {
        if (this.f116424c == null) {
            this.f116424c = new d(this.f116422a, this.f116423b);
        }
        return this.f116424c;
    }
}
