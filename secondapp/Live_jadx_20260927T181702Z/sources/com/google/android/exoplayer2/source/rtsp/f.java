package com.google.android.exoplayer2.source.rtsp;

import af.d0;
import af.g0;
import af.o;
import ah.v0;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import cj.v6;
import com.google.android.exoplayer2.offline.StreamKey;
import eh.o1;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import jg.r;
import jg.y;
import jg.z;
import re.a5;
import re.n2;
import re.o2;
import yg.s;
import zf.h0;
import zf.h1;
import zf.i1;
import zf.s1;
import zf.u1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f implements h0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f49025x = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.b f49026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f49027c = o1.C();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f49028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.rtsp.d f49029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f49030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<d> f49031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f49032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.rtsp.a.InterfaceC0450a f49033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0.a f49034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v6<s1> f49035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public IOException f49036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public RtspMediaSource.c f49037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f49038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f49039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f49040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f49041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f49042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f49043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f49044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f49045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f49046v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f49047w;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a();

        void b(y yVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f49049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.rtsp.b f49050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f49051c;

        public d(r rVar, int i10, com.google.android.exoplayer2.source.rtsp.a.InterfaceC0450a interfaceC0450a) {
            this.f49049a = rVar;
            this.f49050b = new com.google.android.exoplayer2.source.rtsp.b(i10, rVar, new com.google.android.exoplayer2.source.rtsp.b.a() { // from class: jg.q
                @Override // com.google.android.exoplayer2.source.rtsp.b.a
                public final void a(String str, com.google.android.exoplayer2.source.rtsp.a aVar) {
                    com.google.android.exoplayer2.source.rtsp.f.d.a(this.f100411a, str, aVar);
                }
            }, f.this.f49028d, interfaceC0450a);
        }

        public static /* synthetic */ void a(d dVar, String str, com.google.android.exoplayer2.source.rtsp.a aVar) {
            dVar.f49051c = str;
            g.b bVarH = aVar.h();
            if (bVarH != null) {
                f.this.f49029e.m0(aVar.c(), bVarH);
                f.this.f49047w = true;
            }
            f.this.M();
        }

        public Uri c() {
            return this.f49050b.f48943b.f100436b;
        }

        public String d() {
            eh.a.k(this.f49051c);
            return this.f49051c;
        }

        public boolean e() {
            return this.f49051c != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f49053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v0 f49054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h1 f49055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f49056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f49057e;

        public e(r rVar, int i10, com.google.android.exoplayer2.source.rtsp.a.InterfaceC0450a interfaceC0450a) {
            this.f49053a = f.this.new d(rVar, i10, interfaceC0450a);
            this.f49054b = new v0("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i10);
            h1 h1VarM = h1.m(f.this.f49026b);
            this.f49055c = h1VarM;
            h1VarM.e0(f.this.f49028d);
        }

        public void c() {
            if (this.f49056d) {
                return;
            }
            this.f49053a.f49050b.cancelLoad();
            this.f49056d = true;
            f.this.T();
        }

        public long d() {
            return this.f49055c.B();
        }

        public boolean e() {
            return this.f49055c.M(this.f49056d);
        }

        public int f(o2 o2Var, ye.i iVar, int i10) {
            return this.f49055c.T(o2Var, iVar, i10, this.f49056d);
        }

        public void g() {
            if (this.f49057e) {
                return;
            }
            this.f49054b.j();
            this.f49055c.U();
            this.f49057e = true;
        }

        public void h() {
            eh.a.i(this.f49056d);
            this.f49056d = false;
            f.this.T();
            k();
        }

        public void i(long j10) {
            if (this.f49056d) {
                return;
            }
            this.f49053a.f49050b.b();
            this.f49055c.W();
            this.f49055c.c0(j10);
        }

        public int j(long j10) throws Throwable {
            int iG = this.f49055c.G(j10, this.f49056d);
            this.f49055c.f0(iG);
            return iG;
        }

        public void k() {
            this.f49054b.l(this.f49053a.f49050b, f.this.f49028d, 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class C0452f implements i1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49059b;

        public C0452f(int i10) {
            this.f49059b = i10;
        }

        @Override // zf.i1
        public int c(o2 o2Var, ye.i iVar, int i10) {
            return f.this.N(this.f49059b, o2Var, iVar, i10);
        }

        @Override // zf.i1
        public boolean isReady() {
            return f.this.J(this.f49059b);
        }

        @Override // zf.i1
        public void maybeThrowError() throws RtspMediaSource.c {
            if (f.this.f49037m != null) {
                throw f.this.f49037m;
            }
        }

        @Override // zf.i1
        public int skipData(long j10) {
            return f.this.R(this.f49059b, j10);
        }
    }

    public f(ah.b bVar, com.google.android.exoplayer2.source.rtsp.a.InterfaceC0450a interfaceC0450a, Uri uri, c cVar, String str, SocketFactory socketFactory, boolean z10) {
        this.f49026b = bVar;
        this.f49033i = interfaceC0450a;
        this.f49032h = cVar;
        b bVar2 = new b();
        this.f49028d = bVar2;
        this.f49029e = new com.google.android.exoplayer2.source.rtsp.d(bVar2, bVar2, str, uri, socketFactory, z10);
        this.f49030f = new ArrayList();
        this.f49031g = new ArrayList();
        this.f49039o = -9223372036854775807L;
        this.f49038n = -9223372036854775807L;
        this.f49040p = -9223372036854775807L;
    }

    public static v6<s1> G(v6<e> v6Var) {
        v6.a aVar = new v6.a();
        for (int i10 = 0; i10 < v6Var.size(); i10++) {
            aVar.g(new s1(Integer.toString(i10), (n2) eh.a.g(v6Var.get(i10).f49055c.H())));
        }
        return aVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.f49043s || this.f49044t) {
            return;
        }
        for (int i10 = 0; i10 < this.f49030f.size(); i10++) {
            if (this.f49030f.get(i10).f49055c.H() == null) {
                return;
            }
        }
        this.f49044t = true;
        this.f49035k = G(v6.u(this.f49030f));
        ((h0.a) eh.a.g(this.f49034j)).d(this);
    }

    private boolean S() {
        return this.f49042r;
    }

    public static /* synthetic */ int d(f fVar) {
        int i10 = fVar.f49046v;
        fVar.f49046v = i10 + 1;
        return i10;
    }

    @Nullable
    public final com.google.android.exoplayer2.source.rtsp.b H(Uri uri) {
        for (int i10 = 0; i10 < this.f49030f.size(); i10++) {
            if (!this.f49030f.get(i10).f49056d) {
                d dVar = this.f49030f.get(i10).f49053a;
                if (dVar.c().equals(uri)) {
                    return dVar.f49050b;
                }
            }
        }
        return null;
    }

    @Override // zf.h0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public v6<StreamKey> a(List<s> list) {
        return v6.z();
    }

    public boolean J(int i10) {
        return !S() && this.f49030f.get(i10).e();
    }

    public final boolean K() {
        return this.f49039o != -9223372036854775807L;
    }

    public final void M() {
        boolean zE = true;
        for (int i10 = 0; i10 < this.f49031g.size(); i10++) {
            zE &= this.f49031g.get(i10).e();
        }
        if (zE && this.f49045u) {
            this.f49029e.v0(this.f49031g);
        }
    }

    public int N(int i10, o2 o2Var, ye.i iVar, int i11) {
        if (S()) {
            return -3;
        }
        return this.f49030f.get(i10).f(o2Var, iVar, i11);
    }

    public void O() {
        for (int i10 = 0; i10 < this.f49030f.size(); i10++) {
            this.f49030f.get(i10).g();
        }
        o1.t(this.f49029e);
        this.f49043s = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P() {
        this.f49047w = true;
        this.f49029e.n0();
        com.google.android.exoplayer2.source.rtsp.a.InterfaceC0450a interfaceC0450aA = this.f49033i.a();
        if (interfaceC0450aA == null) {
            this.f49037m = new RtspMediaSource.c("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f49030f.size());
        ArrayList arrayList2 = new ArrayList(this.f49031g.size());
        for (int i10 = 0; i10 < this.f49030f.size(); i10++) {
            e eVar = this.f49030f.get(i10);
            if (eVar.f49056d) {
                arrayList.add(eVar);
            } else {
                e eVar2 = new e(eVar.f49053a.f49049a, i10, interfaceC0450aA);
                arrayList.add(eVar2);
                eVar2.k();
                if (this.f49031g.contains(eVar.f49053a)) {
                    arrayList2.add(eVar2.f49053a);
                }
            }
        }
        v6 v6VarU = v6.u(this.f49030f);
        this.f49030f.clear();
        this.f49030f.addAll(arrayList);
        this.f49031g.clear();
        this.f49031g.addAll(arrayList2);
        for (int i11 = 0; i11 < v6VarU.size(); i11++) {
            ((e) v6VarU.get(i11)).c();
        }
    }

    public final boolean Q(long j10) {
        for (int i10 = 0; i10 < this.f49030f.size(); i10++) {
            if (!this.f49030f.get(i10).f49055c.a0(j10, false)) {
                return false;
            }
        }
        return true;
    }

    public int R(int i10, long j10) {
        if (S()) {
            return -3;
        }
        return this.f49030f.get(i10).j(j10);
    }

    public final void T() {
        this.f49041q = true;
        for (int i10 = 0; i10 < this.f49030f.size(); i10++) {
            this.f49041q &= this.f49030f.get(i10).f49056d;
        }
    }

    @Override // zf.h0, zf.j1
    public boolean continueLoading(long j10) {
        return isLoading();
    }

    @Override // zf.h0
    public void discardBuffer(long j10, boolean z10) {
        if (K()) {
            return;
        }
        for (int i10 = 0; i10 < this.f49030f.size(); i10++) {
            e eVar = this.f49030f.get(i10);
            if (!eVar.f49056d) {
                eVar.f49055c.r(j10, z10, true);
            }
        }
    }

    @Override // zf.h0
    public long f(s[] sVarArr, boolean[] zArr, i1[] i1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if (i1VarArr[i10] != null && (sVarArr[i10] == null || !zArr[i10])) {
                i1VarArr[i10] = null;
            }
        }
        this.f49031g.clear();
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            s sVar = sVarArr[i11];
            if (sVar != null) {
                s1 trackGroup = sVar.getTrackGroup();
                int iIndexOf = ((v6) eh.a.g(this.f49035k)).indexOf(trackGroup);
                this.f49031g.add(((e) eh.a.g(this.f49030f.get(iIndexOf))).f49053a);
                if (this.f49035k.contains(trackGroup) && i1VarArr[i11] == null) {
                    i1VarArr[i11] = new C0452f(iIndexOf);
                    zArr2[i11] = true;
                }
            }
        }
        for (int i12 = 0; i12 < this.f49030f.size(); i12++) {
            e eVar = this.f49030f.get(i12);
            if (!this.f49031g.contains(eVar.f49053a)) {
                eVar.c();
            }
        }
        this.f49045u = true;
        if (j10 != 0) {
            this.f49038n = j10;
            this.f49039o = j10;
            this.f49040p = j10;
        }
        M();
        return j10;
    }

    @Override // zf.h0, zf.j1
    public long getBufferedPositionUs() {
        if (this.f49041q || this.f49030f.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f49038n;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        boolean z10 = true;
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f49030f.size(); i10++) {
            e eVar = this.f49030f.get(i10);
            if (!eVar.f49056d) {
                jMin = Math.min(jMin, eVar.d());
                z10 = false;
            }
        }
        if (z10 || jMin == Long.MIN_VALUE) {
            return 0L;
        }
        return jMin;
    }

    @Override // zf.h0, zf.j1
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // zf.h0
    public u1 getTrackGroups() {
        eh.a.i(this.f49044t);
        return new u1((s1[]) ((v6) eh.a.g(this.f49035k)).toArray(new s1[0]));
    }

    @Override // zf.h0
    public void h(h0.a aVar, long j10) {
        this.f49034j = aVar;
        try {
            this.f49029e.y0();
        } catch (IOException e10) {
            this.f49036l = e10;
            o1.t(this.f49029e);
        }
    }

    @Override // zf.h0, zf.j1
    public boolean isLoading() {
        return !this.f49041q;
    }

    @Override // zf.h0
    public void maybeThrowPrepareError() throws IOException {
        IOException iOException = this.f49036l;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // zf.h0
    public long readDiscontinuity() {
        if (!this.f49042r) {
            return -9223372036854775807L;
        }
        this.f49042r = false;
        return 0L;
    }

    @Override // zf.h0
    public long seekToUs(long j10) {
        if (getBufferedPositionUs() == 0 && !this.f49047w) {
            this.f49040p = j10;
            return j10;
        }
        discardBuffer(j10, false);
        this.f49038n = j10;
        if (K()) {
            int iJ0 = this.f49029e.j0();
            if (iJ0 != 1) {
                if (iJ0 != 2) {
                    throw new IllegalStateException();
                }
                this.f49039o = j10;
                this.f49029e.o0(j10);
                return j10;
            }
        } else if (!Q(j10)) {
            this.f49039o = j10;
            if (this.f49041q) {
                for (int i10 = 0; i10 < this.f49030f.size(); i10++) {
                    this.f49030f.get(i10).h();
                }
                if (this.f49047w) {
                    this.f49029e.z0(o1.b2(j10));
                } else {
                    this.f49029e.o0(j10);
                }
            } else {
                this.f49029e.o0(j10);
            }
            for (int i11 = 0; i11 < this.f49030f.size(); i11++) {
                this.f49030f.get(i11).i(j10);
            }
        }
        return j10;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class b implements o, v0.b<com.google.android.exoplayer2.source.rtsp.b>, h1.d, com.google.android.exoplayer2.source.rtsp.d.g, com.google.android.exoplayer2.source.rtsp.d.e {
        public b() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.g
        public void a(y yVar, v6<r> v6Var) {
            for (int i10 = 0; i10 < v6Var.size(); i10++) {
                r rVar = v6Var.get(i10);
                f fVar = f.this;
                e eVar = fVar.new e(rVar, i10, fVar.f49033i);
                f.this.f49030f.add(eVar);
                eVar.k();
            }
            f.this.f49032h.b(yVar);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.g
        public void b(String str, @Nullable Throwable th2) {
            f.this.f49036l = th2 == null ? new IOException(str) : new IOException(str, th2);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.e
        public void c(long j10, v6<z> v6Var) {
            ArrayList arrayList = new ArrayList(v6Var.size());
            for (int i10 = 0; i10 < v6Var.size(); i10++) {
                arrayList.add((String) eh.a.g(v6Var.get(i10).f100473c.getPath()));
            }
            for (int i11 = 0; i11 < f.this.f49031g.size(); i11++) {
                if (!arrayList.contains(((d) f.this.f49031g.get(i11)).c().getPath())) {
                    f.this.f49032h.a();
                    if (f.this.K()) {
                        f.this.f49042r = true;
                        f.this.f49039o = -9223372036854775807L;
                        f.this.f49038n = -9223372036854775807L;
                        f.this.f49040p = -9223372036854775807L;
                    }
                }
            }
            for (int i12 = 0; i12 < v6Var.size(); i12++) {
                z zVar = v6Var.get(i12);
                com.google.android.exoplayer2.source.rtsp.b bVarH = f.this.H(zVar.f100473c);
                if (bVarH != null) {
                    bVarH.e(zVar.f100471a);
                    bVarH.d(zVar.f100472b);
                    if (f.this.K() && f.this.f49039o == f.this.f49038n) {
                        bVarH.c(j10, zVar.f100471a);
                    }
                }
            }
            if (!f.this.K()) {
                if (f.this.f49040p == -9223372036854775807L || !f.this.f49047w) {
                    return;
                }
                f fVar = f.this;
                fVar.seekToUs(fVar.f49040p);
                f.this.f49040p = -9223372036854775807L;
                return;
            }
            if (f.this.f49039o == f.this.f49038n) {
                f.this.f49039o = -9223372036854775807L;
                f.this.f49038n = -9223372036854775807L;
            } else {
                f.this.f49039o = -9223372036854775807L;
                f fVar2 = f.this;
                fVar2.seekToUs(fVar2.f49038n);
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.e
        public void e() {
            long jB2;
            if (f.this.f49039o != -9223372036854775807L) {
                jB2 = o1.b2(f.this.f49039o);
            } else {
                jB2 = f.this.f49040p != -9223372036854775807L ? o1.b2(f.this.f49040p) : 0L;
            }
            f.this.f49029e.z0(jB2);
        }

        @Override // af.o
        public void endTracks() {
            Handler handler = f.this.f49027c;
            final f fVar = f.this;
            handler.post(new Runnable() { // from class: jg.n
                @Override // java.lang.Runnable
                public final void run() {
                    fVar.L();
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.rtsp.d.e
        public void f(RtspMediaSource.c cVar) {
            if (!(cVar instanceof RtspMediaSource.d) || f.this.f49047w) {
                f.this.f49037m = cVar;
            } else {
                f.this.P();
            }
        }

        @Override // zf.h1.d
        public void g(n2 n2Var) {
            Handler handler = f.this.f49027c;
            final f fVar = f.this;
            handler.post(new Runnable() { // from class: jg.o
                @Override // java.lang.Runnable
                public final void run() {
                    fVar.L();
                }
            });
        }

        @Override // ah.v0.b
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void K(com.google.android.exoplayer2.source.rtsp.b bVar, long j10, long j11) {
            if (f.this.getBufferedPositionUs() == 0) {
                if (f.this.f49047w) {
                    return;
                }
                f.this.P();
                return;
            }
            for (int i10 = 0; i10 < f.this.f49030f.size(); i10++) {
                e eVar = (e) f.this.f49030f.get(i10);
                if (eVar.f49053a.f49050b == bVar) {
                    eVar.c();
                    break;
                }
            }
            f.this.f49029e.w0();
        }

        @Override // ah.v0.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public v0.c P(com.google.android.exoplayer2.source.rtsp.b bVar, long j10, long j11, IOException iOException, int i10) {
            if (!f.this.f49044t) {
                f.this.f49036l = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                f.this.f49037m = new RtspMediaSource.c(bVar.f48943b.f100436b.toString(), iOException);
            } else if (f.d(f.this) < 3) {
                return v0.f5385i;
            }
            return v0.f5387k;
        }

        @Override // af.o
        public g0 track(int i10, int i11) {
            return ((e) eh.a.g((e) f.this.f49030f.get(i10))).f49055c;
        }

        @Override // af.o
        public void d(d0 d0Var) {
        }

        @Override // ah.v0.b
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void r(com.google.android.exoplayer2.source.rtsp.b bVar, long j10, long j11, boolean z10) {
        }
    }

    @Override // zf.h0, zf.j1
    public void reevaluateBuffer(long j10) {
    }

    @Override // zf.h0
    public long b(long j10, a5 a5Var) {
        return j10;
    }
}
