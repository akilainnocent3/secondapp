package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.viewmodel.CampaignSocketViewModel$observeNonTopicMessages$1", f = "CampaignSocketViewModel.kt", l = {333}, m = "invokeSuspend", v = 1)
public final class f96 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i96 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ i96 a;

        public a(i96 i96Var) {
            this.a = i96Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            ((x5a0) this.a.P).setValue((String) obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f96(i96 i96Var, v1b<? super f96> v1bVar) {
        super(2, v1bVar);
        this.b = i96Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f96(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((f96) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        i96 i96Var = this.b;
        b390 b390VarF = i96Var.b.f();
        a aVar = new a(i96Var);
        this.a = 1;
        b390VarF.collect(aVar, this);
        return y5bVar;
    }
}
