package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.twilio.voice.PublisherMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class ual0 extends m3l0 {
    public final iol0 a;
    public Boolean b;
    public String c;

    public ual0(iol0 iol0Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        hm20.h(iol0Var);
        this.a = iol0Var;
        this.c = null;
    }

    @Override // defpackage.o3l0
    public final String A(zzr zzrVar) {
        d(zzrVar);
        iol0 iol0Var = this.a;
        try {
            return (String) iol0Var.b().n(new jnl0(iol0Var, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            iol0Var.a().f.c(y4l0.k(zzrVar.a), "Failed to get app instance id. appId", e);
            return null;
        }
    }

    @Override // defpackage.o3l0
    public final void C(long j, String str, String str2, String str3) {
        a0(new s8l0(this, str2, str3, str, j));
    }

    @Override // defpackage.o3l0
    public final void E(zzr zzrVar) {
        String str = zzrVar.a;
        hm20.e(str);
        Z(str, false);
        a0(new h9l0(this, zzrVar));
    }

    @Override // defpackage.o3l0
    public final void H(final zzr zzrVar, final zzaf zzafVar) {
        d(zzrVar);
        a0(new Runnable() { // from class: oal0
            /* JADX WARN: Code duplicated, block: B:41:0x0124  */
            /* JADX WARN: Code duplicated, block: B:43:0x012a  */
            /* JADX WARN: Code duplicated, block: B:44:0x013b  */
            /* JADX WARN: Code duplicated, block: B:46:0x0141  */
            /* JADX WARN: Code duplicated, block: B:48:0x0147  */
            /* JADX WARN: Code duplicated, block: B:51:0x0169  */
            /* JADX WARN: Code duplicated, block: B:54:0x01bb A[Catch: SQLiteException -> 0x01c6, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01c6, blocks: (B:52:0x019c, B:54:0x01bb), top: B:79:0x019c }] */
            /* JADX WARN: Code duplicated, block: B:61:0x01ea  */
            /* JADX WARN: Code duplicated, block: B:63:0x01ef  */
            /* JADX WARN: Code duplicated, block: B:65:0x01f7  */
            /* JADX WARN: Code duplicated, block: B:66:0x0200  */
            /* JADX WARN: Code duplicated, block: B:73:0x024a  */
            /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i;
                long j;
                int i2;
                Cursor cursorQuery;
                nol0 nol0Var;
                String str;
                int i3;
                iol0 iol0Var;
                eol0 eol0Var;
                iol0 iol0Var2;
                lqk0 lqk0Var;
                Long lValueOf;
                ContentValues contentValues;
                y4l0 y4l0Var;
                iol0 iol0Var3 = this.a.a;
                iol0Var3.B();
                String str2 = zzrVar.a;
                hm20.h(str2);
                HashMap map = iol0Var3.E;
                iol0Var3.b().g();
                iol0Var3.l0();
                lqk0 lqk0Var2 = iol0Var3.c;
                iol0.U(lqk0Var2);
                zzaf zzafVar2 = zzafVar;
                long j2 = zzafVar2.a;
                long j3 = zzafVar2.c;
                lqk0Var2.g();
                lqk0Var2.h();
                Cursor cursor = null;
                nol0VarH = null;
                nol0 nol0VarH = null;
                try {
                    cursorQuery = lqk0Var2.V().query("upload_queue", new String[]{"rowId", PublisherMetadata.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(1);
                                hm20.h(string);
                                j = j3;
                                try {
                                    try {
                                        try {
                                            iol0Var3 = iol0Var3;
                                            i2 = 1;
                                            cursorQuery = cursorQuery;
                                            i = 4;
                                            j = j;
                                            try {
                                                nol0VarH = lqk0Var2.H(string, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                                cursorQuery.close();
                                            } catch (SQLiteException e) {
                                                e = e;
                                                cursorQuery = cursorQuery;
                                                try {
                                                    y4l0 y4l0Var2 = lqk0Var2.a.f;
                                                    k8l0.m(y4l0Var2);
                                                    y4l0Var2.f.c(Long.valueOf(j2), "Error to querying MeasurementBatch from upload_queue. rowId", e);
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cursor = cursorQuery;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            i2 = 1;
                                            i = 4;
                                            cursorQuery = cursorQuery;
                                            y4l0 y4l0Var3 = lqk0Var2.a.f;
                                            k8l0.m(y4l0Var3);
                                            y4l0Var3.f.c(Long.valueOf(j2), "Error to querying MeasurementBatch from upload_queue. rowId", e);
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            nol0Var = nol0VarH;
                                            if (nol0Var == null) {
                                                iol0Var3.a().i.c(str2, "[sgtm] Queued batch doesn't exist. appId, rowId", Long.valueOf(j2));
                                                return;
                                            }
                                            str = nol0Var.c;
                                            i3 = zzafVar2.b;
                                            if (i3 == i2) {
                                                iol0Var = iol0Var3;
                                                if (i3 == 3) {
                                                    eol0Var = (eol0) map.get(str);
                                                    if (eol0Var == null) {
                                                        eol0Var = new eol0(iol0Var);
                                                        map.put(str, eol0Var);
                                                    } else {
                                                        eol0Var.b += i2;
                                                        eol0Var.c = eol0Var.a();
                                                    }
                                                    iol0Var.e().getClass();
                                                    iol0Var.a().n.d(str2, "[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, Long.valueOf((eol0Var.c - System.currentTimeMillis()) / 1000));
                                                }
                                                lqk0 lqk0Var3 = iol0Var.c;
                                                iol0.U(lqk0Var3);
                                                Long lValueOf2 = Long.valueOf(zzafVar2.a);
                                                lqk0Var3.s(lValueOf2);
                                                iol0Var.a().n.c(str2, "[sgtm] increased batch retry count after failed client upload. appId, rowId", lValueOf2);
                                                return;
                                            }
                                            if (map.containsKey(str)) {
                                                map.remove(str);
                                            }
                                            iol0Var2 = iol0Var3;
                                            lqk0 lqk0Var4 = iol0Var2.c;
                                            iol0.U(lqk0Var4);
                                            Long lValueOf3 = Long.valueOf(j2);
                                            lqk0Var4.n(lValueOf3);
                                            iol0Var2.a().n.c(str2, "[sgtm] queued batch deleted after successful client upload. appId, rowId", lValueOf3);
                                            if (j > 0) {
                                                lqk0Var = iol0Var2.c;
                                                iol0.U(lqk0Var);
                                                k8l0 k8l0Var = lqk0Var.a;
                                                lqk0Var.g();
                                                lqk0Var.h();
                                                lValueOf = Long.valueOf(j);
                                                contentValues = new ContentValues();
                                                contentValues.put("upload_type", Integer.valueOf(i2));
                                                xi9 xi9Var = k8l0Var.k;
                                                y4l0Var = k8l0Var.f;
                                                xi9Var.getClass();
                                                contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                                try {
                                                    if (lqk0Var.V().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str2, String.valueOf(i)}) != 1) {
                                                        k8l0.m(y4l0Var);
                                                        y4l0Var.i.c(str2, "Google Signal pending batch not updated. appId, rowId", lValueOf);
                                                    }
                                                    iol0Var2.a().n.c(str2, "[sgtm] queued Google Signal batch updated. appId, signalRowId", Long.valueOf(j));
                                                    iol0Var2.t(str2);
                                                } catch (SQLiteException e3) {
                                                    k8l0.m(y4l0Var);
                                                    y4l0Var.f.d(str2, "Failed to update google Signal pending batch. appid, rowId", Long.valueOf(j), e3);
                                                    throw e3;
                                                }
                                            }
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        i2 = 1;
                                    }
                                } catch (SQLiteException e5) {
                                    e = e5;
                                    iol0Var3 = iol0Var3;
                                    i = 4;
                                    i2 = 1;
                                    cursorQuery = cursorQuery;
                                    j = j;
                                }
                            } else {
                                iol0Var3 = iol0Var3;
                                i = 4;
                                j = j3;
                                i2 = 1;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        } catch (SQLiteException e6) {
                            e = e6;
                            iol0Var3 = iol0Var3;
                            i = 4;
                            j = j3;
                            i2 = 1;
                            cursorQuery = cursorQuery;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursorQuery = cursorQuery;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    iol0Var3 = iol0Var3;
                    i = 4;
                    j = j3;
                    i2 = 1;
                    cursorQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                }
                nol0Var = nol0VarH;
                if (nol0Var == null) {
                    iol0Var3.a().i.c(str2, "[sgtm] Queued batch doesn't exist. appId, rowId", Long.valueOf(j2));
                    return;
                }
                str = nol0Var.c;
                i3 = zzafVar2.b;
                if (i3 == i2) {
                    iol0Var = iol0Var3;
                    if (i3 == 3) {
                        eol0Var = (eol0) map.get(str);
                        if (eol0Var == null) {
                            eol0Var = new eol0(iol0Var);
                            map.put(str, eol0Var);
                        } else {
                            eol0Var.b += i2;
                            eol0Var.c = eol0Var.a();
                        }
                        iol0Var.e().getClass();
                        iol0Var.a().n.d(str2, "[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, Long.valueOf((eol0Var.c - System.currentTimeMillis()) / 1000));
                    }
                    lqk0 lqk0Var5 = iol0Var.c;
                    iol0.U(lqk0Var5);
                    Long lValueOf4 = Long.valueOf(zzafVar2.a);
                    lqk0Var5.s(lValueOf4);
                    iol0Var.a().n.c(str2, "[sgtm] increased batch retry count after failed client upload. appId, rowId", lValueOf4);
                    return;
                }
                if (map.containsKey(str)) {
                    map.remove(str);
                }
                iol0Var2 = iol0Var3;
                lqk0 lqk0Var6 = iol0Var2.c;
                iol0.U(lqk0Var6);
                Long lValueOf5 = Long.valueOf(j2);
                lqk0Var6.n(lValueOf5);
                iol0Var2.a().n.c(str2, "[sgtm] queued batch deleted after successful client upload. appId, rowId", lValueOf5);
                if (j > 0) {
                    lqk0Var = iol0Var2.c;
                    iol0.U(lqk0Var);
                    k8l0 k8l0Var2 = lqk0Var.a;
                    lqk0Var.g();
                    lqk0Var.h();
                    lValueOf = Long.valueOf(j);
                    contentValues = new ContentValues();
                    contentValues.put("upload_type", Integer.valueOf(i2));
                    xi9 xi9Var2 = k8l0Var2.k;
                    y4l0Var = k8l0Var2.f;
                    xi9Var2.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    if (lqk0Var.V().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str2, String.valueOf(i)}) != 1) {
                        k8l0.m(y4l0Var);
                        y4l0Var.i.c(str2, "Google Signal pending batch not updated. appId, rowId", lValueOf);
                    }
                    iol0Var2.a().n.c(str2, "[sgtm] queued Google Signal batch updated. appId, signalRowId", Long.valueOf(j));
                    iol0Var2.t(str2);
                }
            }
        });
    }

    @Override // defpackage.o3l0
    public final void J(final zzr zzrVar, final Bundle bundle, final u3l0 u3l0Var) {
        d(zzrVar);
        final String str = zzrVar.a;
        hm20.h(str);
        this.a.b().p(new Runnable() { // from class: z9l0
            @Override // java.lang.Runnable
            public final void run() {
                u3l0 u3l0Var2 = u3l0Var;
                iol0 iol0Var = this.a.a;
                iol0Var.B();
                try {
                    u3l0Var2.x(iol0Var.d0(bundle, zzrVar));
                } catch (RemoteException e) {
                    iol0Var.a().f.c(str, "Failed to return trigger URIs for app", e);
                }
            }
        });
    }

    @Override // defpackage.o3l0
    public final zzao L(zzr zzrVar) {
        d(zzrVar);
        String str = zzrVar.a;
        hm20.e(str);
        iol0 iol0Var = this.a;
        try {
            return (zzao) iol0Var.b().o(new k9l0(this, zzrVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            iol0Var.a().f.c(y4l0.k(str), "Failed to get consent. appId", e);
            return new zzao(null);
        }
    }

    @Override // defpackage.o3l0
    public final void N(final Bundle bundle, final zzr zzrVar) {
        d(zzrVar);
        final String str = zzrVar.a;
        hm20.h(str);
        a0(new Runnable() { // from class: qal0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                iol0 iol0Var = this.a.a;
                boolean zQ = iol0Var.e0().q(null, v2l0.V0);
                Bundle bundle2 = bundle;
                boolean zIsEmpty = bundle2.isEmpty();
                String str2 = str;
                if (zIsEmpty && zQ) {
                    lqk0 lqk0Var = iol0Var.c;
                    iol0.U(lqk0Var);
                    lqk0Var.g();
                    lqk0Var.h();
                    try {
                        lqk0Var.V().execSQL("delete from default_event_params where app_id=?", new String[]{str2});
                        return;
                    } catch (SQLiteException e) {
                        y4l0 y4l0Var = lqk0Var.a.f;
                        k8l0.m(y4l0Var);
                        y4l0Var.f.b(e, "Error clearing default event params");
                        return;
                    }
                }
                lqk0 lqk0Var2 = iol0Var.c;
                iol0.U(lqk0Var2);
                k8l0 k8l0Var = lqk0Var2.a;
                lqk0Var2.g();
                lqk0Var2.h();
                isk0 isk0Var = new isk0(lqk0Var2.a, "", str2, "dep", 0L, 0L, bundle2);
                pol0 pol0Var = lqk0Var2.b.g;
                iol0.U(pol0Var);
                byte[] bArrE = pol0Var.D(isk0Var).e();
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.n.c(str2, "Saving default event parameters, appId, data size", Integer.valueOf(bArrE.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put(PublisherMetadata.APP_ID, str2);
                contentValues.put("parameters", bArrE);
                try {
                    if (lqk0Var2.V().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        k8l0.m(y4l0Var2);
                        y4l0Var2.f.b(y4l0.k(str2), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e2) {
                    k8l0.m(y4l0Var2);
                    y4l0Var2.f.c(y4l0.k(str2), "Error storing default event parameters. appId", e2);
                }
                lqk0 lqk0Var3 = iol0Var.c;
                iol0.U(lqk0Var3);
                long j = zzrVar.S;
                try {
                    if (lqk0Var3.R("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str2, String.valueOf(j)}, 0L) <= 0 && lqk0Var3.R("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str2, String.valueOf(j)}, 0L) > 0) {
                        lqk0 lqk0Var4 = iol0Var.c;
                        iol0.U(lqk0Var4);
                        lqk0Var4.y(str2, Long.valueOf(j), null, bundle2);
                    }
                } catch (SQLiteException e3) {
                    y4l0 y4l0Var3 = lqk0Var3.a.f;
                    k8l0.m(y4l0Var3);
                    y4l0Var3.f.b(e3, "Error checking backfill conditions");
                }
            }
        });
    }

    @Override // defpackage.o3l0
    public final void Q(zzr zzrVar) {
        d(zzrVar);
        a0(new o8l0(this, zzrVar));
    }

    @Override // defpackage.o3l0
    public final void R(zzr zzrVar, final zzoo zzooVar, final z3l0 z3l0Var) {
        d(zzrVar);
        final String str = zzrVar.a;
        hm20.h(str);
        this.a.b().p(new Runnable() { // from class: bal0
            @Override // java.lang.Runnable
            public final void run() {
                z3l0 z3l0Var2 = z3l0Var;
                iol0 iol0Var = this.a.a;
                iol0Var.B();
                iol0Var.b().g();
                iol0Var.l0();
                lqk0 lqk0Var = iol0Var.c;
                iol0.U(lqk0Var);
                int iIntValue = ((Integer) v2l0.B.a(null)).intValue();
                String str2 = str;
                List<nol0> listL = lqk0Var.l(str2, zzooVar, iIntValue);
                ArrayList arrayList = new ArrayList();
                for (nol0 nol0Var : listL) {
                    String str3 = nol0Var.c;
                    long j = nol0Var.h;
                    long j2 = nol0Var.a;
                    if (iol0Var.s(str2, str3)) {
                        int i = nol0Var.i;
                        if (i > 0) {
                            if (i <= ((Integer) v2l0.z.a(null)).intValue()) {
                                long jMin = Math.min(((Long) v2l0.x.a(null)).longValue() * (1 << (i - 1)), ((Long) v2l0.y.a(null)).longValue());
                                iol0Var.e().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                }
                            }
                            iol0Var.a().n.d(str2, "[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", Long.valueOf(j2), Long.valueOf(j));
                        }
                        Bundle bundle = new Bundle();
                        for (Map.Entry entry : nol0Var.d.entrySet()) {
                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        long j3 = nol0Var.a;
                        j8l0 j8l0Var = nol0Var.b;
                        zzom zzomVar = new zzom(j3, j8l0Var.e(), nol0Var.c, bundle, nol0Var.e.a, nol0Var.g, "");
                        try {
                            q7l0 q7l0Var = (q7l0) pol0.O(j8l0.x(), zzomVar.b);
                            for (int i2 = 0; i2 < ((j8l0) q7l0Var.b).r(); i2++) {
                                l8l0 l8l0Var = (l8l0) ((j8l0) q7l0Var.b).s(i2).k();
                                iol0Var.e().getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                l8l0Var.g();
                                ((n8l0) l8l0Var.b).g0(jCurrentTimeMillis);
                                q7l0Var.g();
                                ((j8l0) q7l0Var.b).z(i2, (n8l0) l8l0Var.i());
                            }
                            zzomVar.b = ((j8l0) q7l0Var.i()).e();
                            if (Log.isLoggable(iol0Var.a().m(), 2)) {
                                pol0 pol0Var = iol0Var.g;
                                iol0.U(pol0Var);
                                zzomVar.i = pol0Var.E((j8l0) q7l0Var.i());
                            }
                            arrayList.add(zzomVar);
                        } catch (oil0 unused) {
                            iol0Var.a().i.b(str2, "Failed to parse queued batch. appId");
                        }
                    } else {
                        iol0Var.a().n.d(str2, "[sgtm] batch skipped due to destination in backoff. appId, rowId, url", Long.valueOf(j2), nol0Var.c);
                    }
                }
                zzoq zzoqVar = new zzoq(arrayList);
                try {
                    z3l0Var2.S(zzoqVar);
                    iol0Var.a().n.c(str2, "[sgtm] Sending queued upload batches to client. appId, count", Integer.valueOf(zzoqVar.a.size()));
                } catch (RemoteException e) {
                    iol0Var.a().f.c(str2, "[sgtm] Failed to return upload batches for app", e);
                }
            }
        });
    }

    @Override // defpackage.o3l0
    public final void T(zzr zzrVar) {
        d(zzrVar);
        a0(new q8l0(this, zzrVar));
    }

    @Override // defpackage.o3l0
    public final List V(String str, String str2, boolean z, zzr zzrVar) {
        d(zzrVar);
        String str3 = zzrVar.a;
        hm20.h(str3);
        iol0 iol0Var = this.a;
        try {
            List<uol0> list = (List) iol0Var.b().n(new y8l0(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (uol0 uol0Var : list) {
                if (z || !yol0.F(uol0Var.c)) {
                    arrayList.add(new zzpl(uol0Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            iol0Var.a().f.c(y4l0.k(str3), "Failed to query user properties. appId", e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            iol0Var.a().f.c(y4l0.k(str3), "Failed to query user properties. appId", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.o3l0
    public final List W(String str, String str2, zzr zzrVar) {
        d(zzrVar);
        String str3 = zzrVar.a;
        hm20.h(str3);
        iol0 iol0Var = this.a;
        try {
            return (List) iol0Var.b().n(new c9l0(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            iol0Var.a().f.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.o3l0
    public final void Y(zzr zzrVar) {
        hm20.e(zzrVar.a);
        hm20.h(zzrVar.H);
        b(new j9l0(this, zzrVar));
    }

    public final void Z(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        iol0 iol0Var = this.a;
        if (zIsEmpty) {
            iol0Var.a().f.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                Boolean boolValueOf = this.b;
                if (boolValueOf == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.c) && !adh0.a(iol0Var.l.a, Binder.getCallingUid()) && !e6l.a(iol0Var.l.a).b(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    boolValueOf = Boolean.valueOf(z2);
                    this.b = boolValueOf;
                }
                if (boolValueOf.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                iol0Var.a().f.b(y4l0.k(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.c == null) {
            Context context = iol0Var.l.a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = m5l.a;
            if (adh0.b(callingUid, context, str)) {
                this.c = str;
            }
        }
        if (str.equals(this.c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void a0(Runnable runnable) {
        iol0 iol0Var = this.a;
        if (iol0Var.b().m()) {
            runnable.run();
        } else {
            iol0Var.b().p(runnable);
        }
    }

    public final void b(Runnable runnable) {
        iol0 iol0Var = this.a;
        if (iol0Var.b().m()) {
            runnable.run();
        } else {
            iol0Var.b().r(runnable);
        }
    }

    public final void d(zzr zzrVar) {
        hm20.h(zzrVar);
        String str = zzrVar.a;
        hm20.e(str);
        Z(str, false);
        this.a.k0().k(zzrVar.b);
    }

    @Override // defpackage.o3l0
    public final List f(String str, String str2, String str3, boolean z) {
        Z(str, true);
        iol0 iol0Var = this.a;
        try {
            List<uol0> list = (List) iol0Var.b().n(new a9l0(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (uol0 uol0Var : list) {
                if (z || !yol0.F(uol0Var.c)) {
                    arrayList.add(new zzpl(uol0Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            iol0Var.a().f.c(y4l0.k(str), "Failed to get user properties as. appId", e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            iol0Var.a().f.c(y4l0.k(str), "Failed to get user properties as. appId", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.o3l0
    public final void g(zzah zzahVar, zzr zzrVar) {
        hm20.h(zzahVar);
        hm20.h(zzahVar.c);
        d(zzrVar);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.a = zzrVar.a;
        a0(new u8l0(this, zzahVar2, zzrVar));
    }

    @Override // defpackage.o3l0
    public final List l(String str, String str2, String str3) {
        Z(str, true);
        iol0 iol0Var = this.a;
        try {
            return (List) iol0Var.b().n(new e9l0(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            iol0Var.a().f.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.o3l0
    public final void n(final zzr zzrVar) {
        hm20.e(zzrVar.a);
        hm20.h(zzrVar.H);
        b(new Runnable() { // from class: sal0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                iol0 iol0Var = this.a.a;
                iol0Var.B();
                iol0Var.m0(zzrVar);
            }
        });
    }

    @Override // defpackage.o3l0
    public final void q(zzbg zzbgVar, zzr zzrVar) {
        hm20.h(zzbgVar);
        d(zzrVar);
        a0(new m9l0(this, zzbgVar, zzrVar));
    }

    @Override // defpackage.o3l0
    public final void r(zzr zzrVar) {
        d(zzrVar);
        a0(new g9l0(this, zzrVar));
    }

    @Override // defpackage.o3l0
    public final void s(final zzr zzrVar) {
        hm20.e(zzrVar.a);
        hm20.h(zzrVar.H);
        b(new Runnable() { // from class: x9l0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                iol0 iol0Var = this.a.a;
                iol0Var.B();
                iol0Var.n0(zzrVar);
            }
        });
    }

    @Override // defpackage.o3l0
    public final byte[] t(zzbg zzbgVar, String str) {
        hm20.e(str);
        hm20.h(zzbgVar);
        Z(str, true);
        iol0 iol0Var = this.a;
        u4l0 u4l0Var = iol0Var.a().m;
        k8l0 k8l0Var = iol0Var.l;
        k4l0 k4l0Var = k8l0Var.j;
        String str2 = zzbgVar.a;
        u4l0Var.b(k4l0Var.a(str2), "Log and bundle. event");
        iol0Var.e().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) iol0Var.b().o(new p9l0(this, zzbgVar, str)).get();
            if (bArr == null) {
                iol0Var.a().f.b(y4l0.k(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            iol0Var.e().getClass();
            iol0Var.a().m.d(k8l0Var.j.a(str2), "Log and bundle processed. event, size, time_ms", Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            iol0Var.a().f.d(y4l0.k(str), "Failed to log and bundle. appId, event, error", k8l0Var.j.a(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            iol0Var.a().f.d(y4l0.k(str), "Failed to log and bundle. appId, event, error", k8l0Var.j.a(str2), e);
            return null;
        }
    }

    @Override // defpackage.o3l0
    public final void v(zzpl zzplVar, zzr zzrVar) {
        hm20.h(zzplVar);
        d(zzrVar);
        a0(new r9l0(this, zzplVar, zzrVar));
    }
}
