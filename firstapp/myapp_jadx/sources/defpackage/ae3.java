package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ae3 extends saj implements Function1<hqc, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(hqc hqcVar) {
        hqc hqcVar2 = hqcVar;
        hqcVar2.getClass();
        yd3 yd3Var = (yd3) this.receiver;
        if (hqcVar2 instanceof lqc) {
            yd3Var.n0(0);
        } else if (hqcVar2 instanceof nqc) {
            yd3Var.m0();
            Object obj = ((nqc) hqcVar2).a;
            if (!(obj instanceof List)) {
                obj = null;
            }
            List<EventInRound> list = (List) obj;
            if (list != null && !list.isEmpty()) {
                String str = ((EventInRound) CollectionsKt.T(list)).leagueId;
                if (str == null) {
                    str = "";
                }
                yd3Var.H.put(str, list);
                yd3Var.q0(str);
                yd3Var.p0(list);
            }
        } else {
            yd3Var.getClass();
        }
        return Unit.a;
    }
}
