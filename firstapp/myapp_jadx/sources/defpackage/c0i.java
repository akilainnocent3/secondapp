package defpackage;

import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c0i {
    /* JADX WARN: Code duplicated, block: B:41:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable a(lyh lyhVar, myh myhVar, x1b x1bVar) {
        zzh zzhVar;
        dq40 dq40Var;
        Throwable th;
        c9p c9pVar;
        CancellationException cancellationException;
        if (x1bVar instanceof zzh) {
            zzhVar = (zzh) x1bVar;
            int i = zzhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzhVar.c = i - Integer.MIN_VALUE;
            } else {
                zzhVar = new zzh(x1bVar);
            }
        } else {
            zzhVar = new zzh(x1bVar);
        }
        Object obj = zzhVar.b;
        y5b y5bVar = y5b.a;
        int i2 = zzhVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40Var = zzhVar.a;
            try {
                uj50.b(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
                th = (Throwable) dq40Var.a;
                if (th == null) {
                    if (th == null) {
                        return th;
                    }
                    if (th instanceof CancellationException) {
                        rtg.a(th, th);
                        throw th;
                    }
                    rtg.a(th, th);
                    throw th;
                }
                if (th == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    rtg.a(th, th);
                    throw th;
                }
                rtg.a(th, th);
                throw th;
                throw th;
            }
        }
        dq40 dq40VarA = j6w.a(obj);
        try {
            a0i a0iVar = new a0i(myhVar, dq40VarA);
            zzhVar.a = dq40VarA;
            zzhVar.c = 1;
            if (lyhVar.collect(a0iVar, zzhVar) == y5bVar) {
                return y5bVar;
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            dq40Var = dq40VarA;
            th = (Throwable) dq40Var.a;
            if ((th == null && th.equals(th)) || ((c9pVar = (c9p) zzhVar.getContext().get(c9p.b.a)) != null && c9pVar.isCancelled() && (cancellationException = c9pVar.getCancellationException()) != null && cancellationException.equals(th))) {
                throw th;
            }
            if (th == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                rtg.a(th, th);
                throw th;
            }
            rtg.a(th, th);
            throw th;
        }
    }
}
