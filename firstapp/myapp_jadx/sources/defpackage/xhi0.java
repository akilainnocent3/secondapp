package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class xhi0 implements lyh<thi0> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ zhi0 b;

    @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyGameStatusHandlerImpl$init$$inlined$combine$1", f = "VirtualLobbyGameStatusHandlerImpl.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return xhi0.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[7];
        }
    }

    @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyGameStatusHandlerImpl$init$$inlined$combine$1$3", f = "VirtualLobbyGameStatusHandlerImpl.kt", l = {237, 234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super thi0>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ zhi0 d;
        public myh e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, zhi0 zhi0Var) {
            super(3, v1bVar);
            this.d = zhi0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super thi0> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
        
            if (r12.emit(r0, r14) == r9) goto L20;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                y5b r9 = defpackage.y5b.a
                int r0 = r14.a
                r10 = 2
                r1 = 1
                r11 = 0
                if (r0 == 0) goto L20
                if (r0 == r1) goto L18
                if (r0 != r10) goto L12
                defpackage.uj50.b(r15)
                goto L93
            L12:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                return r11
            L18:
                myh r0 = r14.e
                defpackage.uj50.b(r15)
                r12 = r0
                r0 = r15
                goto L84
            L20:
                defpackage.uj50.b(r15)
                myh r12 = r14.b
                java.lang.Object[] r0 = r14.c
                r2 = 4
                r2 = r0[r2]
                r2.getClass()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r5 = r2.booleanValue()
                r2 = 0
                r3 = r0[r2]
                r3.getClass()
                lk50 r3 = (defpackage.lk50) r3
                r4 = r0[r1]
                r4.getClass()
                lk50 r4 = (defpackage.lk50) r4
                r6 = r0[r10]
                r6.getClass()
                lk50 r6 = (defpackage.lk50) r6
                r7 = 3
                r7 = r0[r7]
                r7.getClass()
                lk50 r7 = (defpackage.lk50) r7
                if (r5 == 0) goto L62
                r13 = 5
                r13 = r0[r13]
                r13.getClass()
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L62
                r2 = r1
            L62:
                r13 = 6
                r0 = r0[r13]
                r0.getClass()
                qki0 r0 = (defpackage.qki0) r0
                r14.b = r11
                r14.c = r11
                r14.e = r12
                r14.a = r1
                int r1 = defpackage.zhi0.f
                r1 = r4
                r4 = r7
                r7 = r0
                zhi0 r0 = r14.d
                r8 = r6
                r6 = r2
                r2 = r8
                r8 = r14
                java.lang.Object r0 = r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
                if (r0 != r9) goto L84
                goto L92
            L84:
                r14.b = r11
                r14.c = r11
                r14.e = r11
                r14.a = r10
                java.lang.Object r0 = r12.emit(r0, r14)
                if (r0 != r9) goto L93
            L92:
                return r9
            L93:
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: xhi0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public xhi0(lyh[] lyhVarArr, zhi0 zhi0Var) {
        this.a = lyhVarArr;
        this.b = zhi0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super thi0> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            lyh[] lyhVarArr = this.a;
            b bVar = new b(lyhVarArr);
            c cVar = new c(null, this.b);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
