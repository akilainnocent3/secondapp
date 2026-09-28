package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes4.dex */
public final class lqk0 extends vml0 {
    public static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", vZBMKENANSz.XrFcasCcejU, "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    public static final String[] j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final hqk0 d;
    public final eml0 e;

    public lqk0(iol0 iol0Var) {
        super(iol0Var);
        this.e = new eml0(this.a.k);
        wok0 wok0Var = this.a.d;
        this.d = new hqk0(this, this.a.a);
    }

    public static final String J(List list) {
        return list.isEmpty() ? "" : tug.a(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void P(ContentValues contentValues, Object obj) {
        hm20.e("value");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            hb5.a("Invalid value type");
        }
    }

    public final void A(String str, zzoh zzohVar) {
        g();
        h();
        hm20.e(str);
        k8l0 k8l0Var = this.a;
        xi9 xi9Var = k8l0Var.k;
        y4l0 y4l0Var = k8l0Var.f;
        xi9Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        t2l0 t2l0Var = v2l0.v0;
        long jLongValue = jCurrentTimeMillis - ((Long) t2l0Var.a(null)).longValue();
        long j2 = zzohVar.b;
        if (j2 < jLongValue || j2 > ((Long) t2l0Var.a(null)).longValue() + jCurrentTimeMillis) {
            k8l0.m(y4l0Var);
            y4l0Var.i.d(y4l0.k(str), "Storing trigger URI outside of the max retention time span. appId, now, timestamp", Long.valueOf(jCurrentTimeMillis), Long.valueOf(j2));
        }
        k8l0.m(y4l0Var);
        y4l0Var.n.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("trigger_uri", zzohVar.a);
        contentValues.put("source", Integer.valueOf(zzohVar.c));
        contentValues.put("timestamp_millis", Long.valueOf(j2));
        try {
            if (V().insert("trigger_uris", null, contentValues) == -1) {
                k8l0.m(y4l0Var);
                y4l0Var.f.b(y4l0.k(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            k8l0.m(y4l0Var);
            y4l0Var.f.c(y4l0.k(str), "Error storing trigger URI. appId", e);
        }
    }

    public final void B(String str, jbl0 jbl0Var) {
        hm20.h(str);
        hm20.h(jbl0Var);
        g();
        h();
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("consent_state", jbl0Var.g());
        contentValues.put("consent_source", Integer.valueOf(jbl0Var.b));
        D(contentValues);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final String C(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = V().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                y4l0 y4l0Var = this.a.f;
                k8l0.m(y4l0Var);
                y4l0Var.f.c(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final void D(ContentValues contentValues) {
        k8l0 k8l0Var = this.a;
        try {
            SQLiteDatabase sQLiteDatabaseV = V();
            String asString = contentValues.getAsString(PublisherMetadata.APP_ID);
            if (asString == null) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.h.b(y4l0.k(PublisherMetadata.APP_ID), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseV.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseV.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.f.c(y4l0.k("consent_settings"), "Failed to insert/update table (got -1). key", y4l0.k(PublisherMetadata.APP_ID));
            }
        } catch (SQLiteException e) {
            y4l0 y4l0Var3 = k8l0Var.f;
            k8l0.m(y4l0Var3);
            y4l0Var3.f.d(y4l0.k("consent_settings"), "Error storing into table. key", y4l0.k(PublisherMetadata.APP_ID), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final msk0 E(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        k8l0 k8l0Var = this.a;
        hm20.e(str2);
        hm20.e(str3);
        g();
        h();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursorQuery = V().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(0);
                        long j3 = cursorQuery.getLong(1);
                        long j4 = cursorQuery.getLong(2);
                        long j5 = 0;
                        long j6 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j5 = cursorQuery.getLong(8);
                        }
                        msk0 msk0Var = new msk0(str2, str3, j2, j3, j5, j4, j6, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            y4l0 y4l0Var = k8l0Var.f;
                            k8l0.m(y4l0Var);
                            y4l0Var.f.b(y4l0.k(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return msk0Var;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    y4l0 y4l0Var2 = k8l0Var.f;
                    k8l0.m(y4l0Var2);
                    y4l0Var2.f.d(y4l0.k(str2), "Error querying events. appId", k8l0Var.j.a(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                r3 = arrayList;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void F(String str, msk0 msk0Var) {
        k8l0 k8l0Var = this.a;
        hm20.h(msk0Var);
        g();
        h();
        ContentValues contentValues = new ContentValues();
        String str2 = msk0Var.a;
        contentValues.put(PublisherMetadata.APP_ID, str2);
        contentValues.put("name", msk0Var.b);
        contentValues.put("lifetime_count", Long.valueOf(msk0Var.c));
        contentValues.put("current_bundle_count", Long.valueOf(msk0Var.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(msk0Var.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(msk0Var.g));
        contentValues.put("last_bundled_day", msk0Var.h);
        contentValues.put("last_sampled_complex_event_id", msk0Var.i);
        contentValues.put("last_sampling_rate", msk0Var.j);
        contentValues.put("current_session_count", Long.valueOf(msk0Var.e));
        Boolean bool = msk0Var.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (V().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.f.b(y4l0.k(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.c(y4l0.k(str2), "Error storing event aggregates. appId", e);
        }
    }

    public final void G(String str, String str2) {
        hm20.e(str2);
        g();
        h();
        try {
            V().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.c(y4l0.k(str2), "Error deleting snapshot. appId", e);
        }
    }

    public final nol0 H(String str, long j2, byte[] bArr, String str2, String str3, int i2, int i3, long j3, long j4, long j5) {
        egl0 egl0Var;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        k8l0 k8l0Var = this.a;
        if (zIsEmpty) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.m.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            q7l0 q7l0Var = (q7l0) pol0.O(j8l0.x(), bArr);
            egl0[] egl0VarArrValues = egl0.values();
            int length = egl0VarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    egl0Var = egl0.UNKNOWN;
                    break;
                }
                egl0Var = egl0VarArrValues[i4];
                if (egl0Var.a == i2) {
                    break;
                }
                i4++;
            }
            if (egl0Var != egl0.GOOGLE_SIGNAL && egl0Var != egl0.GOOGLE_SIGNAL_PENDING && i3 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((j8l0) q7l0Var.b).q()).iterator();
                while (it.hasNext()) {
                    l8l0 l8l0Var = (l8l0) ((n8l0) it.next()).k();
                    l8l0Var.g();
                    ((n8l0) l8l0Var.b).U0(i3);
                    arrayList.add((n8l0) l8l0Var.i());
                }
                q7l0Var.g();
                ((j8l0) q7l0Var.b).C();
                q7l0Var.g();
                ((j8l0) q7l0Var.b).B(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        y4l0 y4l0Var2 = k8l0Var.f;
                        k8l0.m(y4l0Var2);
                        y4l0Var2.f.b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new nol0(j2, (j8l0) q7l0Var.i(), str2, map, egl0Var, j3, j4, j5, i3);
        } catch (IOException e) {
            y4l0 y4l0Var3 = k8l0Var.f;
            k8l0.m(y4l0Var3);
            y4l0Var3.f.c(str, "Failed to queued MeasurementBatch from upload_queue. appId", e);
            return null;
        }
    }

    public final String I() {
        this.a.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l2 = (Long) v2l0.S.a(null);
        l2.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l2 + ")";
        String strA = nrz.a(((Long) v2l0.R.a(null)).longValue(), ")", q6a0.a(jCurrentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "));
        StringBuilder sb = new StringBuilder(str.length() + 5 + strA.length() + 1);
        hxa.c(sb, "(", str, " OR ", strA);
        sb.append(")");
        return sb.toString();
    }

    public final void K(String str, jbl0 jbl0Var) {
        hm20.h(str);
        g();
        h();
        B(str, z(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("storage_consent_at_bundling", jbl0Var.g());
        D(contentValues);
    }

    public final jbl0 L(String str) {
        hm20.h(str);
        g();
        h();
        return jbl0.c(100, C("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final msk0 M(String str, d7l0 d7l0Var, String str2) {
        msk0 msk0VarE = E("events", str, d7l0Var.t());
        if (msk0VarE != null) {
            long j2 = msk0VarE.e + 1;
            long j3 = msk0VarE.d + 1;
            return new msk0(msk0VarE.a, msk0VarE.b, msk0VarE.c + 1, j3, j2, msk0VarE.f, msk0VarE.g, msk0VarE.h, msk0VarE.i, msk0VarE.j, msk0VarE.k);
        }
        k8l0 k8l0Var = this.a;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        y4l0Var.i.c(y4l0.k(str), "Event aggregate wasn't created during raw event logging. appId, event", k8l0Var.j.a(str2));
        return new msk0(str, d7l0Var.t(), 1L, 1L, 1L, d7l0Var.v(), 0L, null, null, null, null);
    }

    public final boolean N() {
        return this.a.a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0245  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5 A[Catch: all -> 0x0077, SQLiteException -> 0x0079, TryCatch #0 {SQLiteException -> 0x0079, blocks: (B:19:0x006f, B:45:0x00cd, B:47:0x00f5, B:48:0x0107, B:49:0x010b, B:50:0x011b, B:52:0x0121, B:53:0x0131, B:56:0x0144, B:68:0x016b, B:71:0x0173, B:77:0x0192, B:61:0x015a, B:75:0x0184, B:76:0x018d, B:98:0x021e), top: B:111:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0107 A[Catch: all -> 0x0077, SQLiteException -> 0x0079, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x0079, blocks: (B:19:0x006f, B:45:0x00cd, B:47:0x00f5, B:48:0x0107, B:49:0x010b, B:50:0x011b, B:52:0x0121, B:53:0x0131, B:56:0x0144, B:68:0x016b, B:71:0x0173, B:77:0x0192, B:61:0x015a, B:75:0x0184, B:76:0x018d, B:98:0x021e), top: B:111:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0121 A[Catch: all -> 0x0077, SQLiteException -> 0x0079, TryCatch #0 {SQLiteException -> 0x0079, blocks: (B:19:0x006f, B:45:0x00cd, B:47:0x00f5, B:48:0x0107, B:49:0x010b, B:50:0x011b, B:52:0x0121, B:53:0x0131, B:56:0x0144, B:68:0x016b, B:71:0x0173, B:77:0x0192, B:61:0x015a, B:75:0x0184, B:76:0x018d, B:98:0x021e), top: B:111:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0144 A[Catch: all -> 0x0077, SQLiteException -> 0x0079, TRY_ENTER, TryCatch #0 {SQLiteException -> 0x0079, blocks: (B:19:0x006f, B:45:0x00cd, B:47:0x00f5, B:48:0x0107, B:49:0x010b, B:50:0x011b, B:52:0x0121, B:53:0x0131, B:56:0x0144, B:68:0x016b, B:71:0x0173, B:77:0x0192, B:61:0x015a, B:75:0x0184, B:76:0x018d, B:98:0x021e), top: B:111:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:60:0x0158  */
    /* JADX WARN: Code duplicated, block: B:61:0x015a A[Catch: all -> 0x0077, SQLiteException -> 0x0079, TryCatch #0 {SQLiteException -> 0x0079, blocks: (B:19:0x006f, B:45:0x00cd, B:47:0x00f5, B:48:0x0107, B:49:0x010b, B:50:0x011b, B:52:0x0121, B:53:0x0131, B:56:0x0144, B:68:0x016b, B:71:0x0173, B:77:0x0192, B:61:0x015a, B:75:0x0184, B:76:0x018d, B:98:0x021e), top: B:111:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:69:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0172  */
    /* JADX WARN: Code duplicated, block: B:73:0x017e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184 A[Catch: all -> 0x0077, SQLiteException -> 0x0079, TryCatch #0 {SQLiteException -> 0x0079, blocks: (B:19:0x006f, B:45:0x00cd, B:47:0x00f5, B:48:0x0107, B:49:0x010b, B:50:0x011b, B:52:0x0121, B:53:0x0131, B:56:0x0144, B:68:0x016b, B:71:0x0173, B:77:0x0192, B:61:0x015a, B:75:0x0184, B:76:0x018d, B:98:0x021e), top: B:111:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:76:0x018d A[Catch: all -> 0x0077, SQLiteException -> 0x0079, TryCatch #0 {SQLiteException -> 0x0079, blocks: (B:19:0x006f, B:45:0x00cd, B:47:0x00f5, B:48:0x0107, B:49:0x010b, B:50:0x011b, B:52:0x0121, B:53:0x0131, B:56:0x0144, B:68:0x016b, B:71:0x0173, B:77:0x0192, B:61:0x015a, B:75:0x0184, B:76:0x018d, B:98:0x021e), top: B:111:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01b0 A[Catch: all -> 0x01ee, SQLiteException -> 0x01f0, LOOP:0: B:80:0x01b0->B:127:?, LOOP_START, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x01f0, blocks: (B:78:0x01aa, B:80:0x01b0, B:81:0x01b9, B:83:0x01c4, B:92:0x0204, B:91:0x01f3, B:95:0x020b), top: B:116:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0204 A[Catch: all -> 0x01ee, SQLiteException -> 0x01f0, TryCatch #4 {SQLiteException -> 0x01f0, blocks: (B:78:0x01aa, B:80:0x01b0, B:81:0x01b9, B:83:0x01c4, B:92:0x0204, B:91:0x01f3, B:95:0x020b), top: B:116:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:95:0x020b A[Catch: all -> 0x01ee, SQLiteException -> 0x01f0, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x01f0, blocks: (B:78:0x01aa, B:80:0x01b0, B:81:0x01b9, B:83:0x01c4, B:92:0x0204, B:91:0x01f3, B:95:0x020b), top: B:116:0x01aa }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void O(String str, long j2, long j3, aol0 aol0Var) throws Throwable {
        ?? r9;
        ?? r4;
        Cursor cursorRawQuery;
        String str2;
        String[] strArr;
        String string;
        ?? r5;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str3;
        long j4;
        b7l0 b7l0Var;
        long jR;
        long j5;
        String string2;
        k8l0 k8l0Var = this.a;
        g();
        h();
        ?? r7 = 0;
        cursorQuery = null;
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseV = V();
                ?? IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                try {
                    if (IsEmpty != 0) {
                        String[] strArr5 = j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)};
                        str4 = j3 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb = new StringBuilder(str4.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str4);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseV.rawQuery(sb.toString(), strArr5);
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                string2 = cursorRawQuery.getString(0);
                                try {
                                    string = cursorRawQuery.getString(1);
                                    cursorRawQuery.close();
                                    r5 = string2;
                                    cursorRawQuery = sQLiteDatabaseV.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r5, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        try {
                                            n8l0 n8l0Var = (n8l0) ((l8l0) pol0.O(n8l0.V(), cursorRawQuery.getBlob(0))).i();
                                            if (cursorRawQuery.moveToNext()) {
                                                y4l0 y4l0Var = k8l0Var.f;
                                                k8l0.m(y4l0Var);
                                                y4l0Var.i.b(y4l0.k(r5), "Get multiple raw event metadata records, expected one. appId");
                                            }
                                            cursorRawQuery.close();
                                            aol0Var.a = n8l0Var;
                                            if (k8l0Var.d.q(null, v2l0.k1)) {
                                                jR = R("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r5, string}, -1L);
                                                if (j3 == -1) {
                                                    j5 = j3;
                                                } else if (jR != -1) {
                                                    j5 = -1;
                                                } else {
                                                    strArr2 = new String[]{r5, string};
                                                    strArr4 = strArr2;
                                                    str3 = "app_id = ? and metadata_fingerprint = ?";
                                                }
                                                if (j5 == -1 && jR != -1) {
                                                    jR = Math.min(j5, jR);
                                                } else if (j5 != -1) {
                                                    jR = j5;
                                                }
                                                strArr3 = new String[]{r5, string, String.valueOf(jR)};
                                                strArr4 = strArr3;
                                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else if (j3 != -1) {
                                                strArr3 = new String[]{r5, string, String.valueOf(j3)};
                                                strArr4 = strArr3;
                                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else {
                                                strArr2 = new String[]{r5, string};
                                                strArr4 = strArr2;
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                            }
                                            cursorQuery = sQLiteDatabaseV.query("raw_events", new String[]{"rowid", "name", EventKeys.TIMESTAMP, "data"}, str3, strArr4, null, null, "rowid", null);
                                            try {
                                                if (cursorQuery.moveToFirst()) {
                                                    do {
                                                        j4 = cursorQuery.getLong(0);
                                                        try {
                                                            b7l0Var = (b7l0) pol0.O(d7l0.A(), cursorQuery.getBlob(3));
                                                            String string3 = cursorQuery.getString(1);
                                                            b7l0Var.g();
                                                            ((d7l0) b7l0Var.b).G(string3);
                                                            long j6 = cursorQuery.getLong(2);
                                                            b7l0Var.g();
                                                            ((d7l0) b7l0Var.b).H(j6);
                                                            if (!aol0Var.a(j4, (d7l0) b7l0Var.i())) {
                                                                break;
                                                            }
                                                        } catch (IOException e) {
                                                            y4l0 y4l0Var2 = k8l0Var.f;
                                                            k8l0.m(y4l0Var2);
                                                            y4l0Var2.f.c(y4l0.k(r5), "Data loss. Failed to merge raw event. appId", e);
                                                        }
                                                    } while (cursorQuery.moveToNext());
                                                } else {
                                                    y4l0 y4l0Var3 = k8l0Var.f;
                                                    k8l0.m(y4l0Var3);
                                                    y4l0Var3.i.b(y4l0.k(r5), "Raw event data disappeared while in transaction. appId");
                                                }
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                r4 = r5;
                                                y4l0 y4l0Var4 = k8l0Var.f;
                                                k8l0.m(y4l0Var4);
                                                y4l0Var4.f.c(y4l0.k(r4), "Data loss. Error selecting raw event. appId", e);
                                            }
                                            cursorRawQuery = cursorQuery;
                                        } catch (IOException e3) {
                                            y4l0 y4l0Var5 = k8l0Var.f;
                                            k8l0.m(y4l0Var5);
                                            y4l0Var5.f.c(y4l0.k(r5), "Data loss. Failed to merge raw event metadata. appId", e3);
                                        }
                                    } else {
                                        y4l0 y4l0Var6 = k8l0Var.f;
                                        k8l0.m(y4l0Var6);
                                        y4l0Var6.f.b(y4l0.k(r5), "Raw event metadata record is missing. appId");
                                    }
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    cursorQuery = cursorRawQuery;
                                    r4 = string2;
                                    y4l0 y4l0Var7 = k8l0Var.f;
                                    k8l0.m(y4l0Var7);
                                    y4l0Var7.f.c(y4l0.k(r4), "Data loss. Error selecting raw event. appId", e);
                                    cursorRawQuery = cursorQuery;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                            string2 = str;
                        }
                    } else {
                        try {
                            if (j3 != -1) {
                                String str5 = str;
                                strArr = new String[]{str5, String.valueOf(j3)};
                                IsEmpty = str5;
                            } else {
                                str2 = str;
                                strArr = new String[]{str2};
                            }
                            if (j3 != -1) {
                                IsEmpty = str2;
                                str4 = " and rowid <= ?";
                            }
                            IsEmpty = str2;
                            StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                            sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                            sb2.append(str4);
                            sb2.append(" order by rowid limit 1;");
                            cursorRawQuery = sQLiteDatabaseV.rawQuery(sb2.toString(), strArr);
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    string = cursorRawQuery.getString(0);
                                    cursorRawQuery.close();
                                    r5 = IsEmpty;
                                    cursorRawQuery = sQLiteDatabaseV.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r5, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        y4l0 y4l0Var8 = k8l0Var.f;
                                        k8l0.m(y4l0Var8);
                                        y4l0Var8.f.b(y4l0.k(r5), "Raw event metadata record is missing. appId");
                                    } else {
                                        n8l0 n8l0Var2 = (n8l0) ((l8l0) pol0.O(n8l0.V(), cursorRawQuery.getBlob(0))).i();
                                        if (cursorRawQuery.moveToNext()) {
                                            y4l0 y4l0Var9 = k8l0Var.f;
                                            k8l0.m(y4l0Var9);
                                            y4l0Var9.i.b(y4l0.k(r5), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        aol0Var.a = n8l0Var2;
                                        if (k8l0Var.d.q(null, v2l0.k1)) {
                                            jR = R("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r5, string}, -1L);
                                            if (j3 == -1) {
                                                j5 = j3;
                                            } else if (jR != -1) {
                                                j5 = -1;
                                            } else {
                                                strArr2 = new String[]{r5, string};
                                                strArr4 = strArr2;
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                            }
                                            if (j5 == -1) {
                                                if (j5 != -1) {
                                                    jR = j5;
                                                }
                                            } else if (j5 != -1) {
                                                jR = j5;
                                            }
                                            strArr3 = new String[]{r5, string, String.valueOf(jR)};
                                            strArr4 = strArr3;
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else if (j3 != -1) {
                                            strArr3 = new String[]{r5, string, String.valueOf(j3)};
                                            strArr4 = strArr3;
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else {
                                            strArr2 = new String[]{r5, string};
                                            strArr4 = strArr2;
                                            str3 = "app_id = ? and metadata_fingerprint = ?";
                                        }
                                        cursorQuery = sQLiteDatabaseV.query("raw_events", new String[]{"rowid", "name", EventKeys.TIMESTAMP, "data"}, str3, strArr4, null, null, "rowid", null);
                                        if (cursorQuery.moveToFirst()) {
                                            do {
                                                j4 = cursorQuery.getLong(0);
                                                b7l0Var = (b7l0) pol0.O(d7l0.A(), cursorQuery.getBlob(3));
                                                String string4 = cursorQuery.getString(1);
                                                b7l0Var.g();
                                                ((d7l0) b7l0Var.b).G(string4);
                                                long j7 = cursorQuery.getLong(2);
                                                b7l0Var.g();
                                                ((d7l0) b7l0Var.b).H(j7);
                                                if (!aol0Var.a(j4, (d7l0) b7l0Var.i())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorQuery.moveToNext());
                                        } else {
                                            y4l0 y4l0Var10 = k8l0Var.f;
                                            k8l0.m(y4l0Var10);
                                            y4l0Var10.i.b(y4l0.k(r5), "Raw event data disappeared while in transaction. appId");
                                        }
                                        cursorRawQuery = cursorQuery;
                                    }
                                }
                            } catch (SQLiteException e6) {
                                e = e6;
                                cursorQuery = cursorRawQuery;
                                r9 = IsEmpty;
                                r4 = r9;
                                y4l0 y4l0Var11 = k8l0Var.f;
                                k8l0.m(y4l0Var11);
                                y4l0Var11.f.c(y4l0.k(r4), "Data loss. Error selecting raw event. appId", e);
                                cursorRawQuery = cursorQuery;
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            r9 = IsEmpty;
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    r7 = " order by rowid limit 1;";
                    if (r7 != 0) {
                        r7.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e8) {
                e = e8;
                r9 = str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final long Q(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = V().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                y4l0 y4l0Var = this.a.f;
                k8l0.m(y4l0Var);
                y4l0Var.f.c(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long R(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = V().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j2 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                y4l0 y4l0Var = this.a.f;
                k8l0.m(y4l0Var);
                y4l0Var.f.c(str, "Database error", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void S() {
        h();
        V().beginTransaction();
    }

    public final void T() {
        h();
        V().setTransactionSuccessful();
    }

    public final void U() {
        h();
        V().endTransaction();
    }

    public final SQLiteDatabase V() {
        g();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.b(e, "Error opening database");
            throw e;
        }
    }

    public final void W(String str) {
        msk0 msk0VarE;
        G("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = V().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (msk0VarE = E("events", str, string)) != null) {
                            F("events_snapshot", msk0VarE);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                y4l0 y4l0Var = this.a.f;
                k8l0.m(y4l0Var);
                y4l0Var.f.c(y4l0.k(str), "Error creating snapshot. appId", e);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public final void X(String str) throws Throwable {
        boolean z;
        msk0 msk0VarE;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        msk0 msk0VarE2 = E("events", str, "_f");
        msk0 msk0VarE3 = E("events", str, "_v");
        G("events", str);
        Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = V().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (msk0VarE = E("events_snapshot", str, string)) != null) {
                            F("events", msk0VarE);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z2 = z3;
                        try {
                            y4l0 y4l0Var = this.a.f;
                            k8l0.m(y4l0Var);
                            y4l0Var.f.c(y4l0.k(str), "Error querying snapshot. appId", e);
                            z3 = z2;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && msk0VarE2 != null) {
                                F("events", msk0VarE2);
                            } else if (!z && msk0VarE3 != null) {
                                F("events", msk0VarE3);
                            }
                            G("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                F("events", msk0VarE3);
                            }
                        } else if (!z) {
                            F("events", msk0VarE3);
                        }
                        G("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && msk0VarE2 != null) {
                    F("events", msk0VarE2);
                } else if (!z && msk0VarE3 != null) {
                    F("events", msk0VarE3);
                }
            } else {
                cursorQuery.close();
                if (msk0VarE2 != null) {
                    F("events", msk0VarE2);
                } else if (msk0VarE3 != null) {
                    F("events", msk0VarE3);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        G("events_snapshot", str);
    }

    public final void Y(String str, String str2) {
        hm20.e(str);
        hm20.e(str2);
        g();
        h();
        try {
            V().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            k8l0 k8l0Var = this.a;
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.d(y4l0.k(str), "Error deleting user property. appId", k8l0Var.j.c(str2), e);
        }
    }

    public final boolean Z(uol0 uol0Var) {
        String str = uol0Var.b;
        g();
        h();
        String str2 = uol0Var.a;
        String str3 = uol0Var.c;
        uol0 uol0VarA0 = a0(str2, str3);
        k8l0 k8l0Var = this.a;
        if (uol0VarA0 == null) {
            if (yol0.f0(str3)) {
                if (Q("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(k8l0Var.d.o(str2, v2l0.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jQ = Q("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                wok0 wok0Var = k8l0Var.d;
                if (jQ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(uol0Var.d));
        P(contentValues, uol0Var.e);
        try {
            if (V().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.b(y4l0.k(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.c(y4l0.k(str2), "Error storing user property. appId", e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    public final uol0 a0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        k8l0 k8l0Var = this.a;
        hm20.e(str);
        hm20.e(str2);
        g();
        h();
        Cursor cursor = null;
        try {
            cursorQuery = V().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(0);
                        Object objT = t(cursorQuery, 1);
                        if (objT != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                uol0 uol0Var = new uol0(str3, cursorQuery.getString(2), str4, j2, objT);
                                if (cursorQuery.moveToNext()) {
                                    y4l0 y4l0Var = k8l0Var.f;
                                    k8l0.m(y4l0Var);
                                    y4l0Var.f.b(y4l0.k(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return uol0Var;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        y4l0 y4l0Var2 = k8l0Var.f;
                        k8l0.m(y4l0Var2);
                        y4l0Var2.f.d(y4l0.k(str3), "Error querying user property. appId", k8l0Var.j.c(str4), sQLiteException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    public final List b0(String str) {
        String str2;
        SQLiteException sQLiteException;
        k8l0 k8l0Var = this.a;
        hm20.e(str);
        g();
        h();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                wok0 wok0Var = k8l0Var.d;
                cursorQuery = V().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j2 = cursorQuery.getLong(2);
                        Object objT = t(cursorQuery, 3);
                        if (objT == null) {
                            try {
                                y4l0 y4l0Var = k8l0Var.f;
                                k8l0.m(y4l0Var);
                                y4l0Var.f.b(y4l0.k(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                y4l0 y4l0Var2 = k8l0Var.f;
                                k8l0.m(y4l0Var2);
                                y4l0Var2.f.c(y4l0.k(str2), "Error querying user properties. appId", sQLiteException);
                                arrayList = Collections.EMPTY_LIST;
                            }
                        } else {
                            str2 = str;
                            arrayList.add(new uol0(str2, str3, string, j2, objT));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteException = e;
                            y4l0 y4l0Var3 = k8l0Var.f;
                            k8l0.m(y4l0Var3);
                            y4l0Var3.f.c(y4l0.k(str2), "Error querying user properties. appId", sQLiteException);
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                str2 = str;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final boolean d0(zzah zzahVar) {
        g();
        h();
        String str = zzahVar.a;
        hm20.h(str);
        uol0 uol0VarA0 = a0(str, zzahVar.c.b);
        k8l0 k8l0Var = this.a;
        if (uol0VarA0 == null) {
            long jQ = Q("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            wok0 wok0Var = k8l0Var.d;
            if (jQ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("origin", zzahVar.b);
        contentValues.put("name", zzahVar.c.b);
        Object objG0 = zzahVar.c.G0();
        hm20.h(objG0);
        P(contentValues, objG0);
        contentValues.put("active", Boolean.valueOf(zzahVar.e));
        contentValues.put("trigger_event_name", zzahVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.v));
        zzbg zzbgVar = zzahVar.i;
        yol0 yol0Var = k8l0Var.i;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.k(yol0Var);
        contentValues.put("timed_out_event", yol0.L(zzbgVar));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.d));
        k8l0.k(yol0Var);
        contentValues.put("triggered_event", yol0.L(zzahVar.w));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.y));
        contentValues.put("expired_event", yol0.L(zzahVar.z));
        try {
            if (V().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            k8l0.m(y4l0Var);
            y4l0Var.f.b(y4l0.k(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            k8l0.m(y4l0Var);
            y4l0Var.f.c(y4l0.k(str), "Error storing conditional user property", e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00ed: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:238), block:B:29:0x00ed */
    public final zzah e0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        k8l0 k8l0Var = this.a;
        hm20.e(str);
        hm20.e(str2);
        g();
        h();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = V().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objT = t(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j2 = cursorQuery.getLong(4);
                    pol0 pol0Var = this.b.g;
                    iol0.U(pol0Var);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                    zzbg zzbgVar = (zzbg) pol0Var.G(blob, creator);
                    long j3 = cursorQuery.getLong(6);
                    iol0.U(pol0Var);
                    zzbg zzbgVar2 = (zzbg) pol0Var.G(cursorQuery.getBlob(7), creator);
                    long j4 = cursorQuery.getLong(8);
                    long j5 = cursorQuery.getLong(9);
                    iol0.U(pol0Var);
                    str3 = str2;
                    try {
                        zzah zzahVar = new zzah(str, str4, new zzpl(j4, objT, str3, str4), j3, z, string2, zzbgVar, j2, zzbgVar2, j5, (zzbg) pol0Var.G(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            y4l0 y4l0Var = k8l0Var.f;
                            k8l0.m(y4l0Var);
                            y4l0Var.f.c(y4l0.k(str), "Got multiple records for conditional property, expected one", k8l0Var.j.c(str3));
                        }
                        cursorQuery.close();
                        return zzahVar;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        y4l0 y4l0Var2 = k8l0Var.f;
        k8l0.m(y4l0Var2);
        y4l0Var2.f.d(y4l0.k(str), "Error querying conditional property", k8l0Var.j.c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void f0(String str, String str2) {
        hm20.e(str);
        hm20.e(str2);
        g();
        h();
        try {
            V().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            k8l0 k8l0Var = this.a;
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.d(y4l0.k(str), "Error deleting conditional property", k8l0Var.j.c(str2), e);
        }
    }

    public final List g0(String str, String str2, String str3) {
        hm20.e(str);
        g();
        h();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return h0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public final List h0(String str, String[] strArr) {
        k8l0 k8l0Var = this.a;
        g();
        h();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseV = V();
                String[] strArr2 = {PublisherMetadata.APP_ID, "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                wok0 wok0Var = k8l0Var.d;
                cursorQuery = sQLiteDatabaseV.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            y4l0 y4l0Var = k8l0Var.f;
                            k8l0.m(y4l0Var);
                            y4l0Var.f.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objT = t(cursorQuery, 3);
                        boolean z = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j2 = cursorQuery.getLong(6);
                        pol0 pol0Var = this.b.g;
                        iol0.U(pol0Var);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                        zzbg zzbgVar = (zzbg) pol0Var.G(blob, creator);
                        long j3 = cursorQuery.getLong(8);
                        iol0.U(pol0Var);
                        zzbg zzbgVar2 = (zzbg) pol0Var.G(cursorQuery.getBlob(9), creator);
                        long j4 = cursorQuery.getLong(10);
                        long j5 = cursorQuery.getLong(11);
                        iol0.U(pol0Var);
                        arrayList.add(new zzah(string, string2, new zzpl(j4, objT, string3, string2), j3, z, string4, zzbgVar, j2, zzbgVar2, j5, (zzbg) pol0Var.G(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.f.b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x03ea  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x03cc: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:973), block:B:116:0x03cc */
    public final k5l0 i0(String str) {
        Cursor cursorQuery;
        Cursor cursor;
        Boolean boolValueOf;
        String string;
        k8l0 k8l0Var = this.a;
        hm20.e(str);
        g();
        h();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = V().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        iol0 iol0Var = this.b;
                        k5l0 k5l0Var = new k5l0(iol0Var.l, str);
                        k8l0 k8l0Var2 = k5l0Var.a;
                        jbl0 jbl0VarF = iol0Var.f(str);
                        hbl0 hbl0Var = hbl0.ANALYTICS_STORAGE;
                        if (jbl0VarF.i(hbl0Var)) {
                            k5l0Var.F(cursorQuery.getString(0));
                        }
                        boolean z = true;
                        k5l0Var.H(cursorQuery.getString(1));
                        if (iol0Var.f(str).i(hbl0.AD_STORAGE)) {
                            k5l0Var.I(cursorQuery.getString(2));
                        }
                        k5l0Var.e(cursorQuery.getLong(3));
                        k5l0Var.L(cursorQuery.getLong(4));
                        k5l0Var.M(cursorQuery.getLong(5));
                        k5l0Var.O(cursorQuery.getString(6));
                        k5l0Var.R(cursorQuery.getString(7));
                        k5l0Var.S(cursorQuery.getLong(8));
                        k5l0Var.a(cursorQuery.getLong(9));
                        k5l0Var.d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        k5l0Var.i(cursorQuery.getLong(11));
                        k5l0Var.j(cursorQuery.getLong(12));
                        k5l0Var.k(cursorQuery.getLong(13));
                        k5l0Var.l(cursorQuery.getLong(14));
                        k5l0Var.f(cursorQuery.getLong(15));
                        k5l0Var.g(cursorQuery.getLong(16));
                        k5l0Var.Q(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        k5l0Var.K(cursorQuery.getString(18));
                        k5l0Var.n(cursorQuery.getLong(19));
                        k5l0Var.m(cursorQuery.getLong(20));
                        k5l0Var.v(cursorQuery.getString(21));
                        boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        p7l0 p7l0Var = k8l0Var2.g;
                        k8l0.m(p7l0Var);
                        p7l0Var.g();
                        k5l0Var.Q |= k5l0Var.p != z2;
                        k5l0Var.p = z2;
                        k5l0Var.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            k5l0Var.x(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (iol0Var.f(str).i(hbl0Var)) {
                            String string2 = cursorQuery.getString(28);
                            p7l0 p7l0Var2 = k8l0Var2.g;
                            k8l0.m(p7l0Var2);
                            p7l0Var2.g();
                            k5l0Var.Q |= !Objects.equals(k5l0Var.t, string2);
                            k5l0Var.t = string2;
                        }
                        boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        p7l0 p7l0Var3 = k8l0Var2.g;
                        k8l0.m(p7l0Var3);
                        p7l0Var3.g();
                        k5l0Var.Q |= k5l0Var.u != z3;
                        k5l0Var.u = z3;
                        k5l0Var.r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        p7l0 p7l0Var4 = k8l0Var2.g;
                        k8l0.m(p7l0Var4);
                        p7l0Var4.g();
                        k5l0Var.Q |= k5l0Var.C != string3;
                        k5l0Var.C = string3;
                        k5l0Var.z(cursorQuery.getLong(30));
                        k5l0Var.A(cursorQuery.getLong(31));
                        kql0.a();
                        if (k8l0Var.d.q(str, v2l0.P0)) {
                            int i2 = cursorQuery.getInt(32);
                            p7l0 p7l0Var5 = k8l0Var2.g;
                            k8l0.m(p7l0Var5);
                            p7l0Var5.g();
                            k5l0Var.Q |= k5l0Var.x != i2;
                            k5l0Var.x = i2;
                            k5l0Var.B(cursorQuery.getLong(35));
                        }
                        boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        p7l0 p7l0Var6 = k8l0Var2.g;
                        k8l0.m(p7l0Var6);
                        p7l0Var6.g();
                        k5l0Var.Q |= k5l0Var.y != z4;
                        k5l0Var.y = z4;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        p7l0 p7l0Var7 = k8l0Var2.g;
                        k8l0.m(p7l0Var7);
                        p7l0Var7.g();
                        k5l0Var.Q |= !Objects.equals(k5l0Var.q, boolValueOf);
                        k5l0Var.q = boolValueOf;
                        k5l0Var.p(cursorQuery.getInt(37));
                        k5l0Var.q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            hm20.h(string);
                        }
                        p7l0 p7l0Var8 = k8l0Var2.g;
                        k8l0.m(p7l0Var8);
                        p7l0Var8.g();
                        k5l0Var.Q |= k5l0Var.G != string;
                        k5l0Var.G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            p7l0 p7l0Var9 = k8l0Var2.g;
                            k8l0.m(p7l0Var9);
                            p7l0Var9.g();
                            k5l0Var.Q |= !Objects.equals(k5l0Var.z, lValueOf);
                            k5l0Var.z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            p7l0 p7l0Var10 = k8l0Var2.g;
                            k8l0.m(p7l0Var10);
                            p7l0Var10.g();
                            k5l0Var.Q |= !Objects.equals(k5l0Var.A, lValueOf2);
                            k5l0Var.A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        p7l0 p7l0Var11 = k8l0Var2.g;
                        k8l0.m(p7l0Var11);
                        p7l0Var11.g();
                        k5l0Var.Q |= k5l0Var.H != blob;
                        k5l0Var.H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i3 = cursorQuery.getInt(44);
                            p7l0 p7l0Var12 = k8l0Var2.g;
                            k8l0.m(p7l0Var12);
                            p7l0Var12.g();
                            boolean z5 = k5l0Var.Q;
                            if (k5l0Var.I == i3) {
                                z = false;
                            }
                            k5l0Var.Q = z | z5;
                            k5l0Var.I = i3;
                        }
                        p7l0 p7l0Var13 = k8l0Var2.g;
                        k8l0.m(p7l0Var13);
                        p7l0Var13.g();
                        k5l0Var.Q = false;
                        if (cursorQuery.moveToNext()) {
                            y4l0 y4l0Var = k8l0Var.f;
                            k8l0.m(y4l0Var);
                            y4l0Var.f.b(y4l0.k(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return k5l0Var;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    y4l0 y4l0Var2 = k8l0Var.f;
                    k8l0.m(y4l0Var2);
                    y4l0Var2.f.c(y4l0.k(str), "Error querying app. appId", e);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @Override // defpackage.vml0
    public final void j() {
    }

    public final long k(String str, j8l0 j8l0Var, String str2, Map map, egl0 egl0Var, Long l2) {
        int iDelete;
        g();
        h();
        hm20.h(j8l0Var);
        hm20.e(str);
        g();
        h();
        boolean zN = N();
        k8l0 k8l0Var = this.a;
        if (zN) {
            iol0 iol0Var = this.b;
            long jA = iol0Var.i.f.a();
            xi9 xi9Var = k8l0Var.k;
            y4l0 y4l0Var = k8l0Var.f;
            xi9Var.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) v2l0.M.a(null)).longValue()) {
                iol0Var.i.f.b(jElapsedRealtime);
                g();
                h();
                if (N() && (iDelete = V().delete("upload_queue", I(), new String[0])) > 0) {
                    k8l0.m(y4l0Var);
                    y4l0Var.n.b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                hm20.e(str);
                g();
                h();
                try {
                    int iO = k8l0Var.d.o(str, v2l0.A);
                    if (iO > 0) {
                        V().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iO)});
                    }
                } catch (SQLiteException e) {
                    k8l0.m(y4l0Var);
                    y4l0Var.f.c(y4l0.k(str), "Error deleting over the limit queued batches. appId", e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrE = j8l0Var.e();
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("measurement_batch", bArrE);
        contentValues.put("upload_uri", str2);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "\r\n");
            }
        }
        contentValues.put("upload_headers", sb2.toString());
        contentValues.put("upload_type", Integer.valueOf(egl0Var.a));
        xi9 xi9Var2 = k8l0Var.k;
        y4l0 y4l0Var2 = k8l0Var.f;
        xi9Var2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l2 != null) {
            contentValues.put("associated_row_id", l2);
        }
        try {
            long jInsert = V().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            k8l0.m(y4l0Var2);
            y4l0Var2.f.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            k8l0.m(y4l0Var2);
            y4l0Var2.f.c(str, "Error storing MeasurementBatch to upload_queue. appId", e2);
            return -1L;
        }
    }

    public final wpk0 k0(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return l0(j2, str, 1L, false, false, z, false, z2, z3, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List l(String str, zzoo zzooVar, int i2) {
        ?? arrayList;
        hm20.e(str);
        g();
        h();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseV = V();
            String[] strArr = {"rowId", PublisherMetadata.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strJ = J(zzooVar.a);
            String strI = I();
            StringBuilder sb = new StringBuilder(strJ.length() + 17 + strI.length());
            sb.append("app_id=?");
            sb.append(strJ);
            sb.append(" AND NOT ");
            sb.append(strI);
            cursorQuery = sQLiteDatabaseV.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i2 > 0 ? String.valueOf(i2) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                nol0 nol0VarH = H(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (nol0VarH != null) {
                    arrayList.add(nol0VarH);
                }
            }
        } catch (SQLiteException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.c(str, "Error to querying MeasurementBatch from upload_queue. appId", e);
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final wpk0 l0(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        k8l0 k8l0Var = this.a;
        hm20.e(str);
        g();
        h();
        String[] strArr = {str};
        wpk0 wpk0Var = new wpk0();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseV = V();
                cursorQuery = sQLiteDatabaseV.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j2) {
                        wpk0Var.b = cursorQuery.getLong(1);
                        wpk0Var.a = cursorQuery.getLong(2);
                        wpk0Var.c = cursorQuery.getLong(3);
                        wpk0Var.d = cursorQuery.getLong(4);
                        wpk0Var.e = cursorQuery.getLong(5);
                        wpk0Var.f = cursorQuery.getLong(6);
                        wpk0Var.g = cursorQuery.getLong(7);
                    }
                    if (z) {
                        wpk0Var.b += j3;
                    }
                    if (z2) {
                        wpk0Var.a += j3;
                    }
                    if (z3) {
                        wpk0Var.c += j3;
                    }
                    if (z4) {
                        wpk0Var.d += j3;
                    }
                    if (z5) {
                        wpk0Var.e += j3;
                    }
                    if (z6) {
                        wpk0Var.f += j3;
                    }
                    if (z7) {
                        wpk0Var.g += j3;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j2));
                    contentValues.put("daily_public_events_count", Long.valueOf(wpk0Var.a));
                    contentValues.put("daily_events_count", Long.valueOf(wpk0Var.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(wpk0Var.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(wpk0Var.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(wpk0Var.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(wpk0Var.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(wpk0Var.g));
                    sQLiteDatabaseV.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    y4l0 y4l0Var = k8l0Var.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.i.b(y4l0.k(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.f.c(y4l0.k(str), "Error updating daily counts. appId", e);
            }
            return wpk0Var;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public final boolean m(String str) {
        egl0[] egl0VarArr = {egl0.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(egl0VarArr[0].a));
        String strJ = J(arrayList);
        String strI = I();
        return Q(kwi.a(new StringBuilder((strJ.length() + 61) + strI.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strJ, " AND NOT ", strI), new String[]{str}) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:? A[SYNTHETIC] */
    public final rpk0 m0(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        k8l0 k8l0Var = this.a;
        hm20.e(str);
        g();
        h();
        Cursor cursor = null;
        try {
            cursorQuery = V().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            y4l0 y4l0Var = k8l0Var.f;
                            k8l0.m(y4l0Var);
                            y4l0Var.f.b(y4l0.k(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            rpk0 rpk0Var = new rpk0(string, string2, blob);
                            cursorQuery.close();
                            return rpk0Var;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    y4l0 y4l0Var2 = k8l0Var.f;
                    k8l0.m(y4l0Var2);
                    y4l0Var2.f.c(y4l0.k(str), "Error querying remote config. appId", e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void n(Long l2) {
        k8l0 k8l0Var = this.a;
        g();
        h();
        try {
            if (V().delete("upload_queue", "rowid=?", new String[]{l2.toString()}) != 1) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.i.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    public final void n0(n8l0 n8l0Var, boolean z) {
        g();
        h();
        hm20.e(n8l0Var.q());
        if (!n8l0Var.c2()) {
            fm20.a();
            return;
        }
        q();
        k8l0 k8l0Var = this.a;
        xi9 xi9Var = k8l0Var.k;
        y4l0 y4l0Var = k8l0Var.f;
        xi9Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jD2 = n8l0Var.d2();
        t2l0 t2l0Var = v2l0.R;
        if (jD2 < jCurrentTimeMillis - ((Long) t2l0Var.a(null)).longValue() || n8l0Var.d2() > ((Long) t2l0Var.a(null)).longValue() + jCurrentTimeMillis) {
            k8l0.m(y4l0Var);
            y4l0Var.i.d(y4l0.k(n8l0Var.q()), "Storing bundle outside of the max uploading time span. appId, now, timestamp", Long.valueOf(jCurrentTimeMillis), Long.valueOf(n8l0Var.d2()));
        }
        byte[] bArrE = n8l0Var.e();
        try {
            pol0 pol0Var = this.b.g;
            iol0.U(pol0Var);
            byte[] bArrN = pol0Var.N(bArrE);
            k8l0.m(y4l0Var);
            y4l0Var.n.b(Integer.valueOf(bArrN.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put(PublisherMetadata.APP_ID, n8l0Var.q());
            contentValues.put("bundle_end_timestamp", Long.valueOf(n8l0Var.d2()));
            contentValues.put("data", bArrN);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (n8l0Var.q0()) {
                contentValues.put("retry_count", Integer.valueOf(n8l0Var.r0()));
            }
            try {
                if (V().insert("queue", null, contentValues) == -1) {
                    k8l0.m(y4l0Var);
                    y4l0Var.f.b(y4l0.k(n8l0Var.q()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                k8l0.m(y4l0Var);
                y4l0Var.f.c(y4l0.k(n8l0Var.q()), "Error storing bundle. appId", e);
            }
        } catch (IOException e2) {
            k8l0.m(y4l0Var);
            y4l0Var.f.c(y4l0.k(n8l0Var.q()), "Data loss. Failed to serialize bundle. appId", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final String o() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseV = V();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseV.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    y4l0 y4l0Var = this.a.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.f.b(e, "Database error getting next bundle app id");
                }
            } catch (Throwable th) {
                th = th;
                r1 = sQLiteDatabaseV;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    public final void p(long j2) {
        g();
        h();
        try {
            if (V().delete("queue", "rowid=?", new String[]{String.valueOf(j2)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void q() {
        g();
        h();
        if (N()) {
            iol0 iol0Var = this.b;
            long jA = iol0Var.i.e.a();
            k8l0 k8l0Var = this.a;
            k8l0Var.k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) v2l0.M.a(null)).longValue()) {
                iol0Var.i.e.b(jElapsedRealtime);
                g();
                h();
                if (N()) {
                    SQLiteDatabase sQLiteDatabaseV = V();
                    k8l0Var.k.getClass();
                    int iDelete = sQLiteDatabaseV.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) v2l0.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        y4l0 y4l0Var = k8l0Var.f;
                        k8l0.m(y4l0Var);
                        y4l0Var.n.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void r(ArrayList arrayList) {
        g();
        h();
        hm20.h(arrayList);
        if (arrayList.size() == 0) {
            hb5.a("Given Integer is zero");
            return;
        }
        if (N()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strA = pr0.a(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            long jQ = Q(pr0.a(new StringBuilder(strA.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strA, " AND retry_count =  2147483647 LIMIT 1"), null);
            k8l0 k8l0Var = this.a;
            if (jQ > 0) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseV = V();
                StringBuilder sb = new StringBuilder(strA.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strA);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseV.execSQL(sb.toString());
            } catch (SQLiteException e) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.f.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void s(Long l2) {
        g();
        h();
        if (N()) {
            StringBuilder sb = new StringBuilder(l2.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l2);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            long jQ = Q(sb.toString(), null);
            k8l0 k8l0Var = this.a;
            if (jQ > 0) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseV = V();
                k8l0Var.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l2.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l2);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseV.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.f.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final Object t(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        k8l0 k8l0Var = this.a;
        if (type == 0) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        y4l0 y4l0Var3 = k8l0Var.f;
        k8l0.m(y4l0Var3);
        y4l0Var3.f.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final boolean v(String str, String str2) {
        return Q("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long w(String str) {
        hm20.e(str);
        return R("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void x(String str, Long l2, long j2, d7l0 d7l0Var) {
        g();
        h();
        hm20.h(d7l0Var);
        hm20.e(str);
        byte[] bArrE = d7l0Var.e();
        k8l0 k8l0Var = this.a;
        y4l0 y4l0Var = k8l0Var.f;
        y4l0 y4l0Var2 = k8l0Var.f;
        k8l0.m(y4l0Var);
        y4l0Var.n.c(k8l0Var.j.a(str), "Saving complex main event, appId, data size", Integer.valueOf(bArrE.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put(AnalyticsParam.EVENT_PARAM_EVENT_ID, l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrE);
        try {
            if (V().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                k8l0.m(y4l0Var2);
                y4l0Var2.f.b(y4l0.k(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            k8l0.m(y4l0Var2);
            y4l0Var2.f.c(y4l0.k(str), "Error storing complex main event. appId", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x00fa->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    public final void y(String str, Long l2, String str2, Bundle bundle) throws Throwable {
        Bundle bundle2;
        y4l0 y4l0Var;
        long j2;
        String str3;
        ContentValues contentValues;
        y4l0 y4l0Var2;
        n8l0 n8l0Var;
        Iterator it;
        lqk0 lqk0Var = this;
        String str4 = str;
        hm20.h(bundle);
        lqk0Var.g();
        lqk0Var.h();
        dqk0 dqk0Var = l2 != null ? new dqk0(lqk0Var, str4, l2.longValue()) : new dqk0(lqk0Var, str4);
        List<zpk0> listA = dqk0Var.a();
        while (!listA.isEmpty()) {
            for (zpk0 zpk0Var : listA) {
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                k8l0 k8l0Var = lqk0Var.a;
                try {
                    if (!zIsEmpty) {
                        Cursor cursor = null;
                        n8l0 n8l0Var2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = lqk0Var.V().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(zpk0Var.b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                n8l0Var = (n8l0) ((l8l0) pol0.O(n8l0.V(), cursorQuery.getBlob(0))).i();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        y4l0 y4l0Var3 = k8l0Var.f;
                                                        k8l0.m(y4l0Var3);
                                                        y4l0Var3.i.b(y4l0.k(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor2 = cursorQuery;
                                                    y4l0 y4l0Var4 = k8l0Var.f;
                                                    k8l0.m(y4l0Var4);
                                                    y4l0Var4.f.c(y4l0.k(str4), "Data loss. Error selecting raw event. appId", e);
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                }
                                                n8l0Var2 = n8l0Var;
                                            } catch (IOException e2) {
                                                y4l0 y4l0Var5 = k8l0Var.f;
                                                k8l0.m(y4l0Var5);
                                                y4l0Var5.f.c(y4l0.k(str4), "Data loss. Failed to merge raw event metadata. appId", e2);
                                                cursorQuery.close();
                                            }
                                            if (n8l0Var2 != null) {
                                                it = n8l0Var2.V1().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((s9l0) it.next()).s().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            y4l0 y4l0Var6 = k8l0Var.f;
                                            k8l0.m(y4l0Var6);
                                            y4l0Var6.f.b(y4l0.k(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = cursorQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    n8l0Var = null;
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                n8l0Var = null;
                            }
                            if (n8l0Var2 != null) {
                                it = n8l0Var2.V1().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((s9l0) it.next()).s().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    long jUpdate = V().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
                    if (jUpdate != 1) {
                        k8l0.m(y4l0Var);
                        y4l0Var2 = y4l0Var;
                        try {
                            y4l0Var2.f.c(y4l0.k(str3), "Failed to update raw event. appId, updatedRows", Long.valueOf(jUpdate));
                        } catch (SQLiteException e5) {
                            e = e5;
                            k8l0.m(y4l0Var2);
                            y4l0Var2.f.c(y4l0.k(str3), "Error updating raw event. appId", e);
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    y4l0Var2 = y4l0Var;
                }
                pol0 pol0Var = lqk0Var.b.g;
                iol0.U(pol0Var);
                d7l0 d7l0Var = zpk0Var.d;
                Bundle bundle3 = new Bundle();
                for (k7l0 k7l0Var : d7l0Var.q()) {
                    if (k7l0Var.y()) {
                        bundle3.putDouble(k7l0Var.r(), k7l0Var.z());
                    } else if (k7l0Var.w()) {
                        bundle3.putFloat(k7l0Var.r(), k7l0Var.x());
                    } else if (k7l0Var.u()) {
                        bundle3.putLong(k7l0Var.r(), k7l0Var.v());
                    } else if (k7l0Var.s()) {
                        bundle3.putString(k7l0Var.r(), k7l0Var.t());
                    } else if (k7l0Var.A().isEmpty()) {
                        y4l0 y4l0Var7 = pol0Var.a.f;
                        k8l0.m(y4l0Var7);
                        y4l0Var7.f.b(k7l0Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(k7l0Var.r(), pol0.Q((iil0) k7l0Var.A()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strT = d7l0Var.t();
                if (string == null) {
                    string = "";
                }
                yol0 yol0Var = k8l0Var.i;
                y4l0 y4l0Var8 = k8l0Var.f;
                k8l0.k(yol0Var);
                if (strT.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        y4l0 y4l0Var9 = y4l0Var8;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        y4l0Var8 = y4l0Var9;
                    }
                } else {
                    bundle2 = bundle;
                }
                y4l0Var = y4l0Var8;
                yol0Var.r(bundle3, bundle2);
                isk0 isk0Var = new isk0(lqk0Var.a, string, str4, d7l0Var.t(), d7l0Var.v(), d7l0Var.x(), bundle3);
                j2 = zpk0Var.a;
                long j3 = zpk0Var.b;
                boolean z = zpk0Var.c;
                lqk0Var.g();
                lqk0Var.h();
                str3 = isk0Var.a;
                hm20.e(str3);
                iol0.U(pol0Var);
                byte[] bArrE = pol0Var.D(isk0Var).e();
                contentValues = new ContentValues();
                contentValues.put(PublisherMetadata.APP_ID, str3);
                contentValues.put("name", isk0Var.b);
                contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(isk0Var.d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j3));
                contentValues.put("data", bArrE);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                lqk0Var = this;
                str4 = str;
            }
            listA = dqk0Var.a();
            lqk0Var = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [lqk0, val0, vml0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    public final jbl0 z(String str) {
        Throwable th;
        SQLiteException e;
        k8l0 k8l0Var = this.a;
        hm20.h(str);
        g();
        h();
        ?? r2 = 0;
        jbl0VarC = null;
        jbl0VarC = null;
        jbl0 jbl0VarC = null;
        try {
            try {
                this = V().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        jbl0VarC = jbl0.c(this.getInt(1), this.getString(0));
                    } else {
                        y4l0 y4l0Var = k8l0Var.f;
                        k8l0.m(y4l0Var);
                        y4l0Var.n.a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    y4l0 y4l0Var2 = k8l0Var.f;
                    k8l0.m(y4l0Var2);
                    y4l0Var2.f.b(e, "Error querying database.");
                    if (this != 0) {
                    }
                    if (jbl0VarC == null) {
                        return jbl0.c;
                    }
                    return jbl0VarC;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            this = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        this.close();
        if (jbl0VarC == null) {
            return jbl0.c;
        }
        return jbl0VarC;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final List c0(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        Cursor cursorQuery;
        String str5;
        k8l0 k8l0Var = this.a;
        hm20.e(str);
        g();
        h();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb.toString();
            wok0 wok0Var = k8l0Var.d;
            y4l0 y4l0Var = k8l0Var.f;
            cursorQuery = V().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    k8l0.m(y4l0Var);
                                    y4l0Var.f.b(1000, qUnCRF.PZSAFJYEQ);
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j2 = cursorQuery.getLong(1);
                                Object objT = t(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objT == null) {
                                    try {
                                        k8l0.m(y4l0Var);
                                        y4l0Var.f.d(y4l0.k(str6), "(2)Read invalid user property value, ignoring it", string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            y4l0 y4l0Var2 = k8l0Var.f;
                                            k8l0.m(y4l0Var2);
                                            y4l0Var2.f.d(y4l0.k(str), "(2)Error querying user properties", str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new uol0(str, str5, string2, j2, objT));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    y4l0 y4l0Var3 = k8l0Var.f;
                                    k8l0.m(y4l0Var3);
                                    y4l0Var3.f.d(y4l0.k(str), "(2)Error querying user properties", str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                y4l0 y4l0Var4 = k8l0Var.f;
                                k8l0.m(y4l0Var4);
                                y4l0Var4.f.d(y4l0.k(str), "(2)Error querying user properties", str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final void j0(k5l0 k5l0Var, boolean z) {
        k8l0 k8l0Var = k5l0Var.a;
        g();
        h();
        String strD = k5l0Var.D();
        hm20.h(strD);
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, strD);
        hbl0 hbl0Var = hbl0.ANALYTICS_STORAGE;
        iol0 iol0Var = this.b;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (iol0Var.f(strD).i(hbl0Var)) {
            contentValues.put("app_instance_id", k5l0Var.E());
        }
        contentValues.put("gmp_app_id", k5l0Var.G());
        if (iol0Var.f(strD).i(hbl0.AD_STORAGE)) {
            p7l0 p7l0Var = k8l0Var.g;
            k8l0.m(p7l0Var);
            p7l0Var.g();
            contentValues.put("resettable_device_id_hash", k5l0Var.e);
        }
        p7l0 p7l0Var2 = k8l0Var.g;
        k8l0.m(p7l0Var2);
        p7l0Var2.g();
        contentValues.put("last_bundle_index", Long.valueOf(k5l0Var.g));
        p7l0 p7l0Var3 = k8l0Var.g;
        k8l0.m(p7l0Var3);
        p7l0Var3.g();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(k5l0Var.h));
        p7l0 p7l0Var4 = k8l0Var.g;
        k8l0.m(p7l0Var4);
        p7l0Var4.g();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(k5l0Var.i));
        contentValues.put("app_version", k5l0Var.N());
        p7l0 p7l0Var5 = k8l0Var.g;
        k8l0.m(p7l0Var5);
        p7l0Var5.g();
        contentValues.put("app_store", k5l0Var.l);
        p7l0 p7l0Var6 = k8l0Var.g;
        k8l0.m(p7l0Var6);
        p7l0Var6.g();
        contentValues.put("gmp_version", Long.valueOf(k5l0Var.m));
        p7l0 p7l0Var7 = k8l0Var.g;
        k8l0.m(p7l0Var7);
        p7l0Var7.g();
        contentValues.put("dev_cert_hash", Long.valueOf(k5l0Var.n));
        p7l0 p7l0Var8 = k8l0Var.g;
        k8l0.m(p7l0Var8);
        p7l0Var8.g();
        contentValues.put("measurement_enabled", Boolean.valueOf(k5l0Var.o));
        p7l0 p7l0Var9 = k8l0Var.g;
        p7l0 p7l0Var10 = k8l0Var.g;
        k8l0.m(p7l0Var9);
        p7l0Var9.g();
        contentValues.put("day", Long.valueOf(k5l0Var.J));
        k8l0.m(p7l0Var10);
        p7l0Var10.g();
        contentValues.put("daily_public_events_count", Long.valueOf(k5l0Var.K));
        k8l0.m(p7l0Var10);
        p7l0Var10.g();
        contentValues.put("daily_events_count", Long.valueOf(k5l0Var.L));
        k8l0.m(p7l0Var10);
        p7l0Var10.g();
        contentValues.put(CaxEybC.SaIIfOkg, Long.valueOf(k5l0Var.M));
        p7l0 p7l0Var11 = k8l0Var.g;
        k8l0.m(p7l0Var11);
        p7l0Var11.g();
        contentValues.put("config_fetched_time", Long.valueOf(k5l0Var.R));
        p7l0 p7l0Var12 = k8l0Var.g;
        k8l0.m(p7l0Var12);
        p7l0Var12.g();
        contentValues.put("failed_config_fetch_time", Long.valueOf(k5l0Var.S));
        contentValues.put("app_version_int", Long.valueOf(k5l0Var.P()));
        contentValues.put("firebase_instance_id", k5l0Var.J());
        k8l0.m(p7l0Var10);
        p7l0Var10.g();
        contentValues.put("daily_error_events_count", Long.valueOf(k5l0Var.N));
        k8l0.m(p7l0Var10);
        p7l0Var10.g();
        contentValues.put("daily_realtime_events_count", Long.valueOf(k5l0Var.O));
        k8l0.m(p7l0Var10);
        p7l0Var10.g();
        contentValues.put("health_monitor_sample", k5l0Var.P);
        contentValues.put("android_id", (Long) 0L);
        p7l0 p7l0Var13 = k8l0Var.g;
        k8l0.m(p7l0Var13);
        p7l0Var13.g();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(k5l0Var.p));
        contentValues.put("dynamite_version", Long.valueOf(k5l0Var.b()));
        if (iol0Var.f(strD).i(hbl0Var)) {
            p7l0 p7l0Var14 = k8l0Var.g;
            k8l0.m(p7l0Var14);
            p7l0Var14.g();
            contentValues.put("session_stitching_token", k5l0Var.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(k5l0Var.y()));
        p7l0 p7l0Var15 = k8l0Var.g;
        k8l0.m(p7l0Var15);
        p7l0Var15.g();
        contentValues.put("target_os_version", Long.valueOf(k5l0Var.v));
        p7l0 p7l0Var16 = k8l0Var.g;
        k8l0.m(p7l0Var16);
        p7l0Var16.g();
        contentValues.put("session_stitching_token_hash", Long.valueOf(k5l0Var.w));
        kql0.a();
        k8l0 k8l0Var2 = this.a;
        wok0 wok0Var = k8l0Var2.d;
        y4l0 y4l0Var = k8l0Var2.f;
        if (wok0Var.q(strD, v2l0.P0)) {
            p7l0 p7l0Var17 = k8l0Var.g;
            k8l0.m(p7l0Var17);
            p7l0Var17.g();
            contentValues.put("ad_services_version", Integer.valueOf(k5l0Var.x));
            p7l0 p7l0Var18 = k8l0Var.g;
            k8l0.m(p7l0Var18);
            p7l0Var18.g();
            contentValues.put("attribution_eligibility_status", Long.valueOf(k5l0Var.B));
        }
        p7l0 p7l0Var19 = k8l0Var.g;
        k8l0.m(p7l0Var19);
        p7l0Var19.g();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(k5l0Var.y));
        contentValues.put("npa_metadata_value", k5l0Var.w());
        p7l0 p7l0Var20 = k8l0Var.g;
        k8l0.m(p7l0Var20);
        p7l0Var20.g();
        contentValues.put("bundle_delivery_index", Long.valueOf(k5l0Var.F));
        contentValues.put("sgtm_preview_key", k5l0Var.C());
        k8l0.m(p7l0Var10);
        p7l0Var10.g();
        contentValues.put("dma_consent_state", Integer.valueOf(k5l0Var.D));
        k8l0.m(p7l0Var10);
        p7l0Var10.g();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(k5l0Var.E));
        contentValues.put("serialized_npa_metadata", k5l0Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(k5l0Var.t()));
        p7l0 p7l0Var21 = k8l0Var.g;
        k8l0.m(p7l0Var21);
        p7l0Var21.g();
        ArrayList arrayList = k5l0Var.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                k8l0.m(y4l0Var);
                y4l0Var.i.b(strD, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (k8l0Var2.d.q(null, v2l0.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        p7l0 p7l0Var22 = k8l0Var.g;
        k8l0.m(p7l0Var22);
        p7l0Var22.g();
        contentValues.put("unmatched_pfo", k5l0Var.z);
        p7l0 p7l0Var23 = k8l0Var.g;
        k8l0.m(p7l0Var23);
        p7l0Var23.g();
        contentValues.put("unmatched_uwa", k5l0Var.A);
        p7l0 p7l0Var24 = k8l0Var.g;
        k8l0.m(p7l0Var24);
        p7l0Var24.g();
        contentValues.put("ad_campaign_info", k5l0Var.H);
        try {
            SQLiteDatabase sQLiteDatabaseV = V();
            if (sQLiteDatabaseV.update("apps", contentValues, "app_id = ?", new String[]{strD}) == 0 && sQLiteDatabaseV.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                k8l0.m(y4l0Var);
                y4l0Var.f.b(y4l0.k(strD), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            k8l0.m(y4l0Var);
            y4l0Var.f.c(y4l0.k(strD), "Error storing app. appId", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0091 A[Catch: all -> 0x006b, SQLiteException -> 0x00a3, TryCatch #0 {SQLiteException -> 0x00a3, blocks: (B:15:0x0070, B:17:0x0091, B:20:0x00a5), top: B:30:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a5 A[Catch: all -> 0x006b, SQLiteException -> 0x00a3, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a3, blocks: (B:15:0x0070, B:17:0x0091, B:20:0x00a5), top: B:30:0x0070 }] */
    public final long u(String str) {
        long j2;
        ContentValues contentValues;
        k8l0 k8l0Var = this.a;
        hm20.e(str);
        hm20.e("first_open_count");
        g();
        h();
        SQLiteDatabase sQLiteDatabaseV = V();
        sQLiteDatabaseV.beginTransaction();
        long j3 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j2 = -1;
                long jR = R(sb.toString(), new String[]{str}, -1L);
                if (jR == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(PublisherMetadata.APP_ID, str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseV.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        y4l0 y4l0Var = k8l0Var.f;
                        k8l0.m(y4l0Var);
                        y4l0Var.f.c(y4l0.k(str), "Failed to insert column (got -1). appId", "first_open_count");
                    } else {
                        jR = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put(PublisherMetadata.APP_ID, str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jR));
                            if (sQLiteDatabaseV.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                y4l0 y4l0Var2 = k8l0Var.f;
                                k8l0.m(y4l0Var2);
                                y4l0Var2.f.c(y4l0.k(str), Chyeyik.CDgnaV, "first_open_count");
                            } else {
                                sQLiteDatabaseV.setTransactionSuccessful();
                                j2 = jR;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j3 = jR;
                            y4l0 y4l0Var3 = k8l0Var.f;
                            k8l0.m(y4l0Var3);
                            y4l0Var3.f.d(y4l0.k(str), "Error inserting column. appId", "first_open_count", e);
                            j2 = j3;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put(PublisherMetadata.APP_ID, str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jR));
                    if (sQLiteDatabaseV.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        y4l0 y4l0Var4 = k8l0Var.f;
                        k8l0.m(y4l0Var4);
                        y4l0Var4.f.c(y4l0.k(str), Chyeyik.CDgnaV, "first_open_count");
                    } else {
                        sQLiteDatabaseV.setTransactionSuccessful();
                        j2 = jR;
                    }
                }
            } finally {
                sQLiteDatabaseV.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
        return j2;
    }
}
