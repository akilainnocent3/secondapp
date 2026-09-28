package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class xad implements tad.c {
    public final AudioTrack a(y31 y31Var, r21 r21Var, int i, Context context) {
        int i2 = y31Var.b;
        int i3 = y31Var.c;
        int i4 = y31Var.a;
        String str = jrh0.a;
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(y31Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : r21Var.a().a).setAudioFormat(new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build()).setTransferMode(1).setBufferSizeInBytes(y31Var.f).setSessionId(i);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            sessionId.setOffloadedPlayback(y31Var.e);
        }
        if (i5 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return sessionId.build();
    }
}
