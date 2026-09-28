package defpackage;

import android.media.metrics.NetworkEvent;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fp8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fp8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0s u0sVar = (u0s) this.b;
                n730 n730Var = (n730) this.c;
                synchronized (u0sVar) {
                    try {
                        if (u0sVar.b == 0) {
                            u0sVar.a.add((n730<T>) n730Var);
                        } else {
                            u0sVar.b.add((T) n730Var.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                ((yjv) this.b).t((NetworkEvent) this.c);
                return;
        }
    }
}
