package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.LNMyNumberViewModel$getMyNumber$1", f = "LNMyNumberViewModel.kt", l = {235, 238}, m = "invokeSuspend", v = 2)
public final class axq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public r9k a;
    public String b;
    public int c;
    public final /* synthetic */ exq d;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.LNMyNumberViewModel$getMyNumber$1$1", f = "LNMyNumberViewModel.kt", l = {237}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super dvq>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super dvq> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = (myh) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.b = null;
                this.a = 1;
                if (myhVar.emit(null, this) == y5bVar) {
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

    public static final class b<T> implements myh {
        public final /* synthetic */ exq a;

        @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.LNMyNumberViewModel$getMyNumber$1$2", f = "LNMyNumberViewModel.kt", l = {239, 241}, m = "emit", v = 2)
        public static final class a extends x1b {
            public dvq a;
            public /* synthetic */ Object b;
            public final /* synthetic */ b<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, v1b<? super a> v1bVar) {
                super(v1bVar);
                this.c = bVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        public b(exq exqVar) {
            this.a = exqVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
        
            if (r6.a.emit(r8, r0) == r1) goto L34;
         */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.dvq r7, defpackage.v1b<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof axq.b.a
                if (r0 == 0) goto L13
                r0 = r8
                axq$b$a r0 = (axq.b.a) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                axq$b$a r0 = new axq$b$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.b
                y5b r1 = defpackage.y5b.a
                int r2 = r0.d
                exq r6 = r6.a
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L39
                if (r2 == r4) goto L33
                if (r2 != r3) goto L2d
                defpackage.uj50.b(r8)
                goto L7f
            L2d:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L33:
                dvq r7 = r0.a
                defpackage.uj50.b(r8)
                goto L4a
            L39:
                defpackage.uj50.b(r8)
                wwd0 r8 = r6.y
                r0.a = r7
                r0.d = r4
                r8.setValue(r7)
                kotlin.Unit r8 = kotlin.Unit.a
                if (r8 != r1) goto L4a
                goto L7e
            L4a:
                if (r7 == 0) goto L7f
                dvq$a r8 = dvq.a.a
                boolean r8 = r7.equals(r8)
                if (r8 != 0) goto L68
                dvq$c r8 = dvq.c.a
                boolean r8 = r7.equals(r8)
                if (r8 == 0) goto L5d
                goto L68
            L5d:
                boolean r8 = r7 instanceof dvq.b
                if (r8 == 0) goto L64
                dvq$b r7 = (dvq.b) r7
                goto L69
            L64:
                defpackage.uhc.a()
                return r5
            L68:
                r7 = r5
            L69:
                if (r7 == 0) goto L7f
                ku90<pvq> r6 = r6.A
                pvq$b r8 = new pvq$b
                r8.<init>(r7)
                r0.a = r5
                r0.d = r3
                b390 r6 = r6.a
                java.lang.Object r6 = r6.emit(r8, r0)
                if (r6 != r1) goto L7f
            L7e:
                return r1
            L7f:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: axq.b.emit(dvq, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axq(exq exqVar, v1b<? super axq> v1bVar) {
        super(2, v1bVar);
        this.d = exqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new axq(this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((axq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r3.collect(r10, r9) == r0) goto L16;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.c
            exq r2 = r9.d
            r3 = 1
            r4 = 0
            r5 = 2
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 != r5) goto L13
            defpackage.uj50.b(r10)
            goto L65
        L13:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r4
        L19:
            java.lang.String r1 = r9.b
            r9k r3 = r9.a
            defpackage.uj50.b(r10)
            goto L41
        L21:
            defpackage.uj50.b(r10)
            r9k r10 = r2.b
            g1r r1 = r2.e
            java.lang.String r1 = r1.a
            wwd0 r6 = r2.i
            f1i r7 = new f1i
            r7.<init>(r6)
            r9.a = r10
            r9.b = r1
            r9.c = r3
            java.lang.Object r3 = defpackage.s0i.a(r7, r9)
            if (r3 != r0) goto L3e
            goto L64
        L3e:
            r8 = r3
            r3 = r10
            r10 = r8
        L41:
            qxp r10 = (defpackage.qxp) r10
            qcn<tsq> r10 = r10.a
            yzh r10 = r3.a(r10, r1)
            axq$a r1 = new axq$a
            r1.<init>(r5, r4)
            xzh r3 = new xzh
            r3.<init>(r10, r1)
            axq$b r10 = new axq$b
            r10.<init>(r2)
            r9.a = r4
            r9.b = r4
            r9.c = r5
            java.lang.Object r9 = r3.collect(r10, r9)
            if (r9 != r0) goto L65
        L64:
            return r0
        L65:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
