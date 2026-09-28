package defpackage;

import com.sportybet.plugin.realsports.betorder.RecyclerView.PullRefreshRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qok implements PullRefreshRecyclerView.b {
    public final /* synthetic */ rok a;

    public qok(rok rokVar) {
        this.a = rokVar;
    }

    @Override // com.sportybet.plugin.realsports.betorder.RecyclerView.PullRefreshRecyclerView.b
    public final void a() {
        final rok rokVar = this.a;
        thd0 thd0Var = rokVar.i;
        if (thd0Var != null) {
            thd0Var.a.postDelayed(new Runnable() { // from class: nok
                @Override // java.lang.Runnable
                public final void run() {
                    rok rokVar2 = rokVar;
                    rokVar2.A = true;
                    rokVar2.m0();
                }
            }, 2000L);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // com.sportybet.plugin.realsports.betorder.RecyclerView.PullRefreshRecyclerView.b
    public final void b() {
    }
}
