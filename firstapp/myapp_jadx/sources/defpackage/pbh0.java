package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class pbh0 extends vv20<obh0> {
    public long[] a;
    public int b;

    @Override // defpackage.vv20
    public final obh0 a() {
        return new obh0(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.vv20
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.vv20
    public final int d() {
        return this.b;
    }
}
