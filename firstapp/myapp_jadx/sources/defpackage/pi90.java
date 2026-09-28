package defpackage;

import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.gift.GiftGroup;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.gift.handler.sim.SimGiftHandlerImpl$init$3", f = "SimGiftHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pi90 extends tje0 implements iaj<Boolean, lk50<? extends List<? extends GiftGroup>>, OrderBetType, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ lk50 b;
    public /* synthetic */ OrderBetType c;
    public final /* synthetic */ mi90 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi90(mi90 mi90Var, v1b<? super pi90> v1bVar) {
        super(4, v1bVar);
        this.d = mi90Var;
    }

    @Override // defpackage.iaj
    public final Object d(Boolean bool, lk50<? extends List<? extends GiftGroup>> lk50Var, OrderBetType orderBetType, v1b<? super Unit> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        pi90 pi90Var = new pi90(this.d, v1bVar);
        pi90Var.a = zBooleanValue;
        pi90Var.b = lk50Var;
        pi90Var.c = orderBetType;
        return pi90Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        lk50<? extends List<GiftGroup>> lk50Var = this.b;
        OrderBetType orderBetType = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        mi90 mi90Var = this.d;
        mi90Var.e(lk50Var, orderBetType, z, ((Boolean) mi90Var.k.getValue()).booleanValue(), ((Boolean) mi90Var.l.getValue()).booleanValue(), (cwk) mi90Var.m.getValue(), true);
        return Unit.a;
    }
}
