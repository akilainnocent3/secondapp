package defpackage;

import com.sporty.android.core.model.cashout.CashOutFallbackData;
import com.sporty.android.core.model.cashout.CashoutFallbackSettingsDto;
import com.sporty.android.core.model.cashout.FallbackQuota;
import com.sporty.android.core.model.cashout.FallbackUserCashOutQuota;
import com.sportybet.model.cashOut.CashOutData;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.event.PreMatchEventAdapter;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mq6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mq6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                CashoutFallbackSettingsDto cashoutFallbackSettingsDto = (CashoutFallbackSettingsDto) obj2;
                CashOutData cashOutData = (CashOutData) obj;
                cashOutData.getClass();
                CashOutFallbackData cashOutFallbackData = cashOutData.getCashOutFallbackData();
                Double cfr = cashoutFallbackSettingsDto.getCfr();
                Boolean ccfBlocked = cashoutFallbackSettingsDto.getCcfBlocked();
                FallbackQuota globalCashOutQuota = cashoutFallbackSettingsDto.getGlobalCashOutQuota();
                FallbackUserCashOutQuota userCashOutQuota = cashoutFallbackSettingsDto.getUserCashOutQuota();
                Map<String, Double> betaSettings = cashoutFallbackSettingsDto.getBetaSettings();
                Double maxCashOutPayoutAmount = cashoutFallbackSettingsDto.getMaxCashOutPayoutAmount();
                Integer trfIntervalSeconds = cashoutFallbackSettingsDto.getTrfIntervalSeconds();
                boolean z = ((nq6) obj3).a.d().o;
                return CashOutData.copy$default(cashOutData, 0, null, null, null, false, false, CashOutFallbackData.copy$default(cashOutFallbackData, cfr, ccfBlocked, betaSettings, globalCashOutQuota, userCashOutQuota, null, maxCashOutPayoutAmount, trfIntervalSeconds, Boolean.valueOf(z), cashoutFallbackSettingsDto.getTrfGracePeriodSeconds(), 32, null), 63, null);
            default:
                e eVar = (e) obj3;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                int i2 = PreMatchEventActivity.a2;
                eVar.K0 = zBooleanValue;
                ej5.c(o8i0.d(eVar), null, null, new qsg(eVar, zBooleanValue, null), 3);
                PreMatchEventAdapter preMatchEventAdapter = ((PreMatchEventActivity) obj2).A0;
                if (preMatchEventAdapter != null) {
                    preMatchEventAdapter.showJokerOutcomes(bool, Boolean.TRUE);
                }
                return Unit.a;
        }
    }
}
