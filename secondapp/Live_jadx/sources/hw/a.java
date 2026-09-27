package hw;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public String f88575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final Drawable f88576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public RectF f88577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88578d;

    public a(@l String title, @l Drawable icon, @l RectF rect, int i10) {
        m0.q(title, "title");
        m0.q(icon, "icon");
        m0.q(rect, "rect");
        this.f88575a = title;
        this.f88576b = icon;
        this.f88577c = rect;
        this.f88578d = i10;
    }

    public static /* synthetic */ a f(a aVar, String str, Drawable drawable, RectF rectF, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f88575a;
        }
        if ((i11 & 2) != 0) {
            drawable = aVar.f88576b;
        }
        if ((i11 & 4) != 0) {
            rectF = aVar.f88577c;
        }
        if ((i11 & 8) != 0) {
            i10 = aVar.f88578d;
        }
        return aVar.e(str, drawable, rectF, i10);
    }

    @l
    public final String a() {
        return this.f88575a;
    }

    @l
    public final Drawable b() {
        return this.f88576b;
    }

    @l
    public final RectF c() {
        return this.f88577c;
    }

    public final int d() {
        return this.f88578d;
    }

    @l
    public final a e(@l String title, @l Drawable icon, @l RectF rect, int i10) {
        m0.q(title, "title");
        m0.q(icon, "icon");
        m0.q(rect, "rect");
        return new a(title, icon, rect, i10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m0.g(this.f88575a, aVar.f88575a) && m0.g(this.f88576b, aVar.f88576b) && m0.g(this.f88577c, aVar.f88577c) && this.f88578d == aVar.f88578d;
    }

    public final int g() {
        return this.f88578d;
    }

    @l
    public final Drawable h() {
        return this.f88576b;
    }

    public int hashCode() {
        String str = this.f88575a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Drawable drawable = this.f88576b;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        RectF rectF = this.f88577c;
        return ((iHashCode2 + (rectF != null ? rectF.hashCode() : 0)) * 31) + this.f88578d;
    }

    @l
    public final RectF i() {
        return this.f88577c;
    }

    @l
    public final String j() {
        return this.f88575a;
    }

    public final void k(int i10) {
        this.f88578d = i10;
    }

    public final void l(@l RectF rectF) {
        m0.q(rectF, "<set-?>");
        this.f88577c = rectF;
    }

    public final void m(@l String str) {
        m0.q(str, "<set-?>");
        this.f88575a = str;
    }

    @l
    public String toString() {
        return "BottomBarItem(title=" + this.f88575a + ", icon=" + this.f88576b + ", rect=" + this.f88577c + ", alpha=" + this.f88578d + j.f86771d;
    }

    public /* synthetic */ a(String str, Drawable drawable, RectF rectF, int i10, int i11, x xVar) {
        this(str, drawable, (i11 & 4) != 0 ? new RectF() : rectF, i10);
    }
}
