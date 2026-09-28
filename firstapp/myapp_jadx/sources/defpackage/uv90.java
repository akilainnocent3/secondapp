package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class uv90 {
    public final b a;

    public static final class a extends CancellationException {
        public final uv90 a;

        public a(uv90 uv90Var) {
            super("Cancelled isolated runner");
            this.a = uv90Var;
        }
    }

    public static final class b {
        public final uv90 a;
        public final boolean b;
        public final tuw c = uuw.a();
        public c9p d;
        public int e;

        public b(uv90 uv90Var, boolean z) {
            this.a = uv90Var;
            this.b = z;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(c9p c9pVar, x1b x1bVar) {
            vv90 vv90Var;
            tuw tuwVar;
            if (x1bVar instanceof vv90) {
                vv90Var = (vv90) x1bVar;
                int i = vv90Var.f;
                if ((i & Integer.MIN_VALUE) != 0) {
                    vv90Var.f = i - Integer.MIN_VALUE;
                } else {
                    vv90Var = new vv90(this, x1bVar);
                }
            } else {
                vv90Var = new vv90(this, x1bVar);
            }
            Object obj = vv90Var.d;
            y5b y5bVar = y5b.a;
            int i2 = vv90Var.f;
            if (i2 == 0) {
                uj50.b(obj);
                vv90Var.a = this;
                vv90Var.b = c9pVar;
                tuwVar = this.c;
                vv90Var.c = tuwVar;
                vv90Var.f = 1;
                if (tuwVar.d(vv90Var) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tuw tuwVar2 = vv90Var.c;
                c9pVar = vv90Var.b;
                b bVar = vv90Var.a;
                uj50.b(obj);
                tuwVar = tuwVar2;
                this = bVar;
            }
            try {
                if (c9pVar == this.d) {
                    this.d = null;
                }
                Unit unit = Unit.a;
                return Unit.a;
            } finally {
                tuwVar.f(null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object b(int i, c9p c9pVar, x1b x1bVar) {
            wv90 wv90Var;
            quw quwVar;
            b bVar;
            int i2;
            quw quwVar2;
            int i3;
            if (x1bVar instanceof wv90) {
                wv90Var = (wv90) x1bVar;
                int i4 = wv90Var.i;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    wv90Var.i = i4 - Integer.MIN_VALUE;
                } else {
                    wv90Var = new wv90(this, x1bVar);
                }
            } else {
                wv90Var = new wv90(this, x1bVar);
            }
            Object obj = wv90Var.e;
            y5b y5bVar = y5b.a;
            int i5 = wv90Var.i;
            boolean z = true;
            try {
                if (i5 == 0) {
                    uj50.b(obj);
                    wv90Var.a = this;
                    wv90Var.b = c9pVar;
                    quwVar = this.c;
                    wv90Var.c = quwVar;
                    wv90Var.d = i;
                    wv90Var.i = 1;
                    if (quwVar.d(wv90Var) != y5bVar) {
                    }
                    return y5bVar;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = wv90Var.d;
                    quwVar2 = wv90Var.c;
                    c9pVar = wv90Var.b;
                    bVar = wv90Var.a;
                    try {
                        uj50.b(obj);
                        quwVar = quwVar2;
                        i = i2;
                        this = bVar;
                        this.d = c9pVar;
                        this.e = i;
                        quwVar2 = quwVar;
                        Boolean boolValueOf = Boolean.valueOf(z);
                        quwVar2.f(null);
                        return boolValueOf;
                    } catch (Throwable th) {
                        th = th;
                        quwVar2.f(null);
                        throw th;
                    }
                }
                i = wv90Var.d;
                quw quwVar3 = wv90Var.c;
                c9pVar = wv90Var.b;
                b bVar2 = wv90Var.a;
                uj50.b(obj);
                quwVar = quwVar3;
                this = bVar2;
                c9p c9pVar2 = this.d;
                if (c9pVar2 == null || !c9pVar2.isActive() || (i3 = this.e) < i || (i3 == i && this.b)) {
                    if (c9pVar2 != null) {
                        c9pVar2.cancel((CancellationException) new a(this.a));
                    }
                    if (c9pVar2 != null) {
                        wv90Var.a = this;
                        wv90Var.b = c9pVar;
                        wv90Var.c = quwVar;
                        wv90Var.d = i;
                        wv90Var.i = 2;
                        if (c9pVar2.join(wv90Var) != y5bVar) {
                            bVar = this;
                            i2 = i;
                            quwVar2 = quwVar;
                            quwVar = quwVar2;
                            i = i2;
                            this = bVar;
                        }
                        return y5bVar;
                    }
                    this.d = c9pVar;
                    this.e = i;
                } else {
                    z = false;
                }
                quwVar2 = quwVar;
                Boolean boolValueOf2 = Boolean.valueOf(z);
                quwVar2.f(null);
                return boolValueOf2;
            } catch (Throwable th2) {
                th = th2;
                quwVar2 = quwVar;
                quwVar2.f(null);
                throw th;
            }
        }
    }

    public uv90(boolean z) {
        this.a = new b(this, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [uv90] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final Object a(int i, Function1 function1, x1b x1bVar) {
        xv90 xv90Var;
        if (x1bVar instanceof xv90) {
            xv90Var = (xv90) x1bVar;
            int i2 = xv90Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xv90Var.d = i2 - Integer.MIN_VALUE;
            } else {
                xv90Var = new xv90(this, x1bVar);
            }
        } else {
            xv90Var = new xv90(this, x1bVar);
        }
        Object obj = xv90Var.b;
        y5b y5bVar = y5b.a;
        int i3 = xv90Var.d;
        try {
            if (i3 == 0) {
                uj50.b(obj);
                yv90 yv90Var = new yv90(this, i, function1, null);
                xv90Var.a = this;
                xv90Var.d = 1;
                Object objD = w5b.d(yv90Var, xv90Var);
                this = objD;
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uv90 uv90Var = xv90Var.a;
                uj50.b(obj);
                this = uv90Var;
            }
        } catch (a e) {
            if (e.a != this) {
                throw e;
            }
        }
        return Unit.a;
    }
}
