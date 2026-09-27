package yads;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kq {
    public static Bitmap a(Bitmap bitmap, double d10) {
        int i10;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, is.d.K0(((double) bitmap.getWidth()) * d10), is.d.K0(((double) bitmap.getHeight()) * d10), false);
        int i11 = 1;
        Bitmap bitmapCopy = bitmapCreateScaledBitmap.copy(bitmapCreateScaledBitmap.getConfig(), true);
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i12 = width * height;
        int[] iArr = new int[i12];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i13 = width - 1;
        int i14 = height - 1;
        int[] iArr2 = new int[i12];
        int[] iArr3 = new int[i12];
        int[] iArr4 = new int[i12];
        int[] iArr5 = new int[ms.u.u(width, height)];
        int[] iArr6 = new int[1024];
        for (int i15 = 0; i15 < 1024; i15++) {
            iArr6[i15] = i15 / 4;
        }
        char c10 = 3;
        int[][] iArr7 = new int[3][];
        for (int i16 = 0; i16 < 3; i16++) {
            iArr7[i16] = new int[3];
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < height) {
            char c11 = c10;
            int i20 = -1;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i20 <= i11) {
                int[] iArr8 = iArr4;
                int i30 = i11;
                int i31 = iArr[ms.u.B(i13, ms.u.u(i20, 0)) + i18];
                int i32 = i20 + 1;
                int[] iArr9 = iArr7[i32];
                iArr9[0] = (i31 & 16711680) >> 16;
                iArr9[i30] = (i31 & 65280) >> 8;
                iArr9[2] = i31 & 255;
                int iAbs = 2 - StrictMath.abs(i20);
                int i33 = iArr9[0];
                i21 = (i33 * iAbs) + i21;
                int i34 = iArr9[i30];
                i22 = (i34 * iAbs) + i22;
                int i35 = iArr9[2];
                i23 = (iAbs * i35) + i23;
                if (i20 > 0) {
                    i29 += i33;
                    i28 += i34;
                    i27 += i35;
                } else {
                    i26 += i33;
                    i25 += i34;
                    i24 += i35;
                }
                i11 = i30;
                iArr4 = iArr8;
                i20 = i32;
            }
            int[] iArr10 = iArr4;
            int i36 = i11;
            int i37 = 0;
            while (i37 < width) {
                iArr2[i18] = iArr6[i21];
                iArr3[i18] = iArr6[i22];
                iArr10[i18] = iArr6[i23];
                int i38 = i21 - i26;
                int i39 = i22 - i25;
                int i40 = i23 - i24;
                int[] iArr11 = iArr7[(i11 + 2) % 3];
                int i41 = i26 - iArr11[0];
                int i42 = i25 - iArr11[i36];
                int i43 = i24 - iArr11[2];
                if (i17 == 0) {
                    i10 = i37;
                    iArr5[i10] = Math.min(i10 + 2, i13);
                } else {
                    i10 = i37;
                }
                int i44 = iArr[i19 + iArr5[i10]];
                int i45 = (i44 & 16711680) >> 16;
                iArr11[0] = i45;
                int i46 = (i44 & 65280) >> 8;
                iArr11[i36] = i46;
                int i47 = i44 & 255;
                iArr11[2] = i47;
                int i48 = i29 + i45;
                int i49 = i28 + i46;
                int i50 = i27 + i47;
                i21 = i38 + i48;
                i22 = i39 + i49;
                i23 = i40 + i50;
                i11 = (i11 + 1) % 3;
                int[] iArr12 = iArr7[i11 % 3];
                int i51 = iArr12[0];
                i26 = i41 + i51;
                int i52 = iArr12[i36];
                i25 = i42 + i52;
                int i53 = iArr12[2];
                i24 = i43 + i53;
                i29 = i48 - i51;
                i28 = i49 - i52;
                i27 = i50 - i53;
                i18++;
                i37 = i10 + 1;
            }
            i19 += width;
            i17++;
            c10 = c11;
            i11 = i36;
            iArr4 = iArr10;
        }
        int[] iArr13 = iArr4;
        int i54 = i11;
        int i55 = 0;
        while (i55 < width) {
            int i56 = width * (-1);
            int i57 = -1;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            for (int i67 = i54; i57 <= i67; i67 = 1) {
                int iMax = Math.max(0, i56) + i55;
                int i68 = i57 + 1;
                int[] iArr14 = iArr7[i68];
                iArr14[0] = iArr2[iMax];
                iArr14[i67] = iArr3[iMax];
                iArr14[2] = iArr13[iMax];
                int iAbs2 = 2 - StrictMath.abs(i57);
                i64 = (iArr2[iMax] * iAbs2) + i64;
                i65 = (iArr3[iMax] * iAbs2) + i65;
                i66 = (iArr13[iMax] * iAbs2) + i66;
                if (i57 > 0) {
                    i63 += iArr14[0];
                    i62 += iArr14[1];
                    i61 += iArr14[2];
                } else {
                    i60 += iArr14[0];
                    i59 += iArr14[1];
                    i58 += iArr14[2];
                }
                if (i57 < i14) {
                    i56 += width;
                }
                i57 = i68;
            }
            int i69 = i64;
            int i70 = i65;
            int i71 = 1;
            int i72 = i55;
            int i73 = i63;
            int i74 = i62;
            int i75 = i61;
            int i76 = i60;
            int i77 = i59;
            int i78 = i58;
            for (int i79 = 0; i79 < height; i79++) {
                iArr[i72] = (iArr[i72] & (-16777216)) | (iArr6[i69] << 16) | (iArr6[i70] << 8) | iArr6[i66];
                int i80 = i69 - i76;
                int i81 = i70 - i77;
                int i82 = i66 - i78;
                int[] iArr15 = iArr7[(i71 + 2) % 3];
                int i83 = i76 - iArr15[0];
                int i84 = i77 - iArr15[1];
                int i85 = i78 - iArr15[2];
                if (i55 == 0) {
                    iArr5[i79] = Math.min(i79 + 2, i14) * width;
                }
                int i86 = iArr5[i79] + i55;
                int i87 = iArr2[i86];
                iArr15[0] = i87;
                int i88 = iArr3[i86];
                iArr15[1] = i88;
                int i89 = iArr13[i86];
                iArr15[2] = i89;
                int i90 = i73 + i87;
                int i91 = i74 + i88;
                int i92 = i75 + i89;
                i69 = i80 + i90;
                i70 = i81 + i91;
                i66 = i82 + i92;
                i71 = (i71 + 1) % 3;
                int[] iArr16 = iArr7[i71];
                int i93 = iArr16[0];
                i76 = i83 + i93;
                int i94 = iArr16[1];
                i77 = i84 + i94;
                int i95 = iArr16[2];
                i78 = i85 + i95;
                i73 = i90 - i93;
                i74 = i91 - i94;
                i75 = i92 - i95;
                i72 += width;
            }
            i55++;
            i54 = 1;
        }
        bitmapCopy.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCopy;
    }
}
