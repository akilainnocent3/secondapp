package defpackage;

import androidx.compose.ui.d;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wwx {
    public final tsr a;
    public final b b;
    public final iln c;
    public ywx d;
    public final g4f0 e;
    public d.c f;
    public duw<d.b> g;
    public duw<d.b> h;
    public final duw<d> i;
    public a j;

    public final class a {
        public d.c a;
        public int b;
        public duw<d.b> c;
        public duw<d.b> d;
        public boolean e;

        public a(d.c cVar, int i, duw<d.b> duwVar, duw<d.b> duwVar2, boolean z) {
            this.a = cVar;
            this.b = i;
            this.c = duwVar;
            this.d = duwVar2;
            this.e = z;
        }

        public final boolean a(int i, int i2) {
            duw<d.b> duwVar = this.c;
            int i3 = this.b;
            d.b bVar = duwVar.a[i + i3];
            d.b bVar2 = this.d.a[i3 + i2];
            return Intrinsics.g(bVar, bVar2) || bVar.getClass() == bVar2.getClass();
        }
    }

    public static final class b extends d.c {
        public final String toString() {
            return "<Head>";
        }
    }

    public wwx(tsr tsrVar) {
        this.a = tsrVar;
        b bVar = new b();
        bVar.d = -1;
        this.b = bVar;
        iln ilnVar = new iln(tsrVar);
        this.c = ilnVar;
        this.d = ilnVar;
        g4f0 g4f0Var = ilnVar.j0;
        this.e = g4f0Var;
        this.f = g4f0Var;
        this.i = new duw<>(new d[16]);
    }

    public static d.c a(d.b bVar, d.c cVar) {
        d.c cVarA;
        if (bVar instanceof p3w) {
            cVarA = ((p3w) bVar).a();
            cVarA.c = dxx.f(cVarA);
        } else {
            tt1 tt1Var = new tt1();
            tt1Var.c = dxx.d(bVar);
            tt1Var.D = bVar;
            tt1Var.E = true;
            tt1Var.G = new HashSet<>();
            cVarA = tt1Var;
        }
        if (cVarA.C) {
            wkn.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cVarA.w = true;
        d.c cVar2 = cVar.f;
        if (cVar2 != null) {
            cVar2.e = cVarA;
            cVarA.f = cVar2;
        }
        cVar.f = cVarA;
        cVarA.e = cVar;
        return cVarA;
    }

    public static d.c b(d.c cVar) {
        boolean z = cVar.C;
        if (z) {
            dtw<Object> dtwVar = dxx.a;
            if (!z) {
                wkn.c("autoInvalidateRemovedNode called on unattached node");
            }
            dxx.a(cVar, -1, 2);
            cVar.m2();
            cVar.g2();
        }
        d.c cVar2 = cVar.f;
        d.c cVar3 = cVar.e;
        if (cVar2 != null) {
            cVar2.e = cVar3;
            cVar.f = null;
        }
        if (cVar3 != null) {
            cVar3.f = cVar2;
            cVar.e = null;
        }
        cVar3.getClass();
        return cVar3;
    }

    public static void h(d.b bVar, d.b bVar2, d.c cVar) {
        if ((bVar instanceof p3w) && (bVar2 instanceof p3w)) {
            cVar.getClass();
            ((p3w) bVar2).d(cVar);
            if (cVar.C) {
                dxx.c(cVar);
                return;
            } else {
                cVar.y = true;
                return;
            }
        }
        if (!(cVar instanceof tt1)) {
            wkn.c("Unknown Modifier.Node type");
            return;
        }
        tt1 tt1Var = (tt1) cVar;
        if (tt1Var.C) {
            tt1Var.q2();
        }
        tt1Var.D = bVar2;
        tt1Var.c = dxx.d(bVar2);
        if (tt1Var.C) {
            tt1Var.p2(false);
        }
        if (cVar.C) {
            dxx.c(cVar);
        } else {
            cVar.y = true;
        }
    }

    public final boolean c(int i) {
        return (this.f.d & i) != 0;
    }

    public final void d(d.c cVar, ywx ywxVar) {
        for (d.c cVar2 = cVar.e; cVar2 != null; cVar2 = cVar2.e) {
            if (cVar2 == this.b) {
                tsr tsrVarH = this.a.H();
                ywxVar.I = tsrVarH != null ? tsrVarH.U.c : null;
                this.d = ywxVar;
                return;
            } else {
                if ((cVar2.c & 2) != 0) {
                    return;
                }
                cVar2.o2(ywxVar);
            }
        }
    }

    public final void e() {
        for (d.c cVar = this.f; cVar != null; cVar = cVar.f) {
            cVar.l2();
            if (cVar.w) {
                dtw<Object> dtwVar = dxx.a;
                if (!cVar.C) {
                    wkn.c("autoInvalidateInsertedNode called on unattached node");
                }
                dxx.a(cVar, -1, 1);
            }
            if (cVar.y) {
                dxx.c(cVar);
            }
            cVar.w = false;
            cVar.y = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0188  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x019e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void f(int r32, defpackage.duw<androidx.compose.ui.d.b> r33, defpackage.duw<androidx.compose.ui.d.b> r34, androidx.compose.ui.d.c r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwx.f(int, duw, duw, androidx.compose.ui.d$c, boolean):void");
    }

    public final void g() {
        tsr tsrVar;
        qsr qsrVar;
        vgz vgzVar;
        d.c cVar = this.e.e;
        ywx ywxVar = this.c;
        while (true) {
            tsrVar = this.a;
            if (cVar == null) {
                break;
            }
            psr psrVarB = pkd.b(cVar);
            if (psrVarB != null) {
                ywx ywxVar2 = cVar.v;
                if (ywxVar2 != null) {
                    qsrVar = (qsr) ywxVar2;
                    psr psrVar = qsrVar.j0;
                    qsrVar.w2(psrVarB);
                    if (psrVar != cVar && (vgzVar = qsrVar.a0) != null) {
                        vgzVar.invalidate();
                    }
                } else {
                    qsrVar = new qsr(tsrVar, psrVarB);
                    cVar.o2(qsrVar);
                }
                ywxVar.I = qsrVar;
                qsrVar.H = ywxVar;
                ywxVar = qsrVar;
            } else {
                cVar.o2(ywxVar);
            }
            cVar = cVar.e;
        }
        tsr tsrVarH = tsrVar.H();
        ywxVar.I = tsrVarH != null ? tsrVarH.U.c : null;
        this.d = ywxVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        d.c cVar = this.f;
        g4f0 g4f0Var = this.e;
        if (cVar == g4f0Var) {
            sb.append("]");
        } else {
            while (cVar != null && cVar != g4f0Var) {
                sb.append(String.valueOf(cVar));
                if (cVar.f == g4f0Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                cVar = cVar.f;
            }
        }
        return sb.toString();
    }
}
