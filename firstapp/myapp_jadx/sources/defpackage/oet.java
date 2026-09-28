package defpackage;

import android.location.Location;
import com.sporty.android.permission.location.UserAddress;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.permission.location.LocationPermissionHelper$getAddressFromLocation$1", f = "LocationPermissionHelper.kt", l = {143}, m = "invokeSuspend", v = 2)
public final class oet extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qet b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oet(qet qetVar, double d, double d2, v1b<? super oet> v1bVar) {
        super(2, v1bVar);
        this.b = qetVar;
        this.c = d;
        this.d = d2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new oet(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((oet) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005f A[RETURN] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        double d;
        double d2;
        Object objD;
        y5b y5bVar = y5b.a;
        int i = this.a;
        qet qetVar = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                sl slVar = qetVar.b;
                py1 py1Var = qetVar.a;
                double d3 = this.c;
                double d4 = this.d;
                this.a = 1;
                UserAddress userAddress = slVar.b;
                if (userAddress != null) {
                    float[] fArr = new float[1];
                    d = d3;
                    d2 = d4;
                    Location.distanceBetween(userAddress.e, userAddress.f, d, d2, fArr);
                    if (fArr[0] <= 50.0d) {
                        objD = slVar.b;
                    }
                    if (objD == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    d = d3;
                    d2 = d4;
                }
                objD = ej5.d(slVar.a, new rl(py1Var, d, d2, slVar, null), this);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objD = obj;
            }
            UserAddress userAddress2 = (UserAddress) objD;
            ymy ymyVar = qetVar.h;
            if (ymyVar != null) {
                ymyVar.a(userAddress2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ymy ymyVar2 = qetVar.h;
            if (ymyVar2 != null) {
                ymyVar2.a(null);
            }
        }
        return Unit.a;
    }
}
