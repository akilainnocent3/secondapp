package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.signals.SignalKey;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class hc extends hb<MediaPlayer.OnInfoListener> implements MediaPlayer.OnInfoListener {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2294 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2296;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private c f2297;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2293 = {40565, 65198, 24455, 48314, 7604, 31415, 56234, 14469, 39321, 63108, 22427, 46314, 5607, 29434, 54226, 12537, 37369, 61135, 20444, 44245, 3526, 27351, 52020, 53531, 45526, 4312, 62431, 21188, 13724, 38123, 30694, 54958, 47609, 6350, 64386, 23210, 15749, 40065, 32652, 56987, 41386, 175, 58274, 17142, 9651, 33868, 26465, 50752, 43346, 2133};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2295 = 3752853498850926842L;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        /* JADX INFO: renamed from: ﻐ */
        boolean mo1790(hc hcVar, MediaPlayer mediaPlayer, int i10, int i11);
    }

    public hc(MediaPlayer.OnInfoListener onInfoListener, c cVar) {
        super(onInfoListener);
        this.f2297 = cVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2200(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2293[i10 + i12]) ^ (((long) i12) * f2295)) ^ ((long) c10));
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

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        int i12 = f2294 + SignalKey.EVENT_ID;
        f2296 = i12 % 128;
        try {
            if (i12 % 2 != 0) {
                this.f2297.mo1790(this, mediaPlayer, i10, i11);
                int i13 = 57 / 0;
            } else {
                this.f2297.mo1790(this, mediaPlayer, i10, i11);
            }
        } catch (Throwable th2) {
            kd.m2827(m2200(KeyEvent.getDeadChar(0, 0), (char) (40506 - View.resolveSize(0, 0)), 23 - ExpandableListView.getPackedPositionGroup(0L)).intern(), m2200((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23, (char) (View.MeasureSpec.getMode(0) + 53598), 27 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), th2, false);
        }
        if (mo697() != null) {
            return mo697().onInfo(mediaPlayer, i10, i11);
        }
        f2294 = (f2296 + 5) % 128;
        return false;
    }
}
