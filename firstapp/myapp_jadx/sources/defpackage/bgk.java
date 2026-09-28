package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import com.sporty.android.core.model.realsports.SportBet;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class bgk {
    public final sr10 a;

    public bgk(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    public final Object a(aqg0 aqg0Var, Pair pair, String str, x1b x1bVar) {
        agk agkVar;
        ?? arrayList;
        BigDecimal bigDecimalB;
        i41 eVar;
        Integer intOrNull;
        if (x1bVar instanceof agk) {
            agkVar = (agk) x1bVar;
            int i = agkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                agkVar.c = i - Integer.MIN_VALUE;
            } else {
                agkVar = new agk(this, x1bVar);
            }
        } else {
            agkVar = new agk(this, x1bVar);
        }
        agk agkVar2 = agkVar;
        Object objY = agkVar2.a;
        y5b y5bVar = y5b.a;
        int i2 = agkVar2.c;
        if (i2 == 0) {
            uj50.b(objY);
            int i3 = aqg0Var.a;
            String strValueOf = String.valueOf(((Date) pair.a).getTime());
            String strValueOf2 = String.valueOf(((Date) pair.b).getTime());
            agkVar2.c = 1;
            objY = sr10.y(this.a, i3, str, 20, strValueOf, strValueOf2, null, agkVar2, 32);
            if (objY == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objY);
        }
        ng50 ng50Var = (ng50) objY;
        if (!(ng50Var instanceof ng50.b)) {
            if (!(ng50Var instanceof ng50.a)) {
                uhc.a();
                return null;
            }
            ng50.a aVar = (ng50.a) ng50Var;
            String str2 = aVar.b;
            if (str2 == null) {
                str2 = "";
            }
            return new ng50.a(str2, 4, aVar.c);
        }
        Object obj = ((ng50.b) ng50Var).a;
        obj.getClass();
        SportBet sportBet = (SportBet) obj;
        List<Transaction> list = sportBet.statements;
        if (list != null) {
            arrayList = new ArrayList(l48.r(list, 10));
            for (Transaction transaction : list) {
                transaction.getClass();
                UiText uiTextA = qqg0.a(transaction.bizType, transaction.tradeCode, transaction.bizTypeName, transaction.subBizTypeName);
                try {
                    String str3 = transaction.tradeCode;
                    str3.getClass();
                    BigDecimal bigDecimalValueOf = ger.a(str3) ? BigDecimal.valueOf(transaction.initAmount) : BigDecimal.valueOf(transaction.amount);
                    bigDecimalValueOf.getClass();
                    bigDecimalB = p54.b(bigDecimalValueOf);
                } catch (Throwable th) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_TRANSACTION);
                    aVar2.o(th);
                    bigDecimalB = null;
                }
                int i4 = (bigDecimalB == null || bigDecimalB.compareTo(BigDecimal.ZERO) != 0) ? transaction.amountSign : 2;
                String str4 = transaction.auditStatus;
                int iIntValue = (str4 == null || (intOrNull = StringsKt.toIntOrNull(str4)) == null) ? -1 : intOrNull.intValue();
                if (iIntValue != 0) {
                    switch (iIntValue) {
                        case 11:
                            eVar = i41.a.a;
                            break;
                        case 12:
                            eVar = i41.c.a;
                            break;
                        case 13:
                            eVar = i41.b.a;
                            break;
                        default:
                            eVar = new i41.e();
                            break;
                    }
                } else {
                    eVar = i41.d.a;
                }
                i41 i41Var = eVar;
                String str5 = transaction.tradeId;
                int i5 = transaction.status;
                Integer numValueOf = Integer.valueOf(i4);
                long j = transaction.createTime;
                String str6 = transaction.tradeCode;
                Integer numValueOf2 = Integer.valueOf(transaction.bizType);
                String str7 = transaction.bizTypeName;
                String str8 = transaction.subBizTypeName;
                uiTextA.getClass();
                arrayList.add(new brg0(str5, i5, bigDecimalB, numValueOf, i41Var, j, str6, numValueOf2, str7, str8, uiTextA));
            }
        } else {
            arrayList = m2g.a;
        }
        return new ng50.b(new e8h0(arrayList, sportBet.showFixStatus, sportBet.hasPending), null);
    }
}
