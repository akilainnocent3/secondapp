package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$initForAutoBetPage$1", f = "AutoBetViewModel.kt", l = {136}, m = "invokeSuspend", v = 2)
public final class cb1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fb1 b;

    @c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$initForAutoBetPage$1$2", f = "AutoBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends AssetsInfo>, v1b<? super Unit>, Object> {
        public final /* synthetic */ fb1 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fb1 fb1Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = fb1Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends AssetsInfo> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ConcatUiText concatUiText;
            Object value;
            Object objA;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            fb1 fb1Var = this.a;
            fb1Var.x1();
            StringUiText stringUiText = vch0.a;
            ConcatUiText concatUiText2 = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.common_functions__balance), new StringUiText(": "), vch0.d(fb1Var.O)});
            wwd0 wwd0Var = fb1Var.V;
            while (true) {
                Object value2 = wwd0Var.getValue();
                Object objA2 = (twb) value2;
                if (objA2 instanceof twb.a) {
                    concatUiText = concatUiText2;
                    objA2 = twb.a.a((twb.a) objA2, null, concatUiText, null, null, false, false, false, null, null, 65471);
                } else {
                    concatUiText = concatUiText2;
                }
                if (wwd0Var.g(value2, objA2)) {
                    break;
                }
                concatUiText2 = concatUiText;
            }
            do {
                value = wwd0Var.getValue();
                objA = (twb) value;
                if (objA instanceof twb.b) {
                    ConcatUiText concatUiText3 = concatUiText;
                    objA = twb.b.a((twb.b) objA, concatUiText3, null, false, false, false, 65471);
                    concatUiText = concatUiText3;
                }
            } while (!wwd0Var.g(value, objA));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$initForAutoBetPage$1$3", f = "AutoBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<ide0.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ fb1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fb1 fb1Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = fb1Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.b, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ide0.a aVar, v1b<? super Unit> v1bVar) {
            return ((b) create(aVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ide0.a aVar = (ide0.a) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!(aVar instanceof ide0.a.C0675a)) {
                uhc.a();
                return null;
            }
            this.b.D1(new db1(aVar, 0));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb1(fb1 fb1Var, v1b<? super cb1> v1bVar) {
        super(2, v1bVar);
        this.b = fb1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cb1(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cb1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        fb1 fb1Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            or60 or60Var = new or60(new gb1(fb1Var, null));
            this.a = 1;
            obj = s0i.f(or60Var, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            wwd0 wwd0Var = fb1Var.V;
            OrderBetType orderBetType = fb1Var.f0;
            if (orderBetType == null) {
                orderBetType = OrderBetType.SINGLE;
            }
            twb.c cVar = new twb.c(orderBetType);
            wwd0Var.getClass();
            wwd0Var.k(null, cVar);
            return Unit.a;
        }
        vvs vvsVar = fb1Var.e;
        lq1 lq1Var = vvsVar.a;
        int iE = qq1.e(lq1Var, BOConfigParam.AutoBetMatchMaxDays, 30);
        int iE2 = qq1.e(lq1Var, BOConfigParam.AutoBetMaxActiveSettingPerUser, 10);
        double dB = qq1.b(lq1Var, BOConfigParam.AutoBetMaxOdds, 100.0d);
        double dB2 = qq1.b(lq1Var, BOConfigParam.AutoBetMinOdds, 1.01d);
        double dDoubleValue = vvsVar.c.a().doubleValue();
        double dDoubleValue2 = vvsVar.b.a().doubleValue();
        fb1Var.H = iE;
        fb1Var.M = iE2;
        fb1Var.I = dB;
        fb1Var.J = dB2;
        fb1Var.K = dDoubleValue;
        fb1Var.L = dDoubleValue2;
        fb1Var.x1();
        fb1Var.B1();
        kzh.d(new g1i(uzh.b(fb1Var.w.h(new pu0.a(0))), new a(fb1Var, null)), o8i0.d(fb1Var));
        kzh.d(new g1i(fb1Var.D.c, new b(fb1Var, null)), o8i0.d(fb1Var));
        return Unit.a;
    }
}
