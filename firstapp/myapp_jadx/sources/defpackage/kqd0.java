package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.presentation.StackerViewModel$observeNetworkErrors$1", f = "StackerViewModel.kt", l = {143}, m = "invokeSuspend", v = 1)
public final class kqd0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tqd0 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ tqd0 a;

        /* JADX INFO: renamed from: kqd0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.stacker.presentation.StackerViewModel$observeNetworkErrors$1$1", f = "StackerViewModel.kt", l = {144, 145}, m = "emit", v = 1)
        public static final class C0779a extends x1b {
            public lmd0 a;
            public /* synthetic */ Object b;
            public final /* synthetic */ a<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0779a(a<? super T> aVar, v1b<? super C0779a> v1bVar) {
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

        public a(tqd0 tqd0Var) {
            this.a = tqd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        
            if (r7.b(r8) == r1) goto L21;
         */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.lmd0 r8, defpackage.v1b<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kqd0.a.C0779a
                if (r0 == 0) goto L13
                r0 = r9
                kqd0$a$a r0 = (kqd0.a.C0779a) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                kqd0$a$a r0 = new kqd0$a$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.b
                y5b r1 = defpackage.y5b.a
                int r2 = r0.d
                r3 = 0
                tqd0 r7 = r7.a
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L39
                if (r2 == r5) goto L33
                if (r2 != r4) goto L2d
                defpackage.uj50.b(r9)
                goto L61
            L2d:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r3
            L33:
                lmd0 r8 = r0.a
                defpackage.uj50.b(r9)
                goto L54
            L39:
                defpackage.uj50.b(r9)
                wwd0 r9 = r7.H
                lmx r2 = new lmx
                java.lang.String r6 = r7.D
                r2.<init>(r6)
                r0.a = r8
                r0.d = r5
                r9.getClass()
                r9.k(r3, r2)
                kotlin.Unit r9 = kotlin.Unit.a
                if (r9 != r1) goto L54
                goto L60
            L54:
                zzm r7 = r7.B
                r0.a = r3
                r0.d = r4
                kotlin.Unit r7 = r7.b(r8)
                if (r7 != r1) goto L61
            L60:
                return r1
            L61:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kqd0.a.emit(lmd0, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqd0(tqd0 tqd0Var, v1b<? super kqd0> v1bVar) {
        super(2, v1bVar);
        this.b = tqd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kqd0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((kqd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        tqd0 tqd0Var = this.b;
        b390 b390VarA = tqd0Var.A.a();
        a aVar = new a(tqd0Var);
        this.a = 1;
        b390VarA.collect(aVar, this);
        return y5bVar;
    }
}
