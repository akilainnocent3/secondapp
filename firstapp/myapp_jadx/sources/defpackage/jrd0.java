package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.realsports.StakeConfig;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class jrd0 implements hrd0 {
    public final lq1 a;
    public final erd0 b;
    public final JsonSerializeService c;
    public volatile StakeConfig d;
    public final mpe0 e;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.data.repository.StakeConfigRepositoryImpl$buildStakeConfig$2$1", f = "StakeConfigRepositoryImpl.kt", l = {84}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ StakeConfig c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StakeConfig stakeConfig, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = stakeConfig;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jrd0.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                jrd0 jrd0Var = jrd0.this;
                erd0 erd0Var = jrd0Var.b;
                String json = jrd0Var.c.toJson(this.c);
                json.getClass();
                this.a = 1;
                if (erd0Var.a.putString("stake_config_json", json, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.data.repository.StakeConfigRepositoryImpl$persistedStakeConfigOnDisk$2$1", f = "StakeConfigRepositoryImpl.kt", l = {38}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super StakeConfig>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = jrd0.this.new b(v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super StakeConfig> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objF;
            Object bVar;
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            jrd0 jrd0Var = jrd0.this;
            if (i == 0) {
                uj50.b(obj);
                erd0 erd0Var = jrd0Var.b;
                this.b = v5bVar;
                this.a = 1;
                objF = erd0Var.a.f(co20.f("stake_config_json"), this);
                if (objF == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objF = obj;
            }
            String str = (String) objF;
            if (str == null) {
                return null;
            }
            try {
                zi50.a aVar = zi50.b;
                Object objFromJson = jrd0Var.c.fromJson(str, (Class<Object>) StakeConfig.class);
                objFromJson.getClass();
                bVar = StakeConfig.copy$default((StakeConfig) objFromJson, null, null, null, null, null, null, null, 0, null, 0, 1023, null);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            return (StakeConfig) (bVar instanceof zi50.b ? null : bVar);
        }
    }

    public jrd0(lq1 lq1Var, erd0 erd0Var, JsonSerializeService jsonSerializeService) {
        lq1Var.getClass();
        jsonSerializeService.getClass();
        this.a = lq1Var;
        this.b = erd0Var;
        this.c = jsonSerializeService;
        this.e = hwr.b(new o3j(this, 1));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    public static BigDecimal U(BOConfigValueBundle bOConfigValueBundle, BOConfigParam bOConfigParam) {
        Double dH;
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(Double.class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                if (!(configValue instanceof Double)) {
                    configValue = null;
                }
                dH = (Double) configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
                dH = null;
            }
        } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                if (!(configValue instanceof Double)) {
                    configValue = null;
                }
                dH = (Double) configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
                dH = null;
            }
        } else if (!dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    dH = (Double) configValue;
                } else if (!(configValue instanceof String) || (dH = kotlin.text.b.h((String) configValue)) == null) {
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (!(configValue instanceof Double)) {
                        configValue = null;
                    }
                    dH = (Double) configValue;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (!(configValue instanceof Double)) {
                    configValue = null;
                }
                dH = (Double) configValue;
            }
            dH = null;
        } else if (configValue instanceof Float) {
            if (!(configValue instanceof Double)) {
                configValue = null;
            }
            dH = (Double) configValue;
        } else {
            if (configValue instanceof String) {
                kotlin.text.b.i((String) configValue);
            }
            dH = null;
        }
        if (dH == null) {
            kb5.a(inm.a("Missing required BO config: ", bOConfigParam.getConfigKey()));
            return null;
        }
        BigDecimal scale = BigDecimal.valueOf(dH.doubleValue()).setScale(2, RoundingMode.HALF_UP);
        scale.getClass();
        return scale;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    public static BigDecimal V(BOConfigValueBundle bOConfigValueBundle, BOConfigParam bOConfigParam) {
        Long lS0;
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(Long.class);
        if (!dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    lS0 = (Long) configValue;
                } else if (!(configValue instanceof String) || (lS0 = StringsKt.s0((String) configValue)) == null) {
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (!(configValue instanceof Long)) {
                        configValue = null;
                    }
                    lS0 = (Long) configValue;
                } else if (configValue instanceof String) {
                    kotlin.text.b.i((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (!(configValue instanceof Long)) {
                        configValue = null;
                    }
                    lS0 = (Long) configValue;
                } else if (configValue instanceof String) {
                    kotlin.text.b.h((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (!(configValue instanceof Long)) {
                        configValue = null;
                    }
                    lS0 = (Long) configValue;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (!(configValue instanceof Long)) {
                    configValue = null;
                }
                lS0 = (Long) configValue;
            }
            lS0 = null;
        } else if (configValue instanceof Integer) {
            if (!(configValue instanceof Long)) {
                configValue = null;
            }
            lS0 = (Long) configValue;
        } else {
            if (configValue instanceof String) {
                StringsKt.toIntOrNull((String) configValue);
            }
            lS0 = null;
        }
        if (lS0 == null) {
            kb5.a(inm.a("Missing required BO config: ", bOConfigParam.getConfigKey()));
            return null;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(lS0.longValue());
        bigDecimalValueOf.getClass();
        return p54.b(bigDecimalValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x0107  */
    public static ArrayList W(BOConfigValueBundle bOConfigValueBundle, BigDecimal bigDecimal) {
        Long lS0;
        Long lS1;
        Long lS2;
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.StakeQuickAmount1);
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
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(Long.class);
        Class cls = Integer.TYPE;
        boolean zEquals = dq7VarA.equals(jq40.a(cls));
        Class cls2 = Boolean.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        if (!zEquals) {
            if (dq7VarA.equals(jq40.a(cls5))) {
                if (configValue instanceof Long) {
                    lS0 = (Long) configValue;
                } else if (!(configValue instanceof String) || (lS0 = StringsKt.s0((String) configValue)) == null) {
                }
            } else if (dq7VarA.equals(jq40.a(cls4))) {
                if (configValue instanceof Float) {
                    if (!(configValue instanceof Long)) {
                        configValue = null;
                    }
                    lS0 = (Long) configValue;
                } else if (configValue instanceof String) {
                    kotlin.text.b.i((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(cls3))) {
                if (configValue instanceof Double) {
                    if (!(configValue instanceof Long)) {
                        configValue = null;
                    }
                    lS0 = (Long) configValue;
                } else if (configValue instanceof String) {
                    kotlin.text.b.h((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(cls2))) {
                if (configValue instanceof Boolean) {
                    if (!(configValue instanceof Long)) {
                        configValue = null;
                    }
                    lS0 = (Long) configValue;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (!(configValue instanceof Long)) {
                    configValue = null;
                }
                lS0 = (Long) configValue;
            }
            lS0 = null;
        } else if (configValue instanceof Integer) {
            if (!(configValue instanceof Long)) {
                configValue = null;
            }
            lS0 = (Long) configValue;
        } else {
            if (configValue instanceof String) {
                StringsKt.toIntOrNull((String) configValue);
            }
            lS0 = null;
        }
        long jLongValue = lS0 != null ? lS0.longValue() : 0L;
        BOConfigValueWrapper response2 = bOConfigValueBundle.getResponse(BOConfigParam.StakeQuickAmount2);
        Object configValue2 = response2 != null ? response2.getConfigValue() : null;
        dq7 dq7VarA2 = jq40.a(Long.class);
        if (!dq7VarA2.equals(jq40.a(cls))) {
            if (dq7VarA2.equals(jq40.a(cls5))) {
                if (configValue2 instanceof Long) {
                    lS1 = (Long) configValue2;
                } else if (!(configValue2 instanceof String) || (lS1 = StringsKt.s0((String) configValue2)) == null) {
                }
            } else if (dq7VarA2.equals(jq40.a(cls4))) {
                if (configValue2 instanceof Float) {
                    if (!(configValue2 instanceof Long)) {
                        configValue2 = null;
                    }
                    lS1 = (Long) configValue2;
                } else if (configValue2 instanceof String) {
                    kotlin.text.b.i((String) configValue2);
                }
            } else if (dq7VarA2.equals(jq40.a(cls3))) {
                if (configValue2 instanceof Double) {
                    if (!(configValue2 instanceof Long)) {
                        configValue2 = null;
                    }
                    lS1 = (Long) configValue2;
                } else if (configValue2 instanceof String) {
                    kotlin.text.b.h((String) configValue2);
                }
            } else if (dq7VarA2.equals(jq40.a(cls2))) {
                if (configValue2 instanceof Boolean) {
                    if (!(configValue2 instanceof Long)) {
                        configValue2 = null;
                    }
                    lS1 = (Long) configValue2;
                } else if (configValue2 instanceof String) {
                    StringsKt.r0((String) configValue2);
                }
            } else if (dq7VarA2.equals(jq40.a(String.class))) {
                if (configValue2 != null) {
                    configValue2.toString();
                }
            } else if (configValue2 != null) {
                if (!(configValue2 instanceof Long)) {
                    configValue2 = null;
                }
                lS1 = (Long) configValue2;
            }
            lS1 = null;
        } else if (configValue2 instanceof Integer) {
            if (!(configValue2 instanceof Long)) {
                configValue2 = null;
            }
            lS1 = (Long) configValue2;
        } else {
            if (configValue2 instanceof String) {
                StringsKt.toIntOrNull((String) configValue2);
            }
            lS1 = null;
        }
        long jLongValue2 = lS1 != null ? lS1.longValue() : 0L;
        BOConfigValueWrapper response3 = bOConfigValueBundle.getResponse(BOConfigParam.StakeQuickAmount3);
        Object configValue3 = response3 != null ? response3.getConfigValue() : null;
        dq7 dq7VarA3 = jq40.a(Long.class);
        if (dq7VarA3.equals(jq40.a(cls))) {
            if (configValue3 instanceof Integer) {
                if (configValue3 instanceof Long) {
                    obj = configValue3;
                }
                l = (Long) obj;
            } else if (configValue3 instanceof String) {
                StringsKt.toIntOrNull((String) configValue3);
            }
        } else if (dq7VarA3.equals(jq40.a(cls5))) {
            if (configValue3 instanceof Long) {
                l = (Long) configValue3;
            } else if ((configValue3 instanceof String) && (lS2 = StringsKt.s0((String) configValue3)) != null) {
                l = lS2;
            }
        } else if (dq7VarA3.equals(jq40.a(cls4))) {
            if (configValue3 instanceof Float) {
                if (configValue3 instanceof Long) {
                    obj = configValue3;
                }
                l = (Long) obj;
            } else if (configValue3 instanceof String) {
                kotlin.text.b.i((String) configValue3);
            }
        } else if (dq7VarA3.equals(jq40.a(cls3))) {
            if (configValue3 instanceof Double) {
                if (configValue3 instanceof Long) {
                    obj = configValue3;
                }
                l = (Long) obj;
            } else if (configValue3 instanceof String) {
                kotlin.text.b.h((String) configValue3);
            }
        } else if (dq7VarA3.equals(jq40.a(cls2))) {
            if (configValue3 instanceof Boolean) {
                if (configValue3 instanceof Long) {
                    obj = configValue3;
                }
                l = (Long) obj;
            } else if (configValue3 instanceof String) {
                StringsKt.r0((String) configValue3);
            }
        } else if (dq7VarA3.equals(jq40.a(String.class))) {
            if (configValue3 != null) {
                configValue3.toString();
            }
        } else if (configValue3 != null) {
            if (configValue3 instanceof Long) {
                obj = configValue3;
            }
            l = (Long) obj;
        }
        long jLongValue3 = l != null ? l.longValue() : 0L;
        if (jLongValue <= 0 || jLongValue2 <= 0 || jLongValue3 <= 0) {
            List listK = kotlin.collections.b.k(bigDecimal, bigDecimal.multiply(new BigDecimal(5)), bigDecimal.multiply(new BigDecimal(10)));
            ArrayList arrayList = new ArrayList(l48.r(listK, 10));
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(((BigDecimal) it.next()).setScale(2, RoundingMode.HALF_UP));
            }
            return arrayList;
        }
        List listK2 = kotlin.collections.b.k(Long.valueOf(jLongValue), Long.valueOf(jLongValue2), Long.valueOf(jLongValue3));
        ArrayList arrayList2 = new ArrayList(l48.r(listK2, 10));
        Iterator it2 = listK2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(BigDecimal.valueOf(((Number) it2.next()).longValue()).setScale(2, RoundingMode.HALF_UP));
        }
        return arrayList2;
    }

    @Override // defpackage.hrd0
    public final lyh<lk50<StakeConfig>> D(boolean z) {
        return new wl50(a(z ? pu0.c.a : new pu0.a(300000L)), new m3j(this, 2));
    }

    /* JADX WARN: Code duplicated, block: B:142:0x01eb A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:3:0x0004, B:5:0x0036, B:9:0x003f, B:12:0x005b, B:14:0x005f, B:71:0x0106, B:74:0x010f, B:76:0x0117, B:78:0x011d, B:80:0x012d, B:82:0x0131, B:85:0x0136, B:139:0x01d9, B:143:0x01ed, B:145:0x01f8, B:147:0x01fe, B:149:0x020c, B:151:0x0210, B:208:0x02b8, B:211:0x02c0, B:152:0x0214, B:154:0x0218, B:158:0x0225, B:160:0x022f, B:162:0x0233, B:165:0x0238, B:166:0x023c, B:168:0x0240, B:169:0x0246, B:171:0x0250, B:173:0x0254, B:176:0x0259, B:178:0x025d, B:179:0x0263, B:181:0x026d, B:183:0x0271, B:186:0x0276, B:188:0x027a, B:189:0x0280, B:191:0x028a, B:193:0x028e, B:196:0x0293, B:198:0x0297, B:199:0x029d, B:202:0x02a9, B:204:0x02b1, B:142:0x01eb, B:86:0x013a, B:88:0x013e, B:90:0x0146, B:92:0x0150, B:94:0x0154, B:95:0x0158, B:97:0x015c, B:100:0x0166, B:102:0x0170, B:104:0x0174, B:107:0x0179, B:109:0x017d, B:110:0x0183, B:112:0x018d, B:114:0x0191, B:117:0x0196, B:119:0x019a, B:120:0x01a0, B:122:0x01aa, B:124:0x01ae, B:127:0x01b3, B:129:0x01b7, B:130:0x01bd, B:133:0x01c9, B:135:0x01d1, B:15:0x0063, B:17:0x0067, B:21:0x0074, B:23:0x007e, B:25:0x0082, B:69:0x0102, B:28:0x0088, B:30:0x008c, B:31:0x0092, B:33:0x009c, B:35:0x00a0, B:38:0x00a5, B:40:0x00a9, B:41:0x00af, B:43:0x00b9, B:45:0x00bd, B:48:0x00c2, B:50:0x00c6, B:51:0x00cc, B:53:0x00d6, B:55:0x00da, B:58:0x00df, B:60:0x00e3, B:61:0x00e9, B:64:0x00f5, B:66:0x00fd), top: B:230:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:218:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:222:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:224:0x02fc  */
    public final StakeConfig T(BOConfigValueBundle bOConfigValueBundle) {
        Object bVar;
        StakeConfig stakeConfigH;
        StakeConfig stakeConfig;
        Integer intOrNull;
        Long lS0;
        BigDecimal bigDecimalB;
        Integer intOrNull2;
        try {
            zi50.a aVar = zi50.b;
            BigDecimal bigDecimalV = V(bOConfigValueBundle, BOConfigParam.StakeDefaultAmount);
            BigDecimal bigDecimalV2 = V(bOConfigValueBundle, BOConfigParam.StakeMinAmount);
            BigDecimal bigDecimalV3 = V(bOConfigValueBundle, BOConfigParam.StakeMaxAmount);
            BigDecimal bigDecimalV4 = V(bOConfigValueBundle, BOConfigParam.StakeMaxPayoutAmount);
            BigDecimal bigDecimalU = U(bOConfigValueBundle, BOConfigParam.StakeMinCashoutAmount);
            BigDecimal bigDecimalU2 = U(bOConfigValueBundle, BOConfigParam.StakeMaxCashoutAmount);
            ArrayList arrayListW = W(bOConfigValueBundle, bigDecimalV);
            BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.StakeMaxSelectionLimit);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(Integer.class);
            Class cls = Integer.TYPE;
            boolean zEquals = dq7VarA.equals(jq40.a(cls));
            Class cls2 = Boolean.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Float.TYPE;
            Class cls5 = Long.TYPE;
            if (!zEquals) {
                if (dq7VarA.equals(jq40.a(cls5))) {
                    if (configValue instanceof Long) {
                        if (!(configValue instanceof Integer)) {
                            configValue = null;
                        }
                        intOrNull = (Integer) configValue;
                    } else {
                        if (configValue instanceof String) {
                            StringsKt.s0((String) configValue);
                        }
                        intOrNull = null;
                    }
                } else if (dq7VarA.equals(jq40.a(cls4))) {
                    if (configValue instanceof Float) {
                        if (!(configValue instanceof Integer)) {
                            configValue = null;
                        }
                        intOrNull = (Integer) configValue;
                    } else {
                        if (configValue instanceof String) {
                            kotlin.text.b.i((String) configValue);
                        }
                        intOrNull = null;
                    }
                } else if (dq7VarA.equals(jq40.a(cls3))) {
                    if (configValue instanceof Double) {
                        if (!(configValue instanceof Integer)) {
                            configValue = null;
                        }
                        intOrNull = (Integer) configValue;
                    } else {
                        if (configValue instanceof String) {
                            kotlin.text.b.h((String) configValue);
                        }
                        intOrNull = null;
                    }
                } else if (!dq7VarA.equals(jq40.a(cls2))) {
                    if (dq7VarA.equals(jq40.a(String.class))) {
                        if (configValue != null) {
                            configValue.toString();
                        }
                    } else if (configValue != null) {
                        if (!(configValue instanceof Integer)) {
                            configValue = null;
                        }
                        intOrNull = (Integer) configValue;
                    }
                    intOrNull = null;
                } else if (configValue instanceof Boolean) {
                    if (!(configValue instanceof Integer)) {
                        configValue = null;
                    }
                    intOrNull = (Integer) configValue;
                } else {
                    if (configValue instanceof String) {
                        StringsKt.r0((String) configValue);
                    }
                    intOrNull = null;
                }
                if (!(bVar instanceof zi50.b)) {
                    stakeConfig = (StakeConfig) bVar;
                    if (!stakeConfig.equals(this.d)) {
                        this.d = stakeConfig;
                        zu7.a aVar2 = zu7.a;
                        ej5.c(zu7.b(zu7.f), null, null, new a(stakeConfig, null), 3);
                    }
                }
                if (zi50.a(bVar) != null) {
                    stakeConfigH = this.d;
                    if (stakeConfigH == null && (stakeConfigH = (StakeConfig) this.e.getValue()) == null) {
                        stakeConfigH = a8b.c().h();
                    }
                    bVar = stakeConfigH;
                    bVar.getClass();
                }
                return (StakeConfig) bVar;
            }
            if (configValue instanceof Integer) {
                intOrNull = (Integer) configValue;
            } else if (!(configValue instanceof String) || (intOrNull = StringsKt.toIntOrNull((String) configValue)) == null) {
                intOrNull = null;
            }
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 30;
            BOConfigValueWrapper response2 = bOConfigValueBundle.getResponse(BOConfigParam.StakeBettorLimitLossDefault);
            Object configValue2 = response2 != null ? response2.getConfigValue() : null;
            dq7 dq7VarA2 = jq40.a(Long.class);
            if (!dq7VarA2.equals(jq40.a(cls))) {
                if (!dq7VarA2.equals(jq40.a(cls5))) {
                    if (dq7VarA2.equals(jq40.a(cls4))) {
                        if (configValue2 instanceof Float) {
                            if (!(configValue2 instanceof Long)) {
                                configValue2 = null;
                            }
                            lS0 = (Long) configValue2;
                        } else if (configValue2 instanceof String) {
                            kotlin.text.b.i((String) configValue2);
                        }
                    } else if (dq7VarA2.equals(jq40.a(cls3))) {
                        if (configValue2 instanceof Double) {
                            if (!(configValue2 instanceof Long)) {
                                configValue2 = null;
                            }
                            lS0 = (Long) configValue2;
                        } else if (configValue2 instanceof String) {
                            kotlin.text.b.h((String) configValue2);
                        }
                    } else if (dq7VarA2.equals(jq40.a(cls2))) {
                        if (configValue2 instanceof Boolean) {
                            if (!(configValue2 instanceof Long)) {
                                configValue2 = null;
                            }
                            lS0 = (Long) configValue2;
                        } else if (configValue2 instanceof String) {
                            StringsKt.r0((String) configValue2);
                        }
                    } else if (dq7VarA2.equals(jq40.a(String.class))) {
                        if (configValue2 != null) {
                            configValue2.toString();
                        }
                    } else if (configValue2 != null) {
                        if (!(configValue2 instanceof Long)) {
                            configValue2 = null;
                        }
                        lS0 = (Long) configValue2;
                    }
                    if (!(bVar instanceof zi50.b)) {
                        stakeConfig = (StakeConfig) bVar;
                        if (!stakeConfig.equals(this.d)) {
                            this.d = stakeConfig;
                            zu7.a aVar3 = zu7.a;
                            ej5.c(zu7.b(zu7.f), null, null, new a(stakeConfig, null), 3);
                        }
                    }
                    if (zi50.a(bVar) != null) {
                        stakeConfigH = this.d;
                        if (stakeConfigH == null) {
                            stakeConfigH = a8b.c().h();
                        }
                        bVar = stakeConfigH;
                        bVar.getClass();
                    }
                    return (StakeConfig) bVar;
                }
                if (configValue2 instanceof Long) {
                    lS0 = (Long) configValue2;
                } else if (!(configValue2 instanceof String) || (lS0 = StringsKt.s0((String) configValue2)) == null) {
                }
                lS0 = null;
            } else if (configValue2 instanceof Integer) {
                if (!(configValue2 instanceof Long)) {
                    configValue2 = null;
                }
                lS0 = (Long) configValue2;
            } else {
                if (configValue2 instanceof String) {
                    StringsKt.toIntOrNull((String) configValue2);
                }
                lS0 = null;
            }
            if (lS0 != null) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(lS0.longValue());
                bigDecimalValueOf.getClass();
                bigDecimalB = p54.b(bigDecimalValueOf);
                if (bigDecimalB == null) {
                    bigDecimalB = BigDecimal.ZERO;
                }
            } else {
                bigDecimalB = BigDecimal.ZERO;
            }
            bigDecimalB.getClass();
            BOConfigValueWrapper response3 = bOConfigValueBundle.getResponse(BOConfigParam.StakeBettorLimitTimeDefault);
            Object configValue3 = response3 != null ? response3.getConfigValue() : null;
            dq7 dq7VarA3 = jq40.a(Integer.class);
            if (!dq7VarA3.equals(jq40.a(cls))) {
                if (dq7VarA3.equals(jq40.a(cls5))) {
                    if (configValue3 instanceof Long) {
                        if (!(configValue3 instanceof Integer)) {
                            configValue3 = null;
                        }
                        intOrNull2 = (Integer) configValue3;
                    } else {
                        if (configValue3 instanceof String) {
                            StringsKt.s0((String) configValue3);
                        }
                        intOrNull2 = null;
                    }
                } else if (dq7VarA3.equals(jq40.a(cls4))) {
                    if (configValue3 instanceof Float) {
                        if (!(configValue3 instanceof Integer)) {
                            configValue3 = null;
                        }
                        intOrNull2 = (Integer) configValue3;
                    } else {
                        if (configValue3 instanceof String) {
                            kotlin.text.b.i((String) configValue3);
                        }
                        intOrNull2 = null;
                    }
                } else if (dq7VarA3.equals(jq40.a(cls3))) {
                    if (configValue3 instanceof Double) {
                        if (!(configValue3 instanceof Integer)) {
                            configValue3 = null;
                        }
                        intOrNull2 = (Integer) configValue3;
                    } else {
                        if (configValue3 instanceof String) {
                            kotlin.text.b.h((String) configValue3);
                        }
                        intOrNull2 = null;
                    }
                } else if (!dq7VarA3.equals(jq40.a(cls2))) {
                    if (dq7VarA3.equals(jq40.a(String.class))) {
                        if (configValue3 != null) {
                            configValue3.toString();
                        }
                    } else if (configValue3 != null) {
                        if (!(configValue3 instanceof Integer)) {
                            configValue3 = null;
                        }
                        intOrNull2 = (Integer) configValue3;
                    }
                    intOrNull2 = null;
                } else if (configValue3 instanceof Boolean) {
                    if (!(configValue3 instanceof Integer)) {
                        configValue3 = null;
                    }
                    intOrNull2 = (Integer) configValue3;
                } else {
                    if (configValue3 instanceof String) {
                        StringsKt.r0((String) configValue3);
                    }
                    intOrNull2 = null;
                }
                if (!(bVar instanceof zi50.b)) {
                    stakeConfig = (StakeConfig) bVar;
                    if (!stakeConfig.equals(this.d)) {
                        this.d = stakeConfig;
                        zu7.a aVar4 = zu7.a;
                        ej5.c(zu7.b(zu7.f), null, null, new a(stakeConfig, null), 3);
                    }
                }
                if (zi50.a(bVar) != null) {
                    stakeConfigH = this.d;
                    if (stakeConfigH == null) {
                        stakeConfigH = a8b.c().h();
                    }
                    bVar = stakeConfigH;
                    bVar.getClass();
                }
                return (StakeConfig) bVar;
            }
            if (configValue3 instanceof Integer) {
                intOrNull2 = (Integer) configValue3;
            } else if (!(configValue3 instanceof String) || (intOrNull2 = StringsKt.toIntOrNull((String) configValue3)) == null) {
                intOrNull2 = null;
            }
            bVar = new StakeConfig(bigDecimalV, bigDecimalV2, bigDecimalV3, bigDecimalV4, bigDecimalU, bigDecimalU2, arrayListW, iIntValue, bigDecimalB, intOrNull2 != null ? intOrNull2.intValue() : 0);
        } catch (Throwable th) {
            zi50.a aVar5 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (!(bVar instanceof zi50.b)) {
            stakeConfig = (StakeConfig) bVar;
            if (!stakeConfig.equals(this.d)) {
                this.d = stakeConfig;
                zu7.a aVar6 = zu7.a;
                ej5.c(zu7.b(zu7.f), null, null, new a(stakeConfig, null), 3);
            }
        }
        if (zi50.a(bVar) != null) {
            stakeConfigH = this.d;
            if (stakeConfigH == null) {
                stakeConfigH = a8b.c().h();
            }
            bVar = stakeConfigH;
            bVar.getClass();
        }
        return (StakeConfig) bVar;
    }

    @Override // defpackage.jq1
    public final lyh<lk50<BOConfigValueBundle>> a(pu0 pu0Var) {
        pu0Var.getClass();
        return this.a.a(pu0Var);
    }

    @Override // defpackage.hrd0
    public final StakeConfig y() {
        StakeConfig stakeConfigT = this.d;
        if (stakeConfigT == null) {
            BOConfigValueBundle bOConfigValueBundleE = this.a.e();
            stakeConfigT = bOConfigValueBundleE != null ? T(bOConfigValueBundleE) : null;
            if (stakeConfigT == null) {
                StakeConfig stakeConfig = (StakeConfig) this.e.getValue();
                if (stakeConfig != null) {
                    return stakeConfig;
                }
                StakeConfig stakeConfigH = a8b.c().h();
                stakeConfigH.getClass();
                return stakeConfigH;
            }
        }
        return stakeConfigT;
    }
}
