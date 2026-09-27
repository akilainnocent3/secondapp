package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f46328a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f46329b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(0, new byte[65025]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46330c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46332e;

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        int i10;
        int i11;
        int i12;
        if (this.f46332e) {
            this.f46332e = false;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f46329b;
            nVar.f47131b = 0;
            nVar.f47132c = 0;
        }
        while (true) {
            if (this.f46332e) {
                return true;
            }
            if (this.f46330c < 0) {
                if (!this.f46328a.a(bVar, true)) {
                    return false;
                }
                g gVar = this.f46328a;
                int i13 = gVar.f46337d;
                if ((gVar.f46334a & 1) == 1 && this.f46329b.f47132c == 0) {
                    this.f46331d = 0;
                    int i14 = 0;
                    do {
                        int i15 = this.f46331d;
                        g gVar2 = this.f46328a;
                        if (i15 >= gVar2.f46336c) {
                            break;
                        }
                        int[] iArr = gVar2.f46339f;
                        this.f46331d = i15 + 1;
                        i12 = iArr[i15];
                        i14 += i12;
                    } while (i12 == 255);
                    i13 += i14;
                    i11 = this.f46331d;
                } else {
                    i11 = 0;
                }
                bVar.a(i13);
                this.f46330c = i11;
            }
            int i16 = this.f46330c;
            this.f46331d = 0;
            int i17 = 0;
            do {
                int i18 = this.f46331d;
                int i19 = i16 + i18;
                g gVar3 = this.f46328a;
                if (i19 >= gVar3.f46336c) {
                    break;
                }
                int[] iArr2 = gVar3.f46339f;
                this.f46331d = i18 + 1;
                i10 = iArr2[i19];
                i17 += i10;
            } while (i10 == 255);
            int i20 = this.f46330c + this.f46331d;
            if (i17 > 0) {
                int iA = this.f46329b.a();
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f46329b;
                int i21 = nVar2.f47132c + i17;
                if (iA < i21) {
                    nVar2.f47130a = Arrays.copyOf(nVar2.f47130a, i21);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f46329b;
                bVar.b(nVar3.f47130a, nVar3.f47132c, i17, false);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f46329b;
                nVar4.d(nVar4.f47132c + i17);
                this.f46332e = this.f46328a.f46339f[i20 + (-1)] != 255;
            }
            if (i20 == this.f46328a.f46336c) {
                i20 = -1;
            }
            this.f46330c = i20;
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f46329b;
        byte[] bArr = nVar.f47130a;
        if (bArr.length == 65025) {
            return;
        }
        nVar.f47130a = Arrays.copyOf(bArr, Math.max(65025, nVar.f47132c));
    }
}
