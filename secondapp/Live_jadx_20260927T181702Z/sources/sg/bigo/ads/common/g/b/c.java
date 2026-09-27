package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.j;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f133049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f133050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f133052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f133053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f133054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f133055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, String> f133056h;

    public c(Cursor cursor) {
        this.f133049a = -1L;
        this.f133050b = false;
        this.f133051c = 0;
        this.f133052d = 0L;
        this.f133053e = "";
        this.f133049a = cursor.getLong(cursor.getColumnIndex(eq.c.f81516f));
        try {
            this.f133056h = j.a(new JSONObject(cursor.getString(cursor.getColumnIndex("ad_data"))));
        } catch (JSONException unused) {
        }
        a(cursor.getString(cursor.getColumnIndex("tracker_imp")));
        b(cursor.getString(cursor.getColumnIndex("tracker_cli")));
        c(cursor.getString(cursor.getColumnIndex("tracker_nurl")));
        d(cursor.getString(cursor.getColumnIndex("tracker_lurl")));
        this.f133051c = cursor.getInt(cursor.getColumnIndex("tracker_type"));
        this.f133052d = cursor.getLong(cursor.getColumnIndex("last_retry_ts"));
        this.f133053e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f133054f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f133055g = cursor.getLong(cursor.getColumnIndex("mtime"));
        this.f133050b = true;
    }

    @NonNull
    public final String a() {
        Map<String, String> map = this.f133056h;
        if (map == null) {
            return "";
        }
        if ((map instanceof HashMap) && map != null) {
            map.remove(null);
            map.values().removeAll(Collections.singleton(null));
        }
        return new JSONObject(this.f133056h).toString();
    }

    public abstract void a(String str);

    @NonNull
    public abstract String b();

    public abstract void b(String str);

    @NonNull
    public abstract String c();

    public abstract void c(String str);

    @NonNull
    public abstract String d();

    public abstract void d(String str);

    @NonNull
    public abstract String e();

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != c.class) {
            return false;
        }
        long j10 = this.f133049a;
        return j10 >= 0 && j10 == ((c) obj).f133049a;
    }

    public long f() {
        return 0L;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f133049a;
    }

    public c(@NonNull Map<String, String> map) {
        this.f133049a = -1L;
        this.f133050b = false;
        this.f133051c = 0;
        this.f133052d = 0L;
        this.f133053e = "";
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f133056h = map;
        this.f133054f = jCurrentTimeMillis;
        this.f133055g = jCurrentTimeMillis;
    }
}
