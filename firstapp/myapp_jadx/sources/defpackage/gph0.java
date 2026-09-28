package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.DeckCard;

/* JADX INFO: loaded from: classes7.dex */
public final class gph0 extends RecyclerView.d0 {
    public final DeckCard a;

    public gph0(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.user_history_card_item);
        viewFindViewById.getClass();
        this.a = (DeckCard) viewFindViewById;
    }
}
