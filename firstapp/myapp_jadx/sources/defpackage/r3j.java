package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$showWarningToast$2", f = "FruitHuntBase.kt", l = {1365}, m = "invokeSuspend", v = 1)
public final class r3j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ n2j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3j(n2j n2jVar, v1b<? super r3j> v1bVar) {
        super(2, v1bVar);
        this.b = n2jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new r3j(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r3j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        int i2 = 1;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(2000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        n2j n2jVar = this.b;
        n2jVar.o0(new an5(n2jVar, i2));
        return Unit.a;
    }
}
