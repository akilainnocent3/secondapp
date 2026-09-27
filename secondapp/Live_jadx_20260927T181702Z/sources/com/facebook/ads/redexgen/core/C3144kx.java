package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import f6.q;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3144kx implements LU<Bitmap> {
    public static byte[] A06;
    public final int A00;
    public final int A01;
    public final String A02 = C3144kx.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-110, a.f103428n7, -47, -44, 3, 42, 53, 46, 34, 49, a.C7, 42, 52, a.C7, 47, 54, 45, 45, a.f103493v7, -4, -25, -23, -12, -8, -19, -13, q.f83622z, -92, q.B, -7, -10, -19, q.f83622z, -21, -92, -22, -19, -16, -23, -92, -25, -13, -15, -12, -10, -23, -9, -9, -19, -13, q.f83622z};
    }

    public C3144kx(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        this.A01 = i10;
        this.A00 = i11;
        this.A05 = z10;
        this.A03 = z11;
        this.A04 = z12;
    }

    public static LT<Bitmap> A00(Throwable th2) {
        return new LT<>(false, null, th2);
    }

    private void A03(File file, Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            ByteArrayOutputStream compressedBitmapOS = new ByteArrayOutputStream();
            byteArrayOutputStream = compressedBitmapOS;
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            String str = file.getCanonicalPath() + A01(0, 4, 25);
            File file2 = new File(str);
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new FileInputStream(str);
            fileOutputStream2 = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 > 0) {
                    fileOutputStream2.write(bArr, 0, i10);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            AbstractC2120Ln.A07(byteArrayOutputStream);
            AbstractC2120Ln.A07(fileOutputStream);
            AbstractC2120Ln.A07(fileInputStream);
            AbstractC2120Ln.A07(fileOutputStream2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LU
    public final LT<Bitmap> A3x(File file, InterfaceC2119Lm interfaceC2119Lm) {
        if (!this.A04) {
            return new LT<>(true, null);
        }
        try {
            Bitmap bitmapA03 = AbstractC2120Ln.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (bitmapA03 != null) {
                return new LT<>(true, bitmapA03);
            }
            interfaceC2119Lm.AB4(new C3135kn(A01(4, 14, 118)));
            return A00(null);
        } catch (Throwable t10) {
            file.delete();
            interfaceC2119Lm.AB4(t10);
            return A00(t10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.LU
    public final void A5D(File file, InterfaceC2119Lm interfaceC2119Lm) throws Throwable {
        if (this.A03) {
            try {
                Bitmap bitmap = AbstractC2120Ln.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (bitmap != null) {
                    A03(file, bitmap);
                } else {
                    file.delete();
                    throw new C3135kn(A01(4, 14, 118));
                }
            } catch (C3135kn e10) {
                interfaceC2119Lm.ABI(e10);
                throw e10;
            } catch (Throwable th2) {
                interfaceC2119Lm.ABI(th2);
                Throwable t10 = new C3135kn(A01(18, 33, 57), th2);
                throw t10;
            }
        }
    }
}
