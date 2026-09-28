package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class ttx implements ltx {
    public final osx a;

    public ttx(osx osxVar) {
        osxVar.getClass();
        this.a = osxVar;
    }

    @Override // defpackage.ltx
    public final or60 a() {
        return new or60(new qtx(this, null));
    }

    @Override // defpackage.ltx
    public final or60 b() {
        return new or60(new ptx(this, null));
    }

    @Override // defpackage.ltx
    public final or60 c() {
        return new or60(new rtx(this, null));
    }

    @Override // defpackage.ltx
    public final or60 d() {
        return new or60(new stx(this, null));
    }

    @Override // defpackage.ltx
    public final or60 e(int i) {
        return new or60(new ntx(this, i, null));
    }

    @Override // defpackage.ltx
    public final or60 f() {
        return new or60(new otx(this, null));
    }

    @Override // defpackage.ltx
    public final or60 g(double d, fbx fbxVar, String str, String str2) {
        fbxVar.getClass();
        return new or60(new mtx(this, fbxVar, d, str, str2, null));
    }
}
