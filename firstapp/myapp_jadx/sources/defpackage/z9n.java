package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class z9n {
    public static final crz a(u7n u7nVar, Context context, int i) {
        if (u7nVar instanceof oe4) {
            return te4.a(new t70(((oe4) u7nVar).a), i);
        }
        return u7nVar instanceof edf ? new idf(zbn.a(u7nVar, context.getResources()).mutate()) : new y9n(u7nVar);
    }
}
