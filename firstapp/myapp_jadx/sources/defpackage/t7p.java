package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {207}, m = "invokeSuspend")
public final class t7p extends tje0 implements Function2<v5b, v1b<? super zn20>, Object> {
    public int a;
    public final /* synthetic */ x7p b;
    public final /* synthetic */ Function1<jtw, Unit> c;

    @c0d(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Function1<jtw, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super jtw, Unit> function1, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((a) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.invoke((jtw) this.a);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t7p(x7p x7pVar, Function1<? super jtw, Unit> function1, v1b<? super t7p> v1bVar) {
        super(2, v1bVar);
        this.b = x7pVar;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t7p(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super zn20> v1bVar) {
        return ((t7p) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        x7p x7pVar = this.b;
        ThreadLocal<Boolean> threadLocal = x7pVar.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                Boolean bool = threadLocal.get();
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.g(bool, bool2)) {
                    ib5.a("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    return null;
                }
                threadLocal.set(bool2);
                sqc<zn20> sqcVar = x7pVar.c;
                a aVar = new a(this.c, null);
                this.a = 1;
                obj = do20.a(sqcVar, aVar, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            zn20 zn20Var = (zn20) obj;
            threadLocal.set(Boolean.FALSE);
            return zn20Var;
        } catch (Throwable th) {
            threadLocal.set(Boolean.FALSE);
            throw th;
        }
    }
}
