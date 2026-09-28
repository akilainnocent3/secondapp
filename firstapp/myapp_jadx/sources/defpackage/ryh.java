package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.utils.extension.FlowExtKt$collectFlowFromJava$1", f = "FlowExt.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class ryh extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ s9s.b c;
    public final /* synthetic */ lyh<Object> d;
    public final /* synthetic */ Function1<Throwable, Unit> e;
    public final /* synthetic */ Function1<Object, Unit> f;

    @c0d(c = "com.sportybet.core.utils.extension.FlowExtKt$collectFlowFromJava$1$1", f = "FlowExt.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ lyh<Object> b;
        public final /* synthetic */ Function1<Throwable, Unit> c;
        public final /* synthetic */ Function1<Object, Unit> d;

        /* JADX INFO: renamed from: ryh$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.core.utils.extension.FlowExtKt$collectFlowFromJava$1$1$1", f = "FlowExt.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1070a extends tje0 implements gaj<myh<Object>, Throwable, v1b<? super Unit>, Object> {
            public /* synthetic */ Throwable a;
            public final /* synthetic */ Function1<Throwable, Unit> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1070a(Function1<? super Throwable, Unit> function1, v1b<? super C1070a> v1bVar) {
                super(3, v1bVar);
                this.b = function1;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<Object> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
                C1070a c1070a = new C1070a(this.b, v1bVar);
                c1070a.a = th;
                return c1070a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) throws Throwable {
                Throwable th = this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                Function1<Throwable, Unit> function1 = this.b;
                if (function1 == null) {
                    throw th;
                }
                function1.invoke(th);
                return Unit.a;
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ Function1<T, Unit> a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super T, Unit> function1) {
                this.a = function1;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                this.a.invoke(t);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(lyh<Object> lyhVar, Function1<? super Throwable, Unit> function1, Function1<Object, Unit> function2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = lyhVar;
            this.c = function1;
            this.d = function2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
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
                yzh yzhVar = new yzh(this.b, new C1070a(this.c, null));
                b bVar = new b(this.d);
                this.a = 1;
                if (yzhVar.collect(bVar, this) == y5bVar) {
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
    public ryh(ibs ibsVar, s9s.b bVar, lyh<Object> lyhVar, Function1<? super Throwable, Unit> function1, Function1<Object, Unit> function2, v1b<? super ryh> v1bVar) {
        super(2, v1bVar);
        this.b = ibsVar;
        this.c = bVar;
        this.d = lyhVar;
        this.e = function1;
        this.f = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ryh(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ryh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            a aVar = new a(this.d, this.e, this.f, null);
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
