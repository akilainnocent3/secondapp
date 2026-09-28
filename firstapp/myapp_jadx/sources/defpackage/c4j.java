package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.chips.FruitHuntChipKt$FruitHuntChip$1$1", f = "FruitHuntChip.kt", l = {50}, m = "invokeSuspend", v = 1)
public final class c4j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ psw b;
    public final /* synthetic */ isw c;

    public static final class a<T> implements myh {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ isw b;

        /* JADX INFO: renamed from: c4j$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.fruithunt.views.chips.FruitHuntChipKt$FruitHuntChip$1$1$1", f = "FruitHuntChip.kt", l = {55, 61}, m = "emit", v = 1)
        public static final class C0154a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0154a(a<? super T> aVar, v1b<? super C0154a> v1bVar) {
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

        public a(cq40 cq40Var, isw iswVar) {
            this.a = cq40Var;
            this.b = iswVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
            if (defpackage.t4w.a(r0.getContext()).P(r7, r0) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
        
            if (defpackage.hkd.b(r5, r0) == r1) goto L31;
         */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.xxo r8, defpackage.v1b<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof c4j.a.C0154a
                if (r0 == 0) goto L13
                r0 = r9
                c4j$a$a r0 = (c4j.a.C0154a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                c4j$a$a r0 = new c4j$a$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.c
                isw r3 = r7.b
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L37
                if (r2 == r5) goto L33
                if (r2 != r4) goto L2c
                defpackage.uj50.b(r9)
                goto L87
            L2c:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L33:
                defpackage.uj50.b(r9)
                goto L63
            L37:
                defpackage.uj50.b(r9)
                boolean r9 = r8 instanceof mp20.b
                cq40 r7 = r7.a
                if (r9 == 0) goto L66
                long r8 = android.os.SystemClock.uptimeMillis()
                r7.a = r8
                r7 = 1063828015(0x3f68ba2f, float:0.90909094)
                r3.A(r7)
                b4j r7 = new b4j
                r8 = 0
                r7.<init>(r8)
                r0.c = r5
                kotlin.coroutines.CoroutineContext r8 = r0.getContext()
                r4w r8 = defpackage.t4w.a(r8)
                java.lang.Object r7 = r8.P(r7, r0)
                if (r7 != r1) goto L63
                goto L86
            L63:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L66:
                boolean r9 = r8 instanceof mp20.c
                if (r9 != 0) goto L6e
                boolean r8 = r8 instanceof mp20.a
                if (r8 == 0) goto L8c
            L6e:
                long r8 = android.os.SystemClock.uptimeMillis()
                long r5 = r7.a
                long r8 = r8 - r5
                r5 = 60
                long r5 = r5 - r8
                r7 = 0
                int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r7 <= 0) goto L87
                r0.c = r4
                java.lang.Object r7 = defpackage.hkd.b(r5, r0)
                if (r7 != r1) goto L87
            L86:
                return r1
            L87:
                r7 = 1065353216(0x3f800000, float:1.0)
                r3.A(r7)
            L8c:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: c4j.a.emit(xxo, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4j(psw pswVar, isw iswVar, v1b<? super c4j> v1bVar) {
        super(2, v1bVar);
        this.b = pswVar;
        this.c = iswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c4j(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c4j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        cq40 cq40Var = new cq40();
        b390 b390VarB = this.b.b();
        a aVar = new a(cq40Var, this.c);
        this.a = 1;
        b390VarB.collect(aVar, this);
        return y5bVar;
    }
}
