package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.GlobalWithdrawViewModel$onViewStarted$1", f = "GlobalWithdrawViewModel.kt", l = {110, 113, 114, 123}, m = "invokeSuspend", v = 2)
public final class p3l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public lyh a;
    public int b;
    public final /* synthetic */ h3l c;

    @c0d(c = "com.sportybet.android.basepay.viewModel.GlobalWithdrawViewModel$onViewStarted$1$1", f = "GlobalWithdrawViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<Boolean, Boolean, v1b<? super Pair<? extends Boolean, ? extends Boolean>>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(Boolean bool, Boolean bool2, v1b<? super Pair<? extends Boolean, ? extends Boolean>> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            a aVar = new a(3, v1bVar);
            aVar.a = zBooleanValue;
            aVar.b = zBooleanValue2;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            boolean z2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.GlobalWithdrawViewModel$onViewStarted$1$2", f = "GlobalWithdrawViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super Pair<? extends Boolean, ? extends Boolean>>, Throwable, v1b<? super Unit>, Object> {
        public final /* synthetic */ h3l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h3l h3lVar, v1b<? super b> v1bVar) {
            super(3, v1bVar);
            this.a = h3lVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Pair<? extends Boolean, ? extends Boolean>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            return new b(this.a, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            g3l.e eVar = g3l.e.a;
            h3l h3lVar = this.a;
            h3lVar.x1(eVar);
            h3lVar.x1(g3l.a.a);
            return Unit.a;
        }
    }

    public static final class c<T> implements myh {
        public final /* synthetic */ h3l a;

        public c(h3l h3lVar) {
            this.a = h3lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Pair pair = (Pair) obj;
            boolean zBooleanValue = ((Boolean) pair.a).booleanValue();
            boolean zBooleanValue2 = ((Boolean) pair.b).booleanValue();
            h3l h3lVar = this.a;
            h3lVar.w = zBooleanValue;
            if (zBooleanValue2) {
                h3lVar.x1(new g3l.f(h3lVar.b.j()));
            } else {
                ej5.c(o8i0.d(h3lVar), null, null, new i3l(h3lVar, null), 3);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3l(h3l h3lVar, v1b<? super p3l> v1bVar) {
        super(2, v1bVar);
        this.c = h3lVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p3l(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p3l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r9.collect(r1, r8) == r0) goto L27;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.b
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            h3l r7 = r8.c
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L26
            if (r1 == r5) goto L20
            if (r1 != r2) goto L1a
            defpackage.uj50.b(r9)
            goto L9c
        L1a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r6
        L20:
            lyh r1 = r8.a
            defpackage.uj50.b(r9)
            goto L72
        L26:
            defpackage.uj50.b(r9)
            goto L4a
        L2a:
            defpackage.uj50.b(r9)
            goto L3a
        L2e:
            defpackage.uj50.b(r9)
            r8.b = r4
            java.lang.Object r9 = r7.y1(r8)
            if (r9 != r0) goto L3a
            goto L9b
        L3a:
            r8.b = r3
            j3l r9 = new j3l
            r9.<init>(r7, r6)
            or60 r1 = new or60
            r1.<init>(r9)
            if (r1 != r0) goto L49
            goto L9b
        L49:
            r9 = r1
        L4a:
            r1 = r9
            lyh r1 = (defpackage.lyh) r1
            r8.a = r1
            r8.b = r5
            y1p r9 = r7.f
            r9.getClass()
            z1p r3 = new z1p
            r3.<init>(r6, r9)
            or60 r4 = new or60
            r4.<init>(r3)
            a2p r3 = new a2p
            r3.<init>(r6, r9)
            b77 r9 = defpackage.r0i.f(r4, r3)
            k3l r3 = new k3l
            r3.<init>(r9)
            if (r3 != r0) goto L71
            goto L9b
        L71:
            r9 = r3
        L72:
            lyh r9 = (defpackage.lyh) r9
            p3l$a r3 = new p3l$a
            r3.<init>(r5, r6)
            n1i r4 = new n1i
            r4.<init>(r1, r9, r3)
            p3l$b r9 = new p3l$b
            r9.<init>(r7, r6)
            yzh r1 = new yzh
            r1.<init>(r4, r9)
            lyh r9 = defpackage.uzh.b(r1)
            p3l$c r1 = new p3l$c
            r1.<init>(r7)
            r8.a = r6
            r8.b = r2
            java.lang.Object r8 = r9.collect(r1, r8)
            if (r8 != r0) goto L9c
        L9b:
            return r0
        L9c:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p3l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
