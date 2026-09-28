package defpackage;

import com.sportygames.crash.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.components.OngoingComponentKt$OngoingComponent$5$1", f = "OngoingComponent.kt", l = {367, 374, 376, 377, 391, 392}, m = "invokeSuspend", v = 1)
public final class uwy extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public String a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ytw<MultiplierResponse> d;
    public final /* synthetic */ wd0<gly, jj0> e;
    public final /* synthetic */ long f;
    public final /* synthetic */ wd0<Float, ij0> i;
    public final /* synthetic */ long v;
    public final /* synthetic */ ytw<String> w;
    public final /* synthetic */ ytw<Boolean> y;
    public final /* synthetic */ tkf z;

    @c0d(c = "com.sportygames.sportykick.components.OngoingComponentKt$OngoingComponent$5$1$1", f = "OngoingComponent.kt", l = {379}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<gly, jj0> b;
        public final /* synthetic */ long c;
        public final /* synthetic */ tkf d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<gly, jj0> wd0Var, long j, tkf tkfVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = j;
            this.d = tkfVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
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
                gly glyVar = new gly(this.c);
                gzg0 gzg0VarE = yi0.e(550, 0, this.d, 2);
                this.a = 1;
                if (wd0.a(this.b, glyVar, gzg0VarE, null, null, this, 12) == y5bVar) {
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

    @c0d(c = "com.sportygames.sportykick.components.OngoingComponentKt$OngoingComponent$5$1$2", f = "OngoingComponent.kt", l = {385}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ tkf c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wd0<Float, ij0> wd0Var, tkf tkfVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = tkfVar;
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
                Float f = new Float(1.0f);
                gzg0 gzg0VarE = yi0.e(550, 0, this.c, 2);
                this.a = 1;
                if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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
    public uwy(ytw<MultiplierResponse> ytwVar, wd0<gly, jj0> wd0Var, long j, wd0<Float, ij0> wd0Var2, long j2, ytw<String> ytwVar2, ytw<Boolean> ytwVar3, tkf tkfVar, v1b<? super uwy> v1bVar) {
        super(2, v1bVar);
        this.d = ytwVar;
        this.e = wd0Var;
        this.f = j;
        this.i = wd0Var2;
        this.v = j2;
        this.w = ytwVar2;
        this.y = ytwVar3;
        this.z = tkfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        uwy uwyVar = new uwy(this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
        uwyVar.c = obj;
        return uwyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((uwy) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:36:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (defpackage.hkd.b(50, r18) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cc, code lost:
    
        if (r8.f(r18, r3) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0123, code lost:
    
        if (r5.f(r18, r1) == r2) goto L38;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
