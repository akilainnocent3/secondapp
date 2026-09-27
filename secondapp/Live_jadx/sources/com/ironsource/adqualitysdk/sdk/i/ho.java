package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.signals.SignalKey;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ho extends hp {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private int f2363;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private List<Class> f2364 = new ArrayList();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f2365;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Class f2366;

    public ho() {
        super.mo2233();
        this.f2366 = null;
        this.f2363 = 0;
        this.f2365 = true;
        this.f2364.clear();
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2228() {
        return this.f2365;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final int m2229() {
        return this.f2363;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Class m2230() {
        return this.f2366;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final List<Class> m2231() {
        return this.f2364;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2232(Class cls) {
        this.f2366 = cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hp
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void mo2233() {
        super.mo2233();
        this.f2366 = null;
        this.f2363 = 0;
        this.f2365 = true;
        this.f2364.clear();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends hp.b implements cl {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2367 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2368 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static short[] f2369 = null;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static byte[] f2370 = {5, 42, l3.a.E7, -1, zi.c.f161635m, l3.a.f103484u7, 51, 41, 43, -7, 60, -45, 46, 2, l3.a.f103520y7, 58, l3.a.f103468s7, 62, l3.a.C7, zi.c.f161646x, l3.a.f103468s7, 60, 58, 10, zi.c.f161636n, zi.c.f161638p, -36, zi.c.C, f6.q.B, -5, zi.c.f161640r, l3.a.f103502w7, 42, -6, -48, 39, -4, 8, f6.q.B, 5, zi.c.f161635m, 13, -4, zi.c.f161643u, -12, -12, 8, l3.a.f103428n7, 39, -26, 28, -4, -16, 1, -2, 0, -8, 8, -33, zi.c.f161646x, -3, -2, 13, -97, f6.q.A, -105, -105, 117, -83, 72, -123, 127, -97, -109, 98, -99, 99, -101, 107, -68, 119, -98, -99, 10, -126, -112, 119, -117, 115, -113, 119, 121, -96, 103, -89, 99, -121, 115, -109, 126, 112, 7, -52, 60, 62, 56, 33, -27, 36, -48, l3.a.f103502w7, -56, zi.c.D, l3.a.A7, 63, 60, -3, 64, -67, 65, -68, -3, -78, 73, -66, 89};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2371 = -661123836;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2372 = 8;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2373 = 1533351683;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ho f2374 = new ho();

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private a m2234(int i10) {
            f2368 = (f2367 + 95) % 128;
            this.f2374.f2363 = i10;
            int i11 = f2367 + 95;
            f2368 = i11 % 128;
            if (i11 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m2239(boolean z10) {
            f2368 = (f2367 + 53) % 128;
            this.f2374.f2365 = z10;
            int i10 = f2368 + 25;
            f2367 = i10 % 128;
            if (i10 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final a m2240(int i10) {
            int i11 = (f2368 + 57) % 128;
            f2367 = i11;
            ho hoVar = this.f2374;
            hoVar.f2375 = i10 | hoVar.f2375;
            int i12 = i11 + 27;
            f2368 = i12 % 128;
            if (i12 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final a m2242(Class cls) {
            f2368 = (f2367 + 35) % 128;
            this.f2374.f2366 = cls;
            int i10 = f2367 + 91;
            f2368 = i10 % 128;
            if (i10 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private a m2235(boolean z10, int i10) {
            int i11 = f2368 + 15;
            f2367 = i11 % 128;
            if (i11 % 2 != 0) {
                ho hoVar = this.f2374;
                hoVar.f2376 = z10;
                hoVar.f2378 = i10;
                int i12 = 18 / 0;
                return this;
            }
            ho hoVar2 = this.f2374;
            hoVar2.f2376 = z10;
            hoVar2.f2378 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m2238(Class cls) {
            int i10 = f2367 + 79;
            f2368 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2374.f2364.add(cls);
                int i11 = f2368 + SignalKey.EVENT_ID;
                f2367 = i11 % 128;
                if (i11 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            this.f2374.f2364.add(cls);
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cl
        /* JADX INFO: renamed from: ﻐ */
        public final Object mo767(String str, List<Object> list, ch chVar) {
            int iIntValue;
            switch (str.hashCode()) {
                case -1347544616:
                    if (!str.equals(m2236((KeyEvent.getMaxKeyCode() >> 16) + 661123859, (short) View.MeasureSpec.getSize(0), (-1533351568) - View.getDefaultSize(0, 0), (byte) (TextUtils.indexOf("", "") - 7), (-9) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                        return null;
                    }
                    f2368 = (f2367 + 45) % 128;
                    return m2239(((Boolean) cz.m1806(list, 0, Boolean.class)).booleanValue());
                case -923635536:
                    if (str.equals(m2236(661123835 - TextUtils.indexOf((CharSequence) "", '0'), (short) TextUtils.getCapsMode("", 0, 0), (-1533351568) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (TextUtils.indexOf("", "", 0) - 36), (-9) - View.resolveSize(0, 0)).intern())) {
                        return m2242((Class) cz.m1806(list, 0, Class.class));
                    }
                    return null;
                case -216533736:
                    if (!str.equals(m2236(661123849 - ExpandableListView.getPackedPositionGroup(0L), (short) (ViewConfiguration.getTapTimeout() >> 16), (-1550128784) - Color.rgb(0, 0, 0), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 62), (-9) - Drawable.resolveOpacity(0, 0)).intern())) {
                        return null;
                    }
                    f2367 = (f2368 + 69) % 128;
                    return m2234(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                case 94094958:
                    if (!str.equals(m2236(((Process.getThreadPriority(0) + 20) >> 6) + 661123957, (short) (AndroidCharacter.getMirror('0') - '0'), (-1533351585) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (ExpandableListView.getPackedPositionChild(0L) + 75), Color.alpha(0) - 9).intern())) {
                        return null;
                    }
                    f2367 = (f2368 + 97) % 128;
                    ho hoVarM2243 = m2243();
                    int i10 = f2367 + 53;
                    f2368 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 41 / 0;
                    }
                    return hoVarM2243;
                case 108404047:
                    if (str.equals(m2236((ViewConfiguration.getLongPressTimeout() >> 16) + 661123952, (short) (Process.myPid() >> 22), (-1533351569) - TextUtils.indexOf("", ""), (byte) (KeyEvent.keyCodeFromString("") + 79), (-10) - MotionEvent.axisFromString("")).intern())) {
                        return m2237();
                    }
                    return null;
                case 387034026:
                    if (!str.equals(m2236(661123920 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) TextUtils.getTrimmedLength(""), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1533351568, (byte) (TextUtils.indexOf("", "", 0, 0) - 126), (-9) - TextUtils.indexOf("", "")).intern())) {
                        return null;
                    }
                    f2367 = (f2368 + 41) % 128;
                    boolean zBooleanValue = ((Boolean) cz.m1806(list, 0, Boolean.class)).booleanValue();
                    if (list.size() > 1) {
                        int i12 = f2367 + 7;
                        f2368 = i12 % 128;
                        int i13 = i12 % 2;
                        iIntValue = ((Integer) cz.m1806(list, 1, Integer.class)).intValue();
                    } else {
                        iIntValue = -1;
                    }
                    return m2235(zBooleanValue, iIntValue);
                case 391966482:
                    if (str.equals(m2236(661123877 - Color.green(0), (short) TextUtils.getOffsetAfter("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1533351587, (byte) ((-3) - (KeyEvent.getMaxKeyCode() >> 16)), (-9) - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                        return m2241(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                    }
                    return null;
                case 1067445448:
                    if (!str.equals(m2236((ViewConfiguration.getEdgeSlop() >> 16) + 661123937, (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1533351585) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (TextUtils.getTrimmedLength("") + 63), View.resolveSizeAndState(0, 0, 0) - 9).intern())) {
                        return null;
                    }
                    f2368 = (f2367 + 59) % 128;
                    return m2238((Class) cz.m1806(list, 0, Class.class));
                case 1423210564:
                    if (!str.equals(m2236(661123897 - ExpandableListView.getPackedPositionChild(0L), (short) View.MeasureSpec.getSize(0), (-1533351587) - TextUtils.lastIndexOf("", '0'), (byte) ((-98) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), KeyEvent.normalizeMetaState(0) - 9).intern())) {
                        return null;
                    }
                    f2367 = (f2368 + 59) % 128;
                    return m2240(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final a m2241(int i10) {
            ho hoVar;
            int i11;
            int i12 = f2367 + 3;
            f2368 = i12 % 128;
            if (i12 % 2 == 0) {
                hoVar = this.f2374;
                i11 = i10 ^ hoVar.f2377;
            } else {
                hoVar = this.f2374;
                i11 = i10 | hoVar.f2377;
            }
            hoVar.f2377 = i11;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final ho m2243() {
            int i10 = f2367;
            int i11 = i10 + 15;
            f2368 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            ho hoVar = this.f2374;
            f2368 = (i10 + 105) % 128;
            return hoVar;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private a m2237() {
            f2367 = (f2368 + 33) % 128;
            this.f2374.mo2233();
            int i10 = f2368 + 45;
            f2367 = i10 % 128;
            if (i10 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2236(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f2993) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f2372;
                    int i14 = i12 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f2370;
                        if (bArr != null) {
                            i14 = (byte) (bArr[f2371 + i10] + i13);
                        } else {
                            i14 = (short) (f2369[f2371 + i10] + i13);
                        }
                    }
                    if (i14 > 0) {
                        o.f2994 = ((i10 + i14) - 2) + f2371 + i15;
                        o.f2995 = b10;
                        char c10 = (char) (i11 + f2373);
                        o.f2997 = c10;
                        sb2.append(c10);
                        o.f2996 = o.f2997;
                        o.f2998 = 1;
                        while (o.f2998 < i14) {
                            byte[] bArr2 = f2370;
                            if (bArr2 != null) {
                                int i16 = o.f2994;
                                o.f2994 = i16 - 1;
                                o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i16] + s10)) ^ o.f2995));
                            } else {
                                short[] sArr = f2369;
                                int i17 = o.f2994;
                                o.f2994 = i17 - 1;
                                o.f2997 = (char) (o.f2996 + (((short) (sArr[i17] + s10)) ^ o.f2995));
                            }
                            sb2.append(o.f2997);
                            o.f2996 = o.f2997;
                            o.f2998++;
                        }
                    }
                    string = sb2.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return string;
        }
    }
}
