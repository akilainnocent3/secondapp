package defpackage;

import com.sporty.android.core.model.appupdate.AppDownloadAction;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lti<T> implements myh {
    public final /* synthetic */ jti a;

    public lti(jti jtiVar) {
        this.a = jtiVar;
    }

    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        AppDownloadAction appDownloadAction = (AppDownloadAction) obj;
        boolean zG = Intrinsics.g(appDownloadAction, AppDownloadAction.ApkDownloadFailure.INSTANCE);
        jti jtiVar = this.a;
        if (zG) {
            ohp<Object>[] ohpVarArr = jti.z;
            jtiVar.m0().f.setVisibility(8);
            jtiVar.m0().d.setVisibility(0);
            jtiVar.m0().i.setVisibility(0);
        } else if (appDownloadAction instanceof AppDownloadAction.ApkDownloading) {
            ohp<Object>[] ohpVarArr2 = jti.z;
            AppDownloadAction.ApkDownloading apkDownloading = (AppDownloadAction.ApkDownloading) appDownloadAction;
            jtiVar.m0().b.setProgress(apkDownloading.getPercentage());
            jtiVar.m0().v.setText(apkDownloading.getPercentage() + "%");
        }
        return Unit.a;
    }
}
