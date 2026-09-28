package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.editbet.domain.usecase.EditBetEventUseCase$storeBetIdAndMaxAmount$2", f = "EditBetEventUseCase.kt", l = {90}, m = "invokeSuspend", v = 2)
public final class dmf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ emf b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmf(emf emfVar, String str, String str2, v1b<? super dmf> v1bVar) {
        super(2, v1bVar);
        this.b = emfVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dmf(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dmf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        emf emfVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            xlf xlfVar = emfVar.c;
            this.a = 1;
            if (xlfVar.a.putString("edit_bet_id", this.c, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        emfVar.d.n(this.d);
        return Unit.a;
    }
}
