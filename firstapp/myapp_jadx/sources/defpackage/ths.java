package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ths implements Runnable {
    public final /* synthetic */ vhs a;

    public ths(vhs vhsVar) {
        this.a = vhsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vhs vhsVar = this.a;
        vhsVar.b = null;
        vhsVar.a = null;
    }
}
