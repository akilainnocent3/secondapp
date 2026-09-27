package com.cleveradssolutions.adapters.exchange.rendering.views.browser;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.core.ScrollDirection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends TableLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f42836k = "zr";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f42837l = Color.rgb(43, 47, 50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f42838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f42839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f42840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f42841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f42842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f42843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f42844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f42845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f42846j;

    public g(Context context, h hVar) {
        super(context);
        r(hVar);
    }

    public final /* synthetic */ void g() {
        Button button;
        int i10;
        h hVar = this.f42846j;
        if (hVar == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42836k, "updateNavigationButtonsState: Unable to update state. browserControlsEventsListener is null");
            return;
        }
        if (hVar.e()) {
            button = this.f42839c;
            i10 = com.cleveradssolutions.adapters.exchange.a.C0420a.f41996f;
        } else {
            button = this.f42839c;
            i10 = com.cleveradssolutions.adapters.exchange.a.C0420a.f41997g;
        }
        button.setBackgroundResource(i10);
        if (this.f42846j.c()) {
            this.f42840d.setBackgroundResource(com.cleveradssolutions.adapters.exchange.a.C0420a.f42000j);
        } else {
            this.f42840d.setBackgroundResource(com.cleveradssolutions.adapters.exchange.a.C0420a.f42001k);
        }
    }

    public final /* synthetic */ void h(View view) {
        h hVar = this.f42846j;
        if (hVar == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42836k, "Back button click failed: browserControlsEventsListener is null");
        } else {
            hVar.d();
        }
    }

    public final void i() {
        Button button = new Button(getContext());
        this.f42838b = button;
        button.setContentDescription("close");
        q(this.f42838b);
        this.f42838b.setBackgroundResource(com.cleveradssolutions.adapters.exchange.a.C0420a.f41998h);
        Button button2 = new Button(getContext());
        this.f42839c = button2;
        button2.setContentDescription(ScrollDirection.BACK);
        q(this.f42839c);
        this.f42839c.setBackgroundResource(com.cleveradssolutions.adapters.exchange.a.C0420a.f41997g);
        Button button3 = new Button(getContext());
        this.f42840d = button3;
        button3.setContentDescription("forth");
        q(this.f42840d);
        this.f42840d.setBackgroundResource(com.cleveradssolutions.adapters.exchange.a.C0420a.f42001k);
        Button button4 = new Button(getContext());
        this.f42841e = button4;
        button4.setContentDescription(ToolBar.REFRESH);
        q(this.f42841e);
        this.f42841e.setBackgroundResource(com.cleveradssolutions.adapters.exchange.a.C0420a.f42004n);
        Button button5 = new Button(getContext());
        this.f42842f = button5;
        button5.setContentDescription("openInExternalBrowser");
        q(this.f42842f);
        this.f42842f.setBackgroundResource(com.cleveradssolutions.adapters.exchange.a.C0420a.f42003m);
    }

    public final /* synthetic */ void j(View view) {
        h hVar = this.f42846j;
        if (hVar == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42836k, "Forward button click failed: browserControlsEventsListener is null");
        } else {
            hVar.b();
        }
    }

    public void k() {
        this.f42843g.setVisibility(0);
    }

    public final /* synthetic */ void l(View view) {
        h hVar = this.f42846j;
        if (hVar == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42836k, "Refresh button click failed: browserControlsEventsListener is null");
        } else {
            hVar.zz();
        }
    }

    public void m() {
        this.f42845i.post(new Runnable() { // from class: com.cleveradssolutions.adapters.exchange.rendering.views.browser.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f42835b.g();
            }
        });
    }

    public final /* synthetic */ void n(View view) {
        h hVar = this.f42846j;
        String strA = hVar != null ? hVar.a() : null;
        if (strA == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42836k, "Open external link failed. url is null");
        } else {
            s(strA);
        }
    }

    public final void o() {
        this.f42838b.setOnClickListener(new View.OnClickListener() { // from class: com.cleveradssolutions.adapters.exchange.rendering.views.browser.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42830b.p(view);
            }
        });
        this.f42839c.setOnClickListener(new View.OnClickListener() { // from class: com.cleveradssolutions.adapters.exchange.rendering.views.browser.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42831b.h(view);
            }
        });
        this.f42840d.setOnClickListener(new View.OnClickListener() { // from class: com.cleveradssolutions.adapters.exchange.rendering.views.browser.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42832b.j(view);
            }
        });
        this.f42841e.setOnClickListener(new View.OnClickListener() { // from class: com.cleveradssolutions.adapters.exchange.rendering.views.browser.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42833b.l(view);
            }
        });
        this.f42842f.setOnClickListener(new View.OnClickListener() { // from class: com.cleveradssolutions.adapters.exchange.rendering.views.browser.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42834b.n(view);
            }
        });
    }

    public final /* synthetic */ void p(View view) {
        h hVar = this.f42846j;
        if (hVar == null) {
            com.cleveradssolutions.adapters.exchange.b.a(f42836k, "Close button click failed: browserControlsEventsListener is null");
        } else {
            hVar.f();
        }
    }

    public final void q(Button button) {
        button.setHeight((int) (j.f42532b * 50.0f));
        button.setWidth((int) (j.f42532b * 50.0f));
    }

    public final void r(h hVar) {
        this.f42845i = new Handler(Looper.getMainLooper());
        this.f42846j = hVar;
        if (getContext() != null) {
            TableRow tableRow = new TableRow(getContext());
            this.f42843g = new LinearLayout(getContext());
            this.f42844h = new LinearLayout(getContext());
            this.f42843g.setVisibility(8);
            this.f42844h.setGravity(5);
            setBackgroundColor(f42837l);
            i();
            o();
            this.f42843g.addView(this.f42839c);
            this.f42843g.addView(this.f42840d);
            this.f42843g.addView(this.f42841e);
            this.f42843g.addView(this.f42842f);
            this.f42844h.addView(this.f42838b);
            tableRow.addView(this.f42843g, new TableRow.LayoutParams(-1, -1, 3.0f));
            tableRow.addView(this.f42844h, new TableRow.LayoutParams(-1, -1, 5.0f));
            addView(tableRow);
        }
    }

    public void s(String str) {
        try {
            com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.c.b(getContext(), str);
        } catch (Exception e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42836k, "Could not handle intent: " + str + " : " + Log.getStackTraceString(e10));
        }
    }
}
