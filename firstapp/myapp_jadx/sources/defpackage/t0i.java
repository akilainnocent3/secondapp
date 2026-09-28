package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class t0i implements myh<Object> {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ dq40 b;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
    public static final class a extends x1b {
        public t0i a;
        public /* synthetic */ Object b;
        public int c;
        public Object e;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return t0i.this.emit(null, this);
        }
    }

    public t0i(Function2 function2, dq40 dq40Var) {
        this.a = function2;
        this.b = dq40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.myh
    public final Object emit(Object obj, v1b<? super Unit> v1bVar) {
        a aVar;
        T t;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object objInvoke = aVar.b;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        if (i2 == 0) {
            uj50.b(objInvoke);
            aVar.a = this;
            aVar.e = obj;
            aVar.c = 1;
            objInvoke = this.a.invoke(obj, aVar);
            if (objInvoke == y5bVar) {
                t = obj;
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = aVar.e;
            this = aVar.a;
            uj50.b(objInvoke);
            t = obj2;
        }
        t = obj;
        if (!((Boolean) objInvoke).booleanValue()) {
            return Unit.a;
        }
        this.b.a = t;
        throw new t1(this);
    }
}
