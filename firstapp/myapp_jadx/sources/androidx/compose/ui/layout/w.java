package androidx.compose.ui.layout;

import defpackage.jxo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, Function1<? super jxo, Unit> function1) {
        return dVar.n(new OnSizeChangedModifier(function1));
    }
}
