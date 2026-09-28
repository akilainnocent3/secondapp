package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.twilio.voice.EventKeys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dqk0 {
    public final String a;
    public long b;
    public final /* synthetic */ lqk0 c;

    public dqk0(lqk0 lqk0Var, String str, long j) {
        this.c = lqk0Var;
        hm20.e(str);
        this.a = str;
        this.b = lqk0Var.R("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public final List a() {
        List list;
        List list2;
        lqk0 lqk0Var = this.c;
        k8l0 k8l0Var = lqk0Var.a;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(this.b);
        String str = this.a;
        String[] strArr = {str, strValueOf};
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = lqk0Var.V().query("raw_events", new String[]{"rowid", "name", EventKeys.TIMESTAMP, "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", strArr, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.b) {
                            this.b = j;
                        }
                        try {
                            b7l0 b7l0Var = (b7l0) pol0.O(d7l0.A(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            b7l0Var.g();
                            ((d7l0) b7l0Var.b).G(string);
                            long j3 = cursorQuery.getLong(2);
                            b7l0Var.g();
                            ((d7l0) b7l0Var.b).H(j3);
                            arrayList.add(new zpk0(j, j2, z, (d7l0) b7l0Var.i()));
                        } catch (IOException e) {
                            y4l0 y4l0Var = k8l0Var.f;
                            k8l0.m(y4l0Var);
                            y4l0Var.f.c(y4l0.k(str), "Data loss. Failed to merge raw event. appId", e);
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e2) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.c(y4l0.k(str), "Data loss. Error querying raw events batch. appId", e2);
            list = arrayList;
        }
        list = list2;
        return list;
    }

    public dqk0(lqk0 lqk0Var, String str) {
        this.c = lqk0Var;
        hm20.e(str);
        this.a = str;
        this.b = -1L;
    }
}
