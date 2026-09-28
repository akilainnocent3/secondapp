package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class lam {
    public final mam a;
    public final zpc b;
    public final zpc c;
    public final hkg d;
    public final Uri[] e;
    public final androidx.media3.common.a[] f;
    public final ddd g;
    public final jjg0 h;
    public final List<androidx.media3.common.a> i;
    public final sp10 k;
    public boolean l;
    public ae2 n;
    public Uri o;
    public Uri p;
    public boolean q;
    public oyg r;
    public final w8j j = new w8j();
    public byte[] m = jrh0.b;
    public long s = -9223372036854775807L;

    public static final class a extends qoc {
        public byte[] l;
    }

    public static final class b {
        public mn7 a;
        public boolean b;
        public Uri c;
    }

    public static final class c extends g32 {
        public final List<ram.f> d;
        public final long e;

        public c(long j, List list) {
            super(list.size() - 1);
            this.e = j;
            this.d = list;
        }

        @Override // defpackage.tiv
        public final long a() {
            long j = this.c;
            if (j < 0 || j > this.b) {
                lrh0.a();
                return 0L;
            }
            return this.e + this.d.get((int) j).e;
        }

        @Override // defpackage.tiv
        public final long b() {
            long j = this.c;
            if (j < 0 || j > this.b) {
                lrh0.a();
                return 0L;
            }
            ram.f fVar = this.d.get((int) j);
            return this.e + fVar.e + fVar.c;
        }
    }

    public static final class d extends f62 {
        public int g;

        @Override // defpackage.oyg
        public final int c() {
            return this.g;
        }

        @Override // defpackage.oyg
        public final Object i() {
            return null;
        }

        @Override // defpackage.oyg
        public final void l(long j, long j2, long j3, List<? extends siv> list, tiv[] tivVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (b(this.g, jElapsedRealtime)) {
                for (int i = this.b - 1; i >= 0; i--) {
                    if (!b(i, jElapsedRealtime)) {
                        this.g = i;
                        return;
                    }
                }
                fm20.a();
            }
        }

        @Override // defpackage.oyg
        public final int s() {
            return 0;
        }
    }

    public static final class e {
        public final ram.f a;
        public final long b;
        public final int c;
        public final boolean d;

        public e(ram.f fVar, long j, int i) {
            this.a = fVar;
            this.b = j;
            this.c = i;
            this.d = (fVar instanceof ram.c) && ((ram.c) fVar).B;
        }
    }

    public lam(mam mamVar, ddd dddVar, Uri[] uriArr, androidx.media3.common.a[] aVarArr, add addVar, mrg0 mrg0Var, hkg hkgVar, List list, sp10 sp10Var) {
        this.a = mamVar;
        this.g = dddVar;
        this.e = uriArr;
        this.f = aVarArr;
        this.d = hkgVar;
        this.i = list;
        this.k = sp10Var;
        zpc.a aVar = addVar.a;
        zpc zpcVarA = aVar.a();
        this.b = zpcVarA;
        if (mrg0Var != null) {
            zpcVarA.g(mrg0Var);
        }
        this.c = aVar.a();
        this.h = new jjg0("", aVarArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((aVarArr[i2].f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        jjg0 jjg0Var = this.h;
        int[] iArrT = c0p.t(arrayList);
        d dVar = new d(jjg0Var, iArrT);
        androidx.media3.common.a aVar2 = jjg0Var.d[iArrT[0]];
        while (i < dVar.b) {
            if (dVar.d[i] == aVar2) {
                dVar.g = i;
                this.r = dVar;
            }
            i++;
        }
        i = -1;
        dVar.g = i;
        this.r = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e d(ram ramVar, long j, int i) {
        long j2 = ramVar.k;
        pcn pcnVar = ramVar.s;
        int i2 = (int) (j - j2);
        pcn pcnVar2 = ramVar.r;
        if (i2 == pcnVar2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < pcnVar.size()) {
                return new e((ram.f) pcnVar.get(i), j, i);
            }
            return null;
        }
        ram.e eVar = (ram.e) pcnVar2.get(i2);
        if (i == -1) {
            return new e(eVar, j, -1);
        }
        if (i < eVar.B.size()) {
            return new e((ram.f) eVar.B.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < pcnVar2.size()) {
            return new e((ram.f) pcnVar2.get(i3), j + 1, -1);
        }
        if (pcnVar.isEmpty()) {
            return null;
        }
        return new e((ram.f) pcnVar.get(0), j + 1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tiv[] a(nam namVar, long j) {
        List listUnmodifiableList;
        lam lamVar = this;
        nam namVar2 = namVar;
        int iA = namVar2 == null ? -1 : lamVar.h.a(namVar2.d);
        int length = lamVar.r.length();
        tiv[] tivVarArr = new tiv[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iF = lamVar.r.f(i);
            Uri uri = lamVar.e[iF];
            ddd dddVar = lamVar.g;
            if (dddVar.d(uri)) {
                ram ramVarB = dddVar.b(z, uri);
                ramVarB.getClass();
                long j2 = ramVarB.h - dddVar.C;
                Pair<Long, Integer> pairC = lamVar.c(namVar2, iF != iA ? true : z, ramVarB, j2, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j3 = ramVarB.k;
                pcn pcnVar = ramVarB.s;
                pcn pcnVar2 = ramVarB.r;
                int i2 = (int) (jLongValue - j3);
                if (i2 < 0 || pcnVar2.size() < i2) {
                    pcn.b bVar = pcn.b;
                    listUnmodifiableList = c150.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < pcnVar2.size()) {
                        if (iIntValue != -1) {
                            ram.e eVar = (ram.e) pcnVar2.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(eVar);
                            } else if (iIntValue < eVar.B.size()) {
                                pcn pcnVar3 = eVar.B;
                                arrayList.addAll(pcnVar3.subList(iIntValue, pcnVar3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(pcnVar2.subList(i2, pcnVar2.size()));
                        iIntValue = 0;
                    }
                    if (ramVarB.n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < pcnVar.size()) {
                            arrayList.addAll(pcnVar.subList(iIntValue, pcnVar.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                tivVarArr[i] = new c(j2, listUnmodifiableList);
            } else {
                tivVarArr[i] = tiv.a;
            }
            i++;
            lamVar = this;
            namVar2 = namVar;
            z = false;
        }
        return tivVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(nam namVar) {
        int i = namVar.o;
        if (i == -1) {
            return 1;
        }
        ram ramVarB = this.g.b(false, this.e[this.h.a(namVar.d)]);
        ramVarB.getClass();
        pcn pcnVar = ramVarB.r;
        int i2 = (int) (namVar.j - ramVarB.k);
        if (i2 < 0) {
            return 1;
        }
        pcn pcnVar2 = i2 < pcnVar.size() ? ((ram.e) pcnVar.get(i2)).B : ramVarB.s;
        if (i >= pcnVar2.size()) {
            return 2;
        }
        ram.c cVar = (ram.c) pcnVar2.get(i);
        if (cVar.B) {
            return 0;
        }
        return Objects.equals(Uri.parse(pmh0.c(ramVarB.a, cVar.a)), namVar.b.a) ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<Long, Integer> c(nam namVar, boolean z, ram ramVar, long j, long j2) {
        boolean z2 = true;
        int i = -1;
        if (namVar != null) {
            long j3 = namVar.j;
            int i2 = namVar.o;
            if (!z) {
                if (!namVar.H) {
                    return new Pair<>(Long.valueOf(j3), Integer.valueOf(i2));
                }
                if (i2 == -1) {
                    j3 = j3 != -1 ? j3 + 1 : -1L;
                }
                return new Pair<>(Long.valueOf(j3), Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
            }
        }
        long j4 = ramVar.u;
        pcn pcnVar = ramVar.s;
        long j5 = ramVar.k;
        pcn pcnVar2 = ramVar.r;
        long j6 = j + j4;
        long j7 = (namVar == null || this.q) ? j2 : namVar.g;
        if (!ramVar.o && j7 >= j6) {
            return new Pair<>(Long.valueOf(j5 + ((long) pcnVar2.size())), -1);
        }
        long j8 = j7 - j;
        Long lValueOf = Long.valueOf(j8);
        if (this.g.B && namVar != null) {
            z2 = false;
        }
        int iC = jrh0.c(pcnVar2, lValueOf, z2);
        long j9 = ((long) iC) + j5;
        if (iC >= 0) {
            ram.e eVar = (ram.e) pcnVar2.get(iC);
            pcn pcnVar3 = j8 < eVar.e + eVar.c ? eVar.B : pcnVar;
            for (int i3 = 0; i3 < pcnVar3.size(); i3++) {
                ram.c cVar = (ram.c) pcnVar3.get(i3);
                if (j8 < cVar.e + cVar.c) {
                    if (!cVar.A) {
                        break;
                    }
                    j9 += pcnVar3 == pcnVar ? 1L : 0L;
                    i = i3;
                    break;
                }
            }
        }
        return new Pair<>(Long.valueOf(j9), Integer.valueOf(i));
    }

    public final a e(Uri uri, int i, boolean z) {
        v8j v8jVar = this.j.a;
        if (uri == null) {
            return null;
        }
        byte[] bArrRemove = v8jVar.remove(uri);
        if (bArrRemove != null) {
            v8jVar.put(uri, bArrRemove);
            return null;
        }
        gqc gqcVar = new gqc(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        androidx.media3.common.a aVar = this.f[i];
        int iS = this.r.s();
        Object objI = this.r.i();
        byte[] bArr = this.m;
        a aVar2 = new a(this.c, gqcVar, 3, aVar, iS, objI, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr = jrh0.b;
        }
        aVar2.j = bArr;
        return aVar2;
    }
}
