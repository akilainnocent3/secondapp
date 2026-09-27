package com.facebook.ads.redexgen.core;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import f6.q;
import java.lang.reflect.Method;
import java.util.Arrays;
import javax.annotation.Nullable;
import rg.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@Deprecated
public abstract class AbstractC2217Pi {

    @Nullable
    public static Method A00;
    public static byte[] A01;
    public static String[] A02 = {"oH0n9xAbcML0pK3kOEyCMAjio6eGJJqD", "GHXQlAAFRKh09bddZmMmvyBDBjZAjYiv", "8JVYZEo4WjVv17g9aGlnSLFSGTnTlVlV", "9RFKXGXKeKZpKk57elbUgU5Rr7HYGf7i", "pphhsLP65zu6ZwDFb6wQsw2VBCTq4rPR", "7bQdqYtwnU89UvKxRDm92gBnYRs5HvHU", "CoVMihrSOvAeKI017KlJ1GeUcMhjoF5o", "1TwObRYenAx9Xxo2pcbqEN0Hah2BLlTA"};

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        if (A02[2].charAt(17) == 'u') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "6RSw2BIRooHqNQZo6O6uqDXkY67gyuyt";
        strArr[5] = "6n2viGPYj5SHhnpzGoLQcwunY5cXqvEW";
        A01 = new byte[]{73, 101, 127, 102, 110, 42, q.f83619w, 101, 126, 42, 108, 99, q.f83619w, 110, 42, 103, 111, 126, 98, 101, 110, 42, 109, 111, 126, 89, 105, 107, 102, 111, 110, 89, 105, a.f127263w, 101, 102, 102, 76, 107, 105, 126, 101, a.f127263w, 34, 35, 42, 101, q.f83619w, 42, 92, 99, 111, 125, 73, 101, q.f83619w, 108, 99, 109, 127, a.f127263w, 107, 126, 99, 101, q.f83619w, 73, 118, 122, 104, 92, 112, q.A, 121, 118, a.f127263w, 92, 112, 114, 111, 126, 107, 59, 57, 40, c.f161639q, 63, yr.a.f159811k, 48, 57, 56, c.f161639q, 63, 46, 51, 48, 48, c.D, yr.a.f159811k, 63, 40, 51, 46};
    }

    static {
        A04();
        if (Build.VERSION.SDK_INT == 25) {
            try {
                A00 = ViewConfiguration.class.getDeclaredMethod(A03(82, 21, 102), new Class[0]);
            } catch (Exception unused) {
                Log.i(A03(66, 16, 37), A03(0, 66, 48));
            }
        }
    }

    public static float A00(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            float scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
            String[] strArr = A02;
            if (strArr[3].charAt(27) == strArr[5].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "0Ki4JXOncLynPK6ypbmoO1JP8yrdQeak";
            strArr2[1] = "cqlD2dZIdmZjhBfVp9VUMkw1vxAb5RnC";
            return scaledHorizontalScrollFactor;
        }
        return A02(viewConfiguration, context);
    }

    public static float A01(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        float fA02 = A02(viewConfiguration, context);
        String[] strArr = A02;
        if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
            throw new RuntimeException();
        }
        A02[2] = "MeYqCAiPW6zL6oB0sS71srseS72Ki7Wj";
        return fA02;
    }

    public static float A02(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 25 && A00 != null) {
            try {
                return ((Integer) A00.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                String strA03 = A03(66, 16, 37);
                String[] strArr = A02;
                if (strArr[3].charAt(27) == strArr[5].charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "k1KS2t9KIGKI4w6R1E4j5X81r1grad3n";
                strArr2[1] = "1ij9jDuHWzbgayt92o13kt38ESGEmluu";
                Log.i(strA03, A03(0, 66, 48));
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
