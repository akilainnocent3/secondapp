package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q {
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    public static UUID a(byte[] bArr) {
        Pair pairCreate;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        if (nVar.f47132c < 32) {
            pairCreate = null;
        } else {
            nVar.e(0);
            if (nVar.b() == (nVar.f47132c - nVar.f47131b) + 4 && nVar.b() == c.V) {
                int iB = (nVar.b() >> 24) & 255;
                if (iB > 1) {
                    Log.w("PsshAtomUtil", "Unsupported pssh version: " + iB);
                } else {
                    UUID uuid = new UUID(nVar.g(), nVar.g());
                    if (iB == 1) {
                        nVar.e(nVar.f47131b + (nVar.m() * 16));
                    }
                    int iM = nVar.m();
                    if (iM == nVar.f47132c - nVar.f47131b) {
                        byte[] bArr2 = new byte[iM];
                        nVar.a(bArr2, 0, iM);
                        pairCreate = Pair.create(uuid, bArr2);
                    }
                }
                pairCreate = null;
            } else {
                pairCreate = null;
            }
        }
        if (pairCreate == null) {
            return null;
        }
        return (UUID) pairCreate.first;
    }
}
