package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2007Hd {
    void A6e(C3460qI c3460qI);

    int AIp(InterfaceC16402c interfaceC16402c, int i10, boolean z10) throws IOException;

    int AIq(InterfaceC16402c interfaceC16402c, int i10, boolean z10, int i11) throws IOException;

    void AIr(C17074v c17074v, int i10);

    void AIs(C17074v c17074v, int i10, int i11);

    void AIu(long j10, int i10, int i11, int i12, C2005Hb c2005Hb);

    @MetaExoPlayerCustomization("New Meta API")
    void AKf(Uri uri);
}
