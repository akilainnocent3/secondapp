package de;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f78954a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f78955a;

        @Override // de.r.a
        public r a() {
            return new h(this.f78955a);
        }

        @Override // de.r.a
        public r.a b(@Nullable Integer num) {
            this.f78955a = num;
            return this;
        }
    }

    @Override // de.r
    @Nullable
    public Integer b() {
        return this.f78954a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f78954a;
        Integer numB = ((r) obj).b();
        if (num == null) {
            return numB == null;
        }
        return num.equals(numB);
    }

    public int hashCode() {
        Integer num = this.f78954a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f78954a + "}";
    }

    public h(@Nullable Integer num) {
        this.f78954a = num;
    }
}
