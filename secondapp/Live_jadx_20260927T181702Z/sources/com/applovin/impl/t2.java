package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected c f29200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f29201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected SpannedString f29202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected SpannedString f29203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f29204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f29205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f29206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f29207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f29208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f29209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f29210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f29211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f29212m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f29213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f29214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SpannedString f29215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        SpannedString f29216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f29217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f29218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f29219g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f29220h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f29221i = -16777216;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f29222j = -16777216;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f29223k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f29224l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f29225m;

        public b(c cVar) {
            this.f29213a = cVar;
        }

        public b a(boolean z10) {
            this.f29214b = z10;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f29215c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.f29216d = spannedString;
            return this;
        }

        public b b(String str) {
            this.f29217e = str;
            return this;
        }

        public b a(String str) {
            this.f29218f = str;
            return this;
        }

        public b b(int i10) {
            this.f29224l = i10;
            return this;
        }

        public b c(int i10) {
            this.f29222j = i10;
            return this;
        }

        public b d(int i10) {
            this.f29221i = i10;
            return this;
        }

        public b a(int i10) {
            this.f29220h = i10;
            return this;
        }

        public b b(boolean z10) {
            this.f29225m = z10;
            return this;
        }

        public b a(Context context) {
            this.f29220h = R.drawable.applovin_ic_disclosure_arrow;
            this.f29224l = context.getColor(R.color.applovin_sdk_disclosureButtonColor);
            return this;
        }

        public t2 a() {
            int i10;
            if (this.f29214b && (i10 = this.f29220h) != 0 && i10 != R.drawable.applovin_ic_disclosure_arrow) {
                this.f29221i = -16776961;
            }
            return new t2(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29233a;

        c(int i10) {
            this.f29233a = i10;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return android.R.layout.simple_list_item_1;
            }
            return this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f29233a;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f29205f;
    }

    public String c() {
        return this.f29204e;
    }

    public int d() {
        return this.f29207h;
    }

    public int e() {
        return this.f29211l;
    }

    public SpannedString f() {
        return this.f29203d;
    }

    public int g() {
        return this.f29209j;
    }

    public int h() {
        return this.f29206g;
    }

    public int i() {
        return this.f29210k;
    }

    public int j() {
        return this.f29200a.b();
    }

    public SpannedString k() {
        return this.f29202c;
    }

    public int l() {
        return this.f29208i;
    }

    public int m() {
        return this.f29200a.c();
    }

    public boolean o() {
        return this.f29201b;
    }

    public boolean p() {
        return this.f29212m;
    }

    public t2(c cVar) {
        this.f29206g = 0;
        this.f29207h = 0;
        this.f29208i = -16777216;
        this.f29209j = -16777216;
        this.f29210k = 0;
        this.f29211l = 0;
        this.f29200a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    private t2(b bVar) {
        this.f29206g = 0;
        this.f29207h = 0;
        this.f29208i = -16777216;
        this.f29209j = -16777216;
        this.f29210k = 0;
        this.f29211l = 0;
        this.f29200a = bVar.f29213a;
        this.f29201b = bVar.f29214b;
        this.f29202c = bVar.f29215c;
        this.f29203d = bVar.f29216d;
        this.f29204e = bVar.f29217e;
        this.f29205f = bVar.f29218f;
        this.f29206g = bVar.f29219g;
        this.f29207h = bVar.f29220h;
        this.f29208i = bVar.f29221i;
        this.f29209j = bVar.f29222j;
        this.f29210k = bVar.f29223k;
        this.f29211l = bVar.f29224l;
        this.f29212m = bVar.f29225m;
    }
}
