package yads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d1 implements l1, hq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f147986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f147987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f147988c;

    public d1(e1 e1Var) {
        this.f147986a = e1Var;
    }

    public final void a(Activity activity, Bundle bundle) {
        String string;
        Objects.toString(activity);
        boolean z10 = ad1.f146762a;
        if (bundle == null || (string = bundle.getString("monetization_ads_activity_id")) == null || !kotlin.jvm.internal.m0.g(string, this.f147988c)) {
            return;
        }
        this.f147986a.b();
    }

    @Override // yads.l1
    public final void b(Activity activity) {
        Objects.toString(activity);
        boolean z10 = ad1.f146762a;
        Object obj = dw2.f148384j;
        nt2 nt2VarA = cw2.a().a(activity);
        boolean z11 = false;
        boolean z12 = nt2VarA != null && nt2VarA.i();
        Intent intent = activity.getIntent();
        if (intent != null && intent.getBooleanExtra("monetization_ads_activity_click", false)) {
            z11 = true;
        }
        WeakReference weakReference = this.f147987b;
        if ((weakReference == null || !kotlin.jvm.internal.m0.g(activity, (Activity) weakReference.get()) || z12) && (!z12 || z11)) {
            return;
        }
        this.f147986a.b();
    }

    @Override // yads.l1
    public final void a(Activity activity) {
        Objects.toString(activity);
        boolean z10 = ad1.f146762a;
        if (this.f147987b == null) {
            this.f147987b = new WeakReference(activity);
        }
    }

    public final void b(Activity activity, Bundle bundle) {
        WeakReference weakReference;
        Objects.toString(activity);
        boolean z10 = ad1.f146762a;
        if (bundle == null || (weakReference = this.f147987b) == null || !kotlin.jvm.internal.m0.g(activity, (Activity) weakReference.get())) {
            return;
        }
        String string = UUID.randomUUID().toString();
        this.f147988c = string;
        bundle.putString("monetization_ads_activity_id", string);
    }
}
