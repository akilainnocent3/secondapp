package com.sportybet.android.crash;

import android.os.Bundle;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.crash.UserCrashActivity;
import defpackage.bnh0;
import defpackage.loh0;
import defpackage.md8;
import defpackage.o6m;
import defpackage.psm;
import defpackage.yi5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/crash/UserCrashActivity;", "Lfq0;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UserCrashActivity extends o6m {
    public static final /* synthetic */ int i = 0;
    public psm d;
    public bnh0 e;
    public yi5 f;

    @Override // defpackage.o6m, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        md8.c cVar = new md8.c() { // from class: koh0
            @Override // md8.c
            public final void b() {
                int i2 = UserCrashActivity.i;
                UserCrashActivity userCrashActivity = this.a;
                yi5 yi5Var = userCrashActivity.f;
                if (yi5Var == null) {
                    Intrinsics.n("buildConfiguration");
                    throw null;
                }
                if (yi5Var.b().j()) {
                    String packageName = userCrashActivity.getPackageName();
                    packageName.getClass();
                    n5l.a(userCrashActivity, packageName);
                } else {
                    yi5 yi5Var2 = userCrashActivity.f;
                    if (yi5Var2 == null) {
                        Intrinsics.n("buildConfiguration");
                        throw null;
                    }
                    if (yi5Var2.b().k()) {
                        kqm.a(userCrashActivity);
                    } else {
                        fbh0 fbh0VarC = sh8.c();
                        bnh0 bnh0Var = userCrashActivity.e;
                        if (bnh0Var == null) {
                            Intrinsics.n(qUnCRF.xFBttcsW);
                            throw null;
                        }
                        fbh0VarC.e(bnh0.d(bnh0Var, new String[]{"promotions/downloadApp?useSystemBrowser=true"}, null, 6));
                    }
                }
                AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
                System.exit(0);
            }
        };
        loh0 loh0Var = new loh0();
        md8 md8Var = new md8();
        md8Var.i = "Installation Error";
        md8Var.v = 0;
        md8Var.w = "";
        md8Var.y = "The application encountered an installation error due to missing required components. Please reinstall the app to resolve the issue.";
        md8Var.A = "CLOSE";
        md8Var.z = "REINSTALL";
        md8Var.C = true;
        md8Var.B = true;
        md8Var.F = loh0Var;
        md8Var.E = cVar;
        md8Var.show(getSupportFragmentManager(), "reinstallAppDialog");
    }
}
