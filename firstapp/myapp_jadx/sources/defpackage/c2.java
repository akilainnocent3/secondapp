package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c2 implements Runnable {
    public final /* synthetic */ Throwable a;
    public final /* synthetic */ d2.a b;
    public final /* synthetic */ List c;

    public /* synthetic */ c2(Throwable th, d2.a aVar, List list) {
        this.a = th;
        this.b = aVar;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.a;
        d2.a aVar = this.b;
        if (th != null) {
            aVar.b.onError(th);
        } else {
            aVar.b.a(this.c);
        }
    }
}
