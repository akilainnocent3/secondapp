package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.DeckCard;
import com.sportygames.commons.models.CardDetail;
import com.sportygames.redblack.remote.models.UserCard;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class fph0 extends RecyclerView.f<gph0> {
    public final Context a;
    public ArrayList b;
    public boolean c;
    public int d;

    public fph0(Context context) {
        context.getClass();
        this.a = context;
        this.b = new ArrayList();
        this.d = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void i(ArrayList arrayList, boolean z) {
        this.c = z;
        if (arrayList == null) {
            this.b = new ArrayList();
            notifyDataSetChanged();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                int i3 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                UserCard userCard = (UserCard) obj;
                ArrayList arrayList2 = this.b;
                UserCard userCard2 = arrayList2 != null ? (UserCard) CollectionsKt.V(i, arrayList2) : null;
                ArrayList arrayList3 = this.b;
                if (userCard2 == null) {
                    if (arrayList3 != null) {
                        arrayList3.add(userCard);
                    }
                } else if (arrayList3 != null) {
                }
                i = i3;
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        gph0 gph0Var = (gph0) d0Var;
        gph0Var.getClass();
        DeckCard deckCard = gph0Var.a;
        ArrayList arrayList = this.b;
        deckCard.setCardDraw(new CardDetail(arrayList != null ? (UserCard) arrayList.get(i) : null));
        if (i > this.d) {
            this.d = i;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.a, R.anim.animation_left_deck);
            animationLoadAnimation.getClass();
            animationLoadAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            deckCard.setAnimation(animationLoadAnimation);
            if (this.c) {
                return;
            }
            deckCard.setAlpha(0.5f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.redblack_game_user_history_item, viewGroup, false);
        viewA.getClass();
        return new gph0(viewA);
    }
}
