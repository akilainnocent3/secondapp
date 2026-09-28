package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {90}, m = "invokeSuspend")
public final class syh extends tje0 implements Function2<ez20<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ s9s c;
    public final /* synthetic */ s9s.b d;
    public final /* synthetic */ lyh<Object> e;

    @c0d(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {90}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ lyh<Object> b;
        public final /* synthetic */ ez20<Object> c;

        /* JADX INFO: renamed from: syh$a$a, reason: collision with other inner class name */
        public static final class C1108a<T> implements myh {
            public final /* synthetic */ ez20<T> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C1108a(ez20<? super T> ez20Var) {
                this.a = ez20Var;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                Object objJ = this.a.j(v1bVar, t);
                return objJ == y5b.a ? objJ : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh<Object> lyhVar, ez20<Object> ez20Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = lyhVar;
            this.c = ez20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C1108a c1108a = new C1108a(this.c);
                this.a = 1;
                if (this.b.collect(c1108a, this) == y5bVar) {
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
    public syh(s9s s9sVar, s9s.b bVar, lyh<Object> lyhVar, v1b<? super syh> v1bVar) {
        super(2, v1bVar);
        this.c = s9sVar;
        this.d = bVar;
        this.e = lyhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        syh syhVar = new syh(this.c, this.d, this.e, v1bVar);
        syhVar.b = obj;
        return syhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<Object> ez20Var, v1b<? super Unit> v1bVar) {
        return ((syh) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ez20 ez20Var;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ez20 ez20Var2 = (ez20) this.b;
            a aVar = new a(this.e, ez20Var2, null);
            this.b = ez20Var2;
            this.a = 1;
            if (m850.a(this.c, this.d, aVar, this) == y5bVar) {
                return y5bVar;
            }
            ez20Var = ez20Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ez20Var = (ez20) this.b;
            uj50.b(obj);
        }
        ez20Var.k(null);
        return Unit.a;
    }
}
