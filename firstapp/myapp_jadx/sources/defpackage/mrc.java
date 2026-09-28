package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
public final class mrc extends tje0 implements Function1<v1b<Object>, Object> {
    public Object a;
    public int b;
    public final /* synthetic */ yqc<Object> c;
    public final /* synthetic */ CoroutineContext d;
    public final /* synthetic */ Function2<Object, v1b<Object>, Object> e;

    @c0d(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<Object>, Object> {
        public int a;
        public final /* synthetic */ Function2<Object, v1b<Object>, Object> b;
        public final /* synthetic */ ioc<Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<Object, ? super v1b<Object>, ? extends Object> function2, ioc<Object> iocVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = function2;
            this.c = iocVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            Object obj2 = this.c.b;
            this.a = 1;
            Object objInvoke = this.b.invoke(obj2, this);
            return objInvoke == y5bVar ? y5bVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mrc(yqc<Object> yqcVar, CoroutineContext coroutineContext, Function2<Object, ? super v1b<Object>, ? extends Object> function2, v1b<? super mrc> v1bVar) {
        super(1, v1bVar);
        this.c = yqcVar;
        this.d = coroutineContext;
        this.e = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new mrc(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<Object> v1bVar) {
        return ((mrc) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws j6b {
        ioc iocVar;
        T t;
        int iHashCode;
        y5b y5bVar = y5b.a;
        int i = this.b;
        yqc<Object> yqcVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            this.b = 1;
            obj = yqcVar.g(true, this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj2 = this.a;
                uj50.b(obj);
                return obj2;
            }
            iocVar = (ioc) this.a;
            uj50.b(obj);
        }
        t = iocVar.b;
        if (t != 0) {
            iHashCode = t.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode == iocVar.c) {
            ib5.a("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        if (!Intrinsics.g(iocVar.b, obj)) {
            this.a = obj;
            this.b = 3;
            if (yqcVar.h(obj, true, this) == y5bVar) {
                return y5bVar;
            }
        }
        return obj;
        iocVar = (ioc) obj;
        a aVar = new a(this.e, iocVar, null);
        this.a = iocVar;
        this.b = 2;
        obj = ej5.d(this.d, aVar, this);
        if (obj != y5bVar) {
            t = iocVar.b;
            if (t != 0) {
                iHashCode = t.hashCode();
            } else {
                iHashCode = 0;
            }
            if (iHashCode == iocVar.c) {
                ib5.a("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                return null;
            }
            if (!Intrinsics.g(iocVar.b, obj)) {
                this.a = obj;
                this.b = 3;
                if (yqcVar.h(obj, true, this) == y5bVar) {
                }
            }
            return obj;
        }
        return y5bVar;
    }
}
