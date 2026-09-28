package defpackage;

import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class qa80 {
    public final Region a = new Region();

    public final owo a() {
        Rect bounds = this.a.getBounds();
        return new owo(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    public final void b(owo owoVar) {
        this.a.set(owoVar.a, owoVar.b, owoVar.c, owoVar.d);
    }
}
