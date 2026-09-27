package r;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f123312a;

    public a(Context context) {
        this.f123312a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f123312a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f123312a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f123312a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f123312a.getResources().getDimensionPixelSize(m.a.e.f105606k);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f123312a.obtainStyledAttributes(null, m.a.m.f105987a, m.a.b.f105419f, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(m.a.m.f106109o, 0);
        Resources resources = this.f123312a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(m.a.e.f105604j));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f123312a.getResources().getBoolean(m.a.c.f105532a);
    }

    public boolean h() {
        return true;
    }
}
