package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipButtonOverlayKt$BetslipButtonOverlay$1$9$1$1", f = "BetslipButtonOverlay.kt", l = {376}, m = "invokeSuspend", v = 2)
public final class yl3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mmd b;
    public final /* synthetic */ ytw<b120> c;
    public final /* synthetic */ wd0<Float, ij0> d;
    public final /* synthetic */ wd0<Float, ij0> e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float i;
    public final /* synthetic */ float v;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipButtonOverlayKt$BetslipButtonOverlay$1$9$1$1$2", f = "BetslipButtonOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Pair<? extends Float, ? extends Float>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ dq40<b120> f;
        public final /* synthetic */ ytw<b120> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, float f2, float f3, float f4, dq40<b120> dq40Var, ytw<b120> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = dq40Var;
            this.i = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pair<? extends Float, ? extends Float> pair, v1b<? super Unit> v1bVar) {
            return ((a) create(pair, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x004a  */
        /* JADX WARN: Code duplicated, block: B:12:0x004c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            T t;
            Pair pair = (Pair) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            float fFloatValue = ((Number) pair.a).floatValue();
            float fFloatValue2 = ((Number) pair.b).floatValue();
            float f = this.b / 2.0f;
            float f2 = fFloatValue + f;
            float f3 = f + fFloatValue2;
            float f4 = this.c / 2.0f;
            float f5 = this.d / 2.0f;
            float fAbs = Math.abs(f2 - f4);
            float f6 = this.e;
            boolean zB = false;
            dq40<b120> dq40Var = this.f;
            if (fAbs <= f6) {
                b120 b120Var = dq40Var.a;
                b120Var.getClass();
                if (b120Var == b120.b || b120Var == b120.d) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (f2 > f4) {
                z = true;
            } else {
                z = false;
            }
            if (Math.abs(f3 - f5) <= f6) {
                zB = dq40Var.a.b();
            } else if (f3 < f5) {
                zB = true;
            }
            if (zB && z) {
                t = b120.d;
            } else {
                t = ((!zB || z) && !zB && z) ? b120.d : b120.c;
            }
            if (t != dq40Var.a) {
                dq40Var.a = t;
                this.i.setValue(t);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl3(mmd mmdVar, ytw<b120> ytwVar, wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, float f, float f2, float f3, v1b<? super yl3> v1bVar) {
        super(2, v1bVar);
        this.b = mmdVar;
        this.c = ytwVar;
        this.d = wd0Var;
        this.e = wd0Var2;
        this.f = f;
        this.i = f2;
        this.v = f3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yl3(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yl3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [T, java.lang.Object] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            float fC1 = this.b.C1(24.0f);
            dq40 dq40Var = new dq40();
            dq40Var.a = this.c.getValue();
            final wd0<Float, ij0> wd0Var = this.d;
            final wd0<Float, ij0> wd0Var2 = this.e;
            or60 or60VarC = n95.c(new Function0() { // from class: xl3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new Pair(wd0Var.d(), wd0Var2.d());
                }
            });
            a aVar = new a(this.f, this.i, this.v, fC1, dq40Var, this.c, null);
            this.a = 1;
            if (kzh.b(or60VarC, aVar, this) == y5bVar) {
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
