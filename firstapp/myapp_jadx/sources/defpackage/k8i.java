package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class k8i {
    public static final i8i a(Context context) {
        return new i8i(new k70(context), new m70(Build.VERSION.SDK_INT >= 31 ? u9i.a.a(context) : 0));
    }
}
