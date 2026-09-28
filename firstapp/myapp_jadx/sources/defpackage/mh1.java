package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mh1 extends ktb.e.d.a.b.AbstractC0787b {
    public final String a;
    public final String b;
    public final List<ktb.e.d.a.b.AbstractC0788d.AbstractC0789a> c;
    public final ktb.e.d.a.b.AbstractC0787b d;
    public final int e;

    public mh1(String str, String str2, List<ktb.e.d.a.b.AbstractC0788d.AbstractC0789a> list, ktb.e.d.a.b.AbstractC0787b abstractC0787b, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = abstractC0787b;
        this.e = i;
    }

    @Override // ktb.e.d.a.b.AbstractC0787b
    public final ktb.e.d.a.b.AbstractC0787b a() {
        return this.d;
    }

    @Override // ktb.e.d.a.b.AbstractC0787b
    public final List<ktb.e.d.a.b.AbstractC0788d.AbstractC0789a> b() {
        return this.c;
    }

    @Override // ktb.e.d.a.b.AbstractC0787b
    public final int c() {
        return this.e;
    }

    @Override // ktb.e.d.a.b.AbstractC0787b
    public final String d() {
        return this.b;
    }

    @Override // ktb.e.d.a.b.AbstractC0787b
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.e.d.a.b.AbstractC0787b)) {
            return false;
        }
        ktb.e.d.a.b.AbstractC0787b abstractC0787b = (ktb.e.d.a.b.AbstractC0787b) obj;
        if (!this.a.equals(abstractC0787b.e())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (abstractC0787b.d() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0787b.d())) {
            return false;
        }
        if (!this.c.equals(abstractC0787b.b())) {
            return false;
        }
        ktb.e.d.a.b.AbstractC0787b abstractC0787b2 = this.d;
        if (abstractC0787b2 == null) {
            if (abstractC0787b.a() != null) {
                return false;
            }
        } else if (!abstractC0787b2.equals(abstractC0787b.a())) {
            return false;
        }
        return this.e == abstractC0787b.c();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        ktb.e.d.a.b.AbstractC0787b abstractC0787b = this.d;
        return this.e ^ ((iHashCode2 ^ (abstractC0787b != null ? abstractC0787b.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return zk1.a(this.e, "}", sb);
    }
}
