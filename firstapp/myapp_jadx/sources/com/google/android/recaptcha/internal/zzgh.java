package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.hwr;
import defpackage.ttr;
import java.util.Locale;
import java.util.MissingResourceException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgh {
    private zzvu zza;
    private final ttr zzb;

    public zzgh() {
        int i = zzby.zza;
        this.zzb = hwr.b(zzgg.zza);
    }

    private final Application zzb() {
        return (Application) this.zzb.getValue();
    }

    private static final String zzc() {
        try {
            String iSO3Country = Locale.getDefault().getISO3Country();
            iSO3Country.getClass();
            return iSO3Country;
        } catch (MissingResourceException unused) {
            return "";
        }
    }

    private static final String zzd() {
        try {
            String iSO3Language = Locale.getDefault().getISO3Language();
            iSO3Language.getClass();
            return iSO3Language;
        } catch (MissingResourceException unused) {
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:26:0x004e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final com.google.android.recaptcha.internal.zzwz zza(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgh.zza(java.lang.String):com.google.android.recaptcha.internal.zzwz");
    }
}
