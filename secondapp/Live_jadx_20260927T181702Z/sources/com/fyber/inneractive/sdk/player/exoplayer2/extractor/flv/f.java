package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f45784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f45785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45788f;

    public f(r rVar) {
        super(rVar);
        this.f45784b = new n(l.f47122a);
        this.f45785c = new n(4);
    }

    public final boolean a(n nVar) throws d {
        int iJ = nVar.j();
        int i10 = (iJ >> 4) & 15;
        int i11 = iJ & 15;
        if (i11 != 7) {
            throw new d(m.a("Video format not supported: ", i11));
        }
        this.f45788f = i10;
        return i10 != 5;
    }

    public final void a(n nVar, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        int iJ = nVar.j();
        long jL = (((long) nVar.l()) * 1000) + j10;
        if (iJ == 0 && !this.f45787e) {
            byte[] bArr = new byte[nVar.f47132c - nVar.f47131b];
            n nVar2 = new n(bArr);
            nVar.a(bArr, 0, nVar.f47132c - nVar.f47131b);
            com.fyber.inneractive.sdk.player.exoplayer2.video.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(nVar2);
            this.f45786d = aVarA.f47189b;
            this.f45783a.a(o.a(null, "video/avc", -1, aVarA.f47190c, aVarA.f47191d, aVarA.f47188a, -1, aVarA.f47192e, null, -1, null, null));
            this.f45787e = true;
            return;
        }
        if (iJ == 1 && this.f45787e) {
            byte[] bArr2 = this.f45785c.f47130a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i10 = 4 - this.f45786d;
            int i11 = 0;
            while (nVar.f47132c - nVar.f47131b > 0) {
                nVar.a(this.f45785c.f47130a, i10, this.f45786d);
                this.f45785c.e(0);
                int iM = this.f45785c.m();
                this.f45784b.e(0);
                this.f45783a.a(4, this.f45784b);
                this.f45783a.a(iM, nVar);
                i11 = i11 + 4 + iM;
            }
            this.f45783a.a(jL, this.f45788f == 1 ? 1 : 0, i11, 0, null);
        }
    }
}
