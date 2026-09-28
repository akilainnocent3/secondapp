package com.sportybet.android.crash;

import android.os.Bundle;
import com.sportybet.android.gp.tz.R;
import defpackage.md8;
import defpackage.noh0;
import defpackage.ooh0;
import defpackage.psm;
import defpackage.q6m;
import defpackage.sn5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/crash/UserCrashNoticeActivity;", "Lfq0;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UserCrashNoticeActivity extends q6m {
    public static final /* synthetic */ int e = 0;
    public psm d;

    @Override // defpackage.q6m, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("KEY_TITLE");
        if (stringExtra == null) {
            stringExtra = sn5.b(this, R.string.app_common__system_crash_dialog_error_title, new Object[0]);
        }
        String stringExtra2 = getIntent().getStringExtra("KEY_INFO");
        if (stringExtra2 == null) {
            stringExtra2 = sn5.b(this, R.string.app_common__system_crash_dialog_error_message, new Object[0]);
        }
        noh0 noh0Var = new noh0();
        ooh0 ooh0Var = new ooh0();
        md8 md8Var = new md8();
        md8Var.i = stringExtra;
        md8Var.v = 0;
        md8Var.w = "";
        md8Var.y = stringExtra2;
        md8Var.A = "Cancel";
        md8Var.z = "OK";
        md8Var.C = false;
        md8Var.B = true;
        md8Var.F = ooh0Var;
        md8Var.E = noh0Var;
        md8Var.show(getSupportFragmentManager(), "systemErrorDialog");
    }
}
