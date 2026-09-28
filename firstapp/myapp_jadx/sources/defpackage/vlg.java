package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.roomcache.cacheio.EventCacheIO$deleteEvents$2", f = "EventCacheIO.kt", l = {142, 143, 144, 145}, m = "invokeSuspend", v = 2)
public final class vlg extends tje0 implements Function2<v5b, v1b<? super zi50<? extends Unit>>, Object> {
    public pjd a;
    public ojd b;
    public ojd c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ kmg f;

    @c0d(c = "com.sportybet.roomcache.cacheio.EventCacheIO$deleteEvents$2$1$deleteBetBuilderMarkets$1", f = "EventCacheIO.kt", l = {141}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ kmg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kmg kmgVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = kmgVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                dlg dlgVarF = this.b.f();
                this.a = 1;
                if (dlgVarF.d(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.roomcache.cacheio.EventCacheIO$deleteEvents$2$1$deleteEvent$1", f = "EventCacheIO.kt", l = {138}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ kmg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kmg kmgVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = kmgVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                dlg dlgVarF = this.b.f();
                this.a = 1;
                if (dlgVarF.a(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.roomcache.cacheio.EventCacheIO$deleteEvents$2$1$deleteFavoriteMarketIds$1", f = "EventCacheIO.kt", l = {140}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ kmg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kmg kmgVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = kmgVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                dlg dlgVarF = this.b.f();
                this.a = 1;
                if (dlgVarF.j(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.roomcache.cacheio.EventCacheIO$deleteEvents$2$1$deleteMarketGroups$1", f = "EventCacheIO.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ kmg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kmg kmgVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = kmgVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                dlg dlgVarF = this.b.f();
                this.a = 1;
                if (dlgVarF.i(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlg(kmg kmgVar, v1b<? super vlg> v1bVar) {
        super(2, v1bVar);
        this.f = kmgVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vlg vlgVar = new vlg(this.f, v1bVar);
        vlgVar.e = obj;
        return vlgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends Unit>> v1bVar) {
        return ((vlg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b A[Catch: all -> 0x00b1, PHI: r0
      0x009b: PHI (r0v6 ojd) = (r0v5 ojd), (r0v9 ojd) binds: [B:30:0x0098, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00b1, blocks: (B:8:0x0017, B:35:0x00ac, B:13:0x0024, B:32:0x009b, B:16:0x002d, B:29:0x008a, B:19:0x0037, B:26:0x0079, B:22:0x0040), top: B:44:0x000d }] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r0.await(r11) == r1) goto L34;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
