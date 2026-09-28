package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q2i implements lyh<Object> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ lv50 b;
    public final /* synthetic */ Function1 c;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ lv50 b;
        public final /* synthetic */ Function1 c;

        /* JADX INFO: renamed from: q2i$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", f = "FlowBuilder.kt", l = {220, 219}, m = "emit")
        public static final class C0996a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh c;

            public C0996a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, lv50 lv50Var, Function1 function1) {
            this.a = myhVar;
            this.b = lv50Var;
            this.c = function1;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        
            if (r6.emit(r8, r0) == r1) goto L22;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, defpackage.v1b r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof q2i.a.C0996a
                if (r0 == 0) goto L13
                r0 = r8
                q2i$a$a r0 = (q2i.a.C0996a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                q2i$a$a r0 = new q2i$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.b
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L37
                if (r2 == r5) goto L31
                if (r2 != r4) goto L2b
                defpackage.uj50.b(r8)
                goto L5a
            L2b:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r3
            L31:
                myh r6 = r0.c
                defpackage.uj50.b(r8)
                goto L4f
            L37:
                defpackage.uj50.b(r8)
                java.util.Set r7 = (java.util.Set) r7
                myh r7 = r6.a
                r0.c = r7
                r0.b = r5
                lv50 r8 = r6.b
                kotlin.jvm.functions.Function1 r6 = r6.c
                r2 = 0
                java.lang.Object r8 = defpackage.qlc.c(r0, r8, r6, r5, r2)
                if (r8 != r1) goto L4e
                goto L59
            L4e:
                r6 = r7
            L4f:
                r0.c = r3
                r0.b = r4
                java.lang.Object r6 = r6.emit(r8, r0)
                if (r6 != r1) goto L5a
            L59:
                return r1
            L5a:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q2i.a.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public q2i(lyh lyhVar, lv50 lv50Var, Function1 function1) {
        this.a = lyhVar;
        this.b = lv50Var;
        this.c = function1;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b, this.c), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
