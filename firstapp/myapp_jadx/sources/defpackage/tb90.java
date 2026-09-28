package defpackage;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public interface tb90 {
    a a(int i);

    int b(int i);

    int c(int i);

    int d();

    a e();

    int f();

    a g(int i, int i2);

    int getLength();

    public static class a implements tb90 {
        public final Random a;
        public final int[] b;
        public final int[] c;

        public a(int[] iArr, Random random) {
            this.b = iArr;
            this.a = random;
            this.c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.c[iArr[i]] = i;
            }
        }

        @Override // defpackage.tb90
        public final a a(int i) {
            int[] iArr = this.b;
            int[] iArr2 = new int[iArr.length - i];
            int i2 = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int i4 = iArr[i3];
                if (i4 < 0 || i4 >= i) {
                    int i5 = i3 - i2;
                    if (i4 >= 0) {
                        i4 -= i;
                    }
                    iArr2[i5] = i4;
                } else {
                    i2++;
                }
            }
            return new a(iArr2, new Random(this.a.nextLong()));
        }

        @Override // defpackage.tb90
        public final int b(int i) {
            int i2 = this.c[i] - 1;
            if (i2 >= 0) {
                return this.b[i2];
            }
            return -1;
        }

        @Override // defpackage.tb90
        public final int c(int i) {
            int i2 = this.c[i] + 1;
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // defpackage.tb90
        public final int d() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // defpackage.tb90
        public final a e() {
            return new a(new Random(this.a.nextLong()));
        }

        @Override // defpackage.tb90
        public final int f() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // defpackage.tb90
        public final a g(int i, int i2) {
            int[] iArr;
            Random random;
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            int i3 = 0;
            while (true) {
                iArr = this.b;
                random = this.a;
                if (i3 >= i2) {
                    break;
                }
                iArr2[i3] = random.nextInt(iArr.length + 1);
                int i4 = i3 + 1;
                int iNextInt = random.nextInt(i4);
                iArr3[i3] = iArr3[iNextInt];
                iArr3[iNextInt] = i3 + i;
                i3 = i4;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i2];
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < iArr.length + i2; i7++) {
                if (i5 >= i2 || i6 != iArr2[i5]) {
                    int i8 = i6 + 1;
                    int i9 = iArr[i6];
                    iArr4[i7] = i9;
                    if (i9 >= i) {
                        iArr4[i7] = i9 + i2;
                    }
                    i6 = i8;
                } else {
                    iArr4[i7] = iArr3[i5];
                    i5++;
                }
            }
            return new a(iArr4, new Random(random.nextLong()));
        }

        @Override // defpackage.tb90
        public final int getLength() {
            return this.b.length;
        }

        public a() {
            this(new Random());
        }

        public a(Random random) {
            this(new int[0], random);
        }
    }
}
