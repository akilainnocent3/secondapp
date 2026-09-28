package defpackage;

import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hw5 implements Runnable {
    public final /* synthetic */ ow5 a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ tz5 c;

    public /* synthetic */ hw5(ow5 ow5Var, Executor executor, tz5 tz5Var) {
        this.a = ow5Var;
        this.b = executor;
        this.c = tz5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ow5.a aVar = this.a.A;
        HashSet hashSet = aVar.a;
        tz5 tz5Var = this.c;
        hashSet.add(tz5Var);
        aVar.b.put(tz5Var, this.b);
    }
}
