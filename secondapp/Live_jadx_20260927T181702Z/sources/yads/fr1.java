package yads;

import android.content.Context;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f149216a;

    public fr1(Context context) {
        this.f149216a = context;
    }

    public final String a(dr1 dr1Var) {
        int i10 = dr1Var == null ? -1 : er1.f148825a[dr1Var.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return this.f149216a.getString(R.string.invalid_mediation_adapter_version);
        }
        throw new dr.o0();
    }
}
