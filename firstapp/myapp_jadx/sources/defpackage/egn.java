package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class egn {
    public final duw<a<?, ?>> a = new duw<>(new a[16]);
    public final ytw b = m.b(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final ytw d = m.b(Boolean.TRUE);

    public final class a<T, V extends mj0> implements twd0<T> {
        public Float a;
        public Float b;
        public final ytw c;
        public xi0<T> d;
        public g5f0<T, V> e;
        public boolean f;
        public boolean i;
        public long v;
        public final /* synthetic */ egn w;

        public a(egn egnVar, Float f, Float f2, cgn cgnVar) {
            g0h0 g0h0Var = gjs.b;
            this.w = egnVar;
            this.a = f;
            this.b = f2;
            this.c = m.b(f);
            this.d = cgnVar;
            this.e = new g5f0<>(cgnVar, g0h0Var, this.a, this.b, null);
        }

        @Override // defpackage.twd0
        public final T getValue() {
            return (T) ((x5a0) this.c).getValue();
        }
    }

    @c0d(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, 193}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public aq40 a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ytw<twd0<Long>> d;
        public final /* synthetic */ egn e;

        @c0d(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
        public static final class a extends tje0 implements Function2<Float, v1b<? super Boolean>, Object> {
            public /* synthetic */ float a;

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(2, v1bVar);
                aVar.a = ((Number) obj).floatValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Float f, v1b<? super Boolean> v1bVar) {
                return ((a) create(Float.valueOf(f.floatValue()), v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(this.a > 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ytw<twd0<Long>> ytwVar, egn egnVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.d = ytwVar;
            this.e = egnVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.d, this.e, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0039 A[PHI: r1 r9
          0x0039: PHI (r1v3 aq40) = (r1v1 aq40), (r1v2 aq40), (r1v2 aq40), (r1v5 aq40) binds: [B:10:0x0029, B:15:0x0054, B:17:0x006f, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]
          0x0039: PHI (r9v4 v5b) = (r9v2 v5b), (r9v3 v5b), (r9v3 v5b), (r9v6 v5b) binds: [B:10:0x0029, B:15:0x0054, B:17:0x006f, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x004f A[PHI: r1 r9
          0x004f: PHI (r1v2 aq40) = (r1v3 aq40), (r1v4 aq40) binds: [B:12:0x004c, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]
          0x004f: PHI (r9v3 v5b) = (r9v4 v5b), (r9v5 v5b) binds: [B:12:0x004c, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x0056  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0054 -> B:11:0x0039). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006f -> B:11:0x0039). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r8.b
                r2 = 0
                r3 = 1
                r4 = 2
                if (r1 == 0) goto L29
                if (r1 == r3) goto L1e
                if (r1 != r4) goto L18
                aq40 r1 = r8.a
                java.lang.Object r5 = r8.c
                v5b r5 = (defpackage.v5b) r5
                defpackage.uj50.b(r9)
                r9 = r5
                goto L39
            L18:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r2
            L1e:
                aq40 r1 = r8.a
                java.lang.Object r5 = r8.c
                v5b r5 = (defpackage.v5b) r5
                defpackage.uj50.b(r9)
                r9 = r5
                goto L4f
            L29:
                defpackage.uj50.b(r9)
                java.lang.Object r9 = r8.c
                v5b r9 = (defpackage.v5b) r9
                aq40 r1 = new aq40
                r1.<init>()
                r5 = 1065353216(0x3f800000, float:1.0)
                r1.a = r5
            L39:
                fgn r5 = new fgn
                ytw<twd0<java.lang.Long>> r6 = r8.d
                egn r7 = r8.e
                r5.<init>()
                r8.c = r9
                r8.a = r1
                r8.b = r3
                java.lang.Object r5 = defpackage.bgn.a(r5, r8)
                if (r5 != r0) goto L4f
                goto L71
            L4f:
                float r5 = r1.a
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L39
                ggn r5 = new ggn
                r6 = 0
                r5.<init>(r9, r6)
                or60 r5 = defpackage.n95.c(r5)
                egn$b$a r6 = new egn$b$a
                r6.<init>(r4, r2)
                r8.c = r9
                r8.a = r1
                r8.b = r4
                java.lang.Object r5 = defpackage.s0i.b(r5, r6, r8)
                if (r5 != r0) goto L39
            L71:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: egn.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(final int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-318043801);
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            if (((Boolean) ((x5a0) this.d).getValue()).booleanValue() || ((Boolean) ((x5a0) this.b).getValue()).booleanValue()) {
                bVarI.N(-144783432);
                boolean zA = bVarI.A(this);
                Object objY2 = bVarI.y();
                if (zA || objY2 == c0042a) {
                    objY2 = new b(ytwVar, this, null);
                    bVarI.r(objY2);
                }
                xvf.e(bVarI, this, (Function2) objY2);
                bVarI.X(false);
            } else {
                bVarI.N(-143396709);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: dgn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.a(iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }
}
