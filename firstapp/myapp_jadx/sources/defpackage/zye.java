package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zye extends vv20<double[]> {
    public double[] a;
    public int b;

    @Override // defpackage.vv20
    public final double[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vv20
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // defpackage.vv20
    public final int d() {
        return this.b;
    }
}
