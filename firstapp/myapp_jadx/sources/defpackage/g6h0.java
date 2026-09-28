package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.transaction.data.model.TxDateRangeConfigs;
import com.sportybet.android.transaction.domain.model.LastDayRangeOption;
import com.sportybet.android.transaction.domain.model.LastDayRangeSetting;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class g6h0 implements e6h0 {
    public static final LastDayRangeSetting c = new LastDayRangeSetting(new LastDayRangeOption(7), new LastDayRangeOption(14), new LastDayRangeOption(30), 30);
    public final fc8 a;
    public final JsonSerializeService b;

    public g6h0(fc8 fc8Var, JsonSerializeService jsonSerializeService) {
        fc8Var.getClass();
        jsonSerializeService.getClass();
        this.a = fc8Var;
        this.b = jsonSerializeService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.e6h0
    public final Object a(x1b x1bVar) {
        f6h0 f6h0Var;
        LastDayRangeSetting lastDayRangeSettingB;
        if (x1bVar instanceof f6h0) {
            f6h0Var = (f6h0) x1bVar;
            int i = f6h0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f6h0Var.c = i - Integer.MIN_VALUE;
            } else {
                f6h0Var = new f6h0(this, x1bVar);
            }
        } else {
            f6h0Var = new f6h0(this, x1bVar);
        }
        Object configs = f6h0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = f6h0Var.c;
        if (i2 == 0) {
            uj50.b(configs);
            dc8.a[] aVarArr = {new dc8.a("pocket", "transaction.date.range.settings")};
            f6h0Var.c = 1;
            configs = this.a.getConfigs(aVarArr, f6h0Var);
            if (configs == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(configs);
        }
        ng50 ng50Var = (ng50) configs;
        if (ng50Var instanceof ng50.b) {
            try {
                Map<String, ? extends Object> map = (Map) ((ng50.b) ng50Var).a;
                if (map != null && (lastDayRangeSettingB = b(map)) != null) {
                    return lastDayRangeSettingB;
                }
            } catch (Exception unused) {
            }
        } else if (!(ng50Var instanceof ng50.a)) {
            uhc.a();
            return null;
        }
        return c;
    }

    public final LastDayRangeSetting b(Map<String, ? extends Object> map) {
        String string;
        TxDateRangeConfigs txDateRangeConfigs;
        Object obj = map.get("transaction.date.range.settings");
        LastDayRangeSetting lastDayRangeSetting = c;
        if (obj == null || (string = obj.toString()) == null || (txDateRangeConfigs = (TxDateRangeConfigs) this.b.fromJson(string, TxDateRangeConfigs.class)) == null) {
            return lastDayRangeSetting;
        }
        LastDayRangeOption lastDayRangeOption = new LastDayRangeOption(txDateRangeConfigs.getQuickOptions().get(0).intValue());
        LastDayRangeOption lastDayRangeOption2 = new LastDayRangeOption(txDateRangeConfigs.getQuickOptions().get(1).intValue());
        LastDayRangeOption lastDayRangeOption3 = new LastDayRangeOption(txDateRangeConfigs.getQuickOptions().get(2).intValue());
        int maxRange = txDateRangeConfigs.getMaxRange();
        Integer numValueOf = Integer.valueOf(maxRange);
        if (maxRange < 1) {
            numValueOf = null;
        }
        return new LastDayRangeSetting(lastDayRangeOption, lastDayRangeOption2, lastDayRangeOption3, numValueOf != null ? numValueOf.intValue() : lastDayRangeSetting.d);
    }
}
