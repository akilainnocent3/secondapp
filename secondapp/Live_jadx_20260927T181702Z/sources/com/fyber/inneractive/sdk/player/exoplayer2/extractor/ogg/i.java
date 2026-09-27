package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f46341o = z.a("Opus");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f46342p = {79, 112, 117, 115, 72, 101, 97, f6.q.f83619w};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f46343n;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f46343n = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i10;
        int i11;
        byte[] bArr = nVar.f47130a;
        byte b10 = bArr[0];
        int i12 = b10 & 255;
        int i13 = b10 & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = bArr[1] & 63;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = 2500 << i15;
        } else if (i14 >= 12) {
            i11 = 10000 << (i14 & 1);
        } else {
            i11 = i15 == 3 ? 60000 : 10000 << i15;
        }
        return (((long) this.f46354i) * ((long) (i10 * i11))) / 1000000;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar) {
        if (!this.f46343n) {
            byte[] bArrCopyOf = Arrays.copyOf(nVar.f47130a, nVar.f47132c);
            int i10 = bArrCopyOf[9] & 255;
            int i11 = ((bArrCopyOf[11] & 255) << 8) | (bArrCopyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(bArrCopyOf);
            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i11) * 1000000000) / 48000).array());
            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) 3840) * 1000000000) / 48000).array());
            jVar.f46344a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/opus", -1, -1, i10, 48000, arrayList, null, null);
            this.f46343n = true;
            return true;
        }
        boolean z10 = nVar.b() == f46341o;
        nVar.e(0);
        return z10;
    }
}
