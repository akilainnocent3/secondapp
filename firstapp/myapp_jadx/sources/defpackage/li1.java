package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class li1 extends s6l {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public static final class a extends s6l.a {
        public String a;
        public String b;
        public String c;
        public String d;
    }

    public li1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.s6l
    public final String a() {
        return this.d;
    }

    @Override // defpackage.s6l
    public final String b() {
        return this.b;
    }

    @Override // defpackage.s6l
    public final String c() {
        return this.c;
    }

    @Override // defpackage.s6l
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s6l)) {
            return false;
        }
        s6l s6lVar = (s6l) obj;
        return this.a.equals(s6lVar.d()) && this.b.equals(s6lVar.b()) && this.c.equals(s6lVar.c()) && this.d.equals(s6lVar.a());
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return uf80.a(sb, this.d, "}");
    }
}
