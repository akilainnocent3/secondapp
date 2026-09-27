package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
public class ER {

    @Nullable
    public final C3460qI A00;
    public final Throwable A01;

    public ER(@Nullable C3460qI c3460qI, Throwable th2) {
        this.A00 = c3460qI;
        this.A01 = th2;
    }
}
