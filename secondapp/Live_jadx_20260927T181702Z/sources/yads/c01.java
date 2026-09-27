package yads;

import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.gms.service.GmsServiceAdvertisingInfoReader;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud f147468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xz0 f147469b;

    public /* synthetic */ c01() {
        this(new ud(), new xz0());
    }

    public final td a(yz0 yz0Var) {
        try {
            IBinder iBinder = (IBinder) yz0Var.f158536a.poll(5L, TimeUnit.SECONDS);
            if (iBinder == null) {
                return null;
            }
            this.f147469b.getClass();
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(com.tiktok.appevents.e0.d.f76070c);
            ce gmsServiceAdvertisingInfoReader = iInterfaceQueryLocalInterface instanceof ce ? (ce) iInterfaceQueryLocalInterface : null;
            if (gmsServiceAdvertisingInfoReader == null) {
                gmsServiceAdvertisingInfoReader = new GmsServiceAdvertisingInfoReader(iBinder);
            }
            String advertisingId = gmsServiceAdvertisingInfoReader.readAdvertisingId();
            Boolean adTrackingLimited = gmsServiceAdvertisingInfoReader.readAdTrackingLimited();
            this.f147468a.getClass();
            td tdVar = (adTrackingLimited == null || advertisingId == null) ? null : new td(advertisingId, adTrackingLimited.booleanValue());
            boolean z10 = ad1.f146762a;
            return tdVar;
        } catch (InterruptedException unused) {
            boolean z11 = ad1.f146762a;
            return null;
        }
    }

    public c01(ud udVar, xz0 xz0Var) {
        this.f147468a = udVar;
        this.f147469b = xz0Var;
    }
}
