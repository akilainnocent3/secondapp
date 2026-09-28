package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ygk0 implements Runnable {
    public final /* synthetic */ yis a;
    public final /* synthetic */ yis.b b;

    public /* synthetic */ ygk0(yis yisVar, yis.b bVar) {
        this.a = yisVar;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yis yisVar = this.a;
        yis.b bVar = this.b;
        jet jetVar = yisVar.b;
        if (jetVar == null) {
            return;
        }
        bVar.a(jetVar);
    }
}
