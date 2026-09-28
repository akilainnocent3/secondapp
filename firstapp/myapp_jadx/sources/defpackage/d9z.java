package defpackage;

import android.graphics.Outline;

/* JADX INFO: loaded from: classes.dex */
public final class d9z {
    public static void a(Outline outline, bxz bxzVar) {
        if (bxzVar instanceof j90) {
            outline.setPath(((j90) bxzVar).a);
        } else {
            zkh.a("Unable to obtain android.graphics.Path");
        }
    }
}
