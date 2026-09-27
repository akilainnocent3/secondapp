package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td f156906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td f156907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f156909d;

    public vd(td tdVar, td tdVar2, boolean z10, String str) {
        this.f156906a = tdVar;
        this.f156907b = tdVar2;
        this.f156908c = z10;
        this.f156909d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return kotlin.jvm.internal.m0.g(this.f156906a, vdVar.f156906a) && kotlin.jvm.internal.m0.g(this.f156907b, vdVar.f156907b) && this.f156908c == vdVar.f156908c && kotlin.jvm.internal.m0.g(this.f156909d, vdVar.f156909d);
    }

    public final int hashCode() {
        td tdVar = this.f156906a;
        int iHashCode = (tdVar == null ? 0 : tdVar.hashCode()) * 31;
        td tdVar2 = this.f156907b;
        int iA = (g8.a.a(this.f156908c) + ((iHashCode + (tdVar2 == null ? 0 : tdVar2.hashCode())) * 31)) * 31;
        String str = this.f156909d;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvertisingInfoHolder(gmsAdvertisingInfo=" + this.f156906a + ", hmsAdvertisingInfo=" + this.f156907b + ", gmsAdvertisingReset=" + this.f156908c + ", appSetId=" + this.f156909d + gi.j.f86771d;
    }
}
