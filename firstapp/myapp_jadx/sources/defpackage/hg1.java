package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class hg1 {
    public final List<String> a;

    public hg1() {
        List<String> list = Collections.EMPTY_LIST;
        if (list != null) {
            this.a = list;
        } else {
            bmy.a("Null entries");
            throw null;
        }
    }

    public final List<String> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hg1) {
            return this.a.equals(((hg1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ng1.a(new StringBuilder("ArrayBasedTraceState{entries="), this.a, "}");
    }
}
