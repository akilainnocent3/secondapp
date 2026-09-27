package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdyj {
    public static final zzgvz zza;
    public static final zzgvz zzb;
    private final String zzc;
    private final zzdyi zzd;
    private final zzdyi zze;

    static {
        zzdyi zzdyiVar = zzdyi.PUBLIC_API_CALL;
        zzdyi zzdyiVar2 = zzdyi.PUBLIC_API_CALLBACK;
        zzdyj zzdyjVar = new zzdyj("tqgt", zzdyiVar, zzdyiVar2);
        zzdyi zzdyiVar3 = zzdyi.DYNAMITE_ENTER;
        zzdyj zzdyjVar2 = new zzdyj("l.dl", zzdyiVar, zzdyiVar3);
        zzdyi zzdyiVar4 = zzdyi.READ_FROM_DISK_START;
        zzdyj zzdyjVar3 = new zzdyj("l.rccde", zzdyiVar3, zzdyiVar4);
        zzdyj zzdyjVar4 = new zzdyj("l.rfd", zzdyiVar4, zzdyi.READ_FROM_DISK_END);
        zzdyi zzdyiVar5 = zzdyi.CLIENT_SIGNALS_START;
        zzdyj zzdyjVar5 = new zzdyj("l.rcc", zzdyiVar3, zzdyiVar5);
        zzdyi zzdyiVar6 = zzdyi.CLIENT_SIGNALS_END;
        zzdyj zzdyjVar6 = new zzdyj("l.cs", zzdyiVar5, zzdyiVar6);
        zzdyi zzdyiVar7 = zzdyi.SERVICE_CONNECTED;
        zzdyj zzdyjVar7 = new zzdyj("l.cts", zzdyiVar6, zzdyiVar7);
        zzdyi zzdyiVar8 = zzdyi.GMS_SIGNALS_START;
        zzdyi zzdyiVar9 = zzdyi.GMS_SIGNALS_END;
        zzdyj zzdyjVar8 = new zzdyj("l.gs", zzdyiVar8, zzdyiVar9);
        zzdyi zzdyiVar10 = zzdyi.GET_SIGNALS_SDKCORE_START;
        zzdyj zzdyjVar9 = new zzdyj("l.jse", zzdyiVar9, zzdyiVar10);
        zzdyi zzdyiVar11 = zzdyi.GET_SIGNALS_SDKCORE_END;
        zzdyj zzdyjVar10 = new zzdyj("l.gs-sdkcore", zzdyiVar10, zzdyiVar11);
        zzdyj zzdyjVar11 = new zzdyj("l.gs-pp", zzdyiVar11, zzdyiVar2);
        zzdyi zzdyiVar12 = zzdyi.RENDERING_START;
        zzdyj zzdyjVar12 = new zzdyj("l.render", zzdyiVar12, zzdyiVar2);
        zzdyi zzdyiVar13 = zzdyi.RENDERING_WEBVIEW_CREATION_START;
        zzdyj zzdyjVar13 = new zzdyj("l.render.pre", zzdyiVar12, zzdyiVar13);
        zzdyi zzdyiVar14 = zzdyi.RENDERING_WEBVIEW_CREATION_END;
        zzdyj zzdyjVar14 = new zzdyj("l.render.wvc", zzdyiVar13, zzdyiVar14);
        zzdyi zzdyiVar15 = zzdyi.RENDERING_AD_COMPONENT_CREATION_END;
        zzdyj zzdyjVar15 = new zzdyj("l.render.acc", zzdyiVar14, zzdyiVar15);
        zzdyi zzdyiVar16 = zzdyi.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdyi zzdyiVar17 = zzdyi.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdyj zzdyjVar16 = new zzdyj("l.render.cfg-wv", zzdyiVar16, zzdyiVar17);
        zzdyi zzdyiVar18 = zzdyi.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdyi zzdyiVar19 = zzdyi.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzgvz.zzo(zzdyjVar, zzdyjVar2, zzdyjVar3, zzdyjVar4, zzdyjVar5, zzdyjVar6, zzdyjVar7, zzdyjVar8, zzdyjVar9, zzdyjVar10, zzdyjVar11, zzdyjVar12, zzdyjVar13, zzdyjVar14, zzdyjVar15, zzdyjVar16, new zzdyj("l.render.wvlh", zzdyiVar18, zzdyiVar19), new zzdyj("l.render.post", zzdyiVar19, zzdyiVar2), new zzdyj("l.sodv", zzdyi.SIGNAL_ON_DISK_VALIDATION_START, zzdyi.SIGNAL_ON_DISK_VALIDATION_END), new zzdyj("l.sodck", zzdyi.SIGNAL_ON_DISK_CACHE_KEY_START, zzdyi.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdyj("l.sodrar", zzdyi.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdyi.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdyj("l.soddc", zzdyi.SIGNAL_ON_DISK_DECODE_START, zzdyi.SIGNAL_ON_DISK_DECODE_END));
        zzdyj zzdyjVar17 = new zzdyj("l.al", zzdyiVar, zzdyiVar2);
        zzdyj zzdyjVar18 = new zzdyj("l.al2", zzdyiVar3, zzdyiVar2);
        zzdyj zzdyjVar19 = new zzdyj("l.dl", zzdyiVar, zzdyiVar3);
        zzdyj zzdyjVar20 = new zzdyj("l.rcc", zzdyiVar3, zzdyiVar5);
        zzdyj zzdyjVar21 = new zzdyj("l.cs", zzdyiVar5, zzdyiVar6);
        zzdyj zzdyjVar22 = new zzdyj("l.cts", zzdyiVar6, zzdyiVar7);
        zzdyj zzdyjVar23 = new zzdyj("l.gs", zzdyiVar8, zzdyiVar9);
        zzdyi zzdyiVar20 = zzdyi.GET_AD_DICTIONARY_SDKCORE_START;
        zzdyj zzdyjVar24 = new zzdyj("l.jse", zzdyiVar9, zzdyiVar20);
        zzdyi zzdyiVar21 = zzdyi.GET_AD_DICTIONARY_SDKCORE_END;
        zzdyj zzdyjVar25 = new zzdyj("l.gad-js", zzdyiVar20, zzdyiVar21);
        zzdyi zzdyiVar22 = zzdyi.HTTP_RESPONSE_READY;
        zzdyj zzdyjVar26 = new zzdyj("l.http", zzdyiVar21, zzdyiVar22);
        zzdyi zzdyiVar23 = zzdyi.SCAR_PRELOADER_READY;
        zzdyj zzdyjVar27 = new zzdyj("l.slas.pre", zzdyiVar, zzdyiVar23);
        zzdyi zzdyiVar24 = zzdyi.SCAR_PRELOADER_PROCESSING_DONE;
        zzdyj zzdyjVar28 = new zzdyj("l.slas.prel.p", zzdyiVar23, zzdyiVar24);
        zzdyi zzdyiVar25 = zzdyi.NORMALIZATION_AD_RESPONSE_START;
        zzdyj zzdyjVar29 = new zzdyj("l.jse-nml", zzdyiVar22, zzdyiVar25);
        zzdyj zzdyjVar30 = new zzdyj("l.jse-nml", zzdyiVar24, zzdyiVar25);
        zzdyi zzdyiVar26 = zzdyi.NORMALIZATION_AD_RESPONSE_END;
        zzdyj zzdyjVar31 = new zzdyj("l.nml-js", zzdyiVar25, zzdyiVar26);
        zzdyi zzdyiVar27 = zzdyi.BINDER_CALL_START;
        zzdyj zzdyjVar32 = new zzdyj("l.nml-gmsg", zzdyiVar26, zzdyiVar27);
        zzdyi zzdyiVar28 = zzdyi.SERVER_RESPONSE_PARSE_START;
        zzdyj zzdyjVar33 = new zzdyj("l.nml-gmsg.s2s", zzdyiVar26, zzdyiVar28);
        zzdyj zzdyjVar34 = new zzdyj("l.binder", zzdyiVar27, zzdyiVar28);
        zzdyj zzdyjVar35 = new zzdyj("l.sr", zzdyiVar28, zzdyiVar12);
        zzdyj zzdyjVar36 = new zzdyj("l.render", zzdyiVar12, zzdyiVar2);
        zzdyj zzdyjVar37 = new zzdyj("l.t2", zzdyi.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdyi.RENDERING_ADSTRING_TYPE2_FETCH_END);
        zzdyi zzdyiVar29 = zzdyi.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START;
        zzdyi zzdyiVar30 = zzdyi.RENDERING_NATIVE_ADS_PREPROCESS_START;
        zzdyj zzdyjVar38 = new zzdyj("l.render.na.js", zzdyiVar29, zzdyiVar30);
        zzdyj zzdyjVar39 = new zzdyj("l.render.na.prep", zzdyiVar30, zzdyi.RENDERING_NATIVE_ADS_PREPROCESS_END);
        zzdyj zzdyjVar40 = new zzdyj("l.render.na.lna", zzdyi.RENDERING_NATIVE_ASSETS_LOADING_START, zzdyi.RENDERING_NATIVE_ASSETS_LOADING_END);
        zzdyj zzdyjVar41 = new zzdyj("l.render.wvc", zzdyiVar13, zzdyiVar14);
        zzdyj zzdyjVar42 = new zzdyj("l.render.acc", zzdyiVar14, zzdyiVar15);
        zzdyj zzdyjVar43 = new zzdyj("l.render.cfg-wv", zzdyiVar16, zzdyiVar17);
        zzdyj zzdyjVar44 = new zzdyj("l.render.pre", zzdyiVar12, zzdyiVar13);
        zzdyj zzdyjVar45 = new zzdyj("l.render.post", zzdyiVar19, zzdyiVar2);
        zzdyj zzdyjVar46 = new zzdyj("l.render.na.post", zzdyiVar17, zzdyiVar2);
        zzdyj zzdyjVar47 = new zzdyj("l.render.wvlh", zzdyiVar18, zzdyiVar19);
        zzdyj zzdyjVar48 = new zzdyj("l.na.b", zzdyi.NATIVE_ASSETS_LOADING_BASIC_START, zzdyi.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdyj zzdyjVar49 = new zzdyj("l.na.im", zzdyi.NATIVE_ASSETS_LOADING_IMAGE_START, zzdyi.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzdyj zzdyjVar50 = new zzdyj("l.na.imc", zzdyi.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START, zzdyi.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        zzdyj zzdyjVar51 = new zzdyj("l.na.l", zzdyi.NATIVE_ASSETS_LOADING_LOGO_START, zzdyi.NATIVE_ASSETS_LOADING_LOGO_END);
        zzdyj zzdyjVar52 = new zzdyj("l.na.ic", zzdyi.NATIVE_ASSETS_LOADING_ICON_START, zzdyi.NATIVE_ASSETS_LOADING_ICON_END);
        zzdyj zzdyjVar53 = new zzdyj("l.na.a", zzdyi.NATIVE_ASSETS_LOADING_ATTRIBUTION_START, zzdyi.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        zzdyi zzdyiVar31 = zzdyi.NATIVE_ASSETS_LOADING_VIDEO_START;
        zzdyi zzdyiVar32 = zzdyi.NATIVE_ASSETS_LOADING_VIDEO_END;
        zzb = zzgvz.zzo(zzdyjVar17, zzdyjVar18, zzdyjVar19, zzdyjVar20, zzdyjVar21, zzdyjVar22, zzdyjVar23, zzdyjVar24, zzdyjVar25, zzdyjVar26, zzdyjVar27, zzdyjVar28, zzdyjVar29, zzdyjVar30, zzdyjVar31, zzdyjVar32, zzdyjVar33, zzdyjVar34, zzdyjVar35, zzdyjVar36, zzdyjVar37, zzdyjVar38, zzdyjVar39, zzdyjVar40, zzdyjVar41, zzdyjVar42, zzdyjVar43, zzdyjVar44, zzdyjVar45, zzdyjVar46, zzdyjVar47, zzdyjVar48, zzdyjVar49, zzdyjVar50, zzdyjVar51, zzdyjVar52, zzdyjVar53, new zzdyj("l.na.v", zzdyiVar31, zzdyiVar32), new zzdyj("l.na.vc", zzdyi.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START, zzdyiVar32), new zzdyj("l.na.m", zzdyi.NATIVE_ASSETS_LOADING_MEDIA_START, zzdyi.NATIVE_ASSETS_LOADING_MEDIA_END), new zzdyj("l.na.c", zzdyi.NATIVE_ASSETS_LOADING_CUSTOM_START, zzdyi.NATIVE_ASSETS_LOADING_CUSTOM_END), new zzdyj("l.na.o", zzdyi.NATIVE_ASSETS_LOADING_OMID_START, zzdyi.NATIVE_ASSETS_LOADING_OMID_END));
    }

    public zzdyj(String str, zzdyi zzdyiVar, zzdyi zzdyiVar2) {
        this.zzc = str;
        this.zzd = zzdyiVar;
        this.zze = zzdyiVar2;
    }

    public final String zza() {
        return this.zzc;
    }

    public final zzdyi zzb() {
        return this.zzd;
    }

    public final zzdyi zzc() {
        return this.zze;
    }
}
