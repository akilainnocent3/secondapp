package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", l = {238, 238, 242}, m = "invokeSuspend")
public final class pwg0 extends tje0 implements Function2<myh<? super Set<? extends String>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ twg0 c;
    public final /* synthetic */ int[] d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String[] f;

    @c0d(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", l = {238}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ twg0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(twg0 twg0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = twg0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.g(this) == y5bVar) {
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
        public final /* synthetic */ dq40<int[]> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ myh<Set<String>> c;
        public final /* synthetic */ String[] d;
        public final /* synthetic */ int[] e;

        @c0d(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", l = {246, 255}, m = "emit")
        public static final class a extends x1b {
            public int[] a;
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

        /* JADX WARN: Multi-variable type inference failed */
        public b(dq40<int[]> dq40Var, boolean z, myh<? super Set<String>> myhVar, String[] strArr, int[] iArr) {
            this.a = dq40Var;
            this.b = z;
            this.c = myhVar;
            this.d = strArr;
            this.e = iArr;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        
            if (r10.emit(r0, r3) == r4) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
        
            if (r10.emit(r0, r3) == r4) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        
            return r4;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(int[] r17, defpackage.v1b<? super kotlin.Unit> r18) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r18
                boolean r3 = r2 instanceof pwg0.b.a
                if (r3 == 0) goto L19
                r3 = r2
                pwg0$b$a r3 = (pwg0.b.a) r3
                int r4 = r3.d
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = r4 & r5
                if (r6 == 0) goto L19
                int r4 = r4 - r5
                r3.d = r4
                goto L1e
            L19:
                pwg0$b$a r3 = new pwg0$b$a
                r3.<init>(r0, r2)
            L1e:
                java.lang.Object r2 = r3.b
                y5b r4 = defpackage.y5b.a
                int r5 = r3.d
                r6 = 0
                dq40<int[]> r7 = r0.a
                r8 = 2
                r9 = 1
                if (r5 == 0) goto L3c
                if (r5 == r9) goto L36
                if (r5 != r8) goto L30
                goto L36
            L30:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                return r6
            L36:
                int[] r0 = r3.a
                defpackage.uj50.b(r2)
                goto La1
            L3c:
                defpackage.uj50.b(r2)
                T r2 = r7.a
                java.lang.String[] r5 = r0.d
                myh<java.util.Set<java.lang.String>> r10 = r0.c
                if (r2 != 0) goto L5a
                boolean r0 = r0.b
                if (r0 == 0) goto La0
                java.util.Set r0 = defpackage.ay0.V(r5)
                r3.a = r1
                r3.d = r9
                java.lang.Object r0 = r10.emit(r0, r3)
                if (r0 != r4) goto La0
                goto L9f
            L5a:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                int r9 = r5.length
                r11 = 0
                r12 = r11
            L62:
                if (r11 >= r9) goto L8b
                r13 = r5[r11]
                int r14 = r12 + 1
                T r15 = r7.a
                if (r15 == 0) goto L83
                int[] r15 = (int[]) r15
                r18 = r6
                int[] r6 = r0.e
                r6 = r6[r12]
                r12 = r15[r6]
                r6 = r1[r6]
                if (r12 == r6) goto L7d
                r2.add(r13)
            L7d:
                int r11 = r11 + 1
                r6 = r18
                r12 = r14
                goto L62
            L83:
                r18 = r6
                java.lang.String r0 = "Required value was null."
                defpackage.ib5.a(r0)
                return r18
            L8b:
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto La0
                java.util.Set r0 = kotlin.collections.CollectionsKt.E0(r2)
                r3.a = r1
                r3.d = r8
                java.lang.Object r0 = r10.emit(r0, r3)
                if (r0 != r4) goto La0
            L9f:
                return r4
            La0:
                r0 = r1
            La1:
                r7.a = r0
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pwg0.b.emit(int[], v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwg0(twg0 twg0Var, int[] iArr, boolean z, String[] strArr, v1b<? super pwg0> v1bVar) {
        super(2, v1bVar);
        this.c = twg0Var;
        this.d = iArr;
        this.e = z;
        this.f = strArr;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pwg0 pwg0Var = new pwg0(this.c, this.d, this.e, this.f, v1bVar);
        pwg0Var.b = obj;
        return pwg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Set<? extends String>> myhVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((pwg0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (defpackage.ej5.d((kotlin.coroutines.CoroutineContext) r3, r4, r24) == r8) goto L38;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
