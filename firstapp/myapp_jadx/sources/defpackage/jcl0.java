package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class jcl0 extends eal0 {
    public final byte[] c;

    public jcl0(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.c = bArr;
    }

    @Override // defpackage.eal0
    public final byte[] d() {
        return this.c;
    }
}
