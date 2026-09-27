package com.startapp.sdk.internal;

import android.content.Context;
import android.net.Uri;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.ImpressionsTrackingMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class b9 implements h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f74585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f74586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TrackingParams f74587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f74588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f74589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicReference f74590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f74591g;

    public b9(Context context, List list, TrackingParams trackingParams, f5 f5Var) {
        this.f74585a = context;
        this.f74586b = list;
        this.f74587c = trackingParams;
        this.f74588d = Collections.synchronizedMap(new LinkedHashMap(list.size()));
        this.f74589e = new AtomicInteger(list.size());
    }

    @Override // com.startapp.sdk.internal.h7
    public final Object a(Object obj, Object obj2, Object obj3) {
        Pair pair;
        String str = (String) obj;
        Throwable cause = (Throwable) obj3;
        if (((r8) obj2) != null) {
            pair = new Pair(4, String.valueOf(200));
        } else if (cause instanceof SDKException) {
            SDKException sDKException = (SDKException) cause;
            if (sDKException.a() > 0) {
                pair = new Pair(1, String.valueOf(sDKException.a()));
            } else {
                cause = cause.getCause();
                pair = null;
            }
        } else {
            pair = null;
        }
        if (pair == null) {
            pair = cause != null ? new Pair(2, cause.getClass().getName()) : new Pair(2, String.valueOf(-1));
        }
        this.f74588d.put(str, pair);
        a();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Context context, List list, TrackingParams trackingParams) {
        b9 b9Var = (b9) ((h7) com.startapp.sdk.components.a.a(context).O.a()).a(context, list, trackingParams);
        if (b9Var != null) {
            si.a(4, b9Var.f74585a, "Sending impression");
            for (String string : b9Var.f74586b) {
                if (string != null && string.length() > 0) {
                    if (b9Var.f74591g == null) {
                        b9Var.f74591g = g0.a(string, (String) null);
                    }
                    Context context2 = b9Var.f74585a;
                    TrackingParams trackingParams2 = b9Var.f74587c;
                    if (si.e(string)) {
                        StringBuilder sb2 = new StringBuilder(string);
                        String strA = g0.a(string, (String) null);
                        if (strA != null) {
                            sb2.append(g.a(g.c(strA)));
                        }
                        if (trackingParams2 != null) {
                            sb2.append(trackingParams2.e());
                        }
                        string = sb2.toString();
                    }
                    Pair pair = new Pair(string, Boolean.valueOf(gi.a(context2, string, b9Var)));
                    String str = (String) pair.first;
                    boolean zEquals = Boolean.TRUE.equals(pair.second);
                    b9Var.f74588d.put(str, null);
                    if (!zEquals) {
                        b9Var.a();
                    }
                } else {
                    b9Var.f74588d.put(string, null);
                    b9Var.a();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        String name;
        if (this.f74589e.decrementAndGet() == 0) {
            AtomicReference atomicReference = this.f74590f;
            if (atomicReference == null) {
                ImpressionsTrackingMetadata impressionsTrackingMetadataC = MetaData.E().C();
                if (impressionsTrackingMetadataC == null || impressionsTrackingMetadataC.a() <= ((Random) si.f75517d.a()).nextDouble()) {
                    impressionsTrackingMetadataC = null;
                }
                AtomicReference atomicReference2 = new AtomicReference(impressionsTrackingMetadataC);
                this.f74590f = atomicReference2;
                atomicReference = atomicReference2;
            }
            ImpressionsTrackingMetadata impressionsTrackingMetadata = (ImpressionsTrackingMetadata) atomicReference.get();
            if (impressionsTrackingMetadata != null) {
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                String str = "";
                boolean z10 = false;
                for (Map.Entry entry : this.f74588d.entrySet()) {
                    Integer num = entry.getValue() != null ? (Integer) ((Pair) entry.getValue()).first : 2;
                    if (num != null && (impressionsTrackingMetadata.b() & num.intValue()) == num.intValue()) {
                        String strValueOf = entry.getValue() != null ? (String) ((Pair) entry.getValue()).second : String.valueOf(-2);
                        String str2 = (String) entry.getKey();
                        sb2.append(str);
                        sb2.append(strValueOf);
                        sb3.append(str);
                        if (str2 != null) {
                            try {
                                Uri uri = Uri.parse(str2);
                                name = uri.getAuthority() + uri.getPath();
                            } catch (Throwable th2) {
                                name = th2.getClass().getName();
                            }
                        } else {
                            name = String.valueOf((char[]) null);
                        }
                        sb3.append(name);
                        str = ",";
                        z10 = true;
                    }
                }
                if (z10) {
                    d9 d9Var = new d9(e9.f74728k);
                    d9Var.f74676e = ((Object) sb2) + ";" + ((Object) sb3);
                    d9Var.f74678g = this.f74591g;
                    StringBuilder sb4 = new StringBuilder("adTag: ");
                    TrackingParams trackingParams = this.f74587c;
                    sb4.append(trackingParams != null ? trackingParams.a() : null);
                    d9Var.f74675d = sb4.toString();
                    d9Var.a();
                }
            }
        }
    }
}
