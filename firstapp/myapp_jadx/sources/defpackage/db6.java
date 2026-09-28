package defpackage;

import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.common.network.campaign.CampaignsData;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.compose.lobbyv2.models.UIState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ldb6;", "Lj8i0;", "Lxjj;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class db6 extends j8i0 implements xjj {
    public String c;
    public String i;
    public volatile long y;
    public final u86 a = new u86();
    public final ttr b = hwr.a(a1s.a, new e());
    public final ssw<UIState<HTTPResponse<Campaign>>> d = new ssw<>();
    public final ssw<UIState<HTTPResponse<String>>> e = new ssw<>();
    public List<String> f = m2g.a;
    public final b390 v = d390.b(0, 0, null, 7);
    public final b390 w = d390.b(0, 0, null, 7);

    @c0d(c = "com.sportygames.compose.campaign.CampaignViewModel$collectGifts$2", f = "CampaignViewModel.kt", l = {161}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ Function0<Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Function0<Unit> function0, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = i;
            this.d = function0;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return db6.this.new a(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            db6 db6Var = db6.this;
            if (i == 0) {
                uj50.b(obj);
                u86 u86Var = db6Var.a;
                this.a = 1;
                u86Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new f86(this.c, null), null), this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ResultWrapper resultWrapper = (ResultWrapper) obj;
            boolean z = resultWrapper instanceof ResultWrapper.Success;
            ssw<UIState<HTTPResponse<String>>> sswVar = db6Var.e;
            if (z) {
                UIState.Companion companion = UIState.INSTANCE;
                Object value = ((ResultWrapper.Success) resultWrapper).getValue();
                companion.getClass();
                sswVar.j(UIState.Companion.c(value));
                this.d.invoke();
            } else {
                UIState.INSTANCE.getClass();
                sswVar.j(UIState.Companion.b());
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.compose.campaign.CampaignViewModel$getCampaignData$2", f = "CampaignViewModel.kt", l = {112, 114, 119, 129}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public int b;
        public final /* synthetic */ Integer d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Function0<Unit> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Integer num, String str, Function0<Unit> function0, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.d = num;
            this.e = str;
            this.f = function0;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return db6.this.new b(this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:41:0x00df A[PHI: r1 r12
          0x00df: PHI (r1v7 int) = (r1v6 int), (r1v8 int) binds: [B:39:0x00dc, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]
          0x00df: PHI (r12v33 java.lang.Object) = (r12v31 java.lang.Object), (r12v0 java.lang.Object) binds: [B:39:0x00dc, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:52:0x012e  */
        /* JADX WARN: Code duplicated, block: B:53:0x0141  */
        /* JADX WARN: Code duplicated, block: B:54:0x0152  */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0125, code lost:
        
            if (r2.emit(r12, r11) == r0) goto L50;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 359
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: db6.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.compose.campaign.CampaignViewModel$getCampaignUserJourney$1", f = "CampaignViewModel.kt", l = {80, 83, 85}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public HTTPResponse a;
        public int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ db6 d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, db6 db6Var, boolean z, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = i;
            this.d = db6Var;
            this.e = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0050  */
        /* JADX WARN: Code duplicated, block: B:22:0x006a A[PHI: r1
          0x006a: PHI (r1v7 com.sportygames.commons.remote.model.HTTPResponse) = (r1v6 com.sportygames.commons.remote.model.HTTPResponse), (r1v10 com.sportygames.commons.remote.model.HTTPResponse) binds: [B:20:0x0067, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:24:0x006e  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
        
            if (r8.f(r1, java.lang.System.currentTimeMillis(), r7) == r0) goto L26;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.b
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                db6 r6 = r7.d
                if (r1 == 0) goto L27
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L17
                defpackage.uj50.b(r8)
                goto L8b
            L17:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L1d:
                com.sportygames.commons.remote.model.HTTPResponse r1 = r7.a
                defpackage.uj50.b(r8)
                goto L6a
            L23:
                defpackage.uj50.b(r8)
                goto L4a
            L27:
                defpackage.uj50.b(r8)
                int r8 = r7.c
                if (r8 == 0) goto L8b
                u86 r1 = r6.a
                r7.b = r4
                r1.getClass()
                pfd r1 = defpackage.fse.a
                odd r1 = defpackage.odd.b
                g86 r4 = new g86
                r4.<init>(r8, r5)
                a52 r8 = new a52
                r8.<init>(r4, r5)
                java.lang.Object r8 = defpackage.ej5.d(r1, r8, r7)
                if (r8 != r0) goto L4a
                goto L8a
            L4a:
                com.sportygames.commons.remote.model.ResultWrapper r8 = (com.sportygames.commons.remote.model.ResultWrapper) r8
                boolean r1 = r8 instanceof com.sportygames.commons.remote.model.ResultWrapper.Success
                if (r1 == 0) goto L8b
                com.sportygames.commons.remote.model.ResultWrapper$Success r8 = (com.sportygames.commons.remote.model.ResultWrapper.Success) r8
                java.lang.Object r8 = r8.getValue()
                r1 = r8
                com.sportygames.commons.remote.model.HTTPResponse r1 = (com.sportygames.commons.remote.model.HTTPResponse) r1
                b390 r8 = r6.w
                java.lang.Object r4 = r1.getData()
                r7.a = r1
                r7.b = r3
                java.lang.Object r8 = r8.emit(r4, r7)
                if (r8 != r0) goto L6a
                goto L8a
            L6a:
                boolean r8 = r7.e
                if (r8 != 0) goto L8b
                ttr r8 = r6.b
                java.lang.Object r8 = r8.getValue()
                xrm r8 = (defpackage.xrm) r8
                java.lang.Object r1 = r1.getData()
                com.sportygames.common.network.campaign.Campaign r1 = (com.sportygames.common.network.campaign.Campaign) r1
                r7.a = r5
                r7.b = r2
                long r2 = java.lang.System.currentTimeMillis()
                java.lang.Object r7 = r8.f(r1, r2, r7)
                if (r7 != r0) goto L8b
            L8a:
                return r0
            L8b:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: db6.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.compose.campaign.CampaignViewModel$getCampaigns$1", f = "CampaignViewModel.kt", l = {53, 57, 60}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public CampaignsData a;
        public db6 b;
        public Function1 c;
        public CampaignsData d;
        public int e;
        public final /* synthetic */ String i;
        public final /* synthetic */ Function1<CampaignsData, Unit> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Function1<? super CampaignsData, Unit> function1, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.i = str;
            this.v = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return db6.this.new d(this.i, this.v, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[Catch: Exception -> 0x00e4, TryCatch #0 {Exception -> 0x00e4, blocks: (B:8:0x0016, B:38:0x00cc, B:13:0x0023, B:31:0x00a7, B:33:0x00b1, B:27:0x0082), top: B:44:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00b1 A[Catch: Exception -> 0x00e4, TryCatch #0 {Exception -> 0x00e4, blocks: (B:8:0x0016, B:38:0x00cc, B:13:0x0023, B:31:0x00a7, B:33:0x00b1, B:27:0x0082), top: B:44:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            CampaignsData campaignsData;
            db6 db6Var;
            Function1<CampaignsData, Unit> function1;
            b390 b390Var;
            Boolean bool;
            CampaignsData campaignsData2;
            db6 db6Var2;
            Function1<CampaignsData, Unit> function2;
            y5b y5bVar = y5b.a;
            int i = this.e;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    if (db6.this.y != 0 && System.currentTimeMillis() - db6.this.y < 1000) {
                        db6.this.y = System.currentTimeMillis();
                        return Unit.a;
                    }
                    db6.this.y = System.currentTimeMillis();
                    u86 u86Var = db6.this.a;
                    String str = this.i;
                    this.e = 1;
                    u86Var.getClass();
                    pfd pfdVar = fse.a;
                    obj = ej5.d(odd.b, new a52(new h86(str, null), null), this);
                    if (obj != y5bVar) {
                    }
                    return y5bVar;
                }
                if (i == 1) {
                    uj50.b(obj);
                } else {
                    if (i == 2) {
                        CampaignsData campaignsData3 = this.a;
                        uj50.b(obj);
                        campaignsData = campaignsData3;
                        if (campaignsData != null) {
                            db6Var = db6.this;
                            function1 = this.v;
                            if (campaignsData.getNewRegistration()) {
                                b390Var = db6Var.v;
                                bool = Boolean.TRUE;
                                this.a = null;
                                this.b = db6Var;
                                this.c = function1;
                                this.d = campaignsData;
                                this.e = 3;
                                if (b390Var.emit(bool, this) != y5bVar) {
                                    campaignsData2 = campaignsData;
                                    db6Var2 = db6Var;
                                    function2 = function1;
                                }
                                return y5bVar;
                            }
                            db6Var.f = campaignsData.getGames();
                            db6Var.i = campaignsData.getRewardType();
                            function1.invoke(campaignsData);
                            db6Var.c = campaignsData.getCampaignDisplayName();
                            Unit unit = Unit.a;
                        }
                        return Unit.a;
                    }
                    if (i != 3) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    campaignsData2 = this.d;
                    function2 = this.c;
                    db6Var2 = this.b;
                    uj50.b(obj);
                }
                campaignsData = campaignsData2;
                function1 = function2;
                db6Var = db6Var2;
                db6Var.f = campaignsData.getGames();
                db6Var.i = campaignsData.getRewardType();
                function1.invoke(campaignsData);
                db6Var.c = campaignsData.getCampaignDisplayName();
                Unit unit2 = Unit.a;
                return Unit.a;
                ResultWrapper resultWrapper = (ResultWrapper) obj;
                if (resultWrapper instanceof ResultWrapper.Success) {
                    campaignsData = (CampaignsData) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                    xrm xrmVar = (xrm) db6.this.b.getValue();
                    this.a = campaignsData;
                    this.e = 2;
                    if (xrmVar.a(campaignsData, this) != y5bVar) {
                        if (campaignsData != null) {
                            db6Var = db6.this;
                            function1 = this.v;
                            if (campaignsData.getNewRegistration()) {
                                b390Var = db6Var.v;
                                bool = Boolean.TRUE;
                                this.a = null;
                                this.b = db6Var;
                                this.c = function1;
                                this.d = campaignsData;
                                this.e = 3;
                                if (b390Var.emit(bool, this) != y5bVar) {
                                    campaignsData2 = campaignsData;
                                    db6Var2 = db6Var;
                                    function2 = function1;
                                    campaignsData = campaignsData2;
                                    function1 = function2;
                                    db6Var = db6Var2;
                                }
                            }
                            db6Var.f = campaignsData.getGames();
                            db6Var.i = campaignsData.getRewardType();
                            function1.invoke(campaignsData);
                            db6Var.c = campaignsData.getCampaignDisplayName();
                            Unit unit3 = Unit.a;
                        }
                    }
                    return y5bVar;
                }
            } catch (Exception e) {
                e.printStackTrace();
                Unit unit4 = Unit.a;
            }
            return Unit.a;
        }
    }

    public static final class e implements Function0<xrm> {
        public e() {
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, xrm] */
        @Override // kotlin.jvm.functions.Function0
        public final xrm invoke() {
            qn70 qn70VarJ;
            dq7 dq7VarA;
            xjj xjjVar = db6.this;
            if (xjjVar instanceof rrp) {
                qn70VarJ = ((rrp) xjjVar).j();
                dq7VarA = jq40.a(xrm.class);
                qn70VarJ.getClass();
            } else {
                qn70VarJ = sjj.b().c.d;
                dq7VarA = jq40.a(xrm.class);
            }
            return qn70VarJ.a(dq7VarA, null, null);
        }
    }

    public final void A1(int i, boolean z) {
        ej5.c(o8i0.d(this), null, null, new c(i, this, z, null), 3);
    }

    public final void B1(String str, Function1<? super CampaignsData, Unit> function1) {
        str.getClass();
        ej5.c(o8i0.d(this), null, null, new d(str, function1, null), 3);
    }

    public final void x1(int i, Function0<Unit> function0) {
        UIState.INSTANCE.getClass();
        this.e.j(UIState.Companion.d());
        ej5.c(o8i0.d(this), null, null, new a(i, function0, null), 3);
    }

    public final void y1(String str, Integer num, Function0<Unit> function0) {
        str.getClass();
        ej5.c(o8i0.d(this), null, null, new b(num, str, function0, null), 3);
    }
}
