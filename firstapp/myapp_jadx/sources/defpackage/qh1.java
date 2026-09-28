package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class qh1 extends ktb.e.d.a.c {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public static final class a extends ktb.e.d.a.c.AbstractC0791a {
        public String a;
        public int b;
        public int c;
        public boolean d;
        public byte e;

        public final qh1 a() {
            String str;
            if (this.e == 7 && (str = this.a) != null) {
                return new qh1(this.b, this.c, str, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" processName");
            }
            if ((this.e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            ib5.a(ltb.a(sb, "Missing required properties:"));
            return null;
        }
    }

    public qh1(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // ktb.e.d.a.c
    public final int a() {
        return this.c;
    }

    @Override // ktb.e.d.a.c
    public final int b() {
        return this.b;
    }

    @Override // ktb.e.d.a.c
    public final String c() {
        return this.a;
    }

    @Override // ktb.e.d.a.c
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.e.d.a.c)) {
            return false;
        }
        ktb.e.d.a.c cVar = (ktb.e.d.a.c) obj;
        return this.a.equals(cVar.c()) && this.b == cVar.b() && this.c == cVar.a() && this.d == cVar.d();
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", defaultProcess=");
        return mq0.a(sb, this.d, "}");
    }
}
