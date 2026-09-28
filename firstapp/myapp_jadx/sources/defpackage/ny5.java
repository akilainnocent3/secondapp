package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ny5 extends tz5 {
    public final /* synthetic */ nv5.a a;

    public ny5(nv5.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.tz5
    public final void a(int i) {
        this.a.d(new k8n("Capture request is cancelled because camera is closed", null));
    }

    @Override // defpackage.tz5
    public final void b(int i, e06 e06Var) {
        this.a.b(null);
    }

    @Override // defpackage.tz5
    public final void c(int i, vz5 vz5Var) {
        this.a.d(new k8n("Capture request failed with reason " + vz5.a.a, null));
    }
}
