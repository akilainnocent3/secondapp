package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tsw {
    public hxs a;
    public hxs b;
    public hxs c;

    public tsw() {
        hxs.c cVar = hxs.c.c;
        this.a = cVar;
        this.b = cVar;
        this.c = cVar;
    }

    public final hxs a(kxs kxsVar) {
        kxsVar.getClass();
        int iOrdinal = kxsVar.ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        uhc.a();
        return null;
    }

    public final void b(jxs jxsVar) {
        jxsVar.getClass();
        this.a = jxsVar.a;
        this.c = jxsVar.c;
        this.b = jxsVar.b;
    }

    public final void c(kxs kxsVar, hxs hxsVar) {
        kxsVar.getClass();
        hxsVar.getClass();
        int iOrdinal = kxsVar.ordinal();
        if (iOrdinal == 0) {
            this.a = hxsVar;
            return;
        }
        if (iOrdinal == 1) {
            this.b = hxsVar;
        } else if (iOrdinal == 2) {
            this.c = hxsVar;
        } else {
            uhc.a();
        }
    }

    public final jxs d() {
        return new jxs(this.a, this.b, this.c);
    }
}
