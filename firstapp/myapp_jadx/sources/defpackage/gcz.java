package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gcz extends RecyclerView.s {
    public final /* synthetic */ OutrightsActivity a;

    public gcz(OutrightsActivity outrightsActivity) {
        this.a = outrightsActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        OutrightsActivity outrightsActivity = this.a;
        ld ldVar = outrightsActivity.b;
        if (ldVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ldVar.A.setVisibility(recyclerView.canScrollVertically(-1) ? 0 : 8);
        ld ldVar2 = outrightsActivity.b;
        if (ldVar2 != null) {
            ldVar2.b.setVisibility(recyclerView.canScrollVertically(1) ? 0 : 8);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }
}
