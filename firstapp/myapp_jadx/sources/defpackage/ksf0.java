package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierMenu$1$1$1$1", f = "TierMenu.kt", l = {134}, m = "invokeSuspend", v = 2)
public final class ksf0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ krf0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ytw<trf0> d;
    public final /* synthetic */ Function1<Float, Unit> e;
    public final /* synthetic */ isw f;
    public final /* synthetic */ isw i;

    public static final class a<T> implements myh {
        public final /* synthetic */ krf0 a;
        public final /* synthetic */ Function1<Float, Unit> b;
        public final /* synthetic */ isw c;
        public final /* synthetic */ isw d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(krf0 krf0Var, Function1<? super Float, Unit> function1, isw iswVar, isw iswVar2) {
            this.a = krf0Var;
            this.b = function1;
            this.c = iswVar;
            this.d = iswVar2;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            float fFloatValue = ((Number) obj).floatValue();
            this.c.A(fFloatValue);
            if (this.a == krf0.TIER_98) {
                this.d.A(fFloatValue);
                this.b.invoke(new Float(fFloatValue));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ksf0(krf0 krf0Var, boolean z, ytw<trf0> ytwVar, Function1<? super Float, Unit> function1, isw iswVar, isw iswVar2, v1b<? super ksf0> v1bVar) {
        super(2, v1bVar);
        this.b = krf0Var;
        this.c = z;
        this.d = ytwVar;
        this.e = function1;
        this.f = iswVar;
        this.i = iswVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ksf0(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ksf0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            krf0 krf0Var = this.b;
            final int iB = lrf0.a(krf0Var) ? krf0.I.b() - 1 : krf0Var.a;
            final boolean z = this.c;
            final ytw<trf0> ytwVar = this.d;
            or60 or60VarC = n95.c(new Function0() { // from class: jsf0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float fAbs = 0.0f;
                    if (z) {
                        trf0 trf0Var = (trf0) ytwVar.getValue();
                        if (trf0Var.a % krf0.I.b() != iB) {
                            trf0Var = null;
                        }
                        if (trf0Var != null) {
                            fAbs = (0.5f - Math.abs(trf0Var.b)) * 2.0f;
                        }
                    }
                    return Float.valueOf(fAbs);
                }
            });
            a aVar = new a(krf0Var, this.e, this.f, this.i);
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
