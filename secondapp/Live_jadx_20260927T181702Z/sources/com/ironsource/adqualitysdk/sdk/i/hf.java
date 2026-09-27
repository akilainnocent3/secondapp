package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import cv.z0;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class hf extends hb<MediaPlayer.OnCompletionListener> implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2308 = {'9', 'p', 'q', 'j', 'i', 'p', 'i', 'd', 'T', fw.b.f85384k, 'k', 'i', 'i', 'l', 's', 'n', 'Z', fw.b.f85385l, 'n', 'l', 'n', 'l', 'h', 'n', 'n', 'n', 'Y', 'X', '^', 'L', 175, 198, 196, 196, 157, 152, 191, 155, 154, 180, 175, 171, z0.f77350o, 194, 199, 192, z0.f77355t, z0.f77355t, 191, 157, 155, 194, 172, 173, 194, 194, 194, 188, 192, 194, 192, 194};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2309 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2310 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private b f2311;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        /* JADX INFO: renamed from: ﻛ */
        void mo1791(hf hfVar, MediaPlayer mediaPlayer);
    }

    public hf(MediaPlayer.OnCompletionListener onCompletionListener, b bVar) {
        super(onCompletionListener);
        this.f2311 = bVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2203(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f2308, i10, cArr, 0, i11);
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

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i10 = f2309 + 89;
        f2310 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2311.mo1791(this, mediaPlayer);
                throw null;
            }
            this.f2311.mo1791(this, mediaPlayer);
            if (mo697() != null) {
                int i11 = f2309 + 55;
                f2310 = i11 % 128;
                if (i11 % 2 != 0) {
                    mo697().onCompletion(mediaPlayer);
                } else {
                    mo697().onCompletion(mediaPlayer);
                    throw null;
                }
            }
        } catch (Throwable th2) {
            kd.m2827(m2203(new int[]{0, 29, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001", true).intern(), m2203(new int[]{29, 33, 84, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001", false).intern(), th2, false);
        }
    }
}
