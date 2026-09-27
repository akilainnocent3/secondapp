package eo;

import android.graphics.drawable.Drawable;
import go.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f81418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f81419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f81420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f81421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f81422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f81423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f81424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f81425h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f81426i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f81427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f81428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f81429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f81430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f81431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f81432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f81433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b.d f81434q;

    public a(b.d calendarBuilder) {
        this.f81434q = calendarBuilder;
    }

    public a a(int textColorNormal, int textColorSelected) {
        this.f81431n = textColorNormal;
        this.f81432o = textColorSelected;
        return this;
    }

    public a b(int textColorNormal, int textColorSelected) {
        this.f81429l = textColorNormal;
        this.f81430m = textColorSelected;
        return this;
    }

    public a c(int textColorNormal, int textColorSelected) {
        this.f81427j = textColorNormal;
        this.f81428k = textColorSelected;
        return this;
    }

    public c d() {
        c cVar = new c(this.f81418a, this.f81419b, this.f81420c, this.f81421d);
        cVar.l(this.f81422e);
        cVar.k(this.f81423f);
        cVar.j(this.f81424g);
        cVar.o(this.f81425h);
        cVar.n(this.f81426i);
        return cVar;
    }

    public go.b e() {
        return new go.b(this.f81427j, this.f81429l, this.f81431n, null);
    }

    public go.b f() {
        return new go.b(this.f81428k, this.f81430m, this.f81432o, this.f81433p);
    }

    public b.d g() {
        if (this.f81423f == null) {
            this.f81423f = c.f87208n;
        }
        if (this.f81422e == null && this.f81425h) {
            this.f81422e = c.f87207m;
        }
        if (this.f81424g == null && this.f81426i) {
            this.f81424g = c.f87209o;
        }
        return this.f81434q;
    }

    public a h(String format) {
        this.f81424g = format;
        return this;
    }

    public a i(String format) {
        this.f81423f = format;
        return this;
    }

    public a j(String format) {
        this.f81422e = format;
        return this;
    }

    public a k(Drawable background) {
        this.f81433p = background;
        return this;
    }

    public a l(Integer selectorColor) {
        this.f81421d = selectorColor;
        return this;
    }

    public a m(boolean value) {
        this.f81426i = value;
        return this;
    }

    public a n(boolean value) {
        this.f81425h = value;
        return this;
    }

    public a o(float size) {
        this.f81420c = size;
        return this;
    }

    public a p(float size) {
        this.f81419b = size;
        return this;
    }

    public a q(float size) {
        this.f81418a = size;
        return this;
    }

    public a r(int textColorNormal, int textColorSelected) {
        this.f81427j = textColorNormal;
        this.f81429l = textColorNormal;
        this.f81431n = textColorNormal;
        this.f81428k = textColorSelected;
        this.f81430m = textColorSelected;
        this.f81432o = textColorSelected;
        return this;
    }

    public a s(float sizeTopText, float sizeMiddleText, float sizeBottomText) {
        this.f81418a = sizeTopText;
        this.f81419b = sizeMiddleText;
        this.f81420c = sizeBottomText;
        return this;
    }
}
