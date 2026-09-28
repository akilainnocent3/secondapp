package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ebu implements tse {
    public final /* synthetic */ abu a;

    public ebu(abu abuVar) {
        this.a = abuVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        abu abuVar = this.a;
        abuVar.getClass();
        try {
            abuVar.c.release();
            abuVar.d.release();
        } catch (Exception e) {
            itf0.a.d(inm.a("Error releasing MediaPlayer resources: ", e.getMessage()), new Object[0]);
        }
    }
}
