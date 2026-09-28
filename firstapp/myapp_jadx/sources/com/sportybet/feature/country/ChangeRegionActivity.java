package com.sportybet.feature.country;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.feature.country.ChangeRegionActivity;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.f1i;
import defpackage.fol;
import defpackage.h5e;
import defpackage.hb5;
import defpackage.i2i;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.lc;
import defpackage.lfy;
import defpackage.n57;
import defpackage.r8i0;
import defpackage.s57;
import defpackage.s8i0;
import defpackage.v8i0;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ChangeRegionActivity extends fol implements k9j, bb40 {
    public static final /* synthetic */ int e = 0;
    public s57 b;
    public boolean c;
    public lc d;

    public static Intent z1(Context context) {
        return new Intent(context, (Class<?>) ChangeRegionActivity.class);
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        return this.c;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        keepActivity();
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_change_region, (ViewGroup) null, false);
        int i = R.id.back_icon;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.back_icon, viewInflate);
        if (imageButton != null) {
            i = R.id.back_title;
            if (((TextView) h5e.a(R.id.back_title, viewInflate)) != null) {
                i = R.id.description;
                if (((TextView) h5e.a(R.id.description, viewInflate)) != null) {
                    i = R.id.home;
                    ImageButton imageButton2 = (ImageButton) h5e.a(R.id.home, viewInflate);
                    if (imageButton2 != null) {
                        i = R.id.loading;
                        if (((LoadingView) h5e.a(R.id.loading, viewInflate)) != null) {
                            i = R.id.regions;
                            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.regions, viewInflate);
                            if (recyclerView != null) {
                                i = R.id.title_bar;
                                if (((RelativeLayout) h5e.a(R.id.title_bar, viewInflate)) != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    this.d = new lc(constraintLayout, imageButton, imageButton2, recyclerView);
                                    setContentView(constraintLayout);
                                    v8i0 viewModelStore = getViewModelStore();
                                    r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
                                    cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
                                    viewModelStore.getClass();
                                    defaultViewModelProviderFactory.getClass();
                                    defaultViewModelCreationExtras.getClass();
                                    s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                                    dq7 dq7VarA = jq40.a(s57.class);
                                    String strI = dq7VarA.i();
                                    if (strI == null) {
                                        hb5.a("Local and anonymous classes can not be ViewModels");
                                        return;
                                    }
                                    this.b = (s57) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
                                    this.d.b.setOnClickListener(new View.OnClickListener() { // from class: l57
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i2 = ChangeRegionActivity.e;
                                            this.a.getOnBackPressedDispatcher().d();
                                        }
                                    });
                                    i2i.c(new f1i(this.b.d), null, 3).f(this, new lfy() { // from class: m57
                                        @Override // defpackage.lfy
                                        public final void u1(Object obj) {
                                            int i2 = ChangeRegionActivity.e;
                                            ChangeRegionActivity changeRegionActivity = this.a;
                                            changeRegionActivity.d.d.setAdapter(new ps40(changeRegionActivity, (List) obj, new o57(changeRegionActivity)));
                                        }
                                    });
                                    this.d.c.setOnClickListener(new n57());
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
