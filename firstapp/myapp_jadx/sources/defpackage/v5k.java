package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigFeatureFlag;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.realsports.DynamicReplacementMarkets;
import com.sporty.android.core.model.realsports.SportDynamicMarkets;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class v5k {
    public final lq1 a;
    public final yi5 b;

    public v5k(lq1 lq1Var, yi5 yi5Var) {
        lq1Var.getClass();
        yi5Var.getClass();
        this.a = lq1Var;
        this.b = yi5Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x011a  */
    public final List<String> a(String str) {
        List<SportDynamicMarkets> replacementMarkets;
        BOConfigFeatureFlag bOConfigFeatureFlag;
        BOConfigFeatureFlag.AndroidRule android2;
        xdp data;
        Object bVar;
        BOConfigParam bOConfigParam = BOConfigParam.DynamicReplacementMarkets;
        String strA = this.b.b().a();
        lq1 lq1Var = this.a;
        if (!qq1.c(lq1Var, bOConfigParam, strA)) {
            return m2g.a;
        }
        BOConfigValueBundle bOConfigValueBundleE = lq1Var.e();
        Object obj = null;
        if (bOConfigValueBundleE != null) {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(BOConfigFeatureFlag.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (!(configValue instanceof BOConfigFeatureFlag)) {
                        configValue = null;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    if (bOConfigFeatureFlag != null && (android2 = bOConfigFeatureFlag.getAndroid()) != null && (data = android2.getData()) != null) {
                        try {
                            zi50.a aVar = zi50.b;
                            bVar = new eal().b(data, DynamicReplacementMarkets.class);
                        } catch (Throwable th) {
                            zi50.a aVar2 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                        if (!(bVar instanceof zi50.b)) {
                            obj = bVar;
                        }
                    }
                } else {
                    if (configValue instanceof String) {
                        StringsKt.toIntOrNull((String) configValue);
                    }
                    bOConfigFeatureFlag = null;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar3 = zi50.b;
                        bVar = new eal().b(data, DynamicReplacementMarkets.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj = bVar;
                        }
                    }
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (!(configValue instanceof BOConfigFeatureFlag)) {
                        configValue = null;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar4 = zi50.b;
                        bVar = new eal().b(data, DynamicReplacementMarkets.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj = bVar;
                        }
                    }
                } else {
                    if (configValue instanceof String) {
                        StringsKt.s0((String) configValue);
                    }
                    bOConfigFeatureFlag = null;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar5 = zi50.b;
                        bVar = new eal().b(data, DynamicReplacementMarkets.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj = bVar;
                        }
                    }
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (!(configValue instanceof BOConfigFeatureFlag)) {
                        configValue = null;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar6 = zi50.b;
                        bVar = new eal().b(data, DynamicReplacementMarkets.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj = bVar;
                        }
                    }
                } else {
                    if (configValue instanceof String) {
                        b.i((String) configValue);
                    }
                    bOConfigFeatureFlag = null;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar7 = zi50.b;
                        bVar = new eal().b(data, DynamicReplacementMarkets.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj = bVar;
                        }
                    }
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (!(configValue instanceof BOConfigFeatureFlag)) {
                        configValue = null;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar8 = zi50.b;
                        bVar = new eal().b(data, DynamicReplacementMarkets.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj = bVar;
                        }
                    }
                } else {
                    if (configValue instanceof String) {
                        b.h((String) configValue);
                    }
                    bOConfigFeatureFlag = null;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar9 = zi50.b;
                        bVar = new eal().b(data, DynamicReplacementMarkets.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj = bVar;
                        }
                    }
                }
            } else if (!dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (!dq7VarA.equals(jq40.a(String.class))) {
                    if (configValue != null) {
                        if (!(configValue instanceof BOConfigFeatureFlag)) {
                            configValue = null;
                        }
                        bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    }
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar10 = zi50.b;
                        bVar = new eal().b(data, DynamicReplacementMarkets.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj = bVar;
                        }
                    }
                } else if (configValue != null) {
                    configValue.toString();
                }
                bOConfigFeatureFlag = null;
                if (bOConfigFeatureFlag != null) {
                    zi50.a aVar11 = zi50.b;
                    bVar = new eal().b(data, DynamicReplacementMarkets.class);
                    if (!(bVar instanceof zi50.b)) {
                        obj = bVar;
                    }
                }
            } else if (configValue instanceof Boolean) {
                if (!(configValue instanceof BOConfigFeatureFlag)) {
                    configValue = null;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                if (bOConfigFeatureFlag != null) {
                    zi50.a aVar12 = zi50.b;
                    bVar = new eal().b(data, DynamicReplacementMarkets.class);
                    if (!(bVar instanceof zi50.b)) {
                        obj = bVar;
                    }
                }
            } else {
                if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
                bOConfigFeatureFlag = null;
                if (bOConfigFeatureFlag != null) {
                    zi50.a aVar13 = zi50.b;
                    bVar = new eal().b(data, DynamicReplacementMarkets.class);
                    if (!(bVar instanceof zi50.b)) {
                        obj = bVar;
                    }
                }
            }
        }
        DynamicReplacementMarkets dynamicReplacementMarkets = (DynamicReplacementMarkets) obj;
        if (dynamicReplacementMarkets == null || (replacementMarkets = dynamicReplacementMarkets.getReplacementMarkets()) == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : replacementMarkets) {
            if (Intrinsics.g(((SportDynamicMarkets) obj2).getSportId(), str)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            p48.w(((SportDynamicMarkets) obj3).getMarketIds(), arrayList2);
        }
        return arrayList2;
    }

    public final List<Market> b(Event event) {
        Sport sport = event.sport;
        List<String> listA = a(sport != null ? sport.id : null);
        List<Market> list = event.markets;
        if (list == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (listA.contains(((Market) obj).id)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
