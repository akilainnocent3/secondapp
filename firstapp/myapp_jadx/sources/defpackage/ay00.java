package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$observeNetworkErrors$1", f = "PiggyBashViewModel.kt", l = {280}, m = "invokeSuspend", v = 1)
public final class ay00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vx00 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ vx00 a;

        /* JADX INFO: renamed from: ay00$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$observeNetworkErrors$1$1", f = "PiggyBashViewModel.kt", l = {281, 283, 290, 292, 297, 299, 304}, m = "emit", v = 1)
        public static final class C0104a extends x1b {
            public ou00 a;
            public /* synthetic */ Object b;
            public final /* synthetic */ a<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0104a(a<? super T> aVar, v1b<? super C0104a> v1bVar) {
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

        public a(vx00 vx00Var) {
            this.a = vx00Var;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0065  */
        /* JADX WARN: Code duplicated, block: B:29:0x0080  */
        /* JADX WARN: Code duplicated, block: B:31:0x0084  */
        /* JADX WARN: Code duplicated, block: B:33:0x0090  */
        /* JADX WARN: Code duplicated, block: B:35:0x0094 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x0098 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x009a  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:48:0x00c6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:59:0x00f2 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:67:0x0109  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            if (kotlin.Unit.a == r8) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
        
            if (kotlin.Unit.a == r8) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
        
            if (kotlin.Unit.a == r8) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
        
            if (kotlin.Unit.a == r8) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00ec, code lost:
        
            if (kotlin.Unit.a == r8) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0100, code lost:
        
            if (kotlin.Unit.a == r8) goto L62;
         */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.ou00 r7, defpackage.v1b<? super kotlin.Unit> r8) {
            /*
                Method dump skipped, instruction units count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ay00.a.emit(ou00, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay00(vx00 vx00Var, v1b<? super ay00> v1bVar) {
        super(2, v1bVar);
        this.b = vx00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ay00(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((ay00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        vx00 vx00Var = this.b;
        b390 b390VarA = vx00Var.C.a();
        a aVar = new a(vx00Var);
        this.a = 1;
        b390VarA.collect(aVar, this);
        return y5bVar;
    }
}
