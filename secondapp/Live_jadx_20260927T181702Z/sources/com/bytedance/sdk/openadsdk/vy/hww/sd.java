package com.bytedance.sdk.openadsdk.vy.hww;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd implements com.bytedance.sdk.openadsdk.multipro.hww {
    private final com.bytedance.sdk.component.hu.hww.tq.tq.tq hww;

    public sd(com.bytedance.sdk.component.hu.hww.tq.tq.tq tqVar) {
        this.hww = tqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public String hww() {
        com.bytedance.sdk.component.hu.hww.tq.tq.tq tqVar = this.hww;
        if (tqVar != null) {
            return tqVar.sd();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public String hww(Uri uri) {
        com.bytedance.sdk.component.hu.hww.tq.tq.tq tqVar = this.hww;
        if (tqVar != null) {
            return tqVar.hww(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public Cursor hww(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.bytedance.sdk.component.hu.hww.tq.tq.tq tqVar = this.hww;
        if (tqVar != null) {
            return tqVar.hww(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public Uri hww(Uri uri, ContentValues contentValues) {
        com.bytedance.sdk.component.hu.hww.tq.tq.tq tqVar = this.hww;
        if (tqVar != null) {
            return tqVar.hww(uri, contentValues);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public int hww(Uri uri, String str, String[] strArr) {
        com.bytedance.sdk.component.hu.hww.tq.tq.tq tqVar = this.hww;
        if (tqVar != null) {
            return tqVar.hww(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public int hww(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        com.bytedance.sdk.component.hu.hww.tq.tq.tq tqVar = this.hww;
        if (tqVar != null) {
            return tqVar.hww(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
