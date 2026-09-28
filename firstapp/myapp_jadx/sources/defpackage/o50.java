package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o50 {
    public static final o50 a = new o50();

    public final void a(View view, g020 g020Var) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (g020Var instanceof s90) {
            systemIcon = null;
        } else {
            systemIcon = g020Var instanceof t90 ? PointerIcon.getSystemIcon(context, ((t90) g020Var).b) : PointerIcon.getSystemIcon(context, 1000);
        }
        if (Intrinsics.g(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
