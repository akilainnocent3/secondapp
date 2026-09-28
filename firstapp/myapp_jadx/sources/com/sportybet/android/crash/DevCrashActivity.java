package com.sportybet.android.crash;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import defpackage.fq0;
import defpackage.yrh0;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes5.dex */
public class DevCrashActivity extends fq0 {
    @Override // androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_crash_report);
        Throwable th = (Throwable) getIntent().getSerializableExtra("throwable");
        AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
        StringWriter stringWriter = new StringWriter();
        if (th != null) {
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.close();
            } catch (Throwable unused) {
            }
        }
        String string = stringWriter.toString();
        if (TextUtils.isEmpty(string)) {
            finish();
            return;
        }
        TextView textView = (TextView) findViewById(R.id.details);
        if (textView != null) {
            textView.setText(string);
        }
    }
}
