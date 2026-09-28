package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigFeatureFlag;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.plugin.sportypicks.domain.model.SportyPicksConfig;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class q6d0 {
    public final lq1 a;
    public final yi5 b;

    public q6d0(lq1 lq1Var, yi5 yi5Var) {
        lq1Var.getClass();
        yi5Var.getClass();
        this.a = lq1Var;
        this.b = yi5Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:85:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0144  */
    public final Object a(x1b x1bVar) {
        p6d0 p6d0Var;
        BOConfigParam bOConfigParam;
        Object bVar;
        BOConfigFeatureFlag bOConfigFeatureFlag;
        BOConfigFeatureFlag.AndroidRule android2;
        xdp data;
        if (x1bVar instanceof p6d0) {
            p6d0Var = (p6d0) x1bVar;
            int i = p6d0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p6d0Var.d = i - Integer.MIN_VALUE;
            } else {
                p6d0Var = new p6d0(this, x1bVar);
            }
        } else {
            p6d0Var = new p6d0(this, x1bVar);
        }
        Object obj = p6d0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = p6d0Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            BOConfigParam bOConfigParam2 = BOConfigParam.SportyPicks;
            p6d0Var.a = bOConfigParam2;
            p6d0Var.d = 1;
            Object objJ = qq1.j(this.a, p6d0Var);
            if (objJ == y5bVar) {
                return y5bVar;
            }
            obj = objJ;
            bOConfigParam = bOConfigParam2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bOConfigParam = p6d0Var.a;
            uj50.b(obj);
        }
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        if (bOConfigValueBundle == null) {
            bVar = null;
        } else {
            BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(BOConfigFeatureFlag.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (!(configValue instanceof BOConfigFeatureFlag)) {
                        configValue = null;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    if (bOConfigFeatureFlag != null || (android2 = bOConfigFeatureFlag.getAndroid()) == null || (data = android2.getData()) == null) {
                        bVar = null;
                    } else {
                        try {
                            zi50.a aVar = zi50.b;
                            bVar = new eal().b(data, SportyPicksConfig.class);
                        } catch (Throwable th) {
                            zi50.a aVar2 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                        if (bVar instanceof zi50.b) {
                            bVar = null;
                        }
                    }
                } else {
                    if (configValue instanceof String) {
                        StringsKt.toIntOrNull((String) configValue);
                    }
                    bOConfigFeatureFlag = null;
                    if (bOConfigFeatureFlag != null) {
                        bVar = null;
                    } else {
                        bVar = null;
                    }
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (!(configValue instanceof BOConfigFeatureFlag)) {
                        configValue = null;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    if (bOConfigFeatureFlag != null) {
                        bVar = null;
                    } else {
                        bVar = null;
                    }
                } else {
                    if (configValue instanceof String) {
                        StringsKt.s0((String) configValue);
                    }
                    bOConfigFeatureFlag = null;
                    if (bOConfigFeatureFlag != null) {
                        bVar = null;
                    } else {
                        bVar = null;
                    }
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (!(configValue instanceof BOConfigFeatureFlag)) {
                        configValue = null;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    if (bOConfigFeatureFlag != null) {
                        bVar = null;
                    } else {
                        bVar = null;
                    }
                } else {
                    if (configValue instanceof String) {
                        b.i((String) configValue);
                    }
                    bOConfigFeatureFlag = null;
                    if (bOConfigFeatureFlag != null) {
                        bVar = null;
                    } else {
                        bVar = null;
                    }
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (!(configValue instanceof BOConfigFeatureFlag)) {
                        configValue = null;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    if (bOConfigFeatureFlag != null) {
                        bVar = null;
                    } else {
                        bVar = null;
                    }
                } else {
                    if (configValue instanceof String) {
                        b.h((String) configValue);
                    }
                    bOConfigFeatureFlag = null;
                    if (bOConfigFeatureFlag != null) {
                        bVar = null;
                    } else {
                        bVar = null;
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
                        bVar = null;
                    } else {
                        bVar = null;
                    }
                } else if (configValue != null) {
                    configValue.toString();
                }
                bOConfigFeatureFlag = null;
                if (bOConfigFeatureFlag != null) {
                    bVar = null;
                } else {
                    bVar = null;
                }
            } else if (configValue instanceof Boolean) {
                if (!(configValue instanceof BOConfigFeatureFlag)) {
                    configValue = null;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                if (bOConfigFeatureFlag != null) {
                    bVar = null;
                } else {
                    bVar = null;
                }
            } else {
                if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
                bOConfigFeatureFlag = null;
                if (bOConfigFeatureFlag != null) {
                    bVar = null;
                } else {
                    bVar = null;
                }
            }
        }
        SportyPicksConfig sportyPicksConfig = (SportyPicksConfig) bVar;
        return sportyPicksConfig == null ? new SportyPicksConfig(0, null, 3, null) : sportyPicksConfig;
    }
}
