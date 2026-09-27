package com.startapp.sdk.internal;

import android.os.Parcelable;
import android.telephony.TelephonyManager;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TelephonyManager f75511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f75512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vh f75513c;

    public sh(vh vhVar, TelephonyManager telephonyManager, Class cls) {
        this.f75513c = vhVar;
        this.f75511a = telephonyManager;
        this.f75512b = cls;
    }

    public abstract void a();

    public final void a(Class cls, Parcelable parcelable) {
        vh vhVar = this.f75513c;
        vhVar.getClass();
        try {
            TelephonyMetadata telephonyMetadataA = vhVar.a();
            if (telephonyMetadataA != null && parcelable != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String simpleName = cls.getSimpleName();
                if (telephonyMetadataA.a(simpleName).c()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timestamp", jCurrentTimeMillis);
                    jSONObject.put("type", simpleName);
                    jSONObject.put("data", parcelable.toString());
                    String strB = si.b(jSONObject.toString());
                    rf rfVarEdit = ((sf) vhVar.f75711c.a()).edit();
                    rfVarEdit.a(simpleName, strB);
                    rfVarEdit.f75462a.putString(simpleName, strB);
                    rfVarEdit.apply();
                }
            }
        } catch (Throwable th2) {
            if (vhVar.a(2)) {
                d9.a(th2);
            }
        }
        if (cls.equals(this.f75512b)) {
            try {
                b();
            } catch (Throwable th3) {
                if (this.f75513c.a(16)) {
                    d9.a(th3);
                }
            }
        }
    }

    public abstract void b();
}
