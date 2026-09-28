package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface d0b {

    public static final class a {
        public static final C0470a a = new C0470a();
        public static final e b = new e();
        public static final c c = new c();
        public static final d d = new d();
        public static final f e = new f();
        public static final uth f = new uth();
        public static final b g = new b();

        /* JADX INFO: renamed from: d0b$a$a, reason: collision with other inner class name */
        public static final class C0470a implements d0b {
            @Override // defpackage.d0b
            public final long a(long j, long j2) {
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i = yy60.a;
                return jFloatToRawIntBits;
            }
        }

        public static final class b implements d0b {
            @Override // defpackage.d0b
            public final long a(long j, long j2) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i = yy60.a;
                return jFloatToRawIntBits;
            }
        }

        public static final class c implements d0b {
            @Override // defpackage.d0b
            public final long a(long j, long j2) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i = yy60.a;
                return jFloatToRawIntBits;
            }
        }

        public static final class d implements d0b {
            @Override // defpackage.d0b
            public final long a(long j, long j2) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i = yy60.a;
                return jFloatToRawIntBits;
            }
        }

        public static final class e implements d0b {
            @Override // defpackage.d0b
            public final long a(long j, long j2) {
                float fD = ot1.d(j, j2);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
                int i = yy60.a;
                return jFloatToRawIntBits;
            }
        }

        public static final class f implements d0b {
            @Override // defpackage.d0b
            public final long a(long j, long j2) {
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i = yy60.a;
                    return jFloatToRawIntBits;
                }
                float fD = ot1.d(j, j2);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
                int i2 = yy60.a;
                return jFloatToRawIntBits2;
            }
        }
    }

    long a(long j, long j2);
}
