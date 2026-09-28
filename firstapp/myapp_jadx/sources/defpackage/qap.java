package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.eventdetails.NewBadgeEventDetailsValue;
import com.sporty.android.core.model.joker.JokerConfigApiModel;
import com.sporty.android.core.model.orders.BetTicketDetail;
import com.sporty.android.core.model.orders.BetTicketSelection;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.OutcomeEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final class qap {
    public final g3z a;
    public final z9p b;
    public final a1f0<x9p, Map<String, Pair<Outcome, String>>> c;
    public final lq1 d;

    public qap(g3z g3zVar, z9p z9pVar, a1f0<x9p, Map<String, Pair<Outcome, String>>> a1f0Var, lq1 lq1Var) {
        this.a = g3zVar;
        this.b = z9pVar;
        this.c = a1f0Var;
        this.d = lq1Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0179  */
    /* JADX WARN: Code duplicated, block: B:101:0x0180  */
    /* JADX WARN: Code duplicated, block: B:103:0x0192  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a2 A[LOOP:0: B:105:0x019c->B:107:0x01a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        map mapVar;
        qap qapVar;
        BOConfigParam bOConfigParam;
        String str2;
        Boolean boolR0;
        qap qapVar2;
        String str3;
        JokerConfigApiModel jokerConfigApiModel;
        int iA;
        LinkedHashMap linkedHashMap;
        Map<String, Pair<Outcome, String>> map;
        if (x1bVar instanceof map) {
            mapVar = (map) x1bVar;
            int i = mapVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapVar.i = i - Integer.MIN_VALUE;
            } else {
                mapVar = new map(this, x1bVar);
            }
        } else {
            mapVar = new map(this, x1bVar);
        }
        Object objW = mapVar.e;
        y5b y5bVar = y5b.a;
        int i2 = mapVar.i;
        if (i2 == 0) {
            uj50.b(objW);
            Map<String, Pair<Outcome, String>> mapA = this.c.a(new x9p(str));
            if (mapA != null) {
                return mapA;
            }
            BOConfigParam bOConfigParam2 = BOConfigParam.SportyJokerEnabled;
            mapVar.a = str;
            mapVar.b = this;
            mapVar.c = null;
            mapVar.d = bOConfigParam2;
            mapVar.i = 1;
            Object objJ = qq1.j(this.d, mapVar);
            if (objJ != y5bVar) {
                qapVar = this;
                bOConfigParam = bOConfigParam2;
                objW = objJ;
                str2 = str;
            }
            return y5bVar;
        }
        if (i2 == 1) {
            bOConfigParam = mapVar.d;
            qapVar = mapVar.b;
            str2 = mapVar.a;
            uj50.b(objW);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qapVar2 = mapVar.c;
            qapVar = mapVar.b;
            str3 = mapVar.a;
            uj50.b(objW);
        }
        jokerConfigApiModel = (JokerConfigApiModel) n52.b((BaseResponse) objW);
        qapVar2.getClass();
        if (jokerConfigApiModel.getEnabled()) {
            List<JokerConfigApiModel.EligibleMarkets> eligibleMarkets = jokerConfigApiModel.getEligibleMarkets();
            iA = jpu.a(l48.r(eligibleMarkets, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (JokerConfigApiModel.EligibleMarkets eligibleMarkets2 : eligibleMarkets) {
                String marketId = eligibleMarkets2.getMarketId();
                Outcome outcome = new Outcome();
                outcome.id = OutcomeEnum.Joker.getId();
                outcome.odds = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(((double) eligibleMarkets2.getNumberOfOutcomes()) / jokerConfigApiModel.getOddsKey())}, 1));
                outcome.probability = 1.0d / ((double) eligibleMarkets2.getNumberOfOutcomes());
                outcome.desc = "Joker";
                linkedHashMap.put(marketId, new Pair(outcome, eligibleMarkets2.getExcludeSpecifierRegex()));
            }
            map = linkedHashMap;
        } else {
            map = o2g.a;
            map.getClass();
        }
        qapVar.c.b(new x9p(str3), map);
        return map;
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) objW;
        if (bOConfigValueBundle == null) {
            boolR0 = null;
        } else {
            BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(Boolean.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (!(configValue instanceof Boolean)) {
                        configValue = null;
                    }
                    boolR0 = (Boolean) configValue;
                } else {
                    if (configValue instanceof String) {
                        StringsKt.toIntOrNull((String) configValue);
                    }
                    boolR0 = null;
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (!(configValue instanceof Boolean)) {
                        configValue = null;
                    }
                    boolR0 = (Boolean) configValue;
                } else {
                    if (configValue instanceof String) {
                        StringsKt.s0((String) configValue);
                    }
                    boolR0 = null;
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (!(configValue instanceof Boolean)) {
                        configValue = null;
                    }
                    boolR0 = (Boolean) configValue;
                } else {
                    if (configValue instanceof String) {
                        b.i((String) configValue);
                    }
                    boolR0 = null;
                }
            } else if (!dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                    if (configValue instanceof Boolean) {
                        boolR0 = (Boolean) configValue;
                    } else if (!(configValue instanceof String) || (boolR0 = StringsKt.r0((String) configValue)) == null) {
                    }
                } else if (dq7VarA.equals(jq40.a(String.class))) {
                    if (configValue != null) {
                        configValue.toString();
                    }
                } else if (configValue != null) {
                    if (!(configValue instanceof Boolean)) {
                        configValue = null;
                    }
                    boolR0 = (Boolean) configValue;
                }
                boolR0 = null;
            } else if (configValue instanceof Double) {
                if (!(configValue instanceof Boolean)) {
                    configValue = null;
                }
                boolR0 = (Boolean) configValue;
            } else {
                if (configValue instanceof String) {
                    b.h((String) configValue);
                }
                boolR0 = null;
            }
        }
        if (boolR0 != null) {
            if (!boolR0.booleanValue()) {
                boolR0 = null;
            }
            if (boolR0 != null) {
                g3z g3zVar = qapVar.a;
                mapVar.a = str2;
                mapVar.b = qapVar;
                mapVar.c = qapVar;
                mapVar.d = null;
                mapVar.i = 2;
                objW = g3zVar.w(str2, mapVar);
                if (objW != y5bVar) {
                    qapVar2 = qapVar;
                    str3 = str2;
                    jokerConfigApiModel = (JokerConfigApiModel) n52.b((BaseResponse) objW);
                    qapVar2.getClass();
                    if (jokerConfigApiModel.getEnabled()) {
                        map = o2g.a;
                        map.getClass();
                    } else {
                        List<JokerConfigApiModel.EligibleMarkets> eligibleMarkets3 = jokerConfigApiModel.getEligibleMarkets();
                        iA = jpu.a(l48.r(eligibleMarkets3, 10));
                        if (iA < 16) {
                            iA = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iA);
                        while (r13.hasNext()) {
                            String marketId2 = eligibleMarkets2.getMarketId();
                            Outcome outcome2 = new Outcome();
                            outcome2.id = OutcomeEnum.Joker.getId();
                            outcome2.odds = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(((double) eligibleMarkets2.getNumberOfOutcomes()) / jokerConfigApiModel.getOddsKey())}, 1));
                            outcome2.probability = 1.0d / ((double) eligibleMarkets2.getNumberOfOutcomes());
                            outcome2.desc = "Joker";
                            linkedHashMap.put(marketId2, new Pair(outcome2, eligibleMarkets2.getExcludeSpecifierRegex()));
                        }
                        map = linkedHashMap;
                    }
                    qapVar.c.b(new x9p(str3), map);
                    return map;
                }
                return y5bVar;
            }
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return o2gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(String str, x1b x1bVar) {
        nap napVar;
        if (x1bVar instanceof nap) {
            napVar = (nap) x1bVar;
            int i = napVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                napVar.c = i - Integer.MIN_VALUE;
            } else {
                napVar = new nap(this, x1bVar);
            }
        } else {
            napVar = new nap(this, x1bVar);
        }
        Object objB = napVar.a;
        y5b y5bVar = y5b.a;
        int i2 = napVar.c;
        if (i2 == 0) {
            uj50.b(objB);
            napVar.c = 1;
            objB = this.a.b(str, napVar);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objB);
        }
        List<BetTicketSelection> selections = ((BetTicketDetail) n52.b((BaseResponse) objB)).getSelections();
        if (selections == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(selections, 10));
        Iterator<T> it = selections.iterator();
        while (it.hasNext()) {
            arrayList.add(yc3.b((BetTicketSelection) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(x1b x1bVar) {
        oap oapVar;
        if (x1bVar instanceof oap) {
            oapVar = (oap) x1bVar;
            int i = oapVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oapVar.c = i - Integer.MIN_VALUE;
            } else {
                oapVar = new oap(this, x1bVar);
            }
        } else {
            oapVar = new oap(this, x1bVar);
        }
        Object objF = oapVar.a;
        y5b y5bVar = y5b.a;
        int i2 = oapVar.c;
        if (i2 == 0) {
            uj50.b(objF);
            z9p z9pVar = this.b;
            wm20 wm20VarA = z9pVar.b.a(z9pVar, z9p.c[0]);
            oapVar.c = 1;
            objF = wm20VarA.f(oapVar);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        Boolean bool = (Boolean) objF;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(x1b x1bVar) {
        pap papVar;
        BOConfigParam bOConfigParam;
        if (x1bVar instanceof pap) {
            papVar = (pap) x1bVar;
            int i = papVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                papVar.d = i - Integer.MIN_VALUE;
            } else {
                papVar = new pap(this, x1bVar);
            }
        } else {
            papVar = new pap(this, x1bVar);
        }
        Object obj = papVar.b;
        y5b y5bVar = y5b.a;
        int i2 = papVar.d;
        NewBadgeEventDetailsValue newBadgeEventDetailsValue = null;
        obj = null;
        newBadgeEventDetailsValue = null;
        newBadgeEventDetailsValue = null;
        obj = null;
        newBadgeEventDetailsValue = null;
        newBadgeEventDetailsValue = null;
        obj = null;
        newBadgeEventDetailsValue = null;
        newBadgeEventDetailsValue = null;
        obj = null;
        newBadgeEventDetailsValue = null;
        newBadgeEventDetailsValue = null;
        obj = null;
        newBadgeEventDetailsValue = null;
        newBadgeEventDetailsValue = null;
        newBadgeEventDetailsValue = null;
        newBadgeEventDetailsValue = null;
        Object obj2 = null;
        newBadgeEventDetailsValue = null;
        if (i2 == 0) {
            uj50.b(obj);
            BOConfigParam bOConfigParam2 = BOConfigParam.NewBadgeEventDetails;
            papVar.a = bOConfigParam2;
            papVar.d = 1;
            Object objJ = qq1.j(this.d, papVar);
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
            bOConfigParam = papVar.a;
            uj50.b(obj);
        }
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        if (bOConfigValueBundle != null) {
            BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(NewBadgeEventDetailsValue.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof NewBadgeEventDetailsValue) {
                        obj2 = configValue;
                    }
                    newBadgeEventDetailsValue = (NewBadgeEventDetailsValue) obj2;
                } else if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof NewBadgeEventDetailsValue) {
                        obj2 = configValue;
                    }
                    newBadgeEventDetailsValue = (NewBadgeEventDetailsValue) obj2;
                } else if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof NewBadgeEventDetailsValue) {
                        obj2 = configValue;
                    }
                    newBadgeEventDetailsValue = (NewBadgeEventDetailsValue) obj2;
                } else if (configValue instanceof String) {
                    b.i((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof NewBadgeEventDetailsValue) {
                        obj2 = configValue;
                    }
                    newBadgeEventDetailsValue = (NewBadgeEventDetailsValue) obj2;
                } else if (configValue instanceof String) {
                    b.h((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof NewBadgeEventDetailsValue) {
                        obj2 = configValue;
                    }
                    newBadgeEventDetailsValue = (NewBadgeEventDetailsValue) obj2;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (configValue instanceof NewBadgeEventDetailsValue) {
                    obj2 = configValue;
                }
                newBadgeEventDetailsValue = (NewBadgeEventDetailsValue) obj2;
            }
        }
        return Boolean.valueOf(newBadgeEventDetailsValue != null ? newBadgeEventDetailsValue.getSportyJokerNewBadgeVisibility() : false);
    }
}
