package defpackage;

import androidx.compose.ui.layout.t;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class mgs implements aiv {
    public final Function0<Boolean> a;

    public mgs(Function0<Boolean> function0) {
        this.a = function0;
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        return t.z1(tVar, kxa.i(j), kxa.h(j), new lgs(0, list, this));
    }
}
