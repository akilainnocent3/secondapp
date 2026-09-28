package defpackage;

import com.sportybet.android.openbet.presentation.activity.LiveOpenBetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.openbet.presentation.activity.LiveOpenBetActivity$collectOpenBetCount$1", f = "LiveOpenBetActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dps extends tje0 implements Function2<wyy, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ LiveOpenBetActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dps(LiveOpenBetActivity liveOpenBetActivity, v1b<? super dps> v1bVar) {
        super(2, v1bVar);
        this.b = liveOpenBetActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dps dpsVar = new dps(this.b, v1bVar);
        dpsVar.a = obj;
        return dpsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wyy wyyVar, v1b<? super Unit> v1bVar) {
        return ((dps) create(wyyVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wyy wyyVar = (wyy) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        LiveOpenBetActivity liveOpenBetActivity = this.b;
        b1z b1zVar = liveOpenBetActivity.f;
        if (b1zVar == null) {
            Intrinsics.n("openBetsEventTrackingManager");
            throw null;
        }
        b1zVar.r(new Integer(wyyVar.b));
        liveOpenBetActivity.A1(wyyVar.b);
        return Unit.a;
    }
}
