package defpackage;

import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.SwipeBetOddsFilterRequest;
import com.sportybet.plugin.realsports.data.SwipeBetPreferenceRequest;
import com.sportybet.plugin.realsports.data.SwipeBetPreferenceVO;
import com.sportybet.plugin.realsports.data.SwipeBetRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lile0;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ile0 extends j8i0 {
    public final e8h a;
    public final hle0 b;
    public final ssw<hqc> c;
    public final ssw d;
    public final ssw<hqc> e;
    public final ssw f;

    @c0d(c = "com.sportybet.plugin.swipebet.viewmodel.SwipeBetViewModel$fetchData$1", f = "SwipeBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super List<? extends Event>>, v1b<? super Unit>, Object> {
        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ile0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super List<? extends Event>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ile0.this.c.m(new lqc());
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.swipebet.viewmodel.SwipeBetViewModel$fetchData$2", f = "SwipeBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<List<? extends Event>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = ile0.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends Event> list, v1b<? super Unit> v1bVar) {
            return ((b) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ile0.this.c.m(new nqc(list));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.swipebet.viewmodel.SwipeBetViewModel$fetchData$3", f = "SwipeBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super List<? extends Event>>, Throwable, v1b<? super Unit>, Object> {
        public c(v1b<? super c> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super List<? extends Event>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            return ile0.this.new c(v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ile0.this.c.m(new kqc());
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.swipebet.viewmodel.SwipeBetViewModel$fetchResetData$1", f = "SwipeBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super List<? extends Event>>, v1b<? super Unit>, Object> {
        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ile0.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super List<? extends Event>> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ile0.this.c.m(new lqc());
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.swipebet.viewmodel.SwipeBetViewModel$fetchResetData$2", f = "SwipeBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<List<? extends Event>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = ile0.this.new e(v1bVar);
            eVar.a = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends Event> list, v1b<? super Unit> v1bVar) {
            return ((e) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ile0.this.c.m(new nqc(list));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.swipebet.viewmodel.SwipeBetViewModel$fetchResetData$3", f = "SwipeBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements gaj<myh<? super List<? extends Event>>, Throwable, v1b<? super Unit>, Object> {
        public f(v1b<? super f> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super List<? extends Event>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            return ile0.this.new f(v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ile0.this.c.m(new kqc());
            return Unit.a;
        }
    }

    public ile0(e8h e8hVar, hle0 hle0Var) {
        e8hVar.getClass();
        hle0Var.getClass();
        this.a = e8hVar;
        this.b = hle0Var;
        ssw<hqc> sswVar = new ssw<>();
        this.c = sswVar;
        this.d = sswVar;
        ssw<hqc> sswVar2 = new ssw<>();
        this.e = sswVar2;
        this.f = sswVar2;
        x1();
    }

    public final void x1() {
        kzh.d(new yzh(new g1i(new xzh(this.a.c(z1(true)), new a(null)), new b(null)), new c(null)), o8i0.d(this));
    }

    public final void y1() {
        SwipeBetPreferenceRequest.Builder builder = new SwipeBetPreferenceRequest.Builder();
        m2g m2gVar = m2g.a;
        SwipeBetPreferenceRequest swipeBetPreferenceRequestBuild = builder.setLeagues(m2gVar).setMarkets(m2gVar).build();
        SwipeBetPreferenceVO.Builder markets = new SwipeBetPreferenceVO.Builder().setLeagues(swipeBetPreferenceRequestBuild.preferredLeagues).setMarkets(swipeBetPreferenceRequestBuild.preferredMarkets);
        markets.setOddsFilter(new SwipeBetOddsFilterRequest.Builder().setMin(1.0d).setMax(2.147483647E9d).setIsMax(true).build());
        SwipeBetPreferenceVO swipeBetPreferenceVOBuild = markets.build();
        SwipeBetRequest swipeBetRequest = new SwipeBetRequest();
        swipeBetRequest.pageSize = 10;
        swipeBetRequest.lastIndex = vn20.d("swipe_bet", this.b.d.isLogin() ? "pref_key_current_appeared_index" : "pref_key_default_current_appeared_index", "");
        swipeBetRequest.preference = swipeBetPreferenceVOBuild;
        List<Selection> listD = iu2.d();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = (ArrayList) listD;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hashSet.add(((Selection) obj).a.eventId);
        }
        swipeBetRequest.selectedMatches = CollectionsKt.A0(hashSet);
        String json = sh8.b().toJson(swipeBetRequest);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("reset recommendBody = %s", json);
        json.getClass();
        kzh.d(new yzh(new g1i(new xzh(this.a.c(json), new d(null)), new e(null)), new f(null)), o8i0.d(this));
    }

    public final String z1(boolean z) {
        String strD;
        hle0 hle0Var = this.b;
        String strD2 = vn20.d("swipe_bet", hle0Var.d.isLogin() ? "pref_key_user_preference" : "pref_key_default_user_preference", "");
        SwipeBetPreferenceRequest swipeBetPreferenceRequestBuild = TextUtils.isEmpty(strD2) ? null : (SwipeBetPreferenceRequest) hle0Var.e.fromJson(strD2, SwipeBetPreferenceRequest.class);
        if (swipeBetPreferenceRequestBuild == null) {
            SwipeBetPreferenceRequest.Builder builder = new SwipeBetPreferenceRequest.Builder();
            m2g m2gVar = m2g.a;
            swipeBetPreferenceRequestBuild = builder.setLeagues(m2gVar).setMarkets(m2gVar).build();
        }
        SwipeBetOddsFilterRequest swipeBetOddsFilterRequest = swipeBetPreferenceRequestBuild != null ? swipeBetPreferenceRequestBuild.preferredOdds : null;
        SwipeBetPreferenceVO.Builder markets = new SwipeBetPreferenceVO.Builder().setLeagues(swipeBetPreferenceRequestBuild.preferredLeagues).setMarkets(swipeBetPreferenceRequestBuild.preferredMarkets);
        if (swipeBetOddsFilterRequest != null) {
            markets.setOddsFilter(swipeBetOddsFilterRequest);
        }
        SwipeBetPreferenceVO swipeBetPreferenceVOBuild = markets.build();
        SwipeBetRequest swipeBetRequest = new SwipeBetRequest();
        swipeBetRequest.pageSize = 10;
        mgb0 mgb0Var = hle0Var.d;
        if (z) {
            strD = vn20.d("swipe_bet", mgb0Var.isLogin() ? "pref_key_current_appeared_index" : "pref_key_default_current_appeared_index", "");
        } else {
            strD = vn20.d("swipe_bet", mgb0Var.isLogin() ? "pref_key_paginate_index" : "pref_key_default_paginate_index", "");
        }
        swipeBetRequest.lastIndex = strD;
        swipeBetRequest.preference = swipeBetPreferenceVOBuild;
        List<Selection> listD = iu2.d();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = (ArrayList) listD;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hashSet.add(((Selection) obj).a.eventId);
        }
        swipeBetRequest.selectedMatches = new ArrayList(hashSet);
        String json = sh8.b().toJson(swipeBetRequest);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("recommendBody = %s", json);
        json.getClass();
        return json;
    }
}
