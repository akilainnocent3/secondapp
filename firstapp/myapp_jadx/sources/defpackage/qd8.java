package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2", f = "LimitOffsetPagingSource.kt", l = {124}, m = "invokeSuspend")
public final class qd8 extends tje0 implements Function2<v5b, v1b<? super wqz.b<Integer, Object>>, Object> {
    public int a;
    public final /* synthetic */ ud8<Object> b;
    public final /* synthetic */ wqz.a<Integer> c;

    @c0d(c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2$1", f = "LimitOffsetPagingSource.kt", l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<crg0, v1b<? super wqz.b<Integer, Object>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ ud8<Object> c;
        public final /* synthetic */ wqz.a<Integer> d;

        /* JADX INFO: renamed from: qd8$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2$1$1", f = "LimitOffsetPagingSource.kt", l = {127, 129}, m = "invokeSuspend")
        public static final class C1009a extends tje0 implements Function2<sqg0<wqz.b<Integer, Object>>, v1b<? super wqz.b<Integer, Object>>, Object> {
            public int a;
            public final /* synthetic */ ud8<Object> b;
            public final /* synthetic */ wqz.a<Integer> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1009a(ud8<Object> ud8Var, wqz.a<Integer> aVar, v1b<? super C1009a> v1bVar) {
                super(2, v1bVar);
                this.b = ud8Var;
                this.c = aVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1009a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(sqg0<wqz.b<Integer, Object>> sqg0Var, v1b<? super wqz.b<Integer, Object>> v1bVar) {
                return ((C1009a) create(sqg0Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                ud8<Object> ud8Var = this.b;
                if (i == 0) {
                    uj50.b(obj);
                    bw50 bw50Var = ud8Var.e;
                    lv50 lv50Var = ud8Var.d;
                    this.a = 1;
                    obj = ej5.d(((j1b) lv50Var.i()).a, new yv50(lv50Var, uf80.a(new StringBuilder("SELECT COUNT(*) FROM ( "), bw50Var.a, " )"), bw50Var, null), this);
                    if (obj != y5bVar) {
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                int iIntValue = ((Number) obj).intValue();
                ud8Var.f.set(iIntValue);
                bw50 bw50Var2 = ud8Var.e;
                xbs.a aVar = ud8Var.c;
                this.a = 2;
                Object objA = zv50.a(this.c, bw50Var2, iIntValue, aVar, this);
                return objA == y5bVar ? y5bVar : objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ud8<Object> ud8Var, wqz.a<Integer> aVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = ud8Var;
            this.d = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(crg0 crg0Var, v1b<? super wqz.b<Integer, Object>> v1bVar) {
            return ((a) create(crg0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            crg0 crg0Var = (crg0) this.b;
            crg0.a aVar = crg0.a.a;
            C1009a c1009a = new C1009a(this.c, this.d, null);
            this.a = 1;
            Object objA = crg0Var.a(aVar, c1009a, this);
            return objA == y5bVar ? y5bVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd8(ud8<Object> ud8Var, wqz.a<Integer> aVar, v1b<? super qd8> v1bVar) {
        super(2, v1bVar);
        this.b = ud8Var;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qd8(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super wqz.b<Integer, Object>> v1bVar) {
        return ((qd8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ud8<Object> ud8Var = this.b;
        lv50 lv50Var = ud8Var.d;
        a aVar = new a(ud8Var, this.c, null);
        this.a = 1;
        Object objW = lv50Var.w(true, aVar, this);
        return objW == y5bVar ? y5bVar : objW;
    }
}
