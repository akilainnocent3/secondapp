package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pd implements Runnable {
    public final /* synthetic */ sd.a a;
    public final /* synthetic */ Object b;

    public pd(sd.a aVar, Object obj) {
        this.a = aVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a = this.b;
    }
}
