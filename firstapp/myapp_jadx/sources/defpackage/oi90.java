package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.gift.handler.sim.SimGiftHandlerImpl$init$2", f = "SimGiftHandlerImpl.kt", l = {149}, m = "invokeSuspend", v = 2)
public final class oi90 extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mi90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi90(mi90 mi90Var, v1b<? super oi90> v1bVar) {
        super(2, v1bVar);
        this.b = mi90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new oi90(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((oi90) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        String strP;
        wik aVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mi90 mi90Var = this.b;
            GiftDetails giftDetails = (GiftDetails) mi90Var.e.getValue();
            byk bykVar = (byk) mi90Var.b.f.a.getValue();
            boolean zBooleanValue = ((Boolean) mi90Var.g.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) mi90Var.h.getValue()).booleanValue();
            if (zBooleanValue && giftDetails != null) {
                cyk cykVar = bykVar.c;
                boolean z = false;
                if (Intrinsics.g(cykVar, cyk.a.a)) {
                    try {
                        zi50.a aVar2 = zi50.b;
                        bVar = bjb0.W(giftDetails.getCurrentBalance());
                    } catch (Throwable th) {
                        zi50.a aVar3 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                    if (bVar instanceof zi50.b) {
                        bVar = "0";
                    }
                    strP = (String) bVar;
                } else {
                    if (!(cykVar instanceof cyk.b)) {
                        uhc.a();
                        return null;
                    }
                    strP = c.p(((cyk.b) cykVar).a.a.b, ",", "", false);
                }
                String giftId = giftDetails.getGiftId();
                if (bykVar.d && zBooleanValue2) {
                    z = true;
                }
                aVar = new wik.a(new svk(giftId, strP, z, giftDetails));
            } else {
                aVar = wik.b.a;
            }
            b390 b390Var = mi90Var.w;
            this.a = 1;
            if (b390Var.emit(aVar, this) == y5bVar) {
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
