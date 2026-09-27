package bb;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f21023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21024b;

    public d(float[] fArr, int[] iArr) {
        this.f21023a = fArr;
        this.f21024b = iArr;
    }

    public final void a(d dVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = dVar.f21024b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f21023a[i10] = dVar.f21023a[i10];
            this.f21024b[i10] = iArr[i10];
            i10++;
        }
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = c(fArr[i10]);
        }
        return new d(fArr, iArr);
    }

    public final int c(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.f21023a, f10);
        if (iBinarySearch >= 0) {
            return this.f21024b[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.f21024b[0];
        }
        int[] iArr = this.f21024b;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f21023a;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return gb.e.c((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }

    public int[] d() {
        return this.f21024b;
    }

    public float[] e() {
        return this.f21023a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Arrays.equals(this.f21023a, dVar.f21023a) && Arrays.equals(this.f21024b, dVar.f21024b)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f21024b.length;
    }

    public void g(d dVar, d dVar2, float f10) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f10 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f10 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.f21024b.length != dVar2.f21024b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f21024b.length + " vs " + dVar2.f21024b.length + gi.j.f86771d);
        }
        int i10 = 0;
        while (true) {
            iArr = dVar.f21024b;
            if (i10 >= iArr.length) {
                break;
            }
            this.f21023a[i10] = gb.l.k(dVar.f21023a[i10], dVar2.f21023a[i10], f10);
            this.f21024b[i10] = gb.e.c(f10, dVar.f21024b[i10], dVar2.f21024b[i10]);
            i10++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f21023a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = dVar.f21024b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f21024b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f21023a) * 31) + Arrays.hashCode(this.f21024b);
    }
}
