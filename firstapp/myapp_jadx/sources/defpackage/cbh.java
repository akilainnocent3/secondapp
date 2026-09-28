package defpackage;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.sportygames.commons.SportyGamesManager;

/* JADX INFO: loaded from: classes7.dex */
public final class cbh extends RecyclerView.s {
    public final /* synthetic */ bbh a;

    public cbh(bbh bbhVar) {
        this.a = bbhVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a(RecyclerView recyclerView, int i) {
        zj60 bridge;
        float fComputeVerticalScrollOffset = (recyclerView.computeVerticalScrollOffset() * 100.0f) / (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent());
        Float fValueOf = Float.valueOf(fComputeVerticalScrollOffset);
        bbh bbhVar = this.a;
        if (fValueOf.equals(Float.valueOf(bbhVar.w))) {
            return;
        }
        bbhVar.w = fComputeVerticalScrollOffset;
        Bundle bundle = new Bundle();
        bundle.putString("scroll_percentage", String.valueOf(bbhVar.w));
        bundle.putString("source_screen", "My favourites");
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a("scroll", bundle);
    }
}
