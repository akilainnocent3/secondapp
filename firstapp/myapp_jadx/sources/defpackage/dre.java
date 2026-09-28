package defpackage;

import androidx.media3.common.a;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class dre implements njg0 {
    public final byte[] a = new byte[4096];

    @Override // defpackage.njg0
    public final void b(nsz nszVar, int i, int i2) {
        nszVar.J(i);
    }

    @Override // defpackage.njg0
    public final int e(tpc tpcVar, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = tpcVar.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.njg0
    public final void d(a aVar) {
    }

    @Override // defpackage.njg0
    public final void a(long j, int i, int i2, int i3, njg0.a aVar) {
    }
}
