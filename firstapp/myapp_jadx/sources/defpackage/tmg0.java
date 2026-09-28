package defpackage;

import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltmg0;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tmg0 extends j8i0 {
    public final sr10 a;
    public String b;
    public final wwd0 c;
    public final g1i d;
    public final wwd0 e;
    public final wwd0 f;
    public final wwd0 i;
    public final wwd0 v;
    public final ku90<TradeAdditionalResult> w;
    public final ku90 y;

    @c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.viewmodel.TradeAdditionalPinViewModel$pinTextStateFlow$1", f = "TradeAdditionalPinViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = tmg0.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = tmg0.this.i;
            if (!(wwd0Var.getValue() instanceof c330.b)) {
                c330.a aVar = new c330.a(null, !StringsKt.U(str));
                wwd0Var.getClass();
                wwd0Var.k(null, aVar);
            }
            return Unit.a;
        }
    }

    public tmg0(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
        wwd0 wwd0VarA = xwd0.a("");
        this.c = wwd0VarA;
        this.d = new g1i(wwd0VarA, new a(null));
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.e = wwd0VarA2;
        this.f = wwd0VarA2;
        wwd0 wwd0VarA3 = zjj0.a(null, false);
        this.i = wwd0VarA3;
        this.v = wwd0VarA3;
        ku90<TradeAdditionalResult> ku90Var = new ku90<>();
        this.w = ku90Var;
        this.y = ku90Var;
    }
}
