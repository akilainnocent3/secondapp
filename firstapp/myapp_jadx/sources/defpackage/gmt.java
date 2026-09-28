package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
public final class gmt extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public final /* synthetic */ umt A;
    public int a;
    public final /* synthetic */ jmt b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ wmt i;
    public final /* synthetic */ xmt v;
    public final /* synthetic */ float w;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    @c0d(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ umt b;
        public final /* synthetic */ c9p c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ jmt f;

        /* JADX INFO: renamed from: gmt$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0604a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[umt.values().length];
                try {
                    umt umtVar = umt.a;
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(umt umtVar, c9p c9pVar, int i, int i2, jmt jmtVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = umtVar;
            this.c = c9pVar;
            this.d = i;
            this.e = i2;
            this.f = jmtVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        /* JADX WARN: Code duplicated, block: B:17:0x0039  */
        /* JADX WARN: Code duplicated, block: B:18:0x0043  */
        /* JADX WARN: Code duplicated, block: B:20:0x0056 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x005f  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r4.a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 != r2) goto Ld
                defpackage.uj50.b(r5)
                goto L57
            Ld:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r4)
                r4 = 0
                return r4
            L14:
                defpackage.uj50.b(r5)
            L17:
                int[] r5 = gmt.a.C0604a.a
                umt r1 = r4.b
                int r1 = r1.ordinal()
                r5 = r5[r1]
                int r1 = r4.d
                if (r5 != r2) goto L30
                c9p r5 = r4.c
                boolean r5 = r5.isActive()
                if (r5 == 0) goto L2e
                goto L30
            L2e:
                int r1 = r4.e
            L30:
                r4.a = r2
                r5 = 2147483647(0x7fffffff, float:NaN)
                jmt r3 = r4.f
                if (r1 != r5) goto L43
                hmt r5 = new hmt
                r5.<init>(r3, r1)
                java.lang.Object r5 = defpackage.bgn.a(r5, r4)
                goto L54
            L43:
                imt r5 = new imt
                r5.<init>(r3, r1)
                kotlin.coroutines.CoroutineContext r1 = r4.getContext()
                r4w r1 = defpackage.t4w.a(r1)
                java.lang.Object r5 = r1.P(r5, r4)
            L54:
                if (r5 != r0) goto L57
                return r0
            L57:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L17
                kotlin.Unit r4 = kotlin.Unit.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: gmt.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmt(jmt jmtVar, int i, int i2, boolean z, float f, wmt wmtVar, xmt xmtVar, float f2, boolean z2, boolean z3, umt umtVar, v1b<? super gmt> v1bVar) {
        super(1, v1bVar);
        this.b = jmtVar;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = f;
        this.i = wmtVar;
        this.v = xmtVar;
        this.w = f2;
        this.y = z2;
        this.z = z3;
        this.A = umtVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new gmt(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((gmt) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        y5b y5bVar = y5b.a;
        int i = this.a;
        jmt jmtVar = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                jmtVar.c(this.c);
                ytw ytwVar = jmtVar.c;
                int i2 = this.d;
                ((x5a0) ytwVar).setValue(Integer.valueOf(i2));
                ((x5a0) jmtVar.d).setValue(Boolean.valueOf(this.e));
                ytw ytwVar2 = jmtVar.f;
                float f = this.f;
                ((x5a0) ytwVar2).setValue(Float.valueOf(f));
                ((x5a0) jmtVar.e).setValue(this.i);
                x5a0 x5a0Var = (x5a0) jmtVar.w;
                xmt xmtVar = this.v;
                x5a0Var.setValue(xmtVar);
                jmtVar.f(this.w);
                ((x5a0) jmtVar.i).setValue(Boolean.valueOf(this.y));
                if (!this.z) {
                    ((x5a0) jmtVar.A).setValue(Long.MIN_VALUE);
                }
                if (xmtVar == null) {
                    jmtVar.d(false);
                    return Unit.a;
                }
                if (Float.isInfinite(f)) {
                    jmtVar.f(((Number) jmtVar.B.getValue()).floatValue());
                    jmtVar.d(false);
                    jmtVar.c(i2);
                    return Unit.a;
                }
                jmtVar.d(true);
                int iOrdinal = this.A.ordinal();
                if (iOrdinal == 0) {
                    coroutineContext = e.a;
                } else {
                    if (iOrdinal != 1) {
                        throw new uwx();
                    }
                    coroutineContext = kxx.a;
                }
                a aVar = new a(this.A, i9p.f(getContext()), this.d, this.c, jmtVar, null);
                this.a = 1;
                if (ej5.d(coroutineContext, aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            i9p.e(getContext());
            jmtVar.d(false);
            return Unit.a;
        } catch (Throwable th) {
            jmtVar.d(false);
            throw th;
        }
    }
}
