package com.bytedance.sdk.openadsdk.jpb.sd;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private final SharedPreferences hww;

    public hww(Context context) {
        this.hww = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long hww() {
        return this.hww.getLong("last_upload_time", 0L);
    }

    public void hww(long j10) {
        SharedPreferences.Editor editorEdit = this.hww.edit();
        editorEdit.putLong("last_upload_time", j10);
        editorEdit.apply();
    }
}
