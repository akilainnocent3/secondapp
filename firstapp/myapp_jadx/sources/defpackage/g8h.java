package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.plugin.realsports.data.BetBuilderMarket;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.LiveStreamDataParser;
import com.sportybet.plugin.realsports.data.LiveStreamResponse;
import com.sportybet.plugin.realsports.data.PopularAndSportData;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.SportGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class g8h implements e8h {
    public final z7h a;
    public final psm b;
    public final uqm c;
    public final odd d;
    public final LiveStreamDataParser e;
    public final mpe0 f;

    @c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getBetBuilderMarkets$1", f = "FactsCenterRepoImpl.kt", l = {61, 61}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<List<? extends BetBuilderMarket>>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = g8h.this.new a(this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<List<? extends BetBuilderMarket>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                g8h r7 = defpackage.g8h.this
                z7h r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.a(r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: g8h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getConfigurableLiveEvents$1", f = "FactsCenterRepoImpl.kt", l = {253, 262}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super List<? extends Event>>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ List<String> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z, boolean z2, List<String> list, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.d = str;
            this.e = z;
            this.f = z2;
            this.i = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = g8h.this.new b(this.d, this.e, this.f, this.i, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super List<? extends Event>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        
            if (r0.emit(r12, r11) == r1) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.io.IOException {
            /*
                r12 = this;
                java.lang.Object r0 = r12.b
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r12.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L20
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                defpackage.uj50.b(r13)
                goto L50
            L15:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                return r3
            L1b:
                defpackage.uj50.b(r13)
                r11 = r12
                goto L3b
            L20:
                defpackage.uj50.b(r13)
                g8h r13 = defpackage.g8h.this
                z7h r6 = r13.a
                r12.b = r0
                r12.a = r5
                java.lang.String r7 = r12.d
                boolean r8 = r12.e
                boolean r9 = r12.f
                java.util.List<java.lang.String> r10 = r12.i
                r11 = r12
                java.lang.Object r13 = r6.d0(r7, r8, r9, r10, r11)
                if (r13 != r1) goto L3b
                goto L4f
            L3b:
                com.sporty.android.common.network.data.BaseResponse r13 = (com.sporty.android.common.network.data.BaseResponse) r13
                boolean r12 = r13.hasData()
                if (r12 == 0) goto L53
                T r12 = r13.data
                r11.b = r3
                r11.a = r4
                java.lang.Object r12 = r0.emit(r12, r11)
                if (r12 != r1) goto L50
            L4f:
                return r1
            L50:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            L53:
                java.lang.String r12 = r13.message
                defpackage.i08.a(r12)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: g8h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getCountries$1", f = "FactsCenterRepoImpl.kt", l = {148, 160}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super SportGroup>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.d = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = g8h.this.new c(this.d, v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super SportGroup> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r0.emit(r14, r13) == r1) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.io.IOException {
            /*
                r14 = this;
                java.lang.Object r0 = r14.b
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r14.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L20
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                defpackage.uj50.b(r15)
                goto L4f
            L15:
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r14)
                return r3
            L1b:
                defpackage.uj50.b(r15)
                r13 = r14
                goto L3a
            L20:
                defpackage.uj50.b(r15)
                g8h r15 = defpackage.g8h.this
                z7h r6 = r15.a
                r14.b = r0
                r14.a = r5
                java.lang.String r7 = r14.d
                r8 = 3
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = r14
                java.lang.Object r15 = r6.i(r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r1) goto L3a
                goto L4e
            L3a:
                com.sporty.android.common.network.data.BaseResponse r15 = (com.sporty.android.common.network.data.BaseResponse) r15
                boolean r14 = r15.hasData()
                if (r14 == 0) goto L52
                T r14 = r15.data
                r13.b = r3
                r13.a = r4
                java.lang.Object r14 = r0.emit(r14, r13)
                if (r14 != r1) goto L4f
            L4e:
                return r1
            L4f:
                kotlin.Unit r14 = kotlin.Unit.a
                return r14
            L52:
                java.lang.String r14 = r15.message
                defpackage.i08.a(r14)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: g8h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getLiveSportList$1", f = "FactsCenterRepoImpl.kt", l = {229, 244}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super List<? extends Sport>>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = g8h.this.new d(v1bVar);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super List<? extends Sport>> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L24;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.io.IOException, com.sportybet.plugin.realsports.data.ServerProductStatus.ProductDownException {
            /*
                r7 = this;
                java.lang.Object r0 = r7.b
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.a
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r8)
                goto L62
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r4
            L1b:
                defpackage.uj50.b(r8)
                goto L34
            L1f:
                defpackage.uj50.b(r8)
                g8h r8 = defpackage.g8h.this
                z7h r8 = r8.a
                r7.b = r0
                r7.a = r5
                java.lang.String r2 = "1"
                r6 = 0
                java.lang.Object r8 = r8.z(r5, r2, r6, r7)
                if (r8 != r1) goto L34
                goto L61
            L34:
                com.sporty.android.common.network.data.BaseResponse r8 = (com.sporty.android.common.network.data.BaseResponse) r8
                boolean r2 = r8.hasData()
                java.lang.String r5 = r8.message
                if (r2 == 0) goto L65
                com.sportybet.plugin.realsports.data.ServerProductStatus r2 = com.sportybet.plugin.realsports.data.ServerProductStatusHelper.getServerProductStatus(r5)
                if (r2 == 0) goto L55
                com.sportybet.plugin.realsports.data.ServerProductStatus$Product r5 = com.sportybet.plugin.realsports.data.ServerProductStatus.Product.LIVE_EVENTS
                boolean r2 = r2.isInServing(r5)
                if (r2 == 0) goto L4d
                goto L55
            L4d:
                com.sportybet.plugin.realsports.data.ServerProductStatus$ProductDownException r7 = new com.sportybet.plugin.realsports.data.ServerProductStatus$ProductDownException
                java.lang.String r8 = r8.message
                r7.<init>(r8)
                throw r7
            L55:
                T r8 = r8.data
                r7.b = r4
                r7.a = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L62
            L61:
                return r1
            L62:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L65:
                defpackage.i08.a(r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: g8h.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getLiveStreamData$1", f = "FactsCenterRepoImpl.kt", l = {165, 167, 181, 184}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<myh<? super qus>, v1b<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        @c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getLiveStreamData$1$2$result$1", f = "FactsCenterRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements iaj<Integer, LiveStreamResponse, String, v1b<? super qus>, Object> {
            public /* synthetic */ Integer a;
            public /* synthetic */ LiveStreamResponse b;
            public /* synthetic */ String c;
            public final /* synthetic */ g8h d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g8h g8hVar, v1b<? super a> v1bVar) {
                super(4, v1bVar);
                this.d = g8hVar;
            }

            @Override // defpackage.iaj
            public final Object d(Integer num, LiveStreamResponse liveStreamResponse, String str, v1b<? super qus> v1bVar) {
                a aVar = new a(this.d, v1bVar);
                aVar.a = num;
                aVar.b = liveStreamResponse;
                aVar.c = str;
                return aVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                LiveStreamDataParser liveStreamDataParser = this.d.e;
                Integer num = this.a;
                LiveStreamResponse liveStreamResponse = this.b;
                String str = this.c;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                if (num == null || num.intValue() != 10000) {
                    return (num != null && num.intValue() == 19004) ? qus.c.a : new qus.a(str);
                }
                if (liveStreamResponse == null) {
                    return new qus.a("Empty data");
                }
                new qus.b(liveStreamDataParser.parse(liveStreamResponse));
                return new qus.b(liveStreamDataParser.parse(liveStreamResponse));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = g8h.this.new e(this.e, v1bVar);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super qus> myhVar, v1b<? super Unit> v1bVar) {
            return ((e) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:62:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:64:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:67:0x010f  */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00eb, code lost:
        
            if (r0.emit((defpackage.qus) r13, r12) == r1) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x010c, code lost:
        
            if (r0.emit(r3, r12) == r1) goto L66;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: g8h.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getOutrightDetails$1", f = "FactsCenterRepoImpl.kt", l = {51, 51}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<myh<? super BaseResponse<Event>>, v1b<? super Unit>, Object> {
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
            f fVar = g8h.this.new f(this.e, v1bVar);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<Event>> myhVar, v1b<? super Unit> v1bVar) {
            return ((f) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
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
                g8h r7 = defpackage.g8h.this
                z7h r7 = r7.a
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r4 = r6.e
                java.lang.Object r7 = r7.r(r4, r2, r6)
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
            throw new UnsupportedOperationException("Method not decompiled: g8h.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getPopularAndSportList$1", f = "FactsCenterRepoImpl.kt", l = {221, 225}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<myh<? super PopularAndSportData>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = g8h.this.new g(v1bVar);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super PopularAndSportData> myhVar, v1b<? super Unit> v1bVar) {
            return ((g) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.io.IOException {
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
                g8h r7 = defpackage.g8h.this
                z7h r7 = r7.a
                r6.b = r0
                r6.a = r5
                java.lang.Object r7 = r7.v(r6)
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
                java.lang.String r6 = r7.message
                defpackage.i08.a(r6)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: g8h.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getRadioStreamData$1", f = "FactsCenterRepoImpl.kt", l = {190, 212}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<myh<? super String>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, v1b<? super h> v1bVar) {
            super(2, v1bVar);
            this.d = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = g8h.this.new h(this.d, v1bVar);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super String> myhVar, v1b<? super Unit> v1bVar) {
            return ((h) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x008c  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L48;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: g8h.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl$getRecommendation$1", f = "FactsCenterRepoImpl.kt", l = {266, 270}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<myh<? super List<? extends Event>>, v1b<? super Unit>, Object> {
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
            i iVar = g8h.this.new i(this.d, v1bVar);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super List<? extends Event>> myhVar, v1b<? super Unit> v1bVar) {
            return ((i) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.io.IOException {
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
                goto L48
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r3
            L1b:
                defpackage.uj50.b(r7)
                goto L33
            L1f:
                defpackage.uj50.b(r7)
                g8h r7 = defpackage.g8h.this
                z7h r7 = r7.a
                r6.b = r0
                r6.a = r5
                java.lang.String r2 = r6.d
                java.lang.Object r7 = r7.M(r2, r6)
                if (r7 != r1) goto L33
                goto L47
            L33:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                boolean r2 = r7.hasData()
                if (r2 == 0) goto L4b
                T r7 = r7.data
                r6.b = r3
                r6.a = r4
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            L4b:
                java.lang.String r6 = r7.message
                defpackage.i08.a(r6)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: g8h.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public g8h(z7h z7hVar, psm psmVar, uqm uqmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, LiveStreamDataParser liveStreamDataParser) {
        z7hVar.getClass();
        psmVar.getClass();
        uqmVar.getClass();
        this.a = z7hVar;
        this.b = psmVar;
        this.c = uqmVar;
        this.d = oddVar;
        this.e = liveStreamDataParser;
        this.f = hwr.b(new f8h(0));
    }

    @Override // defpackage.e8h
    public final lyh<PopularAndSportData> a() {
        return ozh.c(new or60(new g(null)), this.d);
    }

    @Override // defpackage.e8h
    public final lyh<String> b(String str) {
        str.getClass();
        return ozh.c(new or60(new h(str, null)), this.d);
    }

    @Override // defpackage.e8h
    public final lyh<List<Event>> c(String str) {
        return ozh.c(new or60(new i(str, null)), this.d);
    }

    @Override // defpackage.e8h
    public final lyh d(String str) {
        str.getClass();
        return ozh.c(new or60(new m8h(this, str, null)), this.d);
    }

    @Override // defpackage.e8h
    public final lyh<List<Event>> e(String str, boolean z, boolean z2, List<String> list) {
        str.getClass();
        return ozh.c(new or60(new b(str, z, z2, list, null)), this.d);
    }

    @Override // defpackage.e8h
    public final or60 f(int i2, int i3, String str) {
        str.getClass();
        return new or60(new h8h(this, i2, str, i3, null));
    }

    @Override // defpackage.e8h
    public final lyh<BaseResponse<List<BetBuilderMarket>>> g(String str) {
        return ozh.c(new or60(new a(str, null)), this.d);
    }

    @Override // defpackage.e8h
    public final lyh h(String str, String str2) {
        str2.getClass();
        return ozh.c(new or60(new n8h(this, str, str2, null)), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.e8h
    public final Object i(String str, x1b x1bVar) {
        l8h l8hVar;
        if (x1bVar instanceof l8h) {
            l8hVar = (l8h) x1bVar;
            int i2 = l8hVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l8hVar.c = i2 - Integer.MIN_VALUE;
            } else {
                l8hVar = new l8h(this, x1bVar);
            }
        } else {
            l8hVar = new l8h(this, x1bVar);
        }
        Object objY = l8hVar.a;
        y5b y5bVar = y5b.a;
        int i3 = l8hVar.c;
        if (i3 == 0) {
            uj50.b(objY);
            String str2 = tva.a;
            l8hVar.c = 1;
            objY = this.a.Y(str, str2, l8hVar);
            if (objY == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objY);
        }
        return n52.b((BaseResponse) objY);
    }

    @Override // defpackage.e8h
    public final lyh<qus> k(String str) {
        str.getClass();
        return ozh.c(new or60(new e(str, null)), this.d);
    }

    @Override // defpackage.e8h
    public final Object l(jqa0 jqa0Var, String str, x1b x1bVar) {
        return this.a.x(jqa0Var.a, str, x1bVar);
    }

    @Override // defpackage.e8h
    public final lyh m() {
        return ozh.c(new n1i(new or60(new i8h(this, null)), new or60(new j8h(this, null)), new k8h(3, null)), this.d);
    }

    @Override // defpackage.e8h
    public final lyh<List<Sport>> n() {
        return ozh.c(new or60(new d(null)), this.d);
    }

    @Override // defpackage.e8h
    public final lyh<SportGroup> o(String str) {
        str.getClass();
        return ozh.c(new or60(new c(str, null)), this.d);
    }

    @Override // defpackage.e8h
    public final lyh<BaseResponse<Event>> p(String str) {
        str.getClass();
        return ozh.c(new or60(new f(str, null)), this.d);
    }
}
