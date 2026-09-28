package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class kb30 implements jb30.d {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ int[] b;

    public kb30(byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }

    @Override // jb30.d
    public final void a(jb30.c cVar, int i) throws IOException {
        int[] iArr = this.b;
        try {
            cVar.read(this.a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            cVar.close();
        }
    }
}
