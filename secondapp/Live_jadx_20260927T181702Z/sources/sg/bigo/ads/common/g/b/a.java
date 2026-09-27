package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f133035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f133036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f133037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f133038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f133039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f133040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f133041g;

    public a(Cursor cursor) {
        this.f133035a = -1L;
        this.f133035a = cursor.getLong(cursor.getColumnIndex(eq.c.f81516f));
        this.f133036b = cursor.getString(cursor.getColumnIndex("event_action"));
        this.f133037c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.f133038d = cursor.getInt(cursor.getColumnIndex("states"));
        this.f133039e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f133040f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f133041g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        long j10 = this.f133035a;
        return j10 >= 0 && j10 == ((a) obj).f133035a;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f133035a + ",eventInfo=" + this.f133037c;
    }

    public a(String str, String str2) {
        this.f133035a = -1L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f133036b = str;
        this.f133037c = str2;
        this.f133038d = 0;
        this.f133039e = "";
        this.f133040f = jCurrentTimeMillis;
        this.f133041g = jCurrentTimeMillis;
    }
}
