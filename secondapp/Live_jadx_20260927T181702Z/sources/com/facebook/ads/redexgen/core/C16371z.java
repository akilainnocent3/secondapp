package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C16371z {
    public final AudioAttributes A00;

    public C16371z(C3466qQ c3466qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c3466qQ.A02).setFlags(c3466qQ.A03).setUsage(c3466qQ.A05);
        if (C5C.A02 >= 29) {
            C16351x.A00(usage, c3466qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C16361y.A00(usage, c3466qQ.A04);
        }
        this.A00 = usage.build();
    }
}
