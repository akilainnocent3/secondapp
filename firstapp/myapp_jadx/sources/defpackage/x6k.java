package defpackage;

import com.sporty.android.core.model.luckywheel.TicketInfo;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.domain.usecase.GetGiftDisplayDataUseCase$fetchRemoteGiftDisplayData$2", f = "GetGiftDisplayDataUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x6k extends tje0 implements iaj<zi50<? extends hpk>, zi50<? extends List<? extends TicketInfo>>, zi50<? extends List<? extends z15>>, v1b<? super wjk>, Object> {
    public /* synthetic */ Object a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    @Override // defpackage.iaj
    public final Object d(zi50<? extends hpk> zi50Var, zi50<? extends List<? extends TicketInfo>> zi50Var2, zi50<? extends List<? extends z15>> zi50Var3, v1b<? super wjk> v1bVar) {
        Object obj = zi50Var.a;
        Object obj2 = zi50Var2.a;
        Object obj3 = zi50Var3.a;
        x6k x6kVar = new x6k(4, v1bVar);
        x6kVar.a = obj;
        x6kVar.b = obj2;
        x6kVar.c = obj3;
        return x6kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Throwable thA = zi50.a(obj2);
        if (thA != null) {
            itf0.a aVar = itf0.a;
            aVar.q("GiftDisplayData");
            aVar.p(thA, "Gifts API failed", new Object[0]);
        }
        Throwable thA2 = zi50.a(obj3);
        if (thA2 != null) {
            itf0.a aVar2 = itf0.a;
            aVar2.q("GiftDisplayData");
            aVar2.p(thA2, "Ticket API failed", new Object[0]);
        }
        Throwable thA3 = zi50.a(obj4);
        if (thA3 != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q("GiftDisplayData");
            aVar3.p(thA3, "Boost gifts API failed", new Object[0]);
        }
        boolean z = obj2 instanceof zi50.b;
        if (z && (obj3 instanceof zi50.b) && (obj4 instanceof zi50.b)) {
            Throwable thA4 = zi50.a(obj2);
            thA4.getClass();
            throw thA4;
        }
        if (z) {
            obj2 = null;
        }
        hpk hpkVar = (hpk) obj2;
        List list = hpkVar != null ? hpkVar.a : null;
        if (list == null) {
            list = m2g.a;
        }
        if (obj3 instanceof zi50.b) {
            obj3 = null;
        }
        List list2 = (List) obj3;
        if (list2 == null) {
            list2 = m2g.a;
        }
        if (obj4 instanceof zi50.b) {
            obj4 = null;
        }
        List list3 = (List) obj4;
        if (list3 == null) {
            list3 = m2g.a;
        }
        return new wjk(list, list2, list3, hpkVar != null ? hpkVar.b : 0);
    }
}
