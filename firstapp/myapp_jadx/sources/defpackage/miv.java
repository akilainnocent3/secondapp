package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public class miv extends y3l {
    public final MeasurementManager d;

    @c0d(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(hqa0 hqa0Var, v1b v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = miv.this.new a(null, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            throw null;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            throw null;
        }
    }

    public miv(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.d = measurementManager;
    }

    public static Object A(miv mivVar, Uri uri, InputEvent inputEvent, v1b<? super Unit> v1bVar) throws Throwable {
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        mivVar.d.registerSource(uri, inputEvent, new liv(), new y1b(bc6Var));
        Object objO = bc6Var.o();
        return objO == y5b.a ? objO : Unit.a;
    }

    public static Object B(miv mivVar, Uri uri, v1b<? super Unit> v1bVar) throws Throwable {
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        mivVar.d.registerTrigger(uri, new liv(), new y1b(bc6Var));
        Object objO = bc6Var.o();
        return objO == y5b.a ? objO : Unit.a;
    }

    public static Object D(miv mivVar, yyi0 yyi0Var, v1b<? super Unit> v1bVar) {
        new bc6(1, yzo.b(v1bVar)).q();
        MeasurementManager measurementManager = mivVar.d;
        throw null;
    }

    public static Object F(miv mivVar, zyi0 zyi0Var, v1b<? super Unit> v1bVar) {
        new bc6(1, yzo.b(v1bVar)).q();
        MeasurementManager measurementManager = mivVar.d;
        throw null;
    }

    public static Object x(miv mivVar, gmd gmdVar, v1b<? super Unit> v1bVar) {
        new bc6(1, yzo.b(v1bVar)).q();
        MeasurementManager measurementManager = mivVar.d;
        throw null;
    }

    public static Object y(miv mivVar, v1b<? super Integer> v1bVar) throws Throwable {
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        mivVar.d.getMeasurementApiStatus(new liv(), new y1b(bc6Var));
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    public static Object z(miv mivVar, hqa0 hqa0Var, v1b<? super Unit> v1bVar) {
        Object objD = w5b.d(mivVar.new a(hqa0Var, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    public Object C(yyi0 yyi0Var, v1b<? super Unit> v1bVar) {
        return D(this, yyi0Var, v1bVar);
    }

    public Object E(zyi0 zyi0Var, v1b<? super Unit> v1bVar) {
        return F(this, zyi0Var, v1bVar);
    }

    @Override // defpackage.y3l
    public Object i(v1b<? super Integer> v1bVar) {
        return y(this, v1bVar);
    }

    @Override // defpackage.y3l
    public Object q(hqa0 hqa0Var, v1b<? super Unit> v1bVar) {
        return z(this, hqa0Var, v1bVar);
    }

    @Override // defpackage.y3l
    public Object r(Uri uri, InputEvent inputEvent, v1b<? super Unit> v1bVar) {
        return A(this, uri, inputEvent, v1bVar);
    }

    @Override // defpackage.y3l
    public Object s(Uri uri, v1b<? super Unit> v1bVar) {
        return B(this, uri, v1bVar);
    }

    public Object w(gmd gmdVar, v1b<? super Unit> v1bVar) {
        return x(this, gmdVar, v1bVar);
    }
}
