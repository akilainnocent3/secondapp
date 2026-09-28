package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class ybh0 extends vv20<xbh0> {
    public short[] a;
    public int b;

    @Override // defpackage.vv20
    public final xbh0 a() {
        return new xbh0(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.vv20
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.vv20
    public final int d() {
        return this.b;
    }
}
