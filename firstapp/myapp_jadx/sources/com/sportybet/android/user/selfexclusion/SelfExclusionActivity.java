package com.sportybet.android.user.selfexclusion;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import com.sportybet.android.gp.tz.R;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.k9j;
import defpackage.m2m;
import defpackage.phx;
import defpackage.psm;
import defpackage.s980;
import defpackage.we;
import defpackage.ygx;

/* JADX INFO: loaded from: classes5.dex */
public class SelfExclusionActivity extends m2m implements View.OnClickListener, k9j, bb40 {
    public static final /* synthetic */ int e = 0;
    public phx b;
    public we c;
    public psm d;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        phx phxVar;
        if (view.getId() != R.id.back_icon || (phxVar = this.b) == null) {
            return;
        }
        ygx ygxVarI = phxVar.b.i();
        phx phxVar2 = this.b;
        if (ygxVarI == null) {
            if (phxVar2.k()) {
                return;
            }
            finish();
            return;
        }
        int i = phxVar2.b.i().b.e;
        if (i == R.id.selfExclusionSetupFragment || i == R.id.selfExclusionConfirmFragment) {
            this.b.j();
        } else {
            this.b.b.p(R.id.selfExclusionIntroFragment, true);
            onBackPressed();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_self_exclusion, (ViewGroup) null, false);
        int i = R.id.back_icon;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.back_icon, viewInflate);
        if (imageButton != null) {
            i = R.id.back_title;
            TextView textView = (TextView) h5e.a(R.id.back_title, viewInflate);
            if (textView != null) {
                i = R.id.home;
                ImageButton imageButton2 = (ImageButton) h5e.a(R.id.home, viewInflate);
                if (imageButton2 != null) {
                    i = R.id.selfExclusionIntroFragment;
                    if (((FragmentContainerView) h5e.a(R.id.selfExclusionIntroFragment, viewInflate)) != null) {
                        if (((RelativeLayout) h5e.a(R.id.title_bar, viewInflate)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.c = new we(constraintLayout, imageButton, textView, imageButton2);
                            setContentView(constraintLayout);
                            this.c.c.setText(getCMSString(this.d.O() ? R.string.self_exclusion__self_exclusion__ZA : R.string.self_exclusion__self_exclusion, new Object[0]));
                            this.c.b.setOnClickListener(this);
                            NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().G(R.id.selfExclusionIntroFragment);
                            if (navHostFragment != null) {
                                this.b = navHostFragment.j0();
                            }
                            this.c.d.setOnClickListener(new s980());
                            return;
                        }
                        i = R.id.title_bar;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
