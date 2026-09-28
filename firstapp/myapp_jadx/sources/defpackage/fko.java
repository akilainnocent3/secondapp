package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.config.BroadcastConfig;
import com.sportybet.android.instantwin.newtork.model.PageData;
import com.sportybet.android.instantwin.newtork.model.request.BuildAndGoTicketCreate;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.InstantVirtualResponse;
import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import com.sportybet.android.instantwin.newtork.model.response.NetworkSpeedControllerConfig;
import com.sportybet.android.instantwin.newtork.model.response.Overall;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.newtork.model.response.Ticket;
import com.sportybet.android.instantwin.newtork.model.response.TicketResult;
import com.sportybet.android.instantwin.newtork.model.response.heattoheadstats.NetworkInstantVirtualTeamStatsEnvelop;
import com.sportybet.android.instantwin.newtork.model.response.leaguestats.NetworkInstantVirtualLeagueStats;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.NetworkBetslipRecommendation;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class fko implements eko {
    public final uqm a;
    public final s8o b;
    public final ta8 c;
    public final k5b d;
    public final hbi e;
    public final HashMap<String, String> f = new HashMap<>();

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$buildAndGoPlaceBet$1", f = "InstantWinRepoImpl.kt", l = {535, 534}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super Round>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ BuildAndGoTicketCreate e;
        public final /* synthetic */ InstantWinBetSource f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BuildAndGoTicketCreate buildAndGoTicketCreate, InstantWinBetSource instantWinBetSource, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = buildAndGoTicketCreate;
            this.f = instantWinBetSource;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = fko.this.new a(this.e, this.f, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Round> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r8.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r9)
                goto L52
            L15:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r5
            L1b:
                myh r0 = r8.a
                defpackage.uj50.b(r9)
                goto L45
            L21:
                defpackage.uj50.b(r9)
                fko r9 = defpackage.fko.this
                s8o r9 = r9.b
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking$PlaceBet r2 = new com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking$PlaceBet
                java.lang.Integer r6 = new java.lang.Integer
                r7 = 146(0x92, float:2.05E-43)
                r6.<init>(r7)
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource r7 = r8.f
                r2.<init>(r7, r6)
                r8.c = r5
                r8.a = r0
                r8.b = r4
                com.sportybet.android.instantwin.newtork.model.request.BuildAndGoTicketCreate r4 = r8.e
                java.lang.Object r9 = r9.A(r4, r2, r8)
                if (r9 != r1) goto L45
                goto L51
            L45:
                r8.c = r5
                r8.a = r5
                r8.b = r3
                java.lang.Object r8 = r0.emit(r9, r8)
                if (r8 != r1) goto L52
            L51:
                return r1
            L52:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fko.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$createTicket$1", f = "InstantWinRepoImpl.kt", l = {442, 450}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super TicketResult>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ TicketParameter d;
        public final /* synthetic */ InstantWinBetSource e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TicketParameter ticketParameter, InstantWinBetSource instantWinBetSource, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.d = ticketParameter;
            this.e = instantWinBetSource;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = fko.this.new b(this.d, this.e, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super TicketResult> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            if (r0.emit(r2, r9) == r1) goto L19;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.b
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r9.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                defpackage.uj50.b(r10)
                goto L5b
            L15:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r9)
                return r3
            L1b:
                defpackage.uj50.b(r10)
                goto L42
            L1f:
                defpackage.uj50.b(r10)
                fko r10 = defpackage.fko.this
                s8o r10 = r10.b
                com.sportybet.android.instantwin.newtork.model.request.TicketParameter r2 = r9.d
                java.lang.String r6 = r2.getSportId()
                java.lang.Integer r6 = defpackage.vcj.a(r6)
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking$PlaceBet r7 = new com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking$PlaceBet
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource r8 = r9.e
                r7.<init>(r8, r6)
                r9.b = r0
                r9.a = r5
                java.lang.Object r10 = r10.a(r2, r7, r9)
                if (r10 != r1) goto L42
                goto L5a
            L42:
                bi50 r10 = (defpackage.bi50) r10
                okhttp3.Response r2 = r10.a
                boolean r2 = r2.getIsSuccessful()
                if (r2 == 0) goto L5e
                T r2 = r10.b
                if (r2 == 0) goto L5e
                r9.b = r3
                r9.a = r4
                java.lang.Object r9 = r0.emit(r2, r9)
                if (r9 != r1) goto L5b
            L5a:
                return r1
            L5b:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            L5e:
                tom r9 = new tom
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: fko.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$fetchHeadToHeadStats$1", f = "InstantWinRepoImpl.kt", l = {550, 550}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super NetworkInstantVirtualTeamStatsEnvelop>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = fko.this.new c(this.e, this.f, v1bVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super NetworkInstantVirtualTeamStatsEnvelop> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r8)
                goto L4a
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L1b:
                myh r0 = r7.a
                defpackage.uj50.b(r8)
                goto L3d
            L21:
                defpackage.uj50.b(r8)
                fko r8 = defpackage.fko.this
                s8o r8 = r8.b
                java.lang.String r2 = r7.e
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r6 = defpackage.fko.M(r2)
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.String r4 = r7.f
                java.lang.Object r8 = r8.e(r2, r4, r6, r7)
                if (r8 != r1) goto L3d
                goto L49
            L3d:
                r7.c = r5
                r7.a = r5
                r7.b = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L4a
            L49:
                return r1
            L4a:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fko.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$fetchLeagueStatsList$1", f = "InstantWinRepoImpl.kt", l = {546, 546}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super List<? extends NetworkInstantVirtualLeagueStats>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = fko.this.new d(this.e, v1bVar);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super List<? extends NetworkInstantVirtualLeagueStats>> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r8)
                goto L4e
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L1b:
                myh r0 = r7.a
                defpackage.uj50.b(r8)
                goto L3b
            L21:
                defpackage.uj50.b(r8)
                fko r8 = defpackage.fko.this
                s8o r8 = r8.b
                java.lang.String r2 = r7.e
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r6 = defpackage.fko.M(r2)
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.Object r8 = r8.p(r2, r6, r7)
                if (r8 != r1) goto L3b
                goto L4d
            L3b:
                com.sportybet.android.instantwin.newtork.model.response.leaguestats.NetworkInstantVirtualLeagueStatsEnvelop r8 = (com.sportybet.android.instantwin.newtork.model.response.leaguestats.NetworkInstantVirtualLeagueStatsEnvelop) r8
                java.util.List r8 = r8.getLeagues()
                r7.c = r5
                r7.a = r5
                r7.b = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L4e
            L4d:
                return r1
            L4e:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fko.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$getBroadcastList$1", f = "InstantWinRepoImpl.kt", l = {514, 516}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<myh<? super List<? extends BroadcastConfig>>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = fko.this.new e(v1bVar);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super List<? extends BroadcastConfig>> myhVar, v1b<? super Unit> v1bVar) {
            return ((e) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Exception {
            /*
                r6 = this;
                java.lang.Object r0 = r6.b
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                defpackage.uj50.b(r7)
                goto L46
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r3
            L1b:
                defpackage.uj50.b(r7)
                goto L31
            L1f:
                defpackage.uj50.b(r7)
                fko r7 = defpackage.fko.this
                ta8 r7 = r7.c
                r6.b = r0
                r6.a = r5
                java.lang.Object r7 = r7.g(r6)
                if (r7 != r1) goto L31
                goto L45
            L31:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                boolean r2 = r7.hasData()
                if (r2 == 0) goto L49
                T r7 = r7.data
                r6.b = r3
                r6.a = r4
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L46
            L45:
                return r1
            L46:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            L49:
                java.lang.Exception r6 = new java.lang.Exception
                java.lang.String r7 = r7.message
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fko.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$getOverallConfig$1", f = "InstantWinRepoImpl.kt", l = {59, 59}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<myh<? super Overall>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = fko.this.new f(this.e, v1bVar);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Overall> myhVar, v1b<? super Unit> v1bVar) {
            return ((f) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L48
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L3b
            L21:
                defpackage.uj50.b(r7)
                fko r7 = defpackage.fko.this
                s8o r7 = r7.b
                java.lang.String r2 = r6.e
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r2 = defpackage.fko.M(r2)
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.w(r2, r6)
                if (r7 != r1) goto L3b
                goto L47
            L3b:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fko.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$getSettledEventListByLeague$1", f = "InstantWinRepoImpl.kt", l = {259, 265}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<myh<? super List<? extends EventInRound>>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, String str3, v1b<? super g> v1bVar) {
            super(2, v1bVar);
            this.d = str;
            this.e = str2;
            this.f = str3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = fko.this.new g(this.d, this.e, this.f, v1bVar);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super List<? extends EventInRound>> myhVar, v1b<? super Unit> v1bVar) {
            return ((g) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L19;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Exception {
            /*
                r7 = this;
                java.lang.Object r0 = r7.b
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                defpackage.uj50.b(r8)
                goto L54
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r3
            L1b:
                defpackage.uj50.b(r8)
                goto L3b
            L1f:
                defpackage.uj50.b(r8)
                fko r8 = defpackage.fko.this
                s8o r8 = r8.b
                java.lang.String r2 = r7.f
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r2 = defpackage.fko.M(r2)
                r7.b = r0
                r7.a = r5
                java.lang.String r5 = r7.d
                java.lang.String r6 = r7.e
                java.lang.Object r8 = r8.m(r5, r6, r2, r7)
                if (r8 != r1) goto L3b
                goto L53
            L3b:
                bi50 r8 = (defpackage.bi50) r8
                okhttp3.Response r2 = r8.a
                boolean r2 = r2.getIsSuccessful()
                if (r2 == 0) goto L57
                T r2 = r8.b
                if (r2 == 0) goto L57
                r7.b = r3
                r7.a = r4
                java.lang.Object r7 = r0.emit(r2, r7)
                if (r7 != r1) goto L54
            L53:
                return r1
            L54:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L57:
                okhttp3.ResponseBody r7 = r8.c
                if (r7 == 0) goto L61
                java.lang.String r7 = r7.string()
                if (r7 != 0) goto L63
            L61:
                java.lang.String r7 = "Unknown error"
            L63:
                com.appsflyer.internal.y.a(r7)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: fko.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$getUnsettleRound$1", f = "InstantWinRepoImpl.kt", l = {242, 248}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<myh<? super Round>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, v1b<? super h> v1bVar) {
            super(2, v1bVar);
            this.d = str;
            this.e = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = fko.this.new h(this.d, this.e, v1bVar);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Round> myhVar, v1b<? super Unit> v1bVar) {
            return ((h) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L19;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Exception {
            /*
                r7 = this;
                java.lang.Object r0 = r7.b
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                defpackage.uj50.b(r8)
                goto L52
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r3
            L1b:
                defpackage.uj50.b(r8)
                goto L39
            L1f:
                defpackage.uj50.b(r8)
                fko r8 = defpackage.fko.this
                s8o r8 = r8.b
                java.lang.String r2 = r7.d
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r6 = defpackage.fko.M(r2)
                r7.b = r0
                r7.a = r5
                java.lang.String r5 = r7.e
                java.lang.Object r8 = r8.h(r2, r5, r6, r7)
                if (r8 != r1) goto L39
                goto L51
            L39:
                bi50 r8 = (defpackage.bi50) r8
                okhttp3.Response r2 = r8.a
                boolean r2 = r2.getIsSuccessful()
                if (r2 == 0) goto L55
                T r2 = r8.b
                if (r2 == 0) goto L55
                r7.b = r3
                r7.a = r4
                java.lang.Object r7 = r0.emit(r2, r7)
                if (r7 != r1) goto L52
            L51:
                return r1
            L52:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L55:
                java.lang.Exception r7 = new java.lang.Exception
                okhttp3.Response r8 = r8.a
                java.lang.String r8 = r8.message()
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fko.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$listEvents$1", f = "InstantWinRepoImpl.kt", l = {489, 490, 493}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<myh<? super InstantVirtualResponse>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, v1b<? super i> v1bVar) {
            super(2, v1bVar);
            this.d = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            i iVar = fko.this.new i(this.d, v1bVar);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super InstantVirtualResponse> myhVar, v1b<? super Unit> v1bVar) {
            return ((i) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        
            if (r9 == r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r9 == r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L28;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
            /*
                r8 = this;
                java.lang.Object r0 = r8.b
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r8.a
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L26
                if (r2 == r6) goto L22
                if (r2 == r5) goto L1e
                if (r2 != r4) goto L18
                defpackage.uj50.b(r9)
                goto L71
            L18:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r3
            L1e:
                defpackage.uj50.b(r9)
                goto L58
            L22:
                defpackage.uj50.b(r9)
                goto L46
            L26:
                defpackage.uj50.b(r9)
                fko r9 = defpackage.fko.this
                uqm r2 = r9.a
                boolean r2 = r2.isLogin()
                s8o r9 = r9.b
                java.lang.String r7 = r8.d
                if (r2 == 0) goto L49
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r2 = defpackage.fko.M(r7)
                r8.b = r0
                r8.a = r6
                java.lang.Object r9 = r9.x(r7, r2, r8)
                if (r9 != r1) goto L46
                goto L70
            L46:
                bi50 r9 = (defpackage.bi50) r9
                goto L5a
            L49:
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r2 = defpackage.fko.M(r7)
                r8.b = r0
                r8.a = r5
                java.lang.Object r9 = r9.j(r7, r2, r8)
                if (r9 != r1) goto L58
                goto L70
            L58:
                bi50 r9 = (defpackage.bi50) r9
            L5a:
                okhttp3.Response r2 = r9.a
                boolean r2 = r2.getIsSuccessful()
                if (r2 == 0) goto L74
                T r2 = r9.b
                if (r2 == 0) goto L74
                r8.b = r3
                r8.a = r4
                java.lang.Object r8 = r0.emit(r2, r8)
                if (r8 != r1) goto L71
            L70:
                return r1
            L71:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            L74:
                java.lang.Exception r8 = new java.lang.Exception
                okhttp3.Response r9 = r9.a
                java.lang.String r9 = r9.message()
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fko.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$listMarketTypes$1", f = "InstantWinRepoImpl.kt", l = {500, 502}, m = "invokeSuspend", v = 2)
    public static final class j extends tje0 implements Function2<myh<? super List<? extends MarketType>>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, v1b<? super j> v1bVar) {
            super(2, v1bVar);
            this.d = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            j jVar = fko.this.new j(this.d, v1bVar);
            jVar.b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super List<? extends MarketType>> myhVar, v1b<? super Unit> v1bVar) {
            return ((j) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L19;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Exception {
            /*
                r7 = this;
                java.lang.Object r0 = r7.b
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                defpackage.uj50.b(r8)
                goto L50
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r3
            L1b:
                defpackage.uj50.b(r8)
                goto L37
            L1f:
                defpackage.uj50.b(r8)
                fko r8 = defpackage.fko.this
                s8o r8 = r8.b
                java.lang.String r2 = r7.d
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r6 = defpackage.fko.M(r2)
                r7.b = r0
                r7.a = r5
                java.lang.Object r8 = r8.y(r2, r6, r7)
                if (r8 != r1) goto L37
                goto L4f
            L37:
                bi50 r8 = (defpackage.bi50) r8
                okhttp3.Response r2 = r8.a
                boolean r2 = r2.getIsSuccessful()
                if (r2 == 0) goto L53
                T r2 = r8.b
                if (r2 == 0) goto L53
                r7.b = r3
                r7.a = r4
                java.lang.Object r7 = r0.emit(r2, r7)
                if (r7 != r1) goto L50
            L4f:
                return r1
            L50:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L53:
                java.lang.Exception r7 = new java.lang.Exception
                okhttp3.Response r8 = r8.a
                java.lang.String r8 = r8.message()
                r7.<init>(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fko.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public fko(uqm uqmVar, m2l m2lVar, s8o s8oVar, ta8 ta8Var, k5b k5bVar, hbi hbiVar) {
        this.a = uqmVar;
        this.b = s8oVar;
        this.c = ta8Var;
        this.d = k5bVar;
        this.e = hbiVar;
    }

    public static InstantWinBizTypeTag M(String str) {
        return new InstantWinBizTypeTag(str != null ? vcj.a(str) : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Object A(String str, x1b x1bVar) {
        blo bloVar;
        if (x1bVar instanceof blo) {
            bloVar = (blo) x1bVar;
            int i2 = bloVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bloVar.c = i2 - Integer.MIN_VALUE;
            } else {
                bloVar = new blo(this, x1bVar);
            }
        } else {
            bloVar = new blo(this, x1bVar);
        }
        Object objQ = bloVar.a;
        y5b y5bVar = y5b.a;
        int i3 = bloVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objQ);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(173));
                bloVar.c = 1;
                objQ = s8oVar.q(str, instantWinBizTypeTag, bloVar);
                if (objQ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objQ);
            }
            p5k0 p5k0VarA = btu.a((Ticket) objQ);
            zi50.a aVar2 = zi50.b;
            return p5k0VarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.eko
    public final Object B(String str, String str2, int i2, InstantWinBetSource instantWinBetSource, x1b x1bVar) {
        elo eloVar;
        if (x1bVar instanceof elo) {
            eloVar = (elo) x1bVar;
            int i3 = eloVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eloVar.c = i3 - Integer.MIN_VALUE;
            } else {
                eloVar = new elo(this, x1bVar);
            }
        } else {
            eloVar = new elo(this, x1bVar);
        }
        elo eloVar2 = eloVar;
        Object objV = eloVar2.a;
        y5b y5bVar = y5b.a;
        int i4 = eloVar2.c;
        try {
            if (i4 == 0) {
                uj50.b(objV);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinApiTracking.SettleRound settleRound = new InstantWinApiTracking.SettleRound(instantWinBetSource, new Integer(147));
                eloVar2.c = 1;
                objV = s8oVar.v(str, str2, i2, settleRound, eloVar2);
                if (objV == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objV);
            }
            Round round = (Round) objV;
            zi50.a aVar2 = zi50.b;
            return round;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Object C(String str, x1b x1bVar) {
        iko ikoVar;
        Object objG;
        if (x1bVar instanceof iko) {
            ikoVar = (iko) x1bVar;
            int i2 = ikoVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ikoVar.c = i2 - Integer.MIN_VALUE;
            } else {
                ikoVar = new iko(this, x1bVar);
            }
        } else {
            ikoVar = new iko(this, x1bVar);
        }
        Object obj = ikoVar.a;
        Object obj2 = y5b.a;
        int i3 = ikoVar.c;
        try {
            if (i3 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                ikoVar.c = 1;
                objG = G(str, false, ikoVar);
                if (objG == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objG = ((zi50) obj).a;
            }
            uj50.b(objG);
            NetworkSpeedControllerConfig speedControllerConfig = ((Sports) objG).getSpeedControllerConfig();
            lq lqVar = new lq(speedControllerConfig != null ? speedControllerConfig.getEnable() : false);
            zi50.a aVar2 = zi50.b;
            return lqVar;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    @Override // defpackage.eko
    public final lyh<Round> D(BuildAndGoTicketCreate buildAndGoTicketCreate, InstantWinBetSource instantWinBetSource) {
        instantWinBetSource.getClass();
        return ozh.c(new or60(new a(buildAndGoTicketCreate, instantWinBetSource, null)), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.eko
    public final Object E(String str, int i2, String str2, boolean z, long j2, long j3, String str3, x1b x1bVar) {
        lko lkoVar;
        if (x1bVar instanceof lko) {
            lkoVar = (lko) x1bVar;
            int i3 = lkoVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lkoVar.c = i3 - Integer.MIN_VALUE;
            } else {
                lkoVar = new lko(this, x1bVar);
            }
        } else {
            lkoVar = new lko(this, x1bVar);
        }
        lko lkoVar2 = lkoVar;
        Object objK = lkoVar2.a;
        y5b y5bVar = y5b.a;
        int i4 = lkoVar2.c;
        try {
            if (i4 == 0) {
                uj50.b(objK);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(147));
                Integer num = new Integer(i2);
                Boolean boolValueOf = Boolean.valueOf(z);
                Long l = new Long(j2);
                Long l2 = new Long(j3);
                lkoVar2.c = 1;
                objK = s8oVar.k(str, str3, num, str2, boolValueOf, l, l2, instantWinBizTypeTag, lkoVar2);
                if (objK == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objK);
            }
            PageData pageData = (PageData) objK;
            PageData pageData2 = new PageData();
            pageData2.lastId = pageData.lastId;
            pageData2.pageSize = pageData.pageSize;
            Collection<Ticket> collection = pageData.data;
            collection.getClass();
            ArrayList arrayList = new ArrayList(l48.r(collection, 10));
            for (Ticket ticket : collection) {
                ticket.getClass();
                arrayList.add(von.a(ticket));
            }
            pageData2.data = arrayList;
            zi50.a aVar2 = zi50.b;
            return pageData2;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Serializable F(String str, String str2, x1b x1bVar) {
        hko hkoVar;
        if (x1bVar instanceof hko) {
            hkoVar = (hko) x1bVar;
            int i2 = hkoVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hkoVar.c = i2 - Integer.MIN_VALUE;
            } else {
                hkoVar = new hko(this, x1bVar);
            }
        } else {
            hkoVar = new hko(this, x1bVar);
        }
        Object objU = hkoVar.a;
        y5b y5bVar = y5b.a;
        int i3 = hkoVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objU);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(159));
                hkoVar.c = 1;
                objU = s8oVar.u(str, str2, instantWinBizTypeTag, hkoVar);
                if (objU == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objU);
            }
            Iterable iterable = (Iterable) objU;
            ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(jr.a((EventInRound) it.next()));
            }
            zi50.a aVar2 = zi50.b;
            return arrayList;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Object G(String str, boolean z, x1b x1bVar) {
        yko ykoVar;
        Sports sportsA;
        if (x1bVar instanceof yko) {
            ykoVar = (yko) x1bVar;
            int i2 = ykoVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ykoVar.e = i2 - Integer.MIN_VALUE;
            } else {
                ykoVar = new yko(this, x1bVar);
            }
        } else {
            ykoVar = new yko(this, x1bVar);
        }
        Object objT = ykoVar.c;
        y5b y5bVar = y5b.a;
        int i3 = ykoVar.e;
        try {
            if (i3 == 0) {
                uj50.b(objT);
                zi50.a aVar = zi50.b;
                sportsA = this.e.a();
                if (!z) {
                    if (Intrinsics.g(sportsA != null ? sportsA.getSportId() : null, str)) {
                    }
                    zi50.a aVar2 = zi50.b;
                    return sportsA;
                }
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTagM = M(str);
                ykoVar.a = str;
                ykoVar.b = this;
                ykoVar.e = 1;
                objT = s8oVar.t(str, instantWinBizTypeTagM, ykoVar);
                if (objT == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = ykoVar.b;
                str = ykoVar.a;
                uj50.b(objT);
            }
            sportsA = (Sports) objT;
            if (ay0.V(new String[]{"sr:sport:1", "sr:sport:1-3-1", "sr:sport:1-3-2"}).contains(str)) {
                this.e.b(sportsA);
            }
            zi50.a aVar3 = zi50.b;
            return sportsA;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            return new zi50.b(th);
        }
    }

    @Override // defpackage.eko
    public final lyh<List<BroadcastConfig>> H() {
        return ozh.c(new or60(new e(null)), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.eko
    public final Object J(String str, String str2, int i2, InstantWinBetSource instantWinBetSource, x1b x1bVar) {
        glo gloVar;
        if (x1bVar instanceof glo) {
            gloVar = (glo) x1bVar;
            int i3 = gloVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gloVar.c = i3 - Integer.MIN_VALUE;
            } else {
                gloVar = new glo(this, x1bVar);
            }
        } else {
            gloVar = new glo(this, x1bVar);
        }
        glo gloVar2 = gloVar;
        Object objV = gloVar2.a;
        y5b y5bVar = y5b.a;
        int i4 = gloVar2.c;
        try {
            if (i4 == 0) {
                uj50.b(objV);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinApiTracking.SettleRound settleRound = new InstantWinApiTracking.SettleRound(instantWinBetSource, new Integer(173));
                gloVar2.c = 1;
                objV = s8oVar.v(str, str2, i2, settleRound, gloVar2);
                if (objV == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objV);
            }
            Round round = (Round) objV;
            zi50.a aVar2 = zi50.b;
            return round;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Object K(String str, x1b x1bVar) {
        alo aloVar;
        Object objG;
        if (x1bVar instanceof alo) {
            aloVar = (alo) x1bVar;
            int i2 = aloVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aloVar.c = i2 - Integer.MIN_VALUE;
            } else {
                aloVar = new alo(this, x1bVar);
            }
        } else {
            aloVar = new alo(this, x1bVar);
        }
        Object obj = aloVar.a;
        Object obj2 = y5b.a;
        int i3 = aloVar.c;
        try {
            if (i3 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                aloVar.c = 1;
                objG = G(str, false, aloVar);
                if (objG == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objG = ((zi50) obj).a;
            }
            uj50.b(objG);
            NetworkSpeedControllerConfig speedControllerConfig = ((Sports) objG).getSpeedControllerConfig();
            k5k0 k5k0Var = new k5k0(speedControllerConfig != null ? speedControllerConfig.getEnable() : false);
            zi50.a aVar2 = zi50.b;
            return k5k0Var;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.eko
    public final Object L(String str, int i2, String str2, boolean z, long j2, long j3, String str3, x1b x1bVar) {
        kko kkoVar;
        if (x1bVar instanceof kko) {
            kkoVar = (kko) x1bVar;
            int i3 = kkoVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kkoVar.c = i3 - Integer.MIN_VALUE;
            } else {
                kkoVar = new kko(this, x1bVar);
            }
        } else {
            kkoVar = new kko(this, x1bVar);
        }
        kko kkoVar2 = kkoVar;
        Object objK = kkoVar2.a;
        y5b y5bVar = y5b.a;
        int i4 = kkoVar2.c;
        try {
            if (i4 == 0) {
                uj50.b(objK);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(159));
                Integer num = new Integer(i2);
                Boolean boolValueOf = Boolean.valueOf(z);
                Long l = new Long(j2);
                Long l2 = new Long(j3);
                kkoVar2.c = 1;
                objK = s8oVar.k(str, str3, num, str2, boolValueOf, l, l2, instantWinBizTypeTag, kkoVar2);
                if (objK == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objK);
            }
            PageData pageData = (PageData) objK;
            PageData pageData2 = new PageData();
            pageData2.lastId = pageData.lastId;
            pageData2.pageSize = pageData.pageSize;
            Collection<Ticket> collection = pageData.data;
            collection.getClass();
            ArrayList arrayList = new ArrayList(l48.r(collection, 10));
            for (Ticket ticket : collection) {
                ticket.getClass();
                arrayList.add(kr.a(ticket));
            }
            pageData2.data = arrayList;
            zi50.a aVar2 = zi50.b;
            return pageData2;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    @Override // defpackage.eko
    public final lyh a(String str, String str2) {
        return ozh.c(new or60(new hlo(this, str, str2, null)), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Serializable b(String str, String str2, x1b x1bVar) {
        uko ukoVar;
        if (x1bVar instanceof uko) {
            ukoVar = (uko) x1bVar;
            int i2 = ukoVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ukoVar.c = i2 - Integer.MIN_VALUE;
            } else {
                ukoVar = new uko(this, x1bVar);
            }
        } else {
            ukoVar = new uko(this, x1bVar);
        }
        Object objU = ukoVar.a;
        y5b y5bVar = y5b.a;
        int i3 = ukoVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objU);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS));
                ukoVar.c = 1;
                objU = s8oVar.u(str, str2, instantWinBizTypeTag, ukoVar);
                if (objU == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objU);
            }
            Iterable iterable = (Iterable) objU;
            ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(tn9.a((EventInRound) it.next()));
            }
            zi50.a aVar2 = zi50.b;
            return arrayList;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    @Override // defpackage.eko
    public final lyh c(String str, String str2, InstantWinBetSource instantWinBetSource) {
        str2.getClass();
        instantWinBetSource.getClass();
        return ozh.c(new or60(new xko(this, str, str2, instantWinBetSource, null)), this.d);
    }

    @Override // defpackage.eko
    public final lyh<NetworkInstantVirtualTeamStatsEnvelop> d(String str, String str2) {
        str.getClass();
        str2.getClass();
        return ozh.c(new or60(new c(str, str2, null)), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.eko
    public final Object e(String str, String str2, int i2, InstantWinBetSource instantWinBetSource, x1b x1bVar) {
        dlo dloVar;
        if (x1bVar instanceof dlo) {
            dloVar = (dlo) x1bVar;
            int i3 = dloVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dloVar.c = i3 - Integer.MIN_VALUE;
            } else {
                dloVar = new dlo(this, x1bVar);
            }
        } else {
            dloVar = new dlo(this, x1bVar);
        }
        dlo dloVar2 = dloVar;
        Object objV = dloVar2.a;
        y5b y5bVar = y5b.a;
        int i4 = dloVar2.c;
        try {
            if (i4 == 0) {
                uj50.b(objV);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinApiTracking.SettleRound settleRound = new InstantWinApiTracking.SettleRound(instantWinBetSource, new Integer(159));
                dloVar2.c = 1;
                objV = s8oVar.v(str, str2, i2, settleRound, dloVar2);
                if (objV == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objV);
            }
            Round round = (Round) objV;
            zi50.a aVar2 = zi50.b;
            return round;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    @Override // defpackage.eko
    public final lyh f(String str) {
        return ozh.c(new or60(new mko(this, str, null)), this.d);
    }

    @Override // defpackage.eko
    public final lyh<List<NetworkInstantVirtualLeagueStats>> g(String str) {
        str.getClass();
        return ozh.c(new or60(new d(str, null)), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.eko
    public final Object h(String str, String str2, int i2, InstantWinBetSource instantWinBetSource, x1b x1bVar) {
        flo floVar;
        if (x1bVar instanceof flo) {
            floVar = (flo) x1bVar;
            int i3 = floVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                floVar.c = i3 - Integer.MIN_VALUE;
            } else {
                floVar = new flo(this, x1bVar);
            }
        } else {
            floVar = new flo(this, x1bVar);
        }
        flo floVar2 = floVar;
        Object objV = floVar2.a;
        y5b y5bVar = y5b.a;
        int i4 = floVar2.c;
        try {
            if (i4 == 0) {
                uj50.b(objV);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinApiTracking.SettleRound settleRound = new InstantWinApiTracking.SettleRound(instantWinBetSource, new Integer(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS));
                floVar2.c = 1;
                objV = s8oVar.v(str, str2, i2, settleRound, floVar2);
                if (objV == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objV);
            }
            Round round = (Round) objV;
            zi50.a aVar2 = zi50.b;
            return round;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.eko
    public final Object i(String str, int i2, String str2, boolean z, long j2, long j3, String str3, x1b x1bVar) {
        clo cloVar;
        if (x1bVar instanceof clo) {
            cloVar = (clo) x1bVar;
            int i3 = cloVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cloVar.c = i3 - Integer.MIN_VALUE;
            } else {
                cloVar = new clo(this, x1bVar);
            }
        } else {
            cloVar = new clo(this, x1bVar);
        }
        clo cloVar2 = cloVar;
        Object objK = cloVar2.a;
        y5b y5bVar = y5b.a;
        int i4 = cloVar2.c;
        try {
            if (i4 == 0) {
                uj50.b(objK);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(173));
                Integer num = new Integer(i2);
                Boolean boolValueOf = Boolean.valueOf(z);
                Long l = new Long(j2);
                Long l2 = new Long(j3);
                cloVar2.c = 1;
                objK = s8oVar.k(str, str3, num, str2, boolValueOf, l, l2, instantWinBizTypeTag, cloVar2);
                if (objK == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objK);
            }
            PageData pageData = (PageData) objK;
            PageData pageData2 = new PageData();
            pageData2.lastId = pageData.lastId;
            pageData2.pageSize = pageData.pageSize;
            Collection<Ticket> collection = pageData.data;
            collection.getClass();
            ArrayList arrayList = new ArrayList(l48.r(collection, 10));
            for (Ticket ticket : collection) {
                ticket.getClass();
                arrayList.add(btu.a(ticket));
            }
            pageData2.data = arrayList;
            zi50.a aVar2 = zi50.b;
            return pageData2;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Object j(String str, x1b x1bVar) {
        tko tkoVar;
        if (x1bVar instanceof tko) {
            tkoVar = (tko) x1bVar;
            int i2 = tkoVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tkoVar.c = i2 - Integer.MIN_VALUE;
            } else {
                tkoVar = new tko(this, x1bVar);
            }
        } else {
            tkoVar = new tko(this, x1bVar);
        }
        Object objQ = tkoVar.a;
        y5b y5bVar = y5b.a;
        int i3 = tkoVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objQ);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(147));
                tkoVar.c = 1;
                objQ = s8oVar.q(str, instantWinBizTypeTag, tkoVar);
                if (objQ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objQ);
            }
            eon eonVarA = von.a((Ticket) objQ);
            zi50.a aVar2 = zi50.b;
            return eonVarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.eko
    public final Object k(String str, int i2, long j2, long j3, String str2, x1b x1bVar) {
        qko qkoVar;
        if (x1bVar instanceof qko) {
            qkoVar = (qko) x1bVar;
            int i3 = qkoVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qkoVar.c = i3 - Integer.MIN_VALUE;
            } else {
                qkoVar = new qko(this, x1bVar);
            }
        } else {
            qkoVar = new qko(this, x1bVar);
        }
        qko qkoVar2 = qkoVar;
        Object objK = qkoVar2.a;
        y5b y5bVar = y5b.a;
        int i4 = qkoVar2.c;
        try {
            if (i4 == 0) {
                uj50.b(objK);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                String lowerCase = "ALL".toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(146));
                Integer num = new Integer(i2);
                Boolean bool = Boolean.FALSE;
                Long l = new Long(j2);
                Long l2 = new Long(j3);
                qkoVar2.c = 1;
                objK = s8oVar.k(str, str2, num, lowerCase, bool, l, l2, instantWinBizTypeTag, qkoVar2);
                if (objK == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objK);
            }
            PageData pageData = (PageData) objK;
            PageData pageData2 = new PageData();
            pageData2.lastId = pageData.lastId;
            pageData2.pageSize = pageData.pageSize;
            Collection<Ticket> collection = pageData.data;
            collection.getClass();
            ArrayList arrayList = new ArrayList(l48.r(collection, 10));
            for (Ticket ticket : collection) {
                ticket.getClass();
                arrayList.add(lc0.b(ticket));
            }
            pageData2.data = arrayList;
            zi50.a aVar2 = zi50.b;
            return pageData2;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Object l(String str, x1b x1bVar) {
        jko jkoVar;
        if (x1bVar instanceof jko) {
            jkoVar = (jko) x1bVar;
            int i2 = jkoVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jkoVar.c = i2 - Integer.MIN_VALUE;
            } else {
                jkoVar = new jko(this, x1bVar);
            }
        } else {
            jkoVar = new jko(this, x1bVar);
        }
        Object objQ = jkoVar.a;
        y5b y5bVar = y5b.a;
        int i3 = jkoVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objQ);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(159));
                jkoVar.c = 1;
                objQ = s8oVar.q(str, instantWinBizTypeTag, jkoVar);
                if (objQ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objQ);
            }
            nq nqVarA = kr.a((Ticket) objQ);
            zi50.a aVar2 = zi50.b;
            return nqVarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    @Override // defpackage.eko
    public final lyh<List<EventInRound>> m(String str, String str2, String str3) {
        return ozh.c(new or60(new g(str, str2, str3, null)), this.d);
    }

    @Override // defpackage.eko
    public final lyh n(Boolean bool, String str) {
        return ozh.c(new or60(new gko(this, str, bool, null)), this.d);
    }

    @Override // defpackage.eko
    public final lyh<TicketResult> o(TicketParameter ticketParameter, InstantWinBetSource instantWinBetSource) {
        instantWinBetSource.getClass();
        return ozh.c(new or60(new b(ticketParameter, instantWinBetSource, null)), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Object p(String str, x1b x1bVar) {
        wko wkoVar;
        if (x1bVar instanceof wko) {
            wkoVar = (wko) x1bVar;
            int i2 = wkoVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wkoVar.c = i2 - Integer.MIN_VALUE;
            } else {
                wkoVar = new wko(this, x1bVar);
            }
        } else {
            wkoVar = new wko(this, x1bVar);
        }
        Object objQ = wkoVar.a;
        y5b y5bVar = y5b.a;
        int i3 = wkoVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objQ);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS));
                wkoVar.c = 1;
                objQ = s8oVar.q(str, instantWinBizTypeTag, wkoVar);
                if (objQ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objQ);
            }
            ern ernVarA = bsn.a((Ticket) objQ);
            zi50.a aVar2 = zi50.b;
            return ernVarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    @Override // defpackage.eko
    public final lyh<Overall> q(String str) {
        return ozh.c(new or60(new f(str, null)), this.d);
    }

    @Override // defpackage.eko
    public final lyh<List<MarketType>> r(String str) {
        return ozh.c(new or60(new j(str, null)), this.d);
    }

    @Override // defpackage.eko
    public final lyh s() {
        return ozh.c(new or60(new oko(this, null)), this.d);
    }

    @Override // defpackage.eko
    public final lyh<Round> t(String str, String str2) {
        str2.getClass();
        return ozh.c(new or60(new h(str, str2, null)), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.eko
    public final Object u(String str, int i2, String str2, boolean z, long j2, long j3, String str3, x1b x1bVar) {
        rko rkoVar;
        if (x1bVar instanceof rko) {
            rkoVar = (rko) x1bVar;
            int i3 = rkoVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rkoVar.c = i3 - Integer.MIN_VALUE;
            } else {
                rkoVar = new rko(this, x1bVar);
            }
        } else {
            rkoVar = new rko(this, x1bVar);
        }
        rko rkoVar2 = rkoVar;
        Object objK = rkoVar2.a;
        y5b y5bVar = y5b.a;
        int i4 = rkoVar2.c;
        try {
            if (i4 == 0) {
                uj50.b(objK);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS));
                Integer num = new Integer(i2);
                Boolean boolValueOf = Boolean.valueOf(z);
                Long l = new Long(j2);
                Long l2 = new Long(j3);
                rkoVar2.c = 1;
                objK = s8oVar.k(str, str3, num, str2, boolValueOf, l, l2, instantWinBizTypeTag, rkoVar2);
                if (objK == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objK);
            }
            PageData pageData = (PageData) objK;
            PageData pageData2 = new PageData();
            pageData2.lastId = pageData.lastId;
            pageData2.pageSize = pageData.pageSize;
            Collection<Ticket> collection = pageData.data;
            collection.getClass();
            ArrayList arrayList = new ArrayList(l48.r(collection, 10));
            for (Ticket ticket : collection) {
                ticket.getClass();
                arrayList.add(bsn.a(ticket));
            }
            pageData2.data = arrayList;
            zi50.a aVar2 = zi50.b;
            return pageData2;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Object v(String str, x1b x1bVar) {
        pko pkoVar;
        if (x1bVar instanceof pko) {
            pkoVar = (pko) x1bVar;
            int i2 = pkoVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pkoVar.c = i2 - Integer.MIN_VALUE;
            } else {
                pkoVar = new pko(this, x1bVar);
            }
        } else {
            pkoVar = new pko(this, x1bVar);
        }
        Object objQ = pkoVar.a;
        y5b y5bVar = y5b.a;
        int i3 = pkoVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objQ);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(146));
                pkoVar.c = 1;
                objQ = s8oVar.q(str, instantWinBizTypeTag, pkoVar);
                if (objQ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objQ);
            }
            qh5 qh5VarB = lc0.b((Ticket) objQ);
            zi50.a aVar2 = zi50.b;
            return qh5VarB;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Object w(String str, x1b x1bVar) {
        vko vkoVar;
        Object objG;
        if (x1bVar instanceof vko) {
            vkoVar = (vko) x1bVar;
            int i2 = vkoVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vkoVar.c = i2 - Integer.MIN_VALUE;
            } else {
                vkoVar = new vko(this, x1bVar);
            }
        } else {
            vkoVar = new vko(this, x1bVar);
        }
        Object obj = vkoVar.a;
        Object obj2 = y5b.a;
        int i3 = vkoVar.c;
        try {
            if (i3 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                vkoVar.c = 1;
                objG = G(str, false, vkoVar);
                if (objG == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objG = ((zi50) obj).a;
            }
            uj50.b(objG);
            NetworkSpeedControllerConfig speedControllerConfig = ((Sports) objG).getSpeedControllerConfig();
            crn crnVar = new crn(speedControllerConfig != null ? speedControllerConfig.getEnable() : false);
            zi50.a aVar2 = zi50.b;
            return crnVar;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    @Override // defpackage.eko
    public final lyh<InstantVirtualResponse> x(String str) {
        return ozh.c(new or60(new i(str, null)), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Serializable y(String str, String str2, x1b x1bVar) {
        zko zkoVar;
        if (x1bVar instanceof zko) {
            zkoVar = (zko) x1bVar;
            int i2 = zkoVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zkoVar.c = i2 - Integer.MIN_VALUE;
            } else {
                zkoVar = new zko(this, x1bVar);
            }
        } else {
            zkoVar = new zko(this, x1bVar);
        }
        Object objU = zkoVar.a;
        y5b y5bVar = y5b.a;
        int i3 = zkoVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objU);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(173));
                zkoVar.c = 1;
                objU = s8oVar.u(str, str2, instantWinBizTypeTag, zkoVar);
                if (objU == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objU);
            }
            Iterable iterable = (Iterable) objU;
            ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(k6k0.a((EventInRound) it.next()));
            }
            zi50.a aVar2 = zi50.b;
            return arrayList;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Object z(String str, String str2, x1b x1bVar) {
        nko nkoVar;
        if (x1bVar instanceof nko) {
            nkoVar = (nko) x1bVar;
            int i2 = nkoVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nkoVar.c = i2 - Integer.MIN_VALUE;
            } else {
                nkoVar = new nko(this, x1bVar);
            }
        } else {
            nkoVar = new nko(this, x1bVar);
        }
        Object objR = nkoVar.a;
        y5b y5bVar = y5b.a;
        int i3 = nkoVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objR);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.b;
                InstantWinBizTypeTag instantWinBizTypeTagM = M(str2);
                nkoVar.c = 1;
                objR = s8oVar.r(str, str2, instantWinBizTypeTagM, nkoVar);
                if (objR == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objR);
            }
            mt3 mt3VarA = ss3.a((NetworkBetslipRecommendation) objR);
            zi50.a aVar2 = zi50.b;
            return mt3VarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eko
    public final Object I(int i2, x1b x1bVar, String str) {
        sko skoVar;
        String bVar;
        Throwable thA;
        String str2;
        String str3;
        HashMap<String, String> map;
        if (x1bVar instanceof sko) {
            skoVar = (sko) x1bVar;
            int i3 = skoVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                skoVar.e = i3 - Integer.MIN_VALUE;
            } else {
                skoVar = new sko(this, x1bVar);
            }
        } else {
            skoVar = new sko(this, x1bVar);
        }
        Object obj = skoVar.c;
        y5b y5bVar = y5b.a;
        int i4 = skoVar.e;
        try {
            if (i4 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                HashMap<String, String> map2 = this.f;
                str3 = map2.get(str);
                if (str3 == null) {
                    s8o s8oVar = this.b;
                    InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(new Integer(i2));
                    skoVar.a = map2;
                    skoVar.b = str;
                    skoVar.e = 1;
                    Object objI = s8oVar.i(str, instantWinBizTypeTag, skoVar);
                    if (objI == y5bVar) {
                        return y5bVar;
                    }
                    obj = objI;
                    map = map2;
                }
                bVar = str3;
                zi50.a aVar2 = zi50.b;
                thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a.e(thA);
                }
                str2 = (String) (bVar instanceof zi50.b ? null : bVar);
                if (str2 == null) {
                    return "";
                }
                return str2;
            }
            if (i4 != 1) {
                ib5.a(yFmFZvuWxAYfEj.WNFGS);
                return null;
            }
            str = skoVar.b;
            map = skoVar.a;
            uj50.b(obj);
            Object obj2 = ((BaseResponse) obj).data;
            obj2.getClass();
            str3 = (String) obj2;
            map.put(str, str3);
            bVar = str3;
            zi50.a aVar3 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
        thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.e(thA);
        }
        str2 = (String) (bVar instanceof zi50.b ? null : bVar);
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
