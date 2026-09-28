package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.newCode.compose.NewCustomCodeBottomSheetKt$NewCustomCodeBottomSheet$1$1", f = "NewCustomCodeBottomSheet.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class qpx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cqx b;
    public final /* synthetic */ v3a0 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Function2<gdc, jz0, Unit> e;
    public final /* synthetic */ Function0<Unit> f;

    public static final class a<T> implements myh {
        public final /* synthetic */ v3a0 a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Function2<gdc, jz0, Unit> c;
        public final /* synthetic */ Function0<Unit> d;

        /* JADX INFO: renamed from: qpx$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.bookingcode.customCode.newCode.compose.NewCustomCodeBottomSheetKt$NewCustomCodeBottomSheet$1$1$1", f = "NewCustomCodeBottomSheet.kt", l = {76}, m = "emit", v = 2)
        public static final class C1021a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1021a(a<? super T> aVar, v1b<? super C1021a> v1bVar) {
                super(v1bVar);
                this.b = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(v3a0 v3a0Var, Context context, Function2<? super gdc, ? super jz0, Unit> function2, Function0<Unit> function0) {
            this.a = v3a0Var;
            this.b = context;
            this.c = function2;
            this.d = function0;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(id90 id90Var, v1b<? super Unit> v1bVar) {
            C1021a c1021a;
            if (v1bVar instanceof C1021a) {
                c1021a = (C1021a) v1bVar;
                int i = c1021a.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1021a.c = i - Integer.MIN_VALUE;
                } else {
                    c1021a = new C1021a(this, v1bVar);
                }
            } else {
                c1021a = new C1021a(this, v1bVar);
            }
            C1021a c1021a2 = c1021a;
            Object obj = c1021a2.a;
            y5b y5bVar = y5b.a;
            int i2 = c1021a2.c;
            if (i2 == 0) {
                uj50.b(obj);
                if (!(id90Var instanceof rb90)) {
                    if (id90Var instanceof vpx.b) {
                        vpx.b bVar = (vpx.b) id90Var;
                        this.c.invoke(bVar.a, bVar.b);
                    } else if (Intrinsics.g(id90Var, vpx.a.a)) {
                        this.d.invoke();
                    }
                    return Unit.a;
                }
                String strG = ((rb90) id90Var).a.g(this.b);
                k3a0 k3a0Var = k3a0.a;
                c1021a2.c = 1;
                if (v3a0.b(this.a, strG, null, false, k3a0Var, c1021a2, 6) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qpx(cqx cqxVar, v3a0 v3a0Var, Context context, Function2<? super gdc, ? super jz0, Unit> function2, Function0<Unit> function0, v1b<? super qpx> v1bVar) {
        super(2, v1bVar);
        this.b = cqxVar;
        this.c = v3a0Var;
        this.d = context;
        this.e = function2;
        this.f = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qpx(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((qpx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to qpx for r8v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r2
        L10:
            defpackage.uj50.b(r9)
            goto L33
        L14:
            defpackage.uj50.b(r9)
            cqx r9 = r8.b
            t340 r9 = r9.d
            qpx$a r1 = new qpx$a
            kotlin.jvm.functions.Function2<gdc, jz0, kotlin.Unit> r4 = r8.e
            kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r8.f
            v3a0 r6 = r8.c
            android.content.Context r7 = r8.d
            r1.<init>(r6, r7, r4, r5)
            r8.a = r3
            a390<T> r9 = r9.a
            java.lang.Object r8 = r9.collect(r1, r8)
            if (r8 != r0) goto L33
            return r0
        L33:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
