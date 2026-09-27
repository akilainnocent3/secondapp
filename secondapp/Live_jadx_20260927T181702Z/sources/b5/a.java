package b5;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;
import k.i1;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f20621a = -1;

    /* JADX INFO: renamed from: b5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0188a extends IOException {
        public C0188a(String str) {
            super(str);
        }

        public C0188a(Throwable th2) {
            super(th2);
        }

        public C0188a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(a aVar, j jVar);

        void b(a aVar, j jVar, j jVar2);

        void d(a aVar, j jVar);
    }

    @i1
    j a(String str, long j10, long j11) throws InterruptedException, C0188a;

    @i1
    void b(String str);

    long c(String str, long j10, long j11);

    @Nullable
    @i1
    j d(String str, long j10, long j11) throws C0188a;

    @i1
    void e(File file, long j10) throws C0188a;

    @i1
    void f(j jVar);

    @i1
    void g(String str, p pVar) throws C0188a;

    long getCacheSpace();

    long getCachedLength(String str, long j10, long j11);

    NavigableSet<j> getCachedSpans(String str);

    o getContentMetadata(String str);

    Set<String> getKeys();

    long getUid();

    NavigableSet<j> h(String str, b bVar);

    void i(String str, b bVar);

    boolean isCached(String str, long j10, long j11);

    void j(j jVar);

    @i1
    void release();

    @i1
    File startFile(String str, long j10, long j11) throws C0188a;
}
