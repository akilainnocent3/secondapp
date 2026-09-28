package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ch1 extends ktb.d {
    public final List<ktb.d.a> a;
    public final String b;

    public ch1(List<ktb.d.a> list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // ktb.d
    public final List<ktb.d.a> a() {
        return this.a;
    }

    @Override // ktb.d
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.d)) {
            return false;
        }
        ktb.d dVar = (ktb.d) obj;
        if (!this.a.equals(dVar.a())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            return dVar.b() == null;
        }
        return str.equals(dVar.b());
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return uf80.a(sb, this.b, "}");
    }
}
