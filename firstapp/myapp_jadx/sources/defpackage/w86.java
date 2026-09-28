package defpackage;

import com.sportygames.common.business.CommonGameDetails;
import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.common.network.campaign.CampaignTier;
import com.sportygames.common.network.campaign.CampaignTierCriteria;
import com.sportygames.common.network.campaign.CampaignTierCriteriaCondition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class w86 implements bsm {
    public final gn4 a;
    public final hn4 b;
    public final bym c;
    public final mpe0 d;
    public final mpe0 e;

    public w86(gn4 gn4Var, hn4 hn4Var, bym bymVar) {
        bymVar.getClass();
        this.a = gn4Var;
        this.b = hn4Var;
        this.c = bymVar;
        this.d = hwr.b(new c86(this, 0));
        this.e = hwr.b(new Function0() { // from class: e86
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (rt70) this.a.b.invoke();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r10 == r1) goto L31;
     */
    @Override // defpackage.bsm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.x1b r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.j86
            if (r0 == 0) goto L13
            r0 = r10
            j86 r0 = (defpackage.j86) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            j86 r0 = new j86
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            bym r3 = r9.c
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L30
            defpackage.uj50.b(r10)
            goto L7c
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r7
        L36:
            int r2 = r0.a
            defpackage.uj50.b(r10)
            goto L6d
        L3c:
            defpackage.uj50.b(r10)
            goto L53
        L40:
            defpackage.uj50.b(r10)
            hox r10 = defpackage.hox.f
            l86 r2 = new l86
            r2.<init>(r9, r7)
            r0.d = r6
            java.lang.Object r10 = r3.f(r10, r2, r0)
            if (r10 != r1) goto L53
            goto L7b
        L53:
            com.sportygames.common.network.campaign.CampaignsData r10 = (com.sportygames.common.network.campaign.CampaignsData) r10
            if (r10 == 0) goto L7f
            hox r2 = defpackage.hox.f
            n86 r6 = new n86
            r6.<init>(r9, r10, r7)
            r10 = 0
            r0.a = r10
            r0.d = r5
            java.lang.Object r2 = r3.f(r2, r6, r0)
            if (r2 != r1) goto L6a
            goto L7b
        L6a:
            r8 = r2
            r2 = r10
            r10 = r8
        L6d:
            com.sportygames.common.network.campaign.Campaign r10 = (com.sportygames.common.network.campaign.Campaign) r10
            if (r10 == 0) goto L7f
            r0.a = r2
            r0.d = r4
            java.lang.Object r10 = r9.b(r10, r0)
            if (r10 != r1) goto L7c
        L7b:
            return r1
        L7c:
            qsf0 r10 = (defpackage.qsf0) r10
            return r10
        L7f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w86.a(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e0 A[LOOP:1: B:115:0x01da->B:117:0x01e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x0263  */
    /* JADX WARN: Code duplicated, block: B:150:0x0276 A[LOOP:0: B:148:0x0270->B:150:0x0276, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [m2g] */
    /* JADX WARN: Type inference failed for: r11v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [m2g] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
    public final Object b(Campaign campaign, x1b x1bVar) {
        p86 p86Var;
        Object next;
        List<CampaignTierCriteria> criteria;
        Object next2;
        Object next3;
        ?? arrayList;
        Object next4;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        CampaignTierCriteria campaignTierCriteria;
        List list;
        ArrayList arrayList2;
        Iterator it;
        List list2;
        ArrayList arrayList3;
        Iterator it2;
        if (x1bVar instanceof p86) {
            p86Var = (p86) x1bVar;
            int i = p86Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                p86Var.f = i - Integer.MIN_VALUE;
            } else {
                p86Var = new p86(this, x1bVar);
            }
        } else {
            p86Var = new p86(this, x1bVar);
        }
        Object obj = p86Var.d;
        y5b y5bVar = y5b.a;
        int i2 = p86Var.f;
        if (i2 != 0) {
            if (i2 == 1) {
                str4 = p86Var.c;
                str6 = p86Var.b;
                str5 = p86Var.a;
                uj50.b(obj);
                list = (List) obj;
                if (list != null) {
                    return null;
                }
                arrayList2 = new ArrayList(l48.r(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(ok4.a((CommonGameDetails) it.next()));
                }
                return new wl2(str4, str6, str5, arrayList2);
            }
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = p86Var.c;
            str3 = p86Var.b;
            uj50.b(obj);
            list2 = (List) obj;
            if (list2 != null) {
                return null;
            }
            arrayList3 = new ArrayList(l48.r(list2, 10));
            it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(ok4.a((CommonGameDetails) it2.next()));
            }
            return new lrd0(str3, str2, arrayList3);
        }
        uj50.b(obj);
        Iterator it3 = campaign.getTiers().iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((CampaignTier) next).getTierLevel() != campaign.getCurrentTierLevel());
        CampaignTier campaignTier = (CampaignTier) next;
        if (campaignTier == null || (criteria = campaignTier.getCriteria()) == null) {
            return null;
        }
        Iterator it4 = criteria.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
            campaignTierCriteria = (CampaignTierCriteria) next2;
            if (Intrinsics.g(campaignTierCriteria.getType(), "BET_COUNT")) {
                break;
            }
        } while (!Intrinsics.g(campaignTierCriteria.getType(), "STAKE_AMOUNT"));
        CampaignTierCriteria campaignTierCriteria2 = (CampaignTierCriteria) next2;
        if (campaignTierCriteria2 == null) {
            return null;
        }
        Iterator it5 = campaignTierCriteria2.getConditions().iterator();
        do {
            if (!it5.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it5.next();
        } while (!Intrinsics.g(((CampaignTierCriteriaCondition) next3).getType(), "GAME_SET"));
        CampaignTierCriteriaCondition campaignTierCriteriaCondition = (CampaignTierCriteriaCondition) next3;
        if (campaignTierCriteriaCondition != null) {
            try {
                Object value = campaignTierCriteriaCondition.getValue();
                List list3 = value instanceof List ? (List) value : null;
                if (list3 != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list3) {
                        String str7 = obj2 instanceof String ? (String) obj2 : null;
                        if (str7 != null) {
                            arrayList.add(str7);
                        }
                    }
                } else {
                    arrayList = m2g.a;
                }
            } catch (Exception unused) {
                arrayList = m2g.a;
            }
            if (arrayList == 0) {
                arrayList = m2g.a;
            }
        } else {
            arrayList = m2g.a;
        }
        Iterator it6 = campaignTierCriteria2.getConditions().iterator();
        do {
            if (!it6.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it6.next();
        } while (!Intrinsics.g(((CampaignTierCriteriaCondition) next4).getType(), "MIN_STAKE_AMOUNT"));
        CampaignTierCriteriaCondition campaignTierCriteriaCondition2 = (CampaignTierCriteriaCondition) next4;
        int i3 = 0;
        if (campaignTierCriteriaCondition2 != null) {
            try {
                Object value2 = campaignTierCriteriaCondition2.getValue();
                String str8 = value2 instanceof String ? (String) value2 : null;
                str = str8 == null ? null : (String) CollectionsKt.d0(StringsKt__StringsKt.split$default(str8, new String[]{" "}, false, 0, 6, null));
            } catch (Exception unused2) {
            }
        }
        String str9 = campaignTierCriteria2.getValueMap().get("currency");
        String type = campaignTierCriteria2.getType();
        boolean zG = Intrinsics.g(type, "BET_COUNT");
        bym bymVar = this.c;
        try {
            if (zG) {
                String str10 = campaignTierCriteria2.getValueMap().get("currentBetCount");
                if (str10 == null) {
                    str10 = "0";
                }
                String str11 = campaignTierCriteria2.getValueMap().get("totalBetCount");
                Integer intOrNull = StringsKt.toIntOrNull(str11 != null ? str11 : "0");
                int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
                Integer intOrNull2 = StringsKt.toIntOrNull(str10);
                int iIntValue2 = iIntValue - (intOrNull2 != null ? intOrNull2.intValue() : 0);
                if (iIntValue2 >= 0) {
                    i3 = iIntValue2;
                }
                String strValueOf = String.valueOf(i3);
                hox hoxVar = hox.i;
                r86 r86Var = new r86(this, arrayList, null);
                p86Var.a = str;
                p86Var.b = str9;
                p86Var.c = strValueOf;
                p86Var.f = 1;
                Object objF = bymVar.f(hoxVar, r86Var, p86Var);
                if (objF != y5bVar) {
                    obj = objF;
                    str4 = strValueOf;
                    str5 = str;
                    str6 = str9;
                    list = (List) obj;
                    if (list != null) {
                        return null;
                    }
                    arrayList2 = new ArrayList(l48.r(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(ok4.a((CommonGameDetails) it.next()));
                    }
                    return new wl2(str4, str6, str5, arrayList2);
                }
            } else {
                if (!Intrinsics.g(type, "STAKE_AMOUNT")) {
                    return acg.a;
                }
                String str12 = campaignTierCriteria2.getValueMap().get("currentStakeAmount");
                if (str12 == null) {
                    str12 = "0";
                }
                String str13 = campaignTierCriteria2.getValueMap().get("totalStakeAmount");
                Double dH = b.h(str13 != null ? str13 : "0");
                double d = 0.0d;
                double dDoubleValue = dH != null ? dH.doubleValue() : 0.0d;
                Double dH2 = b.h(str12);
                double dDoubleValue2 = dDoubleValue - (dH2 != null ? dH2.doubleValue() : 0.0d);
                if (dDoubleValue2 >= 0.0d) {
                    d = dDoubleValue2;
                }
                String strValueOf2 = String.valueOf(d);
                hox hoxVar2 = hox.i;
                t86 t86Var = new t86(this, arrayList, null);
                p86Var.a = null;
                p86Var.b = str9;
                p86Var.c = strValueOf2;
                p86Var.f = 2;
                Object objF2 = bymVar.f(hoxVar2, t86Var, p86Var);
                if (objF2 != y5bVar) {
                    obj = objF2;
                    str2 = strValueOf2;
                    str3 = str9;
                    list2 = (List) obj;
                    if (list2 != null) {
                        return null;
                    }
                    arrayList3 = new ArrayList(l48.r(list2, 10));
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(ok4.a((CommonGameDetails) it2.next()));
                    }
                    return new lrd0(str3, str2, arrayList3);
                }
            }
            return y5bVar;
        } catch (Exception unused3) {
            return null;
        }
    }
}
