package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.register.presentation.br.BrRegistrationSuccessfulViewModel$reportConversion$1", f = "BrRegistrationSuccessfulViewModel.kt", l = {156}, m = "invokeSuspend", v = 2)
public final class l95 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d95 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l95(d95 d95Var, String str, v1b<? super l95> v1bVar) {
        super(2, v1bVar);
        this.c = d95Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l95 l95Var = new l95(this.c, this.d, v1bVar);
        l95Var.b = obj;
        return l95Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l95) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                d95 d95Var = this.c;
                String str = this.d;
                zi50.a aVar = zi50.b;
                yqm yqmVar = d95Var.d;
                String str2 = z76.o.a;
                this.b = null;
                this.a = 1;
                if (yqmVar.c(str2, str, null, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            Unit unit = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable unused) {
            zi50.a aVar3 = zi50.b;
        }
        return Unit.a;
    }
}
