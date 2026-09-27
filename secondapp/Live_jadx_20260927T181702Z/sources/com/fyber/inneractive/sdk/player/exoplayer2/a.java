package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f45570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.v f45572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45574f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45575g;

    public a(int i10) {
        this.f45569a = i10;
    }

    public abstract void a(int i10, Object obj);

    public abstract void a(long j10, long j11);

    public abstract void a(boolean z10, long j10);

    public void a(o[] oVarArr) {
    }

    public final void c() {
        if (this.f45571c != 1) {
            throw new IllegalStateException();
        }
        this.f45571c = 0;
        this.f45572d = null;
        this.f45575g = false;
        g();
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.util.h d() {
        return null;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public final int a(p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10) {
        int iA = this.f45572d.a(pVar, cVar, z10);
        if (iA == -4) {
            if (cVar.b(4)) {
                this.f45574f = true;
                return this.f45575g ? -4 : -3;
            }
            cVar.f45718d += this.f45573e;
            return iA;
        }
        if (iA == -5) {
            o oVar = pVar.f46810a;
            long j10 = oVar.f46806w;
            if (j10 != Long.MAX_VALUE) {
                pVar.f46810a = new o(oVar.f46784a, oVar.f46788e, oVar.f46789f, oVar.f46786c, oVar.f46785b, oVar.f46790g, oVar.f46793j, oVar.f46794k, oVar.f46795l, oVar.f46796m, oVar.f46797n, oVar.f46799p, oVar.f46798o, oVar.f46800q, oVar.f46801r, oVar.f46802s, oVar.f46803t, oVar.f46804u, oVar.f46805v, oVar.f46807x, oVar.f46808y, oVar.f46809z, j10 + this.f45573e, oVar.f46791h, oVar.f46792i, oVar.f46787d);
            }
        }
        return iA;
    }
}
