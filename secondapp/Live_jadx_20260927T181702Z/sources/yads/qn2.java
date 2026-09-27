package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qn2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final un2 f154529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f154530c;

    public qn2(un2 un2Var, Bitmap bitmap) {
        this.f154529b = un2Var;
        this.f154530c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f154529b.setBackground(new BitmapDrawable(this.f154529b.getResources(), this.f154530c));
        this.f154529b.setVisibility(0);
    }
}
