package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55236b;

    public Nj(String tableName, String tableSchema) {
        kotlin.jvm.internal.m0.p(tableName, "tableName");
        kotlin.jvm.internal.m0.p(tableSchema, "tableSchema");
        this.f55235a = tableName;
        this.f55236b = tableSchema;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nj)) {
            return false;
        }
        Nj nj2 = (Nj) obj;
        return kotlin.jvm.internal.m0.g(this.f55235a, nj2.f55235a) && kotlin.jvm.internal.m0.g(this.f55236b, nj2.f55236b);
    }

    public final int hashCode() {
        return this.f55236b.hashCode() + (this.f55235a.hashCode() * 31);
    }

    public final String toString() {
        return "TableInfo(tableName=" + this.f55235a + ", tableSchema=" + this.f55236b + gi.j.f86771d;
    }
}
