package com.facebook.ads.redexgen.core;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.vungle.ads.internal.protos.Sdk;
import f6.q;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2230Px {
    public static byte[] A00;
    public static String[] A01 = {"ZL1anCMt3BLp6QH6mLG", "eYchmtpQAx9MOQATO8FYbbZn0Imopvp", "womqJE18VUE38xqqJT9WKISB68M5cIbo", "Ts37DulPc8QB3fV2ykqejrUSGmoT8jSS", "b7DBuf20fhmi4MvO4gTJDnUAFhtFn7QS", "riPo3ZmcE", "zdrgnlBB6epFGiAXytvDtgh2fpyUYHeQ", "pMT1BFzteNKtMElnfmBSO9c56WwnbBlh"};
    public static final C2229Pw A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(24) != strArr[2].charAt(24)) {
                throw new RuntimeException();
            }
            A01[1] = "rrZUd7Y7OcpInh9wY";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 74);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{13, c.f161636n, -20, 3, 17, c.f161643u, 3, 2, -18, c.f161640r, 3, -15, 1, c.f161640r, 13, 10, 10, -56, a.f103484u7, -89, -66, -52, a.f103520y7, -66, -67, -84, -68, a.f103511x7, -56, a.f103468s7, a.f103468s7, 52, 51, 19, 42, 56, 57, 42, 41, c.B, 40, 55, 52, 49, 49, 6, 40, 40, 42, 53, 57, 42, 41, a.f103493v7, -56, -83, a.f103529z7, -69, -52, a.f103529z7, -88, -65, a.f103520y7, a.f103529z7, -65, -66, -83, -67, -52, a.f103493v7, a.f103476t7, a.f103476t7, 41, 40, 13, 46, 41, 42, 8, 31, 45, 46, 31, c.H, 13, c.G, 44, 41, 38, 38};
    }

    static {
        A01();
        A02 = new C2978hz() { // from class: com.facebook.ads.redexgen.X.7T
            public static byte[] A00;
            public static String[] A01 = {"VY80zOaYPxkOtyUrTAwyx7zC77lFdeof", "qJYWmvtZwfwBqccNWJcDxq0wxgEd", "0lF9l2PIa0G", "8HUI8rnTM6nJrcfosCRNO8OvNswxKEJA", "TWKnH1rmbYSUhH4KNgSY2AsRWoqO1pqp", "o5QSN7NKgyovRW2", "W85", "rhxQt59st5mNUHdFmf4JU2hKMVhH4nOT"};

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                byte[] bArr = {-101, -33, -22, -32, -18, -101, -23, -22, -17, -101, -28, q.B, -21, -25, -32, q.B, -32, -23, -17, -101, -28, -23, -17, -32, -19, a.C7, -36, -34, -32, -101, q.B, -32, -17, -29, -22, -33, -101, -22, -23, a.f103493v7, -32, -18, -17, -32, -33, a.f103444p7, -25, -28, -23, -30, 101, -87, -76, -86, -72, 101, -77, -76, -71, 101, -82, -78, -75, -79, -86, -78, -86, -77, -71, 101, -82, -77, -71, -86, -73, -85, -90, -88, -86, 101, -78, -86, -71, -83, -76, -87, 101, -76, -77, -109, -86, -72, -71, -86, -87, -107, -73, -86, -117, -79, -82, -77, -84, 84, -104, -93, -103, -89, 84, -94, -93, -88, 84, -99, -95, -92, -96, -103, -95, -103, -94, -88, 84, -99, -94, -88, -103, -90, -102, -107, -105, -103, 84, -95, -103, -88, -100, -93, -104, 84, -93, -94, -126, -103, -89, -88, -103, -104, -124, -90, -103, -121, -105, -90, -93, -96, -96, -127, a.f103468s7, -48, a.f103476t7, -44, -127, a.A7, -48, -43, -127, a.f103502w7, a.f103529z7, -47, a.f103520y7, a.f103476t7, a.f103529z7, a.f103476t7, a.A7, -43, -127, a.f103502w7, a.A7, -43, a.f103476t7, -45, a.f103484u7, a.f103452q7, -60, a.f103476t7, -127, a.f103529z7, a.f103476t7, -43, a.f103493v7, -48, a.f103468s7, -127, -48, a.A7, -81, a.f103476t7, -44, -43, a.f103476t7, a.f103468s7, -76, -60, -45, -48, a.f103520y7, a.f103520y7, -66, 2, 13, 3, 17, -66, c.f161636n, 13, c.f161643u, -66, 7, c.f161635m, c.f161638p, 10, 3, c.f161635m, 3, c.f161636n, c.f161643u, -66, 7, c.f161636n, c.f161643u, 3, c.f161640r, 4, -1, 1, 3, -66, c.f161635m, 3, c.f161643u, 6, 13, 2, -66, 13, c.f161636n, -20, 3, 17, c.f161643u, 3, 2, -15, 1, c.f161640r, 13, 10, 10, -33, 1, 1, 3, c.f161638p, c.f161643u, 3, 2, -106, a.B7, -27, -37, -23, -106, -28, -27, -22, -106, -33, -29, -26, -30, -37, -29, -37, -28, -22, -106, -33, -28, -22, -37, q.B, -36, -41, a.E7, -37, -106, -29, -37, -22, -34, -27, a.B7, -106, -27, -28, a.f103493v7, -22, -41, q.B, -22, -60, -37, -23, -22, -37, a.B7, a.f103493v7, a.E7, q.B, -27, -30, -30, -84, -16, -5, -15, -1, -84, -6, -5, 0, -84, -11, -7, -4, -8, -15, -7, -15, -6, 0, -84, -11, -6, 0, -15, -2, q.f83622z, -19, -17, -15, -84, -7, -15, 0, -12, -5, -16, -84, -5, -6, -33, 0, -5, -4, a.B7, -15, -1, 0, -15, -16, -33, -17, -2, -5, -8, -8, -36, -17, -21, -3, -42, -25, -8, -21, -12, -6, -90, -25, -6, -10, 8, a.C7, q.f83622z, 3, -10, -1, 5, -44, 0, -2, 1, q.f83622z, 5};
                if (A01[3].charAt(4) != '8') {
                    throw new RuntimeException();
                }
                A01[3] = "0rHD8iYFkM5KLcEdxbz1wO1gXSem16M8";
                A00 = bArr;
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.core.C2229Pw
            public final void A02(ViewParent viewParent, View view) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e10) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(323, 55, 96), e10);
                }
            }

            @Override // com.facebook.ads.redexgen.core.C2229Pw
            public final void A03(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
                try {
                    viewParent.onNestedScroll(view, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(157, 51, 53), e10);
                }
            }

            @Override // com.facebook.ads.redexgen.core.C2229Pw
            public final void A04(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
                try {
                    viewParent.onNestedPreScroll(view, i10, i11, iArr);
                } catch (AbstractMethodError e10) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(103, 54, 8), e10);
                }
            }

            @Override // com.facebook.ads.redexgen.core.C2229Pw
            public final void A05(ViewParent viewParent, View view, View view2, int i10) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i10);
                } catch (AbstractMethodError e10) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 59, 114), e10);
                }
            }

            @Override // com.facebook.ads.redexgen.core.C2229Pw
            public final boolean A06(ViewParent viewParent, View view, float f10, float f11) {
                try {
                    return viewParent.onNestedPreFling(view, f10, f11);
                } catch (AbstractMethodError e10) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(50, 53, 25), e10);
                    return false;
                }
            }

            @Override // com.facebook.ads.redexgen.core.C2229Pw
            public final boolean A07(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
                try {
                    return viewParent.onNestedFling(view, f10, f11, z10);
                } catch (AbstractMethodError e10) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(0, 50, 79), e10);
                    return false;
                }
            }

            @Override // com.facebook.ads.redexgen.core.C2229Pw
            public final boolean A08(ViewParent viewParent, View view, View view2, int i10) {
                try {
                    return viewParent.onStartNestedScroll(view, view2, i10);
                } catch (AbstractMethodError e10) {
                    Log.e(A00(389, 16, 101), A00(378, 11, 90) + viewParent + A00(267, 56, 74), e10);
                    return false;
                }
            }
        };
    }

    public static void A02(ViewParent viewParent, View view, int i10) {
        if (0 != 0) {
            throw new NullPointerException(A00(72, 18, 112));
        }
        if (i10 == 0) {
            A02.A02(viewParent, view);
        }
    }

    public static void A03(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14) {
        if (0 != 0) {
            throw new NullPointerException(A00(17, 14, 15));
        }
        if (i14 == 0) {
            A02.A03(viewParent, view, i10, i11, i12, i13);
        }
    }

    public static void A04(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (0 != 0) {
            throw new NullPointerException(A00(0, 17, 84));
        }
        if (i12 == 0) {
            A02.A04(viewParent, view, i10, i11, iArr);
        }
    }

    public static void A05(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (0 != 0) {
            throw new NullPointerException(A00(31, 22, 123));
        }
        if (i11 == 0) {
            C2229Pw c2229Pw = A02;
            if (A01[1].length() != 12) {
                A01[6] = "zGz2rBeihUtTfGY2pcVtSmEx1y47z9aS";
                c2229Pw.A05(viewParent, view, view2, i10);
                return;
            }
            throw new RuntimeException();
        }
    }

    public static boolean A06(ViewParent viewParent, View view, float f10, float f11) {
        return A02.A06(viewParent, view, f10, f11);
    }

    public static boolean A07(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        return A02.A07(viewParent, view, f10, f11, z10);
    }

    public static boolean A08(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (0 != 0) {
            throw new NullPointerException(A00(53, 19, 16));
        }
        if (i11 == 0) {
            boolean zA08 = A02.A08(viewParent, view, view2, i10);
            if (A01[1].length() == 12) {
                throw new RuntimeException();
            }
            A01[6] = "znJUBPw3pDumoyQGyqs8HDKa96hSudPo";
            return zA08;
        }
        return false;
    }
}
