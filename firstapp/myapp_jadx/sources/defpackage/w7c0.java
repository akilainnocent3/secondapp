package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyjet.views.SportyJetFragment$ThunderAnimationController$2$1", f = "SportyJetFragment.kt", l = {1511}, m = "invokeSuspend", v = 1)
public final class w7c0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ xpf0 c;

    public static final class a<T> implements myh {
        public final /* synthetic */ xpf0 a;

        public a(xpf0 xpf0Var) {
            this.a = xpf0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            float fFloatValue = ((Number) obj).floatValue();
            wwd0 wwd0Var = this.a.c;
            Float fValueOf = Float.valueOf(fFloatValue);
            wwd0Var.getClass();
            wwd0Var.k(null, fValueOf);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7c0(wd0<Float, ij0> wd0Var, xpf0 xpf0Var, v1b<? super w7c0> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = xpf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w7c0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((w7c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final wd0<Float, ij0> wd0Var = this.b;
            or60 or60VarC = n95.c(new Function0() { // from class: v7c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(((Number) wd0Var.d()).floatValue());
                }
            });
            a aVar = new a(this.c);
            this.a = 1;
            if (or60VarC.collect(aVar, this) == y5bVar) {
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
