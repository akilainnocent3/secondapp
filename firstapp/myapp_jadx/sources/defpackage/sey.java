package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLuckyNumberFeatureMatchCardsUseCase$observeCard$$inlined$flatMapLatest$1", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class sey extends tje0 implements gaj<myh<? super y7q>, w7q<Object>, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function0 A;
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ afy d;
    public final /* synthetic */ x7q e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ g8q v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ Function1 y;
    public final /* synthetic */ Function0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sey(v1b v1bVar, afy afyVar, x7q x7qVar, Function1 function1, Function1 function2, g8q g8qVar, Function1 function3, Function1 function4, Function0 function0, Function0 function5) {
        super(3, v1bVar);
        this.d = afyVar;
        this.e = x7qVar;
        this.f = function1;
        this.i = function2;
        this.v = g8qVar;
        this.w = function3;
        this.y = function4;
        this.z = function0;
        this.A = function5;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super y7q> myhVar, w7q<Object> w7qVar, v1b<? super Unit> v1bVar) {
        sey seyVar = new sey(v1bVar, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A);
        seyVar.b = myhVar;
        seyVar.c = w7qVar;
        return seyVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            w7q w7qVar = (w7q) this.c;
            T t = w7qVar.b;
            boolean z = w7qVar.c;
            lyh gzhVar = (t == 0 || z) ? new gzh(new y7q(w7qVar.a, z)) : new or60(new uey(t, w7qVar.a, this.i, this.v, this.e, this.z, this.w, this.d, this.A, this.f, this.y, null));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
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
