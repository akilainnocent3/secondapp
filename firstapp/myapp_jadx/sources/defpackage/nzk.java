package defpackage;

import com.sportybet.plugin.common.gift.GiftsActivity;
import com.sportybet.plugin.realsports.betorder.RecyclerView.PullRefreshRecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class nzk implements PullRefreshRecyclerView.b {
    public final /* synthetic */ GiftsActivity a;

    public nzk(GiftsActivity giftsActivity) {
        this.a = giftsActivity;
    }

    @Override // com.sportybet.plugin.realsports.betorder.RecyclerView.PullRefreshRecyclerView.b
    public final void a() {
        int i = GiftsActivity.P;
        final GiftsActivity giftsActivity = this.a;
        giftsActivity.H.postDelayed(new Runnable() { // from class: lzk
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = GiftsActivity.P;
                GiftsActivity giftsActivity2 = giftsActivity;
                giftsActivity2.c = true;
                giftsActivity2.A1();
            }
        }, 2000L);
    }

    @Override // com.sportybet.plugin.realsports.betorder.RecyclerView.PullRefreshRecyclerView.b
    public final void b() {
    }
}
