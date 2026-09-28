package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class woe0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public woe0(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woe0)) {
            return false;
        }
        woe0 woe0Var = (woe0) obj;
        return this.a.equals(woe0Var.a) && this.b.equals(woe0Var.b) && this.c.equals(woe0Var.c) && this.d.equals(woe0Var.d) && this.e.equals(woe0Var.e) && this.f == woe0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SymbolConfigurationUiModel(undiscoveredFrameImageUrl=");
        sb.append(this.a);
        sb.append(", undiscoveredImageUrl=");
        sb.append(this.b);
        sb.append(", symbolFrameImageUrl=");
        sb.append(this.c);
        sb.append(", symbolImageUrl=");
        sb.append(this.d);
        sb.append(", multiplier=");
        sb.append(this.e);
        sb.append(", hasBeenFound=");
        return ruw.a(sb, this.f, ')');
    }
}
