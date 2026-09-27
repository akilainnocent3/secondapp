package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f151893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f151894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f151895d;

    public l73(int i10, int i11, int i12, byte[] bArr) {
        this.f151892a = i10;
        this.f151893b = bArr;
        this.f151894c = i11;
        this.f151895d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l73.class == obj.getClass()) {
            l73 l73Var = (l73) obj;
            if (this.f151892a == l73Var.f151892a && this.f151894c == l73Var.f151894c && this.f151895d == l73Var.f151895d && Arrays.equals(this.f151893b, l73Var.f151893b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f151893b) + (this.f151892a * 31)) * 31) + this.f151894c) * 31) + this.f151895d;
    }
}
