package defpackage;

import android.content.Context;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class j0w extends AbstractComposeView implements eme {
    public final Window w;
    public final ytw y;
    public boolean z;

    public j0w(Context context, Window window) {
        super(context, null, 6, 0);
        this.w = window;
        this.y = m.b(cf9.a);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(int i, a aVar) {
        b bVarI = aVar.i(576708319);
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) ((x5a0) this.y).getValue()).invoke(bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new i0w(this, i);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.z;
    }

    @Override // defpackage.eme
    public final Window getWindow() {
        return this.w;
    }
}
