package b5;

import java.util.Comparator;
import java.util.TreeSet;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class s implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet<j> f20757b = new TreeSet<>(new Comparator() { // from class: b5.r
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return s.f((j) obj, (j) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20758c;

    public s(long j10) {
        this.f20756a = j10;
    }

    public static int f(j jVar, j jVar2) {
        long j10 = jVar.f20695g;
        long j11 = jVar2.f20695g;
        if (j10 - j11 == 0) {
            return jVar.compareTo(jVar2);
        }
        return j10 < j11 ? -1 : 1;
    }

    @Override // b5.a.b
    public void a(a aVar, j jVar) {
        this.f20757b.remove(jVar);
        this.f20758c -= jVar.f20692d;
    }

    @Override // b5.a.b
    public void b(a aVar, j jVar, j jVar2) {
        a(aVar, jVar);
        d(aVar, jVar2);
    }

    @Override // b5.d
    public void c(a aVar, String str, long j10, long j11) {
        if (j11 != -1) {
            g(aVar, j11);
        }
    }

    @Override // b5.a.b
    public void d(a aVar, j jVar) {
        this.f20757b.add(jVar);
        this.f20758c += jVar.f20692d;
        g(aVar, 0L);
    }

    public final void g(a aVar, long j10) {
        while (this.f20758c + j10 > this.f20756a && !this.f20757b.isEmpty()) {
            aVar.f(this.f20757b.first());
        }
    }

    @Override // b5.d
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    @Override // b5.d
    public void onCacheInitialized() {
    }
}
