package defpackage;

import android.util.Base64;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportygames.campaign.data.model.TournamentRankListResponse;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.viewmodel.CampaignSocketViewModel$observeTopicMessagesFlow$1", f = "CampaignSocketViewModel.kt", l = {239}, m = "invokeSuspend", v = 1)
public final class g96 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i96 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ i96 a;

        public a(i96 i96Var) {
            this.a = i96Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            String str;
            TournamentRankListResponse tournamentRankListResponse;
            igg0 igg0Var = (igg0) obj;
            i96 i96Var = this.a;
            LinkedHashMap linkedHashMap = i96Var.A;
            LinkedHashMap linkedHashMap2 = i96Var.C;
            jgg0 jgg0Var = igg0Var.a;
            String str2 = igg0Var.b;
            String str3 = igg0Var.c;
            boolean z = igg0Var.d;
            int iOrdinal = jgg0Var.ordinal();
            if (iOrdinal == 0) {
                Long l = i96Var.N.get(str2);
                long jLongValue = l != null ? l.longValue() : 0L;
                if (jLongValue != 0) {
                    if (z) {
                        linkedHashMap.put(Long.valueOf(jLongValue), AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                    } else {
                        linkedHashMap.put(Long.valueOf(jLongValue), str3);
                    }
                    HashMap<Long, String> map = new HashMap<>(linkedHashMap);
                    i96Var.B.j(map);
                    wag0.e.j(map);
                    ((x5a0) wag0.f).setValue(map);
                    String str4 = (String) linkedHashMap.get(Long.valueOf(jLongValue));
                    str = str4 != null ? str4 : "";
                    if (!z && str.length() > 0 && !str.equals(AnalyticsEvent.BI_TRACKING_KIND_ERROR)) {
                        ej5.c(o8i0.d(i96Var), null, null, new d96(i96Var, jLongValue, str, null), 3);
                    }
                }
            } else if (iOrdinal == 1) {
                Long l2 = i96Var.O.get(str2);
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                if (jLongValue2 != 0) {
                    i96Var.I.j("messageReceived");
                    if (z) {
                        linkedHashMap2.put(Long.valueOf(jLongValue2), AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                    } else {
                        linkedHashMap2.put(Long.valueOf(jLongValue2), str3);
                    }
                    i96Var.D.j(new HashMap<>(linkedHashMap2));
                    String str5 = (String) linkedHashMap2.get(Long.valueOf(jLongValue2));
                    str = str5 != null ? str5 : "";
                    LinkedHashMap linkedHashMap3 = i96Var.H;
                    if (!str.equals(AnalyticsEvent.BI_TRACKING_KIND_ERROR) && str.length() != 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str, 0);
                            rcg0.a.getClass();
                            String strA = rcg0.a(bArrDecode);
                            if (strA != null && (tournamentRankListResponse = (TournamentRankListResponse) i96Var.z.e(strA, TournamentRankListResponse.class)) != null) {
                                tournamentRankListResponse.setTournamentId(Long.valueOf(jLongValue2));
                                linkedHashMap3.put(Long.valueOf(jLongValue2), tournamentRankListResponse);
                                ((x5a0) wag0.g).setValue(new HashMap(linkedHashMap3));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } else if (iOrdinal == 2) {
                if (z) {
                    str3 = AnalyticsEvent.BI_TRACKING_KIND_ERROR;
                }
                i96Var.E.j(str3);
                ej5.c(o8i0.d(i96Var), null, null, new e96(i96Var, str3, null), 3);
            } else {
                if (iOrdinal != 3) {
                    uhc.a();
                    return null;
                }
                ej5.c(o8i0.d(i96Var), null, null, new c96(igg0Var, i96Var, str3, null), 3);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g96(i96 i96Var, v1b<? super g96> v1bVar) {
        super(2, v1bVar);
        this.b = i96Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g96(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((g96) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        i96 i96Var = this.b;
        b390 b390VarD = i96Var.b.d();
        a aVar = new a(i96Var);
        this.a = 1;
        b390VarD.collect(aVar, this);
        return y5bVar;
    }
}
