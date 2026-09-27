package v0;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f139831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f139832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f139833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f139834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f139835e;

    public void a(View view) {
        this.f139832b = view.getLeft();
        this.f139833c = view.getTop();
        this.f139834d = view.getRight();
        this.f139835e = view.getBottom();
        this.f139831a = view.getRotation();
    }

    public int b() {
        return this.f139835e - this.f139833c;
    }

    public int c() {
        return this.f139834d - this.f139832b;
    }
}
