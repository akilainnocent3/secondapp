package f5;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f83139d = new b().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f83140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83142c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f83143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f83144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f83145c;

        public b() {
        }

        public t d() {
            if (this.f83143a || !(this.f83144b || this.f83145c)) {
                return new t(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        @qj.a
        public b e(boolean z10) {
            this.f83143a = z10;
            return this;
        }

        @qj.a
        public b f(boolean z10) {
            this.f83144b = z10;
            return this;
        }

        @qj.a
        public b g(boolean z10) {
            this.f83145c = z10;
            return this;
        }

        public b(t tVar) {
            this.f83143a = tVar.f83140a;
            this.f83144b = tVar.f83141b;
            this.f83145c = tVar.f83142c;
        }
    }

    public b a() {
        return new b(this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f83140a == tVar.f83140a && this.f83141b == tVar.f83141b && this.f83142c == tVar.f83142c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f83140a ? 1 : 0) << 2) + ((this.f83141b ? 1 : 0) << 1) + (this.f83142c ? 1 : 0);
    }

    public t(b bVar) {
        this.f83140a = bVar.f83143a;
        this.f83141b = bVar.f83144b;
        this.f83142c = bVar.f83145c;
    }
}
