package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.MyTargetView;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.BaseAd;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.AudioData;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class bz extends bd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1181 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1182 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f1183 = null;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1184 = 291822268;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f1185 = {l3.a.f103493v7, l3.a.f103436o7, 8, 49, l3.a.f103529z7, 47, l3.a.f103502w7, 8, 1, -9, 8, -2, l3.a.f103511x7, -2, 3, -8, -1, 44, l3.a.A7, zi.c.f161639q, -2, -11, 17, 13, -37, 44, -52, -1, 6, -10, 1, 13, zi.c.f161639q, -30, zi.c.f161639q, -2, -11, 17, 13, -37, 44, l3.a.f103520y7, 5, zi.c.f161635m, -13, 13, -11, 17, 34, l3.a.f103520y7, zi.c.f161639q, -2, -11, 17, 13, -37, 44, -30, 5, zi.c.f161635m, -13, 13, -11, 17, 34, l3.a.f103520y7, zi.c.f161639q, -2, -11, 17, 13, -37, 44, 31, l3.a.f103436o7, -1, 2, 0, -2, zi.c.f161636n, 53, -70, zi.c.f161639q, -2, -11, 17, -19, 70, -75, zi.c.f161636n, 63, l3.a.f103444p7, -2, zi.c.f161636n, l3.a.f103476t7, -19, 19, zi.c.G, -43, 10, 1, -5, 19, l3.a.f103476t7, -19, 19, zi.c.G, -43, 6, 5, -17, 52, l3.a.A7, 35, -43, zi.c.f161635m, -8, -11, zi.c.f161635m, -11, 1, 1, 13, -15, 6, 37, -28, f6.q.f83622z, zi.c.f161643u, 31, l3.a.f103511x7, 35, -43, zi.c.f161635m, -8, -11, zi.c.f161635m, -11, 1, 1, 13, -15, 6, 37, l3.a.f103484u7, 35, -35, -1, 1, f6.q.f83622z, 17, -22, zi.c.f161643u, 19, l3.a.A7, 13, -9, 9, -15, 1, 10, zi.c.G, f6.q.B, 35, -35, -1, 1, f6.q.f83622z, 17, -22, zi.c.f161643u, 19, l3.a.f103493v7, zi.c.f161643u, -4, 19, -30, zi.c.f161639q, -2, -11, 17, 13, -37, 44, l3.a.f103460r7, -21, 17, zi.c.f161648z, -17, 35, -47, 13, -9, 9, -15, 1, 10, zi.c.G, -43, zi.c.f161643u, -4, 19, -30, zi.c.f161639q, -2, -11, 17, 13, -37, 44};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1186 = 29;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1187 = -279939345;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1188 = 67;

    public bz(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1317(Reward reward) {
        int i10 = f1181 + 99;
        f1182 = i10 % 128;
        int i11 = i10 % 2;
        String str = reward.type;
        if (i11 == 0) {
            throw null;
        }
        int i12 = f1181 + 85;
        f1182 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 51 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1318(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f1186);
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1319(Reward reward) {
        int i10 = f1181 + 25;
        f1182 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1317(reward);
        }
        m1317(reward);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        map.put(m1318("￫\r\ufffe\u0000\ufffe\t\u0012￭�\u000b\ufffa\u0010\ufffe", 13 - (Process.myPid() >> 22), true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, 132 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bz.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bz.m1319((Reward) list.get(0));
            }
        });
        f1182 = (f1181 + 125) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        f1181 = (f1182 + 5) % 128;
        try {
            try {
                String str = (String) MyTargetVersion.class.getDeclaredField(m1318("\b\u0000\u0001\ufffb\u0005\u0004\ufff7", 7 - Color.blue(0), true, View.getDefaultSize(0, 0) + 1, 107 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()).get(null);
                f1182 = (f1181 + 81) % 128;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m2304().m2306().m2406(MyTargetVersion.class, m1316(Gravity.getAbsoluteGravity(0, 0) + 279939345, (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 291822175, (byte) ((-1) - MotionEvent.axisFromString("")), View.MeasureSpec.getSize(0) - 68).intern());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0106  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        byte b10;
        f1181 = (f1182 + 113) % 128;
        switch (str.hashCode()) {
            case -2103294848:
                if (!str.equals(m1316((ViewConfiguration.getDoubleTapTimeout() >> 16) + 279939448, (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-291822203) - Color.green(0), (byte) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 69).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1181 + 51;
                    f1182 = i10 % 128;
                    b10 = i10 % 2 != 0 ? (byte) 9 : (byte) 118;
                }
                break;
            case -1850459313:
                b10 = !str.equals(m1318("\ufffe￬\uffff\u0011\ufffb\f", 6 - Gravity.getAbsoluteGravity(0, 0), false, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 131 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1766129765:
                b10 = !str.equals(m1316(279939372 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) KeyEvent.keyCodeFromString(""), (-291822191) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) ((-16777216) - Color.rgb(0, 0, 0)), View.combineMeasuredStates(0, 0) - 68).intern()) ? (byte) -1 : (byte) 2;
                break;
            case -1282477456:
                b10 = !str.equals(m1318("\u0015\ufff0�\u000e\u0003\u0001\u0010￩�\n�\u0003\u0001\u000e￩", 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 129).intern()) ? (byte) -1 : (byte) 1;
                break;
            case -958537051:
                b10 = !str.equals(m1316(279939439 - Gravity.getAbsoluteGravity(0, 0), (short) (Process.myTid() >> 22), (ViewConfiguration.getWindowTouchSlop() >> 8) - 291822182, (byte) TextUtils.getCapsMode("", 0, 0), (KeyEvent.getMaxKeyCode() >> 16) - 68).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -609786639:
                b10 = !str.equals(m1316((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 279939488, (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (Process.myPid() >> 22) - 291822186, (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-68) - Color.green(0)).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -498709917:
                if (!str.equals(m1318("\ufffe\u0007\ufffe\r\f\u0002￥�ￚ\u0005\ufffa\u0002\r\u0002\r\f\u000b\ufffe\r\u0007￢\u000b", 22 - (ViewConfiguration.getEdgeSlop() >> 16), true, AndroidCharacter.getMirror('0') - 27, 132 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    f1181 = (f1182 + 59) % 128;
                    b10 = zi.c.f161636n;
                }
                break;
            case -393802555:
                if (!str.equals(m1316(279939498 - Process.getGidForName(""), (short) ExpandableListView.getPackedPositionGroup(0L), (-291822186) - TextUtils.getTrimmedLength(""), (byte) (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 68).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f1182 + 67;
                    f1181 = i11 % 128;
                    b10 = i11 % 2 == 0 ? (byte) 15 : (byte) 56;
                }
                break;
            case 65555862:
                b10 = !str.equals(m1316(((byte) KeyEvent.getModifierMetaStateMask()) + 279939536, (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 291822192, (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 67).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 320151695:
                if (!str.equals(m1316(279939475 - TextUtils.getOffsetAfter("", 0), (short) TextUtils.getTrimmedLength(""), Color.rgb(0, 0, 0) - 275044979, (byte) ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getMode(0) - 68).intern())) {
                    b10 = -1;
                } else {
                    f1181 = (f1182 + 63) % 128;
                    b10 = zi.c.f161635m;
                }
                break;
            case 421929408:
                if (!str.equals(m1316(TextUtils.indexOf((CharSequence) "", '0') + 279939458, (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 291822203, (byte) ((-1) - TextUtils.lastIndexOf("", '0')), (Process.myTid() >> 22) - 68).intern())) {
                    b10 = -1;
                } else {
                    f1181 = (f1182 + 7) % 128;
                    b10 = 10;
                }
                break;
            case 448638071:
                b10 = !str.equals(m1318("\u0006\ufffa\u000b\ufffa￩\u0006\b\r\f\u000eￜ\f", 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16), true, 11 - KeyEvent.getDeadChar(0, 0), Color.green(0) + 132).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 487251537:
                if (!str.equals(m1318("\ufffe\u0007\u0002\u0000\u0007\uffde\u0012\r\u0002\u000f\u0002\r￼ￚ", 14 - Drawable.resolveOpacity(0, 0), true, 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 132).intern())) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 544598087:
                b10 = !str.equals(m1316(KeyEvent.normalizeMetaState(0) + 279939402, (short) (AndroidCharacter.getMirror('0') - '0'), ((Process.getThreadPriority(0) + 20) >> 6) - 291822169, (byte) View.getDefaultSize(0, 0), Gravity.getAbsoluteGravity(0, 0) - 68).intern()) ? (byte) -1 : (byte) 4;
                break;
            case 1125320581:
                if (!str.equals(m1318("\u0015\u0002￪\u000e\u0002\b\u0006￥\u0002", View.MeasureSpec.makeMeasureSpec(0, 0) + 9, false, 2 - View.resolveSizeAndState(0, 0, 0), Color.green(0) + 124).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1182 + 95;
                    f1181 = i12 % 128;
                    b10 = i12 % 2 == 0 ? (byte) 8 : (byte) 38;
                }
                break;
            case 1146816194:
                b10 = !str.equals(m1316(279939517 - TextUtils.indexOf("", "", 0), (short) KeyEvent.getDeadChar(0, 0), (-291822191) - KeyEvent.normalizeMetaState(0), (byte) ((-16777216) - Color.rgb(0, 0, 0)), (-69) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 1413638316:
                if (!str.equals(m1316(TextUtils.indexOf("", "", 0, 0) + 279939386, (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-291822192) - TextUtils.lastIndexOf("", '0'), (byte) Gravity.getAbsoluteGravity(0, 0), (-68) - KeyEvent.keyCodeFromString("")).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f1182 + 31;
                    f1181 = i13 % 128;
                    if (i13 % 2 == 0) {
                        b10 = 3;
                    } else {
                        b10 = 5;
                    }
                }
                break;
            case 1955824356:
                if (!str.equals(m1316(279939529 - View.resolveSize(0, 0), (short) Color.argb(0, 0, 0, 0), (-291822204) - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) - 68).intern())) {
                    b10 = -1;
                } else {
                    int i14 = f1181 + 43;
                    f1182 = i14 % 128;
                    b10 = i14 % 2 != 0 ? (byte) 18 : (byte) 33;
                }
                break;
            case 1982630644:
                b10 = !str.equals(m1318("\u000b\u0019\u0007￨\n\uffe7", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, true, 3 - TextUtils.lastIndexOf("", '0', 0), 119 - Color.argb(0, 0, 0, 0)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 2040577055:
                b10 = !str.equals(m1316(279939357 - Drawable.resolveOpacity(0, 0), (short) Drawable.resolveOpacity(0, 0), (-291822191) - ExpandableListView.getPackedPositionGroup(0L), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (-68) - (KeyEvent.getMaxKeyCode() >> 16)).intern()) ? (byte) -1 : (byte) 0;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return MyTargetConfig.class;
            case 1:
                return MyTargetManager.class;
            case 2:
                return MyTargetVersion.class;
            case 3:
            case 4:
                return MyTargetActivity.class;
            case 5:
                return MyTargetActivity.ActivityEngine.class;
            case 6:
                return BaseAd.class;
            case 7:
                return VideoData.class;
            case 8:
                return ImageData.class;
            case 9:
                return AudioData.class;
            case 10:
                return BaseInterstitialAd.class;
            case 11:
                return InterstitialAd.class;
            case 12:
                return InterstitialAd.InterstitialAdListener.class;
            case 13:
                return Reward.class;
            case 14:
                return RewardedAd.class;
            case 15:
                return RewardedAd.RewardedAdListener.class;
            case 16:
                return CustomParams.class;
            case 17:
                return MyTargetView.class;
            case 18:
                f1182 = (f1181 + 33) % 128;
                return MyTargetView.AdSize.class;
            case 19:
                return MyTargetView.MyTargetViewListener.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1316(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1188;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1185;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1187 + i10] + i13);
                    } else {
                        i14 = (short) (f1183[f1187 + i10] + i13);
                    }
                }
                if (i14 > 0) {
                    o.f2994 = ((i10 + i14) - 2) + f1187 + i15;
                    o.f2995 = b10;
                    char c10 = (char) (i11 + f1184);
                    o.f2997 = c10;
                    sb2.append(c10);
                    o.f2996 = o.f2997;
                    o.f2998 = 1;
                    while (o.f2998 < i14) {
                        byte[] bArr2 = f1185;
                        if (bArr2 != null) {
                            int i16 = o.f2994;
                            o.f2994 = i16 - 1;
                            o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i16] + s10)) ^ o.f2995));
                        } else {
                            short[] sArr = f1183;
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
