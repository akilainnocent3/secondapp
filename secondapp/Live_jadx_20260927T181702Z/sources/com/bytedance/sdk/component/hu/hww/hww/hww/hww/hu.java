package com.bytedance.sdk.component.hu.hww.hww.hww.hww;

import android.content.Context;
import com.bytedance.sdk.component.hu.hww.ok;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu extends vgm {
    public hu(Context context, com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar) {
        super(context, hwwVar);
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hww.hww.vgm
    public byte hww() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hww.hww.vgm
    public byte sd() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hww.hww.vgm, com.bytedance.sdk.component.hu.hww.hww.hww.hww.sd
    public String tq() {
        return ok.vgm().vy().hv();
    }

    public static String hww(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
