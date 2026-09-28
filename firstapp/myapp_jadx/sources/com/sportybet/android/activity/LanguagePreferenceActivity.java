package com.sportybet.android.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import defpackage.bb40;
import defpackage.bmr;
import defpackage.jmr;
import defpackage.jul;
import defpackage.o7d;
import defpackage.sh8;
import defpackage.wae;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sportybet/android/activity/LanguagePreferenceActivity;", "Lpy1;", "", "Landroid/view/View$OnClickListener;", "Lbb40;", "<init>", "()V", "Landroid/view/View;", "view", "", "onClick", "(Landroid/view/View;)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LanguagePreferenceActivity extends jul implements View.OnClickListener, bb40 {
    public jmr b;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.back_icon) {
            finish();
        } else if (numValueOf != null && numValueOf.intValue() == R.id.home) {
            sh8.c().e(o7d.a(wae.HOME));
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_language_preference);
        ((ImageButton) findViewById(R.id.back_icon)).setOnClickListener(this);
        ((ImageButton) findViewById(R.id.home)).setOnClickListener(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.language_list);
        jmr jmrVar = this.b;
        if (jmrVar != null) {
            recyclerView.setAdapter(new bmr(this, this, jmrVar, getAccountHelper()));
        } else {
            Intrinsics.n("languageUtil");
            throw null;
        }
    }
}
