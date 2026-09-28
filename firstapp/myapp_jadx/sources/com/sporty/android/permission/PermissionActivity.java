package com.sporty.android.permission;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.sporty.android.permission.PermissionActivity;
import com.sportybet.android.gp.tz.R;
import defpackage.ce;
import defpackage.ee;
import defpackage.ee00;
import defpackage.he00;
import defpackage.pwx;
import defpackage.py1;
import defpackage.sc;
import defpackage.ud;

/* JADX INFO: loaded from: classes4.dex */
public final class PermissionActivity extends py1 implements pwx {
    public static ee00 c;
    public String[] a;
    public final ee<Intent> b = registerForActivityResult(new ce(), new a());

    public class a implements ud<ActivityResult> {
        public a() {
        }

        @Override // defpackage.ud
        public final void a(ActivityResult activityResult) {
            PermissionActivity permissionActivity = PermissionActivity.this;
            String[] strArr = permissionActivity.a;
            if (strArr != null && PermissionActivity.c != null) {
                if (he00.b(permissionActivity, strArr)) {
                    PermissionActivity.c.onGranted();
                } else {
                    PermissionActivity.c.onDenied();
                }
            }
            permissionActivity.finish();
        }
    }

    public static void z1(Context context, String[] strArr, ee00 ee00Var) {
        if (he00.b(context, strArr)) {
            ee00Var.onGranted();
            return;
        }
        c = ee00Var;
        Intent intent = new Intent(context, (Class<?>) PermissionActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("KEY_INPUT_PERMISSIONS", strArr);
        context.startActivity(intent);
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        return true;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("KEY_INPUT_PERMISSIONS");
        this.a = stringArrayExtra;
        if (stringArrayExtra == null || c == null) {
            finish();
            return;
        }
        if (he00.b(this, stringArrayExtra)) {
            c.onGranted();
            finish();
            return;
        }
        for (String str : this.a) {
            if (!sc.f(this, str)) {
                sc.e(this, this.a, 1);
                return;
            }
        }
        final String[] strArr = this.a;
        String cMSString = getCMSString(R.string.app_common__permission_always_failed, TextUtils.join("\n", he00.c(this, strArr)));
        b.a aVar = new b.a(this);
        AlertController.b bVar = aVar.a;
        bVar.k = false;
        bVar.f = cMSString;
        aVar.c(getCMSString(R.string.common_functions__allow, new Object[0]), new DialogInterface.OnClickListener() { // from class: zd00
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ee00 ee00Var = PermissionActivity.c;
                sc.e(this.a, strArr, 1);
            }
        });
        aVar.b(getCMSString(R.string.common_functions__deny, new Object[0]), new DialogInterface.OnClickListener() { // from class: ae00
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ee00 ee00Var = PermissionActivity.c;
                if (ee00Var != null) {
                    ee00Var.onDenied();
                }
                this.a.finish();
            }
        });
        aVar.f();
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        c = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        boolean z = true;
        for (int i2 : iArr) {
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            ee00 ee00Var = c;
            if (ee00Var != null) {
                ee00Var.onGranted();
            }
            finish();
            return;
        }
        for (String str : strArr) {
            if (!sc.f(this, str)) {
                String cMSString = getCMSString(R.string.app_common__message_permission_rationale, TextUtils.join("\n", he00.c(this, strArr)));
                b.a aVar = new b.a(this);
                AlertController.b bVar = aVar.a;
                bVar.k = false;
                bVar.f = cMSString;
                aVar.c(getCMSString(R.string.wap_setting__go_to_settings, new Object[0]), new DialogInterface.OnClickListener() { // from class: xd00
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        ee00 ee00Var2 = PermissionActivity.c;
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        PermissionActivity permissionActivity = this.a;
                        intent.setData(Uri.fromParts("package", permissionActivity.getPackageName(), null));
                        permissionActivity.b.b(intent);
                    }
                });
                aVar.b(getCMSString(R.string.common_functions__cancel, new Object[0]), new DialogInterface.OnClickListener() { // from class: yd00
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        ee00 ee00Var2 = PermissionActivity.c;
                        if (ee00Var2 != null) {
                            ee00Var2.onDenied();
                        }
                        this.a.finish();
                    }
                });
                aVar.f();
                return;
            }
        }
        ee00 ee00Var2 = c;
        if (ee00Var2 != null) {
            ee00Var2.onDenied();
        }
        finish();
    }
}
