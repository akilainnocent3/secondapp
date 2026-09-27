package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5176kf implements Vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f97726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97727b = "content://" + a() + "/preload_info";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97728c = "tracking_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f97729d = "additional_parameters";

    public C5176kf(@oy.l Context context) {
        this.f97726a = context;
    }

    @oy.l
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // ds.a
    @oy.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5351rf invoke() {
        Cursor cursorQuery;
        JSONObject jSONObject;
        if (!PackageManagerUtils.hasContentProvider(this.f97726a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC5077gj.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.f97726a.getContentResolver().query(Uri.parse(this.f97727b), null, null, null, null);
            try {
                if (cursorQuery == null) {
                    AbstractC5077gj.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f97728c));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f97729d));
                        if (string2 == null) {
                            JSONObject jSONObject2 = jSONObject;
                            if (!TextUtils.isEmpty(string)) {
                                AbstractC5077gj.a("Tracking id from Satellite is not a number.", new Object[0]);
                            }
                            AbstractC5077gj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                            C5351rf c5351rf = new C5351rf(string, jSONObject2, !TextUtils.isEmpty(string), false, T7.f96503d);
                            mo.a(cursorQuery);
                            return c5351rf;
                        }
                        try {
                            jSONObject = string2.length() == 0 ? new JSONObject() : new JSONObject(string2);
                        } catch (Throwable unused) {
                            jSONObject = new JSONObject();
                        }
                        JSONObject jSONObject3 = jSONObject;
                        if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                            AbstractC5077gj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC5077gj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject3);
                        C5351rf c5351rf2 = new C5351rf(string, jSONObject3, !TextUtils.isEmpty(string), false, T7.f96503d);
                        mo.a(cursorQuery);
                        return c5351rf2;
                    }
                    AbstractC5077gj.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursorQuery = null;
        }
        mo.a(cursorQuery);
        return null;
    }
}
