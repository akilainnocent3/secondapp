package dh;

import ah.v;
import android.os.Handler;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class c implements dh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dh.b f79215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f79217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ah.f.a.C0018a f79218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final eh.h f79219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f79221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f79222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f79223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f79224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f79225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f79226m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f79229c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public dh.b f79227a = new l();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public eh.h f79230d = eh.h.f80967a;

        public c e() {
            return new c(this);
        }

        @qj.a
        public b f(dh.b bVar) {
            eh.a.g(bVar);
            this.f79227a = bVar;
            return this;
        }

        @h1
        @qj.a
        public b g(eh.h hVar) {
            this.f79230d = hVar;
            return this;
        }

        @qj.a
        public b h(long j10) {
            eh.a.a(j10 >= 0);
            this.f79229c = j10;
            return this;
        }

        @qj.a
        public b i(int i10) {
            eh.a.a(i10 >= 0);
            this.f79228b = i10;
            return this;
        }
    }

    @Override // dh.a
    public long a() {
        return this.f79223j;
    }

    @Override // dh.a
    public void b(Handler handler, ah.f.a aVar) {
        this.f79218e.b(handler, aVar);
    }

    @Override // dh.a
    public void c(ah.f.a aVar) {
        this.f79218e.d(aVar);
    }

    @Override // dh.a
    public void d(long j10) {
        long jElapsedRealtime = this.f79219f.elapsedRealtime();
        i(this.f79220g > 0 ? (int) (jElapsedRealtime - this.f79221h) : 0, this.f79222i, j10);
        this.f79215b.reset();
        this.f79223j = Long.MIN_VALUE;
        this.f79221h = jElapsedRealtime;
        this.f79222i = 0L;
        this.f79225l = 0;
        this.f79226m = 0L;
    }

    @Override // dh.a
    public void e(v vVar, int i10) {
        long j10 = i10;
        this.f79222i += j10;
        this.f79226m += j10;
    }

    @Override // dh.a
    public void f(v vVar) {
        if (this.f79220g == 0) {
            this.f79221h = this.f79219f.elapsedRealtime();
        }
        this.f79220g++;
    }

    @Override // dh.a
    public void h(v vVar) {
        eh.a.i(this.f79220g > 0);
        int i10 = this.f79220g - 1;
        this.f79220g = i10;
        if (i10 <= 0) {
            long jElapsedRealtime = (int) (this.f79219f.elapsedRealtime() - this.f79221h);
            if (jElapsedRealtime > 0) {
                this.f79215b.b(this.f79222i, 1000 * jElapsedRealtime);
                int i11 = this.f79225l + 1;
                this.f79225l = i11;
                if (i11 > this.f79216c && this.f79226m > this.f79217d) {
                    this.f79223j = this.f79215b.a();
                }
                i((int) jElapsedRealtime, this.f79222i, this.f79223j);
                this.f79222i = 0L;
            }
        }
    }

    public final void i(int i10, long j10, long j11) {
        if (j11 != Long.MIN_VALUE) {
            if (i10 == 0 && j10 == 0 && j11 == this.f79224k) {
                return;
            }
            this.f79224k = j11;
            this.f79218e.c(i10, j10, j11);
        }
    }

    public c(b bVar) {
        this.f79215b = bVar.f79227a;
        this.f79216c = bVar.f79228b;
        this.f79217d = bVar.f79229c;
        this.f79219f = bVar.f79230d;
        this.f79218e = new ah.f.a.C0018a();
        this.f79223j = Long.MIN_VALUE;
        this.f79224k = Long.MIN_VALUE;
    }

    @Override // dh.a
    public void g(v vVar) {
    }
}
