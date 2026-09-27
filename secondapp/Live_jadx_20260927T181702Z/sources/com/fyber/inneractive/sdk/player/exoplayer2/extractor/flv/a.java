package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f45764e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45767d;

    public a(r rVar) {
        super(rVar);
    }

    public final boolean a(n nVar) throws d {
        if (this.f45765b) {
            nVar.e(nVar.f47131b + 1);
        } else {
            int iJ = nVar.j();
            int i10 = (iJ >> 4) & 15;
            this.f45767d = i10;
            if (i10 == 2) {
                this.f45783a.a(o.a(null, "audio/mpeg", -1, -1, 1, f45764e[(iJ >> 2) & 3], null, null, null));
                this.f45766c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f45783a.a(o.a(null, i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", -1, -1, 1, 8000, (iJ & 1) == 1 ? 2 : 3, -1, -1, null, null, 0, null, null));
                this.f45766c = true;
            } else if (i10 != 10) {
                throw new d("Audio format not supported: " + this.f45767d);
            }
            this.f45765b = true;
        }
        return true;
    }

    public final void a(n nVar, long j10) {
        if (this.f45767d == 2) {
            int i10 = nVar.f47132c - nVar.f47131b;
            this.f45783a.a(i10, nVar);
            this.f45783a.a(j10, 1, i10, 0, null);
            return;
        }
        int iJ = nVar.j();
        if (iJ == 0 && !this.f45766c) {
            int i11 = nVar.f47132c - nVar.f47131b;
            byte[] bArr = new byte[i11];
            nVar.a(bArr, 0, i11);
            Pair pairA = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr);
            this.f45783a.a(o.a(null, "audio/mp4a-latm", -1, -1, ((Integer) pairA.second).intValue(), ((Integer) pairA.first).intValue(), Collections.singletonList(bArr), null, null));
            this.f45766c = true;
            return;
        }
        if (this.f45767d != 10 || iJ == 1) {
            int i12 = nVar.f47132c - nVar.f47131b;
            this.f45783a.a(i12, nVar);
            this.f45783a.a(j10, 1, i12, 0, null);
        }
    }
}
