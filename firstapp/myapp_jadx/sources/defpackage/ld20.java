package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class ld20 extends RecyclerView.s {
    public final /* synthetic */ PreMatchEventActivity a;

    public ld20(PreMatchEventActivity preMatchEventActivity) {
        this.a = preMatchEventActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            int i2 = PreMatchEventActivity.a2;
            this.a.S1();
        }
    }
}
