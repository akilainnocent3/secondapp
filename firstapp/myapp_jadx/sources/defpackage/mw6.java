package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend")
public final class mw6 extends tje0 implements Function2<Unit, v1b<?>, Object> {
    public int a;
    public final /* synthetic */ ow6 b;
    public final /* synthetic */ mk10 c;
    public final /* synthetic */ tk10 d;

    public static final class a extends qlr implements Function0<lk10> {
        @Override // kotlin.jvm.functions.Function0
        public final lk10 invoke() {
            throw null;
        }
    }

    @c0d(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<lk10, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ mk10 c;
        public final /* synthetic */ tk10 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mk10 mk10Var, tk10 tk10Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = mk10Var;
            this.d = tk10Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, this.d, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk10 lk10Var, v1b<? super Unit> v1bVar) {
            ((b) create(lk10Var, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                lk10 lk10Var = (lk10) this.b;
                this.a = 1;
                if (lk10Var.a() == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            fkd.a();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw6(ow6 ow6Var, mk10 mk10Var, tk10 tk10Var, v1b<? super mw6> v1bVar) {
        super(2, v1bVar);
        this.b = ow6Var;
        this.c = mk10Var;
        this.d = tk10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mw6(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<?> v1bVar) {
        ((mw6) create(unit, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            or60 or60VarC = n95.c(new a(0));
            b bVar = new b(this.c, this.d, null);
            this.a = 1;
            if (kzh.b(or60VarC, bVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ib5.a("Interceptors flow should never terminate.");
        return null;
    }
}
