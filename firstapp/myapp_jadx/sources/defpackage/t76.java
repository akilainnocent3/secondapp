package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.component.vault.campaign.CampaignProgressBarKt$CampaignProgressBar$1$1", f = "CampaignProgressBar.kt", l = {77, 80, 90, 93, 96, 99, HttpStatusCodesKt.HTTP_PROCESSING, 112}, m = "invokeSuspend", v = 1)
public final class t76 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public xmt a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ont e;
    public final /* synthetic */ ytw<si0> f;
    public final /* synthetic */ fmt i;

    @c0d(c = "com.sportygames.component.vault.campaign.CampaignProgressBarKt$CampaignProgressBar$1$1$1", f = "CampaignProgressBar.kt", l = {84}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ fmt b;
        public final /* synthetic */ xmt c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fmt fmtVar, xmt xmtVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = fmtVar;
            this.c = xmtVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
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
                this.a = 1;
                if (fmt.a.a(this.b, this.c, 1, false, 0.0f, null, 0.0f, this, 1978) == y5bVar) {
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

    @c0d(c = "com.sportygames.component.vault.campaign.CampaignProgressBarKt$CampaignProgressBar$1$1$2", f = "CampaignProgressBar.kt", l = {106}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ fmt b;
        public final /* synthetic */ xmt c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fmt fmtVar, xmt xmtVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = fmtVar;
            this.c = xmtVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
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
                this.a = 1;
                if (fmt.a.a(this.b, this.c, 1, false, 0.0f, null, 0.0f, this, 1978) == y5bVar) {
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
    public t76(boolean z, ont ontVar, ytw ytwVar, fmt fmtVar, v1b v1bVar) {
        super(2, v1bVar);
        this.d = z;
        this.e = ontVar;
        this.f = ytwVar;
        this.i = fmtVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t76 t76Var = new t76(this.d, this.e, this.f, this.i, v1bVar);
        t76Var.c = obj;
        return t76Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t76) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009b A[PHI: r2
      0x009b: PHI (r2v4 xmt) = (r2v2 xmt), (r2v5 xmt) binds: [B:26:0x0097, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00be A[PHI: r2
      0x00be: PHI (r2v6 xmt) = (r2v4 xmt), (r2v7 xmt) binds: [B:29:0x00ba, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00da A[PHI: r2
      0x00da: PHI (r2v8 xmt) = (r2v6 xmt), (r2v9 xmt) binds: [B:32:0x00d6, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f7 A[PHI: r2
      0x00f7: PHI (r2v10 xmt) = (r2v8 xmt), (r2v11 xmt) binds: [B:35:0x00f4, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0112 A[PHI: r2
      0x0112: PHI (r2v12 xmt) = (r2v10 xmt), (r2v13 xmt) binds: [B:38:0x010f, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x012d A[PHI: r2
      0x012d: PHI (r2v14 xmt) = (r2v12 xmt), (r2v16 xmt) binds: [B:41:0x012a, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        if (defpackage.hkd.c(r2, r11) == r1) goto L45;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t76.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
