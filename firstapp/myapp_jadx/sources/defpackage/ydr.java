package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffViewModel$1", f = "LNShowOffViewModel.kt", l = {141}, m = "invokeSuspend", v = 2)
public final class ydr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ber b;

    @c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffViewModel$1$1", f = "LNShowOffViewModel.kt", l = {144, 145, 149, 150, 152, 157, 159, 165}, m = "invokeSuspend", v = 2)
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

        /* JADX WARN: Code duplicated, block: B:25:0x0073  */
        /* JADX WARN: Code duplicated, block: B:28:0x0082  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        
            if (kotlin.Unit.a == r3) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
        
            if (kotlin.Unit.a == r3) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
        
            if (kotlin.Unit.a == r3) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
        
            if (kotlin.Unit.a == r3) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
        
            if (kotlin.Unit.a == r3) goto L43;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ydr.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydr(ber berVar, v1b<? super ydr> v1bVar) {
        super(2, v1bVar);
        this.b = berVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ydr(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ydr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ber berVar = this.b;
            wwd0 wwd0Var = berVar.f.e;
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
