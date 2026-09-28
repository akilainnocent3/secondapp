package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class u120 implements crg0, r040 {
    public final nua a;
    public final ava b;
    public final boolean c;
    public final gx0<c> d;
    public final AtomicBoolean e;

    public final class a implements hq60 {
        public final hq60 a;
        public final long b;
        public final /* synthetic */ u120 c;

        public a(u120 u120Var, hq60 hq60Var) {
            hq60Var.getClass();
            this.c = u120Var;
            this.a = hq60Var;
            this.b = zof0.a();
        }

        @Override // defpackage.hq60
        public final boolean D1() {
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                return this.a.D1();
            }
            up60.b(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.hq60
        public final void L(int i, String str) {
            str.getClass();
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                this.a.L(i, str);
            } else {
                up60.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                this.a.close();
            } else {
                up60.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // defpackage.hq60
        public final int getColumnCount() {
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                return this.a.getColumnCount();
            }
            up60.b(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.hq60
        public final String getColumnName(int i) {
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                return this.a.getColumnName(i);
            }
            up60.b(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.hq60
        public final double getDouble(int i) {
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                return this.a.getDouble(i);
            }
            up60.b(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.hq60
        public final long getLong(int i) {
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                return this.a.getLong(i);
            }
            up60.b(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.hq60
        public final void i(int i, double d) {
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                this.a.i(i, d);
            } else {
                up60.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // defpackage.hq60
        public final boolean isNull(int i) {
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                return this.a.isNull(i);
            }
            up60.b(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.hq60
        public final String k1(int i) {
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                return this.a.k1(i);
            }
            up60.b(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.hq60
        public final void q(int i, long j) {
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                this.a.q(i, j);
            } else {
                up60.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // defpackage.hq60
        public final void r(int i) {
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                this.a.r(i);
            } else {
                up60.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // defpackage.hq60
        public final void reset() {
            if (this.c.e.get()) {
                up60.b(21, "Statement is recycled");
                throw null;
            }
            if (this.b == zof0.a()) {
                this.a.reset();
            } else {
                up60.b(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
    }

    public final class b<T> implements sqg0<T>, r040 {
        public b() {
        }

        @Override // defpackage.t120
        public final Object c(String str, Function1 function1, x1b x1bVar) {
            return u120.this.c(str, function1, x1bVar);
        }

        @Override // defpackage.r040
        public final vp60 d() {
            return u120.this.b;
        }
    }

    public static final class c {
        public final int a;

        public c(int i) {
            this.a = i;
        }
    }

    public u120(nua nuaVar, ava avaVar, boolean z) {
        nuaVar.getClass();
        this.a = nuaVar;
        this.b = avaVar;
        this.c = z;
        this.d = new gx0<>();
        this.e = new AtomicBoolean(false);
    }

    @Override // defpackage.crg0
    public final Object a(crg0.a aVar, Function2 function2, tje0 tje0Var) {
        if (this.e.get()) {
            up60.b(21, "Connection is recycled");
            throw null;
        }
        mua muaVar = (mua) tje0Var.getContext().get(this.a);
        if (muaVar != null && muaVar.b == this) {
            return g(aVar, function2, tje0Var);
        }
        up60.b(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.crg0
    public final Boolean b(v1b v1bVar) {
        if (this.e.get()) {
            up60.b(21, "Connection is recycled");
            throw null;
        }
        mua muaVar = (mua) v1bVar.getContext().get(this.a);
        if (muaVar != null && muaVar.b == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.a.s());
        }
        up60.b(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.t120
    public final Object c(String str, Function1 function1, x1b x1bVar) {
        y120 y120Var;
        Function1 function2;
        ava avaVar;
        if (x1bVar instanceof y120) {
            y120Var = (y120) x1bVar;
            int i = y120Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                y120Var.f = i - Integer.MIN_VALUE;
            } else {
                y120Var = new y120(this, x1bVar);
            }
        } else {
            y120Var = new y120(this, x1bVar);
        }
        Object obj = y120Var.d;
        y5b y5bVar = y5b.a;
        int i2 = y120Var.f;
        ava avaVar2 = this.b;
        if (i2 == 0) {
            uj50.b(obj);
            if (this.e.get()) {
                up60.b(21, "Connection is recycled");
                throw null;
            }
            mua muaVar = (mua) y120Var.getContext().get(this.a);
            if (muaVar == null || muaVar.b != this) {
                up60.b(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            y120Var.a = str;
            y120Var.b = function1;
            y120Var.c = avaVar2;
            y120Var.f = 1;
            if (avaVar2.b.d(y120Var) == y5bVar) {
                return y5bVar;
            }
            function2 = function1;
            avaVar = avaVar2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ava avaVar3 = y120Var.c;
            Function1 function3 = y120Var.b;
            String str2 = y120Var.a;
            uj50.b(obj);
            function2 = function3;
            avaVar = avaVar3;
            str = str2;
        }
        try {
            a aVar = new a(this, avaVar2.H1(str));
            try {
                Object objInvoke = function2.invoke(aVar);
                vc1.a(aVar, null);
                avaVar.f(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    vc1.a(aVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            avaVar.f(null);
            throw th3;
        }
    }

    @Override // defpackage.r040
    public final vp60 d() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(crg0.a aVar, x1b x1bVar) {
        v120 v120Var;
        ava avaVar;
        gx0<c> gx0Var = this.d;
        if (x1bVar instanceof v120) {
            v120Var = (v120) x1bVar;
            int i = v120Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                v120Var.e = i - Integer.MIN_VALUE;
            } else {
                v120Var = new v120(this, x1bVar);
            }
        } else {
            v120Var = new v120(this, x1bVar);
        }
        Object obj = v120Var.c;
        y5b y5bVar = y5b.a;
        int i2 = v120Var.e;
        ava avaVar2 = this.b;
        if (i2 == 0) {
            uj50.b(obj);
            v120Var.a = aVar;
            v120Var.b = avaVar2;
            v120Var.e = 1;
            if (avaVar2.b.d(v120Var) == y5bVar) {
                return y5bVar;
            }
            avaVar = avaVar2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ava avaVar3 = v120Var.b;
            crg0.a aVar2 = v120Var.a;
            uj50.b(obj);
            avaVar = avaVar3;
            aVar = aVar2;
        }
        try {
            int i3 = gx0Var.c;
            if (gx0Var.isEmpty()) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    up60.a(avaVar2, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    up60.a(avaVar2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new uwx();
                    }
                    up60.a(avaVar2, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                up60.a(avaVar2, "SAVEPOINT '" + i3 + '\'');
            }
            gx0Var.addLast(new c(i3));
            Unit unit = Unit.a;
            avaVar.f(null);
            return unit;
        } catch (Throwable th) {
            avaVar.f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(boolean z, x1b x1bVar) {
        w120 w120Var;
        ava avaVar;
        gx0<c> gx0Var = this.d;
        if (x1bVar instanceof w120) {
            w120Var = (w120) x1bVar;
            int i = w120Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                w120Var.e = i - Integer.MIN_VALUE;
            } else {
                w120Var = new w120(this, x1bVar);
            }
        } else {
            w120Var = new w120(this, x1bVar);
        }
        Object obj = w120Var.c;
        y5b y5bVar = y5b.a;
        int i2 = w120Var.e;
        ava avaVar2 = this.b;
        if (i2 == 0) {
            uj50.b(obj);
            w120Var.b = avaVar2;
            w120Var.a = z;
            w120Var.e = 1;
            if (avaVar2.b.d(w120Var) == y5bVar) {
                return y5bVar;
            }
            avaVar = avaVar2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = w120Var.a;
            avaVar = w120Var.b;
            uj50.b(obj);
        }
        try {
            if (gx0Var.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            c cVar = (c) p48.C(gx0Var);
            if (z) {
                cVar.getClass();
                if (gx0Var.isEmpty()) {
                    up60.a(avaVar2, "END TRANSACTION");
                } else {
                    up60.a(avaVar2, "RELEASE SAVEPOINT '" + cVar.a + '\'');
                }
            } else if (gx0Var.isEmpty()) {
                up60.a(avaVar2, "ROLLBACK TRANSACTION");
            } else {
                up60.a(avaVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + cVar.a + '\'');
            }
            Unit unit = Unit.a;
            avaVar.f(null);
            return unit;
        } catch (Throwable th) {
            avaVar.f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(crg0.a aVar, Function2 function2, x1b x1bVar) throws Throwable {
        x120 x120Var;
        Throwable th;
        Throwable th2;
        int i;
        boolean z;
        if (x1bVar instanceof x120) {
            x120Var = (x120) x1bVar;
            int i2 = x120Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x120Var.f = i2 - Integer.MIN_VALUE;
            } else {
                x120Var = new x120(this, x1bVar);
            }
        } else {
            x120Var = new x120(this, x1bVar);
        }
        Object objInvoke = x120Var.d;
        Object obj = y5b.a;
        int i3 = x120Var.f;
        Throwable th3 = null;
        try {
            if (i3 == 0) {
                uj50.b(objInvoke);
                if (aVar == null) {
                    aVar = crg0.a.a;
                }
                x120Var.a = function2;
                x120Var.f = 1;
                if (e(aVar, x120Var) != obj) {
                }
                return obj;
            }
            if (i3 == 1) {
                function2 = (Function2) x120Var.a;
                uj50.b(objInvoke);
            } else {
                if (i3 != 2) {
                    if (i3 == 3 || i3 == 4) {
                        Object obj2 = x120Var.a;
                        uj50.b(objInvoke);
                        return obj2;
                    }
                    if (i3 != 5) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = x120Var.b;
                    th2 = (Throwable) x120Var.a;
                    try {
                        uj50.b(objInvoke);
                        throw th;
                    } catch (SQLException e) {
                        e = e;
                        if (th2 != null) {
                            throw e;
                        }
                        rtg.a(th2, e);
                        throw th;
                    }
                }
                i = x120Var.c;
                uj50.b(objInvoke);
            }
            z = i != 0;
            x120Var.a = objInvoke;
            x120Var.f = 3;
            if (f(z, x120Var) != obj) {
                return obj;
            }
            return objInvoke;
            b bVar = new b();
            x120Var.a = null;
            x120Var.c = 1;
            x120Var.f = 2;
            objInvoke = function2.invoke(bVar, x120Var);
            if (objInvoke != obj) {
                i = 1;
                if (i != 0) {
                }
                x120Var.a = objInvoke;
                x120Var.f = 3;
                if (f(z, x120Var) != obj) {
                    return objInvoke;
                }
            }
        } catch (Throwable th4) {
            try {
                if (th4 instanceof qua.a) {
                    x120Var.a = null;
                    x120Var.f = 4;
                    if (f(false, x120Var) == obj) {
                        return obj;
                    }
                    return null;
                }
                try {
                    throw th4;
                } catch (Throwable th5) {
                    th3 = th4;
                    th = th5;
                    try {
                        x120Var.a = th3;
                        x120Var.b = th;
                        x120Var.f = 5;
                        if (f(false, x120Var) != obj) {
                            throw th;
                        }
                        return obj;
                    } catch (SQLException e2) {
                        e = e2;
                        th = th;
                        th2 = th3;
                        if (th2 != null) {
                            throw e;
                        }
                        rtg.a(th2, e);
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
        return obj;
    }
}
