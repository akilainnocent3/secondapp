package defpackage;

import androidx.recyclerview.widget.r;

/* JADX INFO: loaded from: classes.dex */
public final class jnw extends jkd0 {
    @Override // defpackage.jkd0
    public final void k(hkd0... hkd0VarArr) {
        int i = 0;
        while (i < hkd0VarArr.length) {
            hkd0 hkd0Var = hkd0VarArr[i];
            i++;
            hkd0Var.f = i * r.d.DEFAULT_DRAG_ANIMATION_DURATION;
        }
    }

    @Override // defpackage.jkd0
    public final hkd0[] l() {
        return new hkd0[]{new da30(), new da30(), new da30()};
    }
}
