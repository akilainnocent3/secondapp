package defpackage;

import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ucy<T> implements dey<T> {
    public static ucy b(zd2 zd2Var, dey deyVar, k54 k54Var) {
        yby.b(zd2Var, "source1 is null");
        yby.b(deyVar, "source2 is null");
        return c(new dey[]{zd2Var, deyVar}, new taj.a(k54Var), r2i.a);
    }

    public static <T, R> ucy<R> c(dey<? extends T>[] deyVarArr, faj<? super Object[], ? extends R> fajVar, int i) {
        if (deyVarArr.length == 0) {
            return gdy.a;
        }
        yby.c(i, "bufferSize");
        return new vcy(deyVarArr, fajVar, i << 1);
    }

    public static <T> ucy<T> d(dey<? extends T>... deyVarArr) {
        ucy kdyVar;
        ucy ucyVar;
        if (deyVarArr.length == 0) {
            return gdy.a;
        }
        if (deyVarArr.length == 1) {
            dey<? extends T> deyVar = deyVarArr[0];
            yby.b(deyVar, "source is null");
            return deyVar instanceof ucy ? (ucy) deyVar : new mdy(deyVar);
        }
        if (deyVarArr.length == 0) {
            ucyVar = gdy.a;
        } else {
            if (deyVarArr.length == 1) {
                dey<? extends T> deyVar2 = deyVarArr[0];
                yby.b(deyVar2, "item is null");
                kdyVar = new pdy(deyVar2);
            } else {
                kdyVar = new kdy(deyVarArr);
            }
            ucyVar = kdyVar;
        }
        return new wcy(ucyVar, r2i.a);
    }

    @Override // defpackage.dey
    public final void a(kfy<? super T> kfyVar) {
        yby.b(kfyVar, "observer is null");
        try {
            g(kfyVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            qtg.a(th);
            o760.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> ucy<R> e(faj<? super T, ? extends dey<? extends R>> fajVar) throws Exception {
        int i = r2i.a;
        yby.c(Reader.READ_DONE, "maxConcurrency");
        yby.c(i, "bufferSize");
        if (!(this instanceof jy60)) {
            return new jdy(this, fajVar, i);
        }
        T tCall = ((jy60) this).call();
        return tCall == null ? gdy.a : new zdy.b(tCall, fajVar);
    }

    public final xdy f(qm70 qm70Var) {
        int i = r2i.a;
        yby.b(qm70Var, "scheduler is null");
        yby.c(i, "bufferSize");
        return new xdy(this, qm70Var, i);
    }

    public abstract void g(kfy<? super T> kfyVar);

    public final eey h(qm70 qm70Var) {
        yby.b(qm70Var, "scheduler is null");
        return new eey(this, qm70Var);
    }

    public final r2i<T> i(qt1 qt1Var) {
        x2i x2iVar = new x2i(this);
        int iOrdinal = qt1Var.ordinal();
        if (iOrdinal == 0) {
            return x2iVar;
        }
        if (iOrdinal == 1) {
            return new f3i(x2iVar);
        }
        if (iOrdinal == 3) {
            return new e3i(x2iVar);
        }
        if (iOrdinal == 4) {
            return new g3i(x2iVar);
        }
        int i = r2i.a;
        yby.c(i, "capacity");
        return new c3i(x2iVar, i);
    }
}
