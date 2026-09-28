package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fq60 implements erg, zoe0, bs7 {
    public static final j4g f = new j4g("proto");
    public final kn70 a;
    public final ss7 b;
    public final ss7 c;
    public final gi1 d;
    public final m730<String> e;

    public interface a<T, U> {
        U apply(T t);
    }

    public static class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public fq60(ss7 ss7Var, ss7 ss7Var2, gi1 gi1Var, kn70 kn70Var, m730<String> m730Var) {
        this.a = kn70Var;
        this.b = ss7Var;
        this.c = ss7Var2;
        this.d = gi1Var;
        this.e = m730Var;
    }

    public static String G(Iterable<je00> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<je00> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T H(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long o(SQLiteDatabase sQLiteDatabase, ml1 ml1Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(ml1Var.a, String.valueOf(nw20.a(ml1Var.c))));
        byte[] bArr = ml1Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    @Override // defpackage.erg
    public final xj1 E(final ml1 ml1Var, final lpg lpgVar) {
        kw20 kw20Var = ml1Var.c;
        String strK = lpgVar.k();
        String str = ml1Var.a;
        String strC = tgt.c("SQLiteEventStore");
        if (Log.isLoggable(strC, 3)) {
            Log.d(strC, "Storing event with priority=" + kw20Var + ", name=" + strK + " for destination " + str);
        }
        long jLongValue = ((Long) u(new a() { // from class: aq60
            @Override // fq60.a
            public final Object apply(Object obj) {
                long jInsert;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                fq60 fq60Var = this.a;
                long jSimpleQueryForLong = fq60Var.m().compileStatement("PRAGMA page_size").simpleQueryForLong() * fq60Var.m().compileStatement("PRAGMA page_count").simpleQueryForLong();
                gi1 gi1Var = fq60Var.d;
                long jE = gi1Var.e();
                lpg lpgVar2 = lpgVar;
                if (jSimpleQueryForLong >= jE) {
                    fq60Var.l(1L, hft.a.CACHE_FULL, lpgVar2.k());
                    return -1L;
                }
                ml1 ml1Var2 = ml1Var;
                Long lO = fq60.o(sQLiteDatabase, ml1Var2);
                if (lO != null) {
                    jInsert = lO.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", ml1Var2.a);
                    contentValues.put(EventKeys.PRIORITY, Integer.valueOf(nw20.a(ml1Var2.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = ml1Var2.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iD = gi1Var.d();
                byte[] bArr2 = lpgVar2.d().b;
                boolean z = bArr2.length <= iD;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", lpgVar2.k());
                contentValues2.put("timestamp_ms", Long.valueOf(lpgVar2.e()));
                contentValues2.put("uptime_ms", Long.valueOf(lpgVar2.l()));
                contentValues2.put("payload_encoding", lpgVar2.d().a.a);
                contentValues2.put(EventKeys.ERROR_CODE, lpgVar2.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put(EventKeys.PAYLOAD, z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", lpgVar2.i());
                contentValues2.put("pseudonymous_id", lpgVar2.j());
                contentValues2.put("experiment_ids_clear_blob", lpgVar2.f());
                contentValues2.put("experiment_ids_encrypted_blob", lpgVar2.g());
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) iD));
                    for (int i = 1; i <= iCeil; i++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i - 1) * iD, Math.min(i * iD, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put(AnalyticsParam.EVENT_PARAM_EVENT_ID, Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(lpgVar2.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put(AnalyticsParam.EVENT_PARAM_EVENT_ID, Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new xj1(jLongValue, ml1Var, lpgVar);
    }

    public final ArrayList F(SQLiteDatabase sQLiteDatabase, final ml1 ml1Var, int i) {
        final ArrayList arrayList = new ArrayList();
        Long lO = o(sQLiteDatabase, ml1Var);
        if (lO == null) {
            return arrayList;
        }
        H(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", EventKeys.PAYLOAD, EventKeys.ERROR_CODE, "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lO.toString()}, null, null, null, String.valueOf(i)), new a() { // from class: dq60
            @Override // fq60.a
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    boolean z = cursor.getInt(7) != 0;
                    fi1.a aVar = new fi1.a();
                    aVar.f = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        bmy.a("Null transportName");
                        break;
                    }
                    aVar.a = string;
                    aVar.d = Long.valueOf(cursor.getLong(2));
                    aVar.e = Long.valueOf(cursor.getLong(3));
                    if (z) {
                        String string2 = cursor.getString(4);
                        aVar.c = new d4g(string2 == null ? fq60.f : new j4g(string2), cursor.getBlob(5));
                    } else {
                        String string3 = cursor.getString(4);
                        j4g j4gVar = string3 == null ? fq60.f : new j4g(string3);
                        Cursor cursorQuery = this.a.m().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int length2 = 0;
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i2);
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                            }
                            cursorQuery.close();
                            aVar.c = new d4g(j4gVar, bArr);
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        aVar.b = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        aVar.g = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        aVar.h = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        aVar.i = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        aVar.j = cursor.getBlob(11);
                    }
                    arrayList.add(new xj1(j, ml1Var, aVar.b()));
                }
                return null;
            }
        });
        return arrayList;
    }

    @Override // defpackage.erg
    public final Iterable<oug0> I() {
        return (Iterable) u(new yp60());
    }

    @Override // defpackage.erg
    public final long P0(oug0 oug0Var) {
        Cursor cursorRawQuery = m().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oug0Var.a(), String.valueOf(nw20.a(oug0Var.c()))});
        try {
            return (cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L).longValue();
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // defpackage.erg
    public final boolean Q0(ml1 ml1Var) {
        Boolean bool;
        SQLiteDatabase sQLiteDatabaseM = m();
        sQLiteDatabaseM.beginTransaction();
        try {
            Long lO = o(sQLiteDatabaseM, ml1Var);
            if (lO == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = m().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lO.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            sQLiteDatabaseM.setTransactionSuccessful();
            sQLiteDatabaseM.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th2) {
            sQLiteDatabaseM.endTransaction();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.bs7
    public final void d() {
        SQLiteDatabase sQLiteDatabaseM = m();
        sQLiteDatabaseM.beginTransaction();
        try {
            sQLiteDatabaseM.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseM.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.b.b()).execute();
            sQLiteDatabaseM.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseM.endTransaction();
        }
    }

    @Override // defpackage.zoe0
    public final <T> T f(zoe0.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseM = m();
        ss7 ss7Var = this.c;
        long jB = ss7Var.b();
        while (true) {
            try {
                sQLiteDatabaseM.beginTransaction();
                try {
                    T tExecute = aVar.execute();
                    sQLiteDatabaseM.setTransactionSuccessful();
                    return tExecute;
                } finally {
                    sQLiteDatabaseM.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (ss7Var.b() >= ((long) this.d.a()) + jB) {
                    throw new yoe0("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // defpackage.bs7
    public final ds7 g() {
        int i = ds7.e;
        final ds7.a aVar = new ds7.a();
        aVar.a = null;
        aVar.b = new ArrayList();
        aVar.c = null;
        aVar.d = "";
        final HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseM = m();
        sQLiteDatabaseM.beginTransaction();
        try {
            ds7 ds7Var = (ds7) H(sQLiteDatabaseM.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new a() { // from class: eq60
                @Override // fq60.a
                public final Object apply(Object obj) {
                    HashMap map2;
                    ds7.a aVar2 = aVar;
                    ArrayList arrayList = aVar2.b;
                    Cursor cursor = (Cursor) obj;
                    while (true) {
                        boolean zMoveToNext = cursor.moveToNext();
                        map2 = map;
                        if (!zMoveToNext) {
                            break;
                        }
                        String string = cursor.getString(0);
                        int i2 = cursor.getInt(1);
                        hft.a aVar3 = hft.a.REASON_UNKNOWN;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                aVar3 = hft.a.MESSAGE_TOO_OLD;
                            } else if (i2 == 2) {
                                aVar3 = hft.a.CACHE_FULL;
                            } else if (i2 == 3) {
                                aVar3 = hft.a.PAYLOAD_TOO_BIG;
                            } else if (i2 == 4) {
                                aVar3 = hft.a.MAX_RETRIES_REACHED;
                            } else if (i2 == 5) {
                                aVar3 = hft.a.INVALID_PAYLOD;
                            } else if (i2 == 6) {
                                aVar3 = hft.a.SERVER_ERROR;
                            } else {
                                tgt.a(Integer.valueOf(i2), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                            }
                        }
                        long j = cursor.getLong(2);
                        if (!map2.containsKey(string)) {
                            map2.put(string, new ArrayList());
                        }
                        ((List) map2.get(string)).add(new hft(j, aVar3));
                    }
                    for (Map.Entry entry : map2.entrySet()) {
                        int i3 = yft.c;
                        new ArrayList();
                        arrayList.add(new yft((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                    }
                    fq60 fq60Var = this.a;
                    long jB = fq60Var.b.b();
                    SQLiteDatabase sQLiteDatabaseM2 = fq60Var.m();
                    sQLiteDatabaseM2.beginTransaction();
                    try {
                        Cursor cursorRawQuery = sQLiteDatabaseM2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                        try {
                            cursorRawQuery.moveToNext();
                            mxf0 mxf0Var = new mxf0(cursorRawQuery.getLong(0), jB);
                            cursorRawQuery.close();
                            sQLiteDatabaseM2.setTransactionSuccessful();
                            sQLiteDatabaseM2.endTransaction();
                            aVar2.a = mxf0Var;
                            aVar2.c = new q1l(new n1e0(fq60Var.m().compileStatement("PRAGMA page_size").simpleQueryForLong() * fq60Var.m().compileStatement("PRAGMA page_count").simpleQueryForLong(), gi1.f.a));
                            aVar2.d = fq60Var.e.get();
                            return new ds7(aVar2.a, Collections.unmodifiableList(arrayList), aVar2.c, aVar2.d);
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        sQLiteDatabaseM2.endTransaction();
                        throw th2;
                    }
                }
            });
            sQLiteDatabaseM.setTransactionSuccessful();
            return ds7Var;
        } finally {
            sQLiteDatabaseM.endTransaction();
        }
    }

    @Override // defpackage.erg
    public final int h() {
        long jB = this.b.b() - this.d.b();
        SQLiteDatabase sQLiteDatabaseM = m();
        sQLiteDatabaseM.beginTransaction();
        try {
            String[] strArr = {String.valueOf(jB)};
            Cursor cursorRawQuery = sQLiteDatabaseM.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            while (cursorRawQuery.moveToNext()) {
                try {
                    l(cursorRawQuery.getInt(0), hft.a.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            cursorRawQuery.close();
            int iDelete = sQLiteDatabaseM.delete("events", "timestamp_ms < ?", strArr);
            sQLiteDatabaseM.setTransactionSuccessful();
            sQLiteDatabaseM.endTransaction();
            return iDelete;
        } catch (Throwable th2) {
            sQLiteDatabaseM.endTransaction();
            throw th2;
        }
    }

    @Override // defpackage.bs7
    public final void l(final long j, final hft.a aVar, final String str) {
        u(new a() { // from class: cq60
            @Override // fq60.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                int i = aVar.a;
                String string = Integer.toString(i);
                String str2 = str;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string});
                try {
                    boolean z = cursorRawQuery.getCount() > 0;
                    cursorRawQuery.close();
                    long j2 = j;
                    if (z) {
                        sQLiteDatabase.execSQL(d020.a(j2, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str2, Integer.toString(i)});
                        return null;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(i));
                    contentValues.put("events_dropped_count", Long.valueOf(j2));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    return null;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
        });
    }

    public final SQLiteDatabase m() {
        kn70 kn70Var = this.a;
        Objects.requireNonNull(kn70Var);
        ss7 ss7Var = this.c;
        long jB = ss7Var.b();
        while (true) {
            try {
                return kn70Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (ss7Var.b() >= ((long) this.d.a()) + jB) {
                    throw new yoe0("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // defpackage.erg
    public final void p0(Iterable<je00> iterable) {
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(G(iterable));
            SQLiteDatabase sQLiteDatabaseM = m();
            sQLiteDatabaseM.beginTransaction();
            try {
                sQLiteDatabaseM.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseM.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        l(cursorRawQuery.getInt(0), hft.a.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseM.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseM.setTransactionSuccessful();
                sQLiteDatabaseM.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseM.endTransaction();
                throw th2;
            }
        }
    }

    public final <T> T u(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase sQLiteDatabaseM = m();
        sQLiteDatabaseM.beginTransaction();
        try {
            T tApply = aVar.apply(sQLiteDatabaseM);
            sQLiteDatabaseM.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseM.endTransaction();
        }
    }

    @Override // defpackage.erg
    public final void x(Iterable<je00> iterable) {
        if (iterable.iterator().hasNext()) {
            m().compileStatement("DELETE FROM events WHERE _id in ".concat(G(iterable))).execute();
        }
    }

    @Override // defpackage.erg
    public final void x0(final long j, final ml1 ml1Var) {
        u(new a() { // from class: bq60
            @Override // fq60.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                ml1 ml1Var2 = ml1Var;
                String str = ml1Var2.a;
                kw20 kw20Var = ml1Var2.c;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(nw20.a(kw20Var))}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put(EventKeys.PRIORITY, Integer.valueOf(nw20.a(kw20Var)));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // defpackage.erg
    public final Iterable z1(final ml1 ml1Var) {
        return (Iterable) u(new a() { // from class: zp60
            @Override // fq60.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                fq60 fq60Var = this.a;
                gi1 gi1Var = fq60Var.d;
                int iC = gi1Var.c();
                ml1 ml1Var2 = ml1Var;
                ArrayList arrayListF = fq60Var.F(sQLiteDatabase, ml1Var2, iC);
                for (kw20 kw20Var : kw20.values()) {
                    if (kw20Var != ml1Var2.c) {
                        int iC2 = gi1Var.c() - arrayListF.size();
                        if (iC2 <= 0) {
                            break;
                        }
                        arrayListF.addAll(fq60Var.F(sQLiteDatabase, ml1Var2.d(kw20Var), iC2));
                    }
                }
                HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i = 0; i < arrayListF.size(); i++) {
                    sb.append(((je00) arrayListF.get(i)).b());
                    if (i < arrayListF.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{AnalyticsParam.EVENT_PARAM_EVENT_ID, "name", "value"}, sb.toString(), null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        long j = cursorQuery.getLong(0);
                        Set hashSet = (Set) map.get(Long.valueOf(j));
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(Long.valueOf(j), hashSet);
                        }
                        hashSet.add(new fq60.b(cursorQuery.getString(1), cursorQuery.getString(2)));
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                cursorQuery.close();
                ListIterator listIterator = arrayListF.listIterator();
                while (listIterator.hasNext()) {
                    je00 je00Var = (je00) listIterator.next();
                    if (map.containsKey(Long.valueOf(je00Var.b()))) {
                        fi1.a aVarM = je00Var.a().m();
                        for (fq60.b bVar : (Set) map.get(Long.valueOf(je00Var.b()))) {
                            aVarM.a(bVar.a, bVar.b);
                        }
                        listIterator.set(new xj1(je00Var.b(), je00Var.c(), aVarM.b()));
                    }
                }
                return arrayListF;
            }
        });
    }
}
