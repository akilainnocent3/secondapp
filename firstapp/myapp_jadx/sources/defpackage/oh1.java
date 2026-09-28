package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class oh1 extends ktb.e.d.a.b.AbstractC0788d {
    public final String a;
    public final int b;
    public final List<ktb.e.d.a.b.AbstractC0788d.AbstractC0789a> c;

    public oh1(String str, int i, List<ktb.e.d.a.b.AbstractC0788d.AbstractC0789a> list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    @Override // ktb.e.d.a.b.AbstractC0788d
    public final List<ktb.e.d.a.b.AbstractC0788d.AbstractC0789a> a() {
        return this.c;
    }

    @Override // ktb.e.d.a.b.AbstractC0788d
    public final int b() {
        return this.b;
    }

    @Override // ktb.e.d.a.b.AbstractC0788d
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.e.d.a.b.AbstractC0788d)) {
            return false;
        }
        ktb.e.d.a.b.AbstractC0788d abstractC0788d = (ktb.e.d.a.b.AbstractC0788d) obj;
        return this.a.equals(abstractC0788d.c()) && this.b == abstractC0788d.b() && this.c.equals(abstractC0788d.a());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.a);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", frames=");
        return ng1.a(sb, this.c, "}");
    }
}
