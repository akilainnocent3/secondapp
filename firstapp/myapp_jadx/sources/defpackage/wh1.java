package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wh1 extends ktb.e.AbstractC0794e {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public static final class a extends ktb.e.AbstractC0794e.a {
        public int a;
        public String b;
        public String c;
        public boolean d;
        public byte e;

        public final wh1 a() {
            String str;
            String str2;
            if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
                return new wh1(this.a, str, str2, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.b == null) {
                sb.append(" version");
            }
            if (this.c == null) {
                sb.append(" buildVersion");
            }
            if ((this.e & 2) == 0) {
                sb.append(" jailbroken");
            }
            ib5.a(ltb.a(sb, "Missing required properties:"));
            return null;
        }
    }

    public wh1(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // ktb.e.AbstractC0794e
    public final String a() {
        return this.c;
    }

    @Override // ktb.e.AbstractC0794e
    public final int b() {
        return this.a;
    }

    @Override // ktb.e.AbstractC0794e
    public final String c() {
        return this.b;
    }

    @Override // ktb.e.AbstractC0794e
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.e.AbstractC0794e)) {
            return false;
        }
        ktb.e.AbstractC0794e abstractC0794e = (ktb.e.AbstractC0794e) obj;
        return this.a == abstractC0794e.b() && this.b.equals(abstractC0794e.c()) && this.c.equals(abstractC0794e.a()) && this.d == abstractC0794e.d();
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return mq0.a(sb, this.d, "}");
    }
}
