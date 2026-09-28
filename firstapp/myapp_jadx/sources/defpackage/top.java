package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes7.dex */
public final class top extends GridLayoutManager.b {
    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int getSpanSize(int i) {
        return i % 7 == 6 ? 2 : 1;
    }
}
