package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingEventInfo;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingMarketInfo;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingRoundInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantRacingRepoImpl$getEventInfo$2$1", f = "InstantRacingRepoImpl.kt", l = {62, 63}, m = "invokeSuspend", v = 2)
public final class y2o extends tje0 implements Function2<v5b, v1b<? super dun>, Object> {
    public pjd a;
    public NetworkInstantRacingMarketInfo b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e3o e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean v;

    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantRacingRepoImpl$getEventInfo$2$1$marketInfoDeferred$1", f = "InstantRacingRepoImpl.kt", l = {46}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super NetworkInstantRacingMarketInfo>, Object> {
        public int a;
        public final /* synthetic */ e3o b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e3o e3oVar, String str, String str2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = e3oVar;
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super NetworkInstantRacingMarketInfo> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            osn osnVar = this.b.a;
            this.a = 1;
            Object objH = osnVar.h(this.c, this.d, psn.a, this);
            return objH == y5bVar ? y5bVar : objH;
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.data.repository.InstantRacingRepoImpl$getEventInfo$2$1$roundInfoAndEventEnvelopeDeferred$1", f = "InstantRacingRepoImpl.kt", l = {50, 52, 55, 57}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Pair<? extends NetworkInstantRacingRoundInfo, ? extends NetworkInstantRacingEventInfo>>, Object> {
        public NetworkInstantRacingRoundInfo a;
        public int b;
        public final /* synthetic */ e3o c;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e3o e3oVar, String str, boolean z, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = e3oVar;
            this.d = str;
            this.e = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Pair<? extends NetworkInstantRacingRoundInfo, ? extends NetworkInstantRacingEventInfo>> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        
            if (r11 == r2) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        
            if (r11 == r2) goto L33;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                e3o r0 = r10.c
                osn r1 = r0.a
                mgb0 r0 = r0.b
                y5b r2 = defpackage.y5b.a
                int r3 = r10.b
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.String r8 = r10.d
                if (r3 == 0) goto L36
                if (r3 == r7) goto L32
                if (r3 == r6) goto L2e
                if (r3 == r5) goto L28
                if (r3 != r4) goto L21
                com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingRoundInfo r10 = r10.a
                defpackage.uj50.b(r11)
                goto L85
            L21:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                r10 = 0
                return r10
            L28:
                com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingRoundInfo r10 = r10.a
                defpackage.uj50.b(r11)
                goto L72
            L2e:
                defpackage.uj50.b(r11)
                goto L5a
            L32:
                defpackage.uj50.b(r11)
                goto L4c
            L36:
                defpackage.uj50.b(r11)
                boolean r11 = r0.isLogin()
                boolean r3 = r10.e
                if (r11 == 0) goto L4f
                r10.b = r7
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r11 = defpackage.psn.a
                java.lang.Object r11 = r1.k(r8, r3, r11, r10)
                if (r11 != r2) goto L4c
                goto L81
            L4c:
                com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingRoundInfo r11 = (com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingRoundInfo) r11
                goto L5c
            L4f:
                r10.b = r6
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r11 = defpackage.psn.a
                java.lang.Object r11 = r1.j(r8, r3, r11, r10)
                if (r11 != r2) goto L5a
                goto L81
            L5a:
                com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingRoundInfo r11 = (com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingRoundInfo) r11
            L5c:
                boolean r0 = r0.isLogin()
                if (r0 == 0) goto L75
                r10.a = r11
                r10.b = r5
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r0 = defpackage.psn.a
                java.lang.Object r10 = r1.i(r8, r0, r10)
                if (r10 != r2) goto L6f
                goto L81
            L6f:
                r9 = r11
                r11 = r10
                r10 = r9
            L72:
                com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingEventInfo r11 = (com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingEventInfo) r11
                goto L87
            L75:
                r10.a = r11
                r10.b = r4
                com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r0 = defpackage.psn.a
                java.lang.Object r10 = r1.g(r8, r0, r10)
                if (r10 != r2) goto L82
            L81:
                return r2
            L82:
                r9 = r11
                r11 = r10
                r10 = r9
            L85:
                com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingEventInfo r11 = (com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingEventInfo) r11
            L87:
                kotlin.Pair r0 = new kotlin.Pair
                r0.<init>(r10, r11)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: y2o.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2o(e3o e3oVar, String str, String str2, boolean z, v1b<? super y2o> v1bVar) {
        super(2, v1bVar);
        this.e = e3oVar;
        this.f = str;
        this.i = str2;
        this.v = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        y2o y2oVar = new y2o(this.e, this.f, this.i, this.v, v1bVar);
        y2oVar.d = obj;
        return y2oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super dun> v1bVar) {
        return ((y2o) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:313:0x051d  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r0 == r2) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v34, types: [m2g] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7, types: [m2g] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v16, types: [m2g] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r39v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v24, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [m2g] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v28, types: [m2g] */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Iterable] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y2o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
