package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {600}, m = "invokeSuspend")
public final class v480 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ dtg0<Object> b;
    public final /* synthetic */ u480<Object> c;
    public final /* synthetic */ Object d;

    @c0d(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2173, 613, 615, 669, 671}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public tuw a;
        public u480 b;
        public int c;
        public final /* synthetic */ u480<Object> d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ dtg0<Object> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, u480 u480Var, dtg0 dtg0Var, Object obj) {
            super(2, v1bVar);
            this.d = u480Var;
            this.e = obj;
            this.f = dtg0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            Object obj2 = this.e;
            return new a(v1bVar, this.d, this.f, obj2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00cb A[PHI: r16
          0x00cb: PHI (r16v6 long) = (r16v4 long), (r16v5 long), (r16v9 long) binds: [B:26:0x0090, B:40:0x00c7, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x00db  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:56:0x0109  */
        /* JADX WARN: Code duplicated, block: B:58:0x0118  */
        /* JADX WARN: Code duplicated, block: B:59:0x011a  */
        /* JADX WARN: Code duplicated, block: B:69:0x013d  */
        /* JADX WARN: Code duplicated, block: B:71:0x0141  */
        /* JADX WARN: Code duplicated, block: B:76:0x0189  */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0192, code lost:
        
            if (r14.v0(r24) == r1) goto L78;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 418
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v480.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v480(v1b v1bVar, u480 u480Var, dtg0 dtg0Var, Object obj) {
        super(1, v1bVar);
        this.b = dtg0Var;
        this.c = u480Var;
        this.d = obj;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new v480(v1bVar, this.c, this.b, this.d);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((v480) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        dtg0<Object> dtg0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(null, this.c, dtg0Var, this.d);
            this.a = 1;
            if (w5b.d(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        dtg0Var.k();
        return Unit.a;
    }
}
