package com.sportybet.plugin.myfavorite.activities;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteTutorialActivity;
import com.sportybet.plugin.myfavorite.fragment.MyFavoriteTabBaseFragment;
import com.sportybet.plugin.myfavorite.fragment.MyOddsRangeFragment;
import com.sportybet.plugin.myfavorite.fragment.MyStakeFragment;
import com.sportybet.plugin.myfavorite.fragment.MyTeamFragment;
import com.sportybet.plugin.myfavorite.fragment.MyTeamSearchFragment;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.czw;
import defpackage.dq7;
import defpackage.gzw;
import defpackage.hb5;
import defpackage.izw;
import defpackage.jq40;
import defpackage.phx;
import defpackage.py1;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.v8i0;
import defpackage.vym;
import defpackage.yix;

/* JADX INFO: loaded from: classes2.dex */
public class MyFavoriteTutorialActivity extends py1 implements MyStakeFragment.b, MyOddsRangeFragment.b, MyFavoriteTabBaseFragment.b, MyTeamFragment.a, MyTeamSearchFragment.a, vym, bb40 {
    public static final /* synthetic */ int i = 0;
    public gzw a;
    public phx b;
    public TextView c;
    public TextView d;
    public final Bundle e = new Bundle();
    public String f = null;

    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MyFavoriteTypeEnum.values().length];
            a = iArr;
            try {
                iArr[MyFavoriteTypeEnum.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MyFavoriteTypeEnum.SPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MyFavoriteTypeEnum.LEAGUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MyFavoriteTypeEnum.MARKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MyFavoriteTypeEnum.TEAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[MyFavoriteTypeEnum.SEARCH_TEAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[MyFavoriteTypeEnum.MY_ODDS_RANGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[MyFavoriteTypeEnum.DEFAULT_STAKE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[MyFavoriteTypeEnum.QUICK_ADD_STAKE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public final void A1() {
        this.c.setText(getCMSString(this.a.a, new Object[0]));
        this.d.setText(this.a.b);
    }

    public final void B1(MyFavoriteTypeEnum myFavoriteTypeEnum) {
        Bundle bundle = this.e;
        bundle.putSerializable("favorite_type", myFavoriteTypeEnum);
        switch (a.a[myFavoriteTypeEnum.ordinal()]) {
            case 1:
                finish();
                if (TextUtils.equals(this.f, getCMSString(R.string.my_favourites_settings__my_favourites_settings, new Object[0]))) {
                    izw.b(null);
                }
                break;
            case 2:
            case 3:
            case 4:
                this.b.f(R.id.to_my_favorite_tab_base_fragment, bundle);
                break;
            case 5:
                this.b.f(R.id.to_my_team_fragment, null);
                break;
            case 6:
                this.b.f(R.id.to_my_team_search_fragment, null);
                break;
            case 7:
                this.b.f(R.id.to_my_odds_range_fragment, null);
                break;
            case 8:
            case 9:
                this.b.f(R.id.to_my_stake_fragment, bundle);
                break;
        }
    }

    @Override // com.sportybet.plugin.myfavorite.fragment.MyTeamSearchFragment.a
    public final void U0() {
        B1(this.a.x1(MyFavoriteTypeEnum.SEARCH_TEAM));
        A1();
    }

    @Override // com.sportybet.plugin.myfavorite.fragment.MyTeamSearchFragment.a
    public final void Z() {
        this.b.f(R.id.search_fragment_to_my_team_fragment, null);
    }

    @Override // com.sportybet.plugin.myfavorite.fragment.MyOddsRangeFragment.b, com.sportybet.plugin.myfavorite.fragment.MyFavoriteTabBaseFragment.b, com.sportybet.plugin.myfavorite.fragment.MyTeamFragment.a
    public final void b(final MyFavoriteTypeEnum myFavoriteTypeEnum) {
        czw.a(R.string.my_favourites_settings__saved_toast);
        new Handler().postDelayed(new Runnable() { // from class: fzw
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = MyFavoriteTutorialActivity.i;
                MyFavoriteTutorialActivity myFavoriteTutorialActivity = this.a;
                myFavoriteTutorialActivity.B1(myFavoriteTutorialActivity.a.x1(myFavoriteTypeEnum));
                myFavoriteTutorialActivity.A1();
            }
        }, 1000L);
    }

    @Override // com.sportybet.plugin.myfavorite.fragment.MyStakeFragment.b
    public final void n(MyFavoriteTypeEnum myFavoriteTypeEnum) {
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        z1();
        return true;
    }

    public final void z1() {
        gzw gzwVar = this.a;
        gzwVar.getClass();
        switch (gzw.a.a[gzwVar.c.ordinal()]) {
            case 1:
                gzwVar.a = 0;
                break;
            case 2:
                gzwVar.c = MyFavoriteTypeEnum.SPORT;
                gzwVar.a = R.string.my_favourites_settings__set_my_sports;
                gzwVar.b = "1/4";
                break;
            case 3:
            case 4:
                gzwVar.c = MyFavoriteTypeEnum.LEAGUE;
                gzwVar.a = R.string.my_favourites_settings__set_my_leagues;
                gzwVar.b = "2/4";
                break;
            case 5:
                gzwVar.c = MyFavoriteTypeEnum.TEAM;
                gzwVar.a = R.string.my_favourites_settings__set_my_teams;
                gzwVar.b = "3/4";
                break;
            case 6:
                gzwVar.c = MyFavoriteTypeEnum.MARKET;
                gzwVar.a = R.string.my_favourites_settings__set_my_markets;
                gzwVar.b = "4/4";
                break;
            case 7:
            case 8:
                gzwVar.c = MyFavoriteTypeEnum.MY_ODDS_RANGE;
                gzwVar.a = R.string.my_favourites_settings__set_my_odds;
                gzwVar.b = "5/5";
                break;
        }
        if (gzwVar.a == 0) {
            finish();
        } else {
            this.b.k();
            A1();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_my_favorite_tutorial);
        this.f = getIntent().getStringExtra("from");
        MyFavoriteTypeEnum myFavoriteTypeEnum = MyFavoriteTypeEnum.SPORT;
        Bundle bundle2 = this.e;
        bundle2.putSerializable("favorite_type", myFavoriteTypeEnum);
        phx phxVarJ0 = ((NavHostFragment) getSupportFragmentManager().G(R.id.nav_host_fragment)).j0();
        this.b = phxVarJ0;
        phxVarJ0.b.w(((yix) phxVarJ0.h.getValue()).b(R.navigation.my_favorite_tutorial_nav), bundle2);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(gzw.class);
        String strI = dq7VarA.i();
        if (strI != null) {
            this.a = (gzw) s8i0Var.a(dq7VarA, CaxEybC.wtUVfr.concat(strI));
            ((ImageView) findViewById(R.id.go_back)).setOnClickListener(new View.OnClickListener() { // from class: dzw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = MyFavoriteTutorialActivity.i;
                    this.a.z1();
                }
            });
            ((ImageView) findViewById(R.id.close)).setOnClickListener(new View.OnClickListener() { // from class: ezw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = MyFavoriteTutorialActivity.i;
                    this.a.finish();
                }
            });
            this.c = (TextView) findViewById(R.id.title);
            this.d = (TextView) findViewById(R.id.sub_title);
            A1();
            return;
        }
        hb5.a("Local and anonymous classes can not be ViewModels");
    }
}
