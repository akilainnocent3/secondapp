package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3688g9 f54432a;

    public C4(C3688g9 databaseHelper) {
        kotlin.jvm.internal.m0.p(databaseHelper, "databaseHelper");
        this.f54432a = databaseHelper;
    }

    public final Object a(int i10, long j10, J4 j11) {
        Object objA = this.f54432a.a("DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + j10 + " ORDER BY timestamp DESC LIMIT " + i10 + ") foo);", j11);
        return objA == qr.d.l() ? objA : dr.w2.f79517a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rr.d dVar) {
        A4 a10;
        if (dVar instanceof A4) {
            a10 = (A4) dVar;
            int i10 = a10.f54327c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a10.f54327c = i10 - Integer.MIN_VALUE;
            } else {
                a10 = new A4(this, dVar);
            }
        } else {
            a10 = new A4(this, dVar);
        }
        Object objA = a10.f54325a;
        Object objL = qr.d.l();
        int i11 = a10.f54327c;
        if (i11 == 0) {
            dr.j1.n(objA);
            C3688g9 c3688g9 = this.f54432a;
            a10.f54327c = 1;
            c3688g9.getClass();
            objA = c3688g9.a(new C3585c9(c3688g9, "SELECT * FROM c_data", null), a10);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objA);
        }
        Iterable<ContentValues> iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(fr.i0.d0(iterable, 10));
        for (ContentValues contentValues : iterable) {
            kotlin.jvm.internal.m0.p(contentValues, "<this>");
            String asString = contentValues.getAsString("e_data");
            kotlin.jvm.internal.m0.o(asString, "getAsString(...)");
            Long asLong = contentValues.getAsLong("timestamp");
            kotlin.jvm.internal.m0.o(asLong, "getAsLong(...)");
            arrayList.add(new W5(asString, asLong.longValue()));
        }
        return arrayList;
    }
}
