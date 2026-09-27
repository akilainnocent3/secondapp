package dh;

import ah.v;
import android.os.Handler;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class m implements dh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dh.b f79301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f79303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final eh.h f79304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ah.f.a.C0018a f79305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f79307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f79308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f79309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f79310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f79311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f79312m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f79315c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public dh.b f79313a = new l();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public eh.h f79316d = eh.h.f80967a;

        public m e() {
            return new m(this);
        }

        @qj.a
        public b f(dh.b bVar) {
            eh.a.g(bVar);
            this.f79313a = bVar;
            return this;
        }

        @h1
        @qj.a
        public b g(eh.h hVar) {
            this.f79316d = hVar;
            return this;
        }

        @qj.a
        public b h(long j10) {
            eh.a.a(j10 >= 0);
            this.f79315c = j10;
            return this;
        }

        @qj.a
        public b i(int i10) {
            eh.a.a(i10 >= 0);
            this.f79314b = i10;
            return this;
        }
    }

    private void i(int i10, long j10, long j11) {
        if (j11 != Long.MIN_VALUE) {
            if (i10 == 0 && j10 == 0 && j11 == this.f79310k) {
                return;
            }
            this.f79310k = j11;
            this.f79305f.c(i10, j10, j11);
        }
    }

    @Override // dh.a
    public long a() {
        return this.f79309j;
    }

    @Override // dh.a
    public void b(Handler handler, ah.f.a aVar) {
        this.f79305f.b(handler, aVar);
    }

    @Override // dh.a
    public void c(ah.f.a aVar) {
        this.f79305f.d(aVar);
    }

    @Override // dh.a
    public void d(long j10) {
        long jElapsedRealtime = this.f79304e.elapsedRealtime();
        i(this.f79306g > 0 ? (int) (jElapsedRealtime - this.f79307h) : 0, this.f79308i, j10);
        this.f79301b.reset();
        this.f79309j = Long.MIN_VALUE;
        this.f79307h = jElapsedRealtime;
        this.f79308i = 0L;
        this.f79311l = 0;
        this.f79312m = 0L;
    }

    @Override // dh.a
    public void e(v vVar, int i10) {
        long j10 = i10;
        this.f79308i += j10;
        this.f79312m += j10;
    }

    @Override // dh.a
    public void f(v vVar) {
        if (this.f79306g == 0) {
            this.f79307h = this.f79304e.elapsedRealtime();
        }
        this.f79306g++;
    }

    @Override // dh.a
    public void h(v vVar) {
        eh.a.i(this.f79306g > 0);
        long jElapsedRealtime = this.f79304e.elapsedRealtime();
        long j10 = (int) (jElapsedRealtime - this.f79307h);
        if (j10 > 0) {
            this.f79301b.b(this.f79308i, 1000 * j10);
            int i10 = this.f79311l + 1;
            this.f79311l = i10;
            if (i10 > this.f79302c && this.f79312m > this.f79303d) {
                this.f79309j = this.f79301b.a();
            }
            i((int) j10, this.f79308i, this.f79309j);
            this.f79307h = jElapsedRealtime;
            this.f79308i = 0L;
        }
        this.f79306g--;
    }

    public m(b bVar) {
        this.f79301b = bVar.f79313a;
        this.f79302c = bVar.f79314b;
        this.f79303d = bVar.f79315c;
        this.f79304e = bVar.f79316d;
        this.f79305f = new ah.f.a.C0018a();
        this.f79309j = Long.MIN_VALUE;
        this.f79310k = Long.MIN_VALUE;
    }

    @Override // dh.a
    public void g(v vVar) {
    }
}
