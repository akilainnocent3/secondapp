package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyScreenKt$rememberBackToTopState$2$1", f = "LNLobbyScreen.kt", l = {502}, m = "invokeSuspend", v = 2)
public final class bpq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ zzr d;
    public final /* synthetic */ ytw e;
    public final /* synthetic */ float f;

    public static final class a<T> implements myh {
        public final /* synthetic */ dq40<Integer> a;
        public final /* synthetic */ aq40 b;
        public final /* synthetic */ float c;
        public final /* synthetic */ ytw d;
        public final /* synthetic */ float e;

        public a(dq40 dq40Var, aq40 aq40Var, float f, ytw ytwVar, float f2) {
            this.a = dq40Var;
            this.b = aq40Var;
            this.c = f;
            this.d = ytwVar;
            this.e = f2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            ?? r0;
            Pair pair = (Pair) obj;
            int iIntValue = ((Number) pair.a).intValue();
            int iIntValue2 = ((Number) pair.b).intValue();
            if (iIntValue != 0) {
                return Unit.a;
            }
            dq40<Integer> dq40Var = this.a;
            boolean z = (T) dq40Var.a;
            aq40 aq40Var = this.b;
            if (!z) {
                r0 = z;
                T t = (T) new Integer(iIntValue2);
                dq40Var.a = t;
                aq40Var.a = this.c;
                r0 = t;
            }
            r0 = z;
            int iIntValue3 = ((Number) r0).intValue();
            float fD = f.d(iIntValue3 == 0 ? 1.0f : 1.0f - (iIntValue2 / iIntValue3), 0.0f, 1.0f);
            Function1 function1 = (Function1) this.d.getValue();
            float f = aq40Var.a;
            function1.invoke(new Float(hxa.a(this.e, f, fD, f)));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpq(float f, ytw ytwVar, zzr zzrVar, ytw ytwVar2, float f2, v1b v1bVar) {
        super(2, v1bVar);
        this.b = f;
        this.c = ytwVar;
        this.d = zzrVar;
        this.e = ytwVar2;
        this.f = f2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bpq(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bpq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (!this.c.getValue().booleanValue()) {
                return Unit.a;
            }
            dq40 dq40Var = new dq40();
            aq40 aq40Var = new aq40();
            aq40Var.a = this.b;
            or60 or60VarC = n95.c(new zb3(this.d, 1));
            a aVar = new a(dq40Var, aq40Var, this.b, this.e, this.f);
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
