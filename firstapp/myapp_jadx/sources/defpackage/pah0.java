package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class pah0 extends vv20<oah0> {
    public byte[] a;
    public int b;

    @Override // defpackage.vv20
    public final oah0 a() {
        return new oah0(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.vv20
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.vv20
    public final int d() {
        return this.b;
    }
}
