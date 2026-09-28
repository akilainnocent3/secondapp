package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.common.network.campaign.CampaignTier;
import com.sportygames.common.network.campaign.CampaignTierCriteria;
import com.sportygames.common.network.campaign.CampaignTierCriteriaCondition;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class mt4 {
    public static final void a(boolean z, final boolean z2, final CampaignTopicResponse campaignTopicResponse, final Campaign campaign, final Function0<Unit> function0, final gaj<? super nt4, ? super Integer, ? super Integer, Unit> gajVar, Function0<Unit> function1, a aVar, final int i, final int i2) {
        int i3;
        final Function0<Unit> function2;
        int i4;
        b bVar;
        final boolean z3;
        function0.getClass();
        gajVar.getClass();
        b bVarI = aVar.i(1377182386);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (bVarI.b(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | (bVarI.b(z2) ? 32 : 16) | (bVarI.A(campaignTopicResponse) ? 256 : 128) | (bVarI.A(campaign) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(gajVar) ? 131072 : 65536);
        int i7 = i2 & 64;
        if (i7 != 0) {
            i4 = i6 | 1572864;
            function2 = function1;
        } else {
            function2 = function1;
            i4 = i6 | (bVarI.A(function2) ? 1048576 : 524288);
        }
        int i8 = i4;
        if (bVarI.q(i8 & 1, (599187 & i8) != 599186)) {
            final boolean z4 = i5 != 0 ? true : z;
            if (i7 != 0) {
                Object objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new ft4(0);
                    bVarI.r(objY);
                }
                function2 = (Function0) objY;
            }
            if (!z2 || campaignTopicResponse == null || campaign == null || Intrinsics.g(campaignTopicResponse.getCampaignStatus(), "PAUSED")) {
                bVar = bVarI;
                bVar.N(2111617872);
            } else {
                bVarI.N(2113347176);
                bVar = bVarI;
                u60.a(function0, new yle(false, false, 3), pp8.b(1886158948, new Function2() { // from class: gt4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            lrp lrpVarA = sjj.a();
                            final boolean z5 = z4;
                            final CampaignTopicResponse campaignTopicResponse2 = campaignTopicResponse;
                            final Campaign campaign2 = campaign;
                            final Function0 function3 = function0;
                            final gaj gajVar2 = gajVar;
                            final Function0 function4 = function2;
                            orp.a(lrpVarA, pp8.b(-1269172955, new Function2() { // from class: it4
                                /* JADX WARN: Code duplicated, block: B:100:0x0267  */
                                /* JADX WARN: Code duplicated, block: B:108:0x027b  */
                                /* JADX WARN: Code duplicated, block: B:110:0x0283  */
                                /* JADX WARN: Code duplicated, block: B:111:0x0286  */
                                /* JADX WARN: Code duplicated, block: B:113:0x028e  */
                                /* JADX WARN: Code duplicated, block: B:114:0x0291  */
                                /* JADX WARN: Code duplicated, block: B:120:0x02a1 A[PHI: r3
                                  0x02a1: PHI (r3v95 java.lang.String) = (r3v23 java.lang.String), (r3v96 java.lang.String) binds: [B:125:0x02b9, B:118:0x029e] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:121:0x02a4  */
                                /* JADX WARN: Code duplicated, block: B:123:0x02aa  */
                                /* JADX WARN: Code duplicated, block: B:124:0x02b7  */
                                /* JADX WARN: Code duplicated, block: B:126:0x02bb  */
                                /* JADX WARN: Code duplicated, block: B:134:0x02d2  */
                                /* JADX WARN: Code duplicated, block: B:162:0x0335  */
                                /* JADX WARN: Code duplicated, block: B:164:0x0339  */
                                /* JADX WARN: Code duplicated, block: B:167:0x034a  */
                                /* JADX WARN: Code duplicated, block: B:168:0x034d  */
                                /* JADX WARN: Code duplicated, block: B:171:0x035b  */
                                /* JADX WARN: Code duplicated, block: B:179:0x037d A[Catch: Exception -> 0x0384, TryCatch #1 {Exception -> 0x0384, blocks: (B:177:0x0375, B:179:0x037d, B:183:0x0387, B:185:0x0398), top: B:298:0x0375 }] */
                                /* JADX WARN: Code duplicated, block: B:180:0x0380  */
                                /* JADX WARN: Code duplicated, block: B:182:0x0384  */
                                /* JADX WARN: Code duplicated, block: B:189:0x03a4  */
                                /* JADX WARN: Code duplicated, block: B:190:0x03a7  */
                                /* JADX WARN: Code duplicated, block: B:193:0x03b5  */
                                /* JADX WARN: Code duplicated, block: B:201:0x03d7 A[Catch: Exception -> 0x03de, TryCatch #0 {Exception -> 0x03de, blocks: (B:199:0x03cf, B:201:0x03d7, B:205:0x03e1, B:207:0x03f2), top: B:296:0x03cf }] */
                                /* JADX WARN: Code duplicated, block: B:202:0x03da  */
                                /* JADX WARN: Code duplicated, block: B:204:0x03de  */
                                /* JADX WARN: Code duplicated, block: B:211:0x0402  */
                                /* JADX WARN: Code duplicated, block: B:212:0x0411  */
                                /* JADX WARN: Code duplicated, block: B:215:0x0419  */
                                /* JADX WARN: Code duplicated, block: B:216:0x0428  */
                                /* JADX WARN: Code duplicated, block: B:222:0x043f  */
                                /* JADX WARN: Code duplicated, block: B:230:0x0460  */
                                /* JADX WARN: Code duplicated, block: B:232:0x0465  */
                                /* JADX WARN: Code duplicated, block: B:240:0x0477  */
                                /* JADX WARN: Code duplicated, block: B:243:0x047e  */
                                /* JADX WARN: Code duplicated, block: B:244:0x0481  */
                                /* JADX WARN: Code duplicated, block: B:246:0x0487  */
                                /* JADX WARN: Code duplicated, block: B:247:0x048a  */
                                /* JADX WARN: Code duplicated, block: B:250:0x0493  */
                                /* JADX WARN: Code duplicated, block: B:251:0x0498  */
                                /* JADX WARN: Code duplicated, block: B:254:0x04a2  */
                                /* JADX WARN: Code duplicated, block: B:256:0x04a7  */
                                /* JADX WARN: Code duplicated, block: B:258:0x04af  */
                                /* JADX WARN: Code duplicated, block: B:259:0x04b2  */
                                /* JADX WARN: Code duplicated, block: B:262:0x04bb  */
                                /* JADX WARN: Code duplicated, block: B:265:0x04d0  */
                                /* JADX WARN: Code duplicated, block: B:268:0x04f0  */
                                /* JADX WARN: Code duplicated, block: B:274:0x050a  */
                                /* JADX WARN: Code duplicated, block: B:276:0x053d  */
                                /* JADX WARN: Code duplicated, block: B:279:0x0552  */
                                /* JADX WARN: Code duplicated, block: B:283:0x056c  */
                                /* JADX WARN: Code duplicated, block: B:287:0x058a  */
                                /* JADX WARN: Code duplicated, block: B:296:0x03cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:298:0x0375 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:319:0x050c A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:320:0x0504 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:323:0x03c9 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:326:0x036f A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:98:0x0262  */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r3v69, types: [m2g] */
                                /* JADX WARN: Type inference failed for: r3v70, types: [java.lang.Iterable] */
                                /* JADX WARN: Type inference failed for: r3v72, types: [java.util.ArrayList] */
                                /* JADX WARN: Type inference failed for: r40v0, types: [java.util.List] */
                                /* JADX WARN: Type inference failed for: r4v23, types: [m2g] */
                                /* JADX WARN: Type inference failed for: r4v28, types: [m2g] */
                                /* JADX WARN: Type inference failed for: r4v30, types: [m2g] */
                                /* JADX WARN: Type inference failed for: r4v31, types: [java.util.ArrayList] */
                                /* JADX WARN: Type inference failed for: r4v4 */
                                /* JADX WARN: Type inference failed for: r4v5 */
                                /* JADX WARN: Type inference failed for: r4v6 */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    Object next;
                                    int i9;
                                    boolean z6;
                                    List list;
                                    String timeUnit;
                                    int iHashCode;
                                    kv4 kv4Var;
                                    nt4 nt4Var;
                                    CampaignTierCriteria campaignTierCriteriaB;
                                    String str;
                                    String str2;
                                    CampaignTier campaignTierA;
                                    List<String> listA;
                                    CampaignTierCriteria campaignTierCriteriaB2;
                                    ?? arrayList;
                                    CampaignTierCriteria campaignTierCriteriaB3;
                                    Iterator it;
                                    Object next2;
                                    CampaignTierCriteriaCondition campaignTierCriteriaCondition;
                                    Double dH;
                                    Double d;
                                    Object value;
                                    String str3;
                                    String str4;
                                    CampaignTierCriteria campaignTierCriteriaB4;
                                    Iterator it2;
                                    Object next3;
                                    CampaignTierCriteriaCondition campaignTierCriteriaCondition2;
                                    Double dH2;
                                    Double d2;
                                    Object value2;
                                    String str5;
                                    String str6;
                                    CampaignTierCriteria campaignTierCriteriaB5;
                                    String str7;
                                    CampaignTierCriteria campaignTierCriteriaB6;
                                    String str8;
                                    CampaignTier campaignTierA2;
                                    double totalAmount;
                                    double utilisedAmount;
                                    CampaignTier campaignTierA3;
                                    String userActivityStatus;
                                    int iHashCode2;
                                    jv4 jv4Var;
                                    CampaignTierCriteria campaignTierCriteriaB7;
                                    String type;
                                    ts4 ts4Var;
                                    List<sa6> upcomingGames;
                                    ?? arrayList2;
                                    Object objY2;
                                    a.C0041a.C0042a c0042a;
                                    final Function0 function5;
                                    boolean zM;
                                    Object objY3;
                                    final gaj gajVar3;
                                    boolean zM2;
                                    Object objY4;
                                    Iterator it3;
                                    Object next4;
                                    wt4 wt4Var;
                                    rjk giftDetails;
                                    rjk giftDetails2;
                                    List<CampaignTierCriteriaCondition> conditions;
                                    Object next5;
                                    rjk giftDetails3;
                                    m2g m2gVar;
                                    Iterator it4;
                                    Object next6;
                                    h46 h46Var;
                                    String strA;
                                    vt4 vt4Var;
                                    a aVar3 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        d.a aVar4 = d.a.b;
                                        d dVarE = j.e(aVar4, 1.0f);
                                        aiv aivVarC = g75.c(ht.a.h, false);
                                        int iHashCode3 = Long.hashCode(aVar3.m());
                                        ne00 ne00VarO = aVar3.o();
                                        d dVarC = c.c(aVar3, dVarE);
                                        yka.k.getClass();
                                        tsr.a aVar5 = yka.a.b;
                                        if (aVar3.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar3.D();
                                        if (aVar3.g()) {
                                            aVar3.F(aVar5);
                                        } else {
                                            aVar3.p();
                                        }
                                        hlh0.a(aVar3, aivVarC, yka.a.f);
                                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                                        yka.a.C1350a c1350a = yka.a.g;
                                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode3))) {
                                            j3c.a(iHashCode3, aVar3, iHashCode3, c1350a);
                                        }
                                        hlh0.a(aVar3, dVarC, yka.a.d);
                                        Configuration configuration = (Configuration) aVar3.O(AndroidCompositionLocals_androidKt.a);
                                        float f = configuration.screenHeightDp;
                                        float f2 = configuration.screenWidthDp;
                                        boolean z7 = z5;
                                        d dVarC2 = j.c(z7 ? j.y(aVar4, 0.0f, 640.0f, 1) : 0.5625f > f2 / f ? j.g(aVar4, 1.0f) : j.w(aVar4, f * 0.5625f), 0.8f);
                                        CampaignTopicResponse campaignTopicResponse3 = campaignTopicResponse2;
                                        d dVar = dVarC2;
                                        int campaignId = campaignTopicResponse3.getCampaignId();
                                        int campaignTierId = campaignTopicResponse3.getCampaignTierId();
                                        Campaign campaign3 = campaign2;
                                        campaign3.getClass();
                                        Iterator it5 = campaign3.getTiers().iterator();
                                        do {
                                            if (!it5.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it5.next();
                                        } while (((CampaignTier) next).getTierLevel() != campaignTopicResponse3.getTierLevel());
                                        CampaignTier campaignTier = (CampaignTier) next;
                                        if (campaignTier != null) {
                                            List<h46> availableGames = campaignTier.getAvailableGames();
                                            if (availableGames != null) {
                                                ArrayList arrayList3 = new ArrayList(l48.r(availableGames, 10));
                                                Iterator it6 = availableGames.iterator();
                                                while (it6.hasNext()) {
                                                    h46 h46Var2 = (h46) it6.next();
                                                    Iterator it7 = wt4.d.iterator();
                                                    while (true) {
                                                        if (!it7.hasNext()) {
                                                            it4 = it6;
                                                            next6 = null;
                                                            break;
                                                        }
                                                        next6 = it7.next();
                                                        it4 = it6;
                                                        if (((wt4) next6).a.equals(h46Var2.getCom.twilio.voice.EventKeys.ERROR_CODE java.lang.String())) {
                                                            break;
                                                        }
                                                        it6 = it4;
                                                    }
                                                    wt4 wt4Var2 = (wt4) next6;
                                                    if (wt4Var2 == null) {
                                                        wt4Var2 = wt4.UNKNOWN;
                                                    }
                                                    wt4 wt4Var3 = wt4Var2;
                                                    boolean z8 = h46Var2.getLaunchPath() == null;
                                                    if (h46Var2.getLaunchPath() != null) {
                                                        h46Var = h46Var2;
                                                        strA = oxc.a(SportyGamesManager.getInstance().getBasePrefixUrl(), SportyGamesManager.getInstance().getCountry(), h46Var.getLaunchPath());
                                                    } else {
                                                        h46Var = h46Var2;
                                                        strA = "";
                                                    }
                                                    String title = h46Var.getTitle();
                                                    String subtitle = h46Var.getSubtitle();
                                                    String str9 = h46Var.getCom.twilio.voice.EventKeys.ERROR_CODE java.lang.String();
                                                    boolean z9 = wt4Var3 == wt4.UNKNOWN && z8;
                                                    String selectedGame = campaignTier.getSelectedGame();
                                                    String userActivityStatus2 = campaignTopicResponse3.getUserActivityStatus();
                                                    String str10 = h46Var.getCom.twilio.voice.EventKeys.ERROR_CODE java.lang.String();
                                                    if (z9) {
                                                        vt4Var = vt4.b;
                                                    } else if (Intrinsics.g(userActivityStatus2, "ACTIVE") || Intrinsics.g(userActivityStatus2, "REGISTERED")) {
                                                        vt4Var = vt4.a;
                                                    } else if (selectedGame == null && Intrinsics.g(userActivityStatus2, "READY_TO_CLAIM")) {
                                                        vt4Var = vt4.c;
                                                    } else if (Intrinsics.g(selectedGame, str10)) {
                                                        vt4Var = vt4.d;
                                                    } else {
                                                        vt4Var = !Intrinsics.g(selectedGame, str10) ? vt4.a : vt4.a;
                                                    }
                                                    vt4 vt4Var2 = vt4Var;
                                                    double winningAmount = h46Var.getWinningAmount();
                                                    String currency = h46Var.getCurrency();
                                                    String lowerCase = h46Var.getCom.twilio.voice.EventKeys.ERROR_CODE java.lang.String().toLowerCase(Locale.ROOT);
                                                    lowerCase.getClass();
                                                    String str11 = "bonus_vault_" + lowerCase + "_grid_background";
                                                    Boolean forceWebView = h46Var.getForceWebView();
                                                    arrayList3.add(new nt4(title, subtitle, vt4Var2, wt4Var3, str9, strA, str11, winningAmount, currency, forceWebView != null ? forceWebView.booleanValue() : false));
                                                    z7 = z7;
                                                    it6 = it4;
                                                    campaignTierId = campaignTierId;
                                                }
                                                i9 = campaignTierId;
                                                z6 = z7;
                                                list = arrayList3;
                                            } else {
                                                i9 = campaignTierId;
                                                z6 = z7;
                                                m2gVar = m2g.a;
                                            }
                                            if (list == null) {
                                            }
                                            list = m2gVar;
                                            String strValueOf = String.valueOf(campaign3.getCampaign().getRemainingTime());
                                            timeUnit = campaign3.getCampaign().getTimeUnit();
                                            iHashCode = timeUnit.hashCode();
                                            if (iHashCode != -2020697580) {
                                                if (iHashCode != 67452) {
                                                    if (iHashCode != 2223588 && timeUnit.equals("HOUR")) {
                                                        kv4Var = kv4.b;
                                                    } else {
                                                        kv4Var = kv4.d;
                                                    }
                                                } else if (timeUnit.equals("DAY")) {
                                                    kv4Var = kv4.a;
                                                } else {
                                                    kv4Var = kv4.d;
                                                }
                                            } else if (timeUnit.equals("MINUTE")) {
                                                kv4Var = kv4.c;
                                            } else {
                                                kv4Var = kv4.d;
                                            }
                                            kv4 kv4Var2 = kv4Var;
                                            nt4Var = (nt4) CollectionsKt.firstOrNull(list);
                                            if (nt4Var != null || (str = nt4Var.i) == null) {
                                                campaignTierCriteriaB = vs4.b(campaign3, campaignTopicResponse3);
                                                if (campaignTierCriteriaB != null) {
                                                    str = campaignTierCriteriaB.getValueMap().get("currency");
                                                } else {
                                                    str = null;
                                                }
                                                if (str == null) {
                                                    str2 = "";
                                                } else {
                                                    str2 = str;
                                                }
                                            } else {
                                                str2 = str;
                                            }
                                            campaignTierA = vs4.a(campaign3, campaignTopicResponse3);
                                            if (campaignTierA != null || (giftDetails3 = campaignTierA.getGiftDetails()) == null || (listA = giftDetails3.a()) == null) {
                                                listA = m2g.a;
                                            }
                                            List<String> list2 = listA;
                                            campaignTierCriteriaB2 = vs4.b(campaign3, campaignTopicResponse3);
                                            if (campaignTierCriteriaB2 != null || (conditions = campaignTierCriteriaB2.getConditions()) == null) {
                                                arrayList = 0;
                                            } else {
                                                Iterator it8 = conditions.iterator();
                                                do {
                                                    if (!it8.hasNext()) {
                                                        next5 = null;
                                                        break;
                                                    }
                                                    next5 = it8.next();
                                                } while (!Intrinsics.g(((CampaignTierCriteriaCondition) next5).getType(), "GAME_SET"));
                                                CampaignTierCriteriaCondition campaignTierCriteriaCondition3 = (CampaignTierCriteriaCondition) next5;
                                                if (campaignTierCriteriaCondition3 != null) {
                                                    try {
                                                        Object value3 = campaignTierCriteriaCondition3.getValue();
                                                        List list3 = value3 instanceof List ? (List) value3 : null;
                                                        if (list3 != null) {
                                                            arrayList = new ArrayList();
                                                            for (Object obj5 : list3) {
                                                                if (obj5 instanceof String) {
                                                                    arrayList.add(obj5);
                                                                }
                                                            }
                                                        } else {
                                                            arrayList = m2g.a;
                                                        }
                                                    } catch (Exception unused) {
                                                        arrayList = m2g.a;
                                                    }
                                                } else {
                                                    arrayList = 0;
                                                }
                                            }
                                            if (arrayList == 0) {
                                                arrayList = m2g.a;
                                            }
                                            ?? r40 = arrayList;
                                            float tierProgress = campaignTopicResponse3.getTierProgress();
                                            campaignTierCriteriaB3 = vs4.b(campaign3, campaignTopicResponse3);
                                            if (campaignTierCriteriaB3 == null) {
                                                d = null;
                                            } else {
                                                it = campaignTierCriteriaB3.getConditions().iterator();
                                                do {
                                                    if (it.hasNext()) {
                                                        next2 = null;
                                                        break;
                                                    }
                                                    next2 = it.next();
                                                } while (!Intrinsics.g(((CampaignTierCriteriaCondition) next2).getType(), "MIN_STAKE_AMOUNT"));
                                                campaignTierCriteriaCondition = (CampaignTierCriteriaCondition) next2;
                                                if (campaignTierCriteriaCondition != null) {
                                                    try {
                                                        value = campaignTierCriteriaCondition.getValue();
                                                        if (value instanceof String) {
                                                            str3 = (String) value;
                                                        } else {
                                                            str3 = null;
                                                        }
                                                        if (str3 == null && (str4 = (String) CollectionsKt.d0(StringsKt__StringsKt.split$default(str3, new String[]{" "}, false, 0, 6, null))) != null) {
                                                            dH = kotlin.text.b.h(str4);
                                                        } else {
                                                            dH = null;
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    d = dH;
                                                } else {
                                                    d = null;
                                                }
                                            }
                                            campaignTierCriteriaB4 = vs4.b(campaign3, campaignTopicResponse3);
                                            if (campaignTierCriteriaB4 == null) {
                                                d2 = null;
                                            } else {
                                                it2 = campaignTierCriteriaB4.getConditions().iterator();
                                                do {
                                                    if (it2.hasNext()) {
                                                        next3 = null;
                                                        break;
                                                    }
                                                    next3 = it2.next();
                                                } while (!Intrinsics.g(((CampaignTierCriteriaCondition) next3).getType(), "MIN_COEFFICIENT"));
                                                campaignTierCriteriaCondition2 = (CampaignTierCriteriaCondition) next3;
                                                if (campaignTierCriteriaCondition2 != null) {
                                                    try {
                                                        value2 = campaignTierCriteriaCondition2.getValue();
                                                        if (value2 instanceof String) {
                                                            str5 = (String) value2;
                                                        } else {
                                                            str5 = null;
                                                        }
                                                        if (str5 == null && (str6 = (String) CollectionsKt.d0(StringsKt__StringsKt.split$default(str5, new String[]{" "}, false, 0, 6, null))) != null) {
                                                            dH2 = kotlin.text.b.h(str6);
                                                        } else {
                                                            dH2 = null;
                                                        }
                                                    } catch (Exception unused3) {
                                                    }
                                                    d2 = dH2;
                                                } else {
                                                    d2 = null;
                                                }
                                            }
                                            Double totalWinningAmount = campaign3.getTotalWinningAmount();
                                            campaignTierCriteriaB5 = vs4.b(campaign3, campaignTopicResponse3);
                                            if (campaignTierCriteriaB5 != null) {
                                                str7 = campaignTierCriteriaB5.getValueMap().get("totalStakeAmount");
                                            } else {
                                                str7 = null;
                                            }
                                            campaignTierCriteriaB6 = vs4.b(campaign3, campaignTopicResponse3);
                                            if (campaignTierCriteriaB6 != null) {
                                                str8 = campaignTierCriteriaB6.getValueMap().get("totalBetCount");
                                            } else {
                                                str8 = null;
                                            }
                                            campaignTierA2 = vs4.a(campaign3, campaignTopicResponse3);
                                            totalAmount = 0.0d;
                                            if (campaignTierA2 != null || (giftDetails2 = campaignTierA2.getGiftDetails()) == null) {
                                                utilisedAmount = 0.0d;
                                            } else {
                                                utilisedAmount = giftDetails2.getUtilisedAmount();
                                            }
                                            campaignTierA3 = vs4.a(campaign3, campaignTopicResponse3);
                                            if (campaignTierA3 != null && (giftDetails = campaignTierA3.getGiftDetails()) != null) {
                                                totalAmount = giftDetails.getTotalAmount();
                                            }
                                            double d3 = totalAmount;
                                            userActivityStatus = campaignTopicResponse3.getUserActivityStatus();
                                            iHashCode2 = userActivityStatus.hashCode();
                                            if (iHashCode2 != -1384838526) {
                                                if (iHashCode2 != 620914836) {
                                                    if (iHashCode2 != 1925346054 && userActivityStatus.equals("ACTIVE")) {
                                                        jv4Var = jv4.c;
                                                    } else {
                                                        jv4Var = jv4.d;
                                                    }
                                                } else if (userActivityStatus.equals("READY_TO_CLAIM")) {
                                                    jv4Var = jv4.b;
                                                } else {
                                                    jv4Var = jv4.d;
                                                }
                                            } else if (userActivityStatus.equals("REGISTERED")) {
                                                jv4Var = jv4.a;
                                            } else {
                                                jv4Var = jv4.d;
                                            }
                                            jv4 jv4Var2 = jv4Var;
                                            campaignTierCriteriaB7 = vs4.b(campaign3, campaignTopicResponse3);
                                            if (campaignTierCriteriaB7 != null) {
                                                type = campaignTierCriteriaB7.getType();
                                            } else {
                                                type = null;
                                            }
                                            if (Intrinsics.g(type, "BET_COUNT")) {
                                                ts4Var = ts4.b;
                                            } else if (Intrinsics.g(type, "STAKE_AMOUNT")) {
                                                ts4Var = ts4.a;
                                            } else {
                                                ts4Var = ts4.c;
                                            }
                                            ts4 ts4Var2 = ts4Var;
                                            upcomingGames = campaign3.getUpcomingGames();
                                            if (upcomingGames != null) {
                                                arrayList2 = new ArrayList(l48.r(upcomingGames, 10));
                                                for (sa6 sa6Var : upcomingGames) {
                                                    String title2 = sa6Var.getTitle();
                                                    String subtitle2 = sa6Var.getSubtitle();
                                                    String str12 = sa6Var.getCom.twilio.voice.EventKeys.ERROR_CODE java.lang.String();
                                                    vt4 vt4Var3 = vt4.b;
                                                    it3 = wt4.d.iterator();
                                                    do {
                                                        if (it3.hasNext()) {
                                                            next4 = null;
                                                            break;
                                                        }
                                                        next4 = it3.next();
                                                    } while (!((wt4) next4).a.equals(sa6Var.getCom.twilio.voice.EventKeys.ERROR_CODE java.lang.String()));
                                                    wt4Var = (wt4) next4;
                                                    if (wt4Var == null) {
                                                        wt4Var = wt4.UNKNOWN;
                                                    }
                                                    String lowerCase2 = sa6Var.getCom.twilio.voice.EventKeys.ERROR_CODE java.lang.String().toLowerCase(Locale.ROOT);
                                                    lowerCase2.getClass();
                                                    arrayList2.add(new nt4(title2, subtitle2, vt4Var3, wt4Var, str12, "", "bonus_vault_" + lowerCase2 + "_grid_background", 0.0d, "", false));
                                                }
                                            } else {
                                                arrayList2 = m2g.a;
                                            }
                                            us4 us4Var = new us4(strValueOf, kv4Var2, str2, r40, list2, tierProgress, d, d2, totalWinningAmount, str7, str8, utilisedAmount, d3, jv4Var2, ts4Var2, CollectionsKt.i0(arrayList2, list));
                                            objY2 = aVar3.y();
                                            c0042a = a.C0041a.a;
                                            if (objY2 == c0042a) {
                                                objY2 = new jt4(0);
                                                aVar3.r(objY2);
                                            }
                                            Function1 function6 = (Function1) objY2;
                                            function5 = function3;
                                            zM = aVar3.M(function5);
                                            objY3 = aVar3.y();
                                            if (zM || objY3 == c0042a) {
                                                objY3 = new kt4(function5, 0);
                                                aVar3.r(objY3);
                                            }
                                            Function0 function7 = (Function0) objY3;
                                            boolean zM3 = aVar3.M(function5);
                                            gajVar3 = gajVar2;
                                            zM2 = zM3 | aVar3.M(gajVar3);
                                            objY4 = aVar3.y();
                                            if (zM2 || objY4 == c0042a) {
                                                objY4 = new gaj() { // from class: lt4
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                        nt4 nt4Var2 = (nt4) obj6;
                                                        Integer num = (Integer) obj7;
                                                        num.intValue();
                                                        Integer num2 = (Integer) obj8;
                                                        num2.intValue();
                                                        nt4Var2.getClass();
                                                        function5.invoke();
                                                        gajVar3.invoke(nt4Var2, num, num2);
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar3.r(objY4);
                                            }
                                            bt4.a(dVar, campaignId, i9, us4Var, z6, function6, function7, (gaj) objY4, function4, aVar3, 200704);
                                            aVar3.s();
                                        } else {
                                            campaignId = campaignId;
                                            dVar = dVar;
                                            i9 = campaignTierId;
                                            z6 = z7;
                                        }
                                        list = m2gVar;
                                        list = m2g.a;
                                        list = m2gVar;
                                        String strValueOf2 = String.valueOf(campaign3.getCampaign().getRemainingTime());
                                        timeUnit = campaign3.getCampaign().getTimeUnit();
                                        iHashCode = timeUnit.hashCode();
                                        if (iHashCode != -2020697580) {
                                            if (iHashCode != 67452) {
                                                if (iHashCode != 2223588) {
                                                    kv4Var = kv4.d;
                                                } else {
                                                    kv4Var = kv4.b;
                                                }
                                            } else if (timeUnit.equals("DAY")) {
                                                kv4Var = kv4.a;
                                            } else {
                                                kv4Var = kv4.d;
                                            }
                                        } else if (timeUnit.equals("MINUTE")) {
                                            kv4Var = kv4.d;
                                        } else {
                                            kv4Var = kv4.c;
                                        }
                                        kv4 kv4Var3 = kv4Var;
                                        nt4Var = (nt4) CollectionsKt.firstOrNull(list);
                                        if (nt4Var != null) {
                                            campaignTierCriteriaB = vs4.b(campaign3, campaignTopicResponse3);
                                            if (campaignTierCriteriaB != null) {
                                                str = campaignTierCriteriaB.getValueMap().get("currency");
                                            } else {
                                                str = null;
                                            }
                                            if (str == null) {
                                                str2 = "";
                                            } else {
                                                str2 = str;
                                            }
                                        } else {
                                            campaignTierCriteriaB = vs4.b(campaign3, campaignTopicResponse3);
                                            if (campaignTierCriteriaB != null) {
                                                str = campaignTierCriteriaB.getValueMap().get("currency");
                                            } else {
                                                str = null;
                                            }
                                            if (str == null) {
                                                str2 = "";
                                            } else {
                                                str2 = str;
                                            }
                                        }
                                        campaignTierA = vs4.a(campaign3, campaignTopicResponse3);
                                        if (campaignTierA != null) {
                                            listA = m2g.a;
                                        } else {
                                            listA = m2g.a;
                                        }
                                        List<String> list4 = listA;
                                        campaignTierCriteriaB2 = vs4.b(campaign3, campaignTopicResponse3);
                                        if (campaignTierCriteriaB2 != null) {
                                            arrayList = 0;
                                        } else {
                                            arrayList = 0;
                                        }
                                        if (arrayList == 0) {
                                            arrayList = m2g.a;
                                        }
                                        ?? r41 = arrayList;
                                        float tierProgress2 = campaignTopicResponse3.getTierProgress();
                                        campaignTierCriteriaB3 = vs4.b(campaign3, campaignTopicResponse3);
                                        if (campaignTierCriteriaB3 == null) {
                                            d = null;
                                        } else {
                                            it = campaignTierCriteriaB3.getConditions().iterator();
                                            do {
                                                if (it.hasNext()) {
                                                    next2 = null;
                                                    break;
                                                }
                                                next2 = it.next();
                                            } while (!Intrinsics.g(((CampaignTierCriteriaCondition) next2).getType(), "MIN_STAKE_AMOUNT"));
                                            campaignTierCriteriaCondition = (CampaignTierCriteriaCondition) next2;
                                            if (campaignTierCriteriaCondition != null) {
                                                value = campaignTierCriteriaCondition.getValue();
                                                if (value instanceof String) {
                                                    str3 = (String) value;
                                                } else {
                                                    str3 = null;
                                                }
                                                if (str3 == null) {
                                                    dH = null;
                                                } else {
                                                    dH = kotlin.text.b.h(str4);
                                                }
                                                d = dH;
                                            } else {
                                                d = null;
                                            }
                                        }
                                        campaignTierCriteriaB4 = vs4.b(campaign3, campaignTopicResponse3);
                                        if (campaignTierCriteriaB4 == null) {
                                            d2 = null;
                                        } else {
                                            it2 = campaignTierCriteriaB4.getConditions().iterator();
                                            do {
                                                if (it2.hasNext()) {
                                                    next3 = null;
                                                    break;
                                                }
                                                next3 = it2.next();
                                            } while (!Intrinsics.g(((CampaignTierCriteriaCondition) next3).getType(), "MIN_COEFFICIENT"));
                                            campaignTierCriteriaCondition2 = (CampaignTierCriteriaCondition) next3;
                                            if (campaignTierCriteriaCondition2 != null) {
                                                value2 = campaignTierCriteriaCondition2.getValue();
                                                if (value2 instanceof String) {
                                                    str5 = (String) value2;
                                                } else {
                                                    str5 = null;
                                                }
                                                if (str5 == null) {
                                                    dH2 = null;
                                                } else {
                                                    dH2 = kotlin.text.b.h(str6);
                                                }
                                                d2 = dH2;
                                            } else {
                                                d2 = null;
                                            }
                                        }
                                        Double totalWinningAmount2 = campaign3.getTotalWinningAmount();
                                        campaignTierCriteriaB5 = vs4.b(campaign3, campaignTopicResponse3);
                                        if (campaignTierCriteriaB5 != null) {
                                            str7 = campaignTierCriteriaB5.getValueMap().get("totalStakeAmount");
                                        } else {
                                            str7 = null;
                                        }
                                        campaignTierCriteriaB6 = vs4.b(campaign3, campaignTopicResponse3);
                                        if (campaignTierCriteriaB6 != null) {
                                            str8 = campaignTierCriteriaB6.getValueMap().get("totalBetCount");
                                        } else {
                                            str8 = null;
                                        }
                                        campaignTierA2 = vs4.a(campaign3, campaignTopicResponse3);
                                        totalAmount = 0.0d;
                                        if (campaignTierA2 != null) {
                                            utilisedAmount = 0.0d;
                                        } else {
                                            utilisedAmount = 0.0d;
                                        }
                                        campaignTierA3 = vs4.a(campaign3, campaignTopicResponse3);
                                        if (campaignTierA3 != null) {
                                            totalAmount = giftDetails.getTotalAmount();
                                        }
                                        double d4 = totalAmount;
                                        userActivityStatus = campaignTopicResponse3.getUserActivityStatus();
                                        iHashCode2 = userActivityStatus.hashCode();
                                        if (iHashCode2 != -1384838526) {
                                            if (iHashCode2 != 620914836) {
                                                if (iHashCode2 != 1925346054) {
                                                    jv4Var = jv4.d;
                                                } else {
                                                    jv4Var = jv4.c;
                                                }
                                            } else if (userActivityStatus.equals("READY_TO_CLAIM")) {
                                                jv4Var = jv4.d;
                                            } else {
                                                jv4Var = jv4.b;
                                            }
                                        } else if (userActivityStatus.equals("REGISTERED")) {
                                            jv4Var = jv4.d;
                                        } else {
                                            jv4Var = jv4.a;
                                        }
                                        jv4 jv4Var3 = jv4Var;
                                        campaignTierCriteriaB7 = vs4.b(campaign3, campaignTopicResponse3);
                                        if (campaignTierCriteriaB7 != null) {
                                            type = campaignTierCriteriaB7.getType();
                                        } else {
                                            type = null;
                                        }
                                        if (Intrinsics.g(type, "BET_COUNT")) {
                                            ts4Var = ts4.b;
                                        } else if (Intrinsics.g(type, "STAKE_AMOUNT")) {
                                            ts4Var = ts4.a;
                                        } else {
                                            ts4Var = ts4.c;
                                        }
                                        ts4 ts4Var3 = ts4Var;
                                        upcomingGames = campaign3.getUpcomingGames();
                                        if (upcomingGames != null) {
                                            arrayList2 = new ArrayList(l48.r(upcomingGames, 10));
                                            while (r2.hasNext()) {
                                                String title3 = sa6Var.getTitle();
                                                String subtitle3 = sa6Var.getSubtitle();
                                                String str13 = sa6Var.getCom.twilio.voice.EventKeys.ERROR_CODE java.lang.String();
                                                vt4 vt4Var4 = vt4.b;
                                                it3 = wt4.d.iterator();
                                                do {
                                                    if (it3.hasNext()) {
                                                        next4 = null;
                                                        break;
                                                    }
                                                    next4 = it3.next();
                                                } while (!((wt4) next4).a.equals(sa6Var.getCom.twilio.voice.EventKeys.ERROR_CODE java.lang.String()));
                                                wt4Var = (wt4) next4;
                                                if (wt4Var == null) {
                                                    wt4Var = wt4.UNKNOWN;
                                                }
                                                String lowerCase3 = sa6Var.getCom.twilio.voice.EventKeys.ERROR_CODE java.lang.String().toLowerCase(Locale.ROOT);
                                                lowerCase3.getClass();
                                                arrayList2.add(new nt4(title3, subtitle3, vt4Var4, wt4Var, str13, "", "bonus_vault_" + lowerCase3 + "_grid_background", 0.0d, "", false));
                                            }
                                        } else {
                                            arrayList2 = m2g.a;
                                        }
                                        us4 us4Var2 = new us4(strValueOf2, kv4Var3, str2, r41, list4, tierProgress2, d, d2, totalWinningAmount2, str7, str8, utilisedAmount, d4, jv4Var3, ts4Var3, CollectionsKt.i0(arrayList2, list));
                                        objY2 = aVar3.y();
                                        c0042a = a.C0041a.a;
                                        if (objY2 == c0042a) {
                                            objY2 = new jt4(0);
                                            aVar3.r(objY2);
                                        }
                                        Function1 function8 = (Function1) objY2;
                                        function5 = function3;
                                        zM = aVar3.M(function5);
                                        objY3 = aVar3.y();
                                        if (zM) {
                                            objY3 = new kt4(function5, 0);
                                            aVar3.r(objY3);
                                        } else {
                                            objY3 = new kt4(function5, 0);
                                            aVar3.r(objY3);
                                        }
                                        Function0 function9 = (Function0) objY3;
                                        boolean zM4 = aVar3.M(function5);
                                        gajVar3 = gajVar2;
                                        zM2 = zM4 | aVar3.M(gajVar3);
                                        objY4 = aVar3.y();
                                        if (zM2) {
                                            objY4 = new gaj() { // from class: lt4
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    nt4 nt4Var2 = (nt4) obj6;
                                                    Integer num = (Integer) obj7;
                                                    num.intValue();
                                                    Integer num2 = (Integer) obj8;
                                                    num2.intValue();
                                                    nt4Var2.getClass();
                                                    function5.invoke();
                                                    gajVar3.invoke(nt4Var2, num, num2);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar3.r(objY4);
                                        } else {
                                            objY4 = new gaj() { // from class: lt4
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                    nt4 nt4Var2 = (nt4) obj6;
                                                    Integer num = (Integer) obj7;
                                                    num.intValue();
                                                    Integer num2 = (Integer) obj8;
                                                    num2.intValue();
                                                    nt4Var2.getClass();
                                                    function5.invoke();
                                                    gajVar3.invoke(nt4Var2, num, num2);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar3.r(objY4);
                                        }
                                        bt4.a(dVar, campaignId, i9, us4Var2, z6, function8, function9, (gaj) objY4, function4, aVar3, 200704);
                                        aVar3.s();
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, 48);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, ((i8 >> 12) & 14) | 432, 0);
            }
            bVar.X(false);
            z3 = z4;
        } else {
            bVar = bVarI;
            bVar.G();
            z3 = z;
        }
        final Function0<Unit> function3 = function2;
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ht4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mt4.a(z3, z2, campaignTopicResponse, campaign, function0, gajVar, function3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
