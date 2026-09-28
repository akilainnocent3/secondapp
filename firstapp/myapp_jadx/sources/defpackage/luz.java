package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class luz implements crg0, r040 {
    public final Function2<Function1<? super v1b<Object>, ? extends Object>, v1b<Object>, Object> a;
    public final vp60 b;
    public final AtomicInteger c;
    public crg0.a d;

    public final class a<T> implements sqg0<T>, r040 {
        public a() {
        }

        @Override // defpackage.t120
        public final Object c(String str, Function1 function1, x1b x1bVar) {
            return luz.this.c(str, function1, x1bVar);
        }

        @Override // defpackage.r040
        public final vp60 d() {
            return luz.this.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public luz(Function2<? super Function1<? super v1b<Object>, ? extends Object>, ? super v1b<Object>, ? extends Object> function2, vp60 vp60Var) {
        vp60Var.getClass();
        this.a = function2;
        this.b = vp60Var;
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.crg0
    public final Object a(crg0.a aVar, Function2 function2, tje0 tje0Var) {
        Object objInvoke = this.a.invoke(new puz(this, aVar, function2, null), tje0Var);
        y5b y5bVar = y5b.a;
        return objInvoke;
    }

    @Override // defpackage.crg0
    public final Boolean b(v1b v1bVar) {
        return Boolean.valueOf(this.d != null || this.b.s());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.t120
    public final Object c(String str, Function1 function1, x1b x1bVar) {
        nuz nuzVar;
        if (x1bVar instanceof nuz) {
            nuzVar = (nuz) x1bVar;
            int i = nuzVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nuzVar.e = i - Integer.MIN_VALUE;
            } else {
                nuzVar = new nuz(this, x1bVar);
            }
        } else {
            nuzVar = new nuz(this, x1bVar);
        }
        Object objB = nuzVar.c;
        Object obj = y5b.a;
        int i2 = nuzVar.e;
        if (i2 == 0) {
            uj50.b(objB);
            nuzVar.a = str;
            nuzVar.b = function1;
            nuzVar.e = 1;
            objB = b(nuzVar);
            if (objB != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objB);
                return objB;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        function1 = nuzVar.b;
        str = nuzVar.a;
        uj50.b(objB);
        if (((Boolean) objB).booleanValue()) {
            ouz ouzVar = new ouz(this, str, function1, null);
            nuzVar.a = null;
            nuzVar.b = null;
            nuzVar.e = 2;
            Object objInvoke = this.a.invoke(ouzVar, nuzVar);
            return objInvoke == obj ? obj : objInvoke;
        }
        hq60 hq60VarH1 = this.b.H1(str);
        try {
            Object objInvoke2 = function1.invoke(hq60VarH1);
            vc1.a(hq60VarH1, null);
            return objInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vc1.a(hq60VarH1, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.r040
    public final vp60 d() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(crg0.a aVar, Function2 function2, x1b x1bVar) {
        muz muzVar;
        if (x1bVar instanceof muz) {
            muzVar = (muz) x1bVar;
            int i = muzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                muzVar.d = i - Integer.MIN_VALUE;
            } else {
                muzVar = new muz(this, x1bVar);
            }
        } else {
            muzVar = new muz(this, x1bVar);
        }
        Object objInvoke = muzVar.b;
        y5b y5bVar = y5b.a;
        int i2 = muzVar.d;
        AtomicInteger atomicInteger = this.c;
        int i3 = 1;
        vp60 vp60Var = this.b;
        try {
            if (i2 == 0) {
                uj50.b(objInvoke);
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    up60.a(vp60Var, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    up60.a(vp60Var, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return null;
                    }
                    up60.a(vp60Var, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.d = aVar;
                }
                a aVar2 = new a();
                muzVar.a = 1;
                muzVar.d = 1;
                objInvoke = function2.invoke(aVar2, muzVar);
                if (objInvoke == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = muzVar.a;
                uj50.b(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.d = null;
            }
            if (i3 != 0) {
                up60.a(vp60Var, "END TRANSACTION");
                return objInvoke;
            }
            up60.a(vp60Var, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th) {
            th = th;
            try {
                if (th instanceof qua.a) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    up60.a(vp60Var, "ROLLBACK TRANSACTION");
                    return null;
                }
                try {
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (atomicInteger.decrementAndGet() == 0) {
                            this.d = null;
                        }
                        up60.a(vp60Var, "ROLLBACK TRANSACTION");
                    } catch (SQLException e) {
                        if (th == null) {
                            throw e;
                        }
                        rtg.a(th, e);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = null;
            }
        }
    }
}
