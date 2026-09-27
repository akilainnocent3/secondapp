package com.yandex.mobile.ads.common;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import dr.w2;
import java.util.Iterator;
import yads.a2;
import yads.ad1;
import yads.b2;
import yads.c2;
import yads.fa2;
import yads.h2;
import yads.hl3;
import yads.i2;
import yads.ia2;
import yads.k2;
import yads.q2;
import yads.w1;
import yads.x1;
import yads.y1;
import yads.z1;
import yads.z9;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class AdActivity extends ComponentActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fa2 f76761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w1 f76762b;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        w1 w1Var = this.f76762b;
        if (w1Var == null || w1Var.f157163c.d()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w1 w1Var = this.f76762b;
        if (w1Var != null) {
            b2 b2Var = w1Var.f157164d;
            b2Var.getClass();
            int i10 = configuration.orientation;
            if (i10 != b2Var.f147018c) {
                Iterator it = b2Var.f147016a.iterator();
                if (it.hasNext()) {
                    a2.a(it.next());
                    throw null;
                }
                b2Var.f147018c = i10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        Long lValueOf;
        z9 z9Var;
        Throwable th2;
        h2 h2VarA;
        AdActivity adActivity;
        w1 w1Var;
        super.onCreate(bundle);
        b2 b2Var = new b2(this);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        Intent intent = getIntent();
        w2 w2Var = null;
        if (intent == null) {
            h2VarA = null;
        } else {
            Window window = getWindow();
            Object obj = z1.f158558b;
            z1 z1VarA = y1.a();
            try {
                if (intent.hasExtra("data_identifier")) {
                    long longExtra = intent.getLongExtra("data_identifier", -1L);
                    lValueOf = Long.valueOf(longExtra);
                    if (longExtra == -1) {
                        lValueOf = null;
                    }
                } else {
                    lValueOf = null;
                }
            } catch (Exception unused) {
                boolean z10 = ad1.f146762a;
            }
            x1 x1VarA = lValueOf != null ? z1VarA.a(lValueOf.longValue()) : null;
            if (x1VarA != null) {
                try {
                    z9Var = x1VarA.f157611c;
                } catch (Exception unused2) {
                    boolean z11 = ad1.f146762a;
                    z9Var = null;
                }
            } else {
                z9Var = null;
            }
            q2 q2Var = new q2(this, z9Var);
            k2 k2VarA = k2.f151362b.a();
            synchronized (k2VarA) {
                try {
                    String stringExtra = intent.getStringExtra("window_type");
                    if (stringExtra != null) {
                        try {
                            i2 i2Var = (i2) k2VarA.f151364a.get(stringExtra);
                            if (i2Var != null) {
                                h2VarA = i2Var.a(this, relativeLayout, q2Var, b2Var, intent, window, x1VarA);
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    }
                    h2VarA = null;
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        }
        if (h2VarA != null) {
            adActivity = this;
            w1Var = new w1(adActivity, relativeLayout, h2VarA, b2Var, new hl3());
        } else {
            adActivity = this;
            w1Var = null;
        }
        adActivity.f76762b = w1Var;
        if (w1Var != null) {
            w1Var.f157163c.f();
            w1Var.f157163c.c();
            RelativeLayout relativeLayout2 = w1Var.f157162b;
            w1Var.f157165e.getClass();
            relativeLayout2.setTag(hl3.a("root_layout"));
            w1Var.f157161a.setContentView(w1Var.f157162b);
            w2Var = w2.f79517a;
        }
        if (w2Var == null) {
            finish();
        }
        fa2 fa2VarA = ia2.a(this, adActivity.f76762b);
        adActivity.f76761a = fa2VarA;
        if (fa2VarA != null) {
            fa2VarA.a();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        w1 w1Var = this.f76762b;
        if (w1Var != null) {
            w1Var.f157163c.onAdClosed();
            w1Var.f157163c.g();
            w1Var.f157162b.removeAllViews();
        }
        fa2 fa2Var = this.f76761a;
        if (fa2Var != null) {
            fa2Var.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        w1 w1Var = this.f76762b;
        if (w1Var != null) {
            w1Var.f157163c.b();
            Iterator it = w1Var.f157164d.f147017b.iterator();
            while (it.hasNext()) {
                ((c2) it.next()).b();
            }
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        w1 w1Var = this.f76762b;
        if (w1Var != null) {
            w1Var.f157163c.a();
            Iterator it = w1Var.f157164d.f147017b.iterator();
            while (it.hasNext()) {
                ((c2) it.next()).a();
            }
        }
    }
}
