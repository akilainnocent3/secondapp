package com.iab.omid.library.prebidorg.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zt extends ContentObserver {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final AudioManager f53737zr;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private final zz f53738zs;

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private final zs f53739zt;

    /* JADX INFO: renamed from: zu, reason: collision with root package name */
    private float f53740zu;
    private final Context zz;

    public zt(Handler handler, Context context, zz zzVar, zs zsVar) {
        super(handler);
        this.zz = context;
        this.f53737zr = (AudioManager) context.getSystemService("audio");
        this.f53738zs = zzVar;
        this.f53739zt = zsVar;
    }

    private void zr() {
        this.f53739zt.zz(this.f53740zu);
    }

    private float zz() {
        return this.f53738zs.zz(this.f53737zr.getStreamVolume(3), this.f53737zr.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fZz = zz();
        if (zz(fZz)) {
            this.f53740zu = fZz;
            zr();
        }
    }

    public void zs() {
        this.f53740zu = zz();
        zr();
        this.zz.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void zt() {
        this.zz.getContentResolver().unregisterContentObserver(this);
    }

    private boolean zz(float f10) {
        return f10 != this.f53740zu;
    }
}
