package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class sk5 extends vv20<byte[]> {
    public byte[] a;
    public int b;

    @Override // defpackage.vv20
    public final byte[] a() {
        return Arrays.copyOf(this.a, this.b);
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
