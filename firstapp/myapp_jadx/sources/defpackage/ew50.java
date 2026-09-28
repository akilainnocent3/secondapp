package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ew50 {
    public final Context a;

    public ew50(Context context) {
        this.a = context;
    }

    public static boolean a(String str) {
        boolean z = false;
        for (String str2 : rva.a()) {
            String strA = yk10.a(str2, str);
            if (new File(str2, str).exists()) {
                Log.v("RootBeer", ya30.b().concat(strA.concat(" binary detected!")));
                z = true;
            }
        }
        return z;
    }

    public final boolean b(ArrayList arrayList) {
        PackageManager packageManager = this.a.getPackageManager();
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            try {
                packageManager.getPackageInfo(str, 0);
                ya30.a(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }
}
