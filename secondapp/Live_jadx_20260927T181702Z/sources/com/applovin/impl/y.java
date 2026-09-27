package com.applovin.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static y f29527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f29528f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f29529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29532d;

    private y(Context context) throws Throwable {
        Bundle bundle;
        int iIntValue;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            bundle = applicationInfo.metaData;
            try {
                try {
                    String str = applicationInfo.processName;
                    this.f29529a = bundle;
                    this.f29532d = str;
                } catch (PackageManager.NameNotFoundException e10) {
                    e = e10;
                    com.applovin.impl.sdk.p.c("AndroidManifest", "Failed to get meta data.", e);
                    this.f29529a = bundle;
                    this.f29532d = null;
                }
            } catch (Throwable th2) {
                th = th2;
                this.f29529a = bundle;
                this.f29532d = null;
                throw th;
            }
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            bundle = null;
        } catch (Throwable th3) {
            th = th3;
            bundle = null;
            this.f29529a = bundle;
            this.f29532d = null;
            throw th;
        }
        boolean z10 = false;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
            iIntValue = 0;
            boolean zBooleanValue = false;
            do {
                if (2 == eventType) {
                    try {
                        if (xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                            for (int i10 = 0; i10 < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i10++) {
                                String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i10);
                                String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i10);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    iIntValue = Integer.valueOf(attributeValue.substring(1)).intValue();
                                } else if (attributeName.equals("usesCleartextTraffic")) {
                                    zBooleanValue = Boolean.valueOf(attributeValue).booleanValue();
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z10 = zBooleanValue;
                        try {
                            com.applovin.impl.sdk.p.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            return;
                        } finally {
                            this.f29530b = iIntValue;
                            this.f29531c = z10;
                        }
                    }
                }
                eventType = xmlResourceParserOpenXmlResourceParser.next();
            } while (eventType != 1);
            this.f29530b = iIntValue;
            this.f29531c = zBooleanValue;
        } catch (Throwable th5) {
            th = th5;
            iIntValue = 0;
        }
    }

    public static y a(Context context) {
        y yVar;
        synchronized (f29528f) {
            try {
                if (f29527e == null) {
                    f29527e = new y(context);
                }
                yVar = f29527e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yVar;
    }

    public boolean a(String str) {
        Bundle bundle = this.f29529a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z10) {
        Bundle bundle = this.f29529a;
        return bundle != null ? bundle.getBoolean(str, z10) : z10;
    }

    public String a() {
        return this.f29532d;
    }
}
