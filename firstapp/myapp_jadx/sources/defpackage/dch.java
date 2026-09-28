package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dch implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dch(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                gch gchVar = (gch) obj;
                Context context = gchVar.b;
                z16 z16Var = null;
                sw5 sw5Var = Build.VERSION.SDK_INT >= 35 ? new sw5(context) : null;
                try {
                    ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 132).services;
                    if (serviceInfoArr != null) {
                        String str = null;
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            Bundle bundle = serviceInfo.metaData;
                            if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str != null) {
                                    ib5.a("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                    return null;
                                }
                                str = string;
                            }
                        }
                        if (str != null) {
                            try {
                                z16Var = (z16) Class.forName(str).getConstructor(Context.class).newInstance(context);
                            } catch (Exception e) {
                                rzk.b("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
                                return null;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                String str2 = gchVar.c;
                ArrayList arrayList = new ArrayList();
                if (z16Var != null) {
                    arrayList.add(z16Var.a(str2));
                }
                if (sw5Var != null) {
                    try {
                        arrayList.add(sw5Var.a(str2));
                        break;
                    } catch (UnsupportedOperationException unused2) {
                    }
                }
                return new sr(arrayList);
            case 1:
                List<String> list = dfm.v2;
                ((dfm) obj).N.d(wae.DAILY_STREAK);
                return Unit.a;
            default:
                ((Function0) obj).invoke();
                return Unit.a;
        }
    }
}
