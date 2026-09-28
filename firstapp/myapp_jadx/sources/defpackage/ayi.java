package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ayi implements Runnable {
    public final /* synthetic */ yxi a;

    public ayi(yxi yxiVar) {
        this.a = yxiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yxi yxiVar = this.a;
        yxiVar.v = false;
        yxiVar.l();
    }
}
