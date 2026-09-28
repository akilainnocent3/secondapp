package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xnt implements iot.a {
    public final /* synthetic */ iot a;
    public final /* synthetic */ float b;

    public /* synthetic */ xnt(iot iotVar, float f) {
        this.a = iotVar;
        this.b = f;
    }

    @Override // iot.a
    public final void run() {
        iot iotVar = this.a;
        xmt xmtVar = iotVar.a;
        float f = this.b;
        if (xmtVar == null) {
            iotVar.i.add(new xnt(iotVar, f));
            return;
        }
        bpt bptVar = iotVar.b;
        bptVar.j(bptVar.y, rqv.f(xmtVar.l, xmtVar.m, f));
    }
}
