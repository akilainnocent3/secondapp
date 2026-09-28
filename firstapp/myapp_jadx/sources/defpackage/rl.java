package defpackage;

import android.location.Address;
import android.location.Geocoder;
import com.sporty.android.permission.location.UserAddress;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.permission.location.AddressRepositoryImpl$getAddressFromLocation$2", f = "AddressRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rl extends tje0 implements Function2<v5b, v1b<? super UserAddress>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ py1 b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;
    public final /* synthetic */ sl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(py1 py1Var, double d, double d2, sl slVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = py1Var;
        this.c = d;
        this.d = d2;
        this.e = slVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rl rlVar = new rl(this.b, this.c, this.d, this.e, v1bVar);
        rlVar.a = obj;
        return rlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super UserAddress> v1bVar) {
        return ((rl) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Geocoder geocoder = new Geocoder(this.b, Locale.getDefault());
        double d = this.c;
        double d2 = this.d;
        sl slVar = this.e;
        try {
            zi50.a aVar = zi50.b;
            List<Address> fromLocation = geocoder.getFromLocation(d, d2, 1);
            if (fromLocation == null || fromLocation.isEmpty()) {
                bVar = null;
            } else {
                Address address = (Address) CollectionsKt.T(fromLocation);
                UserAddress userAddress = new UserAddress(address.getLocality(), address.getAdminArea(), address.getCountryCode(), address.getCountryName(), address.getLatitude(), address.getLongitude(), address.getPostalCode());
                slVar.b = userAddress;
                bVar = userAddress;
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            return bVar;
        }
        thA.printStackTrace();
        return null;
    }
}
