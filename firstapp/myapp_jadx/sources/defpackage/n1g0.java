package defpackage;

import androidx.recyclerview.widget.n;
import com.sportygames.pocketrocket.model.response.BetDetails;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class n1g0 extends n.b {
    public final List<BetDetails> a;
    public final List<BetDetails> b;

    public n1g0(List<BetDetails> list, List<BetDetails> list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    @Override // androidx.recyclerview.widget.n.b
    public final boolean areContentsTheSame(int i, int i2) {
        List<BetDetails> list = this.a;
        long betId = list.get(i).getBetId();
        List<BetDetails> list2 = this.b;
        return betId == list2.get(i2).getBetId() && list.get(i).getCashoutCoefficient() == list2.get(i2).getCashoutCoefficient();
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
