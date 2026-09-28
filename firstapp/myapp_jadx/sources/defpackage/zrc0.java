package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment;

/* JADX INFO: loaded from: classes5.dex */
public final class zrc0 implements e5f0 {
    public final /* synthetic */ keb0 a;
    public final /* synthetic */ SportyNewsArticleDetailFragment b;
    public final /* synthetic */ keb0 c;
    public final /* synthetic */ keb0 d;

    public zrc0(keb0 keb0Var, SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment, keb0 keb0Var2, keb0 keb0Var3) {
        this.a = keb0Var;
        this.b = sportyNewsArticleDetailFragment;
        this.c = keb0Var2;
        this.d = keb0Var3;
    }

    @Override // defpackage.e5f0
    public final void a(u7n u7nVar) {
        Drawable drawableA;
        AppCompatImageView appCompatImageView = this.a.d;
        if (u7nVar != null) {
            ohp<Object>[] ohpVarArr = SportyNewsArticleDetailFragment.N;
            Resources resources = this.b.m0().a.getContext().getResources();
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
        int iC = u7nVar.c();
        int iB = u7nVar.b();
        SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment = this.b;
        keb0 keb0Var = this.d;
        if (iC <= iB) {
            sportyNewsArticleDetailFragment.D = ej5.c(ebs.a(sportyNewsArticleDetailFragment.getLifecycle()), null, null, new yrc0(keb0Var, ((BitmapDrawable) u7nVar).getBitmap(), null), 3);
            keb0Var.B.setImageDrawable((Drawable) u7nVar);
            keb0Var.B.setVisibility(0);
            return;
        }
        AppCompatImageView appCompatImageView = keb0Var.d;
        ohp<Object>[] ohpVarArr = SportyNewsArticleDetailFragment.N;
        Resources resources = sportyNewsArticleDetailFragment.m0().a.getContext().getResources();
        resources.getClass();
        appCompatImageView.setImageDrawable(zbn.a(u7nVar, resources));
        keb0Var.B.setVisibility(8);
    }

    @Override // defpackage.e5f0
    public final void c(u7n u7nVar) {
        Drawable drawableA;
        AppCompatImageView appCompatImageView = this.c.d;
        if (u7nVar != null) {
            ohp<Object>[] ohpVarArr = SportyNewsArticleDetailFragment.N;
            Resources resources = this.b.m0().a.getContext().getResources();
            resources.getClass();
            drawableA = zbn.a(u7nVar, resources);
        } else {
            drawableA = null;
        }
        appCompatImageView.setImageDrawable(drawableA);
    }
}
