package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class smn {
    public final int[] a;
    public final int b;

    public smn(int i, byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = cw6.c(bArr);
        this.b = i;
    }

    public final ByteBuffer a(int i, byte[] bArr) {
        int[] iArrB = b(cw6.c(bArr), i);
        int[] iArr = (int[]) iArrB.clone();
        cw6.b(iArr);
        for (int i2 = 0; i2 < iArrB.length; i2++) {
            iArrB[i2] = iArrB[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] b(int[] iArr, int i);

    public abstract int c();

    public final void d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != c()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + c());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferA = a(this.b + i3, bArr);
            if (i3 == i) {
                tl5.c(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                tl5.c(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }
}
