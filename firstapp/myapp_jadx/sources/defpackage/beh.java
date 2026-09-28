package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import com.sportygames.featuredGames.model.FeaturedResponse;
import com.sportygames.lobby.utils.VerticalViewPager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class beh extends RecyclerView.f<a> {
    public final List<Pair<Integer, FeaturedResponse.GameList>> a;
    public final Context b;
    public neh c;
    public final ssw<String> d;

    public final class a extends RecyclerView.d0 {
        public final neh a;
        public final /* synthetic */ beh b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(beh behVar, neh nehVar) {
            super(nehVar.a);
            nehVar.getClass();
            this.b = behVar;
            this.a = nehVar;
        }
    }

    public beh(Context context, ArrayList arrayList) {
        arrayList.getClass();
        context.getClass();
        this.a = arrayList;
        this.b = context;
        this.d = new ssw<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return Reader.READ_DONE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        List<Pair<Integer, FeaturedResponse.GameList>> list = this.a;
        FeaturedResponse.GameList gameList = list.get(i % list.size()).b;
        beh behVar = aVar.b;
        neh nehVar = aVar.a;
        gameList.getClass();
        try {
            Context context = behVar.b;
            context.getClass();
            xa50 xa50VarC = com.bumptech.glide.a.b(context).c(context);
            xa50VarC.getClass();
            String imageUrl = gameList.getImageUrl();
            ea50 ea50VarP = xa50VarC.f(Drawable.class).P(imageUrl);
            ea50VarP.getClass();
            po80 po80Var = new po80(xa50VarC, imageUrl, ea50VarP, lo80.a);
            po80Var.g(context.getDrawable(R.drawable.placeholder));
            ImageView imageView = nehVar.b;
            TextView textView = nehVar.f;
            po80Var.e(imageView);
            Integer onlineUserCount = gameList.getOnlineUserCount();
            if (onlineUserCount != null && onlineUserCount.intValue() == 1) {
                textView.setTag(context.getString(R.string.featured_game_player_count_cms));
                textView.setText(gameList.getOnlineUserCount() + " player ");
            } else {
                textView.setTag(context.getString(R.string.featured_game_players_count_cms));
                textView.setText(gameList.getOnlineUserCount() + " players ");
            }
            HashMap map = new HashMap();
            map.put(context.getString(R.string.count_cms), String.valueOf(gameList.getOnlineUserCount()));
            op5.r(op5.a, b.f(textView), map, 4);
            nehVar.d.setText(gameList.getDisplayName());
            nehVar.c.setOnClickListener(new aeh(0, gameList, behVar));
            boolean zIsEmpty = gameList.getNotificationList().isEmpty();
            ConstraintLayout constraintLayout = nehVar.e;
            if (zIsEmpty) {
                constraintLayout.setVisibility(8);
            } else {
                constraintLayout.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.featured_games_item, viewGroup, false);
        int i2 = R.id.featured_game_image;
        ImageView imageView = (ImageView) h5e.a(R.id.featured_game_image, viewA);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewA;
            i2 = R.id.game_name;
            TextView textView = (TextView) h5e.a(R.id.game_name, viewA);
            if (textView != null) {
                i2 = R.id.layout;
                if (((ConstraintLayout) h5e.a(R.id.layout, viewA)) != null) {
                    i2 = R.id.notification_layout;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.notification_layout, viewA);
                    if (constraintLayout2 != null) {
                        i2 = R.id.notification_list;
                        if (((VerticalViewPager) h5e.a(R.id.notification_list, viewA)) != null) {
                            i2 = R.id.online_tv;
                            TextView textView2 = (TextView) h5e.a(R.id.online_tv, viewA);
                            if (textView2 != null) {
                                i2 = R.id.person_image;
                                if (((ImageView) h5e.a(R.id.person_image, viewA)) != null) {
                                    this.c = new neh(constraintLayout, imageView, constraintLayout, textView, constraintLayout2, textView2);
                                    neh nehVar = this.c;
                                    if (nehVar != null) {
                                        return new a(this, nehVar);
                                    }
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
