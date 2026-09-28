package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xoc {
    public final woc a;
    public final woc b;
    public final double c;

    public xoc(woc wocVar, woc wocVar2, double d) {
        wocVar.getClass();
        wocVar2.getClass();
        this.a = wocVar;
        this.b = wocVar2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoc)) {
            return false;
        }
        xoc xocVar = (xoc) obj;
        return this.a == xocVar.a && this.b == xocVar.b && Double.compare(this.c, xocVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionStatus(performance=");
        sb.append(this.a);
        sb.append(", crashlytics=");
        sb.append(this.b);
        sb.append(", sessionSamplingRate=");
        return org0.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xoc() {
        woc wocVar = woc.COLLECTION_SDK_NOT_INSTALLED;
        this(wocVar, wocVar, 1.0d);
    }
}
