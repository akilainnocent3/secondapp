package defpackage;

import android.net.ConnectivityManager;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class x1p implements xp60 {
    public final Object a;

    public x1p(wfe0 wfe0Var) {
        wfe0Var.getClass();
        this.a = wfe0Var;
    }

    @Override // defpackage.xp60
    public vp60 a(String str) {
        str.getClass();
        wfe0 wfe0Var = (wfe0) this.a;
        String databaseName = wfe0Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                kb5.a(tug.a("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !StringsKt.l0('/', databaseName, databaseName).equals(StringsKt.l0('/', str, str))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + wfe0Var.getDatabaseName() + "' but '" + str + "' was requested.").toString());
        }
        return new ufe0(wfe0Var.f1());
    }

    @Override // defpackage.xp60
    public boolean b() {
        return true;
    }

    public x1p(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }
}
