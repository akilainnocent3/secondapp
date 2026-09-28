package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.gson.reflect.TypeToken;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public final class vw4 {

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"vw4$a", "Lcom/google/gson/reflect/TypeToken;", "", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends TypeToken<Set<? extends String>> {
    }

    public static boolean a(Context context) {
        context.getClass();
        String str = "";
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            String packageName = context.getPackageName();
            packageName.getClass();
            String str2 = w4c.b(packageManager, packageName).versionName;
            if (str2 != null) {
                str = str2;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        String strD = ((d650) yoh.c().b(d650.class)).c("firebase").d("stacker_game_app_version_blocklist");
        if ((strD.length() > 0 ? strD : null) == null) {
            return true;
        }
        try {
            Object objF = new eal().f(strD, new a().getType());
            objF.getClass();
            return !((Set) objF).contains(str);
        } catch (qep unused2) {
            return false;
        }
    }
}
