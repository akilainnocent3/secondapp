package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx730;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x730 extends j8i0 {
    public final v800 a;
    public final int b;
    public final wwd0 c;
    public final v340 d;
    public final v340 e;

    @c0d(c = "com.sportybet.android.globalpay.providerselect.ProviderSelectViewModel$special$$inlined$flatMapLatest$1", f = "ProviderSelectViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<myh<? super Integer>, List<? extends o800.a>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ x730 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, x730 x730Var) {
            super(3, v1bVar);
            this.d = x730Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Integer> myhVar, List<? extends o800.a> list, v1b<? super Unit> v1bVar) {
            a aVar = new a(v1bVar, this.d);
            aVar.b = myhVar;
            aVar.c = list;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                x730 x730Var = this.d;
                ztw<Integer> ztwVar = x730Var.a.n.get(Integer.valueOf(x730Var.b));
                if (ztwVar == null) {
                    ztwVar = i2g.a;
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, ztwVar, this) == y5bVar) {
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

    public x730(v800 v800Var, vu60 vu60Var) {
        v800Var.getClass();
        vu60Var.getClass();
        this.a = v800Var;
        Integer num = (Integer) vu60Var.b("arg_provider_tab_index");
        int iIntValue = num != null ? num.intValue() : -1;
        this.b = iIntValue;
        this.c = v800Var.i;
        v340 v340VarE = e1i.e(uzh.b(new q800(v800Var.g, iIntValue)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), null);
        this.d = v340VarE;
        this.e = e1i.e(r0i.f(new f1i(v340VarE), new a(null, this)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), null);
    }
}
