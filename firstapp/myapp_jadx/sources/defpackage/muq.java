package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.presentation.LNMissionTabKt$LNMissionTab$4$1", f = "LNMissionTab.kt", l = {}, m = "invokeSuspend", v = 2)
public final class muq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function1<Boolean, Unit> b;
    public final /* synthetic */ ytw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public muq(v1b v1bVar, ytw ytwVar, Function1 function1, boolean z) {
        super(2, v1bVar);
        this.a = z;
        this.b = function1;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new muq(v1bVar, this.c, this.b, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((muq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a) {
            this.b.invoke(Boolean.valueOf(((ruq) this.c.getValue()).b));
        }
        return Unit.a;
    }
}
