package androidx.navigation;

import android.os.Bundle;
import k.y0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final r<Object> f18020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.m
    public final Object f18024e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        public r<Object> f18025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f18026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.m
        public Object f18027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18029e;

        @oy.l
        public final d a() {
            r<Object> rVarC = this.f18025a;
            if (rVarC == null) {
                rVarC = r.f18320c.c(this.f18027c);
                m0.n(rVarC, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new d(rVarC, this.f18026b, this.f18027c, this.f18028d, this.f18029e);
        }

        @oy.l
        public final a b(@oy.m Object obj) {
            this.f18027c = obj;
            this.f18028d = true;
            return this;
        }

        @oy.l
        public final a c(boolean z10) {
            this.f18026b = z10;
            return this;
        }

        @oy.l
        public final <T> a d(@oy.l r<T> type) {
            m0.p(type, "type");
            this.f18025a = type;
            return this;
        }

        @oy.l
        public final a e(boolean z10) {
            this.f18029e = z10;
            return this;
        }
    }

    public d(@oy.l r<Object> type, boolean z10, @oy.m Object obj, boolean z11, boolean z12) {
        m0.p(type, "type");
        if (!type.f() && z10) {
            throw new IllegalArgumentException((type.c() + " does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.c() + " has null value but is not nullable.").toString());
        }
        this.f18020a = type;
        this.f18021b = z10;
        this.f18024e = obj;
        this.f18022c = z11 || z12;
        this.f18023d = z12;
    }

    @oy.m
    public final Object a() {
        return this.f18024e;
    }

    @oy.l
    public final r<Object> b() {
        return this.f18020a;
    }

    public final boolean c() {
        return this.f18022c;
    }

    public final boolean d() {
        return this.f18023d;
    }

    public final boolean e() {
        return this.f18021b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.g(d.class, obj.getClass())) {
            d dVar = (d) obj;
            if (this.f18021b != dVar.f18021b || this.f18022c != dVar.f18022c || !m0.g(this.f18020a, dVar.f18020a)) {
                return false;
            }
            Object obj2 = this.f18024e;
            if (obj2 != null) {
                return m0.g(obj2, dVar.f18024e);
            }
            if (dVar.f18024e == null) {
                return true;
            }
        }
        return false;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public final void f(@oy.l String name, @oy.l Bundle bundle) {
        Object obj;
        m0.p(name, "name");
        m0.p(bundle, "bundle");
        if (!this.f18022c || (obj = this.f18024e) == null) {
            return;
        }
        this.f18020a.k(bundle, name, obj);
    }

    @y0({y0.a.LIBRARY_GROUP})
    public final boolean g(@oy.l String name, @oy.l Bundle bundle) {
        m0.p(name, "name");
        m0.p(bundle, "bundle");
        if (!this.f18021b && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.f18020a.b(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.f18020a.hashCode() * 31) + (this.f18021b ? 1 : 0)) * 31) + (this.f18022c ? 1 : 0)) * 31;
        Object obj = this.f18024e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @oy.l
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d.class.getSimpleName());
        sb2.append(" Type: " + this.f18020a);
        sb2.append(" Nullable: " + this.f18021b);
        if (this.f18022c) {
            sb2.append(" DefaultValue: " + this.f18024e);
        }
        String string = sb2.toString();
        m0.o(string, "sb.toString()");
        return string;
    }
}
