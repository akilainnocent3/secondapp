package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class c2w implements tse {
    public final /* synthetic */ k0w a;

    public c2w(k0w k0wVar) {
        this.a = k0wVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        k0w k0wVar = this.a;
        k0wVar.dismiss();
        k0wVar.v.e();
    }
}
