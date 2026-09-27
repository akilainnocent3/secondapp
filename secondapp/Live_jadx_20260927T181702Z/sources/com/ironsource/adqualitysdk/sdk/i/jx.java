package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class jx {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2919 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2920 = 7;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2921;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2922 = {'A', 'd', 'Q', fw.b.f85389p, 'a', 'l', 'i', 't', 'y', 'U', 's', 'E', 'r', 'o', ' ', 'e', 'x', 'c', 'n', 'g', 'k', 'S', '/', 'C', 'B', 'P', 'K', '5', 'W', 'I', 'T', 'H', 'M', 'D', 'N', '2', '6', '-', 'O', 'L', 'F', '8', 'p', 'G', 'J', 'R', 'V', 'X', 'Y'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m2732(String str) {
        int length;
        int i10;
        int i11 = f2919 + 111;
        f2921 = i11 % 128;
        int i12 = 0;
        if (i11 % 2 != 0) {
            length = str.length();
            i10 = length % 2;
        } else {
            length = str.length();
            i10 = length / 2;
        }
        byte[] bArr = new byte[i10];
        while (i12 < length) {
            int i13 = f2919 + 115;
            f2921 = i13 % 128;
            if (i13 % 2 != 0) {
                bArr[i12 >> 3] = (byte) ((Character.digit(str.charAt(i12), 37) % 2) / Character.digit(str.charAt(i12 >> 1), 126));
                i12 += 75;
            } else {
                bArr[i12 / 2] = (byte) ((Character.digit(str.charAt(i12), 16) << 4) + Character.digit(str.charAt(i12 + 1), 16));
                i12 += 2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static long m2733() {
        int i10 = f2919 + 91;
        f2921 = i10 % 128;
        if (i10 % 2 != 0) {
            SystemClock.elapsedRealtime();
            throw null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = f2919 + 79;
        f2921 = i11 % 128;
        if (i11 % 2 == 0) {
            return jElapsedRealtime;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x012d A[Catch: all -> 0x017f, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x017f, blocks: (B:16:0x00e5, B:26:0x012d), top: B:59:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0139  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2734(String str, String str2, String str3, String str4) {
        CipherInputStream cipherInputStream;
        StringBuilder sb2 = new StringBuilder();
        try {
            byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDecode, 16, bArrDecode.length);
            try {
                try {
                    byte[] bArrM2732 = m2732(str3);
                    byte[] bArrM2733 = m2732(str4);
                    Cipher cipher = Cipher.getInstance(m2736("\u0004\u0007\u0016\u0017\u0018\u0019\u0018\u0017\u001a\u001b\u0018\u0016\u0015\u001a\u0005\u0002\u0002\u0000\u0013\u0014", 20 - (Process.myPid() >> 22), (byte) (44 - Color.red(0))).intern());
                    try {
                        try {
                            cipher.init(2, SecretKeyFactory.getInstance(m2736("\u001a\u0019\u0007 \u001e\u001f !\"\u001a\u0006\u001c\u001c(\u0016)\u0016\u001f\u001c\u0002\u0007\u0019,\u001e\u0019\u0018&' \u0012\u001c\u001b\u0019#", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33, (byte) (113 - Color.alpha(0))).intern(), m2736("\u0019\u0018", (ViewConfiguration.getTapTimeout() >> 16) + 2, (byte) (TextUtils.indexOf("", "", 0) + 116)).intern()).generateSecret(new PBEKeySpec(str2.toCharArray(), bArrM2733, 1, 256)), new IvParameterSpec(bArrM2732, 0, cipher.getBlockSize()));
                            CipherInputStream cipherInputStream2 = new CipherInputStream(new ByteArrayInputStream(bArrCopyOfRange), cipher);
                            try {
                                m2736("\u0010%)&\u009e", ((byte) KeyEvent.getModifierMetaStateMask()) + 6, (byte) (ImageFormat.getBitsPerPixel(0) + 103)).intern();
                                byte[] bArr = new byte[8192];
                                for (int i10 = cipherInputStream2.read(bArr); i10 >= 0; i10 = cipherInputStream2.read(bArr)) {
                                    sb2.append(new String(bArr, 0, i10, m2736("\u0010%)&\u009e", 5 - TextUtils.indexOf("", "", 0, 0), (byte) (102 - TextUtils.getTrimmedLength(""))).intern()));
                                }
                                cipherInputStream2.close();
                            } catch (Throwable th2) {
                                th = th2;
                                cipherInputStream = cipherInputStream2;
                                try {
                                    kd.m2827(m2736("\u0001\u0002\u0003\u0004\u0005\u0006\u0000\r\t\n\r\u0000\u0003\f", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, (byte) (111 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), m2736("\f\r\r\u0007\u0007\u0013\b\u0016\u0013\n\u0007+\r\u0000\u0013\u0014\u0011\u0007\b\r\u0004\u0014g", 24 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), th, false);
                                    if (cipherInputStream != null) {
                                        cipherInputStream.close();
                                        f2919 = (f2921 + 93) % 128;
                                    } else {
                                        f2921 = (f2919 + 43) % 128;
                                    }
                                    return sb2.toString();
                                } catch (Throwable th3) {
                                    if (cipherInputStream != null) {
                                        try {
                                            cipherInputStream.close();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        kd.m2827(m2736("\u0001\u0002\u0003\u0004\u0005\u0006\u0000\r\t\n\r\u0000\u0003\f", 14 - Gravity.getAbsoluteGravity(0, 0), (byte) (109 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), m2736("\f\r\r\u0007\u0007\u0013\u0013\n\u0012\u0001\r\u0000\u0013\u0014\u000f\u0000\u0010\u0012\r\t\u0000\u000e\u0012\u0000\f\u001ap", 27 - TextUtils.getTrimmedLength(""), (byte) (TextUtils.indexOf("", "", 0, 0) + 1)).intern(), th, false);
                                        return sb2.toString();
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            cipherInputStream = null;
                            kd.m2827(m2736("\u0001\u0002\u0003\u0004\u0005\u0006\u0000\r\t\n\r\u0000\u0003\f", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, (byte) (111 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), m2736("\f\r\r\u0007\u0007\u0013\b\u0016\u0013\n\u0007+\r\u0000\u0013\u0014\u0011\u0007\b\r\u0004\u0014g", 24 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), th, false);
                            if (cipherInputStream != null) {
                                cipherInputStream.close();
                                f2919 = (f2921 + 93) % 128;
                            } else {
                                f2921 = (f2919 + 43) % 128;
                            }
                            return sb2.toString();
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        cipherInputStream = null;
                        kd.m2827(m2736("\u0001\u0002\u0003\u0004\u0005\u0006\u0000\r\t\n\r\u0000\u0003\f", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, (byte) (111 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), m2736("\f\r\r\u0007\u0007\u0013\b\u0016\u0013\n\u0007+\r\u0000\u0013\u0014\u0011\u0007\b\r\u0004\u0014g", 24 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), th, false);
                        if (cipherInputStream != null) {
                            cipherInputStream.close();
                            f2919 = (f2921 + 93) % 128;
                        } else {
                            f2921 = (f2919 + 43) % 128;
                        }
                        return sb2.toString();
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th8) {
            th = th8;
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2737(ir irVar) {
        f2921 = (f2919 + 101) % 128;
        try {
            Executors.newSingleThreadExecutor().execute(irVar);
            f2919 = (f2921 + 97) % 128;
        } catch (Throwable th2) {
            kd.m2827(m2736("\u0001\u0002\u0003\u0004\u0005\u0006\u0000\r\t\n\r\u0000\u0003\f", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, (byte) (110 - View.resolveSizeAndState(0, 0, 0))).intern(), m2736("\f\r\r\u0007\u0007\u0013\u0010\u0011\u0010\u0012\u0000\n\u0004\u0014\u0014\u000f\u0003\u000b\u000b\u000f\u0012\u000f\u000b\u0000\r\u0011", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26, (byte) (23 - Color.blue(0))).intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static List m2738(List list, List list2) {
        HashSet hashSet = new HashSet(list);
        if (list2 != null) {
            int i10 = f2919 + 51;
            f2921 = i10 % 128;
            if (i10 % 2 != 0) {
                hashSet.addAll(list2);
                throw null;
            }
            hashSet.addAll(list2);
            f2921 = (f2919 + 67) % 128;
        }
        return new ArrayList(hashSet);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static long m2735() {
        int i10 = f2919 + 111;
        f2921 = i10 % 128;
        if (i10 % 2 != 0) {
            Calendar.getInstance().getTimeInMillis();
            throw null;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        f2921 = (f2919 + 101) % 128;
        return timeInMillis;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2736(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            try {
                char[] cArr2 = f2922;
                char c10 = f2920;
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
