package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.inmobi.media.og, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3894og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3688g9 f57227a;

    public C3894og(C3688g9 databaseHelper) {
        kotlin.jvm.internal.m0.p(databaseHelper, "databaseHelper");
        this.f57227a = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Integer num, String str, long j10, rr.d dVar) {
        C3869ng c3869ng;
        String str2;
        if (dVar instanceof C3869ng) {
            c3869ng = (C3869ng) dVar;
            int i10 = c3869ng.f57110c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3869ng.f57110c = i10 - Integer.MIN_VALUE;
            } else {
                c3869ng = new C3869ng(this, dVar);
            }
        } else {
            c3869ng = new C3869ng(this, dVar);
        }
        Object objA = c3869ng.f57108a;
        Object objL = qr.d.l();
        int i11 = c3869ng.f57110c;
        if (i11 == 0) {
            dr.j1.n(objA);
            if (num != null) {
                str2 = " LIMIT " + num.intValue();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count=0 AND time_created<" + j10 + " ORDER BY time_created ASC" + str2;
            C3688g9 c3688g9 = this.f57227a;
            c3869ng.f57110c = 1;
            c3688g9.getClass();
            objA = c3688g9.a(new C3585c9(c3688g9, str3, null), c3869ng);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(fr.i0.d0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3919pg.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    public final Object b(String str, rr.d dVar) {
        String str2 = "SELECT COUNT(*) FROM pings WHERE priority='" + str + "'";
        C3688g9 c3688g9 = this.f57227a;
        c3688g9.getClass();
        return c3688g9.a(new Y8(c3688g9, str2, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, Integer num, rr.d dVar) {
        C3844mg c3844mg;
        String str2;
        if (dVar instanceof C3844mg) {
            c3844mg = (C3844mg) dVar;
            int i10 = c3844mg.f57019c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3844mg.f57019c = i10 - Integer.MIN_VALUE;
            } else {
                c3844mg = new C3844mg(this, dVar);
            }
        } else {
            c3844mg = new C3844mg(this, dVar);
        }
        Object objA = c3844mg.f57017a;
        Object objL = qr.d.l();
        int i11 = c3844mg.f57019c;
        if (i11 == 0) {
            dr.j1.n(objA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (num != null) {
                str2 = " LIMIT " + num.intValue();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count>=1 AND retryAfter<=" + jCurrentTimeMillis + " ORDER BY time_created ASC" + str2;
            C3688g9 c3688g9 = this.f57227a;
            c3844mg.f57019c = 1;
            c3688g9.getClass();
            objA = c3688g9.a(new C3585c9(c3688g9, str3, null), c3844mg);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(fr.i0.d0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3919pg.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Integer num, rr.d dVar) {
        C3819lg c3819lg;
        String str2;
        if (dVar instanceof C3819lg) {
            c3819lg = (C3819lg) dVar;
            int i10 = c3819lg.f56937c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3819lg.f56937c = i10 - Integer.MIN_VALUE;
            } else {
                c3819lg = new C3819lg(this, dVar);
            }
        } else {
            c3819lg = new C3819lg(this, dVar);
        }
        Object objA = c3819lg.f56935a;
        Object objL = qr.d.l();
        int i11 = c3819lg.f56937c;
        if (i11 == 0) {
            dr.j1.n(objA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (num != null) {
                str2 = " LIMIT " + num.intValue();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retryAfter<=" + jCurrentTimeMillis + " ORDER BY time_created ASC" + str2;
            C3688g9 c3688g9 = this.f57227a;
            c3819lg.f56937c = 1;
            c3688g9.getClass();
            objA = c3688g9.a(new C3585c9(c3688g9, str3, null), c3819lg);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dr.j1.n(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(fr.i0.d0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3919pg.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, rr.d dVar) {
        C3794kg c3794kg;
        if (dVar instanceof C3794kg) {
            c3794kg = (C3794kg) dVar;
            int i10 = c3794kg.f56824d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3794kg.f56824d = i10 - Integer.MIN_VALUE;
            } else {
                c3794kg = new C3794kg(this, dVar);
            }
        } else {
            c3794kg = new C3794kg(this, dVar);
        }
        Object objA = c3794kg.f56822b;
        Object objL = qr.d.l();
        int i11 = c3794kg.f56824d;
        if (i11 == 0) {
            dr.j1.n(objA);
            C3688g9 c3688g9 = this.f57227a;
            c3794kg.f56824d = 1;
            c3688g9.getClass();
            objA = c3688g9.a(new C3585c9(c3688g9, "SELECT * FROM pings WHERE priority='" + str + "' ORDER BY time_created ASC LIMIT 1", null), c3794kg);
            if (objA != objL) {
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Rf rf2 = c3794kg.f56821a;
            dr.j1.n(objA);
            return rf2;
        }
        dr.j1.n(objA);
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(fr.i0.d0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3919pg.a((ContentValues) it.next()));
        }
        Rf rf3 = (Rf) fr.r0.L2(arrayList);
        if (rf3 != null) {
            C3688g9 c3688g10 = this.f57227a;
            String[] strArr = {rf3.f55436b};
            c3794kg.f56821a = rf3;
            c3794kg.f56824d = 2;
            if (c3688g10.a("pings", "id=?", strArr, c3794kg) == objL) {
                return objL;
            }
        }
        return rf3;
    }

    public final Object a(long j10, rr.d dVar) {
        String strValueOf = String.valueOf(System.currentTimeMillis() - j10);
        Object objA = C3688g9.a(this.f57227a, "pings", "time_created<" + strValueOf, dVar, 4);
        return objA == qr.d.l() ? objA : dr.w2.f79517a;
    }
}
