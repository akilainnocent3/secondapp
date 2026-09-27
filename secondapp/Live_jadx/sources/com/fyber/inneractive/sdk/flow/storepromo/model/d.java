package com.fyber.inneractive.sdk.flow.storepromo.model;

import com.fyber.inneractive.sdk.util.h;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44964c;

    public d(String str, String str2, String str3) {
        String str4;
        this.f44964c = "";
        this.f44962a = str;
        this.f44963b = str2;
        h hVar = new h(str3);
        Long l10 = hVar.f47867a;
        if (l10 == null) {
            str4 = "N/A";
        } else {
            double dLongValue = l10.longValue() / 1024.0d;
            double d10 = dLongValue / 1024.0d;
            double d11 = d10 / 1024.0d;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String str5 = decimalFormat.format(hVar.f47867a) + " bytes";
            if (d10 > 850.0d) {
                str4 = decimalFormat.format(d11) + " GB";
            } else if (dLongValue > 850.0d) {
                str4 = decimalFormat.format(d10) + " MB";
            } else if (hVar.f47867a.longValue() > 850) {
                str4 = decimalFormat.format(dLongValue) + " kB";
            } else {
                str4 = str5;
            }
        }
        this.f44964c = str4;
    }
}
