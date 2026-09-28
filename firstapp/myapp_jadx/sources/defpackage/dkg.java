package defpackage;

import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.event.EventLiveAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventActivity$collectOpenBetCount$1", f = "EventActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dkg extends tje0 implements Function2<wyy, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ EventActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkg(EventActivity eventActivity, v1b<? super dkg> v1bVar) {
        super(2, v1bVar);
        this.b = eventActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dkg dkgVar = new dkg(this.b, v1bVar);
        dkgVar.a = obj;
        return dkgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wyy wyyVar, v1b<? super Unit> v1bVar) {
        return ((dkg) create(wyyVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wyy wyyVar = (wyy) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        EventActivity eventActivity = this.b;
        b1z b1zVar = eventActivity.P;
        if (b1zVar == null) {
            Intrinsics.n("openBetsEventTrackingManager");
            throw null;
        }
        b1zVar.r(new Integer(wyyVar.b));
        eventActivity.r0 = wyyVar.a;
        eventActivity.s0 = wyyVar.b;
        e eVar = eventActivity.E0;
        if (eVar == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        eventActivity.j2(eVar.F1(), eventActivity.W);
        EventLiveAdapter eventLiveAdapter = eventActivity.w0;
        if (eventLiveAdapter != null) {
            eventLiveAdapter.notifyDataSetChanged();
        }
        return Unit.a;
    }
}
