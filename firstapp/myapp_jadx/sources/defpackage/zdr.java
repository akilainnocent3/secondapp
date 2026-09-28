package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffViewModel$2", f = "LNShowOffViewModel.kt", l = {177}, m = "invokeSuspend", v = 2)
public final class zdr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ber b;

    @c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffViewModel$2$1", f = "LNShowOffViewModel.kt", l = {180, 181, 184, 188, 193, 194, 196, 201, 203, 209}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<y8r, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ ber c;
        public final /* synthetic */ wwd0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ber berVar, wwd0 wwd0Var, v1b v1bVar) {
            super(2, v1bVar);
            this.c = berVar;
            this.d = wwd0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(y8r y8rVar, v1b<? super Unit> v1bVar) {
            return ((a) create(y8rVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0058 A[PHI: r8
          0x0058: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:17:0x0054, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x0062  */
        /* JADX WARN: Code duplicated, block: B:23:0x0066  */
        /* JADX WARN: Code duplicated, block: B:26:0x007b  */
        /* JADX WARN: Code duplicated, block: B:28:0x007f  */
        /* JADX WARN: Code duplicated, block: B:31:0x008f  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:53:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:56:0x0106  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
        
            if (kotlin.Unit.a == r3) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
        
            if (kotlin.Unit.a == r3) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
        
            if (kotlin.Unit.a == r3) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
        
            if (kotlin.Unit.a == r3) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0103, code lost:
        
            if (kotlin.Unit.a == r3) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0118, code lost:
        
            if (kotlin.Unit.a == r3) goto L58;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zdr.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdr(ber berVar, v1b<? super zdr> v1bVar) {
        super(2, v1bVar);
        this.b = berVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zdr(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zdr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ber berVar = this.b;
            wwd0 wwd0Var = berVar.i.e;
            a aVar = new a(berVar, wwd0Var, null);
            this.a = 1;
            if (kzh.b(wwd0Var, aVar, this) == y5bVar) {
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
