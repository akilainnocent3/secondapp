package yads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x01 implements be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gs2 f157598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f157599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z01 f157600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a11 f157601d;

    public /* synthetic */ x01(Context context) {
        this(context, new gs2());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    @Override // yads.be
    public final td a() {
        ResolveInfo resolveInfoResolveService;
        td tdVar;
        this.f157601d.getClass();
        Intent intentA = a11.a();
        gs2 gs2Var = this.f157598a;
        Context context = this.f157599b;
        gs2Var.getClass();
        try {
            resolveInfoResolveService = context.getPackageManager().resolveService(intentA, 0);
        } catch (Throwable unused) {
            boolean z10 = ad1.f146762a;
            resolveInfoResolveService = null;
        }
        if (resolveInfoResolveService == null) {
            return null;
        }
        try {
            com.monetization.ads.core.identifiers.ad.huawei.a aVar = new com.monetization.ads.core.identifiers.ad.huawei.a();
            if (!this.f157599b.bindService(intentA, aVar, 1)) {
                boolean z11 = ad1.f146762a;
                return null;
            }
            z01 z01Var = this.f157600c;
            z01Var.getClass();
            try {
                OpenDeviceIdentifierService openDeviceIdentifierService = (OpenDeviceIdentifierService) aVar.f71783a.poll(5L, TimeUnit.SECONDS);
                if (openDeviceIdentifierService != null) {
                    String oaid = openDeviceIdentifierService.getOaid();
                    boolean oaidTrackLimited = openDeviceIdentifierService.getOaidTrackLimited();
                    z01Var.f158549a.getClass();
                    if (oaid != null) {
                        tdVar = new td(oaid, oaidTrackLimited);
                    } else {
                        tdVar = null;
                    }
                } else {
                    tdVar = null;
                }
            } catch (Exception unused2) {
                boolean z12 = ad1.f146762a;
            }
            this.f157599b.unbindService(aVar);
            return tdVar;
        } catch (Throwable unused3) {
            boolean z13 = ad1.f146762a;
            return null;
        }
    }

    public x01(Context context, gs2 gs2Var) {
        this.f157598a = gs2Var;
        this.f157599b = context.getApplicationContext();
        this.f157600c = new z01();
        this.f157601d = new a11();
    }
}
