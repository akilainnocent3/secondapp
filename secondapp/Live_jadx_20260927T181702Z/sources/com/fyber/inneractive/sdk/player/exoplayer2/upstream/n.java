package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f47049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f47050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f47051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f47052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f47053e;

    public n(Context context, m mVar, h hVar) {
        hVar.getClass();
        this.f47049a = hVar;
        this.f47050b = new s(mVar);
        this.f47051c = new d(context, mVar);
        this.f47052d = new f(context, mVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) {
        if (this.f47053e != null) {
            throw new IllegalStateException();
        }
        String scheme = kVar.f47032a.getScheme();
        Uri uri = kVar.f47032a;
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f47158a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || scheme2.equals(C4235d4.i.f61404b)) {
            if (kVar.f47032a.getPath().startsWith("/android_asset/")) {
                this.f47053e = this.f47051c;
            } else {
                this.f47053e = this.f47050b;
            }
        } else if ("asset".equals(scheme)) {
            this.f47053e = this.f47051c;
        } else if ("content".equals(scheme)) {
            this.f47053e = this.f47052d;
        } else {
            this.f47053e = this.f47049a;
        }
        return this.f47053e.a(kVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        h hVar = this.f47053e;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f47053e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f47053e.read(bArr, i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        h hVar = this.f47053e;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }
}
