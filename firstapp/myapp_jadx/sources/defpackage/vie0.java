package defpackage;

import com.sporty.android.core.model.survey.AvailableSurveyIds;
import com.sporty.android.core.model.survey.DepositSurveyIds;
import com.sporty.android.core.model.survey.PlaceBetSurveyId;
import com.sporty.android.core.model.survey.WithdrawalSurveyId;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.survey.SurveyRepositoryImpl$getSurveyId$2", f = "SurveyRepositoryImpl.kt", l = {69}, m = "invokeSuspend", v = 2)
public final class vie0 extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
    public int a;
    public final /* synthetic */ sie0 b;
    public final /* synthetic */ mie0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vie0(sie0 sie0Var, mie0 mie0Var, v1b<? super vie0> v1bVar) {
        super(2, v1bVar);
        this.b = sie0Var;
        this.c = mie0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vie0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
        return ((vie0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        PlaceBetSurveyId placeBet;
        DepositSurveyIds deposit;
        DepositSurveyIds deposit2;
        WithdrawalSurveyId withdraw;
        WithdrawalSurveyId withdraw2;
        y5b y5bVar = y5b.a;
        int i = this.a;
        sie0 sie0Var = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                m2l m2lVar = sie0Var.c;
                this.a = 1;
                obj = m2lVar.a.getString("survey_ids", "", this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            AvailableSurveyIds availableSurveyIds = (AvailableSurveyIds) sie0Var.d.fromJson((String) obj, AvailableSurveyIds.class);
            switch (this.c.ordinal()) {
                case 0:
                    if (availableSurveyIds != null) {
                        return availableSurveyIds.getHomepage();
                    }
                    return null;
                case 1:
                    if (availableSurveyIds != null) {
                        return availableSurveyIds.getOpenBets();
                    }
                    return null;
                case 2:
                    if (availableSurveyIds != null) {
                        return availableSurveyIds.getBetHistory();
                    }
                    return null;
                case 3:
                    if (availableSurveyIds != null && (placeBet = availableSurveyIds.getPlaceBet()) != null) {
                        return placeBet.getPlaceBetSuccessPage();
                    }
                    return null;
                case 4:
                    if (availableSurveyIds != null) {
                        return availableSurveyIds.getTransactionPage();
                    }
                    return null;
                case 5:
                    if (availableSurveyIds != null && (deposit = availableSurveyIds.getDeposit()) != null) {
                        return deposit.getDepositPendingPage();
                    }
                    return null;
                case 6:
                    if (availableSurveyIds != null && (deposit2 = availableSurveyIds.getDeposit()) != null) {
                        return deposit2.getDepositSuccessPage();
                    }
                    return null;
                case 7:
                    if (availableSurveyIds != null && (withdraw = availableSurveyIds.getWithdraw()) != null) {
                        return withdraw.getWithdrawalPendingPage();
                    }
                    return null;
                case 8:
                    if (availableSurveyIds != null && (withdraw2 = availableSurveyIds.getWithdraw()) != null) {
                        return withdraw2.getWithdrawalSuccessPage();
                    }
                    return null;
                default:
                    throw new uwx();
            }
        } catch (Exception e) {
            itf0.a.d("getSurveyIdMap error: " + e, new Object[0]);
            return null;
        }
    }
}
