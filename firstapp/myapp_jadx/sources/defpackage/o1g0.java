package defpackage;

import androidx.recyclerview.widget.n;
import com.sportygames.sportyherov2.remote.models.TopBets;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o1g0 extends n.b {
    public final List<TopBets> a;
    public final List<TopBets> b;

    public o1g0(List<TopBets> list, List<TopBets> list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    @Override // androidx.recyclerview.widget.n.b
    public final boolean areContentsTheSame(int i, int i2) {
        List<TopBets> list = this.a;
        long betId = list.get(i).getBetId();
        List<TopBets> list2 = this.b;
        return betId == list2.get(i2).getBetId() && Intrinsics.g(list.get(i).getCashoutCoefficient(), list2.get(i2).getCashoutCoefficient());
    }

    @Override // androidx.recyclerview.widget.n.b
    public final boolean areItemsTheSame(int i, int i2) {
        return this.a.get(i).getBetId() == this.b.get(i2).getBetId();
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
