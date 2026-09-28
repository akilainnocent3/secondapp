package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v60 implements tse {
    public final /* synthetic */ gme a;

    public v60(gme gmeVar) {
        this.a = gmeVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        gme gmeVar = this.a;
        gmeVar.dismiss();
        gmeVar.i.e();
    }
}
