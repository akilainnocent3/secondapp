package yads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ju0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f151258d = Color.parseColor("#66000000");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f151259e = Color.parseColor("#00000000");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f151260f = Color.parseColor("#7f7f7f");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f151261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y00 f151262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ku0 f151263c;

    public ju0(Context context, y00 y00Var, ku0 ku0Var) {
        this.f151261a = context;
        this.f151262b = y00Var;
        this.f151263c = ku0Var;
    }

    public static void a(FrameLayout frameLayout, GradientDrawable gradientDrawable, int i10) {
        frameLayout.setPadding(0, 0, 0, i10);
        frameLayout.setBackground(gradientDrawable);
    }
}
