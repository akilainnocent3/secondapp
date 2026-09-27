package com.inmobi.media;

import android.app.KeyguardManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Rm {
    public static final boolean a(Context context, boolean z10) {
        kotlin.jvm.internal.m0.p(context, "<this>");
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return false;
        }
        Object systemService2 = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        if (keyguardManager == null) {
            return false;
        }
        return powerManager.isInteractive() && (z10 || !keyguardManager.isKeyguardLocked());
    }

    public static final MediaPlayer a(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        if (Build.VERSION.SDK_INT >= 34) {
            return ju.a(context);
        }
        return new MediaPlayer();
    }

    public static final void a(MediaPlayer mediaPlayer, Q1 audioFocusManager) {
        kotlin.jvm.internal.m0.p(mediaPlayer, "<this>");
        kotlin.jvm.internal.m0.p(audioFocusManager, "audioFocusManager");
        if (Build.VERSION.SDK_INT >= 26) {
            mediaPlayer.setAudioAttributes(audioFocusManager.f55345d);
        } else {
            mediaPlayer.setAudioStreamType(3);
        }
    }
}
