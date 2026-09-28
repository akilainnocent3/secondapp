package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$reportEarlyPlaceBetSucceededToFs$1", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r73 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q73 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r73(q73 q73Var, v1b<? super r73> v1bVar) {
        super(2, v1bVar);
        this.b = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        r73 r73Var = new r73(this.b, v1bVar);
        r73Var.a = obj;
        return r73Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r73) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        q73 q73Var = this.b;
        try {
            zi50.a aVar = zi50.b;
            LinkedHashMap linkedHashMap = q73Var.G1;
            if (linkedHashMap != null) {
                q73Var.a0.f(AnalyticsEvent.EG_PLACE_BET, kpu.l(linkedHashMap));
            }
            q73Var.G1 = null;
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            w950.a("BetSlipViewModel", "reportPlaceBetSucceededToFs", thA, null);
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_BET_SLIP);
            aVar3.f(thA, "Failed to report place bet succeeded to FullStory", new Object[0]);
        }
        return Unit.a;
    }
}
