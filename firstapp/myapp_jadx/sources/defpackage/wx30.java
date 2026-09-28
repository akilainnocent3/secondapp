package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class wx30 extends Random {
    public long a;
    public long b;

    @Override // java.util.Random
    public final int next(int i) {
        return (int) (((1 << i) - 1) & nextLong());
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return (nextLong() & 1) != 0;
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        int length = bArr.length;
        while (length != 0) {
            int i = length < 8 ? length : 8;
            long jNextLong = nextLong();
            while (true) {
                int i2 = i - 1;
                if (i != 0) {
                    length--;
                    bArr[length] = (byte) jNextLong;
                    jNextLong >>= 8;
                    i = i2;
                }
            }
        }
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (nextLong() >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (float) ((nextLong() >>> 40) * 5.960464477539063E-8d);
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        return (int) nextLong(i);
    }

    public final long nextLong(long j) {
        long jNextLong;
        long j2;
        if (j <= 0) {
            hb5.a("n must be positive");
            return 0L;
        }
        do {
            jNextLong = nextLong() >>> 1;
            j2 = jNextLong % j;
        } while ((j - 1) + (jNextLong - j2) < 0);
        return j2;
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (j == 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        long j4 = j3 ^ (j3 >>> 33);
        long j5 = ((j4 >>> 33) ^ j4) * (-49064778989728563L);
        long j6 = ((j5 >>> 33) ^ j5) * (-4265267296055464877L);
        this.a = j4;
        this.b = j6 ^ (j6 >>> 33);
    }

    @Override // java.util.Random
    public final int nextInt() {
        return (int) nextLong();
    }

    @Override // java.util.Random
    public final long nextLong() {
        long j = this.a;
        long j2 = this.b;
        this.a = j2;
        long j3 = j ^ (j << 23);
        long j4 = ((j3 >>> 17) ^ (j3 ^ j2)) ^ (j2 >>> 26);
        this.b = j4;
        return j4 + j2;
    }
}
