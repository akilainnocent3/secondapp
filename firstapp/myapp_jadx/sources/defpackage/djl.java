package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class djl implements e5f0 {
    public final /* synthetic */ peb0 a;
    public final /* synthetic */ peb0 b;
    public final /* synthetic */ peb0 c;
    public final /* synthetic */ peb0 d;
    public final /* synthetic */ peb0 e;
    public final /* synthetic */ peb0 f;
    public final /* synthetic */ ejl i;

    public djl(peb0 peb0Var, peb0 peb0Var2, peb0 peb0Var3, peb0 peb0Var4, peb0 peb0Var5, peb0 peb0Var6, ejl ejlVar) {
        this.a = peb0Var;
        this.b = peb0Var2;
        this.c = peb0Var3;
        this.d = peb0Var4;
        this.e = peb0Var5;
        this.f = peb0Var6;
        this.i = ejlVar;
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
        peb0 peb0Var = this.e;
        AppCompatImageView appCompatImageView = peb0Var.f;
        if (u7nVar.c() > u7nVar.b()) {
            AppCompatImageView appCompatImageView2 = peb0Var.b;
            Resources resources = this.f.a.getContext().getResources();
            resources.getClass();
            appCompatImageView2.setImageDrawable(zbn.a(u7nVar, resources));
            appCompatImageView.setVisibility(8);
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) u7nVar).getBitmap();
        ejl ejlVar = this.i;
        ejlVar.v = ej5.c(lrn.b(ejlVar.e), null, null, new cjl(peb0Var, bitmap, null), 3);
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
