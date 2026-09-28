package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s0b {
    public static final Drawable a(Context context, int i, a78 a78Var) {
        context.getClass();
        return c(context, i, a78Var, null, 4);
    }

    public static final Drawable b(Context context, int i, a78 a78Var, Integer num) {
        Drawable drawableMutate;
        context.getClass();
        a78Var.getClass();
        context.getClass();
        a78Var.getClass();
        Drawable drawable = context.getDrawable(i);
        if (Intrinsics.g(a78Var, a78.b.a) && num == null && num == null) {
            return drawable;
        }
        if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
            if (a78Var instanceof a78.a) {
                drawableMutate.setTint(((a78.a) a78Var).a);
            } else if (a78Var instanceof a78.c) {
                drawableMutate.setTint(context.getColor(((a78.c) a78Var).a));
            } else if (a78Var instanceof a78.d) {
                drawableMutate.setTintList(null);
            } else if (!(a78Var instanceof a78.b)) {
                uhc.a();
            }
            float f = context.getResources().getDisplayMetrics().density;
            drawableMutate.setBounds(0, 0, num != null ? Math.round(num.intValue() * f) : drawableMutate.getIntrinsicWidth(), num != null ? Math.round(num.intValue() * f) : drawableMutate.getIntrinsicHeight());
            return drawableMutate;
        }
        return null;
    }

    public static /* synthetic */ Drawable c(Context context, int i, a78 a78Var, Integer num, int i2) {
        if ((i2 & 2) != 0) {
            a78Var = a78.b.a;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return b(context, i, a78Var, num);
    }
}
