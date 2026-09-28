package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {736}, m = "invokeSuspend")
public final class ug0 extends tje0 implements Function2<bz20<Boolean>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dtg0<w7g> c;
    public final /* synthetic */ ytw d;

    public static final class a extends qlr implements Function0<Boolean> {
        public final /* synthetic */ dtg0<w7g> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dtg0<w7g> dtg0Var) {
            super(0);
            this.a = dtg0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            dtg0<w7g> dtg0Var = this.a;
            Object objV = dtg0Var.a.V();
            w7g w7gVar = w7g.c;
            return Boolean.valueOf(objV == w7gVar && ((x5a0) dtg0Var.d).getValue() == w7gVar);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ bz20<Boolean> a;
        public final /* synthetic */ dtg0<w7g> b;
        public final /* synthetic */ ytw c;

        public b(bz20 bz20Var, dtg0 dtg0Var, ytw ytwVar) {
            this.a = bz20Var;
            this.b = dtg0Var;
            this.c = ytwVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            boolean zBooleanValue;
            if (((Boolean) obj).booleanValue()) {
                Function2 function2 = (Function2) this.c.getValue();
                dtg0<w7g> dtg0Var = this.b;
                zBooleanValue = ((Boolean) function2.invoke(dtg0Var.a.V(), ((x5a0) dtg0Var.d).getValue())).booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.a.setValue(Boolean.valueOf(zBooleanValue));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug0(dtg0 dtg0Var, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.c = dtg0Var;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ug0 ug0Var = new ug0(this.c, this.d, v1bVar);
        ug0Var.b = obj;
        return ug0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bz20<Boolean> bz20Var, v1b<? super Unit> v1bVar) {
        return ((ug0) create(bz20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            bz20 bz20Var = (bz20) this.b;
            dtg0<w7g> dtg0Var = this.c;
            or60 or60VarC = n95.c(new a(dtg0Var));
            b bVar = new b(bz20Var, dtg0Var, this.d);
            this.a = 1;
            if (or60VarC.collect(bVar, this) == y5bVar) {
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
