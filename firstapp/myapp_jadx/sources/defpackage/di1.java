package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class di1 extends h2g {
    public final int b;
    public final List<Long> c;

    public di1(int i) {
        List<Long> list = Collections.EMPTY_LIST;
        this.b = i;
        if (list != null) {
            this.c = list;
        } else {
            bmy.a("Null bucketCounts");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h2g)) {
            return false;
        }
        di1 di1Var = (di1) ((h2g) obj);
        return this.b == di1Var.b && this.c.equals(di1Var.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ ((this.b ^ 1000003) * (-721379959))) * 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyExponentialHistogramBuckets{scale=");
        sb.append(this.b);
        sb.append(", offset=0, bucketCounts=");
        return ng1.a(sb, this.c, ", totalCount=0}");
    }
}
