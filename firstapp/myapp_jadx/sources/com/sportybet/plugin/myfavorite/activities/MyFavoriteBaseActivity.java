package com.sportybet.plugin.myfavorite.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteBaseActivity;
import com.sportybet.plugin.myfavorite.fragment.MyFavoriteTabBaseFragment;
import com.sportybet.plugin.myfavorite.fragment.MyOddsRangeFragment;
import com.sportybet.plugin.myfavorite.fragment.MyStakeFragment;
import com.sportybet.plugin.myfavorite.fragment.MyTeamFragment;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import defpackage.bb40;
import defpackage.czw;
import defpackage.k9j;
import defpackage.py1;
import defpackage.vym;

/* JADX INFO: loaded from: classes6.dex */
public class MyFavoriteBaseActivity extends py1 implements MyStakeFragment.b, MyOddsRangeFragment.b, MyFavoriteTabBaseFragment.b, MyTeamFragment.a, k9j, vym, bb40 {
    public static final /* synthetic */ int b = 0;
    public MyFavoriteTypeEnum a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MyFavoriteTypeEnum.values().length];
            a = iArr;
            try {
                iArr[MyFavoriteTypeEnum.SPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MyFavoriteTypeEnum.LEAGUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MyFavoriteTypeEnum.MARKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MyFavoriteTypeEnum.MY_ODDS_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MyFavoriteTypeEnum.DEFAULT_STAKE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[MyFavoriteTypeEnum.QUICK_ADD_STAKE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[MyFavoriteTypeEnum.NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static void z1(Activity activity, MyFavoriteTypeEnum myFavoriteTypeEnum) {
        Intent intent = new Intent(activity, (Class<?>) MyFavoriteBaseActivity.class);
        intent.putExtra("favorite_type", myFavoriteTypeEnum);
        activity.startActivity(intent);
    }

    public final void A1(MyFavoriteTypeEnum myFavoriteTypeEnum) {
        int i;
        TextView textView = (TextView) findViewById(R.id.title);
        int i2 = a.a[myFavoriteTypeEnum.ordinal()];
        if (i2 == 2) {
            i = R.string.my_favourites_settings__my_leagues;
        } else if (i2 == 3) {
            i = R.string.my_favourites_settings__my_markets;
        } else if (i2 == 4) {
            i = R.string.wap_setting__my_odds_range;
        } else if (i2 != 5) {
            i = i2 != 6 ? R.string.my_favourites_settings__my_sports : R.string.wap_setting__my_quick_add_stake;
        } else {
            i = R.string.wap_setting__my_stakes;
        }
        textView.setText(getCMSString(i, new Object[0]));
    }

    @Override // com.sportybet.plugin.myfavorite.fragment.MyOddsRangeFragment.b, com.sportybet.plugin.myfavorite.fragment.MyFavoriteTabBaseFragment.b, com.sportybet.plugin.myfavorite.fragment.MyTeamFragment.a
    public final void b(MyFavoriteTypeEnum myFavoriteTypeEnum) {
        if (myFavoriteTypeEnum == MyFavoriteTypeEnum.SPORT) {
            getAccountHelper().refreshMyFavoriteSelectedSports();
        }
        czw.a(R.string.my_favourites_settings__saved_toast);
    }

    @Override // com.sportybet.plugin.myfavorite.fragment.MyStakeFragment.b
    public final void n(MyFavoriteTypeEnum myFavoriteTypeEnum) {
        this.a = myFavoriteTypeEnum;
        A1(myFavoriteTypeEnum);
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment myFavoriteTabBaseFragment;
        super.onCreate(bundle);
        setContentView(R.layout.activity_my_favorite_base);
        this.a = (MyFavoriteTypeEnum) getIntent().getSerializableExtra("favorite_type");
        ImageView imageView = (ImageView) findViewById(R.id.go_back);
        A1(this.a);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: jvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = MyFavoriteBaseActivity.b;
                this.a.finish();
            }
        });
        switch (a.a[this.a.ordinal()]) {
            case 1:
            case 2:
            case 3:
                MyFavoriteTypeEnum myFavoriteTypeEnum = this.a;
                myFavoriteTabBaseFragment = new MyFavoriteTabBaseFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("favorite_type", myFavoriteTypeEnum);
                bundle2.putString("next", "");
                myFavoriteTabBaseFragment.setArguments(bundle2);
                break;
            case 4:
                myFavoriteTabBaseFragment = new MyOddsRangeFragment();
                break;
            case 5:
            case 6:
                MyFavoriteTypeEnum myFavoriteTypeEnum2 = this.a;
                myFavoriteTabBaseFragment = new MyStakeFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putSerializable("favorite_type", myFavoriteTypeEnum2);
                bundle3.putString("finish", "");
                myFavoriteTabBaseFragment.setArguments(bundle3);
                break;
            case 7:
                finish();
            default:
                myFavoriteTabBaseFragment = null;
                break;
        }
        if (myFavoriteTabBaseFragment != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.f(R.id.main_frame, myFavoriteTabBaseFragment, null);
            aVar.k(true, true);
        }
    }
}
