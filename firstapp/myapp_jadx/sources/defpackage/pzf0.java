package defpackage;

import com.sportygames.commons.SportyGamesManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class pzf0 implements bb {
    public static final pzf0 a = new pzf0();
    public static dm8 b = null;
    public static String c = "";

    public static void b(String str) {
        if (SportyGamesManager.getInstance().getUser() == null && str.length() == 0) {
            return;
        }
        if (c.length() == 0 || Intrinsics.g(c, "API_RETURN_NULL") || str.equals("testing_access_token")) {
            c = str;
        }
        pfd pfdVar = fse.a;
        c = (String) dj5.a(odd.b, new ozf0(str, null));
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            a(xnh0Var != null ? xnh0Var.a : null);
        }
    }

    public final void a(String str) {
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        nzf0.a = false;
        nzf0.b = System.currentTimeMillis();
        if (str == null) {
            dm8 dm8Var = b;
            if (dm8Var != null) {
                dm8Var.R("API_RETURN_NULL");
                return;
            }
            return;
        }
        dm8 dm8Var2 = b;
        if (dm8Var2 != null) {
            dm8Var2.R(str);
        }
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            a(null);
        }
    }
}
