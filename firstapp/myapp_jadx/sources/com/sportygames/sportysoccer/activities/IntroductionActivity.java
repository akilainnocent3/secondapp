package com.sportygames.sportysoccer.activities;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportysoccer.widget.TitleLayout;
import defpackage.b0p;
import defpackage.th8;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class IntroductionActivity extends a {
    public static final /* synthetic */ int f = 0;
    public RecyclerView e;

    @Override // com.sportygames.sportysoccer.activities.a, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.sg_ss_activity_introduction);
        TitleLayout titleLayout = (TitleLayout) findViewById(R.id.title_layout);
        String string = getString(R.string.sg_sporty_soccer_game_rules);
        titleLayout.getClass();
        getWindow().addFlags(Integer.MIN_VALUE);
        titleLayout.b = this;
        titleLayout.a.setText(string);
        this.e = (RecyclerView) findViewById(R.id.recycler_view);
        ArrayList arrayList = new ArrayList(Arrays.asList(getResources().getStringArray(R.array.introduction)));
        this.e.setLayoutManager(new LinearLayoutManager());
        this.e.setAdapter(new b0p(this, this, arrayList));
        th8.a().a("https://s.sporty.net/ke/main/res/bbac6bb8f72222ff40a62c9b6f9e82a7.png", (ImageView) findViewById(R.id.image));
    }
}
