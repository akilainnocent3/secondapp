package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k6n implements zpc {
    public final zpc a;
    public final int b;
    public final q430.a c;
    public final byte[] d;
    public int e;

    public k6n(zpc zpcVar, int i, q430.a aVar) {
        ly0.b(i > 0);
        this.a = zpcVar;
        this.b = i;
        this.c = aVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.zpc
    public final long a(gqc gqcVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.zpc
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.zpc
    public final Map<String, List<String>> d() {
        return this.a.d();
    }

    @Override // defpackage.zpc
    public final void g(mrg0 mrg0Var) {
        mrg0Var.getClass();
        this.a.g(mrg0Var);
    }

    @Override // defpackage.zpc
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.tpc
    public final int read(byte[] bArr, int i, int i2) {
        long jMax;
        int i3 = this.e;
        zpc zpcVar = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (zpcVar.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = zpcVar.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        nsz nszVar = new nsz(i5, bArr3);
                        q430.a aVar = this.c;
                        if (aVar.l) {
                            q430 q430Var = q430.this;
                            Map<String, String> map = q430.e0;
                            jMax = Math.max(q430Var.y(true), aVar.i);
                        } else {
                            jMax = aVar.i;
                        }
                        long j = jMax;
                        int iA = nszVar.a();
                        njg0 njg0Var = aVar.k;
                        njg0Var.getClass();
                        njg0Var.f(iA, nszVar);
                        njg0Var.a(j, 1, iA, 0, null);
                        aVar.l = true;
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int i8 = zpcVar.read(bArr, i, Math.min(i3, i2));
        if (i8 != -1) {
            this.e -= i8;
        }
        return i8;
    }
}
