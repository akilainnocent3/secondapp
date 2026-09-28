package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f6l {
    public final float[] a;
    public final int[] b;

    public f6l(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(f6l f6lVar) {
        int i = 0;
        while (true) {
            int[] iArr = f6lVar.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = f6lVar.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final f6l b(float[] fArr) {
        int iC;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iC = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iC = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iC = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iC = fyj.c((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iC;
        }
        return new f6l(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f6l.class != obj.getClass()) {
            return false;
        }
        f6l f6lVar = (f6l) obj;
        return Arrays.equals(this.a, f6lVar.a) && Arrays.equals(this.b, f6lVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
