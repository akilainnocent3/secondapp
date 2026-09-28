package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class iul0 {
    public d7l0 a;
    public Long b;
    public long c;
    public final /* synthetic */ knk0 d;

    public /* synthetic */ iul0(knk0 knk0Var) {
        this.d = knk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f1 A[PHI: r7 r16 r17
      0x00f1: PHI (r7v2 android.database.Cursor) = (r7v3 android.database.Cursor), (r7v5 android.database.Cursor) binds: [B:61:0x011c, B:46:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r16v5 d7l0) = (r16v7 d7l0), (r16v11 d7l0) binds: [B:61:0x011c, B:46:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x011c, B:46:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00fd: MOVE (r4 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:254), block:B:53:0x00fd */
    public final d7l0 a(String str, d7l0 d7l0Var) {
        Cursor cursor;
        d7l0 d7l0Var2;
        long j;
        Cursor cursorRawQuery;
        Cursor cursor2;
        Pair pair;
        Object obj;
        Pair pair2;
        String strT = d7l0Var.t();
        List listQ = d7l0Var.q();
        knk0 knk0Var = this.d;
        iol0 iol0Var = knk0Var.b;
        k8l0 k8l0Var = knk0Var.a;
        iol0Var.j0();
        k7l0 k7l0VarO = pol0.o("_eid", d7l0Var);
        Long l = (Long) (k7l0VarO == null ? null : pol0.v(k7l0VarO));
        if (l != null) {
            if (strT.equals("_ep")) {
                iol0Var.j0();
                k7l0 k7l0VarO2 = pol0.o("_en", d7l0Var);
                String str2 = (String) (k7l0VarO2 == null ? null : pol0.v(k7l0VarO2));
                if (TextUtils.isEmpty(str2)) {
                    y4l0 y4l0Var = k8l0Var.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.g.b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                    lqk0 lqk0Var = iol0Var.c;
                    iol0.U(lqk0Var);
                    k8l0 k8l0Var2 = lqk0Var.a;
                    lqk0Var.g();
                    lqk0Var.h();
                    try {
                        try {
                            cursorRawQuery = lqk0Var.V().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    d7l0Var2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((d7l0) ((b7l0) pol0.O(d7l0.A(), cursorRawQuery.getBlob(0))).i(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair2 = pairCreate;
                                        } catch (SQLiteException e) {
                                            e = e;
                                            j = 0;
                                            y4l0 y4l0Var2 = k8l0Var2.f;
                                            k8l0.m(y4l0Var2);
                                            y4l0Var2.f.b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            pair = d7l0Var2;
                                        }
                                    } catch (IOException e2) {
                                        y4l0 y4l0Var3 = k8l0Var2.f;
                                        k8l0.m(y4l0Var3);
                                        j = 0;
                                        try {
                                            y4l0Var3.f.d(y4l0.k(str), "Failed to merge main event. appId, eventId", l, e2);
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            y4l0 y4l0Var4 = k8l0Var2.f;
                                            k8l0.m(y4l0Var4);
                                            y4l0Var4.f.b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            pair = d7l0Var2;
                                            if (pair != 0) {
                                            }
                                            y4l0 y4l0Var5 = k8l0Var.f;
                                            k8l0.m(y4l0Var5);
                                            y4l0Var5.g.c(str2, "Extra parameter without existing main event. eventName, eventId", l);
                                            return d7l0Var2;
                                        }
                                        cursorRawQuery.close();
                                        pair = d7l0Var2;
                                    }
                                } else {
                                    y4l0 y4l0Var6 = k8l0Var2.f;
                                    k8l0.m(y4l0Var6);
                                    y4l0Var6.n.a("Main event not found");
                                    cursorRawQuery.close();
                                    pair2 = null;
                                    d7l0Var2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (SQLiteException e4) {
                                e = e4;
                                d7l0Var2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        d7l0Var2 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        y4l0 y4l0Var7 = k8l0Var.f;
                        k8l0.m(y4l0Var7);
                        y4l0Var7.g.c(str2, "Extra parameter without existing main event. eventName, eventId", l);
                        return d7l0Var2;
                    }
                    this.a = (d7l0) obj;
                    this.c = ((Long) pair.second).longValue();
                    iol0Var.j0();
                    this.b = (Long) pol0.p("_eid", this.a);
                } else {
                    j = 0;
                }
                long j2 = this.c - 1;
                this.c = j2;
                if (j2 <= j) {
                    lqk0 lqk0Var2 = iol0Var.c;
                    iol0.U(lqk0Var2);
                    k8l0 k8l0Var3 = lqk0Var2.a;
                    lqk0Var2.g();
                    y4l0 y4l0Var8 = k8l0Var3.f;
                    k8l0.m(y4l0Var8);
                    y4l0Var8.n.b(str, "Clearing complex main event info. appId");
                    try {
                        lqk0Var2.V().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        y4l0 y4l0Var9 = k8l0Var3.f;
                        k8l0.m(y4l0Var9);
                        y4l0Var9.f.b(e6, "Error clearing complex main event");
                    }
                } else {
                    lqk0 lqk0Var3 = iol0Var.c;
                    iol0.U(lqk0Var3);
                    lqk0Var3.x(str, l, this.c, this.a);
                }
                ArrayList arrayList = new ArrayList();
                for (k7l0 k7l0Var : this.a.q()) {
                    iol0Var.j0();
                    if (pol0.o(k7l0Var.r(), d7l0Var) == null) {
                        arrayList.add(k7l0Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    y4l0 y4l0Var10 = k8l0Var.f;
                    k8l0.m(y4l0Var10);
                    y4l0Var10.g.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listQ);
                    listQ = arrayList;
                }
                strT = str2;
            } else {
                this.b = l;
                this.a = d7l0Var;
                iol0Var.j0();
                k7l0 k7l0VarO3 = pol0.o("_epc", d7l0Var);
                Serializable serializableV = k7l0VarO3 != null ? pol0.v(k7l0VarO3) : null;
                long jLongValue = ((Long) (serializableV != null ? serializableV : 0L)).longValue();
                this.c = jLongValue;
                if (jLongValue <= 0) {
                    y4l0 y4l0Var11 = k8l0Var.f;
                    k8l0.m(y4l0Var11);
                    y4l0Var11.g.b(strT, "Complex event with zero extra param count. eventName");
                } else {
                    lqk0 lqk0Var4 = iol0Var.c;
                    iol0.U(lqk0Var4);
                    lqk0Var4.x(str, l, this.c, d7l0Var);
                }
            }
        }
        b7l0 b7l0Var = (b7l0) d7l0Var.k();
        b7l0Var.g();
        ((d7l0) b7l0Var.b).G(strT);
        b7l0Var.g();
        ((d7l0) b7l0Var.b).E();
        b7l0Var.g();
        ((d7l0) b7l0Var.b).D(listQ);
        return (d7l0) b7l0Var.i();
    }
}
