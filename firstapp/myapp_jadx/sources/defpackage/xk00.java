package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$onEditCode$3", f = "PersonalCodeViewModel.kt", l = {344}, m = "invokeSuspend", v = 2)
public final class xk00 extends tje0 implements Function2<myh<? super a8a0>, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ el00 b;
    public final /* synthetic */ kl00 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk00(v1b v1bVar, el00 el00Var, kl00 kl00Var, boolean z) {
        super(2, v1bVar);
        this.b = el00Var;
        this.c = kl00Var;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xk00(v1bVar, this.b, this.c, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super a8a0> myhVar, v1b<? super Unit> v1bVar) {
        return ((xk00) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            String str = this.c.a;
            bv7.a aVar = bv7.a.a;
            this.a = 1;
            if (this.b.y1(str, this.d, aVar) == y5bVar) {
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
