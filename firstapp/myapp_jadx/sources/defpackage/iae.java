package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iae {
    public final gae a = new gae();
    public final gae b = new gae();
    public final gae c = new gae();

    public final void a(tsr tsrVar, i0p i0pVar) {
        int iOrdinal = i0pVar.ordinal();
        gae gaeVar = this.a;
        gae gaeVar2 = this.c;
        if (iOrdinal == 0) {
            gaeVar.a(tsrVar);
            gaeVar2.a(tsrVar);
            return;
        }
        gae gaeVar3 = this.b;
        if (iOrdinal == 1) {
            gaeVar3.a(tsrVar);
            gaeVar2.a(tsrVar);
            return;
        }
        if (iOrdinal == 2) {
            if (tsrVar.v != null) {
                gaeVar2.a(tsrVar);
                return;
            } else {
                gaeVar.a(tsrVar);
                return;
            }
        }
        if (iOrdinal != 3) {
            uhc.a();
        } else if (tsrVar.v != null) {
            gaeVar2.a(tsrVar);
        } else {
            gaeVar3.a(tsrVar);
        }
    }

    public final boolean b(tsr tsrVar) {
        return !(tsrVar.v == null) && (this.a.a.contains(tsrVar) || this.b.a.contains(tsrVar));
    }

    public final boolean c() {
        return !(this.a.a.isEmpty() && this.c.a.isEmpty() && this.b.a.isEmpty());
    }
}
