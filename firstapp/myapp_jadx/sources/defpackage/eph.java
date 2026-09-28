package defpackage;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eph implements q9s.a {
    @Override // q9s.a
    public final String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }
}
