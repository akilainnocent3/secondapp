package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wot<V> {
    public final xmt a;
    public final Throwable b;

    public wot(xmt xmtVar) {
        this.a = xmtVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wot)) {
            return false;
        }
        wot wotVar = (wot) obj;
        xmt xmtVar = this.a;
        if (xmtVar != null && xmtVar == wotVar.a) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || wotVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public wot(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
