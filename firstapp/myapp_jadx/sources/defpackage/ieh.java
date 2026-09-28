package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.v;
import com.sportygames.featuredGames.view.FeaturedGames;

/* JADX INFO: loaded from: classes7.dex */
public final class ieh extends v {
    public final /* synthetic */ FeaturedGames q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ieh(FeaturedGames featuredGames, Context context) {
        super(context);
        this.q = featuredGames;
    }

    @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.y
    public final void e() {
        super.e();
        final FeaturedGames featuredGames = this.q;
        featuredGames.getBinding().c.postDelayed(new Runnable() { // from class: heh
            @Override // java.lang.Runnable
            public final void run() {
                featuredGames.z = false;
            }
        }, 300L);
    }

    @Override // androidx.recyclerview.widget.v
    public final int l(int i) {
        int iL = super.l(i);
        if (iL > 400) {
            return 400;
        }
        return iL;
    }

    @Override // androidx.recyclerview.widget.v
    public final int m() {
        return -1;
    }
}
