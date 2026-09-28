package defpackage;

import android.text.TextUtils;
import com.sporty.android.core.model.config.BoreDrawItem;
import com.sporty.android.core.model.config.BoreDrawSelectionEligibilityDto;
import com.sporty.android.core.model.config.BoreDrawSport;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.RTicket;
import com.sportybet.plugin.realsports.data.RemixBet;
import com.sportybet.plugin.realsports.data.UserNote;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lds30;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ds30 extends j8i0 {
    public final ssw A;
    public final ssw<Boolean> B;
    public final ssw C;
    public RTicket D;
    public boolean E;
    public final h940 a;
    public final lyz b;
    public final lq1 c;
    public final t8d0 d;
    public final at2 e;
    public final h450 f;
    public final xrc i;
    public final mpe0 v;
    public final ssw<lk50<jqf0>> w;
    public final ssw y;
    public final ssw<Boolean> z;

    public ds30(h940 h940Var, lyz lyzVar, lq1 lq1Var, t8d0 t8d0Var, at2 at2Var, h450 h450Var, xrc xrcVar) {
        h940Var.getClass();
        lyzVar.getClass();
        lq1Var.getClass();
        t8d0Var.getClass();
        at2Var.getClass();
        xrcVar.getClass();
        this.a = h940Var;
        this.b = lyzVar;
        this.c = lq1Var;
        this.d = t8d0Var;
        this.e = at2Var;
        this.f = h450Var;
        this.i = xrcVar;
        this.v = hwr.b(new vr30(0));
        ssw<lk50<jqf0>> sswVar = new ssw<>(lk50.b.a);
        this.w = sswVar;
        this.y = sswVar;
        ssw<Boolean> sswVar2 = new ssw<>();
        this.z = sswVar2;
        this.A = sswVar2;
        ssw<Boolean> sswVar3 = new ssw<>();
        this.B = sswVar3;
        this.C = sswVar3;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:153:0x030c A[LOOP:0: B:151:0x0306->B:153:0x030c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x0358  */
    /* JADX WARN: Code duplicated, block: B:158:0x035d  */
    /* JADX WARN: Code duplicated, block: B:161:0x036f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0373  */
    /* JADX WARN: Code duplicated, block: B:165:0x0377  */
    /* JADX WARN: Code duplicated, block: B:167:0x037d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0381  */
    /* JADX WARN: Code duplicated, block: B:171:0x038a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0394  */
    /* JADX WARN: Code duplicated, block: B:175:0x0398  */
    /* JADX WARN: Code duplicated, block: B:178:0x039d  */
    /* JADX WARN: Code duplicated, block: B:180:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:183:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:190:0x03be  */
    /* JADX WARN: Code duplicated, block: B:191:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:193:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:198:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:200:0x03db  */
    /* JADX WARN: Code duplicated, block: B:201:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:203:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:208:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:210:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:211:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:213:0x0408 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x040a  */
    /* JADX WARN: Code duplicated, block: B:215:0x0410 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:216:0x0412  */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object x1(RTicket rTicket, List list, String str, boolean z, BOConfigValueBundle bOConfigValueBundle, x1b x1bVar) {
        wr30 wr30Var;
        ArrayList arrayListA;
        Class cls;
        Boolean boolR0;
        Class cls2;
        Class cls3;
        ArrayList arrayList;
        Object obj;
        int i;
        Long createTime;
        int i2;
        List<RSelection> list2;
        BOConfigValueWrapper response;
        Object configValue;
        dq7 dq7VarA;
        BoreDrawSelectionEligibilityDto boreDrawSelectionEligibilityDto;
        BoreDrawSport sport;
        ArrayList arrayList2;
        RTicket rTicket2 = rTicket;
        String str2 = str;
        boolean z2 = z;
        BOConfigValueBundle bOConfigValueBundle2 = bOConfigValueBundle;
        if (x1bVar instanceof wr30) {
            wr30Var = (wr30) x1bVar;
            int i3 = wr30Var.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wr30Var.y = i3 - Integer.MIN_VALUE;
            } else {
                wr30Var = new wr30(this, x1bVar);
            }
        } else {
            wr30Var = new wr30(this, x1bVar);
        }
        Object obj2 = wr30Var.v;
        y5b y5bVar = y5b.a;
        int i4 = wr30Var.y;
        Class cls4 = Boolean.TYPE;
        Class cls5 = Double.TYPE;
        Class cls6 = Float.TYPE;
        Class cls7 = Long.TYPE;
        Class cls8 = Integer.TYPE;
        boolean z3 = true;
        List<BoreDrawItem> items = null;
        if (i4 == 0) {
            arrayListA = j9f.a(obj2);
            BOConfigValueWrapper response2 = bOConfigValueBundle2.getResponse(BOConfigParam.OddsBoostCashoutable);
            Object configValue2 = response2 != null ? response2.getConfigValue() : null;
            dq7 dq7VarA2 = jq40.a(Boolean.class);
            cls = String.class;
            if (dq7VarA2.equals(jq40.a(cls8))) {
                if (configValue2 instanceof Integer) {
                    if (!(configValue2 instanceof Boolean)) {
                        configValue2 = null;
                    }
                    boolR0 = (Boolean) configValue2;
                } else {
                    if (configValue2 instanceof String) {
                        StringsKt.toIntOrNull((String) configValue2);
                    }
                    boolR0 = null;
                }
            } else if (dq7VarA2.equals(jq40.a(cls7))) {
                if (configValue2 instanceof Long) {
                    if (!(configValue2 instanceof Boolean)) {
                        configValue2 = null;
                    }
                    boolR0 = (Boolean) configValue2;
                } else {
                    if (configValue2 instanceof String) {
                        StringsKt.s0((String) configValue2);
                    }
                    boolR0 = null;
                }
            } else if (dq7VarA2.equals(jq40.a(cls6))) {
                if (configValue2 instanceof Float) {
                    if (!(configValue2 instanceof Boolean)) {
                        configValue2 = null;
                    }
                    boolR0 = (Boolean) configValue2;
                } else {
                    if (configValue2 instanceof String) {
                        b.i((String) configValue2);
                    }
                    boolR0 = null;
                }
            } else if (!dq7VarA2.equals(jq40.a(cls5))) {
                if (dq7VarA2.equals(jq40.a(cls4))) {
                    if (configValue2 instanceof Boolean) {
                        boolR0 = (Boolean) configValue2;
                    } else if (!(configValue2 instanceof String) || (boolR0 = StringsKt.r0((String) configValue2)) == null) {
                    }
                } else if (dq7VarA2.equals(jq40.a(cls))) {
                    if (configValue2 != null) {
                        configValue2.toString();
                    }
                } else if (configValue2 != null) {
                    if (!(configValue2 instanceof Boolean)) {
                        configValue2 = null;
                    }
                    boolR0 = (Boolean) configValue2;
                }
                boolR0 = null;
            } else if (configValue2 instanceof Double) {
                if (!(configValue2 instanceof Boolean)) {
                    configValue2 = null;
                }
                boolR0 = (Boolean) configValue2;
            } else {
                if (configValue2 instanceof String) {
                    b.h((String) configValue2);
                }
                boolR0 = null;
            }
            arrayListA.add(new du30(rTicket2, str2, boolR0 != null ? boolR0.booleanValue() : false));
            try {
                zi50.a aVar = zi50.b;
                String str3 = rTicket2.cashOutAmount;
                str3.getClass();
                if (Double.parseDouble(str3) > 0.0d) {
                    bu30 bu30Var = new bu30();
                    bu30Var.a = rTicket2.cashOutAmount;
                    bu30Var.c = rTicket2.remainPotentialWinnings;
                    bu30Var.b = rTicket2.remainStake;
                    bu30Var.d = rTicket2.usedStake;
                    bu30Var.f = rTicket2.hasTax();
                    bu30Var.e = rTicket2.remainTaxAmount;
                    arrayListA.add(bu30Var);
                }
                Unit unit = Unit.a;
            } catch (Throwable unused) {
                zi50.a aVar2 = zi50.b;
            }
            if (list.isEmpty()) {
                cls2 = cls5;
                cls3 = cls6;
            } else {
                List list3 = list;
                ArrayList arrayList3 = new ArrayList(l48.r(list3, 10));
                Iterator it = list3.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    nof nofVar = (nof) next;
                    int i7 = i5 == list3.size() + (-1) ? R.string.common_functions__original_bet : R.string.common_functions__edit_bet;
                    SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.v.getValue();
                    nof.a aVar3 = (nof.a) CollectionsKt.firstOrNull(nofVar.a());
                    Class cls9 = cls5;
                    Class cls10 = cls6;
                    long jLongValue = (aVar3 == null || (createTime = aVar3.getCreateTime()) == null) ? 0L : createTime.longValue();
                    Iterator it2 = it;
                    String str4 = simpleDateFormat.format(new Long(jLongValue));
                    str4.getClass();
                    arrayList3.add(new wpf(i7, str4, nofVar.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String()));
                    list3 = list;
                    i5 = i6;
                    it = it2;
                    cls5 = cls9;
                    cls6 = cls10;
                }
                cls2 = cls5;
                cls3 = cls6;
                zt30 zt30Var = new zt30();
                k48.a(zt30Var.a, arrayList3);
                arrayListA.add(zt30Var);
            }
            UserNote userNote = rTicket2.userNote;
            String str5 = rTicket2.orderId;
            str5.getClass();
            arrayListA.add(new su30(userNote, str5));
            if (z2 && rTicket2.isAllSelectionSettled() && ay0.V(new Integer[]{new Integer(20), new Integer(30), new Integer(40)}).contains(new Integer(rTicket2.winningStatus))) {
                int i8 = rTicket2.winningStatus == 20 ? 1 : 0;
                wr30Var.a = rTicket2;
                wr30Var.b = str2;
                wr30Var.c = bOConfigValueBundle2;
                wr30Var.d = arrayListA;
                wr30Var.e = arrayListA;
                wr30Var.f = z2;
                wr30Var.i = i8;
                z3 = true;
                wr30Var.y = 1;
                Object objA = this.f.a(wr30Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
                obj = objA;
                arrayList = arrayListA;
                i = i8;
            } else {
                arrayList = arrayListA;
            }
            if (z2 && rTicket2.isAllSelectionSettled()) {
                i2 = 20;
                if (rTicket2.winningStatus == 20) {
                    arrayList.add(new ru30(rTicket2, str2));
                }
            } else {
                i2 = 20;
            }
            if (rTicket2.isAllSelectionSettled() && rTicket2.winningStatus == i2) {
                arrayList.add(new tu30(rTicket2.verifyCode));
            }
            if (!rTicket2.isAllSelectionSettled() && !TextUtils.isEmpty(rTicket2.shareCode)) {
                arrayList.add(new pu30(rTicket2));
            }
            list2 = rTicket2.selections;
            if (list2 != null) {
                arrayList2 = new ArrayList(l48.r(list2, 10));
                for (RSelection rSelection : list2) {
                    cu30 cu30Var = new cu30();
                    cu30Var.a = rSelection;
                    cu30Var.d = rTicket2.hasPendingEvent;
                    arrayList2.add(cu30Var);
                }
                arrayList.addAll(arrayList2);
            }
            au30 au30Var = new au30();
            au30Var.a = rTicket2.betSize;
            au30Var.b = rTicket2.orderId;
            au30Var.c = rTicket2.shortId;
            au30Var.d = rTicket2.deviceCh;
            au30Var.e = rTicket2.deviceIp;
            au30Var.f = rTicket2.orderType;
            au30Var.g = rTicket2.isHistory;
            arrayList.add(au30Var);
            int i9 = rTicket2.winningStatus;
            String str6 = rTicket2.verifyCode;
            response = bOConfigValueBundle2.getResponse(BOConfigParam.BoreDrawSelectionEligibility);
            if (response != null) {
                configValue = response.getConfigValue();
            } else {
                configValue = null;
            }
            dq7VarA = jq40.a(BoreDrawSelectionEligibilityDto.class);
            if (dq7VarA.equals(jq40.a(cls8))) {
                if (configValue instanceof Integer) {
                    if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                        configValue = null;
                    }
                    boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
                } else {
                    if (configValue instanceof String) {
                        StringsKt.toIntOrNull((String) configValue);
                    }
                    boreDrawSelectionEligibilityDto = null;
                }
            } else if (dq7VarA.equals(jq40.a(cls7))) {
                if (configValue instanceof Long) {
                    if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                        configValue = null;
                    }
                    boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
                } else {
                    if (configValue instanceof String) {
                        StringsKt.s0((String) configValue);
                    }
                    boreDrawSelectionEligibilityDto = null;
                }
            } else if (dq7VarA.equals(jq40.a(cls3))) {
                if (configValue instanceof Float) {
                    if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                        configValue = null;
                    }
                    boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
                } else {
                    if (configValue instanceof String) {
                        b.i((String) configValue);
                    }
                    boreDrawSelectionEligibilityDto = null;
                }
            } else if (dq7VarA.equals(jq40.a(cls2))) {
                if (configValue instanceof Double) {
                    if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                        configValue = null;
                    }
                    boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
                } else {
                    if (configValue instanceof String) {
                        b.h((String) configValue);
                    }
                    boreDrawSelectionEligibilityDto = null;
                }
            } else if (dq7VarA.equals(jq40.a(cls4))) {
                if (dq7VarA.equals(jq40.a(cls))) {
                    if (configValue != null) {
                        configValue.toString();
                    }
                } else if (configValue != null) {
                    if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                        configValue = null;
                    }
                    boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
                }
                boreDrawSelectionEligibilityDto = null;
            } else if (configValue instanceof Boolean) {
                if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                    configValue = null;
                }
                boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
                boreDrawSelectionEligibilityDto = null;
            }
            if (boreDrawSelectionEligibilityDto != null && (sport = boreDrawSelectionEligibilityDto.getSport()) != null) {
                items = sport.getItems();
            }
            BoreDrawConfig boreDrawConfig = new BoreDrawConfig(items);
            String str7 = rTicket2.orderId;
            str7.getClass();
            return new jqf0(arrayList, i9, str6, boreDrawConfig, str7, rTicket2.userNote);
        }
        if (i4 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = wr30Var.i;
        boolean z4 = wr30Var.f;
        ArrayList arrayList4 = wr30Var.e;
        ArrayList arrayList5 = wr30Var.d;
        bOConfigValueBundle2 = wr30Var.c;
        String str8 = wr30Var.b;
        RTicket rTicket3 = wr30Var.a;
        uj50.b(obj2);
        z2 = z4;
        rTicket2 = rTicket3;
        arrayList = arrayList5;
        arrayListA = arrayList4;
        str2 = str8;
        obj = obj2;
        cls = String.class;
        cls4 = cls4;
        cls2 = cls5;
        cls3 = cls6;
        boolean zBooleanValue = ((Boolean) obj).booleanValue() ^ z3;
        int i10 = rTicket2.winningStatus;
        if (i == 0) {
            z3 = false;
        }
        arrayListA.add(new qu30(new RemixBet(z3, zBooleanValue, i10)));
        if (z2) {
            i2 = 20;
        } else {
            i2 = 20;
        }
        if (rTicket2.isAllSelectionSettled()) {
            arrayList.add(new tu30(rTicket2.verifyCode));
        }
        if (!rTicket2.isAllSelectionSettled()) {
            arrayList.add(new pu30(rTicket2));
        }
        list2 = rTicket2.selections;
        if (list2 != null) {
            arrayList2 = new ArrayList(l48.r(list2, 10));
            while (r0.hasNext()) {
                cu30 cu30Var2 = new cu30();
                cu30Var2.a = rSelection;
                cu30Var2.d = rTicket2.hasPendingEvent;
                arrayList2.add(cu30Var2);
            }
            arrayList.addAll(arrayList2);
        }
        au30 au30Var2 = new au30();
        au30Var2.a = rTicket2.betSize;
        au30Var2.b = rTicket2.orderId;
        au30Var2.c = rTicket2.shortId;
        au30Var2.d = rTicket2.deviceCh;
        au30Var2.e = rTicket2.deviceIp;
        au30Var2.f = rTicket2.orderType;
        au30Var2.g = rTicket2.isHistory;
        arrayList.add(au30Var2);
        int i11 = rTicket2.winningStatus;
        String str9 = rTicket2.verifyCode;
        response = bOConfigValueBundle2.getResponse(BOConfigParam.BoreDrawSelectionEligibility);
        if (response != null) {
            configValue = response.getConfigValue();
        } else {
            configValue = null;
        }
        dq7VarA = jq40.a(BoreDrawSelectionEligibilityDto.class);
        if (dq7VarA.equals(jq40.a(cls8))) {
            if (configValue instanceof Integer) {
                if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                    configValue = null;
                }
                boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
                boreDrawSelectionEligibilityDto = null;
            }
        } else if (dq7VarA.equals(jq40.a(cls7))) {
            if (configValue instanceof Long) {
                if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                    configValue = null;
                }
                boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
                boreDrawSelectionEligibilityDto = null;
            }
        } else if (dq7VarA.equals(jq40.a(cls3))) {
            if (configValue instanceof Float) {
                if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                    configValue = null;
                }
                boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
            } else {
                if (configValue instanceof String) {
                    b.i((String) configValue);
                }
                boreDrawSelectionEligibilityDto = null;
            }
        } else if (dq7VarA.equals(jq40.a(cls2))) {
            if (configValue instanceof Double) {
                if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                    configValue = null;
                }
                boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
            } else {
                if (configValue instanceof String) {
                    b.h((String) configValue);
                }
                boreDrawSelectionEligibilityDto = null;
            }
        } else if (dq7VarA.equals(jq40.a(cls4))) {
            if (dq7VarA.equals(jq40.a(cls))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                    configValue = null;
                }
                boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
            }
            boreDrawSelectionEligibilityDto = null;
        } else if (configValue instanceof Boolean) {
            if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                configValue = null;
            }
            boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
        } else {
            if (configValue instanceof String) {
                StringsKt.r0((String) configValue);
            }
            boreDrawSelectionEligibilityDto = null;
        }
        if (boreDrawSelectionEligibilityDto != null) {
            items = sport.getItems();
        }
        BoreDrawConfig boreDrawConfig2 = new BoreDrawConfig(items);
        String str10 = rTicket2.orderId;
        str10.getClass();
        return new jqf0(arrayList, i11, str9, boreDrawConfig2, str10, rTicket2.userNote);
    }
}
