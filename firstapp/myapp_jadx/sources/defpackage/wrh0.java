package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class wrh0 {
    public static final Pattern a = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static wrh0 b;

    public wrh0(cdp cdpVar) {
    }

    public final boolean a(yj1 yj1Var) {
        if (TextUtils.isEmpty(yj1Var.d)) {
            return true;
        }
        return yj1Var.f + yj1Var.g < (System.currentTimeMillis() / 1000) + 3600;
    }
}
