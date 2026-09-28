package defpackage;

import android.content.Context;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.presentation.kickoff.betresult.BetResultAdapter;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sf5 extends saj implements Function1<hqc, Unit> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(hqc hqcVar) throws Throwable {
        hqc hqcVar2 = hqcVar;
        hqcVar2.getClass();
        rf5 rf5Var = (rf5) this.receiver;
        if (hqcVar2 instanceof nqc) {
            rf5Var.m0();
            try {
                T t = ((nqc) hqcVar2).a;
                t.getClass();
                Round round = (Round) t;
                oss ossVar = rf5Var.F;
                Context contextRequireContext = rf5Var.requireContext();
                contextRequireContext.getClass();
                ji2 ji2Var = rf5Var.O;
                if (ji2Var == null) {
                    Intrinsics.n("betBuilderUtil");
                    throw null;
                }
                ossVar.getClass();
                ArrayList arrayListA = oss.a(contextRequireContext, ji2Var, round);
                rf5Var.H = round.getTotalReturn();
                rf5Var.E.i(arrayListA);
                ie3 ie3Var = rf5Var.T;
                if (ie3Var == null) {
                    Intrinsics.n("betsResultItemCreator");
                    throw null;
                }
                Context contextRequireContext2 = rf5Var.requireContext();
                contextRequireContext2.getClass();
                ArrayList arrayListA2 = ie3Var.a(contextRequireContext2, round, false, round.events);
                BetResultAdapter betResultAdapter = rf5Var.G;
                if (betResultAdapter != null) {
                    betResultAdapter.setList(arrayListA2);
                }
                rf5Var.r0(arrayListA);
            } catch (Exception unused) {
                rf5Var.p0();
            }
        } else if (hqcVar2 instanceof lqc) {
            rf5Var.n0(0);
        } else if (hqcVar2 instanceof kqc) {
            rf5Var.m0();
        } else {
            rf5Var.getClass();
        }
        return Unit.a;
    }
}
