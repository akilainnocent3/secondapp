package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class m0i implements lyh<lyh<Object>> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ Function2 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ Function2 b;

        /* JADX INFO: renamed from: m0i$a$a, reason: collision with other inner class name */
        @c0d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", l = {50, 50}, m = "emit")
        public static final class C0848a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh c;

            public C0848a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, Function2 function2) {
            this.a = myhVar;
            this.b = function2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        
            if (r7.emit(r9, r0) == r1) goto L22;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, defpackage.v1b r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof m0i.a.C0848a
                if (r0 == 0) goto L13
                r0 = r9
                m0i$a$a r0 = (m0i.a.C0848a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                m0i$a$a r0 = new m0i$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.b
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L37
                if (r2 == r5) goto L31
                if (r2 != r4) goto L2b
                defpackage.uj50.b(r9)
                goto L57
            L2b:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r3
            L31:
                myh r7 = r0.c
                defpackage.uj50.b(r9)
                goto L4c
            L37:
                defpackage.uj50.b(r9)
                myh r9 = r7.a
                r0.c = r9
                r0.b = r5
                kotlin.jvm.functions.Function2 r7 = r7.b
                java.lang.Object r7 = r7.invoke(r8, r0)
                if (r7 != r1) goto L49
                goto L56
            L49:
                r6 = r9
                r9 = r7
                r7 = r6
            L4c:
                r0.c = r3
                r0.b = r4
                java.lang.Object r7 = r7.emit(r9, r0)
                if (r7 != r1) goto L57
            L56:
                return r1
            L57:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: m0i.a.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public m0i(lyh lyhVar, Function2 function2) {
        this.a = lyhVar;
        this.b = function2;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super lyh<Object>> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
