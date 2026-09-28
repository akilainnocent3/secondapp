package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.config.BroadcastConfig;
import com.sporty.android.core.model.oddsboost.OddsBoostRtpRatioResponse;
import com.sporty.android.core.model.realsports.FeatureLaunchRate;
import com.sporty.android.core.model.realsports.OddsFilterEventCountData;
import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckRequest;
import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultResponse;
import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultTypeDto;
import com.sporty.android.core.model.realsports.liabilitycheck.QuickLiabilityCheckRequestDto;
import com.sportybet.android.multimaker.data.dto.MultiMakerEventDto;
import com.sportybet.android.multimaker.data.dto.MultiMakerLeagueOptionsResponse;
import com.sportybet.android.multimaker.data.dto.MultiMakerMarketDto;
import com.sportybet.android.multimaker.data.dto.MultiMakerOddsFilterDto;
import com.sportybet.android.multimaker.data.dto.MultiMakerOutcomeDto;
import com.sportybet.android.multimaker.data.dto.MultiMakerPreferenceDto;
import com.sportybet.android.multimaker.data.dto.MultiMakerRequest;
import com.sportybet.android.multimaker.domain.model.MultiMakerEvent;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import com.sportybet.android.multimaker.domain.model.MultiMakerMarket;
import com.sportybet.android.multimaker.domain.model.MultiMakerOutcome;
import com.sportybet.android.verifybet.apidata.VerifyBetData;
import com.sportybet.plugin.realsports.betslip.liabilitycheck.domain.model.LiabilityCheckSelection;
import com.sportybet.plugin.realsports.data.FirstSearchResult;
import com.sportybet.plugin.realsports.data.HotKeywordData;
import com.sportybet.plugin.realsports.data.OrderWithFailUpdate;
import com.sportybet.plugin.realsports.data.OutrightEvent;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.data.RTicket;
import com.sportybet.plugin.realsports.data.SearchData;
import com.sportybet.plugin.realsports.data.SearchRequestData;
import com.sportybet.plugin.realsports.data.TimeFilterEventCountData;
import com.sportybet.plugin.realsports.quickmarket.data.MarketGroupData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class l940 implements h940 {
    public final s840 a;
    public final h3z b;
    public final g3z c;
    public final ta8 d;
    public final x430 e;
    public final z7h f;
    public final asu g;
    public final y8j h;
    public RTicket i;

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getBannedList$1", f = "RealSportsRepoImpl.kt", l = {350, 350}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super List<? extends String>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = l940.this.new a(v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super List<? extends String>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.sporty.android.common.network.data.SprThrowable {
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
                goto L35
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                z7h r7 = r7.f
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.k(r6)
                if (r7 != r1) goto L35
                goto L47
            L35:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                java.lang.Object r7 = defpackage.n52.b(r7)
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
            throw new UnsupportedOperationException("Method not decompiled: l940.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getEditBetHistoryList$1", f = "RealSportsRepoImpl.kt", l = {328, 328}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<List<? extends nof>>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = l940.this.new b(this.e, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<List<? extends nof>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
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
                goto L44
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                h3z r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.n(r2, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L44
            L43:
                return r1
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getEventCountsByOddsFilter$1", f = "RealSportsRepoImpl.kt", l = {235, 235}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super BaseResponse<OddsFilterEventCountData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = l940.this.new c(this.e, v1bVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OddsFilterEventCountData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
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
                goto L44
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                z7h r7 = r7.f
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.I(r2, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L44
            L43:
                return r1
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getEventCountsByTimeFilter$1", f = "RealSportsRepoImpl.kt", l = {238, 238}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super BaseResponse<TimeFilterEventCountData>>, v1b<? super Unit>, Object> {
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
            d dVar = l940.this.new d(this.e, v1bVar);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<TimeFilterEventCountData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
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
                goto L44
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                z7h r7 = r7.f
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.O(r2, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L44
            L43:
                return r1
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getEventsWithOddsFilterByOrder$1", f = "RealSportsRepoImpl.kt", l = {232, 232}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<myh<? super BaseResponse<PreMatchSportsData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = l940.this.new e(this.e, v1bVar);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<PreMatchSportsData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((e) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
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
                goto L44
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                z7h r7 = r7.f
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.V(r2, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L44
            L43:
                return r1
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getFeaturesLaunchRate$1", f = "RealSportsRepoImpl.kt", l = {342, 342}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<myh<? super BaseResponse<List<? extends FeatureLaunchRate>>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = l940.this.new f(v1bVar);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<List<? extends FeatureLaunchRate>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((f) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L35
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                x430 r7 = r7.e
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.w(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class g implements lyh<BaseResponse<FirstSearchResult>> {
        public final /* synthetic */ or60 a;

        @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getFirstSearchResults$$inlined$filter$1", f = "RealSportsRepoImpl.kt", l = {109}, m = "collect", v = 2)
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
                return g.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getFirstSearchResults$$inlined$filter$1$2", f = "RealSportsRepoImpl.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
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
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (((BaseResponse) obj).hasData()) {
                        aVar.b = 1;
                        if (this.a.emit(obj, aVar) == y5bVar) {
                            return y5bVar;
                        }
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

        public g(or60 or60Var) {
            this.a = or60Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super BaseResponse<FirstSearchResult>> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getFirstSearchResults$1", f = "RealSportsRepoImpl.kt", l = {100, 99}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<myh<? super BaseResponse<FirstSearchResult>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, v1b<? super h> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = l940.this.new h(this.e, v1bVar);
            hVar.c = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<FirstSearchResult>> myhVar, v1b<? super Unit> v1bVar) {
            return ((h) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        
            if (r0.emit(r14, r12) == r1) goto L18;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r13.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r14)
                goto L54
            L15:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r13)
                return r5
            L1b:
                myh r0 = r13.a
                defpackage.uj50.b(r14)
                r12 = r13
                goto L3e
            L22:
                defpackage.uj50.b(r14)
                l940 r14 = defpackage.l940.this
                z7h r6 = r14.f
                r13.c = r5
                r13.a = r0
                r13.b = r4
                r10 = 1
                r11 = 1
                java.lang.String r7 = r13.e
                r8 = 0
                r9 = 20
                r12 = r13
                java.lang.Object r14 = r6.R(r7, r8, r9, r10, r11, r12)
                if (r14 != r1) goto L3e
                goto L53
            L3e:
                com.sporty.android.common.network.data.BaseResponse r14 = (com.sporty.android.common.network.data.BaseResponse) r14
                if (r14 != 0) goto L47
                com.sporty.android.common.network.data.BaseResponse r14 = new com.sporty.android.common.network.data.BaseResponse
                r14.<init>()
            L47:
                r12.c = r5
                r12.a = r5
                r12.b = r3
                java.lang.Object r13 = r0.emit(r14, r12)
                if (r13 != r1) goto L54
            L53:
                return r1
            L54:
                kotlin.Unit r13 = kotlin.Unit.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class i implements lyh<BaseResponse<List<? extends HotKeywordData>>> {
        public final /* synthetic */ or60 a;

        @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getHotKeywords$$inlined$filter$1", f = "RealSportsRepoImpl.kt", l = {109}, m = "collect", v = 2)
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
                return i.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getHotKeywords$$inlined$filter$1$2", f = "RealSportsRepoImpl.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
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
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (((BaseResponse) obj).hasData()) {
                        aVar.b = 1;
                        if (this.a.emit(obj, aVar) == y5bVar) {
                            return y5bVar;
                        }
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

        public i(or60 or60Var) {
            this.a = or60Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super BaseResponse<List<? extends HotKeywordData>>> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getHotKeywords$1", f = "RealSportsRepoImpl.kt", l = {120, 120}, m = "invokeSuspend", v = 2)
    public static final class j extends tje0 implements Function2<myh<? super BaseResponse<List<? extends HotKeywordData>>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public j(v1b<? super j> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            j jVar = l940.this.new j(v1bVar);
            jVar.c = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<List<? extends HotKeywordData>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((j) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L18;
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
                goto L4b
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L35
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                z7h r7 = r7.f
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r1) goto L35
                goto L4a
            L35:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                if (r7 != 0) goto L3e
                com.sporty.android.common.network.data.BaseResponse r7 = new com.sporty.android.common.network.data.BaseResponse
                r7.<init>()
            L3e:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L4b
            L4a:
                return r1
            L4b:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getOddsBoostRtpRatio$1", f = "RealSportsRepoImpl.kt", l = {116, 116}, m = "invokeSuspend", v = 2)
    public static final class k extends tje0 implements Function2<myh<? super BaseResponse<OddsBoostRtpRatioResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public k(v1b<? super k> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            k kVar = l940.this.new k(v1bVar);
            kVar.c = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OddsBoostRtpRatioResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((k) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
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
                goto L42
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L35
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                asu r7 = r7.g
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r1) goto L35
                goto L41
            L35:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L42
            L41:
                return r1
            L42:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getOutrightEventsWithFilter$1", f = "RealSportsRepoImpl.kt", l = {196, 195}, m = "invokeSuspend", v = 2)
    public static final class l extends tje0 implements Function2<myh<? super BaseResponse<List<? extends OutrightEvent>>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, v1b<? super l> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            l lVar = l940.this.new l(this.e, this.f, v1bVar);
            lVar.c = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<List<? extends OutrightEvent>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((l) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
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
                goto L46
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L39
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                z7h r7 = r7.f
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.String r4 = r6.f
                java.lang.Object r7 = r7.X(r2, r4, r6)
                if (r7 != r1) goto L39
                goto L45
            L39:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L46
            L45:
                return r1
            L46:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getQuickMarket$1", f = "RealSportsRepoImpl.kt", l = {183, 182}, m = "invokeSuspend", v = 2)
    public static final class m extends tje0 implements Function2<myh<? super BaseResponse<List<? extends MarketGroupData>>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, String str2, v1b<? super m> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            m mVar = l940.this.new m(this.e, this.f, v1bVar);
            mVar.c = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<List<? extends MarketGroupData>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((m) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
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
                goto L46
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L39
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                z7h r7 = r7.f
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.String r4 = r6.f
                java.lang.Object r7 = r7.a0(r2, r4, r6)
                if (r7 != r1) goto L39
                goto L45
            L39:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L46
            L45:
                return r1
            L46:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getRealBetTicketDetail$1", f = "RealSportsRepoImpl.kt", l = {333, 333}, m = "invokeSuspend", v = 2)
    public static final class n extends tje0 implements Function2<myh<? super RTicket>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, v1b<? super n> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            n nVar = l940.this.new n(this.e, v1bVar);
            nVar.c = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super RTicket> myhVar, v1b<? super Unit> v1bVar) {
            return ((n) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.sporty.android.common.network.data.SprThrowable {
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
                goto L4a
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                h3z r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.b(r2, r6)
                if (r7 != r1) goto L37
                goto L49
            L37:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                java.lang.Object r7 = defpackage.n52.b(r7)
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L4a
            L49:
                return r1
            L4a:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getRealBetTicketDetail$2", f = "RealSportsRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class o extends tje0 implements Function2<RTicket, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public o(v1b<? super o> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            o oVar = l940.this.new o(v1bVar);
            oVar.a = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RTicket rTicket, v1b<? super Unit> v1bVar) {
            return ((o) create(rTicket, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            RTicket rTicket = (RTicket) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            l940.this.i = rTicket;
            return Unit.a;
        }
    }

    public static final class p implements lyh<BaseResponse<SearchData>> {
        public final /* synthetic */ or60 a;

        @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getSearchResults$$inlined$filter$1", f = "RealSportsRepoImpl.kt", l = {109}, m = "collect", v = 2)
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
                return p.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getSearchResults$$inlined$filter$1$2", f = "RealSportsRepoImpl.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
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
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (((BaseResponse) obj).hasData()) {
                        aVar.b = 1;
                        if (this.a.emit(obj, aVar) == y5bVar) {
                            return y5bVar;
                        }
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

        public p(or60 or60Var) {
            this.a = or60Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super BaseResponse<SearchData>> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getSearchResults$1", f = "RealSportsRepoImpl.kt", l = {87, 95}, m = "invokeSuspend", v = 2)
    public static final class q extends tje0 implements Function2<myh<? super BaseResponse<SearchData>>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ SearchRequestData d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(SearchRequestData searchRequestData, v1b<? super q> v1bVar) {
            super(2, v1bVar);
            this.d = searchRequestData;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            q qVar = l940.this.new q(this.d, v1bVar);
            qVar.b = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<SearchData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((q) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        
            if (r10.emit(r0, r14) == r11) goto L18;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.b
                r10 = r0
                myh r10 = (defpackage.myh) r10
                y5b r11 = defpackage.y5b.a
                int r0 = r14.a
                r12 = 0
                r13 = 2
                r1 = 1
                if (r0 == 0) goto L21
                if (r0 == r1) goto L1c
                if (r0 != r13) goto L16
                defpackage.uj50.b(r15)
                goto L69
            L16:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                return r12
            L1c:
                defpackage.uj50.b(r15)
                r0 = r15
                goto L55
            L21:
                defpackage.uj50.b(r15)
                l940 r0 = defpackage.l940.this
                z7h r0 = r0.f
                com.sportybet.plugin.realsports.data.SearchRequestData r2 = r14.d
                java.lang.String r3 = r2.getKeyword()
                r4 = r2
                java.lang.String r2 = r4.getSport()
                r5 = r3
                int r3 = r4.getOffset()
                r6 = r4
                int r4 = r6.getPageSize()
                r7 = r5
                java.lang.Integer r5 = r6.getKeywordType()
                java.lang.Integer r6 = r6.getProdId()
                r14.b = r10
                r14.a = r1
                r1 = r7
                r7 = 1
                r8 = 1
                r9 = r14
                java.lang.Object r0 = r0.y(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r0 != r11) goto L55
                goto L68
            L55:
                com.sporty.android.common.network.data.BaseResponse r0 = (com.sporty.android.common.network.data.BaseResponse) r0
                if (r0 != 0) goto L5e
                com.sporty.android.common.network.data.BaseResponse r0 = new com.sporty.android.common.network.data.BaseResponse
                r0.<init>()
            L5e:
                r14.b = r12
                r14.a = r13
                java.lang.Object r0 = r10.emit(r0, r14)
                if (r0 != r11) goto L69
            L68:
                return r11
            L69:
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$placeEditBet$1", f = "RealSportsRepoImpl.kt", l = {338, 338}, m = "invokeSuspend", v = 2)
    public static final class r extends tje0 implements Function2<myh<? super BaseResponse<OrderWithFailUpdate>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, v1b<? super r> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            r rVar = l940.this.new r(this.e, v1bVar);
            rVar.c = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<OrderWithFailUpdate>> myhVar, v1b<? super Unit> v1bVar) {
            return ((r) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
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
                goto L44
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                h3z r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.f(r2, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L44
            L43:
                return r1
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$verifyCode$1", f = "RealSportsRepoImpl.kt", l = {346, 346}, m = "invokeSuspend", v = 2)
    public static final class s extends tje0 implements Function2<myh<? super BaseResponse<VerifyBetData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, v1b<? super s> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s sVar = l940.this.new s(this.e, v1bVar);
            sVar.c = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<VerifyBetData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((s) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
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
                goto L44
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                l940 r7 = defpackage.l940.this
                h3z r7 = r7.b
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.h(r2, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L44
            L43:
                return r1
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l940.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l940(s840 s840Var, h3z h3zVar, g3z g3zVar, ta8 ta8Var, x430 x430Var, z7h z7hVar, asu asuVar, y8j y8jVar) {
        this.a = s840Var;
        this.b = h3zVar;
        this.c = g3zVar;
        this.d = ta8Var;
        this.e = x430Var;
        this.f = z7hVar;
        this.g = asuVar;
        this.h = y8jVar;
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<PreMatchSportsData>> A(String str) {
        str.getClass();
        or60 or60Var = new or60(new e(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.h940
    public final Object B(x1b x1bVar) {
        v940 v940Var;
        if (x1bVar instanceof v940) {
            v940Var = (v940) x1bVar;
            int i2 = v940Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v940Var.c = i2 - Integer.MIN_VALUE;
            } else {
                v940Var = new v940(this, x1bVar);
            }
        } else {
            v940Var = new v940(this, x1bVar);
        }
        Object objT = v940Var.a;
        y5b y5bVar = y5b.a;
        int i3 = v940Var.c;
        if (i3 == 0) {
            uj50.b(objT);
            v940Var.c = 1;
            objT = this.f.T(v940Var);
            if (objT == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objT);
        }
        return n52.b((BaseResponse) objT);
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<List<HotKeywordData>>> C() {
        i iVar = new i(new or60(new j(null)));
        pfd pfdVar = fse.a;
        return ozh.c(iVar, odd.b);
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<List<FeatureLaunchRate>>> D() {
        or60 or60Var = new or60(new f(null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<VerifyBetData>> E(String str) {
        or60 or60Var = new or60(new s(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.h940
    public final o940 F() {
        or60 or60Var = new or60(new p940(this, null));
        pfd pfdVar = fse.a;
        return new o940(ozh.c(or60Var, odd.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.h940
    public final Serializable G(int i2, ArrayList arrayList, List list, List list2, Long l2, Long l3, List list3, List list4, MultiMakerOddsFilterDto multiMakerOddsFilterDto, x1b x1bVar) {
        ja40 ja40Var;
        int iIntValue;
        MultiMakerMarket multiMakerMarket;
        MultiMakerOutcome multiMakerOutcome;
        if (x1bVar instanceof ja40) {
            ja40Var = (ja40) x1bVar;
            int i3 = ja40Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ja40Var.c = i3 - Integer.MIN_VALUE;
            } else {
                ja40Var = new ja40(this, x1bVar);
            }
        } else {
            ja40Var = new ja40(this, x1bVar);
        }
        Object objZ = ja40Var.a;
        y5b y5bVar = y5b.a;
        int i4 = ja40Var.c;
        if (i4 == 0) {
            uj50.b(objZ);
            MultiMakerRequest multiMakerRequest = new MultiMakerRequest(i2, arrayList, list, list2, l2, l3, new MultiMakerPreferenceDto(list3, list4, multiMakerOddsFilterDto));
            ja40Var.c = 1;
            objZ = this.f.Z(multiMakerRequest, ja40Var);
            if (objZ == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objZ);
        }
        List<MultiMakerEventDto> list5 = (List) n52.b((BaseResponse) objZ);
        list5.getClass();
        ArrayList arrayList2 = new ArrayList(l48.r(list5, 10));
        for (MultiMakerEventDto multiMakerEventDto : list5) {
            multiMakerEventDto.getClass();
            String eventId = multiMakerEventDto.getEventId();
            String str = eventId == null ? "" : eventId;
            String productStatus = multiMakerEventDto.getProductStatus();
            String str2 = productStatus == null ? "" : productStatus;
            Long estimateStartTime = multiMakerEventDto.getEstimateStartTime();
            long jLongValue = estimateStartTime != null ? estimateStartTime.longValue() : 0L;
            Integer status = multiMakerEventDto.getStatus();
            int iIntValue2 = status != null ? status.intValue() : 0;
            String matchStatus = multiMakerEventDto.getMatchStatus();
            if (matchStatus == null) {
                matchStatus = "";
            }
            String homeTeamName = multiMakerEventDto.getHomeTeamName();
            if (homeTeamName == null) {
                homeTeamName = "";
            }
            String awayTeamName = multiMakerEventDto.getAwayTeamName();
            if (awayTeamName == null) {
                awayTeamName = "";
            }
            String sportId = multiMakerEventDto.getSportId();
            if (sportId == null) {
                sportId = "";
            }
            String categoryId = multiMakerEventDto.getCategoryId();
            if (categoryId == null) {
                categoryId = "";
            }
            String tournamentId = multiMakerEventDto.getTournamentId();
            if (tournamentId == null) {
                iIntValue = 0;
                tournamentId = "";
            } else {
                iIntValue = 0;
            }
            MultiMakerEvent multiMakerEvent = new MultiMakerEvent(str, str2, matchStatus, homeTeamName, awayTeamName, sportId, categoryId, tournamentId, jLongValue, iIntValue2);
            MultiMakerMarketDto market = multiMakerEventDto.getMarket();
            if (market != null) {
                String id = market.getId();
                if (id == null) {
                    id = "";
                }
                String specifier = market.getSpecifier();
                if (specifier == null) {
                    specifier = "";
                }
                Integer product = market.getProduct();
                int iIntValue3 = product != null ? product.intValue() : iIntValue;
                String desc = market.getDesc();
                if (desc == null) {
                    desc = "";
                }
                Integer status2 = market.getStatus();
                multiMakerMarket = new MultiMakerMarket(id, iIntValue3, status2 != null ? status2.intValue() : iIntValue, specifier, desc);
            } else {
                multiMakerMarket = new MultiMakerMarket(iIntValue);
            }
            MultiMakerMarketDto market2 = multiMakerEventDto.getMarket();
            MultiMakerOutcomeDto outcome = market2 != null ? market2.getOutcome() : null;
            if (outcome != null) {
                String id2 = outcome.getId();
                if (id2 == null) {
                    id2 = "";
                }
                String odds = outcome.getOdds();
                if (odds == null) {
                    odds = "";
                }
                String probability = outcome.getProbability();
                if (probability == null) {
                    probability = "";
                }
                Integer numIsActive = outcome.isActive();
                if (numIsActive != null) {
                    iIntValue = numIsActive.intValue();
                }
                String desc2 = outcome.getDesc();
                multiMakerOutcome = new MultiMakerOutcome(id2, odds, probability, desc2 != null ? desc2 : "", iIntValue, 32, 0);
            } else {
                multiMakerOutcome = new MultiMakerOutcome(null, null, null, null, 0, 63, 0);
            }
            arrayList2.add(new MultiMakerItem(multiMakerEvent, multiMakerMarket, multiMakerOutcome, 24));
        }
        return arrayList2;
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<TimeFilterEventCountData>> H(String str) {
        str.getClass();
        or60 or60Var = new or60(new d(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<OrderWithFailUpdate>> I(String str) {
        or60 or60Var = new or60(new r(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h940
    public final Object J(ArrayList arrayList, Collection collection, x1b x1bVar) {
        k940 k940Var;
        if (x1bVar instanceof k940) {
            k940Var = (k940) x1bVar;
            int i2 = k940Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k940Var.c = i2 - Integer.MIN_VALUE;
            } else {
                k940Var = new k940(this, x1bVar);
            }
        } else {
            k940Var = new k940(this, x1bVar);
        }
        Object objD = k940Var.a;
        y5b y5bVar = y5b.a;
        int i3 = k940Var.c;
        if (i3 == 0) {
            uj50.b(objD);
            ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                arrayList2.add(hm9.a((LiabilityCheckSelection) obj));
            }
            LiabilityCheckRequest liabilityCheckRequest = new LiabilityCheckRequest(arrayList2, collection);
            k940Var.c = 1;
            objD = this.b.d(liabilityCheckRequest, k940Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        BaseResponse baseResponse = (BaseResponse) objD;
        LiabilityCheckResultResponse liabilityCheckResultResponse = (LiabilityCheckResultResponse) baseResponse.data;
        if ((liabilityCheckResultResponse != null ? LiabilityCheckResultTypeDto.INSTANCE.fromValue(liabilityCheckResultResponse.getTypeId()) : null) != LiabilityCheckResultTypeDto.ACCEPT) {
            LiabilityCheckResultResponse liabilityCheckResultResponse2 = (LiabilityCheckResultResponse) baseResponse.data;
            this.h.f("CHECK_SR_LIABILITY_FAILED", jpu.b(new Pair("type", liabilityCheckResultResponse2 != null ? liabilityCheckResultResponse2.getTypeId() : null)));
        }
        return objD;
    }

    @Override // defpackage.h940
    public final ct90<BaseResponse<OrderWithFailUpdate>> a(String str) {
        str.getClass();
        return this.b.a(str);
    }

    @Override // defpackage.h940
    @fae
    public final yzh b() {
        g1i g1iVar = new g1i(new or60(new w940(this, null)), new x940(2, null));
        pfd pfdVar = fse.a;
        return new yzh(ozh.c(g1iVar, odd.b), new y940(3, null));
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<OddsFilterEventCountData>> c(String str) {
        str.getClass();
        or60 or60Var = new or60(new c(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.h940
    public final ct90<BaseResponse<List<BroadcastConfig>>> d() {
        return this.d.d();
    }

    @Override // defpackage.h940
    public final lyh e(QuickLiabilityCheckRequestDto quickLiabilityCheckRequestDto) {
        yzh yzhVarB = bm50.b(new or60(new ia40(this, quickLiabilityCheckRequestDto, null)), vch0.b);
        pfd pfdVar = fse.a;
        return ozh.c(yzhVarB, odd.b);
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<List<MarketGroupData>>> f(String str, String str2) {
        or60 or60Var = new or60(new m(str, str2, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<SearchData>> g(SearchRequestData searchRequestData) {
        p pVar = new p(new or60(new q(searchRequestData, null)));
        pfd pfdVar = fse.a;
        return ozh.c(pVar, odd.b);
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<List<nof>>> h(String str) {
        str.getClass();
        or60 or60Var = new or60(new b(str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.h940
    public final ca40 i(String str) {
        or60 or60Var = new or60(new da40(this, str, null));
        pfd pfdVar = fse.a;
        return new ca40(ozh.c(or60Var, odd.b));
    }

    @Override // defpackage.h940
    public final ea40 j() {
        or60 or60Var = new or60(new fa40(this, null));
        pfd pfdVar = fse.a;
        return new ea40(ozh.c(or60Var, odd.b));
    }

    @Override // defpackage.h940
    public final lyh k(Integer num, String str) {
        or60 or60Var = new or60(new q940(this, num, str, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.h940
    public final lyh l(String str, String str2, String str3, String str4) {
        str.getClass();
        or60 or60Var = new or60(new z940(this, str, str2, str3, str4, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.h940
    public final r940 m(String str) {
        str.getClass();
        or60 or60Var = new or60(new s940(this, str, null));
        pfd pfdVar = fse.a;
        return new r940(ozh.c(or60Var, odd.b));
    }

    @Override // defpackage.h940
    public final yzh n(int i2, String str) {
        str.getClass();
        or60 or60Var = new or60(new m940(this, str, null));
        pfd pfdVar = fse.a;
        return new yzh(ozh.c(or60Var, odd.b), new n940(i2, null));
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<OddsBoostRtpRatioResponse>> o() {
        or60 or60Var = new or60(new k(null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<FirstSearchResult>> p(String str) {
        str.getClass();
        g gVar = new g(new or60(new h(str, null)));
        pfd pfdVar = fse.a;
        return ozh.c(gVar, odd.b);
    }

    @Override // defpackage.h940
    public final lyh<RTicket> q(String str) {
        str.getClass();
        g1i g1iVar = new g1i(new or60(new n(str, null)), new o(null));
        pfd pfdVar = fse.a;
        return ozh.c(g1iVar, odd.b);
    }

    @Override // defpackage.h940
    public final ga40 r(String str) {
        str.getClass();
        or60 or60Var = new or60(new ha40(this, str, null));
        pfd pfdVar = fse.a;
        return new ga40(ozh.c(or60Var, odd.b));
    }

    @Override // defpackage.h940
    public final i940 s(String str, String str2) {
        or60 or60Var = new or60(new j940(this, str, str2, null));
        pfd pfdVar = fse.a;
        return new i940(ozh.c(or60Var, odd.b));
    }

    @Override // defpackage.h940
    public final lyh<BaseResponse<List<OutrightEvent>>> t(String str, String str2) {
        str.getClass();
        or60 or60Var = new or60(new l(str, str2, null));
        pfd pfdVar = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.h940
    public final lyh<lk50<List<String>>> u() {
        yzh yzhVarA = bm50.a(new or60(new a(null)));
        pfd pfdVar = fse.a;
        return ozh.c(yzhVarA, odd.b);
    }

    @Override // defpackage.h940
    public final Object v(QuickMarketSpotEnum quickMarketSpotEnum, String str, ajw ajwVar) throws Throwable {
        bc6 bc6Var = new bc6(1, yzo.b(ajwVar));
        bc6Var.q();
        QuickMarketHelper.fetch(quickMarketSpotEnum, str, new t940(bc6Var));
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.h940
    public final Object w(String str, int i2, Long l2, Long l3, x1b x1bVar) {
        u940 u940Var;
        if (x1bVar instanceof u940) {
            u940Var = (u940) x1bVar;
            int i3 = u940Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u940Var.c = i3 - Integer.MIN_VALUE;
            } else {
                u940Var = new u940(this, x1bVar);
            }
        } else {
            u940Var = new u940(this, x1bVar);
        }
        u940 u940Var2 = u940Var;
        Object objC = u940Var2.a;
        y5b y5bVar = y5b.a;
        int i4 = u940Var2.c;
        if (i4 == 0) {
            uj50.b(objC);
            u940Var2.c = 1;
            objC = this.f.C(str, i2, l2, l3, u940Var2);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
        }
        return ((MultiMakerLeagueOptionsResponse) n52.b((BaseResponse) objC)).getLeagues();
    }

    @Override // defpackage.h940
    public final void x() {
        this.i = null;
    }

    @Override // defpackage.h940
    public final RTicket y() {
        return this.i;
    }

    @Override // defpackage.h940
    public final aa40 z(String str) {
        or60 or60Var = new or60(new ba40(this, str, null));
        pfd pfdVar = fse.a;
        return new aa40(ozh.c(or60Var, odd.b));
    }
}
