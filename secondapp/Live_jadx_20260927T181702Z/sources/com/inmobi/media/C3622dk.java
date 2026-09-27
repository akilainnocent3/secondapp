package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.dk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3622dk extends AbstractC3608d6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3688g9 f56286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3622dk(C3688g9 databaseHelper) {
        super("telemetry", databaseHelper);
        kotlin.jvm.internal.m0.p(databaseHelper, "databaseHelper");
        this.f56286c = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC3608d6
    public final Object b(int i10, rr.d dVar) {
        C3596ck c3596ck;
        if (dVar instanceof C3596ck) {
            c3596ck = (C3596ck) dVar;
            int i11 = c3596ck.f56218c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3596ck.f56218c = i11 - Integer.MIN_VALUE;
            } else {
                c3596ck = new C3596ck(this, dVar);
            }
        } else {
            c3596ck = new C3596ck(this, dVar);
        }
        Object objA = c3596ck.f56216a;
        Object objL = qr.d.l();
        int i12 = c3596ck.f56218c;
        if (i12 == 0) {
            dr.j1.n(objA);
            C3688g9 c3688g9 = this.f56286c;
            c3596ck.f56218c = 1;
            c3688g9.getClass();
            objA = c3688g9.a(new C3585c9(c3688g9, "SELECT * FROM telemetry ORDER BY ts ASC LIMIT " + i10, null), c3596ck);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objA);
        }
        List<ContentValues> list = (List) objA;
        ArrayList arrayList = new ArrayList(fr.i0.d0(list, 10));
        for (ContentValues contentValues : list) {
            kotlin.jvm.internal.m0.p(contentValues, "contentValues");
            String asString = contentValues.getAsString("eventType");
            String asString2 = contentValues.getAsString(eq.c.f81520j);
            String asString3 = contentValues.getAsString("eventSource");
            String asString4 = contentValues.getAsString("ts");
            kotlin.jvm.internal.m0.o(asString4, "getAsString(...)");
            long j10 = Long.parseLong(asString4);
            kotlin.jvm.internal.m0.m(asString);
            kotlin.jvm.internal.m0.m(asString3);
            C3647ek c3647ek = new C3647ek(asString, asString2, asString3);
            c3647ek.f56634c = j10;
            Integer asInteger = contentValues.getAsInteger("id");
            kotlin.jvm.internal.m0.o(asInteger, "getAsInteger(...)");
            c3647ek.f56635d = asInteger.intValue();
            arrayList.add(c3647ek);
        }
        return arrayList;
    }
}
