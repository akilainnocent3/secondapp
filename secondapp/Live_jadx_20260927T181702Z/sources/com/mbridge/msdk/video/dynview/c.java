package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f70692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f70693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f70695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f70696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f70697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f70698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f70699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f70700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f70701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f70702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<String> f70703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f70704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f70705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f70706o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f70707p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f70708q;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements InterfaceC0700c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f70709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f70710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f70711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f70712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f70713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f70714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f70715g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f70716h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f70717i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f70718j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f70719k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<String> f70720l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f70721m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f70722n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f70723o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f70724p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f70725q;

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public c build() {
            return new c(this);
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c fileDirs(List<String> list) {
            this.f70720l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c orientation(int i10) {
            this.f70714f = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c a(Context context) {
            this.f70709a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c b(int i10) {
            this.f70711c = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c c(String str) {
            this.f70710b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c d(int i10) {
            this.f70721m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c e(int i10) {
            this.f70724p = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c f(int i10) {
            this.f70723o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c a(float f10) {
            this.f70713e = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c b(float f10) {
            this.f70712d = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c c(int i10) {
            this.f70715g = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c a(View view) {
            this.f70716h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c b(String str) {
            this.f70725q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c a(List<CampaignEx> list) {
            this.f70717i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c a(int i10) {
            this.f70718j = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c a(boolean z10) {
            this.f70719k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0700c
        public InterfaceC0700c a(String str) {
            this.f70722n = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0700c {
        InterfaceC0700c a(float f10);

        InterfaceC0700c a(int i10);

        InterfaceC0700c a(Context context);

        InterfaceC0700c a(View view);

        InterfaceC0700c a(String str);

        InterfaceC0700c a(List<CampaignEx> list);

        InterfaceC0700c a(boolean z10);

        InterfaceC0700c b(float f10);

        InterfaceC0700c b(int i10);

        InterfaceC0700c b(String str);

        c build();

        InterfaceC0700c c(int i10);

        InterfaceC0700c c(String str);

        InterfaceC0700c d(int i10);

        InterfaceC0700c e(int i10);

        InterfaceC0700c f(int i10);

        InterfaceC0700c fileDirs(List<String> list);

        InterfaceC0700c orientation(int i10);
    }

    public static b a() {
        return new b();
    }

    public List<CampaignEx> b() {
        return this.f70700i;
    }

    public Context c() {
        return this.f70692a;
    }

    public List<String> d() {
        return this.f70703l;
    }

    public int e() {
        return this.f70706o;
    }

    public String f() {
        return this.f70693b;
    }

    public int g() {
        return this.f70694c;
    }

    public int h() {
        return this.f70697f;
    }

    public View i() {
        return this.f70699h;
    }

    public int j() {
        return this.f70698g;
    }

    public float k() {
        return this.f70695d;
    }

    public int l() {
        return this.f70701j;
    }

    public float m() {
        return this.f70696e;
    }

    public String n() {
        return this.f70708q;
    }

    public int o() {
        return this.f70707p;
    }

    public boolean p() {
        return this.f70702k;
    }

    private c(b bVar) {
        this.f70696e = bVar.f70713e;
        this.f70695d = bVar.f70712d;
        this.f70697f = bVar.f70714f;
        this.f70698g = bVar.f70715g;
        this.f70692a = bVar.f70709a;
        this.f70693b = bVar.f70710b;
        this.f70694c = bVar.f70711c;
        this.f70699h = bVar.f70716h;
        this.f70700i = bVar.f70717i;
        this.f70701j = bVar.f70718j;
        this.f70702k = bVar.f70719k;
        this.f70703l = bVar.f70720l;
        this.f70704m = bVar.f70721m;
        this.f70705n = bVar.f70722n;
        this.f70706o = bVar.f70723o;
        this.f70707p = bVar.f70724p;
        this.f70708q = bVar.f70725q;
    }
}
