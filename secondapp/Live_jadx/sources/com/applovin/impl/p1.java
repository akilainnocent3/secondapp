package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.sdk.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p1 extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r1 f28250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.l f28251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f28252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Button f28253d;

    private void b() {
        x2 x2Var = new x2();
        x2Var.a(this.f28251b.z().a(this.f28250a));
        String strB = this.f28251b.z().b(this.f28250a);
        if (strB != null) {
            x2Var.a("\nBid Response Preview:\n");
            x2Var.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f28252c = textView;
        textView.setText(x2Var.toString());
        this.f28252c.setTextColor(-16777216);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f28250a.d() + " - " + this.f28250a.f());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        g8.a(findViewById(android.R.id.content), this.f28251b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f28253d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.ed
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26878b.a(view);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f28251b.z().a(this.f28250a, (Context) this, false);
        return true;
    }

    public void a(r1 r1Var, com.applovin.impl.sdk.l lVar) {
        this.f28250a = r1Var;
        this.f28251b = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f28251b.z().a(this.f28250a, (Context) this, true);
    }

    private boolean a() {
        return (this.f28250a == null || this.f28251b == null) ? false : true;
    }
}
