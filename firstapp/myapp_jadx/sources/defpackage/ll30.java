package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class ll30 extends l {
    public ArrayList h;

    @Override // defpackage.loz
    public final int c() {
        return this.h.size();
    }

    @Override // defpackage.loz
    public final int d() {
        return -2;
    }

    @Override // androidx.fragment.app.l
    public final Fragment l(int i) {
        return (Fragment) this.h.get(i);
    }
}
