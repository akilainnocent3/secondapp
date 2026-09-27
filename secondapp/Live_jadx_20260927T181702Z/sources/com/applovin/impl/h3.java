package com.applovin.impl;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h3 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i3 f27162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListView f27163b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements u2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g3 f27164a;

        /* JADX INFO: renamed from: com.applovin.impl.h3$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C0264a implements d.b {
            public C0264a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f27164a);
            }
        }

        public a(g3 g3Var) {
            this.f27164a = g3Var;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            if (l2Var.b() != i3.a.TEST_ADS.ordinal()) {
                q7.a(t2Var.c(), t2Var.b(), h3.this);
                return;
            }
            com.applovin.impl.sdk.l lVarO = this.f27164a.o();
            g3.b bVarY = this.f27164a.y();
            if (!h3.this.f27162a.a(l2Var)) {
                q7.a(t2Var.c(), t2Var.b(), h3.this);
                return;
            }
            if (g3.b.READY == bVarY) {
                d.a(h3.this, MaxDebuggerMultiAdActivity.class, lVarO.e(), new C0264a());
            } else if (g3.b.DISABLED != bVarY) {
                q7.a(t2Var.c(), t2Var.b(), h3.this);
            } else {
                lVarO.u0().a();
                q7.a(t2Var.c(), t2Var.b(), h3.this);
            }
        }
    }

    public h3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        i3 i3Var = this.f27162a;
        if (i3Var != null) {
            return i3Var.h().o();
        }
        return null;
    }

    public void initialize(g3 g3Var) {
        setTitle(g3Var.g());
        i3 i3Var = new i3(g3Var, this);
        this.f27162a = i3Var;
        i3Var.a(new a(g3Var));
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f27163b = listView;
        listView.setAdapter((ListAdapter) this.f27162a);
    }

    @Override // com.applovin.impl.p3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f27162a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f27162a.k();
            this.f27162a.c();
        }
    }
}
