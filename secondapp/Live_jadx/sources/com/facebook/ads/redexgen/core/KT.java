package com.facebook.ads.redexgen.core;

import android.text.Layout;
import f6.q;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class KT {
    public static byte[] A0J;
    public static String[] A0K = {"Usxox1Jpg4zI1D26A46628IJoKVIfDOb", "DJj4Y7Lf5wmbgFbmipnyENDrbENW0zBu", "xAirbBVx6sN", "JUHzrsF6PskbrsOcxUQeRZ6EJgAR84BH", "g21uR390", "sct5cBRRGNi", "fSzYgZjiZ3zjw2rk03FKz0970uetzuqd", "YzsQQs1"};
    public float A00;
    public int A02;
    public int A04;
    public Layout.Alignment A0C;
    public Layout.Alignment A0D;
    public KI A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public int A07 = -1;
    public int A0B = -1;
    public int A03 = -1;
    public int A06 = -1;
    public int A05 = -1;
    public int A09 = -1;
    public int A08 = -1;
    public int A0A = -1;
    public float A01 = Float.MAX_VALUE;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0J = new byte[]{q.B, 7, 9, 17, 13, c.B, c.f161647y, c.E, c.f161646x, 10, a.f103476t7, 9, c.f161647y, c.f161643u, c.f161647y, c.B, a.f103476t7, c.f161638p, 7, c.C, a.f103476t7, c.f161646x, c.f161647y, c.D, a.f103476t7, 8, c.f161635m, c.f161635m, c.f161646x, a.f103476t7, 10, c.f161635m, c.f161636n, c.f161639q, c.f161646x, c.f161635m, 10, -44, -27, c.f161638p, 13, 19, -65, 2, c.f161638p, c.f161635m, c.f161638p, 17, -65, 7, 0, c.f161643u, -65, 13, c.f161638p, 19, -65, 1, 4, 4, 13, -65, 3, 4, 5, 8, 13, 4, 3, a.f103520y7};
    }

    static {
        A02();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    private KT A00(KT kt2, boolean z10) {
        if (kt2 != null) {
            if (!this.A0I && kt2.A0I) {
                A0H(kt2.A04);
            }
            if (this.A03 == -1) {
                this.A03 = kt2.A03;
            }
            if (this.A06 == -1) {
                this.A06 = kt2.A06;
            }
            if (this.A0F == null) {
                String str = kt2.A0F;
                String[] strArr = A0K;
                if (strArr[3].charAt(11) != strArr[1].charAt(11)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0K;
                strArr2[2] = "cxifAUO6W4n";
                strArr2[5] = "Va8L5s638mc";
                if (str != null) {
                    this.A0F = kt2.A0F;
                }
            }
            if (this.A07 == -1) {
                this.A07 = kt2.A07;
            }
            if (this.A0B == -1) {
                this.A0B = kt2.A0B;
            }
            int i10 = this.A08;
            String[] strArr3 = A0K;
            if (strArr3[2].length() != strArr3[5].length()) {
                throw new RuntimeException();
            }
            A0K[6] = "rpCcf5jyKzMEHl3XckJI6ROuZzizfKVN";
            if (i10 == -1) {
                this.A08 = kt2.A08;
            }
            Layout.Alignment alignment = this.A0D;
            if (A0K[6].charAt(6) != 'j') {
                A0K[0] = "iHkaK3PGLb6DAQNakyilLZ3b8fweVD8f";
                if (alignment == null) {
                    if (kt2.A0D != null) {
                        this.A0D = kt2.A0D;
                    }
                }
            } else {
                A0K[0] = "IvRWfCdmbtpyZ5Utg7SC4PH3AC5nND0h";
                if (alignment == null) {
                    if (kt2.A0D != null) {
                        this.A0D = kt2.A0D;
                    }
                }
            }
            if (this.A0C == null && kt2.A0C != null) {
                this.A0C = kt2.A0C;
            }
            if (this.A0A == -1) {
                this.A0A = kt2.A0A;
            }
            if (this.A05 == -1) {
                this.A05 = kt2.A05;
                this.A00 = kt2.A00;
            }
            if (this.A0E == null) {
                this.A0E = kt2.A0E;
            }
            if (this.A01 == Float.MAX_VALUE) {
                this.A01 = kt2.A01;
            }
            if (z10 && !this.A0H && kt2.A0H) {
                A0G(kt2.A02);
            }
            if (z10 && this.A09 == -1 && kt2.A09 != -1) {
                this.A09 = kt2.A09;
            }
        }
        return this;
    }

    public final float A03() {
        return this.A00;
    }

    public final float A04() {
        return this.A01;
    }

    public final int A05() {
        if (this.A0H) {
            return this.A02;
        }
        throw new IllegalStateException(A01(0, 38, 55));
    }

    public final int A06() {
        if (this.A0I) {
            return this.A04;
        }
        throw new IllegalStateException(A01(38, 32, 48));
    }

    public final int A07() {
        return this.A05;
    }

    public final int A08() {
        return this.A08;
    }

    public final int A09() {
        return this.A09;
    }

    public final int A0A() {
        if (this.A03 == -1 && this.A06 == -1) {
            return -1;
        }
        int i10 = (this.A03 == 1 ? 1 : 0) | (this.A06 == 1 ? 2 : 0);
        String[] strArr = A0K;
        if (strArr[2].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0K;
        strArr2[2] = "pc7acbLDMjB";
        strArr2[5] = "xuQHQFUerHu";
        return i10;
    }

    public final Layout.Alignment A0B() {
        return this.A0C;
    }

    public final Layout.Alignment A0C() {
        return this.A0D;
    }

    public final KI A0D() {
        return this.A0E;
    }

    public final KT A0E(float f10) {
        this.A00 = f10;
        return this;
    }

    public final KT A0F(float f10) {
        this.A01 = f10;
        return this;
    }

    public final KT A0G(int i10) {
        this.A02 = i10;
        this.A0H = true;
        return this;
    }

    public final KT A0H(int i10) {
        this.A04 = i10;
        this.A0I = true;
        return this;
    }

    public final KT A0I(int i10) {
        this.A05 = i10;
        return this;
    }

    public final KT A0J(int i10) {
        this.A08 = i10;
        return this;
    }

    public final KT A0K(int i10) {
        this.A09 = i10;
        return this;
    }

    public final KT A0L(Layout.Alignment alignment) {
        this.A0C = alignment;
        return this;
    }

    public final KT A0M(Layout.Alignment alignment) {
        this.A0D = alignment;
        return this;
    }

    public final KT A0N(KI ki2) {
        this.A0E = ki2;
        return this;
    }

    public final KT A0O(KT kt2) {
        return A00(kt2, true);
    }

    public final KT A0P(String str) {
        this.A0F = str;
        return this;
    }

    public final KT A0Q(String str) {
        this.A0G = str;
        return this;
    }

    public final KT A0R(boolean z10) {
        this.A03 = z10 ? 1 : 0;
        return this;
    }

    public final KT A0S(boolean z10) {
        this.A06 = z10 ? 1 : 0;
        return this;
    }

    public final KT A0T(boolean z10) {
        this.A07 = z10 ? 1 : 0;
        return this;
    }

    public final KT A0U(boolean z10) {
        this.A0A = z10 ? 1 : 0;
        return this;
    }

    public final KT A0V(boolean z10) {
        this.A0B = z10 ? 1 : 0;
        return this;
    }

    public final String A0W() {
        return this.A0F;
    }

    public final String A0X() {
        return this.A0G;
    }

    public final boolean A0Y() {
        return this.A0A == 1;
    }

    public final boolean A0Z() {
        return this.A0H;
    }

    public final boolean A0a() {
        return this.A0I;
    }

    public final boolean A0b() {
        return this.A07 == 1;
    }

    public final boolean A0c() {
        return this.A0B == 1;
    }
}
