package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f70186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f70187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f70188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f70189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f70190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    o f70191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    o f70192g;

    public o() {
        this.f70186a = new byte[8192];
        this.f70190e = true;
        this.f70189d = false;
    }

    public final o a(o oVar) {
        oVar.f70192g = this;
        oVar.f70191f = this.f70191f;
        this.f70191f.f70192g = oVar;
        this.f70191f = oVar;
        return oVar;
    }

    @Nullable
    public final o b() {
        o oVar = this.f70191f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f70192g;
        oVar3.f70191f = oVar;
        this.f70191f.f70192g = oVar3;
        this.f70191f = null;
        this.f70192g = null;
        return oVar2;
    }

    public final o c() {
        this.f70189d = true;
        return new o(this.f70186a, this.f70187b, this.f70188c, true, false);
    }

    public o(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f70186a = bArr;
        this.f70187b = i10;
        this.f70188c = i11;
        this.f70189d = z10;
        this.f70190e = z11;
    }

    public final o a(int i10) {
        o oVarA;
        if (i10 > 0 && i10 <= this.f70188c - this.f70187b) {
            if (i10 >= 1024) {
                oVarA = c();
            } else {
                oVarA = p.a();
                System.arraycopy(this.f70186a, this.f70187b, oVarA.f70186a, 0, i10);
            }
            oVarA.f70188c = oVarA.f70187b + i10;
            this.f70187b += i10;
            this.f70192g.a(oVarA);
            return oVarA;
        }
        throw new IllegalArgumentException();
    }

    public final void a() {
        o oVar = this.f70192g;
        if (oVar != this) {
            if (oVar.f70190e) {
                int i10 = this.f70188c - this.f70187b;
                if (i10 > (8192 - oVar.f70188c) + (oVar.f70189d ? 0 : oVar.f70187b)) {
                    return;
                }
                a(oVar, i10);
                b();
                p.a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(o oVar, int i10) {
        if (oVar.f70190e) {
            int i11 = oVar.f70188c;
            int i12 = i11 + i10;
            if (i12 > 8192) {
                if (!oVar.f70189d) {
                    int i13 = oVar.f70187b;
                    if (i12 - i13 <= 8192) {
                        byte[] bArr = oVar.f70186a;
                        System.arraycopy(bArr, i13, bArr, 0, i11 - i13);
                        oVar.f70188c -= oVar.f70187b;
                        oVar.f70187b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f70186a, this.f70187b, oVar.f70186a, oVar.f70188c, i10);
            oVar.f70188c += i10;
            this.f70187b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
