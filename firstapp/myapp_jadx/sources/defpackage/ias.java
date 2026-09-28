package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ias {
    public final s9s a;
    public final s9s.b b;
    public final xre c;
    public final has d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [has, hbs] */
    public ias(s9s s9sVar, s9s.b bVar, xre xreVar, final c9p c9pVar) {
        s9sVar.getClass();
        xreVar.getClass();
        this.a = s9sVar;
        this.b = bVar;
        this.c = xreVar;
        ?? r3 = new cbs() { // from class: has
            @Override // defpackage.cbs
            public final void F0(ibs ibsVar, s9s.a aVar) {
                s9s.b bVarB = ibsVar.getLifecycle().b();
                s9s.b bVar2 = s9s.b.a;
                ias iasVar = this.a;
                if (bVarB == bVar2) {
                    c9pVar.cancel((CancellationException) null);
                    iasVar.a();
                    return;
                }
                int iCompareTo = ibsVar.getLifecycle().b().compareTo(iasVar.b);
                xre xreVar2 = iasVar.c;
                if (iCompareTo < 0) {
                    xreVar2.a = true;
                    return;
                }
                if (xreVar2.a) {
                    if (xreVar2.b) {
                        ib5.a("Cannot resume a finished dispatcher");
                    } else {
                        xreVar2.a = false;
                        xreVar2.a();
                    }
                }
            }
        };
        this.d = r3;
        if (s9sVar.b() != s9s.b.a) {
            s9sVar.a(r3);
        } else {
            c9pVar.cancel((CancellationException) null);
            a();
        }
    }

    public final void a() {
        this.a.d(this.d);
        xre xreVar = this.c;
        xreVar.b = true;
        xreVar.a();
    }
}
