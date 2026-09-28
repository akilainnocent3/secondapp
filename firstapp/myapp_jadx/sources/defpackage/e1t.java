package defpackage;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.sportygames.commons.SportyGamesManager;

/* JADX INFO: loaded from: classes7.dex */
public final class e1t extends RecyclerView.s {
    public final /* synthetic */ d1t a;

    public e1t(d1t d1tVar) {
        this.a = d1tVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a(RecyclerView recyclerView, int i) {
        zj60 bridge;
        float fComputeVerticalScrollOffset = (recyclerView.computeVerticalScrollOffset() * 100.0f) / (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent());
        Float fValueOf = Float.valueOf(fComputeVerticalScrollOffset);
        d1t d1tVar = this.a;
        if (fValueOf.equals(Float.valueOf(d1tVar.z))) {
            return;
        }
        d1tVar.z = fComputeVerticalScrollOffset;
        String str = d1tVar.w;
        if (str == null) {
            str = null;
        } else if (str.length() == 0) {
            str = "All";
        }
        Bundle bundle = new Bundle();
        bundle.putString("scroll_percentage", String.valueOf(d1tVar.z));
        bundle.putString("source_screen", str);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a("scroll", bundle);
    }
}
