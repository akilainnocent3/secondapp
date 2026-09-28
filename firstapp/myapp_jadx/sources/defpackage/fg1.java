package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class fg1 extends tm {
    public final List<Double> b;
    public final List<e21<?>> c;

    public static final class a extends tm.a {
        public List<Double> a;
        public List<e21<?>> b;
    }

    public fg1(List<Double> list, List<e21<?>> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.tm
    public final List<e21<?>> a() {
        return this.c;
    }

    @Override // defpackage.tm
    public final List<Double> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tm)) {
            return false;
        }
        tm tmVar = (tm) obj;
        List<Double> list = this.b;
        if (list == null) {
            if (tmVar.b() != null) {
                return false;
            }
        } else if (!list.equals(tmVar.b())) {
            return false;
        }
        List<e21<?>> list2 = this.c;
        if (list2 == null) {
            return tmVar.a() == null;
        }
        return list2.equals(tmVar.a());
    }

    public final int hashCode() {
        List<Double> list = this.b;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<e21<?>> list2 = this.c;
        return iHashCode ^ (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Advice{explicitBucketBoundaries=");
        sb.append(this.b);
        sb.append(", attributes=");
        return ng1.a(sb, this.c, "}");
    }
}
