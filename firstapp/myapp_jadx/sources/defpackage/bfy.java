package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLuckyNumberFeatureMatchCardsUseCaseKt$toTabSessionEvents$1", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {330}, m = "invokeSuspend", v = 2)
public final class bfy extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ku90 c;

    public static final class a<T> implements myh {
        public final /* synthetic */ yp40 a;
        public final /* synthetic */ myh<Boolean> b;

        public a(myh myhVar, yp40 yp40Var) {
            this.a = yp40Var;
            this.b = myhVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            c8q c8qVar = (c8q) obj;
            boolean z = c8qVar instanceof c8q.a;
            myh<Boolean> myhVar = this.b;
            yp40 yp40Var = this.a;
            if (z) {
                if (((c8q.a) c8qVar).a && yp40Var.a) {
                    return Unit.a;
                }
                yp40Var.a = true;
                return myhVar.emit(Boolean.TRUE, v1bVar);
            }
            if (Intrinsics.g(c8qVar, c8q.b.a)) {
                yp40Var.a = false;
                return myhVar.emit(Boolean.FALSE, v1bVar);
            }
            uhc.a();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfy(ku90 ku90Var, v1b v1bVar) {
        super(2, v1bVar);
        this.c = ku90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bfy bfyVar = new bfy(this.c, v1bVar);
        bfyVar.b = obj;
        return bfyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
        return ((bfy) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        a aVar = new a(myhVar, new yp40());
        this.b = null;
        this.a = 1;
        this.c.collect(aVar, this);
        return y5bVar;
    }
}
