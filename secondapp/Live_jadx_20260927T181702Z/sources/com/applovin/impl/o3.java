package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerAxonEventsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o3 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q3 f28170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSetObserver f28171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f28172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ListView f28173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.a f28174e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            o3.this.a();
            o3 o3Var = o3.this;
            o3Var.b((Context) o3Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.c f28176a;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements com.applovin.impl.d.b {
            public a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(o3.this.f28170a.u());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.o3$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C0269b implements com.applovin.impl.d.b {
            public C0269b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(o3.this.f28170a.d(), o3.this.f28170a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class c implements com.applovin.impl.d.b {
            public c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(o3.this.f28170a.d(), o3.this.f28170a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class d implements com.applovin.impl.d.b {
            public d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(o3.this.f28170a.f(), false, o3.this.f28170a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class e implements com.applovin.impl.d.b {
            public e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(o3.this.f28170a.k(), o3.this.f28170a.x(), o3.this.f28170a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class f implements com.applovin.impl.d.b {
            public f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(o3.this.f28170a.w(), o3.this.f28170a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class g implements com.applovin.impl.d.b {
            public g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(o3.this.f28170a.p(), true, o3.this.f28170a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class h implements com.applovin.impl.d.b {
            public h() {
            }

            @Override // com.applovin.impl.d.b
            public void a(g0 g0Var) {
                g0Var.initialize(o3.this.f28170a.u().G().getTrackedAxonEvents(), o3.this.f28170a.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class i implements com.applovin.impl.d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t2 f28186a;

            public i(t2 t2Var) {
                this.f28186a = t2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((b4) this.f28186a).r());
            }
        }

        public b(com.applovin.impl.c cVar) {
            this.f28176a = cVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            int iB = l2Var.b();
            if (iB == q3.e.APP_INFO.ordinal()) {
                q7.a(t2Var.c(), t2Var.b(), o3.this);
                return;
            }
            if (iB == q3.e.MAX.ordinal()) {
                if (o3.this.f28170a.a(t2Var)) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerUnifiedFlowActivity.class, this.f28176a, new a());
                    return;
                } else {
                    q7.a(t2Var.c(), t2Var.b(), o3.this);
                    return;
                }
            }
            if (iB == q3.e.PRIVACY.ordinal()) {
                if (l2Var.a() != q3.d.CMP.ordinal()) {
                    if (l2Var.a() == q3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        com.applovin.impl.d.a(o3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f28176a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(o3.this.f28170a.u().t0().j())) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerTcfInfoListActivity.class, this.f28176a, new C0269b());
                    return;
                } else {
                    q7.a(t2Var.c(), t2Var.b(), o3.this);
                    return;
                }
            }
            if (iB != q3.e.ADS.ordinal()) {
                if (iB == q3.e.EVENTS.ordinal()) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerAxonEventsListActivity.class, this.f28176a, new h());
                    return;
                } else {
                    if ((iB == q3.e.INCOMPLETE_NETWORKS.ordinal() || iB == q3.e.COMPLETED_NETWORKS.ordinal()) && (t2Var instanceof b4)) {
                        com.applovin.impl.d.a(o3.this, MaxDebuggerDetailActivity.class, this.f28176a, new i(t2Var));
                        return;
                    }
                    return;
                }
            }
            if (l2Var.a() == q3.b.AD_UNITS.ordinal()) {
                if (o3.this.f28170a.f().size() > 0) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerAdUnitsListActivity.class, this.f28176a, new d());
                    return;
                } else {
                    q7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", o3.this);
                    return;
                }
            }
            if (l2Var.a() == q3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (o3.this.f28170a.k().size() <= 0 && o3.this.f28170a.x().size() <= 0) {
                    q7.a("Complete Integrations", "Please complete integrations in order to access this.", o3.this);
                    return;
                } else if (o3.this.f28170a.u().u0().c()) {
                    q7.a("Restart Required", t2Var.b(), o3.this);
                    return;
                } else {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f28176a, new e());
                    return;
                }
            }
            if (l2Var.a() != q3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (l2Var.a() == q3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerAdUnitsListActivity.class, this.f28176a, new g());
                }
            } else if (!o3.this.f28170a.u().u0().c()) {
                o3.this.getSdk().u0().a();
                q7.a("Restart Required", t2Var.b(), o3.this);
            } else if (o3.this.f28170a.w().size() > 0) {
                com.applovin.impl.d.a(o3.this, MaxDebuggerTestModeNetworkActivity.class, this.f28176a, new f());
            } else {
                q7.a("Complete Integrations", "Please complete integrations in order to access this.", o3.this);
            }
        }
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, R.attr.progressBarStyleLarge);
        this.f28174e = aVar;
        aVar.setColor(-3355444);
        this.f28172c.addView(this.f28174e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f28172c.bringChildToFront(this.f28174e);
        this.f28174e.a();
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        q3 q3Var = this.f28170a;
        if (q3Var != null) {
            return q3Var.u();
        }
        return null;
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.f28172c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f28173d = listView;
        listView.setAdapter((ListAdapter) this.f28170a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q3 q3Var = this.f28170a;
        if (q3Var != null) {
            q3Var.unregisterDataSetObserver(this.f28171b);
            this.f28170a.a((u2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        q3 q3Var = this.f28170a;
        if (q3Var == null || !q3Var.z()) {
            return;
        }
        this.f28170a.c();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        q3 q3Var = this.f28170a;
        if (q3Var == null || q3Var.z()) {
            return;
        }
        c();
    }

    public void setListAdapter(q3 q3Var, c cVar) {
        DataSetObserver dataSetObserver;
        q3 q3Var2 = this.f28170a;
        if (q3Var2 != null && (dataSetObserver = this.f28171b) != null) {
            q3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f28170a = q3Var;
        this.f28171b = new a();
        b((Context) this);
        this.f28170a.registerDataSetObserver(this.f28171b);
        this.f28170a.a(new b(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.f28174e;
        if (aVar != null) {
            aVar.b();
            this.f28172c.removeView(this.f28174e);
            this.f28174e = null;
        }
    }

    private void b() {
        q3 q3Var = this.f28170a;
        if (q3Var == null) {
            return;
        }
        String strQ = q3Var.q();
        if (TextUtils.isEmpty(strQ)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ba.d1.f20912b);
        intent.putExtra("android.intent.extra.TEXT", strQ);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        q7.a(this.f28170a.i(), this.f28170a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context) {
        if (!StringUtils.isValidString(this.f28170a.h()) || this.f28170a.y()) {
            return;
        }
        this.f28170a.b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.wc
            @Override // java.lang.Runnable
            public final void run() {
                this.f29479b.a(context);
            }
        });
    }
}
