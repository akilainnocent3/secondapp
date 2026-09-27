package com.ironsource;

import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class J8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private F8 f59299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private View f59300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private View f59301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    private View f59302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.m
    private View f59303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    private View f59304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.m
    private View f59305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    private View f59306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.m
    private a f59307i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(@oy.l b bVar);

        void a(@oy.l pg pgVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        Title("title"),
        Advertiser(C4235d4.i.F0),
        Body("body"),
        Cta(C4235d4.i.G0),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(C4235d4.i.J0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f59316a;

        b(String str) {
            this.f59316a = str;
        }

        @oy.l
        public final String b() {
            return this.f59316a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements F8.a {
        public c() {
        }

        @Override // com.ironsource.F8.a
        public void a(@oy.l pg viewVisibilityParams) {
            kotlin.jvm.internal.m0.p(viewVisibilityParams, "viewVisibilityParams");
            a aVarN = J8.this.n();
            if (aVarN != null) {
                aVarN.a(viewVisibilityParams);
            }
        }
    }

    public J8(@oy.l F8 containerView, @oy.m View view, @oy.m View view2, @oy.m View view3, @oy.m View view4, @oy.m View view5, @oy.m View view6, @oy.l View privacyIconView) {
        kotlin.jvm.internal.m0.p(containerView, "containerView");
        kotlin.jvm.internal.m0.p(privacyIconView, "privacyIconView");
        this.f59299a = containerView;
        this.f59300b = view;
        this.f59301c = view2;
        this.f59302d = view3;
        this.f59303e = view4;
        this.f59304f = view5;
        this.f59305g = view6;
        this.f59306h = privacyIconView;
        r();
        s();
    }

    private final void r() {
        a(this, this.f59300b, b.Title);
        a(this, this.f59301c, b.Advertiser);
        a(this, this.f59303e, b.Body);
        a(this, this.f59305g, b.Cta);
        a(this, this.f59302d, b.Icon);
        a(this, this.f59299a, b.Container);
        a(this, this.f59306h, b.PrivacyIcon);
    }

    private final void s() {
        this.f59299a.setListener$mediationsdk_release(new c());
    }

    @oy.l
    public final F8 a() {
        return this.f59299a;
    }

    @oy.m
    public final View c() {
        return this.f59301c;
    }

    @oy.m
    public final View d() {
        return this.f59302d;
    }

    @oy.m
    public final View e() {
        return this.f59303e;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J8)) {
            return false;
        }
        J8 j10 = (J8) obj;
        return kotlin.jvm.internal.m0.g(this.f59299a, j10.f59299a) && kotlin.jvm.internal.m0.g(this.f59300b, j10.f59300b) && kotlin.jvm.internal.m0.g(this.f59301c, j10.f59301c) && kotlin.jvm.internal.m0.g(this.f59302d, j10.f59302d) && kotlin.jvm.internal.m0.g(this.f59303e, j10.f59303e) && kotlin.jvm.internal.m0.g(this.f59304f, j10.f59304f) && kotlin.jvm.internal.m0.g(this.f59305g, j10.f59305g) && kotlin.jvm.internal.m0.g(this.f59306h, j10.f59306h);
    }

    @oy.m
    public final View f() {
        return this.f59304f;
    }

    @oy.m
    public final View g() {
        return this.f59305g;
    }

    @oy.l
    public final View h() {
        return this.f59306h;
    }

    public int hashCode() {
        int iHashCode = this.f59299a.hashCode() * 31;
        View view = this.f59300b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f59301c;
        int iHashCode3 = (iHashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.f59302d;
        int iHashCode4 = (iHashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.f59303e;
        int iHashCode5 = (iHashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f59304f;
        int iHashCode6 = (iHashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.f59305g;
        return ((iHashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31) + this.f59306h.hashCode();
    }

    @oy.m
    public final View i() {
        return this.f59301c;
    }

    @oy.m
    public final View j() {
        return this.f59303e;
    }

    @oy.l
    public final F8 k() {
        return this.f59299a;
    }

    @oy.m
    public final View l() {
        return this.f59305g;
    }

    @oy.m
    public final View m() {
        return this.f59302d;
    }

    @oy.m
    public final a n() {
        return this.f59307i;
    }

    @oy.m
    public final View o() {
        return this.f59304f;
    }

    @oy.l
    public final View p() {
        return this.f59306h;
    }

    @oy.m
    public final View q() {
        return this.f59300b;
    }

    @oy.l
    public final JSONObject t() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("title", this.f59300b != null).put(C4235d4.i.F0, this.f59301c != null).put("body", this.f59303e != null).put(C4235d4.i.G0, this.f59305g != null).put("media", this.f59304f != null).put("icon", this.f59302d != null);
        kotlin.jvm.internal.m0.o(jSONObjectPut, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return jSONObjectPut;
    }

    @oy.l
    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f59299a + ", titleView=" + this.f59300b + ", advertiserView=" + this.f59301c + ", iconView=" + this.f59302d + ", bodyView=" + this.f59303e + ", mediaView=" + this.f59304f + ", ctaView=" + this.f59305g + ", privacyIconView=" + this.f59306h + gi.j.f86771d;
    }

    @oy.l
    public final J8 a(@oy.l F8 containerView, @oy.m View view, @oy.m View view2, @oy.m View view3, @oy.m View view4, @oy.m View view5, @oy.m View view6, @oy.l View privacyIconView) {
        kotlin.jvm.internal.m0.p(containerView, "containerView");
        kotlin.jvm.internal.m0.p(privacyIconView, "privacyIconView");
        return new J8(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    @oy.m
    public final View b() {
        return this.f59300b;
    }

    public final void c(@oy.m View view) {
        this.f59305g = view;
    }

    public final void d(@oy.m View view) {
        this.f59302d = view;
    }

    public final void e(@oy.m View view) {
        this.f59304f = view;
    }

    public final void f(@oy.l View view) {
        kotlin.jvm.internal.m0.p(view, "<set-?>");
        this.f59306h = view;
    }

    public final void g(@oy.m View view) {
        this.f59300b = view;
    }

    public static /* synthetic */ J8 a(J8 j10, F8 f10, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j10.f59299a;
        }
        if ((i10 & 2) != 0) {
            view = j10.f59300b;
        }
        if ((i10 & 4) != 0) {
            view2 = j10.f59301c;
        }
        if ((i10 & 8) != 0) {
            view3 = j10.f59302d;
        }
        if ((i10 & 16) != 0) {
            view4 = j10.f59303e;
        }
        if ((i10 & 32) != 0) {
            view5 = j10.f59304f;
        }
        if ((i10 & 64) != 0) {
            view6 = j10.f59305g;
        }
        if ((i10 & 128) != 0) {
            view7 = j10.f59306h;
        }
        View view8 = view6;
        View view9 = view7;
        View view10 = view4;
        View view11 = view5;
        return j10.a(f10, view, view2, view3, view10, view11, view8, view9);
    }

    public final void b(@oy.m View view) {
        this.f59303e = view;
    }

    public final void a(@oy.l F8 f10) {
        kotlin.jvm.internal.m0.p(f10, "<set-?>");
        this.f59299a = f10;
    }

    public final void a(@oy.m View view) {
        this.f59301c = view;
    }

    public final void a(@oy.m a aVar) {
        this.f59307i = aVar;
    }

    private static final void a(final J8 j10, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.li
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    J8.a(this.f62279b, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(J8 this$0, b viewName, View view) {
        kotlin.jvm.internal.m0.p(this$0, "this$0");
        kotlin.jvm.internal.m0.p(viewName, "$viewName");
        a aVar = this$0.f59307i;
        if (aVar != null) {
            aVar.a(viewName);
        }
    }

    public /* synthetic */ J8(F8 f10, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i10, kotlin.jvm.internal.x xVar) {
        this(f10, (i10 & 2) != 0 ? null : view, (i10 & 4) != 0 ? null : view2, (i10 & 8) != 0 ? null : view3, (i10 & 16) != 0 ? null : view4, (i10 & 32) != 0 ? null : view5, (i10 & 64) != 0 ? null : view6, view7);
    }
}
