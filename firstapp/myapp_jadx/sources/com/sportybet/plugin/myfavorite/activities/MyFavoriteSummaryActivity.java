package com.sportybet.plugin.myfavorite.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteBaseActivity;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteSummaryActivity;
import com.sportybet.plugin.myfavorite.activities.MyTeamActivity;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.myfavorite.widget.MyFavoriteSummaryItem;
import defpackage.bb40;
import defpackage.c05;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.g05;
import defpackage.hb5;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.lfy;
import defpackage.m05;
import defpackage.n05;
import defpackage.py1;
import defpackage.pyw;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.v8i0;
import defpackage.vym;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MyFavoriteSummaryActivity extends py1 implements vym, k9j, bb40 {
    public static final /* synthetic */ int w = 0;
    public MyFavoriteSummaryItem a;
    public MyFavoriteSummaryItem b;
    public MyFavoriteSummaryItem c;
    public MyFavoriteSummaryItem d;
    public MyFavoriteSummaryItem e;
    public MyFavoriteSummaryItem f;
    public pyw i;
    public String v = null;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_favorite_summary);
        this.v = getIntent().getStringExtra("from");
        ((TextView) findViewById(R.id.my_favorite_title)).setText(getCMSString(R.string.my_favourites_settings__my_favourites_settings, new Object[0]));
        int i = 1;
        findViewById(R.id.goback).setOnClickListener(new c05(this, i));
        MyFavoriteSummaryItem myFavoriteSummaryItem = (MyFavoriteSummaryItem) findViewById(R.id.item_sport);
        this.a = myFavoriteSummaryItem;
        myFavoriteSummaryItem.setTitle(getCMSString(R.string.my_favourites_settings__my_sports, new Object[0]));
        this.a.setAction(new View.OnClickListener() { // from class: gyw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = MyFavoriteSummaryActivity.w;
                MyFavoriteBaseActivity.z1(this.a, MyFavoriteTypeEnum.SPORT);
            }
        });
        MyFavoriteSummaryItem myFavoriteSummaryItem2 = (MyFavoriteSummaryItem) findViewById(R.id.item_league);
        this.b = myFavoriteSummaryItem2;
        myFavoriteSummaryItem2.setTitle(getCMSString(R.string.my_favourites_settings__my_leagues, new Object[0]));
        this.b.setAction(new View.OnClickListener() { // from class: kyw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = MyFavoriteSummaryActivity.w;
                MyFavoriteBaseActivity.z1(this.a, MyFavoriteTypeEnum.LEAGUE);
            }
        });
        MyFavoriteSummaryItem myFavoriteSummaryItem3 = (MyFavoriteSummaryItem) findViewById(R.id.item_team);
        this.c = myFavoriteSummaryItem3;
        myFavoriteSummaryItem3.setTitle(getCMSString(R.string.my_favourites_settings__my_teams, new Object[0]));
        this.c.setAction(new View.OnClickListener() { // from class: hyw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = MyFavoriteSummaryActivity.w;
                int i3 = MyTeamActivity.v;
                MyFavoriteSummaryActivity myFavoriteSummaryActivity = this.a;
                myFavoriteSummaryActivity.startActivity(new Intent(myFavoriteSummaryActivity, (Class<?>) MyTeamActivity.class));
            }
        });
        MyFavoriteSummaryItem myFavoriteSummaryItem4 = (MyFavoriteSummaryItem) findViewById(R.id.item_market);
        this.d = myFavoriteSummaryItem4;
        myFavoriteSummaryItem4.setTitle(getCMSString(R.string.my_favourites_settings__my_markets, new Object[0]));
        this.d.setAction(new View.OnClickListener() { // from class: iyw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = MyFavoriteSummaryActivity.w;
                MyFavoriteBaseActivity.z1(this.a, MyFavoriteTypeEnum.MARKET);
            }
        });
        MyFavoriteSummaryItem myFavoriteSummaryItem5 = (MyFavoriteSummaryItem) findViewById(R.id.item_odds);
        this.e = myFavoriteSummaryItem5;
        myFavoriteSummaryItem5.setTitle(getCMSString(R.string.wap_setting__my_odds_range, new Object[0]));
        this.e.setAction(new n05(this, i));
        MyFavoriteSummaryItem myFavoriteSummaryItem6 = (MyFavoriteSummaryItem) findViewById(R.id.item_stake);
        this.f = myFavoriteSummaryItem6;
        myFavoriteSummaryItem6.setTitle(getCMSString(R.string.wap_setting__my_stakes, new Object[0]));
        this.f.setAction(new View.OnClickListener() { // from class: jyw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = MyFavoriteSummaryActivity.w;
                MyFavoriteBaseActivity.z1(this.a, MyFavoriteTypeEnum.DEFAULT_STAKE);
            }
        });
        ((TextView) findViewById(R.id.view_my_favorite)).setOnClickListener(new m05(this, i));
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(pyw.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        pyw pywVar = (pyw) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.i = pywVar;
        pywVar.b.f(this, new lfy() { // from class: lyw
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = MyFavoriteSummaryActivity.w;
                MyFavoriteSummaryActivity myFavoriteSummaryActivity = this.a;
                MyFavoriteSummaryItem myFavoriteSummaryItem7 = myFavoriteSummaryActivity.a;
                StringBuilder sb = new StringBuilder();
                for (UiText uiText : (List) obj) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    uiText.getClass();
                    sb.append(uiText.e(myFavoriteSummaryActivity).toString());
                }
                myFavoriteSummaryItem7.setDescription(myFavoriteSummaryActivity.z1(sb.toString()));
            }
        });
        this.i.c.f(this, new lfy() { // from class: myw
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = MyFavoriteSummaryActivity.w;
                MyFavoriteSummaryActivity myFavoriteSummaryActivity = this.a;
                myFavoriteSummaryActivity.b.setDescription(myFavoriteSummaryActivity.z1((String) obj));
            }
        });
        this.i.d.f(this, new lfy() { // from class: dyw
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = MyFavoriteSummaryActivity.w;
                MyFavoriteSummaryActivity myFavoriteSummaryActivity = this.a;
                myFavoriteSummaryActivity.c.setDescription(myFavoriteSummaryActivity.z1((String) obj));
            }
        });
        this.i.e.f(this, new lfy() { // from class: eyw
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = MyFavoriteSummaryActivity.w;
                MyFavoriteSummaryActivity myFavoriteSummaryActivity = this.a;
                myFavoriteSummaryActivity.d.setDescription(myFavoriteSummaryActivity.z1((String) obj));
            }
        });
        this.i.f.f(this, new lfy() { // from class: fyw
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = MyFavoriteSummaryActivity.w;
                MyFavoriteSummaryActivity myFavoriteSummaryActivity = this.a;
                myFavoriteSummaryActivity.e.setDescription(myFavoriteSummaryActivity.z1((String) obj));
            }
        });
        this.i.i.f(this, new g05(this, 1));
    }

    public final String z1(String str) {
        return str.isEmpty() ? getCMSString(R.string.my_favourites_settings__add_now, new Object[0]) : str;
    }
}
