package yads;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ny {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f153254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gy1 f153256c;

    public ny(y00 y00Var, int i10, gy1 gy1Var) {
        this.f153254a = y00Var;
        this.f153255b = i10;
        this.f153256c = gy1Var;
    }

    public final ImageView a(View view, my myVar, a10 a10Var) {
        my myVar2;
        y00 y00Var = this.f153254a;
        a10 a10Var2 = y00Var.f158073c;
        a10 a10Var3 = y00Var.f158072b;
        if (a10Var2 != null) {
            myVar2 = my.f152754c;
        } else {
            myVar2 = a10Var3 != null ? my.f152753b : my.f152755d;
        }
        if (a10Var == null || myVar2 != myVar) {
            return null;
        }
        int i10 = a10Var.f146610c;
        int i11 = a10Var.f146611d;
        int i12 = this.f153255b;
        if (i12 > i10 || i12 > i11) {
            this.f153256c.getClass();
            return (ImageView) view.findViewById(R.id.icon_small);
        }
        this.f153256c.getClass();
        return (ImageView) view.findViewById(R.id.icon_large);
    }
}
