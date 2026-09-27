package com.bytedance.sdk.component.hu.hww.hww.hww.hww;

import android.content.Context;
import com.bytedance.sdk.component.hu.hww.ok;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy extends hww {
    public vy(Context context, com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar) {
        super(context, hwwVar);
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hww.hww.sd
    public long hu() {
        return com.bytedance.sdk.component.hu.hww.vgm.hww.tq();
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hww.hww.hww
    public byte sd() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hww.hww.hww, com.bytedance.sdk.component.hu.hww.hww.hww.hww.sd
    public String tq() {
        com.bytedance.sdk.component.hu.hww.hww.hv hvVarVy = ok.vgm().vy();
        if (hvVarVy != null) {
            return hvVarVy.hww();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hww.hww.hww
    public byte vy() {
        return (byte) 0;
    }

    public static String sd(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
