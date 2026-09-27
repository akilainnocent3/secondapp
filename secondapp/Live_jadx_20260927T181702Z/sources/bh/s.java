package bh;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class s implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet<j> f21454b = new TreeSet<>(new Comparator() { // from class: bh.r
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return s.b((j) obj, (j) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f21455c;

    public s(long j10) {
        this.f21453a = j10;
    }

    public static int b(j jVar, j jVar2) {
        long j10 = jVar.f21392g;
        long j11 = jVar2.f21392g;
        if (j10 - j11 == 0) {
            return jVar.compareTo(jVar2);
        }
        return j10 < j11 ? -1 : 1;
    }

    public final void c(a aVar, long j10) {
        while (this.f21455c + j10 > this.f21453a && !this.f21454b.isEmpty()) {
            aVar.i(this.f21454b.first());
        }
    }

    @Override // bh.a.b
    public void onSpanAdded(a aVar, j jVar) {
        this.f21454b.add(jVar);
        this.f21455c += jVar.f21389d;
        c(aVar, 0L);
    }

    @Override // bh.a.b
    public void onSpanRemoved(a aVar, j jVar) {
        this.f21454b.remove(jVar);
        this.f21455c -= jVar.f21389d;
    }

    @Override // bh.a.b
    public void onSpanTouched(a aVar, j jVar, j jVar2) {
        onSpanRemoved(aVar, jVar);
        onSpanAdded(aVar, jVar2);
    }

    @Override // bh.d
    public void onStartFile(a aVar, String str, long j10, long j11) {
        if (j11 != -1) {
            c(aVar, j11);
        }
    }

    @Override // bh.d
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    @Override // bh.d
    public void onCacheInitialized() {
    }
}
