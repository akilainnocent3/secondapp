package com.bytedance.sdk.component.hu.hww.hww.hww;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv implements com.bytedance.sdk.component.hu.hww.hww.hv {
    public static final hv hww = new hv();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private volatile SQLiteDatabase f34537tq;

    @Override // com.bytedance.sdk.component.hu.hww.hww.hv
    public String hu() {
        return null;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hv
    public String hv() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hv
    public SQLiteDatabase hww(Context context) {
        if (this.f34537tq == null) {
            synchronized (this) {
                try {
                    if (this.f34537tq == null) {
                        this.f34537tq = new vy(context).getWritableDatabase();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f34537tq;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hv
    public String sd() {
        return null;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hv
    public String tq() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hv
    public String vy() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hv
    public String hww() {
        return "loghighpriority";
    }
}
