package defpackage;

import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liog0;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class iog0 extends j8i0 {
    public final sr10 a;
    public final uqm b;
    public final psm c;
    public String d;
    public String e;
    public final wwd0 f;
    public final wwd0 i;
    public final wwd0 v;
    public final ku90<TradeAdditionalResult> w;
    public final ku90 y;

    @c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.viewmodel.TradeAdditionalUpstreamSmsViewModel$checkboxIsCheckedFlow$1", f = "TradeAdditionalUpstreamSmsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = iog0.this.new a(v1bVar);
            aVar.a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = iog0.this.i;
            if (!(wwd0Var.getValue() instanceof c330.b)) {
                bkj0.a(z, null, wwd0Var, null);
            }
            return Unit.a;
        }
    }

    public iog0(uqm uqmVar, psm psmVar, sr10 sr10Var) {
        sr10Var.getClass();
        uqmVar.getClass();
        psmVar.getClass();
        this.a = sr10Var;
        this.b = uqmVar;
        this.c = psmVar;
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.f = wwd0VarA;
        g1i g1iVar = new g1i(wwd0VarA, new a(null));
        wwd0 wwd0VarA2 = zjj0.a(null, false);
        this.i = wwd0VarA2;
        this.v = wwd0VarA2;
        ku90<TradeAdditionalResult> ku90Var = new ku90<>();
        this.w = ku90Var;
        this.y = ku90Var;
        kzh.d(g1iVar, o8i0.d(this));
    }
}
