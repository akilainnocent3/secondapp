package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ah1 extends ktb.a.AbstractC0783a {
    public final String a;
    public final String b;
    public final String c;

    public ah1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // ktb.a.AbstractC0783a
    public final String a() {
        return this.a;
    }

    @Override // ktb.a.AbstractC0783a
    public final String b() {
        return this.c;
    }

    @Override // ktb.a.AbstractC0783a
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.a.AbstractC0783a)) {
            return false;
        }
        ktb.a.AbstractC0783a abstractC0783a = (ktb.a.AbstractC0783a) obj;
        return this.a.equals(abstractC0783a.a()) && this.b.equals(abstractC0783a.c()) && this.c.equals(abstractC0783a.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return uf80.a(sb, this.c, "}");
    }
}
