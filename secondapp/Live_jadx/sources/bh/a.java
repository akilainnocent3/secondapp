package bh;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;
import k.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f21318a = -1;

    /* JADX INFO: renamed from: bh.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0193a extends IOException {
        public C0193a(String str) {
            super(str);
        }

        public C0193a(Throwable th2) {
            super(th2);
        }

        public C0193a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void onSpanAdded(a aVar, j jVar);

        void onSpanRemoved(a aVar, j jVar);

        void onSpanTouched(a aVar, j jVar, j jVar2);
    }

    @i1
    j a(String str, long j10, long j11) throws InterruptedException, C0193a;

    @i1
    void b(String str);

    long c(String str, long j10, long j11);

    @Nullable
    @i1
    j d(String str, long j10, long j11) throws C0193a;

    @i1
    void e(File file, long j10) throws C0193a;

    NavigableSet<j> f(String str, b bVar);

    void g(j jVar);

    long getCacheSpace();

    long getCachedLength(String str, long j10, long j11);

    NavigableSet<j> getCachedSpans(String str);

    o getContentMetadata(String str);

    Set<String> getKeys();

    long getUid();

    @i1
    void h(String str, p pVar) throws C0193a;

    @i1
    void i(j jVar);

    boolean isCached(String str, long j10, long j11);

    void j(String str, b bVar);

    @i1
    void release();

    @i1
    File startFile(String str, long j10, long j11) throws C0193a;
}
