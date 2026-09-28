package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportygames.featuredGames.view.FeaturedGames;

/* JADX INFO: loaded from: classes7.dex */
public final class meh implements g6i0 {
    public final ConstraintLayout a;
    public final FeaturedGames b;

    public meh(ConstraintLayout constraintLayout, FeaturedGames featuredGames) {
        this.a = constraintLayout;
        this.b = featuredGames;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
