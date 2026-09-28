package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kb50 {
    public final Set<ca50> a = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet b = new HashSet();
    public boolean c;

    public final boolean a(ca50 ca50Var) {
        boolean z = true;
        if (ca50Var == null) {
            return true;
        }
        boolean zRemove = this.a.remove(ca50Var);
        if (!this.b.remove(ca50Var) && !zRemove) {
            z = false;
        }
        if (z) {
            ca50Var.clear();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.a.size());
        sb.append(", isPaused=");
        return mq0.a(sb, this.c, "}");
    }
}
