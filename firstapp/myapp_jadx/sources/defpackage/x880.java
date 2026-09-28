package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {83}, m = "invokeSuspend")
public final class x880 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ twd0<gly> c;
    public final /* synthetic */ wd0<gly, jj0> d;

    public static final class a<T> implements myh {
        public final /* synthetic */ wd0<gly, jj0> a;
        public final /* synthetic */ v5b b;

        public a(wd0<gly, jj0> wd0Var, v5b v5bVar) {
            this.a = wd0Var;
            this.b = v5bVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            gly glyVar = (gly) obj;
            long j = glyVar.a;
            wd0<gly, jj0> wd0Var = this.a;
            if ((wd0Var.d().a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (wd0Var.d().a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                Object objF = wd0Var.f(v1bVar, glyVar);
                return objF == y5b.a ? objF : Unit.a;
            }
            ej5.c(this.b, null, null, new w880(wd0Var, j, null), 3);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x880(twd0<gly> twd0Var, wd0<gly, jj0> wd0Var, v1b<? super x880> v1bVar) {
        super(2, v1bVar);
        this.c = twd0Var;
        this.d = wd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        x880 x880Var = new x880(this.c, this.d, v1bVar);
        x880Var.b = obj;
        return x880Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((x880) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            v5b v5bVar = (v5b) this.b;
            or60 or60VarC = n95.c(new s6c(this.c, 1));
            a aVar = new a(this.d, v5bVar);
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
