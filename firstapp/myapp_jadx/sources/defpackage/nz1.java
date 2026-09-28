package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {63}, m = "invokeSuspend")
public final class nz1 extends tje0 implements Function2<ez20<? super rxa>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oz1<Object> c;

    public static final class a extends qlr implements Function0<Unit> {
        public final /* synthetic */ oz1<Object> a;
        public final /* synthetic */ b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oz1<Object> oz1Var, b bVar) {
            super(0);
            this.a = oz1Var;
            this.b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            xwa<Object> xwaVar = this.a.a;
            b bVar = this.b;
            xwaVar.getClass();
            synchronized (xwaVar.c) {
                if (xwaVar.d.remove(bVar) && xwaVar.d.isEmpty()) {
                    xwaVar.d();
                }
            }
            return Unit.a;
        }
    }

    public static final class b implements qwa<Object> {
        public final /* synthetic */ oz1<Object> a;
        public final /* synthetic */ ez20<rxa> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(oz1<Object> oz1Var, ez20<? super rxa> ez20Var) {
            this.a = oz1Var;
            this.b = ez20Var;
        }

        @Override // defpackage.qwa
        public final void a(Object obj) {
            oz1<Object> oz1Var = this.a;
            this.b.d().c(oz1Var.e(obj) ? new rxa.b(oz1Var.d()) : rxa.a.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz1(oz1<Object> oz1Var, v1b<? super nz1> v1bVar) {
        super(2, v1bVar);
        this.c = oz1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nz1 nz1Var = new nz1(this.c, v1bVar);
        nz1Var.b = obj;
        return nz1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super rxa> ez20Var, v1b<? super Unit> v1bVar) {
        return ((nz1) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ez20 ez20Var = (ez20) this.b;
            oz1<Object> oz1Var = this.c;
            b bVar = new b(oz1Var, ez20Var);
            xwa<Object> xwaVar = oz1Var.a;
            xwaVar.getClass();
            synchronized (xwaVar.c) {
                try {
                    if (xwaVar.d.add(bVar)) {
                        if (xwaVar.d.size() == 1) {
                            xwaVar.e = xwaVar.a();
                            jgt.e().a(ywa.a, xwaVar.getClass().getSimpleName() + ": initial state = " + xwaVar.e);
                            xwaVar.c();
                        }
                        bVar.a(xwaVar.e);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            a aVar = new a(this.c, bVar);
            this.a = 1;
            if (az20.a(ez20Var, aVar, this) == y5bVar) {
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
