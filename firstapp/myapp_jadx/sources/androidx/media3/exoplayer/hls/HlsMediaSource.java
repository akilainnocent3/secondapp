package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.StreamKey;
import defpackage.add;
import defpackage.bdd;
import defpackage.cdd;
import defpackage.ddd;
import defpackage.ekv;
import defpackage.fbm;
import defpackage.gqc;
import defpackage.h32;
import defpackage.hv90;
import defpackage.inh;
import defpackage.jbd;
import defpackage.jrh0;
import defpackage.lam;
import defpackage.lef;
import defpackage.ly0;
import defpackage.mam;
import defpackage.mef;
import defpackage.mkv;
import defpackage.mrg0;
import defpackage.nef;
import defpackage.njv;
import defpackage.nxs;
import defpackage.ojv;
import defpackage.pcn;
import defpackage.qam;
import defpackage.r5h;
import defpackage.ram;
import defpackage.sp10;
import defpackage.sq20;
import defpackage.sws;
import defpackage.tf;
import defpackage.tsz;
import defpackage.udd;
import defpackage.ugd;
import defpackage.wam;
import defpackage.zbd;
import defpackage.zjv;
import defpackage.zpc;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource extends h32 {
    public final mam h;
    public final add i;
    public final jbd j;
    public final nef k;
    public final sws l;
    public final boolean m;
    public final int n;
    public final ddd o;
    public final long p;
    public njv.d q;
    public mrg0 r;
    public njv s;

    static {
        ojv.a("media3.exoplayer.hls");
    }

    public HlsMediaSource(njv njvVar, add addVar, mam mamVar, jbd jbdVar, nef nefVar, sws swsVar, ddd dddVar, long j, boolean z, int i) {
        this.s = njvVar;
        this.q = njvVar.c;
        this.i = addVar;
        this.h = mamVar;
        this.j = jbdVar;
        this.k = nefVar;
        this.l = swsVar;
        this.o = dddVar;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static ram.c u(long j, List list) {
        ram.c cVar = null;
        for (int i = 0; i < list.size(); i++) {
            ram.c cVar2 = (ram.c) list.get(i);
            long j2 = cVar2.e;
            if (j2 > j || !cVar2.A) {
                if (j2 > j) {
                    break;
                }
            } else {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    @Override // defpackage.ekv
    public final zjv c(ekv.b bVar, tf tfVar, long j) {
        mkv.a aVar = new mkv.a(this.c.c, 0, bVar);
        mef.a aVar2 = new mef.a(this.d.c, 0, bVar);
        mrg0 mrg0Var = this.r;
        sp10 sp10Var = this.g;
        ly0.g(sp10Var);
        return new qam(this.h, this.o, this.i, mrg0Var, this.k, aVar2, this.l, aVar, tfVar, this.j, this.m, this.n, sp10Var);
    }

    @Override // defpackage.ekv
    public final synchronized njv e() {
        return this.s;
    }

    @Override // defpackage.ekv
    public final synchronized void g(njv njvVar) {
        this.s = njvVar;
    }

    @Override // defpackage.ekv
    public final void l() throws IOException {
        ddd dddVar = this.o;
        nxs nxsVar = dddVar.i;
        if (nxsVar != null) {
            IOException iOException = nxsVar.c;
            if (iOException != null) {
                throw iOException;
            }
            nxs.c<? extends nxs.d> cVar = nxsVar.b;
            if (cVar != null) {
                int i = cVar.a;
                IOException iOException2 = cVar.e;
                if (iOException2 != null && cVar.f > i) {
                    throw iOException2;
                }
            }
        }
        Uri uri = dddVar.z;
        if (uri != null) {
            dddVar.f(uri);
        }
    }

    @Override // defpackage.ekv
    public final void o(zjv zjvVar) {
        qam qamVar = (qam) zjvVar;
        qamVar.b.e.remove(qamVar);
        for (fbm fbmVar : qamVar.I) {
            if (fbmVar.S) {
                for (fbm.b bVar : fbmVar.K) {
                    bVar.i();
                    lef lefVar = bVar.h;
                    if (lefVar != null) {
                        lefVar.i(bVar.e);
                        bVar.h = null;
                        bVar.g = null;
                    }
                }
            }
            lam lamVar = fbmVar.d;
            lamVar.g.a(lamVar.e[lamVar.r.q()]);
            lamVar.n = null;
            fbmVar.y.c(fbmVar);
            fbmVar.G.removeCallbacksAndMessages(null);
            fbmVar.W = true;
            fbmVar.H.clear();
        }
        qamVar.F = null;
    }

    @Override // defpackage.h32
    public final void r(mrg0 mrg0Var) {
        this.r = mrg0Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        sp10 sp10Var = this.g;
        ly0.g(sp10Var);
        nef nefVar = this.k;
        nefVar.e(looperMyLooper, sp10Var);
        nefVar.d();
        mkv.a aVar = new mkv.a(this.c.c, 0, null);
        njv.e eVar = e().b;
        eVar.getClass();
        Uri uri = eVar.a;
        Handler handlerP = jrh0.p(null);
        ddd dddVar = this.o;
        dddVar.v = handlerP;
        dddVar.f = aVar;
        dddVar.w = this;
        Map map = Collections.EMPTY_MAP;
        ly0.h(uri, "The uri must be set.");
        tsz tszVar = new tsz(dddVar.a.a.a(), new gqc(uri, 0L, 1, null, map, 0L, -1L, null, 1), dddVar.b.b());
        ly0.f(dddVar.i == null);
        nxs nxsVar = new nxs("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dddVar.i = nxsVar;
        nxsVar.d(tszVar, dddVar, dddVar.c.b(4));
    }

    @Override // defpackage.h32
    public final void t() {
        ddd dddVar = this.o;
        dddVar.z = null;
        dddVar.A = null;
        dddVar.y = null;
        dddVar.C = -9223372036854775807L;
        dddVar.i.c(null);
        dddVar.i = null;
        HashMap<Uri, ddd.b> map = dddVar.d;
        Iterator<ddd.b> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().b.c(null);
        }
        dddVar.v.removeCallbacksAndMessages(null);
        dddVar.v = null;
        map.clear();
        this.k.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(ram ramVar) {
        long j;
        hv90 hv90Var;
        long jO;
        long j2;
        long jO2;
        long j3;
        boolean z = ramVar.p;
        boolean z2 = ramVar.g;
        pcn pcnVar = ramVar.r;
        long j4 = ramVar.u;
        long jO3 = ramVar.e;
        int i = ramVar.d;
        long j5 = ramVar.h;
        long jZ = z ? jrh0.Z(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jZ : -9223372036854775807L;
        ddd dddVar = this.o;
        dddVar.y.getClass();
        r5h r5hVar = new r5h();
        long j7 = 0;
        if (dddVar.B) {
            ram.g gVar = ramVar.v;
            long j8 = gVar.c;
            long j9 = gVar.d;
            long j10 = j5 - dddVar.C;
            boolean z3 = ramVar.o;
            long j11 = z3 ? j10 + j4 : -9223372036854775807L;
            if (ramVar.p) {
                String str = jrh0.a;
                long j12 = this.p;
                jO = jrh0.O(j12 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j12) - (j5 + j4);
            } else {
                jO = 0;
            }
            long j13 = this.q.a;
            if (j13 != -9223372036854775807L) {
                jO2 = jrh0.O(j13);
            } else {
                if (jO3 != -9223372036854775807L) {
                    j2 = j4 - jO3;
                } else if (j9 == -9223372036854775807L || ramVar.n == -9223372036854775807L) {
                    j2 = j8 != -9223372036854775807L ? j8 : 3 * ramVar.m;
                } else {
                    j2 = j9;
                }
                jO2 = j2 + jO;
            }
            long j14 = j4 + jO;
            long j15 = jrh0.j(jO2, jO, j14);
            njv.d dVar = e().c;
            boolean z4 = dVar.d == -3.4028235E38f && dVar.e == -3.4028235E38f && j8 == -9223372036854775807L && j9 == -9223372036854775807L;
            njv.d.a aVar = new njv.d.a();
            aVar.a = jrh0.Z(j15);
            aVar.d = z4 ? 1.0f : this.q.d;
            aVar.e = z4 ? 1.0f : this.q.e;
            njv.d dVar2 = new njv.d(aVar);
            this.q = dVar2;
            if (jO3 == -9223372036854775807L) {
                jO3 = j14 - jrh0.O(dVar2.a);
            }
            if (z2) {
                j7 = jO3;
            } else {
                ram.c cVarU = u(jO3, ramVar.s);
                if (cVarU != null) {
                    j3 = cVarU.e;
                } else if (!pcnVar.isEmpty()) {
                    ram.e eVar = (ram.e) pcnVar.get(jrh0.c(pcnVar, Long.valueOf(jO3), true));
                    ram.c cVarU2 = u(jO3, eVar.B);
                    j3 = cVarU2 != null ? cVarU2.e : eVar.e;
                }
                j7 = j3;
            }
            hv90Var = new hv90(j6, jZ, j11, ramVar.u, j10, j7, true, !z3, i == 2 && ramVar.f, r5hVar, e(), this.q);
        } else {
            if (jO3 == -9223372036854775807L || pcnVar.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jO3 != j4) {
                    jO3 = ((ram.e) pcnVar.get(jrh0.c(pcnVar, Long.valueOf(jO3), true))).e;
                }
                j = jO3;
            }
            long j16 = ramVar.u;
            hv90Var = new hv90(j6, jZ, j16, j16, 0L, j, true, false, true, r5hVar, e(), null);
        }
        s(hv90Var);
    }

    public static final class Factory implements ekv.a {
        public final add a;
        public bdd b;
        public ugd c;
        public final zbd h = new zbd();
        public final cdd e = new cdd();
        public final sq20 f = ddd.D;
        public sws i = new udd();
        public final jbd g = new jbd();
        public final int k = 1;
        public final long l = -9223372036854775807L;
        public boolean j = true;
        public boolean d = true;

        public Factory(zpc.a aVar) {
            this.a = new add(aVar);
        }

        @Override // ekv.a
        @Deprecated
        public final void a() {
            this.d = true;
        }

        @Override // ekv.a
        public final void c(ugd ugdVar) {
            this.c = ugdVar;
        }

        @Override // ekv.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final HlsMediaSource b(njv njvVar) {
            njvVar.b.getClass();
            bdd bddVar = this.b;
            if (bddVar == null) {
                bddVar = new bdd();
                bddVar.a = new ugd();
                this.b = bddVar;
            }
            bdd bddVar2 = bddVar;
            ugd ugdVar = this.c;
            if (ugdVar != null) {
                bddVar2.a = ugdVar;
            }
            bddVar2.b = this.d;
            List<StreamKey> list = njvVar.b.c;
            boolean zIsEmpty = list.isEmpty();
            cdd cddVar = this.e;
            wam inhVar = cddVar;
            if (!zIsEmpty) {
                inhVar = new inh(cddVar, list);
            }
            nef nefVarB = this.h.b(njvVar);
            sws swsVar = this.i;
            getClass();
            add addVar = this.a;
            return new HlsMediaSource(njvVar, addVar, bddVar2, this.g, nefVarB, swsVar, new ddd(addVar, swsVar, inhVar), this.l, this.j, this.k);
        }

        @Override // ekv.a
        public final void d() {
        }
    }
}
