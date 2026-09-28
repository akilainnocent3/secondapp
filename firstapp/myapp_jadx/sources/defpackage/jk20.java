package defpackage;

import android.os.Parcelable;
import com.sporty.android.core.model.realsports.OddsFilterEventCountData;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.prematch.data.EarlyPayoutCapability;
import com.sportybet.plugin.realsports.prematch.data.EarlyPayoutCapabilityKt;
import com.sportybet.plugin.realsports.prematch.data.LiveEventDataInPreMatch;
import com.sportybet.plugin.realsports.prematch.data.LiveEventsRequestBody;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventsRequestBody;
import com.sportybet.plugin.realsports.prematch.data.PreMatchLoadMoreData;
import com.sportybet.plugin.realsports.prematch.data.PreMatchLoadingState;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSortType;
import com.sportybet.plugin.realsports.prematch.data.PreMatchWrappedData;
import com.sportybet.plugin.realsports.prematch.data.TournamentTitleData;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljk20;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jk20 extends j8i0 {
    public BigDecimal A;
    public BigDecimal B;
    public int C;
    public int D;
    public jvd0 E;
    public final wwd0 F;
    public final v340 G;
    public final wwd0 H;
    public final v340 I;
    public final wwd0 J;
    public final v340 K;
    public final wwd0 L;
    public final v340 M;
    public final ku90<Boolean> N;
    public long O;
    public final tj20 a;
    public final hus b;
    public final uqm c;
    public final iym d;
    public String e;
    public RegularMarketRule f;
    public int i;
    public long v;
    public Parcelable w;
    public xvf0 y;
    public final ArrayList z;

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportybet.plugin.realsports.prematch.stateholder.PreMatchSectionViewModel$subscribeTopics$1", f = "PreMatchSectionViewModel.kt", l = {633}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ RegularMarketRule c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RegularMarketRule regularMarketRule, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = regularMarketRule;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jk20.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object obj2 = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                jk20 jk20Var = jk20.this;
                hus husVar = jk20Var.b;
                String str = jk20Var.e;
                this.a = 1;
                husVar.getClass();
                pfd pfdVar = fse.a;
                Object objD = ej5.d(odd.b, new cus(husVar, str, this.c, null), this);
                if (objD != obj2) {
                    objD = Unit.a;
                }
                if (objD == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    ib5.a(DZsoPoBl.pJwdEQptX);
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public jk20(tj20 tj20Var, hus husVar, uqm uqmVar, iym iymVar) {
        uqmVar.getClass();
        iymVar.getClass();
        this.a = tj20Var;
        this.b = husVar;
        this.c = uqmVar;
        this.d = iymVar;
        this.e = "";
        this.i = 1;
        this.y = xvf0.a();
        this.z = new ArrayList();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        this.A = bigDecimal;
        this.B = bigDecimal;
        lk50.b bVar = lk50.b.a;
        wwd0 wwd0VarA = xwd0.a(bVar);
        this.F = wwd0VarA;
        this.G = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(bVar);
        this.H = wwd0VarA2;
        v340 v340VarB = e1i.b(wwd0VarA2);
        this.I = v340VarB;
        wwd0 wwd0VarA3 = xwd0.a(bVar);
        this.J = wwd0VarA3;
        this.K = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a(bVar);
        this.L = wwd0VarA4;
        this.M = e1i.b(wwd0VarA4);
        ku90<Boolean> ku90Var = new ku90<>();
        this.N = ku90Var;
        kzh.d(new g1i(r0i.e(husVar.l, husVar.j), new dk20(this, null)), o8i0.d(this));
        kzh.d(new g1i(new bk20(v340VarB), new ck20(this, null)), o8i0.d(this));
        kzh.d(new g1i(new zj20(ku90Var), new ak20(this, null)), o8i0.d(this));
    }

    public final void A1(xvf0 xvf0Var, boolean z) {
        et7 et7VarD = o8i0.d(this);
        String str = this.e;
        int i = this.D;
        ArrayList arrayList = this.z;
        List listC = kotlin.collections.a.c(arrayList);
        if (arrayList.isEmpty()) {
            listC = null;
        }
        RegularMarketRule regularMarketRule = this.f;
        String str2 = regularMarketRule != null ? regularMarketRule.a : null;
        String id = Calendar.getInstance().getTimeZone().getID();
        long j = xvf0Var.d;
        Long lValueOf = Long.valueOf(j);
        if (xvf0Var.c() || j <= 0) {
            lValueOf = null;
        }
        long j2 = xvf0Var.e;
        Long lValueOf2 = Long.valueOf(j2);
        if (xvf0Var.c() || j2 <= 0) {
            lValueOf2 = null;
        }
        long j3 = xvf0Var.d;
        Long lValueOf3 = Long.valueOf(j3);
        if (!xvf0Var.c() || j3 <= 0) {
            lValueOf3 = null;
        }
        PreMatchEventsRequestBody.TimeFilter timeFilter = new PreMatchEventsRequestBody.TimeFilter(lValueOf, lValueOf2, lValueOf3);
        PreMatchEventsRequestBody preMatchEventsRequestBody = new PreMatchEventsRequestBody(str, i, 3, listC, null, null, null, null, null, str2, null, null, id, (timeFilter.getStartTime() == null && timeFilter.getEndTime() == null && timeFilter.getTimeline() == null) ? null : timeFilter, false, false, 52720, null);
        wj20 wj20Var = new wj20(this, z);
        tj20 tj20Var = this.a;
        tj20Var.getClass();
        jvd0 jvd0Var = tj20Var.g;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        h940 h940Var = tj20Var.a;
        String json = tj20Var.a().toJson(preMatchEventsRequestBody);
        json.getClass();
        tj20Var.g = kzh.d(new g1i(bm50.a(new pj20(h940Var.H(json))), new qj20(wj20Var, null)), et7VarD);
    }

    public final void B1() {
        boolean z;
        int i;
        RegularMarketRule regularMarketRule = this.f;
        if (regularMarketRule == null) {
            return;
        }
        et7 et7VarD = o8i0.d(this);
        String str = regularMarketRule.a;
        str.getClass();
        PreMatchEventsRequestBody preMatchEventsRequestBodyD1 = D1(str, null);
        if (this.D == PreMatchSortType.LEAGUE.getValue()) {
            z = true;
            i = 1;
        } else {
            z = false;
            i = 1;
        }
        long j = this.v;
        o07 o07Var = new o07(i, this, regularMarketRule);
        tj20 tj20Var = this.a;
        tj20Var.getClass();
        jvd0 jvd0Var = tj20Var.f;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        tj20Var.f = kzh.d(new g1i(bm50.a(new rj20(tj20Var.b(z, preMatchEventsRequestBodyD1), j, preMatchEventsRequestBodyD1, regularMarketRule)), new sj20(o07Var, null)), et7VarD);
    }

    public final LiveEventDataInPreMatch C1(String str, SocketEventMessage socketEventMessage) {
        Event event = new Event();
        event.eventId = socketEventMessage.eventId;
        Sport sport = new Sport();
        sport.id = this.e;
        Category category = new Category();
        category.id = socketEventMessage.tournamentCategoryId;
        category.name = socketEventMessage.tournamentCategoryName;
        Tournament tournament = new Tournament();
        tournament.id = socketEventMessage.tournamentId;
        category.tournament = tournament;
        sport.category = category;
        event.sport = sport;
        event.markets = new ArrayList();
        event.update(socketEventMessage.jsonObject);
        String str2 = socketEventMessage.tournamentId;
        str2.getClass();
        RegularMarketRule regularMarketRule = this.f;
        BigDecimal bigDecimal = this.A;
        BigDecimal bigDecimal2 = this.B;
        str.getClass();
        str2.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        EarlyPayoutCapability earlyPayoutCapability = EarlyPayoutCapabilityKt.toEarlyPayoutCapability(event);
        return new LiveEventDataInPreMatch(1, regularMarketRule, str, event, str2, true, bigDecimal, bigDecimal2, earlyPayoutCapability.getHaveOneUpMarket(), earlyPayoutCapability.getHaveActiveOneUpMarket(), earlyPayoutCapability.getHaveTwoUpMarket(), earlyPayoutCapability.getHaveActiveTwoUpMarket(), earlyPayoutCapability.getHaveDCOneUpMarket(), earlyPayoutCapability.getHaveActiveDCOneUpMarket(), earlyPayoutCapability.getHaveOUEarlyGoalsMarket(), earlyPayoutCapability.getHaveActiveOUEarlyGoalsMarket(), null, null, 196608, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    public final PreMatchEventsRequestBody D1(String str, String str2) {
        List list;
        List listC;
        boolean zH;
        PreMatchEventsRequestBody.OddsFilter oddsFilter;
        Long l;
        Long l2;
        Long l3;
        Integer num;
        int i;
        PreMatchSortType preMatchSortType;
        Integer numValueOf;
        Integer num2;
        String str3;
        int i2;
        Integer numValueOf2;
        Integer num3;
        if (str2 == null) {
            ArrayList arrayList = this.z;
            if (arrayList.isEmpty()) {
                list = null;
            } else {
                listC = kotlin.collections.a.c(arrayList);
            }
            zH = zog.h(this.A, this.B);
            if (zH) {
                double dDoubleValue = this.A.doubleValue();
                double dDoubleValue2 = this.B.doubleValue();
                i2 = this.C;
                numValueOf2 = Integer.valueOf(i2);
                if (i2 > 0) {
                    num3 = numValueOf2;
                } else {
                    num3 = null;
                }
                oddsFilter = new PreMatchEventsRequestBody.OddsFilter(dDoubleValue, dDoubleValue2, num3);
            } else {
                oddsFilter = null;
            }
            String str4 = this.e;
            int i3 = this.D;
            long j = this.y.d;
            Long lValueOf = Long.valueOf(j);
            if (!this.y.c() || j <= 0) {
                l = null;
            } else {
                l = lValueOf;
            }
            long j2 = this.y.e;
            Long lValueOf2 = Long.valueOf(j2);
            if (!this.y.c() || j2 <= 0) {
                l2 = null;
            } else {
                l2 = lValueOf2;
            }
            long j3 = this.y.d;
            Long lValueOf3 = Long.valueOf(j3);
            if (this.y.c() || j3 <= 0) {
                l3 = null;
            } else {
                l3 = lValueOf3;
            }
            num = 20;
            i = this.D;
            preMatchSortType = PreMatchSortType.LEAGUE;
            if (i == preMatchSortType.getValue() && !zH) {
                num = null;
            }
            numValueOf = Integer.valueOf(this.i);
            if (this.D != preMatchSortType.getValue()) {
                num2 = numValueOf;
            } else {
                num2 = null;
            }
            if (zH) {
                str3 = str;
            } else {
                str3 = null;
            }
            return new PreMatchEventsRequestBody(str4, i3, 3, list, l, l2, l3, num, num2, str3, oddsFilter, this.c.getLastUserId(), null, null, false, false, 61440, null);
        }
        listC = kotlin.collections.a.c(kotlin.collections.a.c(str2));
        list = listC;
        zH = zog.h(this.A, this.B);
        if (zH) {
            double dDoubleValue3 = this.A.doubleValue();
            double dDoubleValue4 = this.B.doubleValue();
            i2 = this.C;
            numValueOf2 = Integer.valueOf(i2);
            if (i2 > 0) {
                num3 = numValueOf2;
            } else {
                num3 = null;
            }
            oddsFilter = new PreMatchEventsRequestBody.OddsFilter(dDoubleValue3, dDoubleValue4, num3);
        } else {
            oddsFilter = null;
        }
        String str5 = this.e;
        int i4 = this.D;
        long j4 = this.y.d;
        Long lValueOf4 = Long.valueOf(j4);
        if (this.y.c()) {
            l = null;
        } else {
            l = null;
        }
        long j5 = this.y.e;
        Long lValueOf5 = Long.valueOf(j5);
        if (this.y.c()) {
            l2 = null;
        } else {
            l2 = null;
        }
        long j6 = this.y.d;
        Long lValueOf6 = Long.valueOf(j6);
        if (this.y.c()) {
            l3 = null;
        } else {
            l3 = null;
        }
        num = 20;
        i = this.D;
        preMatchSortType = PreMatchSortType.LEAGUE;
        if (i == preMatchSortType.getValue()) {
            num = null;
        }
        numValueOf = Integer.valueOf(this.i);
        if (this.D != preMatchSortType.getValue()) {
            num2 = numValueOf;
        } else {
            num2 = null;
        }
        if (zH) {
            str3 = str;
        } else {
            str3 = null;
        }
        return new PreMatchEventsRequestBody(str5, i4, 3, list, l, l2, l3, num, num2, str3, oddsFilter, this.c.getLastUserId(), null, null, false, false, 61440, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lk50<List<PreMatchSectionData>> E1(lk50<PreMatchWrappedData> lk50Var, String str) {
        Object obj;
        if (str == null) {
            if (lk50Var instanceof lk50.c) {
                this.O++;
                I1();
                List<PreMatchSectionData> preMatchDisplayList = ((PreMatchWrappedData) ((lk50.c) lk50Var).a).getPreMatchDisplayList();
                Iterator<T> it = preMatchDisplayList.iterator();
                while (it.hasNext()) {
                    ((PreMatchSectionData) it.next()).setSelectedMarket(this.f);
                }
                return new lk50.c(preMatchDisplayList);
            }
            if (lk50Var instanceof lk50.a) {
                return lk50Var;
            }
            lk50.b bVar = lk50.b.a;
            if (lk50Var.equals(bVar)) {
                return bVar;
            }
            uhc.a();
            return null;
        }
        lk50 lk50Var2 = (lk50) this.H.getValue();
        if (!(lk50Var2 instanceof lk50.c)) {
            return new lk50.a(new Throwable("Cannot cast current state to Results.Success"));
        }
        T t = ((lk50.c) lk50Var2).a;
        Iterable iterable = (Iterable) t;
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            ((PreMatchSectionData) it2.next()).setSelectedMarket(this.f);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (obj2 instanceof TournamentTitleData) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!Intrinsics.g(((TournamentTitleData) obj).getTournamentId(), str));
        TournamentTitleData tournamentTitleData = (TournamentTitleData) obj;
        if (tournamentTitleData == null) {
            return new lk50.a(new Throwable("Cannot find Title"));
        }
        int iIndexOf = ((List) t).indexOf(tournamentTitleData);
        Integer numValueOf = Integer.valueOf(iIndexOf);
        if (iIndexOf < 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return new lk50.a(new Throwable("Cannot find Title"));
        }
        int iIntValue = numValueOf.intValue();
        if (lk50Var instanceof lk50.c) {
            ArrayList arrayListC0 = CollectionsKt.C0((Collection) t);
            arrayListC0.remove(tournamentTitleData);
            List<PreMatchSectionData> preMatchDisplayList2 = ((PreMatchWrappedData) ((lk50.c) lk50Var).a).getPreMatchDisplayList();
            Iterator<T> it3 = preMatchDisplayList2.iterator();
            while (it3.hasNext()) {
                ((PreMatchSectionData) it3.next()).setSelectedMarket(this.f);
            }
            arrayListC0.addAll(iIntValue, preMatchDisplayList2);
            return new lk50.c(arrayListC0);
        }
        if (lk50Var instanceof lk50.a) {
            ArrayList arrayListC1 = CollectionsKt.C0((Collection) t);
            arrayListC1.set(iIntValue, TournamentTitleData.copy$default(tournamentTitleData, 0, null, null, null, 0, true, false, false, false, false, false, false, false, false, false, PreMatchLoadingState.LOAD_FAILED, null, null, 229343, null));
            return new lk50.c(arrayListC1);
        }
        if (!lk50Var.equals(lk50.b.a)) {
            uhc.a();
            return null;
        }
        ArrayList arrayListC2 = CollectionsKt.C0((Collection) t);
        arrayListC2.set(iIntValue, TournamentTitleData.copy$default(tournamentTitleData, 0, null, null, null, 0, true, false, false, false, false, false, false, false, false, false, PreMatchLoadingState.LOADING, null, null, 229343, null));
        return new lk50.c(arrayListC2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lk50<List<PreMatchSectionData>> F1(lk50<PreMatchWrappedData> lk50Var, lk50<? extends List<? extends PreMatchSectionData>> lk50Var2, boolean z) {
        List list;
        PreMatchLoadMoreData preMatchLoadMoreDataCopy$default;
        PreMatchLoadMoreData preMatchLoadMoreDataCopy$default2;
        Object preMatchDisplayList;
        if (this.i == 1) {
            if (!(lk50Var instanceof lk50.c)) {
                if (lk50Var instanceof lk50.a) {
                    return lk50Var;
                }
                lk50.b bVar = lk50.b.a;
                if (lk50Var.equals(bVar)) {
                    return bVar;
                }
                uhc.a();
                return null;
            }
            this.O++;
            PreMatchWrappedData preMatchWrappedData = (PreMatchWrappedData) ((lk50.c) lk50Var).a;
            this.v = preMatchWrappedData.getLastItemDay();
            this.C = preMatchWrappedData.getOddsFilterLastIndex();
            if (z) {
                I1();
            } else {
                this.b.b(true);
            }
            if (preMatchWrappedData.getPreMatchDisplayList().isEmpty() || !preMatchWrappedData.getHasMore()) {
                preMatchDisplayList = preMatchWrappedData.getPreMatchDisplayList();
            } else {
                ArrayList arrayListC0 = CollectionsKt.C0(preMatchWrappedData.getPreMatchDisplayList());
                arrayListC0.add(new PreMatchLoadMoreData(3, PreMatchLoadingState.READY_FOR_LOAD, false, null, null, 24, null));
                preMatchDisplayList = arrayListC0;
            }
            return new lk50.c(preMatchDisplayList);
        }
        lk50.c cVar = (lk50.c) (!(lk50Var2 instanceof lk50.c) ? null : lk50Var2);
        if (cVar != null && (list = (List) cVar.a) != null) {
            ArrayList arrayList = new ArrayList(list);
            if (!(lk50Var instanceof lk50.c)) {
                if (lk50Var instanceof lk50.a) {
                    Object objD0 = CollectionsKt.d0(arrayList);
                    PreMatchLoadMoreData preMatchLoadMoreData = (PreMatchLoadMoreData) (objD0 instanceof PreMatchLoadMoreData ? objD0 : null);
                    if (preMatchLoadMoreData == null || (preMatchLoadMoreDataCopy$default2 = PreMatchLoadMoreData.copy$default(preMatchLoadMoreData, 0, PreMatchLoadingState.LOAD_FAILED, false, null, null, 29, null)) == null) {
                        return new lk50.a(((lk50.a) lk50Var).a);
                    }
                    arrayList.remove(arrayList.size() - 1);
                    arrayList.add(preMatchLoadMoreDataCopy$default2);
                    return new lk50.c(arrayList);
                }
                lk50.b bVar2 = lk50.b.a;
                if (!lk50Var.equals(bVar2)) {
                    uhc.a();
                    return null;
                }
                Object objD1 = CollectionsKt.d0(arrayList);
                PreMatchLoadMoreData preMatchLoadMoreData2 = (PreMatchLoadMoreData) (objD1 instanceof PreMatchLoadMoreData ? objD1 : null);
                if (preMatchLoadMoreData2 == null || (preMatchLoadMoreDataCopy$default = PreMatchLoadMoreData.copy$default(preMatchLoadMoreData2, 0, PreMatchLoadingState.LOADING, false, null, null, 29, null)) == null) {
                    return bVar2;
                }
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(preMatchLoadMoreDataCopy$default);
                return new lk50.c(arrayList);
            }
            PreMatchWrappedData preMatchWrappedData2 = (PreMatchWrappedData) ((lk50.c) lk50Var).a;
            this.v = preMatchWrappedData2.getLastItemDay();
            this.C = preMatchWrappedData2.getOddsFilterLastIndex();
            Object objD2 = CollectionsKt.d0(arrayList);
            PreMatchLoadMoreData preMatchLoadMoreData3 = (PreMatchLoadMoreData) (objD2 instanceof PreMatchLoadMoreData ? objD2 : null);
            if (preMatchLoadMoreData3 != null) {
                PreMatchLoadMoreData preMatchLoadMoreDataCopy$default3 = PreMatchLoadMoreData.copy$default(preMatchLoadMoreData3, 0, preMatchWrappedData2.getHasMore() ? PreMatchLoadingState.READY_FOR_LOAD : PreMatchLoadingState.NO_MORE, false, null, null, 29, null);
                if (preMatchLoadMoreDataCopy$default3 != null) {
                    arrayList.remove(arrayList.size() - 1);
                    arrayList.addAll(preMatchWrappedData2.getPreMatchDisplayList());
                    arrayList.add(preMatchLoadMoreDataCopy$default3);
                    return new lk50.c(arrayList);
                }
            }
        }
        return lk50Var2;
    }

    public final boolean G1() {
        return this.D == PreMatchSortType.LEAGUE.getValue();
    }

    public final void H1() {
        lk50 lk50Var = (lk50) this.I.a.getValue();
        if (!(lk50Var instanceof lk50.c) || ((List) ((lk50.c) lk50Var).a).isEmpty()) {
            return;
        }
        svs svsVar = Intrinsics.g(this.e, "sr:sport:202120001") ? new svs() : null;
        if (svsVar == null) {
            return;
        }
        gym.a(this.d, svsVar);
    }

    public final void I1() {
        RegularMarketRule regularMarketRule = this.f;
        if (regularMarketRule == null) {
            return;
        }
        jvd0 jvd0Var = this.E;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.E = ej5.c(o8i0.d(this), null, null, new a(regularMarketRule, null), 3);
    }

    public final void x1() {
        et7 et7VarD = o8i0.d(this);
        String str = this.e;
        long j = this.y.d;
        Long lValueOf = Long.valueOf(j);
        if (this.y.c() || j <= 0) {
            lValueOf = null;
        }
        long j2 = this.y.e;
        Long lValueOf2 = Long.valueOf(j2);
        if (this.y.c() || j2 <= 0) {
            lValueOf2 = null;
        }
        long j3 = this.y.d;
        Long lValueOf3 = Long.valueOf(j3);
        if (!this.y.c() || j3 <= 0) {
            lValueOf3 = null;
        }
        k4b k4bVar = new k4b(this, 1);
        tj20 tj20Var = this.a;
        tj20Var.getClass();
        h940 h940Var = tj20Var.a;
        str.getClass();
        jvd0 jvd0Var = tj20Var.e;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        tj20Var.e = kzh.d(new g1i(bm50.a(new s78(tj20Var.c.isLogin() ? tj20Var.b.j() : new or60(new ij20(2, null)), h940Var.l(str, lValueOf != null ? String.valueOf(lValueOf.longValue()) : null, lValueOf2 != null ? String.valueOf(lValueOf2.longValue()) : null, lValueOf3 != null ? String.valueOf(lValueOf3.longValue()) : null), new jj20(3, null))), new kj20(k4bVar, null)), et7VarD);
        this.i = 1;
        this.v = 0L;
        this.C = 0;
        this.w = null;
        if (!this.z.isEmpty()) {
            y1(null);
            return;
        }
        if (this.D != PreMatchSortType.LEAGUE.getValue()) {
            B1();
            return;
        }
        RegularMarketRule regularMarketRule = this.f;
        if (regularMarketRule == null) {
            return;
        }
        et7 et7VarD2 = o8i0.d(this);
        String str2 = regularMarketRule.a;
        str2.getClass();
        PreMatchEventsRequestBody preMatchEventsRequestBodyD1 = D1(str2, null);
        vj20 vj20Var = new vj20(this, regularMarketRule);
        jvd0 jvd0Var2 = tj20Var.j;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
        }
        String json = tj20Var.a().toJson(preMatchEventsRequestBodyD1);
        json.getClass();
        tj20Var.j = kzh.d(new g1i(bm50.a(new fj20(r0i.b(h940Var.n(3, json), new gj20(preMatchEventsRequestBodyD1, tj20Var, null)), preMatchEventsRequestBodyD1, regularMarketRule)), new hj20(vj20Var, null)), et7VarD2);
    }

    public final void y1(String str) {
        RegularMarketRule regularMarketRule = this.f;
        if (regularMarketRule == null) {
            return;
        }
        boolean z = this.D == PreMatchSortType.LEAGUE.getValue();
        LiveEventsRequestBody liveEventsRequestBody = new LiveEventsRequestBody(this.e, this.D, 1, str != null ? kotlin.collections.a.c(kotlin.collections.a.c(str)) : kotlin.collections.a.c(this.z), !z ? 20 : null, !z ? Integer.valueOf(this.i) : null, false, false, 192, null);
        et7 et7VarD = o8i0.d(this);
        String str2 = regularMarketRule.a;
        str2.getClass();
        PreMatchEventsRequestBody preMatchEventsRequestBodyD1 = D1(str2, str);
        uj20 uj20Var = new uj20(this, regularMarketRule, z, str);
        tj20 tj20Var = this.a;
        tj20Var.getClass();
        jvd0 jvd0Var = tj20Var.h;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        h940 h940Var = tj20Var.a;
        String json = tj20Var.a().toJson(liveEventsRequestBody);
        json.getClass();
        jvd0 jvd0VarD = kzh.d(new g1i(bm50.a(new n1i(h940Var.n(1, json), tj20Var.b(z, preMatchEventsRequestBodyD1), new lj20(liveEventsRequestBody, preMatchEventsRequestBodyD1, regularMarketRule, z, null))), new mj20(uj20Var, null)), et7VarD);
        if (str != null) {
            tj20Var.i.put(str, jvd0VarD);
        } else {
            tj20Var.h = jvd0VarD;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z1(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Pair pair;
        Object value;
        Object value2;
        int i = 1;
        wwd0 wwd0Var = this.J;
        List list = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (bigDecimal != null && bigDecimal2 != null && bigDecimal.equals(bigDecimal2)) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new lk50.c(new OddsFilterEventCountData(list, new OddsFilterEventCountData.Item(bigDecimal.doubleValue(), bigDecimal2.doubleValue(), 0, null, 8, null), i, objArr4 == true ? 1 : 0))));
            return;
        }
        if (this.y.b()) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, new lk50.c(new OddsFilterEventCountData(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0))));
            return;
        }
        if (this.y.c()) {
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            pair = new Pair(Long.valueOf(timeInMillis), Long.valueOf((this.y.d * 3600000) + timeInMillis));
        } else {
            pair = new Pair(Long.valueOf(this.y.d), Long.valueOf(this.y.e));
        }
        long jLongValue = ((Number) pair.a).longValue();
        long jLongValue2 = ((Number) pair.b).longValue();
        et7 et7VarD = o8i0.d(this);
        String str = this.e;
        int i2 = this.D;
        ArrayList arrayList = this.z;
        List listC = !arrayList.isEmpty() ? kotlin.collections.a.c(arrayList) : null;
        Long lValueOf = Long.valueOf(jLongValue);
        if (jLongValue <= 0) {
            lValueOf = null;
        }
        Long lValueOf2 = jLongValue2 > 0 ? Long.valueOf(jLongValue2) : null;
        RegularMarketRule regularMarketRule = this.f;
        PreMatchEventsRequestBody preMatchEventsRequestBody = new PreMatchEventsRequestBody(str, i2, 3, listC, lValueOf, lValueOf2, null, null, null, regularMarketRule != null ? regularMarketRule.a : null, (bigDecimal == null || bigDecimal2 == null) ? null : new PreMatchEventsRequestBody.OddsFilter(bigDecimal.doubleValue(), bigDecimal2.doubleValue(), null, 4, null), null, null, null, false, false, 63936, null);
        azt aztVar = new azt(this, i);
        tj20 tj20Var = this.a;
        tj20Var.getClass();
        jvd0 jvd0Var = tj20Var.g;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        h940 h940Var = tj20Var.a;
        String json = tj20Var.a().toJson(preMatchEventsRequestBody);
        json.getClass();
        tj20Var.g = kzh.d(new g1i(bm50.a(new nj20(h940Var.c(json))), new oj20(aztVar, null)), et7VarD);
    }
}
