package defpackage;

import android.content.DialogInterface;
import android.location.Location;
import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.permission.location.LocationPermissionHelper$requestNewLocationData$1", f = "LocationPermissionHelper.kt", l = {100}, m = "invokeSuspend", v = 2)
public final class pet extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qet d;

    public static final class a extends jet {
        public final /* synthetic */ qet a;

        public a(qet qetVar) {
            this.a = qetVar;
        }

        @Override // defpackage.jet
        public final void a(LocationResult locationResult) {
            locationResult.getClass();
            List list = locationResult.a;
            int size = list.size();
            Location location = size == 0 ? null : (Location) list.get(size - 1);
            qet qetVar = this.a;
            if (location != null) {
                qetVar.getClass();
                if (qet.a(location)) {
                    py1 py1Var = qetVar.a;
                    ime.b(py1Var, new ple(sn5.b(py1Var, R.string.app_common__issue_getting_location, new Object[0]), sn5.b(py1Var, R.string.common_functions__ok, new Object[0]), (DialogInterface.OnClickListener) null, (String) null, (ny1) null, sn5.b(py1Var, R.string.app_common__location_error, new Object[0]), 92));
                } else {
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                    ioy ioyVar = qetVar.g;
                    if (ioyVar != null) {
                        ioyVar.a(latitude, longitude);
                    }
                }
            }
            htk0 htk0Var = qetVar.k;
            htk0Var.getClass();
            String simpleName = jet.class.getSimpleName();
            hm20.f(simpleName, "Listener type must not be empty");
            htk0Var.b(new yis.a<>(this, simpleName), 2418).continueWith(jvk0.a, cuk0.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pet(boolean z, qet qetVar, v1b<? super pet> v1bVar) {
        super(2, v1bVar);
        this.c = z;
        this.d = qetVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pet petVar = new pet(this.c, this.d, v1bVar);
        petVar.b = obj;
        return petVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pet) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objE;
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        qet qetVar = this.d;
        try {
            if (i == 0) {
                uj50.b(obj);
                if (this.c && qetVar.d.W()) {
                    z1d z1dVar = qetVar.c;
                    wm20 wm20VarA = z1dVar.e.a(z1dVar, z1d.f[3]);
                    Boolean bool = Boolean.FALSE;
                    this.b = v5bVar;
                    this.a = 1;
                    objE = wm20VarA.e(this, bool);
                    if (objE == y5bVar) {
                        return y5bVar;
                    }
                }
                fdv.c(100);
                LocationRequest locationRequest = new LocationRequest(100, 0L, 0L, Math.max(0L, 0L), Long.MAX_VALUE, Long.MAX_VALUE, 1, 0.0f, true, 0L, 0, 0, false, new WorkSource(null), null);
                a aVar = new a(qetVar);
                zi50.a aVar2 = zi50.b;
                qetVar.k.d(locationRequest, aVar, Looper.getMainLooper());
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objE = obj;
            zi50.a aVar3 = zi50.b;
            qetVar.k.d(locationRequest, aVar, Looper.getMainLooper());
        } catch (Throwable unused) {
            zi50.a aVar4 = zi50.b;
        }
        if (((Boolean) objE).booleanValue()) {
            ioy ioyVar = qetVar.g;
            if (ioyVar != null) {
                ioyVar.a(-23.533773d, -46.62529d);
            }
            return Unit.a;
        }
        fdv.c(100);
        LocationRequest locationRequest2 = new LocationRequest(100, 0L, 0L, Math.max(0L, 0L), Long.MAX_VALUE, Long.MAX_VALUE, 1, 0.0f, true, 0L, 0, 0, false, new WorkSource(null), null);
        a aVar5 = new a(qetVar);
        return Unit.a;
    }
}
