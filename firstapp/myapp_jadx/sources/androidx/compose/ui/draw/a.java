package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import defpackage.lza;
import defpackage.mr5;
import defpackage.scf;
import defpackage.tcf;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final d a(d dVar, Function1<? super tcf, Unit> function1) {
        return dVar.n(new DrawBehindElement(function1));
    }

    public static final d b(d dVar, Function1<? super mr5, scf> function1) {
        return dVar.n(new DrawWithCacheElement(function1));
    }

    public static final d c(d dVar, Function1<? super lza, Unit> function1) {
        return dVar.n(new DrawWithContentElement(function1));
    }
}
