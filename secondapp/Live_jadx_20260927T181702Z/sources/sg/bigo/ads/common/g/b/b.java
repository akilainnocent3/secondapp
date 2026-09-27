package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f133042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f133043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f133044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f133045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f133046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f133047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f133048g;

    public b(Cursor cursor) {
        this.f133042a = -1L;
        this.f133042a = cursor.getLong(cursor.getColumnIndex(eq.c.f81516f));
        this.f133043b = cursor.getString(cursor.getColumnIndex("event_id"));
        this.f133044c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.f133045d = cursor.getLong(cursor.getColumnIndex("expired_ts"));
        this.f133046e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f133047f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f133048g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != b.class) {
            return false;
        }
        long j10 = this.f133042a;
        return j10 >= 0 && j10 == ((b) obj).f133042a;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f133042a + ",mEventId = " + this.f133043b + ",mExpiredTs = " + this.f133045d + ",eventInfo = " + this.f133044c;
    }

    public b(String str, String str2, long j10) {
        this.f133042a = -1L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f133043b = str;
        this.f133044c = str2;
        this.f133045d = j10;
        this.f133046e = "";
        this.f133047f = jCurrentTimeMillis;
        this.f133048g = jCurrentTimeMillis;
    }
}
