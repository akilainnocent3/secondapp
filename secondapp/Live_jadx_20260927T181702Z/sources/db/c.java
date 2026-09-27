package db;

import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public enum c {
    JSON(".json"),
    ZIP(s7.d.f129681l),
    GZIP(".gz");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78683b;

    c(String str) {
        this.f78683b = str;
    }

    public String g() {
        return ".temp" + this.f78683b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f78683b;
    }
}
