package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
public final class xqc extends tje0 implements Function1<v1b<? super ioc<Object>>, Object> {
    public Object a;
    public Serializable b;
    public Object c;
    public Object d;
    public Iterator e;
    public int f;
    public int i;
    public final /* synthetic */ yqc<Object> v;
    public final /* synthetic */ yqc<Object>.a w;

    public static final class a implements ain<Object> {
        public final /* synthetic */ quw a;
        public final /* synthetic */ yp40 b;
        public final /* synthetic */ dq40<Object> c;
        public final /* synthetic */ yqc<Object> d;

        public a(quw quwVar, yp40 yp40Var, dq40<Object> dq40Var, yqc<Object> yqcVar) {
            this.a = quwVar;
            this.b = yp40Var;
            this.c = dq40Var;
            this.d = yqcVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00a8, B:37:0x00b0), top: B:52:0x004e }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ain
        public final Object a(npc npcVar, x1b x1bVar) throws Throwable {
            wqc wqcVar;
            quw quwVar;
            yp40 yp40Var;
            dq40<Object> dq40Var;
            yqc<Object> yqcVar;
            Function2 function2;
            quw quwVar2;
            quw quwVar3;
            dq40<Object> dq40Var2;
            T t;
            if (x1bVar instanceof wqc) {
                wqcVar = (wqc) x1bVar;
                int i = wqcVar.v;
                if ((i & Integer.MIN_VALUE) != 0) {
                    wqcVar.v = i - Integer.MIN_VALUE;
                } else {
                    wqcVar = new wqc(this, x1bVar);
                }
            } else {
                wqcVar = new wqc(this, x1bVar);
            }
            Object obj = wqcVar.f;
            y5b y5bVar = y5b.a;
            int i2 = wqcVar.v;
            try {
                if (i2 == 0) {
                    uj50.b(obj);
                    wqcVar.a = npcVar;
                    quwVar = this.a;
                    wqcVar.b = quwVar;
                    yp40Var = this.b;
                    wqcVar.c = yp40Var;
                    dq40Var = this.c;
                    wqcVar.d = dq40Var;
                    yqcVar = this.d;
                    wqcVar.e = yqcVar;
                    wqcVar.v = 1;
                    if (quwVar.d(wqcVar) != y5bVar) {
                    }
                    function2 = npcVar;
                    return y5bVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = wqcVar.c;
                        dq40Var2 = (dq40) wqcVar.b;
                        quwVar2 = (quw) wqcVar.a;
                        try {
                            uj50.b(obj);
                            t = obj2;
                            dq40Var2.a = t;
                            Object obj3 = dq40Var2.a;
                            quwVar2.f(null);
                            return obj3;
                        } catch (Throwable th) {
                            th = th;
                            quwVar2.f(null);
                            throw th;
                        }
                    }
                    yqcVar = (yqc) wqcVar.c;
                    dq40Var2 = (dq40) wqcVar.b;
                    quwVar3 = (quw) wqcVar.a;
                    try {
                        uj50.b(obj);
                        if (!Intrinsics.g(obj, dq40Var2.a)) {
                            wqcVar.a = quwVar3;
                            wqcVar.b = dq40Var2;
                            wqcVar.c = obj;
                            wqcVar.v = 3;
                            if (yqcVar.h(obj, false, wqcVar) != y5bVar) {
                                t = obj;
                                quwVar2 = quwVar3;
                                dq40Var2.a = t;
                            }
                            function2 = npcVar;
                            return y5bVar;
                        }
                        quwVar2 = quwVar3;
                        Object obj4 = dq40Var2.a;
                        quwVar2.f(null);
                        return obj4;
                    } catch (Throwable th2) {
                        th = th2;
                        quwVar2 = quwVar3;
                        quwVar2.f(null);
                        throw th;
                    }
                }
                yqcVar = wqcVar.e;
                dq40<Object> dq40Var3 = wqcVar.d;
                yp40Var = (yp40) wqcVar.c;
                quw quwVar4 = (quw) wqcVar.b;
                Function2 function3 = (Function2) wqcVar.a;
                uj50.b(obj);
                dq40Var = dq40Var3;
                function2 = function3;
                quwVar = quwVar4;
                function2 = npcVar;
                if (yp40Var.a) {
                    throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                }
                Object obj5 = dq40Var.a;
                wqcVar.a = quwVar;
                wqcVar.b = dq40Var;
                wqcVar.c = yqcVar;
                wqcVar.d = null;
                wqcVar.e = null;
                wqcVar.v = 2;
                Object objInvoke = function2.invoke(obj5, wqcVar);
                if (objInvoke != y5bVar) {
                    quwVar3 = quwVar;
                    obj = objInvoke;
                    dq40Var2 = dq40Var;
                    if (!Intrinsics.g(obj, dq40Var2.a)) {
                        wqcVar.a = quwVar3;
                        wqcVar.b = dq40Var2;
                        wqcVar.c = obj;
                        wqcVar.v = 3;
                        if (yqcVar.h(obj, false, wqcVar) != y5bVar) {
                            t = obj;
                            quwVar2 = quwVar3;
                            dq40Var2.a = t;
                        }
                    } else {
                        quwVar2 = quwVar3;
                    }
                    Object obj6 = dq40Var2.a;
                    quwVar2.f(null);
                    return obj6;
                }
                function2 = npcVar;
                return y5bVar;
            } catch (Throwable th3) {
                th = th3;
                quwVar2 = quwVar;
                quwVar2.f(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqc(yqc<Object> yqcVar, yqc<Object>.a aVar, v1b<? super xqc> v1bVar) {
        super(1, v1bVar);
        this.v = yqcVar;
        this.w = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new xqc(this.v, this.w, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super ioc<Object>> v1bVar) {
        return ((xqc) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x009c->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws j6b {
        quw quwVarA;
        yp40 yp40Var;
        dq40 dq40Var;
        dq40 dq40Var2;
        quw quwVar;
        Iterator it;
        quw quwVar2;
        yp40 yp40Var2;
        dq40 dq40Var3;
        a aVar;
        dq40 dq40Var4;
        yp40 yp40Var3;
        Function2 function2;
        Object obj2;
        int iHashCode;
        Object objD;
        Object obj3;
        int i;
        y5b y5bVar = y5b.a;
        int i2 = this.i;
        yqc<Object>.a aVar2 = this.w;
        yqc<Object> yqcVar = this.v;
        if (i2 == 0) {
            uj50.b(obj);
            quwVarA = uuw.a();
            yp40Var = new yp40();
            dq40Var = new dq40();
            this.a = quwVarA;
            this.b = yp40Var;
            this.c = dq40Var;
            this.d = dq40Var;
            this.i = 1;
            obj = yqcVar.g(true, this);
            if (obj != y5bVar) {
                dq40Var2 = dq40Var;
            }
            return y5bVar;
        }
        if (i2 == 1) {
            dq40Var = (dq40) this.d;
            dq40Var2 = (dq40) this.c;
            yp40Var = (yp40) this.b;
            quwVarA = (quw) this.a;
            uj50.b(obj);
        } else {
            if (i2 == 2) {
                it = this.e;
                aVar = (a) this.d;
                dq40Var3 = (dq40) this.c;
                yp40Var2 = (yp40) this.b;
                quwVar2 = (quw) this.a;
                uj50.b(obj);
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    this.a = quwVar2;
                    this.b = yp40Var2;
                    this.c = dq40Var3;
                    this.d = aVar;
                    this.e = it;
                    this.i = 2;
                    if (function2.invoke(aVar, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                dq40Var2 = dq40Var3;
                yp40Var = yp40Var2;
                quwVar = quwVar2;
                aVar2.c = null;
                this.a = yp40Var;
                this.b = dq40Var2;
                this.c = quwVar;
                this.d = null;
                this.e = null;
                this.i = 3;
                if (quwVar.d(this) != y5bVar) {
                    dq40Var4 = dq40Var2;
                    yp40Var3 = yp40Var;
                    yp40Var3.a = true;
                    Unit unit = Unit.a;
                    quwVar.f(null);
                    obj2 = dq40Var4.a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    wxo wxoVarB = yqcVar.b();
                    this.a = obj2;
                    this.b = null;
                    this.c = null;
                    this.f = iHashCode;
                    this.i = 4;
                    objD = wxoVarB.d(this);
                    if (objD != y5bVar) {
                        obj = objD;
                        obj3 = obj2;
                        i = iHashCode;
                    }
                }
                return y5bVar;
            }
            if (i2 == 3) {
                quwVar = (quw) this.c;
                dq40Var4 = (dq40) this.b;
                yp40Var3 = (yp40) this.a;
                uj50.b(obj);
                try {
                    yp40Var3.a = true;
                    Unit unit2 = Unit.a;
                    quwVar.f(null);
                    obj2 = dq40Var4.a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    wxo wxoVarB2 = yqcVar.b();
                    this.a = obj2;
                    this.b = null;
                    this.c = null;
                    this.f = iHashCode;
                    this.i = 4;
                    objD = wxoVarB2.d(this);
                    if (objD != y5bVar) {
                        obj = objD;
                        obj3 = obj2;
                        i = iHashCode;
                    }
                    return y5bVar;
                } catch (Throwable th) {
                    quwVar.f(null);
                    throw th;
                }
            }
            if (i2 != 4) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f;
            obj3 = this.a;
            uj50.b(obj);
        }
        return new ioc(i, ((Number) obj).intValue(), obj3);
        dq40Var.a = ((ioc) obj).b;
        a aVar3 = new a(quwVarA, yp40Var, dq40Var2, yqcVar);
        List<? extends Function2<? super ain<Object>, ? super v1b<? super Unit>, ? extends Object>> list = aVar2.c;
        if (list != null) {
            it = list.iterator();
            quwVar2 = quwVarA;
            yp40Var2 = yp40Var;
            dq40Var3 = dq40Var2;
            aVar = aVar3;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                this.a = quwVar2;
                this.b = yp40Var2;
                this.c = dq40Var3;
                this.d = aVar;
                this.e = it;
                this.i = 2;
                if (function2.invoke(aVar, this) == y5bVar) {
                    return y5bVar;
                }
            }
            dq40Var2 = dq40Var3;
            yp40Var = yp40Var2;
            quwVar = quwVar2;
        } else {
            quwVar = quwVarA;
        }
        aVar2.c = null;
        this.a = yp40Var;
        this.b = dq40Var2;
        this.c = quwVar;
        this.d = null;
        this.e = null;
        this.i = 3;
        if (quwVar.d(this) != y5bVar) {
            dq40Var4 = dq40Var2;
            yp40Var3 = yp40Var;
            yp40Var3.a = true;
            Unit unit3 = Unit.a;
            quwVar.f(null);
            obj2 = dq40Var4.a;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            wxo wxoVarB3 = yqcVar.b();
            this.a = obj2;
            this.b = null;
            this.c = null;
            this.f = iHashCode;
            this.i = 4;
            objD = wxoVarB3.d(this);
            if (objD != y5bVar) {
                obj = objD;
                obj3 = obj2;
                i = iHashCode;
                return new ioc(i, ((Number) obj).intValue(), obj3);
            }
        }
        return y5bVar;
    }
}
