package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.dateofbirth.domain.usecase.SetBirthdayGiftHintHasShownUseCase$execute$2", f = "SetBirthdayGiftHintHasShownUseCase.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class nh80 extends tje0 implements Function2<v5b, v1b<? super zi50<? extends Unit>>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oh80 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh80(oh80 oh80Var, String str, String str2, v1b<? super nh80> v1bVar) {
        super(2, v1bVar);
        this.c = oh80Var;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nh80 nh80Var = new nh80(this.c, this.d, this.e, v1bVar);
        nh80Var.b = obj;
        return nh80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends Unit>> v1bVar) {
        return ((nh80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                oh80 oh80Var = this.c;
                String str = this.d;
                String str2 = this.e;
                zi50.a aVar = zi50.b;
                tue tueVar = oh80Var.a;
                this.b = null;
                this.a = 1;
                if (tueVar.a.putBoolean("birthday_gift_record_" + str + "_" + str2, Boolean.TRUE, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.d(a320.a("SetBirthdayGiftHintHasShown Failed: ", thA), new Object[0]);
        }
        return new zi50(bVar);
    }
}
