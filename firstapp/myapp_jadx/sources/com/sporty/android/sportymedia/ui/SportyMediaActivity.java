package com.sporty.android.sportymedia.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.sportybet.android.gp.tz.R;
import defpackage.a4m;
import defpackage.bb40;
import defpackage.f00;
import defpackage.jpu;
import defpackage.phx;
import defpackage.vgb0;
import defpackage.wae;
import defpackage.yix;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sporty/android/sportymedia/ui/SportyMediaActivity;", "Lpy1;", "Lbb40;", "<init>", "()V", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyMediaActivity extends a4m implements bb40 {
    public static final /* synthetic */ int b = 0;

    public static final void z1(Context context, String str, String str2, boolean z) {
        str2.getClass();
        Intent intent = new Intent(context, (Class<?>) SportyMediaActivity.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        intent.putExtra("from", str);
        intent.putExtra("destination", str2);
        intent.putExtra("multiTab", z);
        context.startActivity(intent);
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.spm_activity_sporty_media);
        String stringExtra = getIntent().getStringExtra("from");
        String stringExtra2 = getIntent().getStringExtra("destination");
        if (stringExtra2 == null) {
            wae.a aVar = wae.b;
            stringExtra2 = "tv-streams";
        }
        String stringExtra3 = getIntent().getStringExtra("articleId");
        String stringExtra4 = getIntent().getStringExtra("articleType");
        boolean booleanExtra = getIntent().getBooleanExtra("multiTab", true);
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = "UNKNOWN_FROM";
        }
        f00 f00Var = vgb0.a;
        vgb0.c("android_sporty_tv_page", jpu.b(new Pair("from", stringExtra)), false);
        Bundle bundle2 = new Bundle();
        bundle2.putString("destination", stringExtra2);
        if (stringExtra3 != null && stringExtra3.length() > 0 && stringExtra4 != null && stringExtra4.length() > 0) {
            bundle2.putString("articleId", stringExtra3);
            bundle2.putString("articleType", stringExtra4);
        }
        bundle2.putBoolean("multiTab", booleanExtra);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().G(R.id.nav_host_fragment);
        phx phxVarJ0 = navHostFragment != null ? navHostFragment.j0() : null;
        if (phxVarJ0 != null) {
            phxVarJ0.b.w(((yix) phxVarJ0.h.getValue()).b(R.navigation.nav_sporty_media), bundle2);
        }
    }
}
