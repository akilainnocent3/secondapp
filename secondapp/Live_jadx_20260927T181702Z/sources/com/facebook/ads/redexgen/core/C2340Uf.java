package com.facebook.ads.redexgen.core;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2340Uf {
    public static int A03;
    public static byte[] A04;
    public static String[] A05 = {"60vC7Tqxq", "iit", "yZ8WhL2SKbyHWFuqrbqyqX6q9YBqbSbq", "zou4kHpYoYqOWULjtQgwmQsgY48o5sQE", "Jj1CAbkpCkmlTw2dBaB6fKsG", "LIdASrcH6z6LtpFKNKqsX", "9qyYxkloNYGFw4rMCbrwSMHZV85hWfZp", "eAI5s54jDPvvLg6GHfi1"};
    public C2339Ue A00;
    public boolean A01;
    public final File A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-29, -2, 6, 9, 2, 1, -67, 17, c.f161636n, -67, 1, 2, 9, 2, 17, 2, -67, 3, 6, 9, 2, -67, -60, a.f103452q7, c.f161640r, -119, -84, -81, -88, 99, 106, 104, -74, 106, 99, -84, -74, 99, -79, -78, -73, 99, -92, 99, -75, -88, -92, -89, -92, -91, -81, -88, 99, -87, -84, -81, -88, -97, -60, -52, -73, a.f103452q7, -65, -70, 118, -68, -69, a.f103502w7, -71, -66, 118, a.f103493v7, a.f103502w7, -73, -56, a.f103502w7, 118, -65, -60, -70, -69, a.f103529z7, -112, 118, 123, -70, -75, -56, a.f103476t7, -46, -43, a.f103484u7, -125, a.f103493v7, -52, a.A7, -56, -125, -60, a.A7, -43, -56, -60, a.f103484u7, -36, -125, a.f103484u7, -52, -42, -45, -46, -42, -56, a.f103484u7};
        String[] strArr = A05;
        if (strArr[2].charAt(17) != strArr[6].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[1] = "hp8";
        strArr2[4] = "JPe8szfYYKMd1bH3O09b0bU9";
        A04 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A05() throws IOException {
        return A00().A00;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized UW A06(int i10, byte[] bArr, int i11, int[] iArr, int i12) throws IOException {
        C2339Ue c2339UeA00 = A00();
        int i13 = 1;
        if (i10 < 0) {
            throw new IOException(String.format(Locale.US, A01(57, 29, 21), Integer.valueOf(i10)));
        }
        int i14 = i10;
        int i15 = 0;
        long j10 = -1;
        boolean z10 = false;
        while (i14 < c2339UeA00.A00) {
            if ((i14 - i10) + i12 >= iArr.length) {
                z10 = true;
                break;
            }
            long j11 = c2339UeA00.A03[i14];
            long j12 = (i14 == c2339UeA00.A00 - i13 ? c2339UeA00.A01 : c2339UeA00.A03[i14 + 1]) - j11;
            if (j10 == -1) {
                j10 = j11;
            }
            if (((int) j12) + i15 + i11 > bArr.length) {
                z10 = true;
                break;
            }
            i15 += (int) j12;
            iArr[(i14 - i10) + i12] = (int) j12;
            i14++;
            i13 = 1;
        }
        if (i14 <= i10) {
            return new UW(z10 ? UV.A04 : UV.A05, i10, i10, 0);
        }
        c2339UeA00.A02.seek(j10);
        c2339UeA00.A02.read(bArr, i11, i15);
        return new UW(UV.A03, i10, i14, i15);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A09(byte[] bArr) throws IOException {
        C2339Ue c2339UeA00 = A00();
        if (A05() == A03) {
            return false;
        }
        A03(c2339UeA00.A00, c2339UeA00.A01);
        A04(c2339UeA00.A01, bArr);
        c2339UeA00.A02.getFD().sync();
        c2339UeA00.A00++;
        c2339UeA00.A01 += (long) bArr.length;
        return true;
    }

    static {
        A02();
        A03 = 1000;
    }

    public C2340Uf(File file) throws IOException {
        this.A02 = file;
        if (!file.exists()) {
            this.A00 = C2339Ue.A03(file);
        } else if (!file.isFile()) {
            throw new IOException(String.format(Locale.US, A01(25, 32, 2), file.getCanonicalPath()));
        }
    }

    private C2339Ue A00() throws IOException {
        if (!this.A01) {
            if (this.A00 == null) {
                this.A00 = C2339Ue.A04(this.A02);
            }
            return this.A00;
        }
        throw new IOException(A01(86, 28, 34));
    }

    private void A03(int i10, long j10) throws IOException {
        this.A00.A03[i10] = j10;
        this.A00.A02.seek(C2339Ue.A02(i10));
        this.A00.A02.writeLong(j10);
    }

    private void A04(long j10, byte[] bArr) throws IOException {
        this.A00.A02.seek(j10);
        this.A00.A02.write(bArr);
    }

    public final synchronized void A07() throws IOException {
        this.A01 = true;
        if (this.A00 == null) {
            return;
        }
        RandomAccessFile randomAccessFile = this.A00.A02;
        this.A00 = null;
        randomAccessFile.close();
    }

    public final synchronized void A08() throws IOException {
        if (!this.A01) {
            A07();
            if (!this.A02.delete()) {
                throw new IOException(String.format(Locale.US, A01(0, 25, 92), this.A02.getCanonicalPath()));
            }
        } else {
            throw new IOException(A01(86, 28, 34));
        }
    }
}
