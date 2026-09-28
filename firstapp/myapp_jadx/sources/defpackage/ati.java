package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.config.VersionData;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.update.ForceUpdateActivity;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ati implements ysi {
    public final iu0 a;
    public final yi5 b;
    public final psm c;

    public ati(iu0 iu0Var, yi5 yi5Var, psm psmVar) {
        iu0Var.getClass();
        yi5Var.getClass();
        psmVar.getClass();
        this.a = iu0Var;
        this.b = yi5Var;
        this.c = psmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ysi
    public final Object a(Context context, x1b x1bVar) {
        zsi zsiVar;
        if (x1bVar instanceof zsi) {
            zsiVar = (zsi) x1bVar;
            int i = zsiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zsiVar.d = i - Integer.MIN_VALUE;
            } else {
                zsiVar = new zsi(this, x1bVar);
            }
        } else {
            zsiVar = new zsi(this, x1bVar);
        }
        Object objA = zsiVar.b;
        y5b y5bVar = y5b.a;
        int i2 = zsiVar.d;
        if (i2 == 0) {
            uj50.b(objA);
            String strA = this.b.b().a();
            CountryCodeName countryCode = this.c.getCountryCode();
            zsiVar.a = context;
            zsiVar.d = 1;
            objA = this.a.a(strA, countryCode, zsiVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = zsiVar.a;
            uj50.b(objA);
        }
        VersionData versionDataCopy$default = VersionData.copy$default((VersionData) objA, null, "99.0.0", null, null, null, null, 61, null);
        int i3 = ForceUpdateActivity.a;
        Intent intent = new Intent(context, (Class<?>) ForceUpdateActivity.class);
        intent.putExtra("extra_version_data", versionDataCopy$default);
        intent.putExtra("extra_allow_back", true);
        context.startActivity(intent);
        return Unit.a;
    }

    @Override // defpackage.ysi
    public final void b(Context context) {
        context.getClass();
        VersionData versionData = new VersionData("99.0.0", "99.0.0", "Debug force update test", "https://invalid.test/app.apk", "fakemd5", null, 32, null);
        int i = ForceUpdateActivity.a;
        Intent intent = new Intent(context, (Class<?>) ForceUpdateActivity.class);
        intent.putExtra("extra_version_data", versionData);
        intent.putExtra("extra_allow_back", true);
        context.startActivity(intent);
    }
}
