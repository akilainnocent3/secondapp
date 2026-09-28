package defpackage;

import android.content.res.Resources;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class kgw implements e5f0 {
    public final /* synthetic */ lid0 a;
    public final /* synthetic */ ngw b;
    public final /* synthetic */ boolean c;

    public kgw(lid0 lid0Var, ngw ngwVar, boolean z) {
        this.a = lid0Var;
        this.b = ngwVar;
        this.c = z;
    }

    @Override // defpackage.e5f0
    public final void b(u7n u7nVar) {
        lid0 lid0Var = this.a;
        AppCompatImageView appCompatImageView = lid0Var.i;
        ngw ngwVar = this.b;
        Resources resources = ngwVar.a().getResources();
        resources.getClass();
        appCompatImageView.setImageDrawable(zbn.a(u7nVar, resources));
        lid0Var.i.setColorFilter(this.c ? ((Number) ngwVar.i.getValue()).intValue() : ((Number) ngwVar.w.getValue()).intValue());
    }

    @Override // defpackage.e5f0
    public final void a(u7n u7nVar) {
    }

    @Override // defpackage.e5f0
    public final void c(u7n u7nVar) {
    }
}
