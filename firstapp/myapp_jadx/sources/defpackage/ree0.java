package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface ree0 {

    public interface a {
        public static final C1050a a = new C1050a();

        /* JADX INFO: renamed from: ree0$a$a, reason: collision with other inner class name */
        public class C1050a implements a {
            @Override // ree0.a
            public final boolean d(androidx.media3.common.a aVar) {
                return false;
            }

            @Override // ree0.a
            public final int e(androidx.media3.common.a aVar) {
                return 1;
            }

            @Override // ree0.a
            public final ree0 f(androidx.media3.common.a aVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        boolean d(androidx.media3.common.a aVar);

        int e(androidx.media3.common.a aVar);

        ree0 f(androidx.media3.common.a aVar);
    }

    public static class b {
        public static final b c = new b(-9223372036854775807L, false);
        public final long a;
        public final boolean b;

        public b(long j, boolean z) {
            this.a = j;
            this.b = z;
        }
    }

    void a(byte[] bArr, int i, int i2, b bVar, oya<q4c> oyaVar);

    default jee0 b(byte[] bArr, int i, int i2) {
        pcn.b bVar = pcn.b;
        final pcn.a aVar = new pcn.a();
        a(bArr, 0, i2, b.c, new oya() { // from class: qee0
            @Override // defpackage.oya
            public final void accept(Object obj) {
                aVar.c((q4c) obj);
            }
        });
        return new s4c(aVar.g());
    }

    default void reset() {
    }
}
