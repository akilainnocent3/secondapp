package defpackage;

import androidx.compose.runtime.m;
import com.google.protobuf.Reader;
import com.sporty.android.book.data.entity.BetBuilderError;
import com.sporty.android.book.domain.entity.BetBuilderData;
import com.sporty.android.book.domain.entity.BetBuilderDataWSelections;
import com.sporty.android.book.domain.entity.BetBuilderSelection;
import com.sporty.android.book.domain.entity.Event;
import com.sporty.android.book.domain.entity.Outcome;
import com.sporty.android.book.domain.entity.Selection;
import com.sporty.android.book.domain.entity.SimpleMarket;
import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfj2;", "Lj8i0;", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fj2 extends j8i0 {
    public final wwd0 A;
    public final wwd0 B;
    public final wwd0 C;
    public jvd0 D;
    public jvd0 E;
    public final HashMap<List<Selection>, Function0<Unit>> F;
    public final kt5 a;
    public final lq1 b;
    public final ytw c;
    public final wwd0 d;
    public final v340 e;
    public final ssw<List<SimpleMarket>> f;
    public final ssw i;
    public final vu90<BetBuilderDataWSelections> v;
    public final vu90 w;
    public final r5b y;
    public final wwd0 z;

    @c0d(c = "com.sporty.android.book.presentation.betbuilder.BetBuilderViewModel$1", f = "BetBuilderViewModel.kt", l = {195, 231, 267}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public BOConfigParam a;
        public Number b;
        public wwd0 c;
        public int d;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fj2.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0194  */
        /* JADX WARN: Code duplicated, block: B:104:0x0197  */
        /* JADX WARN: Code duplicated, block: B:106:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:108:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:110:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:112:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:114:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:115:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:117:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:119:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:122:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:124:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:125:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:127:0x01df  */
        /* JADX WARN: Code duplicated, block: B:129:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:132:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:134:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:135:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:137:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:139:0x0200  */
        /* JADX WARN: Code duplicated, block: B:142:0x0205  */
        /* JADX WARN: Code duplicated, block: B:144:0x0209  */
        /* JADX WARN: Code duplicated, block: B:145:0x020f  */
        /* JADX WARN: Code duplicated, block: B:147:0x0219 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:148:0x021b  */
        /* JADX WARN: Code duplicated, block: B:149:0x0221 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:150:0x0223  */
        /* JADX WARN: Code duplicated, block: B:155:0x022b  */
        /* JADX WARN: Code duplicated, block: B:159:0x024d  */
        /* JADX WARN: Code duplicated, block: B:162:0x0252  */
        /* JADX WARN: Code duplicated, block: B:164:0x0258  */
        /* JADX WARN: Code duplicated, block: B:165:0x025d  */
        /* JADX WARN: Code duplicated, block: B:168:0x026e  */
        /* JADX WARN: Code duplicated, block: B:170:0x0272  */
        /* JADX WARN: Code duplicated, block: B:172:0x0276  */
        /* JADX WARN: Code duplicated, block: B:173:0x0278  */
        /* JADX WARN: Code duplicated, block: B:175:0x027d  */
        /* JADX WARN: Code duplicated, block: B:177:0x0281  */
        /* JADX WARN: Code duplicated, block: B:179:0x0289  */
        /* JADX WARN: Code duplicated, block: B:181:0x0293  */
        /* JADX WARN: Code duplicated, block: B:183:0x0297  */
        /* JADX WARN: Code duplicated, block: B:186:0x029c  */
        /* JADX WARN: Code duplicated, block: B:188:0x02a0  */
        /* JADX WARN: Code duplicated, block: B:189:0x02a6  */
        /* JADX WARN: Code duplicated, block: B:191:0x02b0  */
        /* JADX WARN: Code duplicated, block: B:193:0x02b4  */
        /* JADX WARN: Code duplicated, block: B:196:0x02b9  */
        /* JADX WARN: Code duplicated, block: B:198:0x02bd  */
        /* JADX WARN: Code duplicated, block: B:199:0x02c3  */
        /* JADX WARN: Code duplicated, block: B:201:0x02cd  */
        /* JADX WARN: Code duplicated, block: B:203:0x02d1  */
        /* JADX WARN: Code duplicated, block: B:204:0x02d5  */
        /* JADX WARN: Code duplicated, block: B:209:0x02e3  */
        /* JADX WARN: Code duplicated, block: B:211:0x02ed  */
        /* JADX WARN: Code duplicated, block: B:213:0x02f1  */
        /* JADX WARN: Code duplicated, block: B:216:0x02f6  */
        /* JADX WARN: Code duplicated, block: B:218:0x02fa  */
        /* JADX WARN: Code duplicated, block: B:219:0x0300  */
        /* JADX WARN: Code duplicated, block: B:221:0x030a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:222:0x030c  */
        /* JADX WARN: Code duplicated, block: B:223:0x0312 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:224:0x0314  */
        /* JADX WARN: Code duplicated, block: B:229:0x031d  */
        /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:89:0x0164  */
        /* JADX WARN: Code duplicated, block: B:91:0x016a  */
        /* JADX WARN: Code duplicated, block: B:92:0x016f  */
        /* JADX WARN: Code duplicated, block: B:95:0x017e  */
        /* JADX WARN: Code duplicated, block: B:97:0x0182  */
        /* JADX WARN: Code duplicated, block: B:98:0x0186  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var;
            BOConfigParam bOConfigParam;
            Integer num;
            Object objJ;
            wwd0 wwd0Var2;
            BOConfigParam bOConfigParam2;
            Integer num2;
            Object objJ2;
            Integer intOrNull;
            BOConfigValueBundle bOConfigValueBundle;
            wwd0 wwd0Var3;
            BOConfigParam bOConfigParam3;
            Double d;
            Object objJ3;
            Double d2;
            BOConfigValueWrapper response;
            Object configValue;
            dq7 dq7VarA;
            Integer intOrNull2;
            BOConfigValueBundle bOConfigValueBundle2;
            BOConfigValueWrapper response2;
            Object configValue2;
            dq7 dq7VarA2;
            Double dH;
            Double d3;
            Object obj2;
            fj2 fj2Var = fj2.this;
            lq1 lq1Var = fj2Var.b;
            y5b y5bVar = y5b.a;
            int i = this.d;
            Class cls = Boolean.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Float.TYPE;
            Class cls4 = Long.TYPE;
            Class cls5 = Integer.TYPE;
            if (i == 0) {
                uj50.b(obj);
                wwd0Var = fj2Var.A;
                bOConfigParam = BOConfigParam.BetBuilderMinNumberOfSelections;
                num = new Integer(2);
                this.a = bOConfigParam;
                this.b = num;
                this.c = wwd0Var;
                this.d = 1;
                objJ = qq1.j(lq1Var, this);
                if (objJ != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                wwd0Var = this.c;
                Integer num3 = (Integer) this.b;
                bOConfigParam = this.a;
                uj50.b(obj);
                num = num3;
                objJ = obj;
            } else {
                if (i == 2) {
                    wwd0Var2 = this.c;
                    num2 = (Integer) this.b;
                    bOConfigParam2 = this.a;
                    uj50.b(obj);
                    objJ2 = obj;
                    bOConfigValueBundle = (BOConfigValueBundle) objJ2;
                    if (bOConfigValueBundle != null) {
                        response = bOConfigValueBundle.getResponse(bOConfigParam2);
                        if (response != null) {
                            configValue = response.getConfigValue();
                        } else {
                            configValue = null;
                        }
                        dq7VarA = jq40.a(Integer.class);
                        if (dq7VarA.equals(jq40.a(cls5))) {
                            if (configValue instanceof Integer) {
                                intOrNull2 = (Integer) configValue;
                            } else if ((configValue instanceof String) || (intOrNull2 = StringsKt.toIntOrNull((String) configValue)) == null) {
                                intOrNull2 = null;
                            }
                        } else if (dq7VarA.equals(jq40.a(cls4))) {
                            if (configValue instanceof Long) {
                                if (!(configValue instanceof Integer)) {
                                    configValue = null;
                                }
                                intOrNull2 = (Integer) configValue;
                            } else {
                                if (configValue instanceof String) {
                                    StringsKt.s0((String) configValue);
                                }
                                intOrNull2 = null;
                            }
                        } else if (dq7VarA.equals(jq40.a(cls3))) {
                            if (configValue instanceof Float) {
                                if (!(configValue instanceof Integer)) {
                                    configValue = null;
                                }
                                intOrNull2 = (Integer) configValue;
                            } else {
                                if (configValue instanceof String) {
                                    kotlin.text.b.i((String) configValue);
                                }
                                intOrNull2 = null;
                            }
                        } else if (dq7VarA.equals(jq40.a(cls2))) {
                            if (configValue instanceof Double) {
                                if (!(configValue instanceof Integer)) {
                                    configValue = null;
                                }
                                intOrNull2 = (Integer) configValue;
                            } else {
                                if (configValue instanceof String) {
                                    kotlin.text.b.h((String) configValue);
                                }
                                intOrNull2 = null;
                            }
                        } else if (dq7VarA.equals(jq40.a(cls))) {
                            if (dq7VarA.equals(jq40.a(String.class))) {
                                if (configValue != null) {
                                    configValue.toString();
                                }
                            } else if (configValue != null) {
                                if (!(configValue instanceof Integer)) {
                                    configValue = null;
                                }
                                intOrNull2 = (Integer) configValue;
                            }
                            intOrNull2 = null;
                        } else if (configValue instanceof Boolean) {
                            if (!(configValue instanceof Integer)) {
                                configValue = null;
                            }
                            intOrNull2 = (Integer) configValue;
                        } else {
                            if (configValue instanceof String) {
                                StringsKt.r0((String) configValue);
                            }
                            intOrNull2 = null;
                        }
                        if (intOrNull2 != null) {
                            num2 = intOrNull2;
                        }
                    }
                    wwd0Var2.setValue(num2);
                    wwd0Var3 = fj2Var.C;
                    bOConfigParam3 = BOConfigParam.BetBuilderMaxOdds;
                    d = new Double(Double.MAX_VALUE);
                    this.a = bOConfigParam3;
                    this.b = d;
                    this.c = wwd0Var3;
                    this.d = 3;
                    objJ3 = qq1.j(lq1Var, this);
                    if (objJ3 != y5bVar) {
                        d2 = d;
                    }
                    return y5bVar;
                }
                if (i != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var3 = this.c;
                d2 = (Double) this.b;
                BOConfigParam bOConfigParam4 = this.a;
                uj50.b(obj);
                bOConfigParam3 = bOConfigParam4;
                objJ3 = obj;
            }
            bOConfigValueBundle2 = (BOConfigValueBundle) objJ3;
            if (bOConfigValueBundle2 != null) {
                response2 = bOConfigValueBundle2.getResponse(bOConfigParam3);
                if (response2 != null) {
                    configValue2 = response2.getConfigValue();
                } else {
                    configValue2 = null;
                }
                dq7VarA2 = jq40.a(Double.class);
                if (dq7VarA2.equals(jq40.a(cls5))) {
                    if (configValue2 instanceof Integer) {
                        if (configValue2 instanceof Double) {
                            obj2 = configValue2;
                        } else {
                            obj2 = null;
                        }
                        d3 = (Double) obj2;
                    } else {
                        if (configValue2 instanceof String) {
                            StringsKt.toIntOrNull((String) configValue2);
                        }
                        d3 = null;
                    }
                } else if (dq7VarA2.equals(jq40.a(cls4))) {
                    if (configValue2 instanceof Long) {
                        if (configValue2 instanceof Double) {
                            obj2 = configValue2;
                        } else {
                            obj2 = null;
                        }
                        d3 = (Double) obj2;
                    } else {
                        if (configValue2 instanceof String) {
                            StringsKt.s0((String) configValue2);
                        }
                        d3 = null;
                    }
                } else if (dq7VarA2.equals(jq40.a(cls3))) {
                    if (dq7VarA2.equals(jq40.a(cls2))) {
                        if (configValue2 instanceof Double) {
                            d3 = (Double) configValue2;
                        } else if (!(configValue2 instanceof String) && (dH = kotlin.text.b.h((String) configValue2)) != null) {
                            d3 = dH;
                        }
                    } else if (dq7VarA2.equals(jq40.a(cls))) {
                        if (configValue2 instanceof Boolean) {
                            if (configValue2 instanceof Double) {
                                obj2 = configValue2;
                            } else {
                                obj2 = null;
                            }
                            d3 = (Double) obj2;
                        } else if (configValue2 instanceof String) {
                            StringsKt.r0((String) configValue2);
                        }
                    } else if (dq7VarA2.equals(jq40.a(String.class))) {
                        if (configValue2 != null) {
                            configValue2.toString();
                        }
                    } else if (configValue2 != null) {
                        if (configValue2 instanceof Double) {
                            obj2 = configValue2;
                        } else {
                            obj2 = null;
                        }
                        d3 = (Double) obj2;
                    }
                    d3 = null;
                } else if (configValue2 instanceof Float) {
                    if (configValue2 instanceof Double) {
                        obj2 = configValue2;
                    } else {
                        obj2 = null;
                    }
                    d3 = (Double) obj2;
                } else {
                    if (configValue2 instanceof String) {
                        kotlin.text.b.i((String) configValue2);
                    }
                    d3 = null;
                }
                if (d3 != null) {
                    d2 = d3;
                }
            }
            wwd0Var3.setValue(d2);
            return Unit.a;
            BOConfigValueBundle bOConfigValueBundle3 = (BOConfigValueBundle) objJ;
            if (bOConfigValueBundle3 != null) {
                BOConfigValueWrapper response3 = bOConfigValueBundle3.getResponse(bOConfigParam);
                Object configValue3 = response3 != null ? response3.getConfigValue() : null;
                dq7 dq7VarA3 = jq40.a(Integer.class);
                if (dq7VarA3.equals(jq40.a(cls5))) {
                    if (configValue3 instanceof Integer) {
                        intOrNull = (Integer) configValue3;
                    } else if (!(configValue3 instanceof String) || (intOrNull = StringsKt.toIntOrNull((String) configValue3)) == null) {
                        intOrNull = null;
                    }
                } else if (dq7VarA3.equals(jq40.a(cls4))) {
                    if (configValue3 instanceof Long) {
                        if (!(configValue3 instanceof Integer)) {
                            configValue3 = null;
                        }
                        intOrNull = (Integer) configValue3;
                    } else {
                        if (configValue3 instanceof String) {
                            StringsKt.s0((String) configValue3);
                        }
                        intOrNull = null;
                    }
                } else if (dq7VarA3.equals(jq40.a(cls3))) {
                    if (configValue3 instanceof Float) {
                        if (!(configValue3 instanceof Integer)) {
                            configValue3 = null;
                        }
                        intOrNull = (Integer) configValue3;
                    } else {
                        if (configValue3 instanceof String) {
                            kotlin.text.b.i((String) configValue3);
                        }
                        intOrNull = null;
                    }
                } else if (dq7VarA3.equals(jq40.a(cls2))) {
                    if (configValue3 instanceof Double) {
                        if (!(configValue3 instanceof Integer)) {
                            configValue3 = null;
                        }
                        intOrNull = (Integer) configValue3;
                    } else {
                        if (configValue3 instanceof String) {
                            kotlin.text.b.h((String) configValue3);
                        }
                        intOrNull = null;
                    }
                } else if (!dq7VarA3.equals(jq40.a(cls))) {
                    if (dq7VarA3.equals(jq40.a(String.class))) {
                        if (configValue3 != null) {
                            configValue3.toString();
                        }
                    } else if (configValue3 != null) {
                        if (!(configValue3 instanceof Integer)) {
                            configValue3 = null;
                        }
                        intOrNull = (Integer) configValue3;
                    }
                    intOrNull = null;
                } else if (configValue3 instanceof Boolean) {
                    if (!(configValue3 instanceof Integer)) {
                        configValue3 = null;
                    }
                    intOrNull = (Integer) configValue3;
                } else {
                    if (configValue3 instanceof String) {
                        StringsKt.r0((String) configValue3);
                    }
                    intOrNull = null;
                }
                if (intOrNull != null) {
                    num = intOrNull;
                }
            }
            wwd0Var.setValue(num);
            wwd0Var2 = fj2Var.B;
            bOConfigParam2 = BOConfigParam.BetBuilderMaxSelectionsLimit;
            num2 = new Integer(Reader.READ_DONE);
            this.a = bOConfigParam2;
            this.b = num2;
            this.c = wwd0Var2;
            this.d = 2;
            objJ2 = qq1.j(lq1Var, this);
            if (objJ2 != y5bVar) {
                bOConfigValueBundle = (BOConfigValueBundle) objJ2;
                if (bOConfigValueBundle != null) {
                    response = bOConfigValueBundle.getResponse(bOConfigParam2);
                    if (response != null) {
                        configValue = response.getConfigValue();
                    } else {
                        configValue = null;
                    }
                    dq7VarA = jq40.a(Integer.class);
                    if (dq7VarA.equals(jq40.a(cls5))) {
                        if (configValue instanceof Integer) {
                            intOrNull2 = (Integer) configValue;
                        } else if (configValue instanceof String) {
                            intOrNull2 = null;
                        } else {
                            intOrNull2 = null;
                        }
                    } else if (dq7VarA.equals(jq40.a(cls4))) {
                        if (configValue instanceof Long) {
                            if (!(configValue instanceof Integer)) {
                                configValue = null;
                            }
                            intOrNull2 = (Integer) configValue;
                        } else {
                            if (configValue instanceof String) {
                                StringsKt.s0((String) configValue);
                            }
                            intOrNull2 = null;
                        }
                    } else if (dq7VarA.equals(jq40.a(cls3))) {
                        if (configValue instanceof Float) {
                            if (!(configValue instanceof Integer)) {
                                configValue = null;
                            }
                            intOrNull2 = (Integer) configValue;
                        } else {
                            if (configValue instanceof String) {
                                kotlin.text.b.i((String) configValue);
                            }
                            intOrNull2 = null;
                        }
                    } else if (dq7VarA.equals(jq40.a(cls2))) {
                        if (configValue instanceof Double) {
                            if (!(configValue instanceof Integer)) {
                                configValue = null;
                            }
                            intOrNull2 = (Integer) configValue;
                        } else {
                            if (configValue instanceof String) {
                                kotlin.text.b.h((String) configValue);
                            }
                            intOrNull2 = null;
                        }
                    } else if (dq7VarA.equals(jq40.a(cls))) {
                        if (dq7VarA.equals(jq40.a(String.class))) {
                            if (configValue != null) {
                                configValue.toString();
                            }
                        } else if (configValue != null) {
                            if (!(configValue instanceof Integer)) {
                                configValue = null;
                            }
                            intOrNull2 = (Integer) configValue;
                        }
                        intOrNull2 = null;
                    } else if (configValue instanceof Boolean) {
                        if (!(configValue instanceof Integer)) {
                            configValue = null;
                        }
                        intOrNull2 = (Integer) configValue;
                    } else {
                        if (configValue instanceof String) {
                            StringsKt.r0((String) configValue);
                        }
                        intOrNull2 = null;
                    }
                    if (intOrNull2 != null) {
                        num2 = intOrNull2;
                    }
                }
                wwd0Var2.setValue(num2);
                wwd0Var3 = fj2Var.C;
                bOConfigParam3 = BOConfigParam.BetBuilderMaxOdds;
                d = new Double(Double.MAX_VALUE);
                this.a = bOConfigParam3;
                this.b = d;
                this.c = wwd0Var3;
                this.d = 3;
                objJ3 = qq1.j(lq1Var, this);
                if (objJ3 != y5bVar) {
                    d2 = d;
                    bOConfigValueBundle2 = (BOConfigValueBundle) objJ3;
                    if (bOConfigValueBundle2 != null) {
                        response2 = bOConfigValueBundle2.getResponse(bOConfigParam3);
                        if (response2 != null) {
                            configValue2 = response2.getConfigValue();
                        } else {
                            configValue2 = null;
                        }
                        dq7VarA2 = jq40.a(Double.class);
                        if (dq7VarA2.equals(jq40.a(cls5))) {
                            if (configValue2 instanceof Integer) {
                                if (configValue2 instanceof Double) {
                                    obj2 = null;
                                } else {
                                    obj2 = configValue2;
                                }
                                d3 = (Double) obj2;
                            } else {
                                if (configValue2 instanceof String) {
                                    StringsKt.toIntOrNull((String) configValue2);
                                }
                                d3 = null;
                            }
                        } else if (dq7VarA2.equals(jq40.a(cls4))) {
                            if (configValue2 instanceof Long) {
                                if (configValue2 instanceof Double) {
                                    obj2 = null;
                                } else {
                                    obj2 = configValue2;
                                }
                                d3 = (Double) obj2;
                            } else {
                                if (configValue2 instanceof String) {
                                    StringsKt.s0((String) configValue2);
                                }
                                d3 = null;
                            }
                        } else if (dq7VarA2.equals(jq40.a(cls3))) {
                            if (dq7VarA2.equals(jq40.a(cls2))) {
                                if (configValue2 instanceof Double) {
                                    d3 = (Double) configValue2;
                                } else if (!(configValue2 instanceof String)) {
                                }
                            } else if (dq7VarA2.equals(jq40.a(cls))) {
                                if (configValue2 instanceof Boolean) {
                                    if (configValue2 instanceof Double) {
                                        obj2 = null;
                                    } else {
                                        obj2 = configValue2;
                                    }
                                    d3 = (Double) obj2;
                                } else if (configValue2 instanceof String) {
                                    StringsKt.r0((String) configValue2);
                                }
                            } else if (dq7VarA2.equals(jq40.a(String.class))) {
                                if (configValue2 != null) {
                                    configValue2.toString();
                                }
                            } else if (configValue2 != null) {
                                if (configValue2 instanceof Double) {
                                    obj2 = null;
                                } else {
                                    obj2 = configValue2;
                                }
                                d3 = (Double) obj2;
                            }
                            d3 = null;
                        } else if (configValue2 instanceof Float) {
                            if (configValue2 instanceof Double) {
                                obj2 = null;
                            } else {
                                obj2 = configValue2;
                            }
                            d3 = (Double) obj2;
                        } else {
                            if (configValue2 instanceof String) {
                                kotlin.text.b.i((String) configValue2);
                            }
                            d3 = null;
                        }
                        if (d3 != null) {
                            d2 = d3;
                        }
                    }
                    wwd0Var3.setValue(d2);
                    return Unit.a;
                }
            }
            return y5bVar;
        }
    }

    public static final class b implements lyh<Throwable> {
        public final /* synthetic */ v340 a;
        public final /* synthetic */ fj2 b;

        @c0d(c = "com.sporty.android.book.presentation.betbuilder.BetBuilderViewModel$special$$inlined$map$1", f = "BetBuilderViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: fj2$b$b, reason: collision with other inner class name */
        public static final class C0569b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ fj2 b;

            /* JADX INFO: renamed from: fj2$b$b$a */
            @c0d(c = "com.sporty.android.book.presentation.betbuilder.BetBuilderViewModel$special$$inlined$map$1$2", f = "BetBuilderViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0569b.this.emit(null, this);
                }
            }

            public C0569b(myh myhVar, fj2 fj2Var) {
                this.a = myhVar;
                this.b = fj2Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                fj2 fj2Var = this.b;
                wwd0 wwd0Var = fj2Var.C;
                wwd0 wwd0Var2 = fj2Var.B;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                Throwable error = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    UIState uIState = (UIState) obj;
                    boolean z = uIState instanceof UIState.Success;
                    if (z && ((List) fj2Var.z.getValue()).size() > ((Number) wwd0Var2.getValue()).intValue()) {
                        error = new BetBuilderError(String.valueOf(((Number) wwd0Var2.getValue()).intValue()), BetBuilderError.SELECTIONS_LIMIT_EXCEEDED);
                    } else if (z && ((BetBuilderData) ((UIState.Success) uIState).getData()).getOddsDouble() > ((Number) wwd0Var.getValue()).doubleValue()) {
                        error = new BetBuilderError(gky.a.a(bjb0.a0(((Number) wwd0Var.getValue()).doubleValue(), Locale.US), false), BetBuilderError.ODDS_LIMIT_EXCEEDED);
                    } else if (uIState instanceof UIState.Error) {
                        error = ((UIState.Error) uIState).getError();
                    }
                    aVar.b = 1;
                    if (this.a.emit(error, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public b(v340 v340Var, fj2 fj2Var) {
            this.a = v340Var;
            this.b = fj2Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Throwable> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                C0569b c0569b = new C0569b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.a.collect(c0569b, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public fj2(kt5 kt5Var, lq1 lq1Var) {
        lq1Var.getClass();
        this.a = kt5Var;
        this.b = lq1Var;
        this.c = m.b(Boolean.FALSE);
        wwd0 wwd0VarA = xwd0.a(UIState.Idle.INSTANCE);
        this.d = wwd0VarA;
        v340 v340VarB = e1i.b(wwd0VarA);
        this.e = v340VarB;
        ssw<List<SimpleMarket>> sswVar = new ssw<>(new ArrayList());
        this.f = sswVar;
        this.i = sswVar;
        vu90<BetBuilderDataWSelections> vu90Var = new vu90<>();
        this.v = vu90Var;
        this.w = vu90Var;
        b bVar = new b(v340VarB, this);
        pfd pfdVar = fse.a;
        this.y = i2i.c(bVar, gku.a, 2);
        this.z = xwd0.a(m2g.a);
        this.A = xwd0.a(2);
        this.B = xwd0.a(Integer.valueOf(Reader.READ_DONE));
        this.C = xwd0.a(Double.valueOf(Double.MAX_VALUE));
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.F = new HashMap<>(o2gVar);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.F.clear();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    public final void x1(Boolean bool, ArrayList arrayList) {
        BetBuilderData betBuilderData;
        BigDecimal oddsDecimal;
        Event event;
        String eventId;
        Outcome outcome;
        String odds;
        wwd0 wwd0Var = this.z;
        wwd0Var.getClass();
        wwd0Var.k(null, arrayList);
        jvd0 jvd0Var = this.D;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        wwd0 wwd0Var2 = this.d;
        if (zIsEmpty) {
            wwd0Var2.setValue(UIState.Idle.INSTANCE);
            this.f.m(m2g.a);
            ((x5a0) this.c).setValue(Boolean.FALSE);
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q("BetBuilder");
        int i = 0;
        aVar.a("Calculating odds... - push changes:" + bool, new Object[0]);
        if (arrayList.size() == 2) {
            Selection selection = (Selection) CollectionsKt.firstOrNull(arrayList);
            if (selection == null || (outcome = selection.getOutcome()) == null || (odds = outcome.getOdds()) == null) {
                oddsDecimal = null;
            } else {
                oddsDecimal = kotlin.text.b.g(odds);
            }
        } else {
            Object value = wwd0Var2.getValue();
            UIState.Success success = value instanceof UIState.Success ? (UIState.Success) value : null;
            if (success == null || (betBuilderData = (BetBuilderData) success.getData()) == null) {
                oddsDecimal = null;
            } else {
                oddsDecimal = betBuilderData.getOddsDecimal();
            }
        }
        Selection selection2 = (Selection) CollectionsKt.firstOrNull(arrayList);
        if (selection2 == null || (event = selection2.getEvent()) == null || (eventId = event.getEventId()) == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Selection selection3 = (Selection) obj;
            selection3.getClass();
            arrayList2.add(new BetBuilderSelection(selection3.getUniqueId(), selection3.getOutcome().getOdds(), selection3.getOutcome().getProbability()));
        }
        kt5 kt5Var = this.a;
        kt5Var.getClass();
        this.D = kzh.d(new wzh(new yzh(new g1i(new xzh(ozh.c(kt5Var.a.l(eventId, arrayList2, oddsDecimal), kt5Var.b), new gj2(this, null)), new hj2(this, arrayList, bool, null)), new ij2(this, null)), new jj2(this, arrayList, null)), o8i0.d(this));
    }

    public final void y1(final ArrayList arrayList, final boolean z) {
        HashMap<List<Selection>, Function0<Unit>> map = this.F;
        if (map.containsKey(arrayList)) {
            return;
        }
        Function0<Unit> function0 = new Function0() { // from class: ej2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.a.x1(Boolean.valueOf(z), arrayList);
                return Unit.a;
            }
        };
        map.put(arrayList, function0);
        if (map.size() == 1) {
            jvd0 jvd0Var = this.D;
            if (jvd0Var == null || !jvd0Var.isActive()) {
                function0.invoke();
            }
        }
    }
}
