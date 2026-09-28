package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rhf0 implements tse {
    public final /* synthetic */ ytw a;
    public final /* synthetic */ psw b;

    public rhf0(ytw ytwVar, psw pswVar) {
        this.a = ytwVar;
        this.b = pswVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tse
    public final void dispose() {
        ytw ytwVar = this.a;
        mp20.b bVar = (mp20.b) ytwVar.getValue();
        if (bVar != null) {
            mp20.a aVar = new mp20.a(bVar);
            psw pswVar = this.b;
            if (pswVar != null) {
                pswVar.c(aVar);
            }
            ytwVar.setValue(null);
        }
    }
}
