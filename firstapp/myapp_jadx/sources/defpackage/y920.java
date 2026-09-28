package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.precanned.PreCannedBetBuilderFragment$setupBookingCodeObserver$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "PreCannedBetBuilderFragment.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class y920 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ x920 b;
    public final /* synthetic */ x920 c;

    @c0d(c = "com.sportybet.plugin.realsports.prematch.precanned.PreCannedBetBuilderFragment$setupBookingCodeObserver$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "PreCannedBetBuilderFragment.kt", l = {35}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ x920 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, x920 x920Var) {
            super(2, v1bVar);
            this.c = x920Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.c);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to y920$a for r5v2 'this'  v1b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.b
                v5b r0 = (defpackage.v5b) r0
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L18
                if (r1 == r2) goto L14
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                return r3
            L14:
                defpackage.uj50.b(r6)
                goto L39
            L18:
                defpackage.uj50.b(r6)
                x920 r6 = r5.c
                q8i0 r1 = r6.F
                java.lang.Object r1 = r1.getValue()
                ei20 r1 = (defpackage.ei20) r1
                v340 r1 = r1.f
                z920 r4 = new z920
                r4.<init>(r6)
                r5.b = r3
                r5.a = r2
                uwd0<T> r6 = r1.a
                java.lang.Object r5 = r6.collect(r4, r5)
                if (r5 != r0) goto L39
                return r0
            L39:
                defpackage.fkd.a()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: y920.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y920(x920 x920Var, v1b v1bVar, x920 x920Var2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = x920Var;
        this.c = x920Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new y920(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y920) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getViewLifecycleOwner().getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(null, this.c);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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
