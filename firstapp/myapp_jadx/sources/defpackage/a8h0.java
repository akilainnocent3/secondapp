package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.transaction.domain.model.LastDayRangeOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$special$$inlined$transform$1", f = "TxListViewModel.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class a8h0 extends tje0 implements Function2<myh<? super gqx>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f1i c;
    public final /* synthetic */ o7h0 d;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh<gqx> a;
        public final /* synthetic */ o7h0 b;

        public a(myh myhVar, o7h0 o7h0Var) {
            this.b = o7h0Var;
            this.a = myhVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(T t, v1b<? super Unit> v1bVar) {
            a1h0 a1h0Var = this.b.c;
            LastDayRangeOption lastDayRangeOption = ((o7h0.a) t).a.a;
            a1h0Var.getClass();
            lastDayRangeOption.getClass();
            Object objCollect = new y0h0(new yzh(a1h0Var.a.needShow("need_show_tx_date_range_new_feature_alert"), new z0h0(3, null)), lastDayRangeOption).collect(new r7h0(this.a), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8h0(f1i f1iVar, v1b v1bVar, o7h0 o7h0Var) {
        super(2, v1bVar);
        this.c = f1iVar;
        this.d = o7h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a8h0 a8h0Var = new a8h0(this.c, v1bVar, this.d);
        a8h0Var.b = obj;
        return a8h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super gqx> myhVar, v1b<? super Unit> v1bVar) {
        return ((a8h0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a((myh) this.b, this.d);
            this.b = null;
            this.a = 1;
            if (this.c.collect(aVar, this) == y5bVar) {
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
