package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", l = {88}, m = "invokeSuspend")
public final class vyh extends tje0 implements Function2<hk90<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lyh<Object> c;
    public final /* synthetic */ gaj<myh<Object>, Object, v1b<? super Unit>, Object> d;

    @c0d(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", l = {89}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<Object, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ gaj<myh<Object>, Object, v1b<? super Unit>, Object> c;
        public final /* synthetic */ w67<Object> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(gaj<? super myh<Object>, Object, ? super v1b<? super Unit>, ? extends Object> gajVar, w67<Object> w67Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = gajVar;
            this.d = w67Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
            return ((a) create(obj, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Object obj2 = this.b;
                this.a = 1;
                if (this.c.invoke(this.d, obj2, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vyh(lyh<Object> lyhVar, gaj<? super myh<Object>, Object, ? super v1b<? super Unit>, ? extends Object> gajVar, v1b<? super vyh> v1bVar) {
        super(2, v1bVar);
        this.c = lyhVar;
        this.d = gajVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vyh vyhVar = new vyh(this.c, this.d, v1bVar);
        vyhVar.b = obj;
        return vyhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hk90<Object> hk90Var, v1b<? super Unit> v1bVar) {
        return ((vyh) create(hk90Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(this.d, new w67((hk90) this.b), null);
            this.a = 1;
            if (kzh.b(this.c, aVar, this) == y5bVar) {
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
