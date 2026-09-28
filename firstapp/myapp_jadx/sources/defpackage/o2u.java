package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.loyalty.LoyaltyUseCase$markMissionsAsDisplayed$2", f = "LoyaltyUseCase.kt", l = {132}, m = "invokeSuspend", v = 2)
public final class o2u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Set<Long> b;
    public final /* synthetic */ List<Long> c;
    public final /* synthetic */ u2u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2u(Set<Long> set, List<Long> list, u2u u2uVar, v1b<? super o2u> v1bVar) {
        super(2, v1bVar);
        this.b = set;
        this.c = list;
        this.d = u2uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o2u(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o2u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            LinkedHashSet linkedHashSetE = yi80.e(this.b, this.c);
            u2u u2uVar = this.d;
            m2l m2lVar = u2uVar.c;
            String json = u2uVar.k.toJson(linkedHashSetE);
            this.a = 1;
            if (m2lVar.a.putString("displayed_loyalty_mission_dialog_ids", json, this) == y5bVar) {
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
