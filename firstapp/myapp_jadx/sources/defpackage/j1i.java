package defpackage;

import kotlin.Unit;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes8.dex */
public final class j1i<T> implements myh {
    public final /* synthetic */ myh<IndexedValue<? extends T>> a;
    public final /* synthetic */ bq40 b;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", l = {67}, m = "emit")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public final /* synthetic */ j1i<T> b;
        public int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j1i<? super T> j1iVar, v1b<? super a> v1bVar) {
            super(v1bVar);
            this.b = j1iVar;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return this.b.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j1i(myh<? super IndexedValue<? extends T>> myhVar, bq40 bq40Var) {
        this.a = myhVar;
        this.b = bq40Var;
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
            bq40 bq40Var = this.b;
            int i3 = bq40Var.a;
            bq40Var.a = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            IndexedValue<? extends T> indexedValue = new IndexedValue<>(i3, t);
            aVar.c = 1;
            if (this.a.emit(indexedValue, aVar) == y5bVar) {
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
