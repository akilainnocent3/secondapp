package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dhx {
    public final ygx a;
    public String b;
    public final ArrayList c = new ArrayList();
    public final LinkedHashMap d = new LinkedHashMap();
    public int e;
    public String f;
    public mpe0 g;

    public dhx(ygx ygxVar) {
        this.a = ygxVar;
    }

    public final ygx.b a(String str) {
        pgx pgxVar;
        str.getClass();
        mpe0 mpe0Var = this.g;
        if (mpe0Var == null || (pgxVar = (pgx) mpe0Var.getValue()) == null) {
            return null;
        }
        int i = ygx.f;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        uri.getClass();
        Bundle bundleD = pgxVar.d(uri, this.d);
        if (bundleD == null) {
            return null;
        }
        return new ygx.b(this.a, bundleD, pgxVar.p, pgxVar.b(uri), false, -1);
    }
}
