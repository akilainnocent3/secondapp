package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import com.google.protobuf.Reader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ddd implements nxs.a<tsz<uam>> {
    public static final sq20 D = new sq20();
    public ram A;
    public boolean B;
    public final add a;
    public final wam b;
    public final sws c;
    public mkv.a f;
    public nxs i;
    public Handler v;
    public HlsMediaSource w;
    public tam y;
    public Uri z;
    public final CopyOnWriteArrayList<xam> e = new CopyOnWriteArrayList<>();
    public final HashMap<Uri, b> d = new HashMap<>();
    public long C = -9223372036854775807L;

    public class a implements xam {
        public a() {
        }

        @Override // defpackage.xam
        public final boolean e(Uri uri, sws.c cVar, boolean z) {
            b bVar;
            ddd dddVar = ddd.this;
            HashMap<Uri, b> map = dddVar.d;
            if (dddVar.A == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                tam tamVar = dddVar.y;
                String str = jrh0.a;
                List<tam.b> list = tamVar.e;
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    b bVar2 = map.get(list.get(i2).a);
                    if (bVar2 != null && jElapsedRealtime < bVar2.v) {
                        i++;
                    }
                }
                sws.b bVarC = dddVar.c.c(new sws.a(dddVar.y.e.size(), i), cVar);
                if (bVarC != null && bVarC.a == 2 && (bVar = map.get(uri)) != null) {
                    bVar.a(bVarC.b);
                }
            }
            return false;
        }

        @Override // defpackage.xam
        public final void g() {
            ddd.this.e.remove(this);
        }
    }

    public final class b implements nxs.a<tsz<uam>> {
        public final Uri a;
        public final nxs b = new nxs("DefaultHlsPlaylistTracker:MediaPlaylist");
        public final zpc c;
        public ram d;
        public long e;
        public long f;
        public long i;
        public long v;
        public boolean w;
        public IOException y;
        public boolean z;

        public b(Uri uri) {
            this.a = uri;
            this.c = ddd.this.a.a.a();
        }

        public final boolean a(long j) {
            this.v = SystemClock.elapsedRealtime() + j;
            ddd dddVar = ddd.this;
            if (!this.a.equals(dddVar.z)) {
                return false;
            }
            List<tam.b> list = dddVar.y.e;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i = 0; i < size; i++) {
                b bVar = dddVar.d.get(list.get(i).a);
                bVar.getClass();
                if (jElapsedRealtime > bVar.v) {
                    Uri uri = bVar.a;
                    dddVar.z = uri;
                    bVar.f(dddVar.c(uri));
                    return false;
                }
            }
            return true;
        }

        public final Uri b() {
            ram ramVar = this.d;
            Uri uri = this.a;
            if (ramVar != null) {
                ram.g gVar = ramVar.v;
                if (gVar.a != -9223372036854775807L || gVar.e) {
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    ram ramVar2 = this.d;
                    if (ramVar2.v.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(ramVar2.k + ((long) ramVar2.r.size())));
                        ram ramVar3 = this.d;
                        if (ramVar3.n != -9223372036854775807L) {
                            pcn pcnVar = ramVar3.s;
                            int size = pcnVar.size();
                            if (!pcnVar.isEmpty() && ((ram.c) t3p.a(pcnVar)).B) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    ram.g gVar2 = this.d.v;
                    if (gVar2.a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", gVar2.b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return uri;
        }

        public final void c(boolean z) {
            f(z ? b() : this.a);
        }

        public final void d(Uri uri) {
            ddd dddVar = ddd.this;
            tsz.a<uam> aVarA = dddVar.b.a(dddVar.y, this.d);
            Map map = Collections.EMPTY_MAP;
            ly0.h(uri, "The uri must be set.");
            this.b.d(new tsz(this.c, new gqc(uri, 0L, 1, null, map, 0L, -1L, null, 1), aVarA), this, dddVar.c.b(4));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nxs.a
        public final void e(nxs.d dVar, long j, long j2) {
            tsz tszVar = (tsz) dVar;
            uam uamVar = (uam) tszVar.e;
            tws twsVar = new tws(tszVar.c.d, j2);
            if (uamVar instanceof ram) {
                h((ram) uamVar, twsVar);
                ddd.this.f.c(twsVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            } else {
                ssz sszVarB = ssz.b("Loaded playlist has unexpected type.");
                this.y = sszVarB;
                ddd.this.f.d(twsVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, sszVarB, true);
            }
            ddd.this.c.getClass();
        }

        public final void f(final Uri uri) {
            this.v = 0L;
            if (this.w) {
                return;
            }
            nxs nxsVar = this.b;
            if (nxsVar.b() || nxsVar.c != null) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.i;
            if (jElapsedRealtime >= j) {
                d(uri);
            } else {
                this.w = true;
                ddd.this.v.postDelayed(new Runnable() { // from class: edd
                    @Override // java.lang.Runnable
                    public final void run() {
                        ddd.b bVar = this.a;
                        bVar.w = false;
                        bVar.d(uri);
                    }
                }, j - jElapsedRealtime);
            }
        }

        @Override // nxs.a
        public final void g(nxs.d dVar, long j, long j2, int i) {
            tws twsVar;
            tsz tszVar = (tsz) dVar;
            if (i == 0) {
                long j3 = tszVar.a;
                twsVar = new tws(tszVar.b);
            } else {
                long j4 = tszVar.a;
                twsVar = new tws(tszVar.c.d, j2);
            }
            tws twsVar2 = twsVar;
            mkv.a aVar = ddd.this.f;
            tszVar.getClass();
            aVar.e(twsVar2, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
        }

        /* JADX WARN: Code duplicated, block: B:106:0x026e  */
        /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:12:0x0032  */
        /* JADX WARN: Code duplicated, block: B:52:0x011b  */
        /* JADX WARN: Code duplicated, block: B:53:0x0123  */
        /* JADX WARN: Code duplicated, block: B:55:0x0127  */
        /* JADX WARN: Code duplicated, block: B:56:0x012a  */
        /* JADX WARN: Code duplicated, block: B:58:0x012d  */
        /* JADX WARN: Code duplicated, block: B:59:0x012f  */
        /* JADX WARN: Code duplicated, block: B:61:0x013c  */
        /* JADX WARN: Code duplicated, block: B:62:0x0143  */
        /* JADX WARN: Code duplicated, block: B:64:0x0146  */
        /* JADX WARN: Multi-variable type inference failed */
        public final void h(ram ramVar, tws twsVar) {
            boolean z;
            boolean z2;
            long j;
            pcn pcnVar;
            long j2;
            long j3;
            ram ramVar2;
            int i;
            int i2;
            pcn pcnVar2;
            ram.e eVar;
            int i3;
            ram ramVar3;
            IOException iOException;
            IOException zamVar;
            boolean z3;
            int size;
            int size2;
            int size3;
            boolean z4 = ramVar.o;
            pcn pcnVar3 = ramVar.r;
            long j4 = ramVar.k;
            ram ramVar4 = this.d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.e = jElapsedRealtime;
            ddd dddVar = ddd.this;
            CopyOnWriteArrayList<xam> copyOnWriteArrayList = dddVar.e;
            if (ramVar4 != null) {
                long j5 = ramVar4.k;
                if (j4 <= j5 && (j4 < j5 || ((size = pcnVar3.size() - ramVar4.r.size()) == 0 ? !((size2 = ramVar.s.size()) > (size3 = ramVar4.s.size()) || (size2 == size3 && z4 && !ramVar4.o)) : size <= 0))) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            pcn pcnVar4 = ramVar.r;
            long j6 = 0;
            if (z) {
                z2 = true;
                if (ramVar.p) {
                    j = ramVar.h;
                    pcnVar = pcnVar3;
                } else {
                    ram ramVar5 = dddVar.A;
                    j = ramVar5 != null ? ramVar5.h : 0L;
                    pcnVar = pcnVar3;
                    if (ramVar4 != null) {
                        long j7 = ramVar4.h;
                        long j8 = ramVar4.k;
                        pcn pcnVar5 = ramVar4.r;
                        int size4 = pcnVar5.size();
                        j2 = j4;
                        int i4 = (int) (j2 - j8);
                        ram.e eVar2 = i4 < pcnVar5.size() ? (ram.e) pcnVar5.get(i4) : null;
                        if (eVar2 != null) {
                            j3 = eVar2.e;
                        } else if (size4 == j2 - j8) {
                            j3 = ramVar4.u;
                        }
                        j = j7 + j3;
                    }
                    long j9 = j;
                    if (ramVar.i) {
                        i3 = ramVar.j;
                    } else {
                        ramVar2 = dddVar.A;
                        if (ramVar2 != null) {
                            i = ramVar2.j;
                        } else {
                            i = 0;
                        }
                        if (ramVar4 == null) {
                            i2 = (int) (j2 - ramVar4.k);
                            pcnVar2 = ramVar4.r;
                            if (i2 < pcnVar2.size()) {
                                eVar = (ram.e) pcnVar2.get(i2);
                            } else {
                                eVar = null;
                            }
                            if (eVar != null) {
                                i = (ramVar4.j + eVar.d) - ((ram.e) pcnVar4.get(0)).d;
                            }
                        }
                        i3 = i;
                    }
                    iOException = null;
                    ramVar3 = new ram(ramVar.d, ramVar.a, ramVar.b, ramVar.e, ramVar.g, j9, true, i3, ramVar.k, ramVar.l, ramVar.m, ramVar.n, ramVar.c, ramVar.o, ramVar.p, ramVar.q, pcnVar4, ramVar.s, ramVar.v, ramVar.t, ramVar.w);
                }
                j2 = j4;
                long j10 = j;
                if (ramVar.i) {
                    i3 = ramVar.j;
                } else {
                    ramVar2 = dddVar.A;
                    if (ramVar2 != null) {
                        i = ramVar2.j;
                    } else {
                        i = 0;
                    }
                    if (ramVar4 == null) {
                        i2 = (int) (j2 - ramVar4.k);
                        pcnVar2 = ramVar4.r;
                        if (i2 < pcnVar2.size()) {
                            eVar = (ram.e) pcnVar2.get(i2);
                        } else {
                            eVar = null;
                        }
                        if (eVar != null) {
                            i = (ramVar4.j + eVar.d) - ((ram.e) pcnVar4.get(0)).d;
                        }
                    }
                    i3 = i;
                }
                iOException = null;
                ramVar3 = new ram(ramVar.d, ramVar.a, ramVar.b, ramVar.e, ramVar.g, j10, true, i3, ramVar.k, ramVar.l, ramVar.m, ramVar.n, ramVar.c, ramVar.o, ramVar.p, ramVar.q, pcnVar4, ramVar.s, ramVar.v, ramVar.t, ramVar.w);
            } else if (!z4) {
                z2 = true;
                pcnVar = pcnVar3;
                j2 = j4;
                ramVar3 = ramVar4;
                iOException = null;
            } else if (ramVar4.o) {
                pcnVar = pcnVar3;
                j2 = j4;
                ramVar3 = ramVar4;
                iOException = null;
                z2 = true;
            } else {
                z2 = true;
                pcnVar = pcnVar3;
                ramVar3 = new ram(ramVar4.d, ramVar4.a, ramVar4.b, ramVar4.e, ramVar4.g, ramVar4.h, ramVar4.i, ramVar4.j, ramVar4.k, ramVar4.l, ramVar4.m, ramVar4.n, ramVar4.c, true, ramVar4.p, ramVar4.q, ramVar4.r, ramVar4.s, ramVar4.v, ramVar4.t, ramVar4.w);
                iOException = null;
                j2 = j4;
            }
            this.d = ramVar3;
            Uri uri = this.a;
            if (ramVar3 != ramVar4) {
                this.y = iOException;
                this.f = jElapsedRealtime;
                if (uri.equals(dddVar.z)) {
                    if (dddVar.A == null) {
                        dddVar.B = !ramVar3.o;
                        dddVar.C = ramVar3.h;
                    }
                    dddVar.A = ramVar3;
                    dddVar.w.v(ramVar3);
                }
                Iterator<xam> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().g();
                }
            } else if (!ramVar3.o) {
                long size5 = j2 + ((long) pcnVar.size());
                ram ramVar6 = this.d;
                if (size5 < ramVar6.k) {
                    zamVar = new yam();
                    z3 = z2;
                } else {
                    zamVar = ((double) (jElapsedRealtime - this.f)) > ((double) jrh0.Z(ramVar6.m)) * 3.5d ? new zam() : iOException;
                    z3 = false;
                }
                if (zamVar != null) {
                    this.y = zamVar;
                    sws.c cVar = new sws.c(zamVar, z2 ? 1 : 0);
                    Iterator<xam> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().e(uri, cVar, z3);
                    }
                }
            }
            ram ramVar7 = this.d;
            ram.g gVar = ramVar7.v;
            long j11 = ramVar7.m;
            if (gVar.e) {
                if (ramVar7 == ramVar4) {
                    long j12 = ramVar7.n;
                    if (j12 != -9223372036854775807L) {
                        j6 = j12 / 2;
                    } else {
                        j11 /= 2;
                    }
                }
                this.i = (jrh0.Z(j6) + jElapsedRealtime) - twsVar.b;
                if (this.d.o) {
                }
                if (!uri.equals(dddVar.z) || this.z) {
                    f(b());
                }
                return;
            }
            if (ramVar7 == ramVar4) {
                j11 /= 2;
            }
            j6 = j11;
            this.i = (jrh0.Z(j6) + jElapsedRealtime) - twsVar.b;
            if (this.d.o) {
                if (uri.equals(dddVar.z)) {
                }
                f(b());
            }
        }

        @Override // nxs.a
        public final nxs.b i(nxs.d dVar, long j, long j2, IOException iOException, int i) {
            tsz tszVar = (tsz) dVar;
            long j3 = tszVar.a;
            ozd0 ozd0Var = tszVar.c;
            Uri uri = ozd0Var.c;
            tws twsVar = new tws(ozd0Var.d, j2);
            boolean z = uri.getQueryParameter("_HLS_msn") != null;
            boolean z2 = iOException instanceof vam.a;
            nxs.b bVar = nxs.e;
            ddd dddVar = ddd.this;
            if (z || z2) {
                int i2 = iOException instanceof qom ? ((qom) iOException).c : Reader.READ_DONE;
                if (z2 || i2 == 400 || i2 == 503) {
                    this.i = SystemClock.elapsedRealtime();
                    c(false);
                    mkv.a aVar = dddVar.f;
                    String str = jrh0.a;
                    aVar.d(twsVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                    return bVar;
                }
            }
            sws.c cVar = new sws.c(iOException, i);
            Iterator<xam> it = dddVar.e.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                z3 |= !it.next().e(this.a, cVar, false);
            }
            sws swsVar = dddVar.c;
            if (z3) {
                long jA = swsVar.a(cVar);
                bVar = jA != -9223372036854775807L ? new nxs.b(0, jA) : nxs.f;
            }
            int i3 = bVar.a;
            boolean z4 = i3 == 0 || i3 == 1;
            dddVar.f.d(twsVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !z4);
            if (!z4) {
                swsVar.getClass();
            }
            return bVar;
        }

        @Override // nxs.a
        public final void p(nxs.d dVar, long j, long j2, boolean z) {
            tsz tszVar = (tsz) dVar;
            long j3 = tszVar.a;
            tws twsVar = new tws(tszVar.c.d, j2);
            ddd dddVar = ddd.this;
            dddVar.c.getClass();
            dddVar.f.b(twsVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    public ddd(add addVar, sws swsVar, wam wamVar) {
        this.a = addVar;
        this.b = wamVar;
        this.c = swsVar;
    }

    public final void a(Uri uri) {
        b bVar = this.d.get(uri);
        if (bVar != null) {
            bVar.z = false;
        }
    }

    public final ram b(boolean z, Uri uri) {
        HashMap<Uri, b> map = this.d;
        ram ramVar = map.get(uri).d;
        if (ramVar != null && z) {
            if (!uri.equals(this.z)) {
                List<tam.b> list = this.y.e;
                for (int i = 0; i < list.size(); i++) {
                    if (uri.equals(list.get(i).a)) {
                        ram ramVar2 = this.A;
                        if (ramVar2 != null && ramVar2.o) {
                            break;
                        }
                        this.z = uri;
                        b bVar = map.get(uri);
                        ram ramVar3 = bVar.d;
                        if (ramVar3 != null && ramVar3.o) {
                            this.A = ramVar3;
                            this.w.v(ramVar3);
                            break;
                        }
                        bVar.f(c(uri));
                        break;
                    }
                }
            }
            b bVar2 = map.get(uri);
            ram ramVar4 = bVar2.d;
            if (!bVar2.z) {
                bVar2.z = true;
                if (ramVar4 != null && !ramVar4.o) {
                    bVar2.c(true);
                }
            }
        }
        return ramVar;
    }

    public final Uri c(Uri uri) {
        ram.d dVar;
        ram ramVar = this.A;
        if (ramVar == null || !ramVar.v.e || (dVar = (ram.d) ((d150) ramVar.t).get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(dVar.b));
        int i = dVar.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final boolean d(Uri uri) {
        int i;
        b bVar = this.d.get(uri);
        if (bVar.d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, jrh0.Z(bVar.d.u));
        ram ramVar = bVar.d;
        return ramVar.o || (i = ramVar.d) == 2 || i == 1 || bVar.e + jMax > jElapsedRealtime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nxs.a
    public final void e(nxs.d dVar, long j, long j2) {
        tam tamVar;
        tsz tszVar = (tsz) dVar;
        uam uamVar = (uam) tszVar.e;
        boolean z = uamVar instanceof ram;
        if (z) {
            String str = uamVar.a;
            tam tamVar2 = tam.n;
            Uri uri = Uri.parse(str);
            androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
            c0062a.a = "0";
            c0062a.l = gqv.m("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new tam.b(uri, new androidx.media3.common.a(c0062a), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            tamVar = new tam("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            tamVar = (tam) uamVar;
        }
        this.y = tamVar;
        this.z = tamVar.e.get(0).a;
        this.e.add(new a());
        List<Uri> list2 = tamVar.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = list2.get(i);
            this.d.put(uri2, new b(uri2));
        }
        tws twsVar = new tws(tszVar.c.d, j2);
        b bVar = this.d.get(this.z);
        if (z) {
            bVar.h((ram) uamVar, twsVar);
        } else {
            bVar.c(false);
        }
        this.c.getClass();
        this.f.c(twsVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void f(Uri uri) {
        b bVar = this.d.get(uri);
        nxs nxsVar = bVar.b;
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
        IOException iOException3 = bVar.y;
        if (iOException3 != null) {
            throw iOException3;
        }
    }

    @Override // nxs.a
    public final void g(nxs.d dVar, long j, long j2, int i) {
        tws twsVar;
        tsz tszVar = (tsz) dVar;
        if (i == 0) {
            long j3 = tszVar.a;
            twsVar = new tws(tszVar.b);
        } else {
            long j4 = tszVar.a;
            twsVar = new tws(tszVar.c.d, j2);
        }
        tws twsVar2 = twsVar;
        mkv.a aVar = this.f;
        tszVar.getClass();
        aVar.e(twsVar2, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // nxs.a
    public final nxs.b i(nxs.d dVar, long j, long j2, IOException iOException, int i) {
        tsz tszVar = (tsz) dVar;
        long j3 = tszVar.a;
        tws twsVar = new tws(tszVar.c.d, j2);
        long jA = this.c.a(new sws.c(iOException, i));
        boolean z = jA == -9223372036854775807L;
        this.f.d(twsVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        return z ? nxs.f : new nxs.b(0, jA);
    }

    @Override // nxs.a
    public final void p(nxs.d dVar, long j, long j2, boolean z) {
        tsz tszVar = (tsz) dVar;
        long j3 = tszVar.a;
        tws twsVar = new tws(tszVar.c.d, j2);
        this.c.getClass();
        this.f.b(twsVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
