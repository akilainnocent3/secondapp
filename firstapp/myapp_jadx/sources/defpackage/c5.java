package defpackage;

import java.io.IOException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c5 implements o9e0 {
    public final s9h a = new s9h();

    @Override // defpackage.o9e0
    public final void a(s08.b bVar, String str, int i) throws IOException {
        if (str.length() == i) {
            ygh0 ygh0Var = (ygh0) this;
            Unsafe unsafe = ygh0.a.a;
            if (unsafe.getByte(str, ygh0Var.c) == 0) {
                byte[] bArr = (byte[]) unsafe.getObject(str, ygh0Var.b);
                bVar.f(bArr.length, bArr);
                return;
            }
        }
        this.a.a(bVar, str, i);
    }

    @Override // defpackage.o9e0
    public final int b(String str) {
        ygh0 ygh0Var = (ygh0) this;
        Unsafe unsafe = ygh0.a.a;
        if (unsafe.getByte(str, ygh0Var.c) != 0) {
            return this.a.b(str);
        }
        byte[] bArr = (byte[]) unsafe.getObject(str, ygh0Var.b);
        int length = str.length();
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 1; i <= (bArr.length / 2040) + i4; i4 = 1) {
            int iMin = Math.min(i * 2040, bArr.length & (-8));
            long j = 0;
            while (i2 < iMin) {
                j += (ygh0.a.a.getLong(bArr, ygh0Var.d + ((long) i2)) & (-9187201950435737472L)) >>> 7;
                i2 += 8;
            }
            if (j != 0) {
                for (int i5 = 0; i5 < 8; i5++) {
                    i3 += (int) (255 & j);
                    j >>>= 8;
                }
            }
            i++;
        }
        while (i2 < bArr.length) {
            i3 += bArr[i2] >>> 31;
            i2++;
        }
        return length + i3;
    }
}
