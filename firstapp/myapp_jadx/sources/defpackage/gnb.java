package defpackage;

import com.sportygames.crashInitiated.model.response.DetailResponse;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$calculateWinningChance$1", f = "CrashInitiatedFragment.kt", l = {2985}, m = "invokeSuspend", v = 1)
public final class gnb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zqy b;
    public final /* synthetic */ Double c;
    public final /* synthetic */ double d;

    @c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$calculateWinningChance$1$1", f = "CrashInitiatedFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ zqy a;
        public final /* synthetic */ Double b;
        public final /* synthetic */ double c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zqy zqyVar, Double d, double d2, v1b v1bVar) {
            super(2, v1bVar);
            this.a = zqyVar;
            this.b = d;
            this.c = d2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Double d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            zqy zqyVar = this.a;
            ytw<HashMap<Double, Double>> ytwVar = zqyVar.k0;
            HashMap map = ytwVar != null ? (HashMap) ((x5a0) ytwVar).getValue() : null;
            double dDoubleValue = this.b.doubleValue();
            double minUserCoefficient = ((DetailResponse) ((x5a0) zqyVar.p0().d0).getValue()).getMinUserCoefficient();
            double d2 = this.c;
            String strConcat = "0.01%";
            if (d2 >= minUserCoefficient) {
                if (d2 == ((DetailResponse) ((x5a0) zqyVar.p0().d0).getValue()).getMinUserCoefficient()) {
                    strConcat = "99.5%";
                } else if (d2 >= 1000.0d && d2 < 2000.0d) {
                    strConcat = "0.09%";
                } else if (d2 >= 2000.0d && d2 < 3000.0d) {
                    strConcat = "0.04%";
                } else if (d2 >= 3000.0d && d2 < 5000.0d) {
                    strConcat = "0.02%";
                } else if (d2 < 5000.0d) {
                    double dDoubleValue2 = ((dDoubleValue - ((map == null || (d = (Double) map.get(Double.valueOf(Double.parseDouble(krh0.l(d2 - 0.01d))))) == null) ? 1.0d : d.doubleValue())) / dDoubleValue) * 100.0d;
                    if (Double.isNaN(dDoubleValue2) || dDoubleValue2 >= 0.01d) {
                        strConcat = krh0.l(dDoubleValue2).concat("%");
                    }
                }
            }
            ((x5a0) zqyVar.p0().f0).setValue(strConcat);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnb(zqy zqyVar, Double d, double d2, v1b v1bVar) {
        super(2, v1bVar);
        this.b = zqyVar;
        this.c = d;
        this.d = d2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gnb(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gnb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        HashMap map;
        zqy zqyVar = this.b;
        ytw<HashMap<Double, Double>> ytwVar = zqyVar.k0;
        y5b y5bVar = y5b.a;
        int i = this.a;
        Double d = this.c;
        if (i == 0) {
            uj50.b(obj);
            HashMap map2 = ytwVar != null ? (HashMap) ((x5a0) ytwVar).getValue() : null;
            if ((map2 == null || map2.isEmpty()) && ytwVar != null) {
                ((x5a0) ytwVar).setValue(enb.y0(d.doubleValue(), 5.01d));
            }
            pfd pfdVar = fse.a;
            wcl wclVar = gku.a;
            a aVar = new a(zqyVar, d, this.d, null);
            this.a = 1;
            if (ej5.d(wclVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (((ytwVar == null || (map = (HashMap) ((x5a0) ytwVar).getValue()) == null) ? 0 : map.size()) < 1000 && ytwVar != null) {
            ((x5a0) ytwVar).setValue(enb.y0(d.doubleValue(), 1000.01d));
        }
        return Unit.a;
    }
}
