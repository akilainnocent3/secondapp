package defpackage;

import androidx.compose.runtime.m;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ved extends zpz {
    public static final uv60 J = jis.a(new ted(), new pk9(1));
    public final ytw<Function0<Integer>> I;

    public ved(float f, int i, Function0 function0) {
        super(i, f);
        this.I = m.b(function0);
    }

    @Override // defpackage.zpz
    public final int n() {
        return ((Number) ((Function0) ((x5a0) this.I).getValue()).invoke()).intValue();
    }
}
