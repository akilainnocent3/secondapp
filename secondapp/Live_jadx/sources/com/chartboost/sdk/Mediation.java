package com.chartboost.sdk;

import com.chartboost.sdk.impl.fc;
import lk.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class Mediation {
    public final String adapterVersion;
    public final String libraryVersion;
    public final String mediationType;

    public Mediation(String str, String str2, String str3) {
        this.mediationType = a(str);
        this.libraryVersion = str2;
        this.adapterVersion = str3;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace(" ", e.f104695m);
        return strReplace.length() > 50 ? strReplace.substring(0, 50) : strReplace;
    }

    public fc toMediationBodyFields() {
        if (this.mediationType == null) {
            return null;
        }
        String str = this.libraryVersion;
        if (str == null) {
            str = "";
        }
        String str2 = this.adapterVersion;
        return new fc(a(), str, str2 != null ? str2 : "", this.mediationType);
    }

    public final String a() {
        String str = this.libraryVersion;
        if (str != null && !str.isEmpty()) {
            return this.mediationType + " " + this.libraryVersion;
        }
        return this.mediationType;
    }
}
