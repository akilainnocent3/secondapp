package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigDeserializeOption;
import com.sporty.android.core.model.config.bo.BOConfigFeatureFlag;
import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigAppId;
import com.sporty.android.core.model.config.bo.enums.BOConfigNamespace;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.pocket.common.PayHintData;
import kotlin.collections.a;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final class qq1 {
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public static final boolean a(lq1 lq1Var, BOConfigParam bOConfigParam, boolean z) {
        BOConfigValueBundle bOConfigValueBundleE;
        Boolean boolR0;
        lq1Var.getClass();
        Boolean bool = null;
        obj = null;
        bool = null;
        bool = null;
        obj = null;
        bool = null;
        bool = null;
        obj = null;
        bool = null;
        bool = null;
        obj = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Object obj = null;
        bool = null;
        bool = null;
        if (bOConfigParam != null && (bOConfigValueBundleE = lq1Var.e()) != null) {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(Boolean.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof Boolean) {
                        obj = configValue;
                    }
                    bool = (Boolean) obj;
                } else if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof Boolean) {
                        obj = configValue;
                    }
                    bool = (Boolean) obj;
                } else if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof Boolean) {
                        obj = configValue;
                    }
                    bool = (Boolean) obj;
                } else if (configValue instanceof String) {
                    b.i((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof Boolean) {
                        obj = configValue;
                    }
                    bool = (Boolean) obj;
                } else if (configValue instanceof String) {
                    b.h((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    bool = (Boolean) configValue;
                } else if ((configValue instanceof String) && (boolR0 = StringsKt.r0((String) configValue)) != null) {
                    bool = boolR0;
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (configValue instanceof Boolean) {
                    obj = configValue;
                }
                bool = (Boolean) obj;
            }
        }
        return bool != null ? bool.booleanValue() : z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public static final double b(lq1 lq1Var, BOConfigParam bOConfigParam, double d) {
        BOConfigValueBundle bOConfigValueBundleE;
        Double dH;
        lq1Var.getClass();
        Double d2 = null;
        obj = null;
        d2 = null;
        d2 = null;
        obj = null;
        d2 = null;
        d2 = null;
        obj = null;
        d2 = null;
        d2 = null;
        d2 = null;
        d2 = null;
        obj = null;
        d2 = null;
        d2 = null;
        d2 = null;
        d2 = null;
        Object obj = null;
        d2 = null;
        d2 = null;
        if (bOConfigParam != null && (bOConfigValueBundleE = lq1Var.e()) != null) {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(Double.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof Double) {
                        obj = configValue;
                    }
                    d2 = (Double) obj;
                } else if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof Double) {
                        obj = configValue;
                    }
                    d2 = (Double) obj;
                } else if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof Double) {
                        obj = configValue;
                    }
                    d2 = (Double) obj;
                } else if (configValue instanceof String) {
                    b.i((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    d2 = (Double) configValue;
                } else if ((configValue instanceof String) && (dH = b.h((String) configValue)) != null) {
                    d2 = dH;
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof Double) {
                        obj = configValue;
                    }
                    d2 = (Double) obj;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (configValue instanceof Double) {
                    obj = configValue;
                }
                d2 = (Double) obj;
            }
        }
        return d2 != null ? d2.doubleValue() : d;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    public static final boolean c(lq1 lq1Var, BOConfigParam bOConfigParam, String str) {
        lq1Var.getClass();
        bOConfigParam.getClass();
        str.getClass();
        BOConfigValueBundle bOConfigValueBundleE = lq1Var.e();
        if (bOConfigValueBundleE == null) {
            return false;
        }
        BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
        BOConfigFeatureFlag bOConfigFeatureFlag = null;
        obj = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        obj = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        obj = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        obj = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        obj = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        Object obj = null;
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(BOConfigFeatureFlag.class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                if (configValue instanceof BOConfigFeatureFlag) {
                    obj = configValue;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) obj;
            } else if (configValue instanceof String) {
                StringsKt.toIntOrNull((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                if (configValue instanceof BOConfigFeatureFlag) {
                    obj = configValue;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) obj;
            } else if (configValue instanceof String) {
                StringsKt.s0((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                if (configValue instanceof BOConfigFeatureFlag) {
                    obj = configValue;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) obj;
            } else if (configValue instanceof String) {
                b.i((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (configValue instanceof Double) {
                if (configValue instanceof BOConfigFeatureFlag) {
                    obj = configValue;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) obj;
            } else if (configValue instanceof String) {
                b.h((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
            if (configValue instanceof Boolean) {
                if (configValue instanceof BOConfigFeatureFlag) {
                    obj = configValue;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) obj;
            } else if (configValue instanceof String) {
                StringsKt.r0((String) configValue);
            }
        } else if (dq7VarA.equals(jq40.a(String.class))) {
            if (configValue != null) {
                configValue.toString();
            }
        } else if (configValue != null) {
            if (configValue instanceof BOConfigFeatureFlag) {
                obj = configValue;
            }
            bOConfigFeatureFlag = (BOConfigFeatureFlag) obj;
        }
        if (bOConfigFeatureFlag != null) {
            return bOConfigFeatureFlag.isEnabled(str);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public static final float d(lq1 lq1Var, BOConfigParam bOConfigParam) {
        BOConfigValueBundle bOConfigValueBundleE;
        Float fI;
        lq1Var.getClass();
        Float f = null;
        obj = null;
        f = null;
        f = null;
        obj = null;
        f = null;
        f = null;
        f = null;
        f = null;
        obj = null;
        f = null;
        f = null;
        obj = null;
        f = null;
        f = null;
        f = null;
        f = null;
        Object obj = null;
        f = null;
        f = null;
        if (bOConfigParam != null && (bOConfigValueBundleE = lq1Var.e()) != null) {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(Float.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof Float) {
                        obj = configValue;
                    }
                    f = (Float) obj;
                } else if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof Float) {
                        obj = configValue;
                    }
                    f = (Float) obj;
                } else if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    f = (Float) configValue;
                } else if ((configValue instanceof String) && (fI = b.i((String) configValue)) != null) {
                    f = fI;
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof Float) {
                        obj = configValue;
                    }
                    f = (Float) obj;
                } else if (configValue instanceof String) {
                    b.h((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof Float) {
                        obj = configValue;
                    }
                    f = (Float) obj;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (configValue instanceof Float) {
                    obj = configValue;
                }
                f = (Float) obj;
            }
        }
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    public static final int e(lq1 lq1Var, BOConfigParam bOConfigParam, int i) {
        BOConfigValueBundle bOConfigValueBundleE;
        Integer intOrNull;
        lq1Var.getClass();
        Integer num = null;
        num = null;
        num = null;
        obj = null;
        num = null;
        num = null;
        obj = null;
        num = null;
        num = null;
        obj = null;
        num = null;
        num = null;
        obj = null;
        num = null;
        num = null;
        num = null;
        num = null;
        Object obj = null;
        num = null;
        num = null;
        if (bOConfigParam != null && (bOConfigValueBundleE = lq1Var.e()) != null) {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(Integer.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    num = (Integer) configValue;
                } else if ((configValue instanceof String) && (intOrNull = StringsKt.toIntOrNull((String) configValue)) != null) {
                    num = intOrNull;
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof Integer) {
                        obj = configValue;
                    }
                    num = (Integer) obj;
                } else if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof Integer) {
                        obj = configValue;
                    }
                    num = (Integer) obj;
                } else if (configValue instanceof String) {
                    b.i((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof Integer) {
                        obj = configValue;
                    }
                    num = (Integer) obj;
                } else if (configValue instanceof String) {
                    b.h((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof Integer) {
                        obj = configValue;
                    }
                    num = (Integer) obj;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (configValue instanceof Integer) {
                    obj = configValue;
                }
                num = (Integer) obj;
            }
        }
        return num != null ? num.intValue() : i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public static final long f(lq1 lq1Var, BOConfigParam bOConfigParam) {
        BOConfigValueBundle bOConfigValueBundleE;
        Long lS0;
        lq1Var.getClass();
        Long l = null;
        obj = null;
        l = null;
        l = null;
        l = null;
        l = null;
        obj = null;
        l = null;
        l = null;
        obj = null;
        l = null;
        l = null;
        obj = null;
        l = null;
        l = null;
        l = null;
        l = null;
        Object obj = null;
        l = null;
        l = null;
        if (bOConfigParam != null && (bOConfigValueBundleE = lq1Var.e()) != null) {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(Long.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof Long) {
                        obj = configValue;
                    }
                    l = (Long) obj;
                } else if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    l = (Long) configValue;
                } else if ((configValue instanceof String) && (lS0 = StringsKt.s0((String) configValue)) != null) {
                    l = lS0;
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof Long) {
                        obj = configValue;
                    }
                    l = (Long) obj;
                } else if (configValue instanceof String) {
                    b.i((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof Long) {
                        obj = configValue;
                    }
                    l = (Long) obj;
                } else if (configValue instanceof String) {
                    b.h((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof Long) {
                        obj = configValue;
                    }
                    l = (Long) obj;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (configValue instanceof Long) {
                    obj = configValue;
                }
                l = (Long) obj;
            }
        }
        if (l != null) {
            return l.longValue();
        }
        return 5000L;
    }

    public static final nq1 g(lq1 lq1Var) {
        lq1Var.getClass();
        BOConfigParamDto bOConfigParamDto = new BOConfigParamDto(BOConfigAppId.POCKET, BOConfigNamespace.APPLICATION, "paych.alert.content", new BOConfigDeserializeOption.WithKClass(jq40.a(PayHintData.PayHintEntity.class)));
        return new nq1(new wl50(lq1Var.c(a.c(bOConfigParamDto)), new mq1(bOConfigParamDto)));
    }

    public static final String h(lq1 lq1Var, BOConfigParam bOConfigParam) {
        BOConfigValueBundle bOConfigValueBundleE;
        String string;
        lq1Var.getClass();
        if (bOConfigParam == null || (bOConfigValueBundleE = lq1Var.e()) == null) {
            return null;
        }
        BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(String.class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                return (String) (configValue instanceof String ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            StringsKt.toIntOrNull((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                return (String) (configValue instanceof String ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            StringsKt.s0((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                return (String) (configValue instanceof String ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            b.i((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (configValue instanceof Double) {
                return (String) (configValue instanceof String ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            b.h((String) configValue);
            return null;
        }
        if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
            if (configValue instanceof Boolean) {
                return (String) (configValue instanceof String ? configValue : null);
            }
            if (!(configValue instanceof String)) {
                return null;
            }
            StringsKt.r0((String) configValue);
            return null;
        }
        if (!dq7VarA.equals(jq40.a(String.class))) {
            if (configValue != null) {
                return (String) (configValue instanceof String ? configValue : null);
            }
            return null;
        }
        if (configValue == null || (string = configValue.toString()) == null) {
            return null;
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public static final String i(lq1 lq1Var, BOConfigParam bOConfigParam, String str) {
        BOConfigValueBundle bOConfigValueBundleE;
        String string;
        lq1Var.getClass();
        String str2 = null;
        if (bOConfigParam != null && (bOConfigValueBundleE = lq1Var.e()) != null) {
            BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
            String configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(String.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof String) {
                        str2 = configValue;
                    }
                    str2 = str2;
                } else if (configValue instanceof String) {
                    StringsKt.toIntOrNull(configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof String) {
                        str2 = configValue;
                    }
                    str2 = str2;
                } else if (configValue instanceof String) {
                    StringsKt.s0(configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof String) {
                        str2 = configValue;
                    }
                    str2 = str2;
                } else if (configValue instanceof String) {
                    b.i(configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof String) {
                        str2 = configValue;
                    }
                    str2 = str2;
                } else if (configValue instanceof String) {
                    b.h(configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof String) {
                        str2 = configValue;
                    }
                    str2 = str2;
                } else if (configValue instanceof String) {
                    StringsKt.r0(configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null && (string = configValue.toString()) != null) {
                    str2 = string;
                }
            } else if (configValue != null) {
                if (configValue instanceof String) {
                    str2 = configValue;
                }
                str2 = str2;
            }
        }
        return str2 == null ? str : str2;
    }

    public static final Object j(lq1 lq1Var, v1b<? super BOConfigValueBundle> v1bVar) {
        return bm50.q(lq1Var.a(pu0.b.a), v1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:85:0x011d  */
    public static final Object k(lq1 lq1Var, BOConfigParam bOConfigParam, String str, x1b x1bVar) {
        pq1 pq1Var;
        boolean zIsEnabled;
        if (x1bVar instanceof pq1) {
            pq1Var = (pq1) x1bVar;
            int i = pq1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pq1Var.d = i - Integer.MIN_VALUE;
            } else {
                pq1Var = new pq1(x1bVar);
            }
        } else {
            pq1Var = new pq1(x1bVar);
        }
        Object objJ = pq1Var.c;
        y5b y5bVar = y5b.a;
        int i2 = pq1Var.d;
        BOConfigFeatureFlag bOConfigFeatureFlag = null;
        obj = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        obj = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        obj = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        obj = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        obj = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        bOConfigFeatureFlag = null;
        Object obj = null;
        if (i2 == 0) {
            uj50.b(objJ);
            pq1Var.a = bOConfigParam;
            pq1Var.b = str;
            pq1Var.d = 1;
            objJ = j(lq1Var, pq1Var);
            if (objJ == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = pq1Var.b;
            bOConfigParam = pq1Var.a;
            uj50.b(objJ);
        }
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) objJ;
        if (bOConfigValueBundle == null) {
            zIsEnabled = false;
        } else {
            BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(BOConfigFeatureFlag.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof BOConfigFeatureFlag) {
                        obj = configValue;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) obj;
                } else if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof BOConfigFeatureFlag) {
                        obj = configValue;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) obj;
                } else if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof BOConfigFeatureFlag) {
                        obj = configValue;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) obj;
                } else if (configValue instanceof String) {
                    b.i((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof BOConfigFeatureFlag) {
                        obj = configValue;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) obj;
                } else if (configValue instanceof String) {
                    b.h((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof BOConfigFeatureFlag) {
                        obj = configValue;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) obj;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (configValue instanceof BOConfigFeatureFlag) {
                    obj = configValue;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) obj;
            }
            if (bOConfigFeatureFlag != null) {
                zIsEnabled = bOConfigFeatureFlag.isEnabled(str);
            } else {
                zIsEnabled = false;
            }
        }
        return Boolean.valueOf(zIsEnabled);
    }
}
