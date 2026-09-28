package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class u160 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @c0d(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
    public static final class a<T> extends tje0 implements Function2<v5b, v1b<? super T>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Function2<v5b, v1b<? super T>, Object> b;

        /* JADX INFO: renamed from: u160$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
        public static final class C1159a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ dm8 c;
            public final /* synthetic */ Function2<v5b, v1b<? super T>, Object> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1159a(dm8 dm8Var, Function2 function2, v1b v1bVar) {
                super(2, v1bVar);
                this.c = dm8Var;
                this.d = function2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1159a c1159a = new C1159a(this.c, this.d, v1bVar);
                c1159a.b = obj;
                return c1159a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1159a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                cm8 cm8Var;
                cm8 cm8Var2;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    v5b v5bVar = (v5b) this.b;
                    dm8 dm8Var = this.c;
                    Function2<v5b, v1b<? super T>, Object> function2 = this.d;
                    try {
                        zi50.a aVar = zi50.b;
                        this.b = dm8Var;
                        this.a = 1;
                        obj = function2.invoke(v5bVar, this);
                        if (obj == y5bVar) {
                            return y5bVar;
                        }
                        cm8Var = dm8Var;
                    } catch (Throwable th) {
                        th = th;
                        cm8Var = dm8Var;
                        zi50.a aVar2 = zi50.b;
                        obj = new zi50.b(th);
                        cm8Var2 = cm8Var;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cm8Var = (cm8) this.b;
                    try {
                        uj50.b(obj);
                        cm8Var = cm8Var;
                    } catch (Throwable th2) {
                        th = th2;
                        zi50.a aVar3 = zi50.b;
                        obj = new zi50.b(th);
                        cm8Var2 = cm8Var;
                    }
                }
                zi50.a aVar4 = zi50.b;
                cm8Var2 = cm8Var;
                Throwable thA = zi50.a(obj);
                if (thA == null) {
                    cm8Var2.G(obj);
                } else {
                    cm8Var2.F(thA);
                }
                return Unit.a;
            }
        }

        @c0d(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
        public static final class b extends tje0 implements Function2<v5b, v1b<? super T>, Object> {
            public int a;
            public final /* synthetic */ dm8 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(dm8 dm8Var, v1b v1bVar) {
                super(2, v1bVar);
                this.b = dm8Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, Object obj) {
                return ((b) create(v5bVar, (v1b) obj)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) throws Throwable {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = 1;
                    Object objQ = this.b.q(this);
                    return objQ == y5bVar ? y5bVar : objQ;
                }
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super v5b, ? super v1b<? super T>, ? extends Object> function2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = function2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, Object obj) {
            return ((a) create(v5bVar, (v1b) obj)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            CoroutineContext.Element element = ((v5b) this.a).getCoroutineContext().get(d.n);
            element.getClass();
            d dVar = (d) element;
            dm8 dm8VarA = em8.a();
            ej5.b(q2l.a, dVar, a6b.d, new C1159a(dm8VarA, this.b, null));
            while (!dm8VarA.isCompleted()) {
                try {
                    return dj5.a(dVar, new b(dm8VarA, null));
                } catch (InterruptedException unused) {
                }
            }
            return dm8VarA.B();
        }
    }

    public static final <T> T a(Function2<? super v5b, ? super v1b<? super T>, ? extends Object> function2) {
        Thread.interrupted();
        return (T) dj5.a(e.a, new a(function2, null));
    }
}
