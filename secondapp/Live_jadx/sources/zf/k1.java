package zf;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface k1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Random f161277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f161278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f161279c;

        public a(int i10) {
            this(i10, new Random());
        }

        public static int[] b(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr[i11] = iArr[iNextInt];
                iArr[iNextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // zf.k1
        public k1 a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f161278b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f161278b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f161277a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // zf.k1
        public k1 cloneAndClear() {
            return new a(0, new Random(this.f161277a.nextLong()));
        }

        @Override // zf.k1
        public k1 cloneAndInsert(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f161277a.nextInt(this.f161278b.length + 1);
                int i14 = i13 + 1;
                int iNextInt = this.f161277a.nextInt(i14);
                iArr2[i13] = iArr2[iNextInt];
                iArr2[iNextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f161278b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f161278b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f161277a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // zf.k1
        public int getFirstIndex() {
            int[] iArr = this.f161278b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // zf.k1
        public int getLastIndex() {
            int[] iArr = this.f161278b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // zf.k1
        public int getLength() {
            return this.f161278b.length;
        }

        @Override // zf.k1
        public int getNextIndex(int i10) {
            int i11 = this.f161279c[i10] + 1;
            int[] iArr = this.f161278b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // zf.k1
        public int getPreviousIndex(int i10) {
            int i11 = this.f161279c[i10] - 1;
            if (i11 >= 0) {
                return this.f161278b[i11];
            }
            return -1;
        }

        public a(int i10, long j10) {
            this(i10, new Random(j10));
        }

        public a(int[] iArr, long j10) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j10));
        }

        public a(int i10, Random random) {
            this(b(i10, random), random);
        }

        public a(int[] iArr, Random random) {
            this.f161278b = iArr;
            this.f161277a = random;
            this.f161279c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f161279c[iArr[i10]] = i10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f161280a;

        public b(int i10) {
            this.f161280a = i10;
        }

        @Override // zf.k1
        public k1 a(int i10, int i11) {
            return new b((this.f161280a - i11) + i10);
        }

        @Override // zf.k1
        public k1 cloneAndClear() {
            return new b(0);
        }

        @Override // zf.k1
        public k1 cloneAndInsert(int i10, int i11) {
            return new b(this.f161280a + i11);
        }

        @Override // zf.k1
        public int getFirstIndex() {
            return this.f161280a > 0 ? 0 : -1;
        }

        @Override // zf.k1
        public int getLastIndex() {
            int i10 = this.f161280a;
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }

        @Override // zf.k1
        public int getLength() {
            return this.f161280a;
        }

        @Override // zf.k1
        public int getNextIndex(int i10) {
            int i11 = i10 + 1;
            if (i11 < this.f161280a) {
                return i11;
            }
            return -1;
        }

        @Override // zf.k1
        public int getPreviousIndex(int i10) {
            int i11 = i10 - 1;
            if (i11 >= 0) {
                return i11;
            }
            return -1;
        }
    }

    k1 a(int i10, int i11);

    k1 cloneAndClear();

    k1 cloneAndInsert(int i10, int i11);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i10);

    int getPreviousIndex(int i10);
}
