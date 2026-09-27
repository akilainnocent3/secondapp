package c7;

import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface s {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22542a = new C0212a();

        /* JADX INFO: renamed from: c7.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C0212a implements a {
            @Override // c7.s.a
            public boolean a(androidx.media3.common.a aVar) {
                return false;
            }

            @Override // c7.s.a
            public int b(androidx.media3.common.a aVar) {
                return 1;
            }

            @Override // c7.s.a
            public s c(androidx.media3.common.a aVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        boolean a(androidx.media3.common.a aVar);

        int b(androidx.media3.common.a aVar);

        s c(androidx.media3.common.a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f22543c = new b(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f22544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22545b;

        public b(long j10, boolean z10) {
            this.f22544a = j10;
            this.f22545b = z10;
        }

        public static b b() {
            return f22543c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }

        public static b d(long j10) {
            return new b(j10, false);
        }
    }

    void a(byte[] bArr, b bVar, x4.q<d> qVar);

    int b();

    j c(byte[] bArr, int i10, int i11);

    void d(byte[] bArr, int i10, int i11, b bVar, x4.q<d> qVar);

    void reset();
}
