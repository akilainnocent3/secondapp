package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.signals.SignalKey;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ik {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2573 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2574 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2575 = 27;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2460(String str, String str2) {
        f2573 = (f2574 + 33) % 128;
        k.m2764(str, str2);
        f2573 = (f2574 + SignalKey.EVENT_ID) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2461(Context context) {
        int i10 = f2573 + 19;
        f2574 = i10 % 128;
        if (i10 % 2 != 0) {
            String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m2462("\ufffa�\u0002\ufff8�\u0002\b\u000b�\u0007", 17 / ((byte) KeyEvent.getModifierMetaStateMask()), true, (ViewConfiguration.getFadingEdgeLength() >>> 55) + 1, 22613 - TextUtils.getOffsetBefore("", 1)).intern());
            if (string != null) {
                return string;
            }
        } else {
            String string2 = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m2462("\ufffa�\u0002\ufff8�\u0002\b\u000b�\u0007", 9 - ((byte) KeyEvent.getModifierMetaStateMask()), true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, 130 - TextUtils.getOffsetBefore("", 0)).intern());
            if (string2 != null) {
                return string2;
            }
        }
        f2573 = (f2574 + 49) % 128;
        m2463(m2462("\u0007\u0014\u0007\u0010\u0005\u0007\u0015￫\ufff5￭\uffe7\uffe7\ufff8￣ￂ\ufff1\u0004\u0015\u0005\u0017\u0014\u0007\u0006\ufff5\n\u0003\u0014\u0007\u0006\ufff2\u0014\u0007\b", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32, false, 7 - Drawable.resolveOpacity(0, 0), 121 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), m2462("ￊ\u0010\u000f\u001e\r\u0012ￊ￫\ufff8￮￼\ufff9\ufff3￮\t\ufff3￮\uffd8ￊ\uffff\u001d\u0013\u0018\u0011ￊ\u0011\u000f\u0018\u000f\u001c\u000b\u001e\u000f\u000eￊ\u0013\u000e\uffd8￭\u0019\u001f\u0016\u000e\u0018\uffd1\u001e", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46, false, 38 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 113 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
        return m2464(context);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2463(String str, String str2) {
        int i10 = f2574 + 13;
        f2573 = i10 % 128;
        int i11 = i10 % 2;
        k.m2765(str, str2);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f2573 + 117;
        f2574 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 26 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2464(Context context) {
        f2573 = (f2574 + 87) % 128;
        SharedPreferences sharedPreferences = context.getSharedPreferences(m2462("\u0004\u0011\u000e\u0013\u0012\u0001\u0003ￍ\u0015\nￍ", 10 - TextUtils.indexOf((CharSequence) "", '0', 0), true, 4 - TextUtils.indexOf((CharSequence) "", '0', 0), View.getDefaultSize(0, 0) + 124).intern(), 0);
        String string = sharedPreferences.getString(m2462("\uffff\u0001\uffc8\ufffb\u0006\u0007\t\t\r\ufffe\u0003\ufffe\uffff\u000e\ufffb\f\uffff\b", 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), true, 9 - (ViewConfiguration.getTouchSlop() >> 8), 129 - TextUtils.getTrimmedLength("")).intern(), null);
        if (TextUtils.isEmpty(string)) {
            f2574 = (f2573 + 77) % 128;
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString(m2462("\uffff\u0001\uffc8\ufffb\u0006\u0007\t\t\r\ufffe\u0003\ufffe\uffff\u000e\ufffb\f\uffff\b", 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), true, 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 'Q').intern(), string).commit();
            f2574 = (f2573 + 13) % 128;
        }
        int i10 = f2574 + 101;
        f2573 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 29 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2462(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f706) {
            try {
                char[] cArr2 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i13 = b.f704;
                    if (i13 >= i10) {
                        break;
                    }
                    b.f705 = cArr[i13];
                    cArr2[b.f704] = (char) (b.f705 + i12);
                    int i14 = b.f704;
                    cArr2[i14] = (char) (cArr2[i14] - f2575);
                    b.f704 = i14 + 1;
                }
                if (i11 > 0) {
                    b.f707 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = b.f707;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = b.f707;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    b.f704 = 0;
                    while (true) {
                        int i17 = b.f704;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        b.f704 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
