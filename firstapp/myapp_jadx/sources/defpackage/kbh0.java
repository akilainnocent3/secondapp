package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class kbh0 extends vv20<jbh0> {
    public int[] a;
    public int b;

    @Override // defpackage.vv20
    public final jbh0 a() {
        return new jbh0(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.vv20
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.vv20
    public final int d() {
        return this.b;
    }
}
