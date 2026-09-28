package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes8.dex */
public final class gig0 extends ujc<thk> {
    public final /* synthetic */ ImageView d;

    public gig0(ImageView imageView) {
        this.d = imageView;
    }

    @Override // defpackage.d5f0
    public final void e(Object obj) {
        thk thkVar = (thk) obj;
        thkVar.b(1);
        this.d.setImageDrawable(thkVar);
        thkVar.start();
    }

    @Override // defpackage.d5f0
    public final void h(Drawable drawable) {
        this.d.setImageDrawable(null);
    }
}
