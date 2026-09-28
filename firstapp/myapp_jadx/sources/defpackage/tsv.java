package defpackage;

import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.loyalty.LoyaltyAggregateHintData;
import com.sporty.android.core.model.loyalty.LoyaltyMissionInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class tsv {
    public final jgk a;
    public final JsonSerializeService b;
    public final rym c;
    public final oak0 d;
    public final j1b e;
    public final ConcurrentHashMap.KeySetView f;

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h620.values().length];
            try {
                h620 h620Var = h620.c;
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                h620 h620Var2 = h620.c;
                iArr[11] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public tsv(jgk jgkVar, JsonSerializeService jsonSerializeService, rym rymVar, oak0 oak0Var, uqm uqmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        jgkVar.getClass();
        jsonSerializeService.getClass();
        rymVar.getClass();
        oak0Var.getClass();
        uqmVar.getClass();
        this.a = jgkVar;
        this.b = jsonSerializeService;
        this.c = rymVar;
        this.d = oak0Var;
        j1b j1bVarA = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), oddVar));
        this.e = j1bVarA;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet.getClass();
        this.f = keySetViewNewKeySet;
        ej5.c(j1bVarA, null, null, new ssv(this, null), 3);
        uqmVar.addLoginEventListener(new lit() { // from class: rsv
            @Override // defpackage.lit
            public final void onLogin() {
                tsv tsvVar = this.a;
                tsvVar.f.clear();
                ej5.c(tsvVar.e, null, null, new usv(tsvVar, null), 3);
            }
        });
    }

    public final void a(String str) {
        Object bVar;
        h620 h620Var;
        String strName;
        JSONObject jSONObject;
        h620 h620Var2;
        if (str.length() != 0) {
            try {
                zi50.a aVar = zi50.b;
                LoyaltyAggregateHintData loyaltyAggregateHintData = (LoyaltyAggregateHintData) this.b.fromJson(str, LoyaltyAggregateHintData.class);
                if (loyaltyAggregateHintData != null) {
                    bVar = loyaltyAggregateHintData.getAvailableMissionInfoList();
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    bVar = m2g.a;
                }
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            int i = 0;
            if (thA != null) {
                itf0.a aVar3 = itf0.a;
                aVar3.q("MissionInvitation");
                aVar3.p(thA, yFmFZvuWxAYfEj.vWadhZKoWGG, new Object[0]);
            }
            m2g m2gVar = m2g.a;
            if (bVar instanceof zi50.b) {
                bVar = m2gVar;
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) bVar) {
                LoyaltyMissionInfo loyaltyMissionInfo = (LoyaltyMissionInfo) obj;
                if (loyaltyMissionInfo.isWorldCupPass()) {
                    h620Var2 = h620.C;
                } else if (loyaltyMissionInfo.isBetslipTheme()) {
                    h620Var2 = h620.B;
                } else {
                    h620Var2 = h620.z;
                }
                if (hashSet.add(h620Var2)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                LoyaltyMissionInfo loyaltyMissionInfo2 = (LoyaltyMissionInfo) obj2;
                if (loyaltyMissionInfo2.isWorldCupPass()) {
                    h620Var = h620.C;
                } else if (loyaltyMissionInfo2.isBetslipTheme()) {
                    h620Var = h620.B;
                } else {
                    h620Var = h620.z;
                }
                if (h620Var != h620.C || !this.d.a.get()) {
                    if (this.f.add(h620Var)) {
                        if (a.a[h620Var.ordinal()] == 1) {
                            strName = avg.a(loyaltyMissionInfo2.getMissionId(), "LoyaltyMission_");
                        } else {
                            strName = h620Var.name();
                        }
                        int iOrdinal = h620Var.ordinal();
                        if (iOrdinal != 8) {
                            if (iOrdinal != 11) {
                                jSONObject = new JSONObject();
                                jSONObject.put("missionId", loyaltyMissionInfo2.getMissionId());
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("missionId", loyaltyMissionInfo2.getMissionId());
                                Long purchasePayTotal = loyaltyMissionInfo2.getPurchasePayTotal();
                                if (purchasePayTotal != null) {
                                    jSONObject.put("purchasePayTotal", purchasePayTotal.longValue());
                                }
                            }
                        } else {
                            jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("missionId", loyaltyMissionInfo2.getMissionId());
                            Unit unit = Unit.a;
                            jSONObject.put("data", jSONObject2);
                        }
                        this.c.i(new m420(h620Var, strName, jSONObject));
                    }
                }
            }
        }
    }
}
