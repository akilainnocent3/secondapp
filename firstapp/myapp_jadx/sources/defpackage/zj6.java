package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView;
import com.sportybet.plugin.event.view.LiveEventMatchWebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zj6 implements kuj {
    public final /* synthetic */ b a;

    public zj6(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.kuj
    public final void a() {
        b bVar = this.a;
        svj svjVar = bVar.Q;
        if (svjVar == null) {
            Intrinsics.n("gamesLobbyManager");
            throw null;
        }
        String strB = svjVar.b(false);
        shd0 shd0Var = bVar.b0;
        shd0Var.getClass();
        RecyclerView recyclerView = shd0Var.f;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i));
            if (d0VarQ instanceof u6v) {
                fhd0 fhd0Var = ((u6v) d0VarQ).b;
                if (fhd0Var.z.isShown()) {
                    LiveEventMatchWebView.a(fhd0Var.z, "", null, strB, false, 16);
                }
            }
        }
    }

    @Override // defpackage.kuj
    public final void b() {
        shd0 shd0Var = this.a.b0;
        shd0Var.getClass();
        RecyclerView recyclerView = shd0Var.f;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i));
            if (d0VarQ instanceof u6v) {
                fhd0 fhd0Var = ((u6v) d0VarQ).b;
                if (fhd0Var.z.isShown()) {
                    CashoutLiveEventControlsHeaderView cashoutLiveEventControlsHeaderView = fhd0Var.v;
                    cashoutLiveEventControlsHeaderView.I(cashoutLiveEventControlsHeaderView.I, false);
                }
            }
        }
    }
}
