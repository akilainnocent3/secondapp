package go;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f87203d;

    public b() {
    }

    public Drawable a() {
        return this.f87203d;
    }

    public int b() {
        return this.f87202c;
    }

    public int c() {
        return this.f87201b;
    }

    public int d() {
        return this.f87200a;
    }

    public b e(Drawable background) {
        this.f87203d = background;
        return this;
    }

    public b f(int colorBottomText) {
        this.f87202c = colorBottomText;
        return this;
    }

    public b g(int colorMiddleText) {
        this.f87201b = colorMiddleText;
        return this;
    }

    public b h(int colorTopText) {
        this.f87200a = colorTopText;
        return this;
    }

    public void i(b defaultValues) {
        if (defaultValues == null) {
            return;
        }
        if (this.f87200a == 0) {
            this.f87200a = defaultValues.f87200a;
        }
        if (this.f87201b == 0) {
            this.f87201b = defaultValues.f87201b;
        }
        if (this.f87202c == 0) {
            this.f87202c = defaultValues.f87202c;
        }
        if (this.f87203d == null) {
            this.f87203d = defaultValues.f87203d;
        }
    }

    public b(int textColor, Drawable background) {
        this(textColor, textColor, textColor, background);
    }

    public b(int colorTopText, int colorMiddleText, int colorBottomText, Drawable background) {
        this.f87200a = colorTopText;
        this.f87201b = colorMiddleText;
        this.f87202c = colorBottomText;
        this.f87203d = background;
    }
}
