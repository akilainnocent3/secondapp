package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportygames.commons.components.BetChipContainerSpin2Win;

/* JADX INFO: loaded from: classes7.dex */
public final class ik2 extends RecyclerView.s {
    public final /* synthetic */ BetChipContainerSpin2Win a;

    public ik2(BetChipContainerSpin2Win betChipContainerSpin2Win) {
        this.a = betChipContainerSpin2Win;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a(RecyclerView recyclerView, int i) {
        BetChipContainerSpin2Win betChipContainerSpin2Win = this.a;
        betChipContainerSpin2Win.setBetAmount(Double.valueOf(betChipContainerSpin2Win.Q), Double.valueOf(betChipContainerSpin2Win.P));
    }
}
