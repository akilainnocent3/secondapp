package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.patron.DefaultGift;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.plugin.usecase.GetDefaultGiftUseCase$invoke$1", f = "GetDefaultGiftUseCase.kt", l = {19, 21, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class h5k extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ i5k d;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a<T> implements myh {
        public final /* synthetic */ i5k a;
        public final /* synthetic */ myh<Boolean> b;

        /* JADX INFO: renamed from: h5k$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.usecase.GetDefaultGiftUseCase$invoke$1$1", f = "GetDefaultGiftUseCase.kt", l = {30, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "emit", v = 2)
        public static final class C0625a extends x1b {
            public lk50.c a;
            public /* synthetic */ Object b;
            public final /* synthetic */ a<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0625a(a<? super T> aVar, v1b<? super C0625a> v1bVar) {
                super(v1bVar);
                this.c = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(i5k i5kVar, myh<? super Boolean> myhVar) {
            this.a = i5kVar;
            this.b = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(lk50<DefaultGift> lk50Var, v1b<? super Unit> v1bVar) {
            C0625a c0625a;
            if (v1bVar instanceof C0625a) {
                c0625a = (C0625a) v1bVar;
                int i = c0625a.d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0625a.d = i - Integer.MIN_VALUE;
                } else {
                    c0625a = new C0625a(this, v1bVar);
                }
            } else {
                c0625a = new C0625a(this, v1bVar);
            }
            Object obj = c0625a.b;
            y5b y5bVar = y5b.a;
            int i2 = c0625a.d;
            myh<Boolean> myhVar = this.b;
            if (i2 == 0) {
                uj50.b(obj);
                if (lk50Var instanceof lk50.c) {
                    lk50.c cVar = (lk50.c) lk50Var;
                    boolean useGift = ((DefaultGift) cVar.a).getUseGift();
                    c0625a.a = cVar;
                    c0625a.d = 1;
                    int i3 = i5k.c;
                    if (this.a.a.getBetSlipDefaultGift().g(c0625a, Boolean.valueOf(useGift)) != y5bVar) {
                    }
                } else {
                    if (!(lk50Var instanceof lk50.a)) {
                        return Unit.a;
                    }
                    c0625a.a = null;
                    c0625a.d = 3;
                    Object objEmit = myhVar.emit(null, c0625a);
                    if (objEmit != y5bVar) {
                        return objEmit;
                    }
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    uj50.b(obj);
                    return obj;
                }
                if (i2 == 3) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lk50Var = c0625a.a;
            uj50.b(obj);
            Boolean boolValueOf = Boolean.valueOf(((DefaultGift) ((lk50.c) lk50Var).a).getUseGift());
            c0625a.a = null;
            c0625a.d = 2;
            Object objEmit2 = myhVar.emit(boolValueOf, c0625a);
            return objEmit2 == y5bVar ? y5bVar : objEmit2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5k(boolean z, i5k i5kVar, v1b<? super h5k> v1bVar) {
        super(2, v1bVar);
        this.c = z;
        this.d = i5kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h5k h5kVar = new h5k(this.c, this.d, v1bVar);
        h5kVar.b = obj;
        return h5kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
        return ((h5k) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r9.collect(r2, r8) == r1) goto L26;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.a
            r3 = 3
            r4 = 2
            i5k r5 = r8.d
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L29
            if (r2 == r6) goto L25
            if (r2 == r4) goto L21
            if (r2 != r3) goto L1a
            defpackage.uj50.b(r9)
            goto L73
        L1a:
            r8 = 0
            java.lang.String r8 = com.sportybet.android.account.Qr.QQWMbKFOuTf.ojVL
            defpackage.ib5.a(r8)
            return r7
        L21:
            defpackage.uj50.b(r9)
            goto L54
        L25:
            defpackage.uj50.b(r9)
            goto L45
        L29:
            defpackage.uj50.b(r9)
            boolean r9 = r8.c
            if (r9 != 0) goto L57
            com.sportybet.plugin.realsports.data.local.BetSlipDataStore r9 = r5.a
            wm20 r9 = r9.getBetSlipDefaultGift()
            lyh r9 = r9.c()
            r8.b = r0
            r8.a = r6
            java.lang.Object r9 = defpackage.s0i.c(r9, r8)
            if (r9 != r1) goto L45
            goto L72
        L45:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L57
            r8.b = r7
            r8.a = r4
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r1) goto L54
            goto L72
        L54:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L57:
            lyz r9 = r5.b
            lyh r9 = r9.O()
            com.sporty.android.common_ui.uitext.ResourceUiText r2 = defpackage.vch0.b
            yzh r9 = defpackage.bm50.b(r9, r2)
            h5k$a r2 = new h5k$a
            r2.<init>(r5, r0)
            r8.b = r7
            r8.a = r3
            java.lang.Object r8 = r9.collect(r2, r8)
            if (r8 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
