package defpackage;

import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnkg0;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nkg0 extends j8i0 {
    public final sr10 a;
    public String b;
    public Date c;
    public final wwd0 d;
    public final g1i e;
    public final wwd0 f;
    public final wwd0 i;
    public final wwd0 v;
    public final wwd0 w;
    public final ku90<TradeAdditionalResult> y;
    public final ku90 z;

    @c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.viewmodel.TradeAdditionalBirthdayViewModel$birthdayTextStateFlow$1", f = "TradeAdditionalBirthdayViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = nkg0.this.new a(v1bVar);
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
            wwd0 wwd0Var = nkg0.this.v;
            if (!(wwd0Var.getValue() instanceof c330.b)) {
                c330.a aVar = new c330.a(null, !StringsKt.U(str));
                wwd0Var.getClass();
                wwd0Var.k(null, aVar);
            }
            return Unit.a;
        }
    }

    public nkg0(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
        wwd0 wwd0VarA = xwd0.a("");
        this.d = wwd0VarA;
        this.e = new g1i(wwd0VarA, new a(null));
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.f = wwd0VarA2;
        this.i = wwd0VarA2;
        wwd0 wwd0VarA3 = zjj0.a(null, false);
        this.v = wwd0VarA3;
        this.w = wwd0VarA3;
        ku90<TradeAdditionalResult> ku90Var = new ku90<>();
        this.y = ku90Var;
        this.z = ku90Var;
    }
}
