package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Ui implements Vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96584b = "content://" + a() + "/clids";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96585c = "clid_key";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f96586d = "clid_value";

    public Ui(@oy.l Context context) {
        this.f96583a = context;
    }

    @oy.l
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // ds.a
    @oy.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5364s3 invoke() {
        Cursor cursorQuery;
        if (!PackageManagerUtils.hasContentProvider(this.f96583a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC5077gj.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.f96583a.getContentResolver().query(Uri.parse(this.f96584b), null, null, null, null);
            try {
                if (cursorQuery == null) {
                    AbstractC5077gj.a("No Satellite content provider found", new Object[0]);
                    mo.a(cursorQuery);
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f96585c));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f96586d));
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            AbstractC5077gj.a("Invalid clid {%s : %s}", string, string2);
                        } else {
                            linkedHashMap.put(string, string2);
                        }
                    } catch (Throwable unused) {
                    }
                }
                AbstractC5077gj.a("Clids from satellite: %s", linkedHashMap);
                C5364s3 c5364s3 = new C5364s3(linkedHashMap, T7.f96503d);
                mo.a(cursorQuery);
                return c5364s3;
            } catch (Throwable th2) {
                th = th2;
                try {
                    ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Error while getting satellite clids", new Object[0]) + IOUtils.LINE_SEPARATOR_UNIX + StringUtils.throwableToString(th), new Object[0]);
                } finally {
                    mo.a(cursorQuery);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }
}
