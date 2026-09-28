package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes.dex */
public final class xua implements qua {
    public final r120 a;
    public final r120 b;
    public final nua c;
    public final ThreadLocal<u120> d;
    public final AtomicBoolean e;
    public final long f;

    public xua(final t52.a aVar, final String str, int i) {
        str.getClass();
        this.c = new nua();
        this.d = new ThreadLocal<>();
        this.e = new AtomicBoolean(false);
        b.a aVar2 = b.b;
        this.f = c.h(30, rgf.SECONDS);
        if (i <= 0) {
            hb5.a("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.a = new r120(i, new Function0() { // from class: rua
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                vp60 vp60VarA = aVar.a(str);
                up60.a(vp60VarA, "PRAGMA query_only = 1");
                return vp60VarA;
            }
        });
        this.b = new r120(1, new fs6(aVar, str, 1));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e.compareAndSet(false, true)) {
            this.a.c();
            this.b.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145 A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #3 {all -> 0x019a, blocks: (B:64:0x0122, B:69:0x013a, B:71:0x0145, B:86:0x019e, B:87:0x01a5), top: B:113:0x0122 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0171  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:86:0x019e A[Catch: all -> 0x019a, TRY_ENTER, TryCatch #3 {all -> 0x019a, blocks: (B:64:0x0122, B:69:0x013a, B:71:0x0145, B:86:0x019e, B:87:0x01a5), top: B:113:0x0122 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [tua] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [r120] */
    /* JADX WARN: Type inference failed for: r2v9, types: [r120] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, r120] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, u120] */
    @Override // defpackage.qua
    public final Object w0(final boolean z, Function2 function2, x1b x1bVar) {
        uua uuaVar;
        Throwable th;
        ?? r2;
        dq40 dq40Var;
        CoroutineContext coroutineContext;
        Object obj;
        boolean z2;
        Function2 function3;
        dq40 dq40Var2;
        nua nuaVar;
        ?? r3;
        boolean z3;
        Object obj2;
        Object objD;
        ?? r4;
        dq40 dq40Var3;
        u120 u120Var;
        ava avaVar;
        if (x1bVar instanceof uua) {
            uuaVar = (uua) x1bVar;
            int i = uuaVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                uuaVar.y = i - Integer.MIN_VALUE;
            } else {
                uuaVar = new uua(this, x1bVar);
            }
        } else {
            uuaVar = new uua(this, x1bVar);
        }
        Object obj3 = uuaVar.v;
        y5b y5bVar = y5b.a;
        int i2 = uuaVar.y;
        ThreadLocal<u120> threadLocal = this.d;
        r120 r120Var = this.b;
        r120 r120Var2 = this.a;
        nua nuaVar2 = this.c;
        if (i2 == 0) {
            uj50.b(obj3);
            if (this.e.get()) {
                up60.b(21, "Connection pool is closed");
                throw null;
            }
            u120 u120Var2 = threadLocal.get();
            if (u120Var2 == null) {
                mua muaVar = (mua) uuaVar.getContext().get(nuaVar2);
                u120Var2 = muaVar != null ? muaVar.b : null;
            }
            if (u120Var2 == null) {
                ?? r5 = z ? r120Var2 : r120Var;
                dq40 dq40Var4 = new dq40();
                try {
                    CoroutineContext context = uuaVar.getContext();
                    long j = this.f;
                    ?? r13 = new Function0() { // from class: tua
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str = z ? "reader" : "writer";
                            StringBuilder sb = new StringBuilder();
                            sb.append("Timed out attempting to acquire a " + str + " connection.");
                            sb.append("\n\nWriter pool:\n");
                            xua xuaVar = this.a;
                            xuaVar.b.d(sb);
                            sb.append("Reader pool:");
                            sb.append('\n');
                            xuaVar.a.d(sb);
                            try {
                                up60.b(5, sb.toString());
                                throw null;
                            } catch (SQLException e) {
                                e.printStackTrace();
                                return Unit.a;
                            }
                        }
                    };
                    uuaVar.b = function2;
                    uuaVar.c = r5;
                    uuaVar.d = dq40Var4;
                    uuaVar.e = context;
                    uuaVar.f = dq40Var4;
                    uuaVar.i = nuaVar2;
                    uuaVar.a = z;
                    uuaVar.y = 3;
                    Object objB = r5.b(j, r13, uuaVar);
                    if (objB != y5bVar) {
                        dq40Var = dq40Var4;
                        coroutineContext = context;
                        obj = objB;
                        z2 = z;
                        function3 = function2;
                        dq40Var2 = dq40Var;
                        nuaVar = nuaVar2;
                        r3 = r5;
                        ava avaVar2 = (ava) obj;
                        avaVar2.getClass();
                        coroutineContext.getClass();
                        avaVar2.c = coroutineContext;
                        avaVar2.d = new Throwable();
                        if (r120Var2 == r120Var) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        dq40Var2.a = new u120(nuaVar, avaVar2, z3);
                        obj2 = dq40Var.a;
                        if (obj2 != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        u120 u120Var3 = (u120) obj2;
                        CoroutineContext coroutineContextD = CoroutineContext.Element.a.d(new mua(nuaVar2, u120Var3), new wof0(u120Var3, threadLocal));
                        wua wuaVar = new wua(function3, dq40Var, null);
                        uuaVar.b = r3;
                        uuaVar.c = dq40Var;
                        uuaVar.d = null;
                        uuaVar.e = null;
                        uuaVar.f = null;
                        uuaVar.i = null;
                        uuaVar.y = 4;
                        objD = ej5.d(coroutineContextD, wuaVar, uuaVar);
                        if (objD != y5bVar) {
                            r4 = r3;
                            dq40Var3 = dq40Var;
                            obj3 = objD;
                            u120Var = (u120) dq40Var3.a;
                            if (u120Var != null) {
                                avaVar = u120Var.b;
                                if (u120Var.e.compareAndSet(false, true)) {
                                    up60.a(avaVar, "ROLLBACK TRANSACTION");
                                }
                                avaVar.c = null;
                                avaVar.d = null;
                                r4.e(avaVar);
                            }
                            return obj3;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r2 = r5;
                    dq40Var = dq40Var4;
                }
            } else {
                if (!z && u120Var2.c) {
                    up60.b(1, "Cannot upgrade connection from reader to writer");
                    throw null;
                }
                if (uuaVar.getContext().get(nuaVar2) == null) {
                    CoroutineContext coroutineContextD2 = CoroutineContext.Element.a.d(new mua(nuaVar2, u120Var2), new wof0(u120Var2, threadLocal));
                    vua vuaVar = new vua(function2, u120Var2, null);
                    uuaVar.y = 1;
                    Object objD2 = ej5.d(coroutineContextD2, vuaVar, uuaVar);
                    if (objD2 != y5bVar) {
                        return objD2;
                    }
                } else {
                    uuaVar.y = 2;
                    Object objInvoke = function2.invoke(u120Var2, uuaVar);
                    if (objInvoke != y5bVar) {
                        return objInvoke;
                    }
                }
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(obj3);
            return obj3;
        }
        if (i2 == 2) {
            uj50.b(obj3);
            return obj3;
        }
        if (i2 == 3) {
            z2 = uuaVar.a;
            nuaVar = uuaVar.i;
            dq40Var2 = uuaVar.f;
            CoroutineContext coroutineContext2 = uuaVar.e;
            dq40Var = uuaVar.d;
            r120 r120Var3 = (r120) uuaVar.c;
            function3 = (Function2) uuaVar.b;
            try {
                uj50.b(obj3);
                coroutineContext = coroutineContext2;
                obj = obj3;
                r3 = r120Var3;
                try {
                    ava avaVar3 = (ava) obj;
                    avaVar3.getClass();
                    coroutineContext.getClass();
                    avaVar3.c = coroutineContext;
                    avaVar3.d = new Throwable();
                    if (r120Var2 == r120Var && z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    dq40Var2.a = new u120(nuaVar, avaVar3, z3);
                    obj2 = dq40Var.a;
                    if (obj2 != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    u120 u120Var4 = (u120) obj2;
                    CoroutineContext coroutineContextD3 = CoroutineContext.Element.a.d(new mua(nuaVar2, u120Var4), new wof0(u120Var4, threadLocal));
                    wua wuaVar2 = new wua(function3, dq40Var, null);
                    uuaVar.b = r3;
                    uuaVar.c = dq40Var;
                    uuaVar.d = null;
                    uuaVar.e = null;
                    uuaVar.f = null;
                    uuaVar.i = null;
                    uuaVar.y = 4;
                    objD = ej5.d(coroutineContextD3, wuaVar2, uuaVar);
                    if (objD != y5bVar) {
                        r4 = r3;
                        dq40Var3 = dq40Var;
                        obj3 = objD;
                        u120Var = (u120) dq40Var3.a;
                        if (u120Var != null) {
                            avaVar = u120Var.b;
                            if (u120Var.e.compareAndSet(false, true)) {
                                up60.a(avaVar, "ROLLBACK TRANSACTION");
                            }
                            avaVar.c = null;
                            avaVar.d = null;
                            r4.e(avaVar);
                        }
                        return obj3;
                    }
                    return y5bVar;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = r3;
                }
            } catch (Throwable th4) {
                th = th4;
                r2 = r120Var3;
            }
        } else {
            if (i2 != 4) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40Var3 = (dq40) uuaVar.c;
            r120 r120Var4 = (r120) uuaVar.b;
            try {
                uj50.b(obj3);
                r4 = r120Var4;
                u120Var = (u120) dq40Var3.a;
                if (u120Var != null) {
                    avaVar = u120Var.b;
                    if (u120Var.e.compareAndSet(false, true) && avaVar.a.s()) {
                        up60.a(avaVar, "ROLLBACK TRANSACTION");
                    }
                    avaVar.c = null;
                    avaVar.d = null;
                    r4.e(avaVar);
                }
                return obj3;
            } catch (Throwable th5) {
                dq40Var = dq40Var3;
                th = th5;
                r2 = r120Var4;
            }
        }
        try {
            throw th;
        } catch (Throwable th6) {
            try {
                u120 u120Var5 = (u120) dq40Var.a;
                if (u120Var5 == null) {
                    throw th6;
                }
                ava avaVar4 = u120Var5.b;
                if (u120Var5.e.compareAndSet(false, true) && avaVar4.a.s()) {
                    up60.a(avaVar4, "ROLLBACK TRANSACTION");
                }
                ava avaVar5 = u120Var5.b;
                avaVar5.c = null;
                avaVar5.d = null;
                r2.e(avaVar5);
                throw th6;
            } catch (Throwable th7) {
                rtg.a(th, th7);
                throw th6;
            }
        }
    }

    public xua(final t52.a aVar) {
        this.c = new nua();
        this.d = new ThreadLocal<>();
        this.e = new AtomicBoolean(false);
        b.a aVar2 = b.b;
        this.f = c.h(30, rgf.SECONDS);
        r120 r120Var = new r120(1, new Function0() { // from class: sua
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return aVar.a(":memory:");
            }
        });
        this.a = r120Var;
        this.b = r120Var;
    }
}
