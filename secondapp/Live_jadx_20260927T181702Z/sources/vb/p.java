package vb;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class p<Z> implements v<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f140807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v<Z> f140808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f140809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tb.f f140810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f140811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f140812h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void c(tb.f fVar, p<?> pVar);
    }

    public p(v<Z> vVar, boolean z10, boolean z11, tb.f fVar, a aVar) {
        this.f140808d = (v) pc.m.e(vVar);
        this.f140806b = z10;
        this.f140807c = z11;
        this.f140810f = fVar;
        this.f140809e = (a) pc.m.e(aVar);
    }

    @Override // vb.v
    public synchronized void a() {
        if (this.f140811g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f140812h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f140812h = true;
        if (this.f140807c) {
            this.f140808d.a();
        }
    }

    @Override // vb.v
    @NonNull
    public Class<Z> b() {
        return this.f140808d.b();
    }

    public synchronized void c() {
        if (this.f140812h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f140811g++;
    }

    public v<Z> d() {
        return this.f140808d;
    }

    public boolean e() {
        return this.f140806b;
    }

    public void f() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f140811g;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f140811g = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f140809e.c(this.f140810f, this);
        }
    }

    @Override // vb.v
    @NonNull
    public Z get() {
        return this.f140808d.get();
    }

    @Override // vb.v
    public int getSize() {
        return this.f140808d.getSize();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f140806b + ", listener=" + this.f140809e + ", key=" + this.f140810f + ", acquired=" + this.f140811g + ", isRecycled=" + this.f140812h + ", resource=" + this.f140808d + fw.b.f85383j;
    }
}
