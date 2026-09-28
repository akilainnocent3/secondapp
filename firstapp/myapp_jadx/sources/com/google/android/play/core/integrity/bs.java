package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import defpackage.afk0;
import defpackage.hfk0;
import defpackage.mek0;
import defpackage.odk0;
import defpackage.oek0;
import defpackage.pek0;
import defpackage.qek0;
import defpackage.s880;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class bs {
    final odk0 a;
    private final afk0 b;
    private final String c;
    private final TaskCompletionSource d;
    private final ay e;
    private final t f;

    public static Bundle a(bs bsVar, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bsVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 5);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new mek0(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(s880.a(arrayList)));
        return bundle;
    }

    public static Bundle b(bs bsVar, long j, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bsVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 5);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new mek0(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(s880.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean l(bs bsVar, int i) {
        TaskCompletionSource taskCompletionSource = bsVar.d;
        return taskCompletionSource.getTask().isSuccessful() && ((Integer) taskCompletionSource.getTask().getResult()).intValue() < 83420000;
    }

    public static /* bridge */ /* synthetic */ boolean m(bs bsVar) {
        TaskCompletionSource taskCompletionSource = bsVar.d;
        return taskCompletionSource.getTask().isSuccessful() && ((Integer) taskCompletionSource.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i = bundle.getInt("dialog.intent.type");
        this.b.c("requestAndShowDialog(%s)", Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new bm(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        this.b.c("requestExpressIntegrityToken(%s)", Long.valueOf(j2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new bl(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j, j2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(StandardIntegrityManager.StandardIntegrityDialogRequest standardIntegrityDialogRequest) {
        if (!standardIntegrityDialogRequest.standardIntegrityResponse().b(standardIntegrityDialogRequest.typeCode())) {
            return Tasks.forResult(0);
        }
        standardIntegrityDialogRequest.standardIntegrityResponse().a(true);
        Activity activity = standardIntegrityDialogRequest.activity();
        Bundle bundle = new Bundle();
        bundle.putInt("dialog.intent.type", standardIntegrityDialogRequest.typeCode());
        bundle.putString("package.name", this.c);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 5);
        bundle.putInt("playcore.integrity.version.patch", 0);
        StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse standardIntegrityResponse = standardIntegrityDialogRequest.standardIntegrityResponse();
        if (standardIntegrityResponse instanceof StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse.TokenResponse) {
            StandardIntegrityManager.StandardIntegrityToken token = ((StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse.TokenResponse) standardIntegrityResponse).getToken();
            if (token instanceof bw) {
                bundle.putLong("request.token.sid", ((bw) token).a());
            }
        }
        return c(activity, bundle);
    }

    public final Task f(long j, int i) {
        this.b.c("warmUpIntegrityToken(%s)", Long.valueOf(j));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new bk(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public bs(Context context, afk0 afk0Var, ay ayVar, t tVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d = taskCompletionSource;
        this.c = context.getPackageName();
        this.b = afk0Var;
        this.e = ayVar;
        this.f = tVar;
        odk0 odk0Var = new odk0(context, afk0Var, rarBonoqWB.tVhgS, bt.a, new hfk0() { // from class: com.google.android.play.core.integrity.bi
            @Override // defpackage.hfk0
            public final Object a(IBinder iBinder) {
                int i = pek0.k;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return iInterfaceQueryLocalInterface instanceof qek0 ? (qek0) iInterfaceQueryLocalInterface : new oek0(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            }
        });
        this.a = odk0Var;
        odk0Var.a().post(new bj(this, taskCompletionSource, context));
    }
}
