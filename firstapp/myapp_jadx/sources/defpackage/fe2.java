package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.pocket.common.PLAOperatorBOConfig;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fe2 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Transaction.BetStatus.values().length];
            try {
                iArr[Transaction.BetStatus.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Transaction.BetStatus.WIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Transaction.BetStatus.LOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Transaction.BetStatus.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final void a(final Transaction transaction, final PLAOperatorBOConfig pLAOperatorBOConfig, final String str, androidx.compose.runtime.a aVar, final int i) {
        String strA;
        b bVarI = aVar.i(152011883);
        int i2 = (bVarI.A(transaction) ? 4 : 2) | i | (bVarI.A(pLAOperatorBOConfig) ? 32 : 16) | (bVarI.M(str) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarH = h.h(d.a.b, 16.0f, 0.0f, 2);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new de2(0);
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarH, false, (Function1) objY);
            i78 i78VarA = g78.a(new kw0.i(20.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            Transaction.BetStatus betStatus = transaction.betStatus;
            if (betStatus == null) {
                bVarI.N(1194201037);
                bVarI.X(false);
            } else {
                bVarI.N(1194201038);
                int i3 = a.a[betStatus.ordinal()];
                if (i3 == 1) {
                    bVarI.N(753156078);
                    strA = cb40.a(R.string.page_transaction__bet_status_running, new Object[0], bVarI);
                    bVarI.X(false);
                } else if (i3 == 2) {
                    bVarI.N(753158730);
                    strA = cb40.a(R.string.page_transaction__bet_status_win, new Object[0], bVarI);
                    bVarI.X(false);
                } else if (i3 == 3) {
                    bVarI.N(753161291);
                    strA = cb40.a(R.string.page_transaction__bet_status_lost, new Object[0], bVarI);
                    bVarI.X(false);
                } else {
                    if (i3 != 4) {
                        throw igf0.a(bVarI, 753155116, false);
                    }
                    bVarI.N(753163949);
                    strA = cb40.a(R.string.page_transaction__bet_status_cancel, new Object[0], bVarI);
                    bVarI.X(false);
                }
                ql.a(R.string.page_transaction__bet_status, 0, bVarI, strA);
                bVarI.X(false);
            }
            String str2 = transaction.maxOdds;
            if (str2 == null) {
                bVarI.N(1194344288);
                bVarI.X(false);
            } else {
                bVarI.N(1194344289);
                ql.a(R.string.page_transaction__max_odds, 0, bVarI, str2);
                bVarI.X(false);
            }
            String str3 = transaction.odds;
            if (str3 == null) {
                bVarI.N(1194466366);
                bVarI.X(false);
            } else {
                bVarI.N(1194466367);
                ql.a(R.string.page_transaction__actualOdds, 0, bVarI, str3);
                bVarI.X(false);
            }
            String str4 = transaction.potentialWinnings;
            if (str4 == null) {
                bVarI.N(1194603386);
                bVarI.X(false);
            } else {
                bVarI.N(1194603387);
                ql.a(R.string.page_transaction__max_win_amount, 0, bVarI, str4);
                bVarI.X(false);
            }
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = bwf0.r(new Date(transaction.createTime));
                bVarI.r(objY2);
            }
            ql.a(R.string.page_transaction__bet_placed_time, 48, bVarI, (String) objY2);
            if (transaction.resultDateTime == null) {
                bVarI.N(1194948695);
                bVarI.X(false);
            } else {
                bVarI.N(1194948696);
                Object objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    Long l = transaction.resultDateTime;
                    l.getClass();
                    objY3 = bwf0.r(new Date(l.longValue()));
                    bVarI.r(objY3);
                }
                ql.a(R.string.page_transaction__bet_settled_time, 48, bVarI, (String) objY3);
                bVarI.X(false);
            }
            String str5 = transaction.stake;
            if (str5 == null) {
                bVarI.N(1195203422);
                bVarI.X(false);
            } else {
                bVarI.N(1195203423);
                ql.a(R.string.page_transaction__bet_amount, 0, bVarI, str5);
                bVarI.X(false);
            }
            String str6 = transaction.winnings;
            if (str6 == null) {
                bVarI.N(1195331390);
                bVarI.X(false);
            } else {
                bVarI.N(1195331391);
                ql.a(R.string.page_transaction__win_amount, 0, bVarI, str6);
                bVarI.X(false);
            }
            ql.a(R.string.page_transaction__event_venue, 48, bVarI, "sportybet.co.za");
            ql.a(R.string.page_transaction__wager_type, 48, bVarI, SimulateBetConsts.BetslipType.SINGLE);
            ql.a(R.string.page_transaction__user_id, (i2 >> 3) & 112, bVarI, str);
            String str7 = transaction.eventNumber;
            if (str7 == null) {
                str7 = "";
            }
            ql.a(R.string.page_transaction__event_number, 0, bVarI, str7);
            String str8 = transaction.pick;
            if (str8 == null) {
                bVarI.N(1195821407);
                bVarI.X(false);
            } else {
                bVarI.N(1195821408);
                ql.a(R.string.page_transaction__selection, 0, bVarI, str8);
                bVarI.X(false);
            }
            if (pLAOperatorBOConfig == null) {
                bVarI.N(1195954893);
                bVarI.X(false);
            } else {
                bVarI.N(1195954894);
                ql.a(R.string.page_transaction__licensed_operator, 0, bVarI, pLAOperatorBOConfig.getName());
                String city = pLAOperatorBOConfig.getCity();
                if (city.length() <= 0) {
                    city = null;
                }
                if (city == null) {
                    city = pLAOperatorBOConfig.getProvince();
                }
                ql.a(R.string.page_transaction__city_of_licensed_operator, 0, bVarI, city);
                ql.a(R.string.page_transaction__address_of_licensed_operator, 0, bVarI, pLAOperatorBOConfig.getAddress());
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(pLAOperatorBOConfig, str, i) { // from class: ee2
                public final /* synthetic */ PLAOperatorBOConfig b;
                public final /* synthetic */ String c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fe2.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
