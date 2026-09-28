package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.sportybet.android.multimaker.domain.model.MultiMakerSport;

/* JADX INFO: loaded from: classes4.dex */
public final class diw implements e5f0 {
    public final /* synthetic */ eiw a;
    public final /* synthetic */ sid0 b;
    public final /* synthetic */ MultiMakerSport c;

    public diw(eiw eiwVar, sid0 sid0Var, MultiMakerSport multiMakerSport) {
        this.a = eiwVar;
        this.b = sid0Var;
        this.c = multiMakerSport;
    }

    @Override // defpackage.e5f0
    public final void b(u7n u7nVar) {
        eiw eiwVar = this.a;
        Resources resources = eiwVar.a().getResources();
        resources.getClass();
        Drawable drawableA = zbn.a(u7nVar, resources);
        ImageView imageView = this.b.b;
        drawableA.setTint(this.c.d ? ((Number) eiwVar.c.getValue()).intValue() : ((Number) eiwVar.d.getValue()).intValue());
        imageView.setImageDrawable(drawableA);
    }

    @Override // defpackage.e5f0
    public final void a(u7n u7nVar) {
    }

    @Override // defpackage.e5f0
    public final void c(u7n u7nVar) {
    }
}
