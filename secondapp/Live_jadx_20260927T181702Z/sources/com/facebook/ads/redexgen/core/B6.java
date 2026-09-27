package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Log;
import f6.q;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import l3.a;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class B6 {
    public static byte[] A03;
    public boolean A00 = false;
    public final ConcurrentLinkedQueue<B4> A01 = new ConcurrentLinkedQueue<>();
    public final /* synthetic */ B7 A02;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-89, a.B7, a.f103468s7, a.f103484u7, -46, -42, a.f103511x7, -47, -48, -126, a.E7, a.f103502w7, a.f103484u7, -48, -126, -42, -44, -37, a.f103511x7, -48, a.f103493v7, -126, -42, -47, -126, a.f103511x7, -48, -43, -42, a.f103460r7, -48, -42, a.f103511x7, a.f103460r7, -42, a.f103484u7, -126, -121, -43, -100, -126, -121, -43, -72, -48, a.A7, -44, -52, -82, a.B7, a.A7, -48, a.f103529z7, -69, a.B7, a.B7, -41, -70, -37, -33, -44, a.f103428n7, -44, -27, -48, a.A7, a.f103468s7, -46, -46, a.A7, -46, -115, -41, -56, a.f103493v7, -52, a.f103468s7, -115, -46, a.f103468s7, -52, a.f103468s7, a.f103444p7, -45, a.f103468s7, -115, a.f103460r7, a.A7, -60, a.f103468s7, a.f103460r7, -115, a.f103476t7, -46, a.A7, a.f103520y7, -115, -45, a.f103468s7, -44, -115, a.f103476t7, a.f103493v7, a.f103529z7, a.f103444p7, -52, -52, a.E7, -102, -128, -123, -45, a.f103428n7, -27, -27, -30, -27, -96, -22, -37, -36, -33, a.f103428n7, -96, -27, a.f103428n7, -33, a.f103428n7, -44, -26, a.f103428n7, -96, -42, -30, -41, a.f103428n7, -42, -96, a.E7, -27, -30, -32, -96, -26, a.f103428n7, -25, -83, -109, -104, -26, -34, -15, q.B, -23, -27, a.B7, q.f83622z, -34, -21, -85, -89, a.B7, -17, -86, -89, -20, -21, -36, -89, -67, a.B7, -17, -86, -35, a.f103476t7, -34, -35, -30, a.B7, -68, q.B, -35, -34, -36, -70, -35, a.B7, -23, -19, -34, -21};
    }

    public B6(B7 b10) {
        this.A02 = b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public B0 A02(boolean z10, C3056jQ c3056jQ, EnumC3053jL enumC3053jL, String str) throws Exception {
        Set<B0> set;
        if (this.A02.A0I(z10, c3056jQ) && B7.A0G(str, c3056jQ)) {
            synchronized (this.A02.A04) {
                set = this.A02.A04.get(str);
            }
            if (set != null) {
                synchronized (set) {
                    if (!set.isEmpty()) {
                        this.A02.A00--;
                        Iterator<B0> it = set.iterator();
                        B0 ret = it.next();
                        it.remove();
                        this.A02.A03().A0A(z10, str, enumC3053jL, ret.hashCode());
                        return ret;
                    }
                }
            }
        }
        try {
            C3051jJ c3051jJA05 = this.A02.A03().A05(z10, str, enumC3053jL);
            B0 b0A03 = A03(z10, str);
            this.A02.A03().A06(c3051jJA05, b0A03.hashCode());
            return b0A03;
        } catch (Exception e10) {
            throw new MediaCodecInitializationException(str, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public B0 A03(boolean z10, String str) throws Exception {
        String strA04 = A04(150, 41, 69);
        if (z10 && B7.A0E(str)) {
            try {
                return (B0) Class.forName(strA04).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e10) {
                Log.w(A04(43, 23, 55), String.format(A04(0, 43, 46), strA04, e10.getMessage()));
            }
        }
        return new C3325o6(MediaCodec.createByCodecName(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public void A0B(EnumC3053jL enumC3053jL) {
        String strA04;
        String str;
        B7 b10;
        Set<B0> set;
        for (B4 b11 : this.A01) {
            try {
                try {
                    if (!b11.A05) {
                        A08(b11.A01, enumC3053jL, Boolean.valueOf(b11.A04), b11.A00);
                    } else {
                        try {
                            try {
                                this.A02.A05 = SystemClock.elapsedRealtime();
                                b11.A00.reset();
                                b10 = this.A02;
                            } catch (Throwable th2) {
                                this.A02.A05 = -1L;
                                throw th2;
                            }
                        } catch (IllegalStateException unused) {
                            A09(b11.A02, b11.A00);
                            b10 = this.A02;
                        }
                        b10.A05 = -1L;
                        if (b11.A03) {
                            synchronized (this.A02.A04) {
                                set = this.A02.A04.get(b11.A02);
                            }
                            if (set != null) {
                                synchronized (set) {
                                    set.add(b11.A00);
                                    this.A02.A00++;
                                }
                            }
                        }
                    }
                    try {
                        synchronized (this.A01) {
                            try {
                                this.A01.remove(b11);
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (Exception e10) {
                        strA04 = A04(43, 23, 55);
                        str = String.format(A04(66, 46, 44), e10.getMessage());
                        Log.w(strA04, str);
                    }
                } catch (Exception e11) {
                    Log.w(A04(43, 23, 55), String.format(A04(112, 38, 63), e11.getMessage()));
                    try {
                        synchronized (this.A01) {
                            try {
                                this.A01.remove(b11);
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    } catch (Exception e12) {
                        strA04 = A04(43, 23, 55);
                        str = String.format(A04(66, 46, 44), e12.getMessage());
                        Log.w(strA04, str);
                    }
                }
            } catch (Throwable th5) {
                try {
                    synchronized (this.A01) {
                        this.A01.remove(b11);
                        throw th5;
                    }
                } catch (Exception e13) {
                    Log.w(A04(43, 23, 55), String.format(A04(66, 46, 44), e13.getMessage()));
                }
            }
        }
    }

    private void A08(C3056jQ c3056jQ, EnumC3053jL enumC3053jL, Boolean bool, B0 b10) {
        try {
            if (!c3056jQ.A0R || (!bool.booleanValue() && !c3056jQ.A0Q)) {
                b10.stop();
            }
        } finally {
            this.A02.A03().A08(enumC3053jL, b10.hashCode());
            b10.AHb();
            this.A02.A03().A07(enumC3053jL, b10.hashCode());
        }
    }

    private void A09(String str, B0 b10) {
        Set<B0> set;
        synchronized (this.A02.A04) {
            set = this.A02.A04.get(str);
        }
        if (set != null) {
            synchronized (set) {
                if (set.remove(b10)) {
                    this.A02.A00--;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Bottom block not found for handler: all -> 0x00e0 */
    /* JADX WARN: Code duplicated, block: B:106:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0A(boolean r24, com.facebook.ads.redexgen.core.C3056jQ r25, final com.facebook.ads.redexgen.core.EnumC3053jL r26, java.lang.String r27, com.facebook.ads.redexgen.core.B0 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.B6.A0A(boolean, com.facebook.ads.redexgen.X.jQ, com.facebook.ads.redexgen.X.jL, java.lang.String, com.facebook.ads.redexgen.X.B0):void");
    }
}
