package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.gift.handler.sim.SimGiftHandlerImpl$init$7", f = "SimGiftHandlerImpl.kt", l = {211}, m = "invokeSuspend", v = 2)
public final class ti90 extends tje0 implements Function2<smk, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mi90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti90(mi90 mi90Var, v1b<? super ti90> v1bVar) {
        super(2, v1bVar);
        this.c = mi90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ti90 ti90Var = new ti90(this.c, v1bVar);
        ti90Var.b = obj;
        return ti90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(smk smkVar, v1b<? super Unit> v1bVar) {
        return ((ti90) create(smkVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0179 A[RETURN] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Unit unit;
        Object value2;
        Object next;
        Object value3;
        Object value4;
        smk smkVar = (smk) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = null;
            this.a = 1;
            mi90 mi90Var = this.c;
            wwd0 wwd0Var = mi90Var.u;
            if (smkVar instanceof smk.a) {
                smk.a aVar = (smk.a) smkVar;
                wwd0 wwd0Var2 = mi90Var.e;
                if (aVar instanceof smk.a.c) {
                    GiftDetails giftDetails = (GiftDetails) wwd0Var2.getValue();
                    String giftId = giftDetails != null ? giftDetails.getGiftId() : null;
                    Iterator it = ((Iterable) mi90Var.n.getValue()).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.g(((GiftDetails) next).getGiftId(), ((smk.a.c) aVar).a));
                    GiftDetails giftDetails2 = (GiftDetails) next;
                    if (!Intrinsics.g(giftDetails2 != null ? giftDetails2.getGiftId() : null, giftId)) {
                        do {
                            value3 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value3, giftDetails2));
                        do {
                            value4 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value4, cyk.a.a));
                    }
                    mi90Var.a(smk.c.a.a);
                } else if (aVar.equals(smk.a.d.a)) {
                    mi90Var.a(smk.c.d.a);
                } else if (aVar.equals(smk.a.C1095a.a)) {
                    mi90Var.a(smk.c.a.a);
                } else if (aVar.equals(smk.a.b.a)) {
                    mi90Var.a(smk.c.C1097c.a);
                } else {
                    if (!aVar.equals(smk.a.e.a)) {
                        uhc.a();
                        return null;
                    }
                    mi90Var.A.a(xi90.a.a);
                    mi90Var.a(smk.c.b.a);
                    mi90Var.a(smk.c.a.a);
                }
            } else {
                if (smkVar instanceof smk.b) {
                    smk.b bVar = (smk.b) smkVar;
                    if (bVar instanceof smk.b.c) {
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, ((smk.b.c) bVar).a));
                    } else if (bVar instanceof smk.b.C1096b) {
                        wwd0 wwd0Var3 = mi90Var.s;
                        do {
                            value = wwd0Var3.getValue();
                            ((Boolean) value).getClass();
                        } while (!wwd0Var3.g(value, Boolean.valueOf(((smk.b.C1096b) bVar).a)));
                    } else if (bVar.equals(smk.b.d.a)) {
                        mi90Var.a(smk.c.e.a);
                    } else if (bVar.equals(smk.b.a.a)) {
                        mi90Var.a(smk.c.b.a);
                    } else if (bVar.equals(smk.b.f.a)) {
                        mi90Var.a(smk.c.d.a);
                    } else {
                        if (!bVar.equals(smk.b.e.a)) {
                            uhc.a();
                            return null;
                        }
                        mi90Var.y.a(Unit.a);
                        mi90Var.a(smk.c.b.a);
                        mi90Var.a(smk.c.a.a);
                    }
                    unit = Unit.a;
                } else {
                    if (!(smkVar instanceof smk.c)) {
                        uhc.a();
                        return null;
                    }
                    mi90Var.a((smk.c) smkVar);
                }
                if (unit == y5bVar) {
                    return y5bVar;
                }
            }
            unit = Unit.a;
            if (unit == y5bVar) {
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
