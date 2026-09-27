package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h7 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f27193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f27194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u2 f27195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f27196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListView f27197e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends u2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f27198e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f27198e = list;
        }

        @Override // com.applovin.impl.u2
        public t2 a() {
            return new t2.b(t2.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.u2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.u2
        public List c(int i10) {
            return h7.this.f27196d;
        }

        @Override // com.applovin.impl.u2
        public int d(int i10) {
            return this.f27198e.size();
        }

        @Override // com.applovin.impl.u2
        public t2 e(int i10) {
            return new x4("TEST MODE NETWORKS");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f27200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.l f27201b;

        public b(List list, com.applovin.impl.sdk.l lVar) {
            this.f27200a = list;
            this.f27201b = lVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            List listU = ((g3) this.f27200a.get(l2Var.a())).u();
            if (listU.equals(this.f27201b.u0().b())) {
                this.f27201b.u0().a((List) null);
            } else {
                this.f27201b.u0().a(listU);
            }
            h7.this.f27195c.notifyDataSetChanged();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends b4 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ g3 f27203p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g3 g3Var, Context context, g3 g3Var2) {
            super(g3Var, context);
            this.f27203p = g3Var2;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public int d() {
            if (this.f27203p.u().equals(h7.this.f27193a.u0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public int e() {
            if (this.f27203p.u().equals(h7.this.f27193a.u0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.t2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f27203p.g(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    public h7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f27193a;
    }

    public void initialize(List<g3> list, com.applovin.impl.sdk.l lVar) {
        this.f27193a = lVar;
        this.f27194b = list;
        this.f27196d = a(list);
        a aVar = new a(this, list);
        this.f27195c = aVar;
        aVar.a(new b(list, lVar));
        this.f27195c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f27197e = listView;
        listView.setAdapter((ListAdapter) this.f27195c);
    }

    @Override // com.applovin.impl.p3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f27196d = a(this.f27194b);
        this.f27195c.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            arrayList.add(new c(g3Var, this, g3Var));
        }
        return arrayList;
    }
}
