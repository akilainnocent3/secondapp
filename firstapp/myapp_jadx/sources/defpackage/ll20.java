package defpackage;

import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.widget.LiveEventsRecyclerView;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.PreMatchSportActivity$collectData$1$2", f = "PreMatchSportActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ll20 extends tje0 implements Function2<Object, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ PreMatchSportActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll20(PreMatchSportActivity preMatchSportActivity, v1b<? super ll20> v1bVar) {
        super(2, v1bVar);
        this.b = preMatchSportActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ll20 ll20Var = new ll20(this.b, v1bVar);
        ll20Var.a = obj;
        return ll20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
        return ((ll20) create(obj, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        its itsVarD1 = this.b.D1();
        LiveEventsRecyclerView liveEventsRecyclerView = itsVarD1.e;
        obj2.getClass();
        if (obj2 instanceof SocketMarketMessage) {
            liveEventsRecyclerView.E0((SocketMarketMessage) obj2);
        } else if (obj2 instanceof SocketEventMessage) {
            liveEventsRecyclerView.D0((SocketEventMessage) obj2);
        } else if (obj2 instanceof Integer) {
            itsVarD1.b.a.b.setText(String.valueOf(((Number) obj2).intValue()));
        }
        return Unit.a;
    }
}
