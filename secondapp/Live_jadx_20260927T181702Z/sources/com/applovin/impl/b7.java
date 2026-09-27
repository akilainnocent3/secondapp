package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b7 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f26597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u2 f26598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f26599c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f26600d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f26601e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f26602f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f26603g = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends u2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.u2
        public int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.u2
        public List c(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? b7.this.c() : b7.this.a();
        }

        @Override // com.applovin.impl.u2
        public int d(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.u2
        public t2 e(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? new x4("IAB TCF Parameters") : new x4("CMP CONFIGURATION");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c7 f26605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f26606b;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements com.applovin.impl.d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f26608a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f26609b;

            public a(String str, String str2) {
                this.f26608a = str;
                this.f26609b = str2;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f26608a, this.f26609b, b.this.f26606b);
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.b7$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C0261b implements com.applovin.impl.d.b {
            public C0261b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(b7.this.f26601e, b7.this.f26602f, b7.this.f26599c, b7.this.f26600d, b7.this.f26603g, b.this.f26606b);
            }
        }

        public b(c7 c7Var, com.applovin.impl.sdk.l lVar) {
            this.f26605a = c7Var;
            this.f26606b = lVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            String strA;
            String strC;
            if (l2Var.b() != e.IAB_TCF_PARAMETERS.ordinal()) {
                if (l2Var.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                    com.applovin.impl.d.a(b7.this, MaxDebuggerCmpNetworksListActivity.class, this.f26606b.e(), new C0261b());
                    return;
                } else {
                    q7.a(t2Var.c(), t2Var.b(), b7.this);
                    return;
                }
            }
            if (l2Var.a() == d.TC_STRING.ordinal()) {
                strA = b5.f26591x.a();
                strC = this.f26605a.j();
            } else {
                strA = b5.f26592y.a();
                strC = this.f26605a.c();
            }
            com.applovin.impl.d.a(b7.this, MaxDebuggerTcfStringActivity.class, this.f26606b.e(), new a(strA, strC));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f26597a;
    }

    public void initialize(List<d7> list, com.applovin.impl.sdk.l lVar) {
        this.f26597a = lVar;
        c7 c7VarT0 = lVar.t0();
        a(list);
        a aVar = new a(this);
        this.f26598b = aVar;
        aVar.a(new b(c7VarT0, lVar));
        this.f26598b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f26598b);
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u2 u2Var = this.f26598b;
        if (u2Var != null) {
            u2Var.a((u2.a) null);
        }
    }

    private void a(List list) {
        boolean zB = this.f26597a.t0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d7 d7Var = (d7) it.next();
            if (d7Var.f() == d7.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(d7Var.a())) {
                    a(d7Var, this.f26599c);
                } else {
                    a(d7Var, this.f26601e);
                }
            } else if (d7Var.f() != d7.a.ATP_NETWORK) {
                this.f26603g.add(d7Var);
            } else if (!zB) {
                this.f26603g.add(d7Var);
            } else if (Boolean.TRUE.equals(d7Var.a())) {
                a(d7Var, this.f26600d);
            } else {
                a(d7Var, this.f26602f);
            }
        }
    }

    private t2 b() {
        t2.b bVarA;
        String strA = b5.f26588u.a();
        Integer numE = this.f26597a.t0().e();
        if (StringUtils.isValidString(this.f26597a.t0().d())) {
            bVarA = t2.a(t2.c.RIGHT_DETAIL);
        } else {
            String str = "SharedPreferences value for key " + strA + " is " + numE + androidx.media3.session.fe.F;
            bVarA = t2.a(t2.c.DETAIL).b("Unknown CMP SDK ID").a("Your integrated CMP might not be Google-certified. " + str + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(getColor(R.color.applovin_sdk_warningColor)).a(true);
        }
        bVarA.d(strA);
        bVarA.c(numE != null ? numE.toString() : "No value set");
        bVarA.c(numE != null ? -16777216 : p1.a.f120313c);
        return bVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer numG = this.f26597a.t0().g();
        String strJ = this.f26597a.t0().j();
        String strC = this.f26597a.t0().c();
        arrayList.add(a(b5.f26590w.a(), numG));
        arrayList.add(a(b5.f26591x.a(), strJ, !f7.b(strJ)));
        arrayList.add(a(b5.f26592y.a(), strC, false));
        return arrayList;
    }

    private void a(d7 d7Var, List list) {
        if (d7Var.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (d7Var.d().equals(((d7) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(d7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        String str;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f26601e.size() + this.f26602f.size();
        arrayList.add(b());
        arrayList.add(a(b5.f26589v.a(), this.f26597a.t0().f()));
        arrayList.add(t2.a(t2.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        t2.b bVarD = t2.a(t2.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            str = "Missing " + size + " network(s)";
        } else {
            str = "";
        }
        arrayList.add(bVarD.c(str).c(size > 0 ? p1.a.f120313c : -16777216).a(this).a(true).a());
        return arrayList;
    }

    private t2 a(String str, Integer num) {
        return t2.a(t2.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? -16777216 : p1.a.f120313c).a();
    }

    private t2 a(String str, String str2, boolean z10) {
        boolean zIsValidString = StringUtils.isValidString(str2);
        if (zIsValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        t2.b bVarD = t2.a(t2.c.DETAIL).d(str);
        if (!zIsValidString) {
            str2 = "No value set";
        }
        t2.b bVarA = bVarD.c(str2).c(z10 ? p1.a.f120313c : -16777216).a(zIsValidString);
        if (zIsValidString) {
            bVarA.a(this);
        }
        return bVarA.a();
    }
}
