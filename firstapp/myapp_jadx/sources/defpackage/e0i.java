package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class e0i<T> implements myh {
    public final /* synthetic */ bq40 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ myh<T> c;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {22}, m = "emit")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public final /* synthetic */ e0i<T> b;
        public int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e0i<? super T> e0iVar, v1b<? super a> v1bVar) {
            super(v1bVar);
            this.b = e0iVar;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return this.b.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0i(bq40 bq40Var, int i, myh<? super T> myhVar) {
        this.a = bq40Var;
        this.b = i;
        this.c = myhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.myh
    public final Object emit(T t, v1b<? super Unit> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, v1bVar);
            }
        } else {
            aVar = new a(this, v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            bq40 bq40Var = this.a;
            int i3 = bq40Var.a;
            if (i3 < this.b) {
                bq40Var.a = i3 + 1;
                return Unit.a;
            }
            aVar.c = 1;
            if (this.c.emit(t, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
