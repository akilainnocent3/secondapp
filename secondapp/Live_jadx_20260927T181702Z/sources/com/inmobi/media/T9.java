package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class T9 {
    private final boolean GPID;

    public T9() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.GPID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T9) && this.GPID == ((T9) obj).GPID;
    }

    public final int hashCode() {
        return g8.a.a(this.GPID);
    }

    public final String toString() {
        return "IncludeIdParams(GPID=" + this.GPID + gi.j.f86771d;
    }

    public T9(boolean z10) {
        this.GPID = z10;
    }

    public /* synthetic */ T9(boolean z10, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
