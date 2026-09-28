package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kotlin.collections.b;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class c0t extends goz<GameDetails, a> {
    public final e a;
    public final int b;
    public final d1t c;
    public final r0t d;
    public final String e;
    public final j01<GameDetails> f;

    public static final class a extends RecyclerView.d0 {
        public final vo80 a;
        public final yjj b;

        public a(vo80 vo80Var) {
            super(vo80Var.a);
            this.a = vo80Var;
            this.b = new yjj();
        }

        public static void b(String str, String str2, String str3) {
            zj60 bridge;
            String str4 = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
            Bundle bundleA = whs.a(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str2, "source_screen", str3);
            bundleA.putString("user_state", str4);
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
                return;
            }
            ((bk60) bridge).a(str, bundleA);
        }

        public final void a(final GameDetails gameDetails, final Context context, int i, final kah kahVar, final r0t r0tVar, final int i2, final String str) {
            LinearLayoutCompat linearLayoutCompat;
            String lowerCase;
            String string;
            vo80 vo80Var = this.a;
            gameDetails.getClass();
            context.getClass();
            kahVar.getClass();
            try {
                TextView textView = vo80Var.e;
                LinearLayoutCompat linearLayoutCompat2 = vo80Var.i;
                TextView textView2 = vo80Var.e;
                ImageView imageView = vo80Var.b;
                ImageView imageView2 = vo80Var.y;
                AppCompatImageView appCompatImageView = vo80Var.d;
                TextView textView3 = vo80Var.A;
                ImageView imageView3 = vo80Var.c;
                AppCompatTextView appCompatTextView = vo80Var.w;
                TextView textView4 = vo80Var.v;
                textView.setSelected(true);
                if (i == -2) {
                    imageView3.setVisibility(0);
                } else {
                    imageView3.setVisibility(8);
                }
                if (gameDetails.isFavouriteRun()) {
                    vo80Var.z.setVisibility(0);
                    textView3.setText(gameDetails.getFavouriteMessage());
                    if (StringsKt.M(gameDetails.getFavouriteMessage(), "Add", false)) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.2f);
                        linearLayoutCompat = linearLayoutCompat2;
                        valueAnimatorOfFloat.setDuration(500L);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yzs
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                valueAnimator.getClass();
                                vo80 vo80Var2 = this.a.a;
                                ImageView imageView4 = vo80Var2.c;
                                Object animatedValue = valueAnimator.getAnimatedValue();
                                animatedValue.getClass();
                                imageView4.setScaleX(((Float) animatedValue).floatValue());
                                ImageView imageView5 = vo80Var2.c;
                                Object animatedValue2 = valueAnimator.getAnimatedValue();
                                animatedValue2.getClass();
                                imageView5.setScaleY(((Float) animatedValue2).floatValue());
                            }
                        });
                        valueAnimatorOfFloat.setRepeatCount(1);
                        valueAnimatorOfFloat.setRepeatMode(2);
                        valueAnimatorOfFloat.start();
                        textView3.setTag(context.getString(R.string.game_added_to_fav_message_cms));
                        imageView2.setVisibility(0);
                    } else {
                        linearLayoutCompat = linearLayoutCompat2;
                        if (StringsKt.M(gameDetails.getFavouriteMessage(), "Error", false)) {
                            textView3.setTag(context.getString(R.string.try_again_long_cms));
                        } else {
                            textView3.setTag(context.getString(R.string.game_removed_from_fav_message_cms));
                        }
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: zzs
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a.z.setVisibility(8);
                            gameDetails.setFavouriteRun(false);
                        }
                    }, 1500L);
                } else {
                    linearLayoutCompat = linearLayoutCompat2;
                }
                imageView.setVisibility(4);
                imageView3.setClickable(true);
                textView2.setText(gameDetails.getDisplayName());
                if (gameDetails.getOnlineUserCount() == null || gameDetails.getOnlineUserCount().intValue() <= 0) {
                    linearLayoutCompat.setVisibility(8);
                } else {
                    linearLayoutCompat.setVisibility(0);
                    Integer onlineUserCount = gameDetails.getOnlineUserCount();
                    if (onlineUserCount != null && onlineUserCount.intValue() == 1) {
                        textView4.setTag(context.getString(R.string.game_player_count_cms));
                        textView4.setText(gameDetails.getOnlineUserCount() + " player ");
                    } else {
                        textView4.setTag(context.getString(R.string.game_players_count_cms));
                        textView4.setText(gameDetails.getOnlineUserCount() + " players ");
                    }
                    HashMap map = new HashMap();
                    map.put(context.getString(R.string.count_cms), String.valueOf(gameDetails.getOnlineUserCount().intValue()));
                    op5.r(op5.a, b.f(textView4), map, 4);
                }
                String name = gameDetails.getName();
                if (name == null || (string = StringsKt.t0(name).toString()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = c.p(string, " ", "_", false).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                appCompatImageView.setTag(lowerCase + context.getString(R.string.list_sg_lobby_image));
                op5 op5Var = op5.a;
                ArrayList arrayListF = b.f(appCompatImageView);
                ArrayList arrayListF2 = b.f(gameDetails.getImageUrl());
                ArrayList arrayListF3 = b.f(context.getDrawable(R.drawable.placeholder));
                op5Var.getClass();
                op5.p(arrayListF, arrayListF2, arrayListF3, context);
                if (gameDetails.isFavourite()) {
                    imageView3.setImageDrawable(context.getDrawable(2131232021));
                } else {
                    imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_heart_outline));
                }
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: a0t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        vo80 vo80Var2 = this.a;
                        GameDetails gameDetails2 = gameDetails;
                        boolean zIsFavourite = gameDetails2.isFavourite();
                        String str2 = str;
                        kah kahVar2 = kahVar;
                        if (zIsFavourite) {
                            c0t.a.b("remove_favourite", gameDetails2.getName(), str2);
                            kahVar2.R(String.valueOf(gameDetails2.getId()), 0, vo80Var2);
                        } else {
                            c0t.a.b("add_favourite", gameDetails2.getName(), str2);
                            kahVar2.R(String.valueOf(gameDetails2.getId()), 1, vo80Var2);
                        }
                    }
                });
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: b0t
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
                    
                        if (r9.isConnectedOrConnecting() != false) goto L25;
                     */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onClick(android.view.View r9) {
                        /*
                            r8 = this;
                            r0t r9 = r1
                            if (r9 == 0) goto L7
                            r9.e0()
                        L7:
                            android.content.Context r2 = r2
                            r2.getClass()
                            java.lang.String r9 = "connectivity"
                            java.lang.Object r9 = r2.getSystemService(r9)
                            r9.getClass()
                            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9
                            android.net.Network r0 = r9.getActiveNetwork()
                            r1 = 0
                            if (r0 != 0) goto L1f
                            goto L4f
                        L1f:
                            android.net.NetworkCapabilities r0 = r9.getNetworkCapabilities(r0)
                            if (r0 != 0) goto L26
                            goto L4f
                        L26:
                            boolean r3 = r0.hasTransport(r1)
                            if (r3 != 0) goto L67
                            r3 = 3
                            boolean r3 = r0.hasTransport(r3)
                            if (r3 != 0) goto L67
                            r3 = 1
                            boolean r0 = r0.hasTransport(r3)
                            if (r0 == 0) goto L3b
                            goto L67
                        L3b:
                            android.net.NetworkInfo r0 = r9.getActiveNetworkInfo()
                            if (r0 == 0) goto L4f
                            android.net.NetworkInfo r9 = r9.getActiveNetworkInfo()
                            r9.getClass()
                            boolean r9 = r9.isConnectedOrConnecting()
                            if (r9 == 0) goto L4f
                            goto L67
                        L4f:
                            op5 r8 = defpackage.op5.a
                            r9 = 2132021401(0x7f141099, float:1.9681192E38)
                            java.lang.String r9 = r2.getString(r9)
                            r0 = 2132021400(0x7f141098, float:1.968119E38)
                            java.lang.String r8 = defpackage.at6.a(r9, r2, r0, r8, r9)
                            android.widget.Toast r8 = android.widget.Toast.makeText(r2, r8, r1)
                            r8.show()
                            return
                        L67:
                            java.lang.String r9 = "application"
                            android.content.SharedPreferences r9 = r2.getSharedPreferences(r9, r1)
                            r9.getClass()
                            android.content.SharedPreferences$Editor r9 = r9.edit()
                            java.lang.String r0 = "lobbyPage"
                            r9.putInt(r0, r1)
                            r9.apply()
                            c0t$a r9 = r3
                            yjj r0 = r9.b
                            r6 = 0
                            r7 = 96
                            com.sportygames.lobby.remote.models.GameDetails r1 = r4
                            r3 = 0
                            int r4 = r5
                            java.lang.String r5 = r6
                            defpackage.yjj.c(r0, r1, r2, r3, r4, r5, r6, r7)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0t.onClick(android.view.View):void");
                    }
                });
                if (gameDetails.getTags() != null) {
                    appCompatTextView.setVisibility(0);
                    appCompatTextView.setText(gameDetails.getTags().get(0));
                    appCompatTextView.setTag("game_tag_" + ((Object) gameDetails.getTags().get(0)) + ":sg_lobby");
                    appCompatTextView.setText(op5.c(op5Var, appCompatTextView.getTag().toString(), appCompatTextView.getText().toString()).concat(" "));
                } else {
                    appCompatTextView.setVisibility(8);
                }
                vo80Var.f.setOnClickListener(new e440());
                op5.r(op5Var, b.f(textView2, textView3), null, 4);
                com.bumptech.glide.a.b(context).c(context).o(2131232330).M(imageView2);
                com.bumptech.glide.a.b(context).c(context).o(2131231952).M(imageView);
            } catch (Exception unused) {
                op5 op5Var2 = op5.a;
                String string2 = context.getString(R.string.unknown_error_title_uh_cms);
                Toast.makeText(context, at6.a(string2, context, R.string.other_error_title, op5Var2, string2), 0).show();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0t(e eVar, int i, d1t d1tVar, r0t r0tVar, String str, ArrayList arrayList) {
        super(new qpe());
        arrayList.getClass();
        this.a = eVar;
        this.b = i;
        this.c = d1tVar;
        this.d = r0tVar;
        this.e = str;
        this.f = new j01<>(this, new qpe());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        znz<GameDetails> znzVarA = this.f.a();
        if (znzVarA != null) {
            return znzVarA.d.a();
        }
        return 0;
    }

    public final void i(int i, boolean z) {
        GameDetails gameDetailsB = this.f.b(i);
        if (gameDetailsB != null) {
            gameDetailsB.setFavourite(z);
            gameDetailsB.setFavouriteMessage(z ? "Added to Favourites" : "Removed from Favourites");
            gameDetailsB.setFavouriteRun(true);
        }
        notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        GameDetails gameDetailsB = this.f.b(i);
        if (gameDetailsB != null) {
            aVar.a(gameDetailsB, this.a, this.b, this.c, this.d, i, this.e);
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
        return new a(vo80VarA);
    }
}
