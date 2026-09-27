package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] f46863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f46864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f46865c;

    public n(com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f46863a = iVarArr;
        this.f46864b = jVar;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws a0 {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar = this.f46865c;
        if (iVar != null) {
            return iVar;
        }
        for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar2 : this.f46863a) {
            try {
                if (iVar2.a(bVar)) {
                    this.f46865c = iVar2;
                    bVar.f45739e = 0;
                    break;
                }
                continue;
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                bVar.f45739e = 0;
                throw th2;
            }
            bVar.f45739e = 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar3 = this.f46865c;
        if (iVar3 != null) {
            iVar3.a(this.f46864b);
            return this.f46865c;
        }
        StringBuilder sb2 = new StringBuilder("None of the available extractors (");
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr = this.f46863a;
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f47158a;
        StringBuilder sb3 = new StringBuilder();
        for (int i11 = 0; i11 < iVarArr.length; i11++) {
            sb3.append(iVarArr[i11].getClass().getSimpleName());
            if (i11 < iVarArr.length - 1) {
                sb3.append(", ");
            }
        }
        sb2.append(sb3.toString());
        sb2.append(") could read the stream.");
        throw new a0(sb2.toString());
    }
}
