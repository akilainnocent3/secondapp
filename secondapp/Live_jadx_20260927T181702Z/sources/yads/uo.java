package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f156523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f156524d;

    public uo(int i10, int i11, String str, String str2) {
        this.f156521a = str;
        this.f156522b = str2;
        this.f156523c = i10;
        this.f156524d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return this.f156523c == uoVar.f156523c && this.f156524d == uoVar.f156524d && l92.a(this.f156521a, uoVar.f156521a) && l92.a(this.f156522b, uoVar.f156522b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f156521a, this.f156522b, Integer.valueOf(this.f156523c), Integer.valueOf(this.f156524d)});
    }
}
