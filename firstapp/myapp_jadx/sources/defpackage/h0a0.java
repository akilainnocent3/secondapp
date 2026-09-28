package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class h0a0 implements gaj<w0a0, a, Integer, Unit> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ez90 b;

    public h0a0(ez90 ez90Var, boolean z) {
        this.a = z;
        this.b = ez90Var;
    }

    @Override // defpackage.gaj
    public final Unit invoke(w0a0 w0a0Var, a aVar, Integer num) {
        int iIntValue = num.intValue();
        pz90.a.b(w0a0Var, null, this.a, this.b, null, null, 0.0f, 0.0f, aVar, (iIntValue & 14) | 100663296);
        return Unit.a;
    }
}
