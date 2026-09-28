package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class nx70 extends RecyclerView.f<c0t.a> {
    public final Context a;
    public final int b;
    public kah c;
    public final r0t d;
    public final String e;
    public final List<GameDetails> f;

    public nx70(Context context, int i, kah kahVar, r0t r0tVar, String str, List<GameDetails> list) {
        list.getClass();
        this.a = context;
        this.b = i;
        this.c = kahVar;
        this.d = r0tVar;
        this.e = str;
        this.f = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.f.size();
    }

    public final void i(int i, boolean z) {
        GameDetails gameDetails = this.f.get(i);
        gameDetails.setFavourite(z);
        String string = this.a.getString(z ? R.string.sg_added_to_fav : R.string.sg_removed_from_fav);
        string.getClass();
        gameDetails.setFavouriteMessage(string);
        gameDetails.setFavouriteRun(true);
        notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        c0t.a aVar = (c0t.a) d0Var;
        aVar.getClass();
        kah kahVar = this.c;
        if (kahVar != null) {
            aVar.a(this.f.get(i), this.a, this.b, kahVar, this.d, i, this.e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        vo80 vo80VarA = vo80.a(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        ConstraintLayout constraintLayout = vo80VarA.a;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.getClass();
        GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = viewGroup.getMeasuredWidth() / 2;
        constraintLayout.setLayoutParams(layoutParams2);
        return new c0t.a(vo80VarA);
    }
}
