package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.v5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4057v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f57889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57890b;

    public C4057v5(String str, boolean z10) {
        this.f57889a = z10;
        this.f57890b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4057v5)) {
            return false;
        }
        C4057v5 c4057v5 = (C4057v5) obj;
        return this.f57889a == c4057v5.f57889a && kotlin.jvm.internal.m0.g(this.f57890b, c4057v5.f57890b);
    }

    public final int hashCode() {
        int iA = g8.a.a(this.f57889a) * 31;
        String str = this.f57890b;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PlayStoreSnapshot(disabled=" + this.f57889a + ", version=" + this.f57890b + gi.j.f86771d;
    }
}
