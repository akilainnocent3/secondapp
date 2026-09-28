package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class ip0 {
    public final Context a;

    public ip0(Context context) {
        this.a = context;
    }

    public final boolean a(aga0 aga0Var) {
        aga0Var.getClass();
        int iOrdinal = aga0Var.ordinal();
        Context context = this.a;
        if (iOrdinal == 0) {
            return r0b.c(context, "com.facebook.katana");
        }
        if (iOrdinal == 1) {
            return r0b.c(context, "org.telegram.messenger") || r0b.c(context, "org.telegram.messenger.web");
        }
        if (iOrdinal == 2) {
            return r0b.c(context, "com.whatsapp");
        }
        if (iOrdinal == 3) {
            return r0b.c(context, "com.twitter.android");
        }
        uhc.a();
        return false;
    }
}
