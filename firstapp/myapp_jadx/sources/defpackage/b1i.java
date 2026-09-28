package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
public final class b1i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ q490 b;
    public final /* synthetic */ lyh<Object> c;
    public final /* synthetic */ vtw<Object> d;
    public final /* synthetic */ Object e;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<Integer, v1b<? super Boolean>, Object> {
        public /* synthetic */ int a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = ((Number) obj).intValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, v1b<? super Boolean> v1bVar) {
            return ((a) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(this.a > 0);
        }
    }

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<o490, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh<Object> c;
        public final /* synthetic */ vtw<Object> d;
        public final /* synthetic */ Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lyh<Object> lyhVar, vtw<Object> vtwVar, Object obj, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = vtwVar;
            this.e = obj;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, this.d, this.e, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o490 o490Var, v1b<? super Unit> v1bVar) {
            return ((b) create(o490Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                int iOrdinal = ((o490) this.b).ordinal();
                vtw<Object> vtwVar = this.d;
                if (iOrdinal == 0) {
                    this.a = 1;
                    if (this.c.collect(vtwVar, this) == y5bVar) {
                        return y5bVar;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return null;
                    }
                    toe0 toe0Var = d390.a;
                    Object obj2 = this.e;
                    if (obj2 == toe0Var) {
                        vtwVar.h();
                    } else {
                        vtwVar.a(obj2);
                    }
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
    public b1i(q490 q490Var, lyh<Object> lyhVar, vtw<Object> vtwVar, Object obj, v1b<? super b1i> v1bVar) {
        super(2, v1bVar);
        this.b = q490Var;
        this.c = lyhVar;
        this.d = vtwVar;
        this.e = obj;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b1i(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b1i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to b1i for r9v6 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.a
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 1
            lyh<java.lang.Object> r6 = r9.c
            r7 = 2
            vtw<java.lang.Object> r8 = r9.d
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r7) goto L1e
            if (r1 == r4) goto L22
            if (r1 != r3) goto L18
            goto L22
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r2
        L1e:
            defpackage.uj50.b(r10)
            goto L4e
        L22:
            defpackage.uj50.b(r10)
            goto L73
        L26:
            defpackage.uj50.b(r10)
            kwd0 r10 = q490.a.a
            q490 r1 = r9.b
            if (r1 != r10) goto L38
            r9.a = r5
            java.lang.Object r9 = r6.collect(r8, r9)
            if (r9 != r0) goto L73
            goto L72
        L38:
            lwd0 r10 = q490.a.b
            if (r1 != r10) goto L57
            uwd0 r10 = r8.b()
            b1i$a r1 = new b1i$a
            r1.<init>(r7, r2)
            r9.a = r7
            java.lang.Object r10 = defpackage.s0i.b(r10, r1, r9)
            if (r10 != r0) goto L4e
            goto L72
        L4e:
            r9.a = r4
            java.lang.Object r9 = r6.collect(r8, r9)
            if (r9 != r0) goto L73
            goto L72
        L57:
            uwd0 r10 = r8.b()
            lyh r10 = r1.a(r10)
            lyh r10 = defpackage.uzh.b(r10)
            b1i$b r1 = new b1i$b
            java.lang.Object r4 = r9.e
            r1.<init>(r6, r8, r4, r2)
            r9.a = r3
            java.lang.Object r9 = defpackage.kzh.b(r10, r1, r9)
            if (r9 != r0) goto L73
        L72:
            return r0
        L73:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
