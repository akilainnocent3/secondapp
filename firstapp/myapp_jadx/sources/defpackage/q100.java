package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.pocket.common.TradingAmountMap;
import com.sporty.android.core.model.pocket.common.TradingAmountRange;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q100 implements Function1 {
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        bOConfigValueBundle.getClass();
        qg4 qg4Var = qg4.WithdrawAmountRangeParam;
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(qg4Var.a);
        TradingAmountMap tradingAmountMap = null;
        obj = null;
        tradingAmountMap = null;
        tradingAmountMap = null;
        obj = null;
        tradingAmountMap = null;
        tradingAmountMap = null;
        obj = null;
        tradingAmountMap = null;
        tradingAmountMap = null;
        obj = null;
        tradingAmountMap = null;
        tradingAmountMap = null;
        obj = null;
        tradingAmountMap = null;
        tradingAmountMap = null;
        tradingAmountMap = null;
        tradingAmountMap = null;
        Object obj2 = null;
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(TradingAmountMap.class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                if (configValue instanceof TradingAmountMap) {
                    obj2 = configValue;
                }
                tradingAmountMap = (TradingAmountMap) obj2;
            } else if (configValue instanceof String) {
                StringsKt.toIntOrNull((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                if (configValue instanceof TradingAmountMap) {
                    obj2 = configValue;
                }
                tradingAmountMap = (TradingAmountMap) obj2;
            } else if (configValue instanceof String) {
                StringsKt.s0((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                if (configValue instanceof TradingAmountMap) {
                    obj2 = configValue;
                }
                tradingAmountMap = (TradingAmountMap) obj2;
            } else if (configValue instanceof String) {
                b.i((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (configValue instanceof Double) {
                if (configValue instanceof TradingAmountMap) {
                    obj2 = configValue;
                }
                tradingAmountMap = (TradingAmountMap) obj2;
            } else if (configValue instanceof String) {
                b.h((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
            if (configValue instanceof Boolean) {
                if (configValue instanceof TradingAmountMap) {
                    obj2 = configValue;
                }
                tradingAmountMap = (TradingAmountMap) obj2;
            } else if (configValue instanceof String) {
                StringsKt.r0((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(String.class))) {
            if (configValue != null) {
                configValue.toString();
            }
        } else if (configValue != null) {
            if (configValue instanceof TradingAmountMap) {
                obj2 = configValue;
            }
            tradingAmountMap = (TradingAmountMap) obj2;
        }
        if (tradingAmountMap == null) {
            throw new Exception(inm.a("get null from ", qg4Var.a.getConfigKey()));
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, TradingAmountRange> entry : tradingAmountMap.getMap().entrySet()) {
            String key = entry.getKey();
            TradingAmountRange value = entry.getValue();
            Integer numValueOf = Integer.valueOf(Integer.parseInt(key));
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(value.getMin());
            bigDecimalValueOf.getClass();
            BigDecimal bigDecimalB = p54.b(bigDecimalValueOf);
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(value.getMax());
            bigDecimalValueOf2.getClass();
            map.put(numValueOf, new vw(bigDecimalB, p54.b(bigDecimalValueOf2)));
        }
        return map;
    }
}
