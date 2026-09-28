package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lg1 extends nd2 {
    public final ArrayList a;

    public lg1(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.nd2
    public final List<vft> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nd2) {
            return this.a.equals(((nd2) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
