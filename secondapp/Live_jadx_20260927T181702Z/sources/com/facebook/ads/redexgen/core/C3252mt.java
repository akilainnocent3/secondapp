package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3252mt implements InterfaceC2007Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007Hd
    public final /* synthetic */ int AIp(InterfaceC16402c interfaceC16402c, int i10, boolean z10) {
        return AbstractC2004Ha.A00(this, interfaceC16402c, i10, z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007Hd
    public final /* synthetic */ void AIr(C17074v c17074v, int i10) {
        AbstractC2004Ha.A01(this, c17074v, i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007Hd
    public final void A6e(C3460qI c3460qI) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007Hd
    public final int AIq(InterfaceC16402c interfaceC16402c, int i10, boolean z10, int i11) throws IOException {
        int bytesSkipped = interfaceC16402c.read(this.A00, 0, Math.min(this.A00.length, i10));
        if (bytesSkipped == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007Hd
    public final void AIs(C17074v c17074v, int i10, int i11) {
        c17074v.A0g(i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007Hd
    public final void AIu(long j10, int i10, int i11, int i12, C2005Hb c2005Hb) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2007Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
