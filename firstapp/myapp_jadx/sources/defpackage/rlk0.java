package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class rlk0 {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
