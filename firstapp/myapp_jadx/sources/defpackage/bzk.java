package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$setShow1CutForGiftAlertFinish$1", f = "GiftViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bzk extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ yyk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzk(v1b v1bVar, yyk yykVar) {
        super(2, v1bVar);
        this.a = yykVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bzk(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bzk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.L.setValue(k990.a.a);
        return Unit.a;
    }
}
