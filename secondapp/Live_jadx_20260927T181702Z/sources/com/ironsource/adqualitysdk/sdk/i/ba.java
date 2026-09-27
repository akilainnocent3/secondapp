package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.signals.SignalKey;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ba {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f708 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f709 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f710 = {-1651954596, -790938195, 992154125, 913496587, -1926373809, 669856641, -301240990, 786897866, -773343164, 1760198774, -235625106, -467461580, 1141034504, 1909661372, -2102263130, -431286527, 318154931, 71342177};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f711 = 112;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private b f712 = b.f727;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private c f713 = c.f744;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f714;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f715;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f716;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f717;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f718;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f719;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ba$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static final /* synthetic */ int[] f720;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static final /* synthetic */ int[] f721;

        static {
            int[] iArr = new int[c.valuesCustom().length];
            f720 = iArr;
            try {
                iArr[c.f737.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f720[c.f740.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f720[c.f742.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f720[c.f741.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f720[c.f743.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[b.valuesCustom().length];
            f721 = iArr2;
            try {
                iArr2[b.f730.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f721[b.f729.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f721[b.f728.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f721[b.f723.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f721[b.f731.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        f727,
        f730,
        f729,
        f728,
        f731,
        f723;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f722 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f724 = 1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char[] f725;

        static {
            m739();
            f724 = (f722 + 35) % 128;
        }

        public static b valueOf(String str) {
            f722 = (f724 + 29) % 128;
            b bVar = (b) Enum.valueOf(b.class, str);
            int i10 = f724 + 55;
            f722 = i10 % 128;
            if (i10 % 2 == 0) {
                return bVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            f722 = (f724 + 105) % 128;
            b[] bVarArr = (b[]) values().clone();
            f724 = (f722 + 27) % 128;
            return bVarArr;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m738(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes(CharEncoding.ISO_8859_1);
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (i.f2448) {
                try {
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    int i12 = iArr[2];
                    int i13 = iArr[3];
                    char[] cArr = new char[i11];
                    System.arraycopy(f725, i10, cArr, 0, i11);
                    if (bArr != null) {
                        char[] cArr2 = new char[i11];
                        i.f2447 = 0;
                        char c10 = 0;
                        while (true) {
                            int i14 = i.f2447;
                            if (i14 >= i11) {
                                break;
                            }
                            if (bArr[i14] == 1) {
                                cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                            } else {
                                cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                            }
                            c10 = cArr2[i14];
                            i.f2447 = i14 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i13 > 0) {
                        char[] cArr3 = new char[i11];
                        System.arraycopy(cArr, 0, cArr3, 0, i11);
                        int i15 = i11 - i13;
                        System.arraycopy(cArr3, 0, cArr, i15, i13);
                        System.arraycopy(cArr3, i13, cArr, 0, i15);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i11];
                        i.f2447 = 0;
                        while (true) {
                            int i16 = i.f2447;
                            if (i16 >= i11) {
                                break;
                            }
                            cArr4[i16] = cArr[(i11 - i16) - 1];
                            i.f2447 = i16 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i12 > 0) {
                        i.f2447 = 0;
                        while (true) {
                            int i17 = i.f2447;
                            if (i17 >= i11) {
                                break;
                            }
                            cArr[i17] = (char) (cArr[i17] - iArr[2]);
                            i.f2447 = i17 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static void m739() {
            f725 = new char[]{'\'', 'I', 'N', '_', 190, 197, 196, 190, 193, 196, 195, '#', 'H', 'K', 'K', 'N', 'N', 'E', 'F', 'J', 'Q', 'Q', 'K', '\'', 'M', 257, 257, 258, 265, 255, 254, 272, 262, 133, 264, 264, 266, 259};
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c {
        f744,
        f740,
        f742,
        f741,
        f743,
        f737;


        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static boolean f732 = false;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f733 = 0;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f734 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f735;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static char[] f736;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static boolean f739;

        static {
            m740();
            int i10 = f734 + 95;
            f733 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 57 / 0;
            }
        }

        public static c valueOf(String str) {
            f734 = (f733 + 41) % 128;
            c cVar = (c) Enum.valueOf(c.class, str);
            f733 = (f734 + 5) % 128;
            return cVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            f733 = (f734 + 61) % 128;
            c[] cVarArr = (c[]) values().clone();
            f733 = (f734 + 75) % 128;
            return cVarArr;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static void m740() {
            f739 = true;
            f732 = true;
            f735 = 196;
            f736 = new char[]{274, 275, 265, 283, 278, 291, 261, 267, 280, 277, 281, 269, 264, 279, 276, 271, 282, 272, 286, 266, 263};
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m741(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes(CharEncoding.ISO_8859_1);
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (m.f2988) {
                try {
                    char[] cArr2 = f736;
                    int i11 = f735;
                    if (f732) {
                        int length = bArr.length;
                        m.f2990 = length;
                        char[] cArr3 = new char[length];
                        m.f2989 = 0;
                        while (m.f2989 < m.f2990) {
                            int i12 = m.f2989;
                            int i13 = m.f2990 - 1;
                            int i14 = m.f2989;
                            cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                            m.f2989 = i14 + 1;
                        }
                        return new String(cArr3);
                    }
                    if (f739) {
                        int length2 = cArr.length;
                        m.f2990 = length2;
                        char[] cArr4 = new char[length2];
                        m.f2989 = 0;
                        while (m.f2989 < m.f2990) {
                            int i15 = m.f2989;
                            int i16 = m.f2990 - 1;
                            int i17 = m.f2989;
                            cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                            m.f2989 = i17 + 1;
                        }
                        return new String(cArr4);
                    }
                    int length3 = iArr.length;
                    m.f2990 = length3;
                    char[] cArr5 = new char[length3];
                    m.f2989 = 0;
                    while (m.f2989 < m.f2990) {
                        int i18 = m.f2989;
                        int i19 = m.f2990 - 1;
                        int i20 = m.f2989;
                        cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                        m.f2989 = i20 + 1;
                    }
                    return new String(cArr5);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public ba(String str) {
        this.f718 = str;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m725() {
        f708 = (f709 + 89) % 128;
        String strName = this.f712.name();
        f708 = (f709 + 125) % 128;
        return strName;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m726() {
        int i10 = f708;
        f709 = (i10 + 29) % 128;
        if (this.f715 != null) {
            f709 = (i10 + 77) % 128;
            if (this.f717 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m730("ￃ\ufff6\uffe7￮ￃ\ufff9\b\u0015\u0016\f\u0012\u0011\u0016ￃ\u0016\u0018\u0013\u0013\u0012\u0015\u0017\b\u0007\uffdd", 24 - Color.red(0), false, -TextUtils.lastIndexOf("", '0', 0), 206 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                sb2.append(this.f715);
                sb2.append(m732(new int[]{-1791069471, -903715253}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3).intern());
                sb2.append(this.f717);
                return sb2.toString();
            }
        }
        int i11 = f709 + 53;
        f708 = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m727() {
        if (this.f718.equals(m730("\u0006\ufff3\uffff\u0002\ufff4\u0014\u0002", ((byte) KeyEvent.getModifierMetaStateMask()) + 8, true, 4 - TextUtils.lastIndexOf("", '0'), 211 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m729());
        sb3.append(m732(new int[]{73906157, -1654754441}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern());
        sb2.append(sb3.toString());
        String strM731 = m731();
        if (strM731 != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(strM731);
            sb4.append(m732(new int[]{73906157, -1654754441}, 1 - ExpandableListView.getPackedPositionType(0L)).intern());
            sb2.append(sb4.toString());
        }
        String strM726 = m726();
        if (strM726 != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(strM726);
            sb5.append(m732(new int[]{73906157, -1654754441}, Color.argb(0, 0, 0, 0) + 1).intern());
            sb2.append(sb5.toString());
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(m730("\u0019\u0006\u0019\ufff8ￅ\uffdf\u0018\u001a", KeyEvent.getDeadChar(0, 0) + 8, true, TextUtils.lastIndexOf("", '0', 0, 0) + 5, 203 - Color.red(0)).intern());
        sb6.append(m725());
        sb6.append(m732(new int[]{73906157, -1654754441}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
        sb2.append(sb6.toString());
        b bVar = this.f712;
        if (bVar != b.f728) {
            int i10 = f708 + SignalKey.EVENT_ID;
            f709 = i10 % 128;
            if (i10 % 2 != 0) {
                b bVar2 = b.f731;
                throw null;
            }
            if (bVar != b.f731) {
                String strM728 = m728(this.f713);
                if (strM728 != null) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(m730("\u001b\u001b\r\ufff5\uffc8￢\r\u000f\t", View.MeasureSpec.makeMeasureSpec(0, 0) + 9, true, ExpandableListView.getPackedPositionType(0L) + 4, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 200).intern());
                    sb7.append(strM728);
                    sb2.append(sb7.toString());
                }
                k.m2769(m730("\u0006￣￭￦\ufff5\u001b\u0016\u000b\u000e\u0003\u0017\ufff3", 12 - View.resolveSizeAndState(0, 0, 0), true, TextUtils.indexOf((CharSequence) "", '0', 0) + 3, 206 - TextUtils.getTrimmedLength("")).intern(), sb2.toString());
                f708 = (f709 + 53) % 128;
                return;
            }
        }
        k.m2776(m730("\u0006￣￭￦\ufff5\u001b\u0016\u000b\u000e\u0003\u0017\ufff3", Color.argb(0, 0, 0, 0) + 12, true, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3, 206 - Color.alpha(0)).intern(), sb2.toString());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m728(c cVar) {
        int i10 = f708 + 89;
        f709 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (cVar != null) {
            int i11 = AnonymousClass2.f720[cVar.ordinal()];
            if (i11 == 1) {
                return m732(new int[]{137488030, -359922737, -2017774956, 1751944291, -1219746495, 1032070237, 1584024098, -1787785060, 926411803, 1010934812, -2074228985, -1614840226}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22).intern();
            }
            if (i11 == 2) {
                String str = String.format(m732(new int[]{451501713, 1405190935, -171910612, 1274250387, 1195938589, 1238607191, 1132235826, 310786192, -1518597579, 636733615, -907901415, -563455962, -90577279, 1750423757, 571822032, 586410798, 1220481365, -1395748232, -2001810257, 626156600, 1375904924, -1657499583, 1195938589, 1238607191, 1132235826, 310786192, 323998113, -234917244, -2054184062, 2137770738, 1566473387, -1273628156}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 62).intern(), this.f718, this.f716, this.f714);
                f708 = (f709 + 3) % 128;
                return str;
            }
            if (i11 == 3) {
                return String.format(m730("ￅ\u0019\u0014\u0013ￅ\u0018\u000eￅ\u0018ￊￅ\u0013\u0014\u000e\u0018\u0017\n\u001bￅ\ufff0￩\ufff8ￅ\u0018ￊ\u0017\u0014\u0019\b\n\u0013\u0013\u0014\bￅ\n\r\u0019ￅ\u001e\u0007ￅ\t\n\u0019\u0017\u0014\u0015\u0015\u001a\u0018ￅ\u0019\n\u001e", ExpandableListView.getPackedPositionChild(0L) + 56, true, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24, Color.green(0) + 203).intern(), this.f718, this.f716);
            }
            if (i11 == 4) {
                return m730("\u0001ﾾ\u0003\u0018\u0007\n\uffff\u0007\u0012\u0007\f\u0007ﾾ\r\u0012ﾾ\u0002\u0003\n\u0007\uffff￤\u0010\r\u0012\u0001\u0003\f\f\r", 31 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, 22 - TextUtils.getTrimmedLength(""), 210 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
            }
            if (i11 == 5) {
                return m730("\u0014\u000f\u0012￦\u0001\t\f\u0005\u0004\uffc0\u0014\u000f\uffc0\u0003\u0012\u0005\u0001\u0014\u0005\uffc0\u0003\u000f\u000e\u000e\u0005\u0003", 27 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), false, Color.argb(0, 0, 0, 0) + 3, 208 - View.MeasureSpec.getSize(0)).intern();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m729() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m732(new int[]{-1305707743, 2105371948, -1305707743, 2105371948, -1305707743, 2105371948, -1885524501, 766283140}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14).intern());
        sb2.append(this.f718);
        sb2.append(m730("ￂ\u0005\u0011\u0010\u0010\u0007\u0005\u0016\u0011\u0014ￂ", 11 - View.combineMeasuredStates(0, 0), false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, 206 - (Process.myPid() >> 22)).intern());
        String string = sb2.toString();
        if (this.f719 != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(this.f719);
            sb3.append(m732(new int[]{506916697, 2073069639}, -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            string = sb3.toString();
            f708 = (f709 + 1) % 128;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string);
        sb4.append(m730("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, true, (ViewConfiguration.getWindowTouchSlop() >> 8) + 3, 157 - TextUtils.indexOf("", "", 0)).intern());
        String string2 = sb4.toString();
        int i10 = f709 + 73;
        f708 = i10 % 128;
        if (i10 % 2 != 0) {
            return string2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m731() {
        if (this.f718 != null) {
            int i10 = f708 + 83;
            f709 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            String strIntern = this.f716;
            if (strIntern != null) {
                if (strIntern.equals(m730("\ufff0\u0002\u000f", 3 - ExpandableListView.getPackedPositionGroup(0L), false, 2 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getTrimmedLength("") + HideBottomViewOnScrollBehavior.f50183l).intern())) {
                    f709 = (f708 + 31) % 128;
                    if (this.f712 != b.f731) {
                        int i11 = f708 + 95;
                        f709 = i11 % 128;
                        strIntern = (i11 % 2 != 0 ? m732(new int[]{1998754247, -1627987434, 933966035, -919751033, -1173963287, -365185903}, 37 >> View.MeasureSpec.getMode(0)) : m732(new int[]{1998754247, -1627987434, 933966035, -919751033, -1173963287, -365185903}, 11 - View.MeasureSpec.getMode(0))).intern();
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f718);
                sb2.append(m732(new int[]{401584120, 1315452641, 1370400122, -1742726920, 126769399, -1909906021, -126146041, 1467086522}, Color.alpha(0) + 14).intern());
                sb2.append(strIntern);
                String string = sb2.toString();
                int i12 = f709 + 51;
                f708 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 83 / 0;
                }
                return string;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x007a  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m737(cm cmVar) {
        f709 = (f708 + 57) % 128;
        cmVar.m1567();
        this.f718 = cmVar.m1563();
        this.f719 = cmVar.m1566();
        this.f716 = cmVar.m1558();
        if (m730("\uffff\u0006￼\ufffb\b\uffff\ufffe", TextUtils.indexOf("", "", 0) + 7, true, 5 - ImageFormat.getBitsPerPixel(0), 183 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern().equals(this.f716)) {
            this.f716 = m730("\ufff0\u0002\u000f", 2 - TextUtils.lastIndexOf("", '0'), false, 2 - (Process.myPid() >> 22), TextUtils.getOffsetAfter("", 0) + HideBottomViewOnScrollBehavior.f50183l).intern();
        } else {
            f709 = (f708 + 17) % 128;
            if (m730("�\u0002\f\ufffa\ufffb\u0005\ufffe�", 8 - ExpandableListView.getPackedPositionType(0L), false, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, (ViewConfiguration.getScrollBarSize() >> 8) + 183).intern().equals(this.f716)) {
                this.f716 = m730("\ufff0\u0002\u000f", 2 - TextUtils.lastIndexOf("", '0'), false, 2 - (Process.myPid() >> 22), TextUtils.getOffsetAfter("", 0) + HideBottomViewOnScrollBehavior.f50183l).intern();
            }
        }
        this.f715 = cmVar.m1559();
        this.f717 = cmVar.m1560();
        this.f714 = cmVar.m1561();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m730(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (com.ironsource.adqualitysdk.sdk.i.b.f706) {
            try {
                char[] cArr2 = new char[i10];
                com.ironsource.adqualitysdk.sdk.i.b.f704 = 0;
                while (true) {
                    int i13 = com.ironsource.adqualitysdk.sdk.i.b.f704;
                    if (i13 >= i10) {
                        break;
                    }
                    com.ironsource.adqualitysdk.sdk.i.b.f705 = cArr[i13];
                    cArr2[com.ironsource.adqualitysdk.sdk.i.b.f704] = (char) (com.ironsource.adqualitysdk.sdk.i.b.f705 + i12);
                    int i14 = com.ironsource.adqualitysdk.sdk.i.b.f704;
                    cArr2[i14] = (char) (cArr2[i14] - f711);
                    com.ironsource.adqualitysdk.sdk.i.b.f704 = i14 + 1;
                }
                if (i11 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.b.f707 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = com.ironsource.adqualitysdk.sdk.i.b.f707;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = com.ironsource.adqualitysdk.sdk.i.b.f707;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    com.ironsource.adqualitysdk.sdk.i.b.f704 = 0;
                    while (true) {
                        int i17 = com.ironsource.adqualitysdk.sdk.i.b.f704;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        com.ironsource.adqualitysdk.sdk.i.b.f704 = i17 + 1;
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m733() {
        f709 = (f708 + 17) % 128;
        b bVar = this.f712;
        if (bVar != b.f730 && bVar != b.f729) {
            f708 = (f709 + 29) % 128;
            if (bVar != b.f727) {
                return false;
            }
        }
        int i10 = f709 + 37;
        f708 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 67 / 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m735(b bVar) {
        f709 = (f708 + 51) % 128;
        this.f712 = bVar;
        if (bVar != b.f723) {
            int i10 = f709 + 5;
            f708 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f713 = c.f744;
                throw null;
            }
            this.f713 = c.f744;
        }
        int i11 = AnonymousClass2.f721[bVar.ordinal()];
        if (i11 == 3 || i11 == 4 || i11 == 5) {
            m727();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m736(c cVar) {
        f708 = (f709 + 11) % 128;
        this.f713 = cVar;
        m735(b.f723);
        int i10 = f708 + 125;
        f709 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m734() {
        f708 = (f709 + 53) % 128;
        String strM728 = m728(this.f713);
        int i10 = f709 + 89;
        f708 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM728;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m732(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f710.clone();
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
}
