package defpackage;

import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.e;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pxg implements Runnable {
    public final /* synthetic */ d a;
    public final /* synthetic */ e.C0064e b;

    public /* synthetic */ pxg(d dVar, e.C0064e c0064e) {
        this.a = dVar;
        this.b = c0064e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.a;
        e.C0064e c0064e = this.b;
        int i = dVar.I - c0064e.c;
        dVar.I = i;
        boolean z = true;
        if (c0064e.d) {
            dVar.J = c0064e.e;
            dVar.K = true;
        }
        if (i == 0) {
            qxf0 qxf0Var = c0064e.b.a;
            if (!dVar.l0.a.p() && qxf0Var.p()) {
                dVar.m0 = -1;
                dVar.n0 = 0L;
            }
            if (!qxf0Var.p()) {
                List listAsList = Arrays.asList(((br10) qxf0Var).i);
                ly0.f(listAsList.size() == dVar.p.size());
                for (int i2 = 0; i2 < listAsList.size(); i2++) {
                    ((d.c) dVar.p.get(i2)).b = (qxf0) listAsList.get(i2);
                }
            }
            long j = -9223372036854775807L;
            if (dVar.K) {
                if (c0064e.b.b.equals(dVar.l0.b) && c0064e.b.d == dVar.l0.s) {
                    z = false;
                }
                if (z) {
                    if (qxf0Var.p() || c0064e.b.b.b()) {
                        j = c0064e.b.d;
                    } else {
                        co10 co10Var = c0064e.b;
                        ekv.b bVar = co10Var.b;
                        long j2 = co10Var.d;
                        Object obj = bVar.a;
                        qxf0.b bVar2 = dVar.o;
                        qxf0Var.g(obj, bVar2);
                        j = j2 + bVar2.e;
                    }
                }
            } else {
                z = false;
            }
            dVar.K = false;
            dVar.Q0(c0064e.b, 1, z, dVar.J, j, -1, false);
        }
    }
}
