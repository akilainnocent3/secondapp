package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import defpackage.afk0;
import defpackage.hfk0;
import defpackage.mek0;
import defpackage.odk0;
import defpackage.qdk0;
import defpackage.s880;
import defpackage.tek0;
import defpackage.uek0;
import defpackage.vek0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class ar {
    final odk0 a;
    private final afk0 b;
    private final String c;
    private final Context d;
    private final ay e;
    private final t f;

    public ar(Context context, afk0 afk0Var, ay ayVar, t tVar) {
        this.c = context.getPackageName();
        this.b = afk0Var;
        this.e = ayVar;
        this.f = tVar;
        this.d = context;
        afk0 afk0Var2 = qdk0.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (qdk0.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.a = new odk0(context, afk0Var, "IntegrityService", as.a, new hfk0() { // from class: com.google.android.play.core.integrity.am
                            @Override // defpackage.hfk0
                            public final Object a(IBinder iBinder) {
                                int i = uek0.k;
                                if (iBinder == null) {
                                    return null;
                                }
                                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                                return iInterfaceQueryLocalInterface instanceof vek0 ? (vek0) iInterfaceQueryLocalInterface : new tek0(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                            }
                        });
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    afk0Var2.d("Play Store package is not found.", new Object[0]);
                }
            } else {
                afk0Var2.d("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            afk0Var2.d("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        afk0Var.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", afk0.e(afk0Var.a, "Phonesky is not installed.", objArr));
        }
        this.a = null;
    }

    public static Bundle a(ar arVar, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", arVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 5);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new mek0(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(s880.a(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        odk0 odk0Var = this.a;
        if (odk0Var == null) {
            return Tasks.forException(new IntegrityServiceException(-2, false, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.b.c("requestAndShowDialog(%s, %s)", this.c, Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        odk0Var.c(new ao(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, false, null));
        }
        if (qdk0.a(this.d) < 82380000) {
            return Tasks.forException(new IntegrityServiceException(-14, false, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            this.b.c("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.a.c(new an(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, false, e));
        }
    }

    public final Task d(IntegrityDialogRequest integrityDialogRequest) {
        if (!integrityDialogRequest.integrityResponse().b(integrityDialogRequest.typeCode())) {
            return Tasks.forResult(0);
        }
        integrityDialogRequest.integrityResponse().a(true);
        this.b.a("checkAndShowDialog(%s)", Integer.valueOf(integrityDialogRequest.typeCode()));
        Activity activity = integrityDialogRequest.activity();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog.intent.type", integrityDialogRequest.typeCode());
        bundle.putString("package.name", this.c);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 5);
        bundle.putInt("playcore.integrity.version.patch", 0);
        IntegrityDialogRequest.IntegrityResponse integrityResponse = integrityDialogRequest.integrityResponse();
        if (integrityResponse instanceof IntegrityDialogRequest.IntegrityResponse.TokenResponse) {
            IntegrityTokenResponse integrityTokenResponseC = ((IntegrityDialogRequest.IntegrityResponse.TokenResponse) integrityResponse).c();
            if (integrityTokenResponseC instanceof av) {
                bundle.putLong("request.token.sid", ((av) integrityTokenResponseC).a());
            }
        }
        return b(activity, bundle);
    }
}
