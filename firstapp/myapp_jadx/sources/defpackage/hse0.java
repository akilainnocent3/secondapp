package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.ui.animationpanel.TGAnimationViewModel$init$3", f = "TGAnimationViewModel.kt", l = {116}, m = "invokeSuspend", v = 1)
public final class hse0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ise0 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ ise0 a;

        /* JADX INFO: renamed from: hse0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.goldmine.ui.animationpanel.TGAnimationViewModel$init$3$1", f = "TGAnimationViewModel.kt", l = {119, 122, WebSocketProtocol.PAYLOAD_SHORT, 128, 135, 141}, m = "emit", v = 1)
        public static final class C0653a extends x1b {
            public ryo a;
            public hre0 b;
            public /* synthetic */ Object c;
            public final /* synthetic */ a<T> d;
            public int e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0653a(a<? super T> aVar, v1b<? super C0653a> v1bVar) {
                super(v1bVar);
                this.d = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return this.d.emit(null, this);
            }
        }

        public a(ise0 ise0Var) {
            this.a = ise0Var;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0095  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        
            if (r5.A1(null, r0) == r1) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
        
            if (r5.emit(r6, r0) == r1) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00fe, code lost:
        
            if (r5.y1(r7, r0) == r1) goto L49;
         */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.ryo r6, defpackage.v1b<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instruction units count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: hse0.a.emit(ryo, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hse0(ise0 ise0Var, v1b<? super hse0> v1bVar) {
        super(2, v1bVar);
        this.b = ise0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hse0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((hse0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        ise0 ise0Var = this.b;
        b390 b390Var = ise0Var.B;
        a aVar = new a(ise0Var);
        this.a = 1;
        b390Var.getClass();
        b390.m(b390Var, aVar, this);
        return y5bVar;
    }
}
