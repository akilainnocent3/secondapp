package defpackage;

import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.network.metadata.OaidProvider$get$2", f = "OaidProvider.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jby extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
    public final /* synthetic */ kby a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jby(kby kbyVar, v1b<? super jby> v1bVar) {
        super(2, v1bVar);
        this.a = kbyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jby(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
        return ((jby) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a.a);
            if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                return null;
            }
            return advertisingIdInfo.getId();
        } catch (Exception e) {
            itf0.a.n(inm.a("Failed to read OAID: ", e.getMessage()), new Object[0]);
            return null;
        }
    }
}
