package com.sportybet.android.social.presentation.creation;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.social.domain.entity.MySocialCreationSource;
import defpackage.bb40;
import defpackage.cny;
import defpackage.fxl;
import defpackage.oke;
import defpackage.wc;
import defpackage.zi50;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/social/presentation/creation/MySocialCreationActivity;", "Lpy1;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MySocialCreationActivity extends fxl implements bb40 {
    public static final /* synthetic */ int b = 0;

    public static final class a extends cny {
        public a() {
            super(true);
        }

        @Override // defpackage.cny
        public final void b() {
            f(false);
            wc.a(MySocialCreationActivity.this);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object bVar;
        super.onCreate(bundle);
        setContentView(R.layout.activity_my_social_creation);
        try {
            zi50.a aVar = zi50.b;
            Object parcelableExtra = getIntent().getParcelableExtra("KEY_MY_SOCIAL_CREATION_SOURCE");
            parcelableExtra.getClass();
            bVar = (MySocialCreationSource) parcelableExtra;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = MySocialCreationSource.SocialCreation.a;
        }
        MySocialCreationSource mySocialCreationSource = (MySocialCreationSource) bVar;
        String stringExtra = getIntent().getStringExtra("KEY_MY_SOCIAL_CREATION_NAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        getOnBackPressedDispatcher().a(this, new a());
        if (bundle == null) {
            com.sportybet.android.social.presentation.creation.a.D.getClass();
            mySocialCreationSource.getClass();
            com.sportybet.android.social.presentation.creation.a aVar3 = new com.sportybet.android.social.presentation.creation.a();
            aVar3.y = mySocialCreationSource;
            aVar3.z = stringExtra;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
            aVarA.e(android.R.id.content, aVar3, null, 1);
            aVarA.c(null);
            aVarA.k(true, true);
        }
    }
}
