package androidx.compose.ui.input.key;

import androidx.compose.ui.d;
import defpackage.cmp;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final d a(d dVar, Function1<? super cmp, Boolean> function1) {
        return dVar.n(new KeyInputElement(function1, null));
    }

    public static final d b(d dVar, Function1<? super cmp, Boolean> function1) {
        return dVar.n(new KeyInputElement(null, function1));
    }
}
