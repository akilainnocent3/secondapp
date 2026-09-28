package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.LifecycleEffectKt$CollectEffectWithLifecycleAsync$1$1", f = "LifecycleEffect.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class yas extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ s9s.b c;
    public final /* synthetic */ lyh<Object> d;
    public final /* synthetic */ gaj<v5b, Object, v1b<? super Unit>, Object> e;

    @c0d(c = "com.sporty.android.compose.ui.LifecycleEffectKt$CollectEffectWithLifecycleAsync$1$1$1", f = "LifecycleEffect.kt", l = {47}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh<Object> c;
        public final /* synthetic */ gaj<v5b, Object, v1b<? super Unit>, Object> d;

        /* JADX INFO: renamed from: yas$a$a, reason: collision with other inner class name */
        public static final class C1330a<T> implements myh {
            public final /* synthetic */ gaj<v5b, T, v1b<? super Unit>, Object> a;
            public final /* synthetic */ v5b b;

            /* JADX WARN: Multi-variable type inference failed */
            public C1330a(gaj<? super v5b, ? super T, ? super v1b<? super Unit>, ? extends Object> gajVar, v5b v5bVar) {
                this.a = gajVar;
                this.b = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                Object objInvoke = this.a.invoke(this.b, t, v1bVar);
                return objInvoke == y5b.a ? objInvoke : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(lyh<Object> lyhVar, gaj<? super v5b, Object, ? super v1b<? super Unit>, ? extends Object> gajVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = gajVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C1330a c1330a = new C1330a(this.d, v5bVar);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1330a, this) == y5bVar) {
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
    public yas(ibs ibsVar, s9s.b bVar, lyh<Object> lyhVar, gaj<? super v5b, Object, ? super v1b<? super Unit>, ? extends Object> gajVar, v1b<? super yas> v1bVar) {
        super(2, v1bVar);
        this.b = ibsVar;
        this.c = bVar;
        this.d = lyhVar;
        this.e = gajVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yas(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yas) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            a aVar = new a(this.d, this.e, null);
            this.a = 1;
            if (m850.a(lifecycle, this.c, aVar, this) == y5bVar) {
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
