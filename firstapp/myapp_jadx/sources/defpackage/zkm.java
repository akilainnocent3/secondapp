package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zkm extends d.c implements s020 {
    public psw D;
    public vkm E;

    @c0d(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {89}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zkm.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (zkm.this.p2(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {90}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zkm.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (zkm.this.q2(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @Override // defpackage.s020
    public final void W(b020 b020Var, c020 c020Var, long j) {
        if (c020Var == c020.b) {
            int i = b020Var.e;
            if (i == 4) {
                ej5.c(d2(), null, null, new a(null), 3);
            } else if (i == 5) {
                ej5.c(d2(), null, null, new b(null), 3);
            }
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        r2();
    }

    @Override // defpackage.s020
    public final void n1() {
        r2();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p2(x1b x1bVar) {
        xkm xkmVar;
        vkm vkmVar;
        if (x1bVar instanceof xkm) {
            xkmVar = (xkm) x1bVar;
            int i = xkmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xkmVar.d = i - Integer.MIN_VALUE;
            } else {
                xkmVar = new xkm(this, x1bVar);
            }
        } else {
            xkmVar = new xkm(this, x1bVar);
        }
        Object obj = xkmVar.b;
        y5b y5bVar = y5b.a;
        int i2 = xkmVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            if (this.E == null) {
                vkm vkmVar2 = new vkm();
                psw pswVar = this.D;
                xkmVar.a = vkmVar2;
                xkmVar.d = 1;
                if (pswVar.a(vkmVar2, xkmVar) == y5bVar) {
                    return y5bVar;
                }
                vkmVar = vkmVar2;
            }
            return Unit.a;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vkmVar = xkmVar.a;
        uj50.b(obj);
        this.E = vkmVar;
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q2(x1b x1bVar) {
        ykm ykmVar;
        if (x1bVar instanceof ykm) {
            ykmVar = (ykm) x1bVar;
            int i = ykmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ykmVar.c = i - Integer.MIN_VALUE;
            } else {
                ykmVar = new ykm(this, x1bVar);
            }
        } else {
            ykmVar = new ykm(this, x1bVar);
        }
        Object obj = ykmVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ykmVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            vkm vkmVar = this.E;
            if (vkmVar != null) {
                wkm wkmVar = new wkm(vkmVar);
                psw pswVar = this.D;
                ykmVar.c = 1;
                if (pswVar.a(wkmVar, ykmVar) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        this.E = null;
        return Unit.a;
    }

    public final void r2() {
        vkm vkmVar = this.E;
        if (vkmVar != null) {
            this.D.c(new wkm(vkmVar));
            this.E = null;
        }
    }
}
