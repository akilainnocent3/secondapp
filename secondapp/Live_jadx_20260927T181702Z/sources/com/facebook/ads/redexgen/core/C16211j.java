package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import f6.q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C16211j extends AQ {
    public static byte[] A04;
    public static String[] A05 = {"EpUFNdKyF", "ElnVCWkanZ28CNZmVbXI8Cgdfk8l0", "X39VUuGfeiZ7XA2vCr", "EABpQNGHZAa4ZPAJBF04BZM7WLurFTC9", "chwMXTauvlPIh4ZEXg6aw7fxDLbtX6Fs", "XZGBORnRKKQlpHrvvOBFjnqbRPoZpqW4", "uC2aRCtD", "rZqfEylCjzpizgmEVXgae15ipmvYBT3W"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {99, 108, 105, 96, 86, 119, 102, 87, 96, q.f83619w, 97, 74, 117, 96, 107, 111, 96, 101, 108, 90, 123, 106, 91, 108, 104, 109, 91, 72, 79, 47, 36, 35, 56, q.A, 57, 48, 34, q.A, 32, 36, 52, 35, 40, q.A, 48, 63, 53, 126, 62, 35, q.A, 55, 35, 48, 54, 60, 52, 63, 37, 125, q.A, 38, 57, 56, 50, 57, q.A, 48, 35, 52, q.A, 63, 62, 37, q.A, 34, 36, 33, 33, 62, 35, 37, 52, 53, 127, q.A, c.f161647y, 56, 53, q.A, 40, 62, 36, q.A, 50, 48, a.f159811k, a.f159811k, q.A, 4, 35, 56, 127, 33, 48, 35, 34, 52, 121, rg.a.f127263w, q.A, 62, 63, q.A, 48, q.A, 34, 37, 35, 56, 63, 54, q.A, 50, 62, 63, 37, 48, 56, 63, 56, 63, 54, q.A, 118, 110, 118, q.A, 62, 35, q.A, 118, 114, 118, 110, q.A, 4, 34, 52, q.A, 4, 35, 56, 127, 55, 35, 62, 60, c.A, 56, a.f159811k, 52, 121, 63, 52, 38, q.A, c.A, 56, a.f159811k, 52, 121, 33, 48, 37, 57, rg.a.f127263w, rg.a.f127263w, q.A, 37, 62, q.A, 48, 39, 62, 56, 53, q.A, 37, 57, 56, 34, 127, q.A, 33, 48, 37, 57, 108, 116, 34, 125, 32, 36, 52, 35, 40, 108, 116, 34, 125, 55, 35, 48, 54, 60, 52, 63, 37, 108, 116, 34};
        String[] strArr = A05;
        if (strArr[0].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[3] = "X0VoZl0WlZuonvRnqv5GR18rztIlLTBl";
        strArr2[7] = "XOIDFuTAWw0P55lYRHi5z3HfEt22MTH0";
        A04 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final long AGi(C17205i c17205i) throws C3391pA {
        AnonymousClass54.A02(A01(0, 15, 71));
        Uri uri = c17205i.A06;
        this.A01 = uri;
        A0G(c17205i);
        this.A02 = A00(uri);
        try {
            try {
                this.A02.seek(c17205i.A04);
                this.A00 = c17205i.A03 == -1 ? this.A02.length() - c17205i.A04 : c17205i.A03;
                AnonymousClass54.A00();
                if (this.A00 < 0) {
                    throw new C3391pA(null, null, 2008);
                }
                this.A03 = true;
                A0H(c17205i);
                long j10 = this.A00;
                if (A05[1].length() == 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[0] = "xa7zJISj9";
                strArr[2] = "YSvWE2PgVF009LXgrm";
                return j10;
            } catch (IOException e10) {
                throw new C3391pA(e10, 2000);
            }
        } catch (Throwable th2) {
            AnonymousClass54.A00();
            throw th2;
        }
    }

    static {
        A02();
    }

    public C16211j() {
        super(false);
    }

    public static RandomAccessFile A00(Uri uri) throws C3391pA {
        try {
            return new RandomAccessFile((String) AbstractC16843y.A01(uri.getPath()), A01(29, 1, 31));
        } catch (FileNotFoundException e10) {
            boolean zIsEmpty = TextUtils.isEmpty(uri.getQuery());
            String[] strArr = A05;
            if (strArr[3].charAt(29) != strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            A05[1] = "uF4";
            if (zIsEmpty && TextUtils.isEmpty(uri.getFragment())) {
                throw new C3391pA(e10, (C5C.A02 < 21 || !C17225k.A00(e10.getCause())) ? 2005 : 2006);
            }
            throw new C3391pA(String.format(A01(30, 192, 19), uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new C3391pA(e11, 2006);
        } catch (RuntimeException e12) {
            throw new C3391pA(e12, 2000);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    public final Uri A9P() {
        return this.A01;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    public final void close() throws C3391pA {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
                this.A02 = null;
                boolean z10 = this.A03;
                String[] strArr = A05;
                if (strArr[0].length() == strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[3] = "OaGc5WGUg2QUkWgGCbKJpnMVI4k73TqR";
                strArr2[7] = "7y85lWdOal5lz5BxO7mJ0PPL1NIIxTrt";
                if (z10) {
                    this.A03 = false;
                    A0E();
                }
            } catch (IOException e10) {
                throw new C3391pA(e10, 2000);
            }
        } catch (Throwable th2) {
            this.A02 = null;
            boolean z11 = this.A03;
            String[] strArr3 = A05;
            if (strArr3[3].charAt(29) != strArr3[7].charAt(29)) {
                String[] strArr4 = A05;
                strArr4[0] = "Vm3YcALUN";
                strArr4[2] = "c4edS4Kr4EVyTdnKAl";
                if (z11) {
                    this.A03 = false;
                    A0E();
                }
            } else {
                String[] strArr5 = A05;
                strArr5[5] = "xGGiO6aoc87d3bdrOM0514KxVU6xxq2z";
                strArr5[4] = "rL55lenIs2jXGgYduJCww9Rx5eQkWv1P";
                if (z11) {
                    this.A03 = false;
                    A0E();
                }
            }
            throw th2;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16402c
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final int read(byte[] bArr, int i10, int i11) throws C3391pA {
        if (i11 == 0) {
            return 0;
        }
        try {
            if (this.A00 == 0) {
                return -1;
            }
            try {
                AnonymousClass54.A02(A01(15, 14, 75));
                int i12 = ((RandomAccessFile) C5C.A0f(this.A02)).read(bArr, i10, (int) Math.min(this.A00, i11));
                AnonymousClass54.A00();
                if (i12 > 0) {
                    this.A00 -= (long) i12;
                    A0F(i12);
                }
                return i12;
            } catch (IOException e10) {
                throw new C3391pA(e10, 2000);
            }
        } catch (Throwable th2) {
            AnonymousClass54.A00();
            throw th2;
        }
    }
}
