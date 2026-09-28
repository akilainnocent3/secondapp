package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class got implements iot.a {
    public final /* synthetic */ iot a;
    public final /* synthetic */ float b;

    public /* synthetic */ got(iot iotVar, float f) {
        this.a = iotVar;
        this.b = f;
    }

    @Override // iot.a
    public final void run() {
        iot iotVar = this.a;
        xmt xmtVar = iotVar.a;
        float f = this.b;
        if (xmtVar == null) {
            iotVar.i.add(new got(iotVar, f));
        } else {
            iotVar.w((int) rqv.f(xmtVar.l, xmtVar.m, f));
        }
    }
}
