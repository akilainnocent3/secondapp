package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.signals.SignalKey;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ju {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2896 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2898;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Field f2901;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Class f2902;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Field f2903;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Field f2904;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Field f2905;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object f2906;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f2897 = {42624, 61335, 13493, 32219, 33518, 52208, 4117, 22887, 61015, 14160, 31860, 33438, 52207, 4238, 23000, 61159, 14085, 31766, 34086, 51812, 4960, 22647, 61072, 14254, 31940, 34251, 51928, 4868, 22577, 57653, 26048, 11479, 63477, 48795, 16814, 2224, 54101, 39463, 11543, 62480, 48948, 16862, 2223, 54222, 39576, 11687, 62533, 48982, 18022, 2340, 53280, 39735, 11728, 62702, 49028, 18059, 2454, 53317, 39790, 8827, 62736, 48165, 30179, 15564, 59364, 44673, 20916, 6398, 50001, 35435, 15634, 58378, 44863, 20928, 6369, 50110, 35489, 15783, 58440, 44890, 22137, 6425, 49163, 35647, 15832, 58607, 44929, 22171, 6564, 49166, 35696, 12919, 58643, 44089, 22229, 6532, 49334, 65232, 47082, 27875, 9633, 55986, 37808, 18510, 381, 46641, 28428, 9278, 56001, 37880, 18667, 392, 46759, 'm', 18773, 37461, 56108, 9225, 27929, 46784, 65476, 18593, 37281, 55957, 9338, 'm', 18775, 37470, 56088, 9234, 27933, 46816, 65481, 18610, 37309, 55956, 9284, 27977, 46667, 65316, 18445, 37358, 56061, 9154, 'e', 18794, 37442, 56103, 9234, 27992, 46841, 65478, 18656, 37290, 55957, 9336, 27980, 46681, 65331, 18445, 37327, 56054, 9187, 27821, 46469, 65171, 18515, 37191, 55853, 9000, 27676, 46573, 65236, 18397, 37020, 55681, 9075, 27756, 46421, 65062, 18181, 36874, 'm', 18772, 37465, 56123, 9236, 27933, 46846, 65485, 18610, 37265, 55966, 9326, 27983, 7600, 21695, 36759, 50930, 14791, 28813, 43820, 57875, 21813, 35946, 51008, 14761, 28849, 43912, 58086, 21969, 35892, 51007, 15872, 29049, 43123, 58180, 21920, 35985, 51185};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f2900 = -5729520482673932008L;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f2899 = {1693989859, -1419725378, 1431591262, -530433451, 1416486627, 809395253, -709092733, -1795350470, 1541501394, 1205832009, -445660515, 1390802248, -1844616202, -1506937805, 1381387, -1625508086, 1823734382, 2054553513};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<View> m2694() {
        int i10 = f2896 + 91;
        int i11 = i10 % 128;
        f2898 = i11;
        try {
            if (i10 % 2 != 0) {
                throw null;
            }
            if (f2902 != null) {
                int i12 = i11 + 81;
                f2896 = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                if (f2906 == null) {
                    Class<?> cls = Class.forName(m2698(30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (26017 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 32 - KeyEvent.normalizeMetaState(0)).intern());
                    f2902 = cls;
                    f2906 = cls.getMethod(m2704(new int[]{556890859, -1468128419, -2136236283, -1844955760, 351355317, 413759009}, TextUtils.getOffsetAfter("", 0) + 11).intern(), null).invoke(null, null);
                    f2898 = (f2896 + 69) % 128;
                }
            } else {
                Class<?> cls2 = Class.forName(m2698(30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (26017 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 32 - KeyEvent.normalizeMetaState(0)).intern());
                f2902 = cls2;
                f2906 = cls2.getMethod(m2704(new int[]{556890859, -1468128419, -2136236283, -1844955760, 351355317, 413759009}, TextUtils.getOffsetAfter("", 0) + 11).intern(), null).invoke(null, null);
                f2898 = (f2896 + 69) % 128;
            }
            return m2705(f2902, f2906);
        } catch (Throwable th2) {
            String strIntern = m2704(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, View.resolveSizeAndState(0, 0, 0) + 12).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2698(View.resolveSizeAndState(0, 0, 0) + 62, (char) (Gravity.getAbsoluteGravity(0, 0) + 30118), View.resolveSizeAndState(0, 0, 0) + 35).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m2764(strIntern, sb2.toString());
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static View.OnClickListener m2697(View view) {
        try {
            Object objM2701 = m2701(view);
            if (objM2701 == null) {
                return null;
            }
            Class<?> cls = objM2701.getClass();
            synchronized (jx.class) {
                try {
                    if (f2903 == null) {
                        f2903 = m2693(cls, m2704(new int[]{1647960652, 67504897, 741322149, -1831457172, 985675184, 2052053239, 1182144666, -1060623268}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16).intern());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (View.OnClickListener) f2903.get(objM2701);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2702(MediaPlayer mediaPlayer, hc.c cVar) {
        Field fieldM2693;
        MediaPlayer.OnInfoListener onInfoListener;
        int i10 = f2898 + 31;
        f2896 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                fieldM2693 = m2693(MediaPlayer.class, m2704(new int[]{-1895515866, 2007252617, -855096600, -395418748, -2032507226, -2124753146, -1700934117, -1787212973}, 35 << (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
                onInfoListener = (MediaPlayer.OnInfoListener) fieldM2693.get(mediaPlayer);
                if (onInfoListener instanceof hc) {
                    return;
                }
            } else {
                fieldM2693 = m2693(MediaPlayer.class, m2704(new int[]{-1895515866, 2007252617, -855096600, -395418748, -2032507226, -2124753146, -1700934117, -1787212973}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14).intern());
                onInfoListener = (MediaPlayer.OnInfoListener) fieldM2693.get(mediaPlayer);
                if (onInfoListener instanceof hc) {
                    return;
                }
            }
            fieldM2693.set(mediaPlayer, new hc(onInfoListener, cVar));
            f2898 = (f2896 + 41) % 128;
        } catch (Exception e10) {
            kd.m2827(m2704(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m2704(new int[]{1202942275, 1897688176, -829805524, -1025134213, 1116418967, 1798637843, -175482886, -479946770, -271803417, 1054543464, -1928011288, 901128282, -855096600, -395418748, -2032507226, -2124753146, -1700934117, -1787212973}, 34 - MotionEvent.axisFromString("")).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<View> m2705(Class cls, Object obj) throws Exception {
        if (f2905 == null) {
            f2896 = (f2898 + 77) % 128;
            Field declaredField = cls.getDeclaredField(m2704(new int[]{1263426752, 2116323096, 488600841, 147584518}, 5 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
            f2905 = declaredField;
            declaredField.setAccessible(true);
        }
        Object obj2 = f2905.get(obj);
        if (!(obj2 instanceof List)) {
            if (!(obj2 instanceof View[])) {
                return new ArrayList();
            }
            List<View> listAsList = Arrays.asList((View[]) f2905.get(obj));
            f2898 = (f2896 + 53) % 128;
            return listAsList;
        }
        int i10 = f2896 + 89;
        f2898 = i10 % 128;
        if (i10 % 2 == 0) {
            return (List) f2905.get(obj);
        }
        List<View> list = (List) f2905.get(obj);
        int i11 = 45 / 0;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2699(MediaPlayer mediaPlayer, hj.c cVar) {
        f2898 = (f2896 + 23) % 128;
        try {
            Field fieldM2693 = m2693(MediaPlayer.class, m2704(new int[]{311139306, -1643041027, 1131013996, 1064934420, -660697305, -992132226, -556094993, 686564194, -2032507226, -2124753146, -1700934117, -1787212973}, 23 - TextUtils.indexOf("", "", 0, 0)).intern());
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM2693.get(mediaPlayer);
            if (onSeekCompleteListener instanceof hj) {
                return;
            }
            fieldM2693.set(mediaPlayer, new hj(onSeekCompleteListener, cVar));
            f2896 = (f2898 + 125) % 128;
        } catch (Exception e10) {
            kd.m2827(m2704(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 12).intern(), m2698((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 144, (char) (Process.getGidForName("") + 1), 38 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2703(MediaPlayer mediaPlayer, he.a aVar) {
        Field fieldM2693;
        MediaPlayer.OnPreparedListener onPreparedListener;
        int i10 = f2898 + 11;
        f2896 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                fieldM2693 = m2693(MediaPlayer.class, m2698(SignalKey.EVENT_ID % View.MeasureSpec.makeMeasureSpec(1, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 75), 36 - (ViewConfiguration.getJumpTapTimeout() >>> 97)).intern());
                onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM2693.get(mediaPlayer);
                if (!(onPreparedListener instanceof he)) {
                    fieldM2693.set(mediaPlayer, new he(onPreparedListener, aVar));
                }
            } else {
                fieldM2693 = m2693(MediaPlayer.class, m2698(125 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 19 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
                onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM2693.get(mediaPlayer);
                if (!(onPreparedListener instanceof he)) {
                    fieldM2693.set(mediaPlayer, new he(onPreparedListener, aVar));
                }
            }
            int i11 = f2896 + 63;
            f2898 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Exception e10) {
            kd.m2827(m2704(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, ExpandableListView.getPackedPositionGroup(0L) + 12).intern(), m2704(new int[]{1202942275, 1897688176, -829805524, -1025134213, 1116418967, 1798637843, -175482886, -479946770, -271803417, 1054543464, 1986917678, 1957659000, -1494872016, 1653228110, 177372123, -1175409444, -2032507226, -2124753146, -1700934117, -1787212973}, 39 - Gravity.getAbsoluteGravity(0, 0)).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2696(View view, hd.d dVar) {
        int i10 = f2898 + 113;
        f2896 = i10 % 128;
        if (i10 % 2 != 0) {
            View.OnClickListener onClickListenerM2697 = m2697(view);
            if (onClickListenerM2697 instanceof hd) {
                return;
            }
            view.setOnClickListener(new hd(onClickListenerM2697, dVar));
            f2898 = (f2896 + 123) % 128;
            return;
        }
        m2697(view);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2704(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2899.clone();
                e.f1913 = 0;
                while (true) {
                    int i11 = e.f1913;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1915 = (c10 << 16) + c11;
                        e.f1914 = (c12 << 16) + c13;
                        e.m2090(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1915 ^ iArr2[i13];
                            e.f1915 = i14;
                            e.f1914 = e.m2089(i14) ^ e.f1914;
                            int i15 = e.f1915;
                            e.f1915 = e.f1914;
                            e.f1914 = i15;
                        }
                        int i16 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i16;
                        e.f1914 = i16 ^ iArr2[16];
                        e.f1915 ^= iArr2[17];
                        int i17 = e.f1914;
                        int i18 = e.f1915;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1914;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m2090(iArr2);
                        int i20 = e.f1913;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1913 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2700(View view, hh.c cVar) {
        f2896 = (f2898 + 79) % 128;
        View.OnTouchListener onTouchListenerM2692 = m2692(view);
        if (!(onTouchListenerM2692 instanceof hh)) {
            view.setOnTouchListener(new hh(onTouchListenerM2692, cVar));
        }
        int i10 = f2896 + 73;
        f2898 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 48 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2698(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2897[i10 + i12]) ^ (((long) i12) * f2900)) ^ ((long) c10));
                        d.f1652 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static View.OnTouchListener m2692(View view) {
        try {
            Object objM2701 = m2701(view);
            if (objM2701 == null) {
                return null;
            }
            Class<?> cls = objM2701.getClass();
            synchronized (jx.class) {
                try {
                    if (f2901 == null) {
                        f2901 = m2693(cls, m2698(97 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 65212), '@' - AndroidCharacter.getMirror('0')).intern());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (View.OnTouchListener) f2901.get(objM2701);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Object m2701(View view) {
        try {
            synchronized (jx.class) {
                try {
                    if (f2904 == null) {
                        f2904 = m2693(View.class, m2698(182 - (ViewConfiguration.getTouchSlop() >> 8), (char) TextUtils.getTrimmedLength(""), 13 - TextUtils.getOffsetAfter("", 0)).intern());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return f2904.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.media.MediaPlayer m2691(android.widget.VideoView r7) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.ju.f2898
            r1 = 107(0x6b, float:1.5E-43)
            int r0 = r0 + r1
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ju.f2896 = r2
            int r0 = r0 % 2
            r2 = 12
            java.lang.Class<android.widget.VideoView> r3 = android.widget.VideoView.class
            java.lang.String r4 = ""
            r5 = 0
            if (r0 != 0) goto L37
            r0 = 1
            int r1 = android.text.TextUtils.lastIndexOf(r4, r1, r5, r0)     // Catch: java.lang.Exception -> L35
            int r1 = 69 - r1
            int r0 = android.view.KeyEvent.normalizeMetaState(r0)     // Catch: java.lang.Exception -> L35
            char r0 = (char) r0     // Catch: java.lang.Exception -> L35
            int r6 = android.text.TextUtils.indexOf(r4, r4, r5, r5)     // Catch: java.lang.Exception -> L35
            int r6 = 66 - r6
            java.lang.String r0 = m2698(r1, r0, r6)     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Field r0 = m2693(r3, r0)     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L5f
            goto L58
        L35:
            r7 = move-exception
            goto L68
        L37:
            r0 = 48
            int r0 = android.text.TextUtils.lastIndexOf(r4, r0, r5, r5)     // Catch: java.lang.Exception -> L35
            int r0 = 112 - r0
            int r1 = android.view.KeyEvent.normalizeMetaState(r5)     // Catch: java.lang.Exception -> L35
            char r1 = (char) r1     // Catch: java.lang.Exception -> L35
            int r6 = android.text.TextUtils.indexOf(r4, r4, r5, r5)     // Catch: java.lang.Exception -> L35
            int r6 = 12 - r6
            java.lang.String r0 = m2698(r0, r1, r6)     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Field r0 = m2693(r3, r0)     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L5f
        L58:
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Exception -> L35
            android.media.MediaPlayer r7 = (android.media.MediaPlayer) r7     // Catch: java.lang.Exception -> L35
            return r7
        L5f:
            int r7 = com.ironsource.adqualitysdk.sdk.i.ju.f2898
            int r7 = r7 + 71
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.ju.f2896 = r7
            goto L95
        L68:
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x0098: FILL_ARRAY_DATA , data: [-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217} // fill-array
            int r1 = android.text.TextUtils.getOffsetAfter(r4, r5)
            int r1 = 12 - r1
            java.lang.String r0 = m2704(r0, r1)
            java.lang.String r0 = r0.intern()
            int[] r1 = new int[r2]
            r1 = {x00a8: FILL_ARRAY_DATA , data: [1202942275, 1897688176, -829805524, -1025134213, 116532778, 423569652, -1341074123, -559565256, -25114885, -724874080, -138387675, -1770855416} // fill-array
            float r2 = android.media.AudioTrack.getMinVolume()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            int r2 = r2 + 23
            java.lang.String r1 = m2704(r1, r2)
            java.lang.String r1 = r1.intern()
            com.ironsource.adqualitysdk.sdk.i.kd.m2827(r0, r1, r7, r5)
        L95:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ju.m2691(android.widget.VideoView):android.media.MediaPlayer");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2695(MediaPlayer mediaPlayer, hf.b bVar) {
        Field fieldM2693;
        MediaPlayer.OnCompletionListener onCompletionListener;
        int i10 = f2898 + 35;
        f2896 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                fieldM2693 = m2693(MediaPlayer.class, m2704(new int[]{1647960652, 67504897, -660697305, -992132226, 992778767, -2108873839, -969657476, 2116265575, 1492887406, -1736412598, 463314251, -255628082}, (ViewConfiguration.getMaximumFlingVelocity() - 4) * 71).intern());
                onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM2693.get(mediaPlayer);
                if (!(onCompletionListener instanceof hf)) {
                    fieldM2693.set(mediaPlayer, new hf(onCompletionListener, bVar));
                }
            } else {
                fieldM2693 = m2693(MediaPlayer.class, m2704(new int[]{1647960652, 67504897, -660697305, -992132226, 992778767, -2108873839, -969657476, 2116265575, 1492887406, -1736412598, 463314251, -255628082}, 21 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
                onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM2693.get(mediaPlayer);
                if (!(onCompletionListener instanceof hf)) {
                    fieldM2693.set(mediaPlayer, new hf(onCompletionListener, bVar));
                }
            }
            int i11 = f2896 + 79;
            f2898 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Exception e10) {
            kd.m2827(m2704(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, 11 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), m2704(new int[]{1202942275, 1897688176, -829805524, -1025134213, 1116418967, 1798637843, -175482886, -479946770, -271803417, 1054543464, -1524524405, 1676793468, -660697305, -992132226, 992778767, -2108873839, -969657476, 2116265575, 1492887406, -1736412598, 463314251, -255628082}, TextUtils.indexOf("", "", 0, 0) + 41).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field m2693(Class cls, String str) {
        int i10 = f2896 + 59;
        f2898 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            f2898 = (f2896 + 97) % 128;
            return declaredField;
        } catch (Exception e10) {
            kd.m2827(m2704(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern(), m2698(TextUtils.indexOf((CharSequence) "", '0') + 196, (char) (7638 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 25).intern(), e10, false);
            return null;
        }
    }
}
