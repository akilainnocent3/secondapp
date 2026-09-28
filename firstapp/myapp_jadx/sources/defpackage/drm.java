package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.IBDefaultStakeAnTestHelper$fetchCampaign$1", f = "IBDefaultStakeAnTestHelper.kt", l = {}, m = "invokeSuspend", v = 2)
public final class drm extends tje0 implements Function2<hrm, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ grm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drm(grm grmVar, v1b<? super drm> v1bVar) {
        super(2, v1bVar);
        this.b = grmVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        drm drmVar = new drm(this.b, v1bVar);
        drmVar.a = obj;
        return drmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hrm hrmVar, v1b<? super Unit> v1bVar) {
        return ((drm) create(hrmVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        hrm hrmVar = (hrm) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.g = hrmVar;
        return Unit.a;
    }
}
