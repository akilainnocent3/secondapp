package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;

/* JADX INFO: loaded from: classes.dex */
public final class h020 {
    public static final int a(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int b(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static d c(d dVar, t90 t90Var) {
        return dVar.n(new PointerHoverIconModifierElement(t90Var));
    }
}
