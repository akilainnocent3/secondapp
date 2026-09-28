package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.betslip.BetslipCustomizationSettingsScreenKt$BetslipCustomizationSettingsRoute$1$1$1", f = "BetslipCustomizationSettingsScreen.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class wn3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ao3 b;
    public final /* synthetic */ v3a0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0<Unit> e;
    public final /* synthetic */ Function0<Unit> f;

    public static final class a<T> implements myh {
        public final /* synthetic */ v3a0 a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ Function0<Unit> d;

        /* JADX INFO: renamed from: wn3$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.settings.betslip.BetslipCustomizationSettingsScreenKt$BetslipCustomizationSettingsRoute$1$1$1$1", f = "BetslipCustomizationSettingsScreen.kt", l = {76}, m = "emit", v = 2)
        public static final class C1253a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1253a(a<? super T> aVar, v1b<? super C1253a> v1bVar) {
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

        public a(v3a0 v3a0Var, String str, Function0<Unit> function0, Function0<Unit> function1) {
            this.a = v3a0Var;
            this.b = str;
            this.c = function0;
            this.d = function1;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(yy3 yy3Var, v1b<? super Unit> v1bVar) {
            C1253a c1253a;
            if (v1bVar instanceof C1253a) {
                c1253a = (C1253a) v1bVar;
                int i = c1253a.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1253a.c = i - Integer.MIN_VALUE;
                } else {
                    c1253a = new C1253a(this, v1bVar);
                }
            } else {
                c1253a = new C1253a(this, v1bVar);
            }
            C1253a c1253a2 = c1253a;
            Object obj = c1253a2.a;
            y5b y5bVar = y5b.a;
            int i2 = c1253a2.c;
            if (i2 == 0) {
                uj50.b(obj);
                if (!Intrinsics.g(yy3Var, yy3.c.a)) {
                    if (Intrinsics.g(yy3Var, yy3.a.a)) {
                        this.c.invoke();
                    } else {
                        if (!Intrinsics.g(yy3Var, yy3.b.a)) {
                            uhc.a();
                            return null;
                        }
                        this.d.invoke();
                    }
                    return Unit.a;
                }
                c1253a2.c = 1;
                if (v3a0.b(this.a, this.b, null, false, null, c1253a2, 14) == y5bVar) {
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
    public wn3(ao3 ao3Var, v3a0 v3a0Var, String str, Function0<Unit> function0, Function0<Unit> function1, v1b<? super wn3> v1bVar) {
        super(2, v1bVar);
        this.b = ao3Var;
        this.c = v3a0Var;
        this.d = str;
        this.e = function0;
        this.f = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wn3(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((wn3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to wn3 for r8v2 'this'  v1b
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
            ao3 r9 = r8.b
            t340 r9 = r9.v
            wn3$a r1 = new wn3$a
            kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r8.e
            kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r8.f
            v3a0 r6 = r8.c
            java.lang.String r7 = r8.d
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
