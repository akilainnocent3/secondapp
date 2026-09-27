package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class cp {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f1382;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> f1383;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private hy.c f1384;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private cn f1385;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hy m1588(ia iaVar) {
        return this.f1384.m2380(iaVar, this.f1383, this.f1382);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e extends cz implements cl {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f1386 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f1387 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f1388 = 6;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f1389 = {'s', 'e', 't', 'M', 'i', 'n', 'D', 'p', 'h', 'F', 'o', 'r', 'S', fw.b.f85389p, 'C', 'l', 'a', 'c', 'W', 'k', 'R', 'f', 'w', 'I', 'A', 'y', 'O', 'b', 'j', 'g', 'm', 'v', 'x', 'z', fw.b.f85382i, '|'};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f1390 = 57;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private cn.e f1391;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private cp f1392;

        public e(List<String> list, int i10) {
            cp cpVar = new cp();
            this.f1392 = cpVar;
            cpVar.f1384 = new hy.c();
            this.f1392.f1383 = list;
            this.f1392.f1382 = i10;
            this.f1391 = new cn.e();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private cp m1589() {
            f1386 = (f1387 + 37) % 128;
            this.f1392.f1385 = this.f1391.m1575();
            cp cpVar = this.f1392;
            f1387 = (f1386 + 91) % 128;
            return cpVar;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m1591(String str, int i10, boolean z10, int i11, int i12) {
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
                        cArr2[i14] = (char) (cArr2[i14] - f1390);
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

        /* JADX WARN: Code duplicated, block: B:10:0x0044  */
        /* JADX WARN: Code duplicated, block: B:112:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:113:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:114:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:115:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:116:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:117:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:118:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:119:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:120:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:121:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:122:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:123:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:124:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:125:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:126:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:127:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:128:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:129:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:12:0x0067  */
        /* JADX WARN: Code duplicated, block: B:13:0x006b  */
        /* JADX WARN: Code duplicated, block: B:15:0x0088  */
        /* JADX WARN: Code duplicated, block: B:16:0x008b  */
        /* JADX WARN: Code duplicated, block: B:18:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:19:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:21:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:22:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:24:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:26:0x0101  */
        /* JADX WARN: Code duplicated, block: B:27:0x0104  */
        /* JADX WARN: Code duplicated, block: B:28:0x0108  */
        /* JADX WARN: Code duplicated, block: B:30:0x0129  */
        /* JADX WARN: Code duplicated, block: B:31:0x012d  */
        /* JADX WARN: Code duplicated, block: B:33:0x014e  */
        /* JADX WARN: Code duplicated, block: B:34:0x0152  */
        /* JADX WARN: Code duplicated, block: B:36:0x016f  */
        /* JADX WARN: Code duplicated, block: B:37:0x017a  */
        /* JADX WARN: Code duplicated, block: B:39:0x019d  */
        /* JADX WARN: Code duplicated, block: B:40:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:42:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:43:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:45:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:46:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:48:0x0211  */
        /* JADX WARN: Code duplicated, block: B:49:0x021c  */
        /* JADX WARN: Code duplicated, block: B:51:0x023d  */
        /* JADX WARN: Code duplicated, block: B:52:0x0241  */
        /* JADX WARN: Code duplicated, block: B:55:0x0269  */
        /* JADX WARN: Code duplicated, block: B:57:0x0291  */
        /* JADX WARN: Code duplicated, block: B:58:0x0294  */
        /* JADX WARN: Code duplicated, block: B:60:0x02b1  */
        /* JADX WARN: Code duplicated, block: B:62:0x02bd  */
        /* JADX WARN: Code duplicated, block: B:63:0x02c0  */
        /* JADX WARN: Code duplicated, block: B:64:0x02c2  */
        /* JADX WARN: Code duplicated, block: B:66:0x02ec  */
        /* JADX WARN: Code duplicated, block: B:67:0x02ee  */
        /* JADX WARN: Code duplicated, block: B:69:0x030c  */
        @Override // com.ironsource.adqualitysdk.sdk.i.cl
        /* JADX INFO: renamed from: ﻐ */
        public final Object mo767(String str, List<Object> list, ch chVar) {
            byte b10;
            int i10;
            int i11;
            int i12 = f1387 + 117;
            f1386 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 88 / 0;
                switch (str.hashCode()) {
                    case -1930334554:
                        if (str.equals(m1590("\u0001\u0002\u0000\u000e\u0004\r\u0011\u0017\u000b\u0014\u0000\u0004\r\n¶", 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (TextUtils.getCapsMode("", 0, 0) + 67)).intern())) {
                            b10 = -1;
                        } else {
                            f1386 = (f1387 + 81) % 128;
                            b10 = 7;
                        }
                        break;
                    case -1826216039:
                        if (str.equals(m1591("\t\u0002\ufff7\u000b\u0007ￛ\ufffb\u0006\u000f\n", 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 163).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 14;
                        }
                        break;
                    case -994397843:
                        if (str.equals(m1590("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\u0004\u000f\u0006\u0001", TextUtils.lastIndexOf("", '0', 0) + 19, (byte) (40 - TextUtils.indexOf("", ""))).intern())) {
                            b10 = -1;
                        } else {
                            i10 = f1386 + 51;
                            f1387 = i10 % 128;
                            if (i10 % 2 == 0) {
                                b10 = 6;
                            } else {
                                b10 = 70;
                            }
                        }
                        break;
                    case -941967812:
                        if (str.equals(m1591("\u000b\f\u0001\u0005\u0001￤\u000b\u000b\ufff9\u0004ￛ\n�\b\r￫\f�", 18 - (ViewConfiguration.getPressedStateDuration() >> 16), true, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), 161 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case -770599694:
                        if (str.equals(m1591("￪\u0006\u000b￡\u0002\r\u0011\u0005￣\f\u000f￠\u0005\u0002\u0000\b\u0010\u0002\u0011", 19 - View.getDefaultSize(0, 0), false, 16 - (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 156).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case -235079533:
                        if (str.equals(m1590("\u0001\u0002\b\u0014\u0011\f\u0007\u0002\u001b\f\u000e\u001b\u001c\u001d\u0005\r\u0003\u0001", 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (58 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern())) {
                            b10 = -1;
                        } else {
                            b10 = zi.c.f161636n;
                        }
                        break;
                    case -213689933:
                        if (str.equals(m1590("\u0001\u0002\u0003\b\t\u0010\u0010\t\u0017\u0013\u0004\r\u0014\u0015\u0003\u0013\u0005\u0007\u0002\u0000\r\u0005Ã", 23 - TextUtils.getTrimmedLength(""), (byte) (TextUtils.getCapsMode("", 0, 0) + 80)).intern())) {
                            b10 = -1;
                        } else {
                            f1386 = (f1387 + 65) % 128;
                            b10 = 5;
                        }
                        break;
                    case 46561673:
                        if (str.equals(m1590("\u0001\u0002\u0000\u000e\u0004\r\u0011\u0017\u000b\u0014\u0000\u001dìì\r\u001cí", (Process.myPid() >> 22) + 17, (byte) (122 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern())) {
                            b10 = -1;
                        } else {
                            f1386 = (f1387 + 115) % 128;
                            b10 = 11;
                        }
                        break;
                    case 94094958:
                        if (str.equals(m1591("\f\ufff9\ufffb\u0003\u0000", 5 - Color.green(0), true, 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 162).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 17;
                        }
                        break;
                    case 841006591:
                        if (str.equals(m1591("\uffff\n\u000e\u0002￠\t\f\uffdd\t\u0006\u0006\uffff�\u000e\u0003\t\b\r\r\uffff\u000e\uffe7\u0003\b\uffde", 25 - KeyEvent.getDeadChar(0, 0), false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, View.resolveSizeAndState(0, 0, 0) + 159).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 8;
                        }
                        break;
                    case 902024524:
                        if (str.equals(m1590("\u0005\u0000\u0001\u0003\u0011\u0004\r\u0005\u001b\u0014", 9 - Process.getGidForName(""), (byte) (KeyEvent.getDeadChar(0, 0) + 112)).intern())) {
                            b10 = -1;
                        } else {
                            f1386 = (f1387 + 9) % 128;
                            b10 = 15;
                        }
                        break;
                    case 923334616:
                        if (str.equals(m1591("\u0001\b�￼\u000e\f\r\b\u0006ￜ\u0001\ufffe￼\u0004￦\ufffe\r", 17 - TextUtils.getCapsMode("", 0, 0), false, '3' - AndroidCharacter.getMirror('0'), AndroidCharacter.getMirror('0') + 'p').intern())) {
                            b10 = -1;
                        } else {
                            b10 = 16;
                        }
                        break;
                    case 1080975014:
                        if (str.equals(m1591("\u0006\t\uffdd\b￣\u0002�\f\ufffb\uffff￭\u000e\uffff\r\r\b\t\u0003\u000e�\uffff\u0006", TextUtils.indexOf("", "", 0, 0) + 22, true, KeyEvent.getDeadChar(0, 0) + 14, 158 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 9;
                        }
                        break;
                    case 1083215325:
                        if (str.equals(m1590("\u0005\u0001\u001e\u0006\u0001\u0005#\u000b\u000f\u001c\r\u0003\n\u0006\u0006\"", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, (byte) (Color.argb(0, 0, 0, 0) + 89)).intern())) {
                            b10 = -1;
                        } else {
                            i11 = f1386 + 31;
                            f1387 = i11 % 128;
                            if (i11 % 2 == 0) {
                                b10 = 13;
                            } else {
                                b10 = 0;
                            }
                        }
                        break;
                    case 1202614773:
                        if (str.equals(m1590("\u0001\u0002\u0000\u000e\u0004\r\u0011\u0017\u0006\u000e\u0013\r\u0005\u0007\u000f\u0010\f\u0004\u0001\u0002â", ((byte) KeyEvent.getModifierMetaStateMask()) + zi.c.f161648z, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 110)).intern())) {
                            b10 = -1;
                        } else {
                            f1387 = (f1386 + 33) % 128;
                            b10 = 2;
                        }
                        break;
                    case 1689765750:
                        if (str.equals(m1590("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\u0013\u0000\r\u0016\u0013\u0002\u0013\u0003\u0007\u0005\u000b\u0017\u0002\u0001", 28 - TextUtils.indexOf("", ""), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33)).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    case 1766229249:
                        if (str.equals(m1590("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\r\u000e\r\u0007\b\u0011\u0010\u0011°°\u0002\u0001", Color.alpha(0) + 26, (byte) ('m' - AndroidCharacter.getMirror('0'))).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case 1833576080:
                        if (str.equals(m1591("\t￠\u0002\u000e\n\uffff\uffde\b\u0003\uffe7\u000e\uffff\r\r\u0013\ufffb\f\fￛ\f", 20 - Color.red(0), true, 14 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 160).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 10;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
            } else {
                switch (str.hashCode()) {
                    case -1930334554:
                        if (str.equals(m1590("\u0001\u0002\u0000\u000e\u0004\r\u0011\u0017\u000b\u0014\u0000\u0004\r\n¶", 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (TextUtils.getCapsMode("", 0, 0) + 67)).intern())) {
                            b10 = -1;
                        } else {
                            f1386 = (f1387 + 81) % 128;
                            b10 = 7;
                        }
                        break;
                    case -1826216039:
                        if (str.equals(m1591("\t\u0002\ufff7\u000b\u0007ￛ\ufffb\u0006\u000f\n", 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 163).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 14;
                        }
                        break;
                    case -994397843:
                        if (str.equals(m1590("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\u0004\u000f\u0006\u0001", TextUtils.lastIndexOf("", '0', 0) + 19, (byte) (40 - TextUtils.indexOf("", ""))).intern())) {
                            b10 = -1;
                        } else {
                            i10 = f1386 + 51;
                            f1387 = i10 % 128;
                            if (i10 % 2 == 0) {
                                b10 = 6;
                            } else {
                                b10 = 70;
                            }
                        }
                        break;
                    case -941967812:
                        if (str.equals(m1591("\u000b\f\u0001\u0005\u0001￤\u000b\u000b\ufff9\u0004ￛ\n�\b\r￫\f�", 18 - (ViewConfiguration.getPressedStateDuration() >> 16), true, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), 161 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case -770599694:
                        if (str.equals(m1591("￪\u0006\u000b￡\u0002\r\u0011\u0005￣\f\u000f￠\u0005\u0002\u0000\b\u0010\u0002\u0011", 19 - View.getDefaultSize(0, 0), false, 16 - (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 156).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case -235079533:
                        if (str.equals(m1590("\u0001\u0002\b\u0014\u0011\f\u0007\u0002\u001b\f\u000e\u001b\u001c\u001d\u0005\r\u0003\u0001", 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (58 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern())) {
                            b10 = -1;
                        } else {
                            b10 = zi.c.f161636n;
                        }
                        break;
                    case -213689933:
                        if (str.equals(m1590("\u0001\u0002\u0003\b\t\u0010\u0010\t\u0017\u0013\u0004\r\u0014\u0015\u0003\u0013\u0005\u0007\u0002\u0000\r\u0005Ã", 23 - TextUtils.getTrimmedLength(""), (byte) (TextUtils.getCapsMode("", 0, 0) + 80)).intern())) {
                            b10 = -1;
                        } else {
                            f1386 = (f1387 + 65) % 128;
                            b10 = 5;
                        }
                        break;
                    case 46561673:
                        if (str.equals(m1590("\u0001\u0002\u0000\u000e\u0004\r\u0011\u0017\u000b\u0014\u0000\u001dìì\r\u001cí", (Process.myPid() >> 22) + 17, (byte) (122 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern())) {
                            b10 = -1;
                        } else {
                            f1386 = (f1387 + 115) % 128;
                            b10 = 11;
                        }
                        break;
                    case 94094958:
                        if (str.equals(m1591("\f\ufff9\ufffb\u0003\u0000", 5 - Color.green(0), true, 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 162).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 17;
                        }
                        break;
                    case 841006591:
                        if (str.equals(m1591("\uffff\n\u000e\u0002￠\t\f\uffdd\t\u0006\u0006\uffff�\u000e\u0003\t\b\r\r\uffff\u000e\uffe7\u0003\b\uffde", 25 - KeyEvent.getDeadChar(0, 0), false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, View.resolveSizeAndState(0, 0, 0) + 159).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 8;
                        }
                        break;
                    case 902024524:
                        if (str.equals(m1590("\u0005\u0000\u0001\u0003\u0011\u0004\r\u0005\u001b\u0014", 9 - Process.getGidForName(""), (byte) (KeyEvent.getDeadChar(0, 0) + 112)).intern())) {
                            b10 = -1;
                        } else {
                            f1386 = (f1387 + 9) % 128;
                            b10 = 15;
                        }
                        break;
                    case 923334616:
                        if (str.equals(m1591("\u0001\b�￼\u000e\f\r\b\u0006ￜ\u0001\ufffe￼\u0004￦\ufffe\r", 17 - TextUtils.getCapsMode("", 0, 0), false, '3' - AndroidCharacter.getMirror('0'), AndroidCharacter.getMirror('0') + 'p').intern())) {
                            b10 = -1;
                        } else {
                            b10 = 16;
                        }
                        break;
                    case 1080975014:
                        if (str.equals(m1591("\u0006\t\uffdd\b￣\u0002�\f\ufffb\uffff￭\u000e\uffff\r\r\b\t\u0003\u000e�\uffff\u0006", TextUtils.indexOf("", "", 0, 0) + 22, true, KeyEvent.getDeadChar(0, 0) + 14, 158 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 9;
                        }
                        break;
                    case 1083215325:
                        if (str.equals(m1590("\u0005\u0001\u001e\u0006\u0001\u0005#\u000b\u000f\u001c\r\u0003\n\u0006\u0006\"", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, (byte) (Color.argb(0, 0, 0, 0) + 89)).intern())) {
                            b10 = -1;
                        } else {
                            i11 = f1386 + 31;
                            f1387 = i11 % 128;
                            if (i11 % 2 == 0) {
                                b10 = 13;
                            } else {
                                b10 = 0;
                            }
                        }
                        break;
                    case 1202614773:
                        if (str.equals(m1590("\u0001\u0002\u0000\u000e\u0004\r\u0011\u0017\u0006\u000e\u0013\r\u0005\u0007\u000f\u0010\f\u0004\u0001\u0002â", ((byte) KeyEvent.getModifierMetaStateMask()) + zi.c.f161648z, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 110)).intern())) {
                            b10 = -1;
                        } else {
                            f1387 = (f1386 + 33) % 128;
                            b10 = 2;
                        }
                        break;
                    case 1689765750:
                        if (str.equals(m1590("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\u0013\u0000\r\u0016\u0013\u0002\u0013\u0003\u0007\u0005\u000b\u0017\u0002\u0001", 28 - TextUtils.indexOf("", ""), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33)).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    case 1766229249:
                        if (str.equals(m1590("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0000\b\u0001\t\n\u000b\u0006\r\u000e\r\u0007\b\u0011\u0010\u0011°°\u0002\u0001", Color.alpha(0) + 26, (byte) ('m' - AndroidCharacter.getMirror('0'))).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case 1833576080:
                        if (str.equals(m1591("\t￠\u0002\u000e\n\uffff\uffde\b\u0003\uffe7\u000e\uffff\r\r\u0013\ufffb\f\fￛ\f", 20 - Color.red(0), true, 14 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 160).intern())) {
                            b10 = -1;
                        } else {
                            b10 = 10;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
            }
            switch (b10) {
                case 0:
                    this.f1392.f1384.m2378(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                    return this;
                case 1:
                    this.f1392.f1384.m2383(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                    return this;
                case 2:
                    this.f1392.f1384.m2374(((Boolean) cz.m1806(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 3:
                    this.f1392.f1384.m2372(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                    return this;
                case 4:
                    this.f1392.f1384.m2376(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                    int i14 = f1386 + 99;
                    f1387 = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 47 / 0;
                    }
                    return this;
                case 5:
                    this.f1392.f1384.m2382(((Boolean) cz.m1806(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 6:
                    this.f1392.f1384.m2381(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                    return this;
                case 7:
                    this.f1392.f1384.m2384(((Boolean) cz.m1806(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 8:
                    this.f1392.f1384.m2369(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                    return this;
                case 9:
                    this.f1392.f1384.m2379(((Boolean) cz.m1806(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 10:
                    this.f1392.f1384.m2370(((Integer) cz.m1806(list, 0, Integer.class)).intValue());
                    return this;
                case 11:
                    this.f1392.f1384.m2377(((Boolean) cz.m1806(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 12:
                    this.f1392.f1384.m2371(((Boolean) cz.m1806(list, 0, Boolean.class)).booleanValue());
                    return this;
                case 13:
                    this.f1391.m1573((Class) cz.m1806(list, 0, Class.class));
                    return this;
                case 14:
                    this.f1391.m1574((Class) cz.m1806(list, 0, Class.class));
                    return this;
                case 15:
                    this.f1391.m1577((Class) cz.m1806(list, 0, Class.class));
                    return this;
                case 16:
                    ds dsVar = (ds) cz.m1806(list, 0, ds.class);
                    this.f1391.m1576(dsVar);
                    this.f1392.f1384.m2373(dsVar);
                    return this;
                case 17:
                    return m1589();
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m1590(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2129) {
                try {
                    char[] cArr2 = f1389;
                    char c10 = f1388;
                    char[] cArr3 = new char[i10];
                    if (i10 % 2 != 0) {
                        i10--;
                        cArr3[i10] = (char) (cArr[i10] - b10);
                    }
                    if (i10 > 1) {
                        g.f2134 = 0;
                        while (true) {
                            int i11 = g.f2134;
                            if (i11 >= i10) {
                                break;
                            }
                            g.f2133 = cArr[i11];
                            g.f2131 = cArr[g.f2134 + 1];
                            if (g.f2133 == g.f2131) {
                                cArr3[g.f2134] = (char) (g.f2133 - b10);
                                cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                            } else {
                                g.f2132 = g.f2133 / c10;
                                g.f2130 = g.f2133 % c10;
                                g.f2135 = g.f2131 / c10;
                                g.f2128 = g.f2131 % c10;
                                if (g.f2130 == g.f2128) {
                                    g.f2132 = ((g.f2132 + c10) - 1) % c10;
                                    g.f2135 = ((g.f2135 + c10) - 1) % c10;
                                    int i12 = (g.f2132 * c10) + g.f2130;
                                    int i13 = (g.f2135 * c10) + g.f2128;
                                    int i14 = g.f2134;
                                    cArr3[i14] = cArr2[i12];
                                    cArr3[i14 + 1] = cArr2[i13];
                                } else if (g.f2132 == g.f2135) {
                                    g.f2130 = ((g.f2130 + c10) - 1) % c10;
                                    g.f2128 = ((g.f2128 + c10) - 1) % c10;
                                    int i15 = (g.f2132 * c10) + g.f2130;
                                    int i16 = (g.f2135 * c10) + g.f2128;
                                    int i17 = g.f2134;
                                    cArr3[i17] = cArr2[i15];
                                    cArr3[i17 + 1] = cArr2[i16];
                                } else {
                                    int i18 = (g.f2132 * c10) + g.f2128;
                                    int i19 = (g.f2135 * c10) + g.f2130;
                                    int i20 = g.f2134;
                                    cArr3[i20] = cArr2[i18];
                                    cArr3[i20 + 1] = cArr2[i19];
                                }
                            }
                            g.f2134 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final cn m1587() {
        return this.f1385;
    }
}
