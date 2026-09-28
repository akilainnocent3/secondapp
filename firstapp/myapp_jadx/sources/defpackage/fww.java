package defpackage;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes4.dex */
public final class fww {
    public static final /* synthetic */ int a = 0;

    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
