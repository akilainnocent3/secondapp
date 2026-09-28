package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class uf {
    public byte[] a;
    public short[] b;
    public int[] c;
    public long[] d;
    public a e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("BYTE", 0);
            a = aVar;
            a aVar2 = new a("SHORT", 1);
            b = aVar2;
            a aVar3 = new a("INT", 2);
            c = aVar3;
            a aVar4 = new a("LONG", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public final void a(int i, long j) {
        int iOrdinal = this.e.ordinal();
        int i2 = 0;
        if (iOrdinal == 0) {
            byte[] bArr = this.a;
            long j2 = ((long) bArr[i]) + j;
            if (j2 <= 127) {
                bArr[i] = (byte) j2;
                return;
            }
            short[] sArr = new short[bArr.length];
            while (true) {
                byte[] bArr2 = this.a;
                if (i2 >= bArr2.length) {
                    this.e = a.b;
                    this.b = sArr;
                    this.a = null;
                    a(i, j);
                    return;
                }
                sArr[i2] = bArr2[i2];
                i2++;
            }
        } else if (iOrdinal == 1) {
            short[] sArr2 = this.b;
            long j3 = ((long) sArr2[i]) + j;
            if (j3 <= 32767) {
                sArr2[i] = (short) j3;
                return;
            }
            int[] iArr = new int[sArr2.length];
            while (true) {
                short[] sArr3 = this.b;
                if (i2 >= sArr3.length) {
                    this.e = a.c;
                    this.c = iArr;
                    this.b = null;
                    a(i, j);
                    return;
                }
                iArr[i2] = sArr3[i2];
                i2++;
            }
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return;
                }
                long[] jArr = this.d;
                jArr[i] = jArr[i] + j;
                return;
            }
            int[] iArr2 = this.c;
            long j4 = ((long) iArr2[i]) + j;
            if (j4 <= 2147483647L) {
                iArr2[i] = (int) j4;
                return;
            }
            long[] jArr2 = new long[iArr2.length];
            while (true) {
                int[] iArr3 = this.c;
                if (i2 >= iArr3.length) {
                    this.e = a.d;
                    this.d = jArr2;
                    this.c = null;
                    a(i, j);
                    return;
                }
                jArr2[i2] = iArr3[i2];
                i2++;
            }
        }
    }

    public final int b() {
        int iOrdinal = this.e.ordinal();
        if (iOrdinal == 0) {
            return this.a.length;
        }
        if (iOrdinal == 1) {
            return this.b.length;
        }
        if (iOrdinal == 2) {
            return this.c.length;
        }
        if (iOrdinal != 3) {
            return 0;
        }
        return this.d.length;
    }
}
