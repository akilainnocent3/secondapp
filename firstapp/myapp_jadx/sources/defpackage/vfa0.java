package defpackage;

import com.sportybet.android.social.domain.entity.SocialMineType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialNetworkViewModel$onAccountChanged$1", f = "SocialNetworkViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class vfa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wfa0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfa0(wfa0 wfa0Var, v1b<? super vfa0> v1bVar) {
        super(2, v1bVar);
        this.b = wfa0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vfa0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vfa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wfa0 wfa0Var = this.b;
        wwd0 wwd0Var = wfa0Var.f;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            yfa0 yfa0VarA = yfa0.a((yfa0) wwd0Var.getValue(), Intrinsics.g(wfa0Var.d.getLastNickName(), ((yfa0) wwd0Var.getValue()).a) ? SocialMineType.MINE : SocialMineType.NOT_MINE, null, 13);
            this.a = 1;
            wwd0Var.getClass();
            wwd0Var.k(null, yfa0VarA);
            if (Unit.a == y5bVar) {
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
