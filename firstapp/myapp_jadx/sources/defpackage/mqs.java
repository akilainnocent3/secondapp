package defpackage;

import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageActivity$setupSportTabs$1", f = "LivePageActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mqs extends tje0 implements Function2<mfb0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ LivePageActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqs(LivePageActivity livePageActivity, v1b<? super mqs> v1bVar) {
        super(2, v1bVar);
        this.b = livePageActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mqs mqsVar = new mqs(this.b, v1bVar);
        mqsVar.a = obj;
        return mqsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mfb0 mfb0Var, v1b<? super Unit> v1bVar) {
        return ((mqs) create(mfb0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        mfb0 mfb0Var = (mfb0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = LivePageActivity.b0;
        LivePageActivity livePageActivity = this.b;
        if (mfb0Var != null && "sr:sport:202120001".equals(mfb0Var.getId())) {
            nvs nvsVar = new nvs(mfb0Var.getId());
            livePageActivity.getFullStoryCommonManager().f("lv__live_tab__view", nvsVar.createCustomMetrics());
            iym iymVar = livePageActivity.v;
            if (iymVar == null) {
                Intrinsics.n("openTelemetryLogger");
                throw null;
            }
            gym.a(iymVar, nvsVar);
        }
        livePageActivity.G1().B = mfb0Var;
        livePageActivity.J1();
        return Unit.a;
    }
}
