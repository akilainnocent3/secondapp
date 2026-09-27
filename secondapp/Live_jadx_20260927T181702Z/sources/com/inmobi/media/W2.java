package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3688g9 f55705a;

    public W2(C3688g9 databaseHelper) {
        kotlin.jvm.internal.m0.p(databaseHelper, "databaseHelper");
        this.f55705a = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(int i10, int i11, rr.d dVar) {
        T2 t10;
        if (dVar instanceof T2) {
            t10 = (T2) dVar;
            int i12 = t10.f55533c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                t10.f55533c = i12 - Integer.MIN_VALUE;
            } else {
                t10 = new T2(this, dVar);
            }
        } else {
            t10 = new T2(this, dVar);
        }
        Object objA = t10.f55531a;
        Object objL = qr.d.l();
        int i13 = t10.f55533c;
        if (i13 == 0) {
            dr.j1.n(objA);
            String str = "SELECT * FROM click WHERE ts < " + (System.currentTimeMillis() - ((long) i11)) + " ORDER BY ts ASC LIMIT " + i10;
            C3688g9 c3688g9 = this.f55705a;
            t10.f55533c = 1;
            c3688g9.getClass();
            objA = c3688g9.a(new C3585c9(c3688g9, str, null), t10);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objA);
        }
        Iterable<ContentValues> iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(fr.i0.d0(iterable, 10));
        for (ContentValues contentValues : iterable) {
            kotlin.jvm.internal.m0.p(contentValues, "<this>");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String asString = contentValues.getAsString("track_extras");
            if (asString != null) {
                try {
                    JSONObject jSONObject = new JSONObject(asString);
                    kotlin.jvm.internal.m0.p(jSONObject, "<this>");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object obj = jSONObject.get(next);
                        kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap2.put(next, (String) obj);
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                } catch (Exception unused) {
                }
            }
            Integer asInteger = contentValues.getAsInteger("id");
            kotlin.jvm.internal.m0.o(asInteger, "getAsInteger(...)");
            int iIntValue = asInteger.intValue();
            String asString2 = contentValues.getAsString("url");
            kotlin.jvm.internal.m0.o(asString2, "getAsString(...)");
            Boolean asBoolean = contentValues.getAsBoolean("follow_redirect");
            kotlin.jvm.internal.m0.o(asBoolean, "getAsBoolean(...)");
            boolean zBooleanValue = asBoolean.booleanValue();
            Boolean asBoolean2 = contentValues.getAsBoolean("ping_in_webview");
            kotlin.jvm.internal.m0.o(asBoolean2, "getAsBoolean(...)");
            boolean zBooleanValue2 = asBoolean2.booleanValue();
            Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
            kotlin.jvm.internal.m0.o(asInteger2, "getAsInteger(...)");
            int iIntValue2 = asInteger2.intValue();
            Long asLong = contentValues.getAsLong("ts");
            kotlin.jvm.internal.m0.o(asLong, "getAsLong(...)");
            long jLongValue = asLong.longValue();
            Long asLong2 = contentValues.getAsLong("created_ts");
            kotlin.jvm.internal.m0.o(asLong2, "getAsLong(...)");
            arrayList.add(new S2(iIntValue, asString2, linkedHashMap, zBooleanValue, zBooleanValue2, iIntValue2, jLongValue, asLong2.longValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rr.d dVar) {
        U2 u10;
        if (dVar instanceof U2) {
            u10 = (U2) dVar;
            int i10 = u10.f55594c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                u10.f55594c = i10 - Integer.MIN_VALUE;
            } else {
                u10 = new U2(this, dVar);
            }
        } else {
            u10 = new U2(this, dVar);
        }
        Object objA = u10.f55592a;
        Object objL = qr.d.l();
        int i11 = u10.f55594c;
        if (i11 == 0) {
            dr.j1.n(objA);
            C3688g9 c3688g9 = this.f55705a;
            u10.f55594c = 1;
            c3688g9.getClass();
            objA = c3688g9.a(new Y8(c3688g9, "SELECT COUNT(*) FROM click", null), u10);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objA);
        }
        return rr.b.a(((Number) objA).intValue() != 0);
    }
}
