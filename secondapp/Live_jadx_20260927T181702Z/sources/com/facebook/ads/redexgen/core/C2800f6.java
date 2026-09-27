package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2800f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C16773r A00;

    public C2800f6(C16773r c16773r) {
        this.A00 = c16773r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        new Handler(Looper.getMainLooper()).post(new C1912Dl(this, i10));
    }
}
