package v4;

import java.nio.ByteBuffer;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f140138a = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f140139b = 1.0f;

    public static boolean a(x.a aVar) {
        if (aVar.f140148a == -1 || aVar.f140149b == -1) {
            return false;
        }
        int i10 = aVar.f140150c;
        return i10 == 2 || i10 == 4;
    }

    public static boolean b(x.a aVar, x.a aVar2) {
        return aVar.f140148a == aVar2.f140148a && a(aVar) && a(aVar2);
    }

    public static float c(float f10) {
        return b2.w(f10 * (f10 < 0.0f ? 32768 : 32767), -32768.0f, 32767.0f);
    }

    public static float d(ByteBuffer byteBuffer, boolean z10, boolean z11) {
        if (z11) {
            return z10 ? byteBuffer.getShort() : c(byteBuffer.getFloat());
        }
        return z10 ? e(byteBuffer.getShort()) : byteBuffer.getFloat();
    }

    public static float e(short s10) {
        return s10 / (s10 < 0 ? 32768 : 32767);
    }

    public static ByteBuffer f(ByteBuffer byteBuffer, x.a aVar, ByteBuffer byteBuffer2, x.a aVar2, b0 b0Var, int i10, boolean z10, boolean z11) {
        boolean z12 = aVar.f140150c == 2;
        boolean z13 = aVar2.f140150c == 2;
        int iH = b0Var.h();
        int iJ = b0Var.j();
        float[] fArr = new float[iH];
        float[] fArr2 = new float[iJ];
        for (int i11 = 0; i11 < i10; i11++) {
            if (z10) {
                int iPosition = byteBuffer2.position();
                for (int i12 = 0; i12 < iJ; i12++) {
                    fArr2[i12] = d(byteBuffer2, z13, z13);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i13 = 0; i13 < iH; i13++) {
                fArr[i13] = d(byteBuffer, z12, z13);
            }
            for (int i14 = 0; i14 < iJ; i14++) {
                for (int i15 = 0; i15 < iH; i15++) {
                    fArr2[i14] = fArr2[i14] + (fArr[i15] * b0Var.i(i15, i14));
                }
                if (z13) {
                    byteBuffer2.putShort((short) b2.w(fArr2[i14], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(z11 ? b2.w(fArr2[i14], -1.0f, 1.0f) : fArr2[i14]);
                }
                fArr2[i14] = 0.0f;
            }
        }
        return byteBuffer2;
    }
}
