package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$ensurePrerequisites$1", f = "BetSlipViewModel.kt", l = {617, 620, 632}, m = "invokeSuspend", v = 2)
public final class s63 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public cs3.c a;
    public int b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ q73 f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean v;

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$ensurePrerequisites$1$1$1", f = "BetSlipViewModel.kt", l = {634, 635}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super ds3>, Object> {
        public int a;
        public final /* synthetic */ q73 b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q73 q73Var, v1b v1bVar, boolean z) {
            super(2, v1bVar);
            this.b = q73Var;
            this.c = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super ds3> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            q73 q73Var = this.b;
            if (i == 0) {
                uj50.b(obj);
                ej5.c(o8i0.d(q73Var), null, null, new i73(q73Var, null), 3);
                b390 b390Var = q73Var.N0;
                Unit unit = Unit.a;
                this.a = 1;
                if (b390Var.emit(unit, this) != y5bVar) {
                }
            }
            if (i != 1) {
                if (i == 2) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            n7g n7gVar = q73Var.p0;
            this.a = 2;
            n7gVar.getClass();
            Object objD = w5b.d(new u7g(n7gVar, this.c, null), this);
            return objD == y5bVar ? y5bVar : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s63(q73 q73Var, boolean z, boolean z2, v1b<? super s63> v1bVar) {
        super(2, v1bVar);
        this.f = q73Var;
        this.i = z;
        this.v = z2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s63 s63Var = new s63(this.f, this.i, this.v, v1bVar);
        s63Var.e = obj;
        return s63Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s63) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r2 == r5) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e9, code lost:
    
        if (r0 == r5) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean, int] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s63.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
