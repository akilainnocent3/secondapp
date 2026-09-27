package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyDataConfig;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib f75710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib f75711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ib f75712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a6 f75713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sh f75714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f75715g = ((Random) si.f75517d.a()).nextDouble();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile String f75716h = "e106";

    public vh(Context context, ib ibVar, ib ibVar2, ib ibVar3, a6 a6Var) {
        this.f75709a = context;
        this.f75710b = ibVar;
        this.f75711c = ibVar2;
        this.f75712d = ibVar3;
        this.f75713e = a6Var;
    }

    public final sh a(Class cls) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f75709a.getSystemService("phone");
        if (telephonyManager != null) {
            return Build.VERSION.SDK_INT < 31 ? new uh(this, telephonyManager, cls) : new rh(this, telephonyManager, cls);
        }
        return null;
    }

    public final void b() {
        sh shVarA;
        try {
            if (a() == null || (shVarA = a(SignalStrength.class)) == null) {
                return;
            }
            shVarA.a();
        } catch (Throwable th2) {
            if (a(8)) {
                d9.a(th2);
            }
        }
    }

    public final TelephonyMetadata a() {
        g6 g6Var = (g6) this.f75712d.a();
        Boolean boolValueOf = (g6Var.b() && ((sf) g6Var.f74859b.a()).contains("consentApc")) ? Boolean.valueOf(((sf) g6Var.f74859b.a()).getBoolean("consentApc", false)) : null;
        if (boolValueOf != null && boolValueOf.booleanValue()) {
            this.f75713e.getClass();
            TelephonyMetadata telephonyMetadataA0 = MetaData.E().a0();
            if (telephonyMetadataA0 != null && telephonyMetadataA0.c()) {
                return telephonyMetadataA0;
            }
        }
        return null;
    }

    public final boolean a(int i10) {
        TelephonyMetadata telephonyMetadataA = a();
        return telephonyMetadataA != null && this.f75715g < telephonyMetadataA.b() && (telephonyMetadataA.a() & i10) == i10;
    }

    public final void a(SignalStrength signalStrength) {
        if (signalStrength == null) {
            return;
        }
        try {
            this.f75716h = String.valueOf(signalStrength.getLevel());
        } catch (NoSuchMethodException unused) {
            this.f75716h = "e104";
        } catch (Throwable unused2) {
            this.f75716h = "e105";
        }
    }

    public final Map a(e9 e9Var) {
        List listA;
        TelephonyMetadata telephonyMetadataA = a();
        if (telephonyMetadataA == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = null;
        for (Map.Entry entry : ((sf) this.f75711c.a()).getAll().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) entry.getKey();
                TelephonyDataConfig telephonyDataConfigA = telephonyMetadataA.a(str);
                if (telephonyDataConfigA.c() && (listA = telephonyDataConfigA.a()) != null && listA.contains(e9Var.f74734a)) {
                    String strB = telephonyDataConfigA.b();
                    if (strB != null) {
                        str = strB;
                    }
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(str, (String) value);
                }
            }
        }
        return map == null ? Collections.EMPTY_MAP : map;
    }
}
