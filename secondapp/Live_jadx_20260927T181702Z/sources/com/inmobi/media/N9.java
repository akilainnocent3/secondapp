package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class N9 extends AbstractC3608d6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3688g9 f55206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N9(C3688g9 databaseHelper) {
        super("crash", databaseHelper);
        kotlin.jvm.internal.m0.p(databaseHelper, "databaseHelper");
        this.f55206c = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC3608d6
    public final Object b(int i10, rr.d dVar) {
        M9 m10;
        if (dVar instanceof M9) {
            m10 = (M9) dVar;
            int i11 = m10.f55136c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m10.f55136c = i11 - Integer.MIN_VALUE;
            } else {
                m10 = new M9(this, dVar);
            }
        } else {
            m10 = new M9(this, dVar);
        }
        Object objA = m10.f55134a;
        Object objL = qr.d.l();
        int i12 = m10.f55136c;
        if (i12 == 0) {
            dr.j1.n(objA);
            C3688g9 c3688g9 = this.f55206c;
            m10.f55136c = 1;
            c3688g9.getClass();
            objA = c3688g9.a(new C3585c9(c3688g9, "SELECT * FROM crash ORDER BY ts ASC LIMIT " + i10, null), m10);
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
            String asString = contentValues.getAsString("eventId");
            String asString2 = contentValues.getAsString("eventType");
            String asString3 = contentValues.getAsString("componentType");
            String asString4 = contentValues.getAsString(eq.c.f81520j);
            String asString5 = contentValues.getAsString("ts");
            kotlin.jvm.internal.m0.o(asString5, "getAsString(...)");
            long j10 = Long.parseLong(asString5);
            kotlin.jvm.internal.m0.m(asString);
            kotlin.jvm.internal.m0.m(asString3);
            kotlin.jvm.internal.m0.m(asString2);
            Q9 q10 = new Q9(asString, asString3, asString2, asString4);
            q10.f56634c = j10;
            Integer asInteger = contentValues.getAsInteger("id");
            kotlin.jvm.internal.m0.o(asInteger, "getAsInteger(...)");
            q10.f56635d = asInteger.intValue();
            arrayList.add(q10);
        }
        return arrayList;
    }
}
