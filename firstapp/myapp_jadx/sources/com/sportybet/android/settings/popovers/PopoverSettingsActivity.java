package com.sportybet.android.settings.popovers;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.SimpleActionBar;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.settings.popovers.PopoverSettingsActivity;
import defpackage.a0m;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.dk9;
import defpackage.h5e;
import defpackage.ij90;
import defpackage.m220;
import defpackage.nd;
import defpackage.sn5;
import defpackage.u6i0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/settings/popovers/PopoverSettingsActivity;", "Lpy1;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PopoverSettingsActivity extends a0m implements bb40 {
    public static final /* synthetic */ int c = 0;
    public nd b;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_popover_settings, (ViewGroup) null, false);
        int i = R.id.action_bar_container;
        View viewA = h5e.a(R.id.action_bar_container, viewInflate);
        if (viewA != null) {
            ij90 ij90VarA = ij90.a(viewA);
            ComposeView composeView = (ComposeView) h5e.a(R.id.popover_categories, viewInflate);
            if (composeView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.b = new nd(constraintLayout, ij90VarA, composeView);
                setContentView(constraintLayout);
                nd ndVar = this.b;
                if (ndVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                SimpleActionBar simpleActionBar = ndVar.b.a;
                simpleActionBar.setTitle(sn5.c(simpleActionBar, R.string.wap_setting__popovers, new Object[0]));
                simpleActionBar.setBackButton(new View.OnClickListener() { // from class: l220
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2 = PopoverSettingsActivity.c;
                        this.a.finish();
                    }
                });
                simpleActionBar.setHomeButton(new m220());
                nd ndVar2 = this.b;
                if (ndVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ComposeView composeView2 = ndVar2.c;
                composeView2.setViewCompositionStrategy(u6i0.a.a);
                composeView2.setContent(dk9.b);
                return;
            }
            i = R.id.popover_categories;
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
