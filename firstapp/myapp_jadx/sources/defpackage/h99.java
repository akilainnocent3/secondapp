package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class h99 {
    public static final op8 a = new op8(-1727675681, new g99(), false);
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static final void a(myh myhVar) {
        if (myhVar instanceof qpf0) {
            throw ((qpf0) myhVar).a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(qpf0 qpf0Var, gaj gajVar, Throwable th, x1b x1bVar) {
        vzh vzhVar;
        if (x1bVar instanceof vzh) {
            vzhVar = (vzh) x1bVar;
            int i = vzhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vzhVar.c = i - Integer.MIN_VALUE;
            } else {
                vzhVar = new vzh(x1bVar);
            }
        } else {
            vzhVar = new vzh(x1bVar);
        }
        Object obj = vzhVar.b;
        y5b y5bVar = y5b.a;
        int i2 = vzhVar.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                vzhVar.a = th;
                vzhVar.c = 1;
                if (gajVar.invoke(qpf0Var, th, vzhVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = vzhVar.a;
                uj50.b(obj);
            }
            return Unit.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                rtg.a(th2, th);
            }
            throw th2;
        }
    }
}
