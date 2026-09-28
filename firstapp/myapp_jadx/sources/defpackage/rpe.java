package defpackage;

import androidx.recyclerview.widget.n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class rpe extends n.b {
    public final /* synthetic */ List<Object> a;
    public final /* synthetic */ ArrayList b;

    public rpe(List list, ArrayList arrayList) {
        this.a = list;
        this.b = arrayList;
    }

    @Override // androidx.recyclerview.widget.n.b
    public final boolean areContentsTheSame(int i, int i2) {
        return ((spe) this.a.get(i)).b((spe) this.b.get(i2));
    }

    @Override // androidx.recyclerview.widget.n.b
    public final boolean areItemsTheSame(int i, int i2) {
        return ((spe) this.a.get(i)).a((spe) this.b.get(i2));
    }

    @Override // androidx.recyclerview.widget.n.b
    public final Object getChangePayload(int i, int i2) {
        ((spe) this.a.get(i)).c((spe) this.b.get(i2));
        return null;
    }

    @Override // androidx.recyclerview.widget.n.b
    public final int getNewListSize() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.n.b
    public final int getOldListSize() {
        return this.a.size();
    }
}
