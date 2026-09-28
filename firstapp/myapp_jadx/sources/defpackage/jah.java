package defpackage;

import android.graphics.drawable.Drawable;
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
import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class jah extends goz<GameDetails, a> {
    public final e a;
    public final bbh b;
    public final r0t c;
    public final bbh d;
    public final j01<GameDetails> e;
    public final yjj f;
    public boolean i;

    public final class a extends RecyclerView.d0 {
        public final vo80 a;

        public a(vo80 vo80Var) {
            super(vo80Var.a);
            this.a = vo80Var;
        }

        public static void a(String str, String str2) {
            zj60 bridge;
            String str3 = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
            Bundle bundleA = whs.a(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str2, "source_screen", "My favourites");
            bundleA.putString("user_state", str3);
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
                return;
            }
            ((bk60) bridge).a(str, bundleA);
        }
    }

    public jah(e eVar, bbh bbhVar, GamesLobbyMainFragment gamesLobbyMainFragment, bbh bbhVar2) {
        super(new qpe());
        this.a = eVar;
        this.b = bbhVar;
        this.c = gamesLobbyMainFragment;
        this.d = bbhVar2;
        this.e = new j01<>(this, new qpe());
        this.f = new yjj();
    }

    public static boolean i(znz znzVar, znz znzVar2) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (znzVar != null) {
            arrayList = new ArrayList(l48.r(znzVar, 10));
            Iterator<T> it = znzVar.iterator();
            while (it.hasNext()) {
                GameDetails gameDetails = (GameDetails) it.next();
                arrayList.add(new Pair(gameDetails.getId(), gameDetails.getPosition()));
            }
        } else {
            arrayList = null;
        }
        if (znzVar2 != null) {
            arrayList2 = new ArrayList(l48.r(znzVar2, 10));
            Iterator<T> it2 = znzVar2.iterator();
            while (it2.hasNext()) {
                GameDetails gameDetails2 = (GameDetails) it2.next();
                arrayList2.add(new Pair(gameDetails2.getId(), gameDetails2.getPosition()));
            }
        }
        return Intrinsics.g(arrayList, arrayList2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        znz<GameDetails> znzVarA = this.e.a();
        if (znzVarA != null) {
            return znzVarA.d.a();
        }
        return 0;
    }

    public final void j(final znz<GameDetails> znzVar) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: fah
            @Override // java.lang.Runnable
            public final void run() {
                jah jahVar = this.a;
                j01<GameDetails> j01Var = jahVar.e;
                znz<GameDetails> znzVar2 = znzVar;
                try {
                    if (jah.i(j01Var.a(), znzVar2) || !jahVar.d.f) {
                        return;
                    }
                    j01Var.e(znzVar2);
                } catch (Exception unused) {
                }
            }
        }, 1000L);
        if (znzVar != null) {
            znzVar.b(znzVar.h() ? znzVar : new z5a0<>(znzVar), new b());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        final a aVar = (a) d0Var;
        aVar.getClass();
        final GameDetails gameDetailsB = this.e.b(i);
        if (gameDetailsB != null) {
            final jah jahVar = jah.this;
            e eVar = jahVar.a;
            vo80 vo80Var = aVar.a;
            try {
                TextView textView = vo80Var.e;
                AppCompatImageView appCompatImageView = vo80Var.d;
                ImageView imageView = vo80Var.y;
                LinearLayoutCompat linearLayoutCompat = vo80Var.i;
                TextView textView2 = vo80Var.A;
                AppCompatTextView appCompatTextView = vo80Var.w;
                ImageView imageView2 = vo80Var.b;
                TextView textView3 = vo80Var.v;
                ImageView imageView3 = vo80Var.c;
                textView.setSelected(true);
                textView.setText(gameDetailsB.getDisplayName());
                if (gameDetailsB.getOnlineUserCount() == null || gameDetailsB.getOnlineUserCount().intValue() <= 0) {
                    linearLayoutCompat.setVisibility(8);
                } else {
                    linearLayoutCompat.setVisibility(0);
                    Integer onlineUserCount = gameDetailsB.getOnlineUserCount();
                    if (onlineUserCount != null && onlineUserCount.intValue() == 1) {
                        textView3.setTag(eVar.getString(R.string.game_player_count_cms));
                        textView3.setText(gameDetailsB.getOnlineUserCount() + " player ");
                    } else {
                        textView3.setTag(eVar.getString(R.string.game_players_count_cms));
                        textView3.setText(gameDetailsB.getOnlineUserCount() + " players ");
                    }
                }
                HashMap map = new HashMap();
                map.put(eVar.getString(R.string.count_cms), String.valueOf(gameDetailsB.getOnlineUserCount()));
                op5 op5Var = op5.a;
                op5.r(op5Var, kotlin.collections.b.f(textView3), map, 4);
                if (gameDetailsB.isFavouriteRun()) {
                    imageView3.setAlpha(1.0f);
                    imageView3.setClickable(true);
                    vo80Var.z.setVisibility(0);
                    textView2.setText(gameDetailsB.getFavouriteMessage());
                    if (StringsKt.M(gameDetailsB.getFavouriteMessage(), "Add", false)) {
                        imageView.setVisibility(0);
                        textView2.setTag(eVar.getString(R.string.game_added_to_fav_message_cms));
                    } else {
                        imageView.setVisibility(8);
                        if (StringsKt.M(gameDetailsB.getFavouriteMessage(), "Error", false)) {
                            textView2.setTag(eVar.getString(R.string.try_again_long_cms));
                        } else {
                            textView2.setTag(eVar.getString(R.string.game_removed_from_fav_message_cms));
                        }
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable(i, aVar, jahVar, gameDetailsB) { // from class: gah
                        public final /* synthetic */ jah.a a;
                        public final /* synthetic */ GameDetails b;
                        public final /* synthetic */ jah c;

                        {
                            this.a = aVar;
                            this.b = gameDetailsB;
                            this.c = jahVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            j01<GameDetails> j01Var;
                            znz<GameDetails> znzVarA;
                            View view;
                            this.a.a.z.setVisibility(8);
                            GameDetails gameDetails = this.b;
                            int iA = 0;
                            gameDetails.setFavouriteRun(false);
                            if (StringsKt.M(gameDetails.getFavouriteMessage(), "Removed", false) || StringsKt.M(gameDetails.getFavouriteMessage(), "Error", false)) {
                                bbh bbhVar = this.c.b;
                                co80 co80Var = (co80) bbhVar.b;
                                if (co80Var != null) {
                                    Iterator<View> it = new r7i0(co80Var.d).iterator();
                                    int i2 = 0;
                                    while (true) {
                                        t7i0 t7i0Var = (t7i0) it;
                                        if (!t7i0Var.hasNext()) {
                                            break;
                                        }
                                        int i3 = i2 + 1;
                                        t7i0Var.next();
                                        co80 co80Var2 = (co80) bbhVar.b;
                                        if (co80Var2 != null) {
                                            RecyclerView recyclerView = co80Var2.d;
                                            RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i2));
                                            if (d0VarQ != null && (view = d0VarQ.itemView) != null) {
                                                view.setAlpha(1.0f);
                                            }
                                        }
                                        i2 = i3;
                                    }
                                }
                                jah jahVar2 = bbhVar.c;
                                if (jahVar2 != null && (j01Var = jahVar2.e) != null && (znzVarA = j01Var.a()) != null) {
                                    iA = znzVarA.d.a();
                                }
                                mpe0 mpe0Var = bbhVar.D;
                                if (iA <= 1) {
                                    ((r) mpe0Var.getValue()).j(null);
                                    return;
                                }
                                r rVar = (r) mpe0Var.getValue();
                                co80 co80Var3 = (co80) bbhVar.b;
                                rVar.j(co80Var3 != null ? co80Var3.d : null);
                            }
                        }
                    }, 1500L);
                }
                if (gameDetailsB.isFavourite()) {
                    imageView3.setImageDrawable(eVar.getDrawable(2131232021));
                } else {
                    imageView3.setImageDrawable(eVar.getDrawable(R.drawable.ic_heart_outline));
                }
                if (jahVar.d.v) {
                    imageView3.setAlpha(0.6f);
                    imageView2.setAlpha(0.6f);
                    imageView3.setEnabled(false);
                } else {
                    imageView3.setAlpha(1.0f);
                    imageView2.setAlpha(1.0f);
                    imageView3.setEnabled(true);
                }
                znz<GameDetails> znzVarA = jahVar.e.a();
                if ((znzVarA != null ? znzVarA.d.a() : 0) == 1) {
                    imageView2.setAlpha(0.6f);
                } else {
                    imageView2.setAlpha(1.0f);
                }
                xa50 xa50VarC = com.bumptech.glide.a.b(eVar).c(eVar);
                xa50VarC.getClass();
                String imageUrl = gameDetailsB.getImageUrl();
                ea50 ea50VarP = xa50VarC.f(Drawable.class).P(imageUrl);
                ea50VarP.getClass();
                po80 po80Var = new po80(xa50VarC, imageUrl, ea50VarP, lo80.a);
                hre.a aVar2 = hre.a;
                aVar2.getClass();
                po80Var.c(aVar2);
                po80Var.f(R.drawable.placeholder);
                po80Var.e(appCompatImageView);
                if (jahVar.i) {
                    imageView2.setVisibility(0);
                } else {
                    imageView2.setVisibility(8);
                }
                imageView3.setOnClickListener(new View.OnClickListener(i, aVar, jahVar, gameDetailsB) { // from class: hah
                    public final /* synthetic */ GameDetails a;
                    public final /* synthetic */ jah.a b;
                    public final /* synthetic */ jah c;

                    {
                        this.a = gameDetailsB;
                        this.b = aVar;
                        this.c = jahVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        vo80 vo80Var2 = this.b.a;
                        jah jahVar2 = this.c;
                        bbh bbhVar = jahVar2.b;
                        GameDetails gameDetails = this.a;
                        if (gameDetails.isFavourite()) {
                            jah.a.a("remove_favourite", gameDetails.getName());
                            bbhVar.R(String.valueOf(gameDetails.getId()), 1, vo80Var2);
                        } else {
                            jah.a.a("add_favourite", gameDetails.getName());
                            bbhVar.R(String.valueOf(gameDetails.getId()), 0, vo80Var2);
                        }
                        jahVar2.notifyDataSetChanged();
                        vo80Var2.c.setImageDrawable(jahVar2.a.getDrawable(R.drawable.ic_heart_outline));
                    }
                });
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: iah
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
                    
                        if (r0.isConnectedOrConnecting() != false) goto L25;
                     */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onClick(android.view.View r15) {
                        /*
                            r14 = this;
                            jah r15 = r3
                            r0t r0 = r15.c
                            androidx.fragment.app.e r1 = r15.a
                            if (r0 == 0) goto Lb
                            r0.e0()
                        Lb:
                            r1.getClass()
                            java.lang.String r0 = "connectivity"
                            java.lang.Object r0 = r1.getSystemService(r0)
                            r0.getClass()
                            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
                            android.net.Network r2 = r0.getActiveNetwork()
                            r3 = 0
                            if (r2 != 0) goto L21
                            goto L51
                        L21:
                            android.net.NetworkCapabilities r2 = r0.getNetworkCapabilities(r2)
                            if (r2 != 0) goto L28
                            goto L51
                        L28:
                            boolean r4 = r2.hasTransport(r3)
                            r5 = 1
                            if (r4 != 0) goto L73
                            r4 = 3
                            boolean r4 = r2.hasTransport(r4)
                            if (r4 != 0) goto L73
                            boolean r2 = r2.hasTransport(r5)
                            if (r2 == 0) goto L3d
                            goto L73
                        L3d:
                            android.net.NetworkInfo r2 = r0.getActiveNetworkInfo()
                            if (r2 == 0) goto L51
                            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
                            r0.getClass()
                            boolean r0 = r0.isConnectedOrConnecting()
                            if (r0 == 0) goto L51
                            goto L73
                        L51:
                            op5 r14 = defpackage.op5.a
                            r15 = 2132021401(0x7f141099, float:1.9681192E38)
                            java.lang.String r15 = r1.getString(r15)
                            r15.getClass()
                            r0 = 2132021400(0x7f141098, float:1.968119E38)
                            java.lang.String r0 = r1.getString(r0)
                            r0.getClass()
                            java.lang.String r14 = defpackage.op5.c(r14, r15, r0)
                            android.widget.Toast r14 = android.widget.Toast.makeText(r1, r14, r3)
                            r14.show()
                            return
                        L73:
                            jah$a r0 = r2
                            jah r0 = defpackage.jah.this
                            androidx.fragment.app.e r0 = r0.a
                            java.lang.String r1 = "application"
                            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r3)
                            r0.getClass()
                            android.content.SharedPreferences$Editor r0 = r0.edit()
                            java.lang.String r1 = "lobbyPage"
                            r0.putInt(r1, r5)
                            r0.apply()
                            yjj r6 = r15.f
                            androidx.fragment.app.e r8 = r15.a
                            r12 = 0
                            r13 = 96
                            com.sportygames.lobby.remote.models.GameDetails r7 = r4
                            r9 = 0
                            int r10 = r1
                            java.lang.String r11 = "My favourites"
                            defpackage.yjj.c(r6, r7, r8, r9, r10, r11, r12, r13)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.iah.onClick(android.view.View):void");
                    }
                });
                if (gameDetailsB.getTags() != null) {
                    appCompatTextView.setVisibility(0);
                    appCompatTextView.setText(gameDetailsB.getTags().get(0));
                    appCompatTextView.setTag("game_tag_" + ((Object) gameDetailsB.getTags().get(0)) + ":sg_lobby");
                    appCompatTextView.setText(op5.c(op5Var, appCompatTextView.getTag().toString(), appCompatTextView.getText().toString()).concat(" "));
                } else {
                    appCompatTextView.setVisibility(8);
                }
                op5.r(op5Var, kotlin.collections.b.f(textView, textView2), null, 4);
                com.bumptech.glide.a.b(eVar).c(eVar).o(2131232330).M(imageView);
                com.bumptech.glide.a.b(eVar).c(eVar).o(2131231952).M(imageView2);
            } catch (Exception unused) {
                op5 op5Var2 = op5.a;
                String string = eVar.getString(R.string.no_internet_cms);
                string.getClass();
                String string2 = eVar.getString(R.string.no_internet);
                string2.getClass();
                Toast.makeText(eVar, op5.c(op5Var2, string, string2), 0).show();
            }
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

    public static final class b extends znz.a {
        @Override // znz.a
        public final void a(int i, int i2) {
        }

        @Override // znz.a
        public final void b(int i, int i2) {
        }

        @Override // znz.a
        public final void c(int i, int i2) {
        }
    }
}
