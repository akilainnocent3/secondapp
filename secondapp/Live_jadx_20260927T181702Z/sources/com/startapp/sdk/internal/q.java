package com.startapp.sdk.internal;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib f75393b;

    public q(Context context, ib ibVar, j5 j5Var) {
        this.f75392a = context;
        this.f75393b = ibVar;
    }

    public final void a(String str, String str2) {
        boolean z10;
        AdDebuggerMetadata adDebuggerMetadataD = MetaData.E().d();
        if (adDebuggerMetadataD != null && adDebuggerMetadataD.b()) {
            d9 d9Var = new d9(e9.f74721d);
            d9Var.f74675d = "adDebugInfo";
            d9Var.f74676e = str;
            d9Var.f74678g = str2;
            d9Var.a();
        }
        if (str == null && str2 == null) {
            Toast.makeText(this.f75392a, "Ad debug info not available", 0).show();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Ad debug info");
        String str3 = IOUtils.LINE_SEPARATOR_UNIX;
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        if (str != null) {
            sb2.append("url: ");
            sb2.append(str);
        } else {
            str3 = "";
        }
        if (str2 != null) {
            sb2.append(str3);
            sb2.append("d: ");
            sb2.append(str2);
        }
        try {
            Object systemService = this.f75392a.getSystemService("clipboard");
            if (systemService instanceof ClipboardManager) {
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Ad debug info", sb2));
                z10 = true;
            } else {
                z10 = false;
            }
        } catch (Throwable unused) {
        }
        try {
            Toast.makeText(this.f75392a, "Ad debug info".concat(z10 ? " copied to clipboard" : " printed to logcat"), 0).show();
        } catch (Throwable unused2) {
        }
    }
}
