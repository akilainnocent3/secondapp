package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.applovin.sdk.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e7 extends p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.l f26862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26864c;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ba.d1.f20912b);
        intent.putExtra("android.intent.extra.TEXT", this.f26864c);
        intent.putExtra("android.intent.extra.TITLE", this.f26863b);
        intent.putExtra("android.intent.extra.SUBJECT", this.f26863b);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.p3
    public com.applovin.impl.sdk.l getSdk() {
        return this.f26862a;
    }

    public void initialize(String str, String str2, com.applovin.impl.sdk.l lVar) {
        this.f26862a = lVar;
        this.f26863b = str;
        this.f26864c = str2;
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle(this.f26863b);
        ((TextView) findViewById(R.id.textView)).setText(this.f26864c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }
}
