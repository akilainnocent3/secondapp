package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class aw2 implements e5f0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ pgd0 b;

    public aw2(Context context, pgd0 pgd0Var) {
        this.a = context;
        this.b = pgd0Var;
    }

    @Override // defpackage.e5f0
    public final void b(u7n u7nVar) {
        Resources resources = this.a.getResources();
        resources.getClass();
        this.b.L.setCompoundDrawablesRelativeWithIntrinsicBounds(zbn.a(u7nVar, resources), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // defpackage.e5f0
    public final void a(u7n u7nVar) {
    }

    @Override // defpackage.e5f0
    public final void c(u7n u7nVar) {
    }
}
