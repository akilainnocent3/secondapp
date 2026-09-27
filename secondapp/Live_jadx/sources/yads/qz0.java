package yads;

import android.opengl.GLES20;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154678a;

    public qz0(String str) {
        this.f154678a = str;
    }

    public static qz0 a(int i10, int i11) {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i10, 35719, iArr, 0);
        int i12 = iArr[0];
        byte[] bArr = new byte[i12];
        GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13] == 0) {
                i12 = i13;
                break;
            }
        }
        String str = new String(bArr, 0, i12);
        GLES20.glGetUniformLocation(i10, str);
        return new qz0(str);
    }
}
