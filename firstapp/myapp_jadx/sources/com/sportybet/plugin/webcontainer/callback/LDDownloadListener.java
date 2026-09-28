package com.sportybet.plugin.webcontainer.callback;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.DownloadListener;
import defpackage.zyf0;

/* JADX INFO: loaded from: classes7.dex */
public class LDDownloadListener implements DownloadListener {
    public Context context;

    public LDDownloadListener(Context context) {
        this.context = context;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        try {
            this.context.startActivity(intent);
        } catch (Exception unused) {
            zyf0.c(0, "Can't open Browser");
        }
    }
}
