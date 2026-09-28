package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class m150 implements e5f0 {
    public final /* synthetic */ ueb0 a;
    public final /* synthetic */ ueb0 b;
    public final /* synthetic */ ueb0 c;
    public final /* synthetic */ ueb0 d;
    public final /* synthetic */ ueb0 e;
    public final /* synthetic */ ueb0 f;
    public final /* synthetic */ n150 i;

    public m150(ueb0 ueb0Var, ueb0 ueb0Var2, ueb0 ueb0Var3, ueb0 ueb0Var4, ueb0 ueb0Var5, ueb0 ueb0Var6, n150 n150Var) {
        this.a = ueb0Var;
        this.b = ueb0Var2;
        this.c = ueb0Var3;
        this.d = ueb0Var4;
        this.e = ueb0Var5;
        this.f = ueb0Var6;
        this.i = n150Var;
    }

    @Override // defpackage.e5f0
    public final void a(u7n u7nVar) {
        Drawable drawableA;
        AppCompatImageView appCompatImageView = this.a.b;
        if (u7nVar != null) {
            Resources resources = this.b.a.getContext().getResources();
            resources.getClass();
            drawableA = zbn.a(u7nVar, resources);
        } else {
            drawableA = null;
        }
        appCompatImageView.setImageDrawable(drawableA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e5f0
    public final void b(u7n u7nVar) {
        ueb0 ueb0Var = this.e;
        AppCompatImageView appCompatImageView = ueb0Var.d;
        if (u7nVar.c() > u7nVar.b()) {
            AppCompatImageView appCompatImageView2 = ueb0Var.b;
            Resources resources = this.f.a.getContext().getResources();
            resources.getClass();
            appCompatImageView2.setImageDrawable(zbn.a(u7nVar, resources));
            appCompatImageView.setVisibility(8);
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) u7nVar).getBitmap();
        n150 n150Var = this.i;
        n150Var.v = ej5.c(lrn.b(n150Var.e), null, null, new l150(ueb0Var, bitmap, null), 3);
        appCompatImageView.setImageDrawable((Drawable) u7nVar);
        appCompatImageView.setVisibility(0);
    }

    @Override // defpackage.e5f0
    public final void c(u7n u7nVar) {
        Drawable drawableA;
        AppCompatImageView appCompatImageView = this.c.b;
        if (u7nVar != null) {
            Resources resources = this.d.a.getContext().getResources();
            resources.getClass();
            drawableA = zbn.a(u7nVar, resources);
        } else {
            drawableA = null;
        }
        appCompatImageView.setImageDrawable(drawableA);
    }
}
