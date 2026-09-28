package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xa80 {
    public static final AtomicInteger a = new AtomicInteger(0);

    public static final d a(d dVar, Function1<? super pb80, Unit> function1) {
        return dVar.n(new ClearAndSetSemanticsElement(function1));
    }

    public static final d b(d dVar, boolean z, Function1<? super pb80, Unit> function1) {
        return dVar.n(new AppendedSemanticsElement(z, function1));
    }
}
