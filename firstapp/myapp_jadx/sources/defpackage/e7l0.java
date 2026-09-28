package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import com.twilio.voice.PublisherMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class e7l0 extends vml0 implements tok0 {
    public final ox0 d;
    public final ox0 e;
    public final ox0 f;
    public final ox0 g;
    public final ox0 h;
    public final ox0 i;
    public final r6l0 j;
    public final t6l0 k;
    public final ox0 l;
    public final ox0 m;
    public final ox0 n;

    public e7l0(iol0 iol0Var) {
        super(iol0Var);
        this.d = new ox0();
        this.e = new ox0();
        this.f = new ox0();
        this.g = new ox0();
        this.h = new ox0();
        this.l = new ox0();
        this.m = new ox0();
        this.n = new ox0();
        this.i = new ox0();
        this.j = new r6l0(this);
        this.k = new t6l0(this);
    }

    public static final ox0 q(i4l0 i4l0Var) {
        ox0 ox0Var = new ox0();
        for (x4l0 x4l0Var : i4l0Var.u()) {
            ox0Var.put(x4l0Var.q(), x4l0Var.r());
        }
        return ox0Var;
    }

    public static final hbl0 r(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return hbl0.AD_STORAGE;
        }
        if (i2 == 2) {
            return hbl0.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return hbl0.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return hbl0.AD_PERSONALIZATION;
    }

    public final boolean A(String str, hbl0 hbl0Var) {
        g();
        m(str);
        w3l0 w3l0VarB = B(str);
        if (w3l0VarB == null) {
            return false;
        }
        for (o2l0 o2l0Var : w3l0VarB.q()) {
            if (hbl0Var == r(o2l0Var.q())) {
                return o2l0Var.r() == 2;
            }
        }
        return false;
    }

    public final w3l0 B(String str) {
        g();
        m(str);
        i4l0 i4l0VarS = s(str);
        if (i4l0VarS == null || !i4l0VarS.C()) {
            return null;
        }
        return i4l0VarS.D();
    }

    @Override // defpackage.tok0
    public final String f(String str, String str2) {
        g();
        m(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // defpackage.vml0
    public final void j() {
    }

    public final dbl0 k(String str, hbl0 hbl0Var) {
        g();
        m(str);
        w3l0 w3l0VarB = B(str);
        if (w3l0VarB != null) {
            for (o2l0 o2l0Var : w3l0VarB.v()) {
                if (r(o2l0Var.q()) == hbl0Var) {
                    int iR = o2l0Var.r() - 1;
                    if (iR == 1) {
                        return dbl0.GRANTED;
                    }
                    if (iR != 2) {
                        break;
                    }
                    return dbl0.DENIED;
                }
            }
        }
        return dbl0.UNINITIALIZED;
    }

    public final boolean l(String str) {
        g();
        m(str);
        w3l0 w3l0VarB = B(str);
        if (w3l0VarB == null) {
            return false;
        }
        for (o2l0 o2l0Var : w3l0VarB.q()) {
            if (o2l0Var.q() == 3 && o2l0Var.s() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void m(String str) {
        h();
        g();
        hm20.e(str);
        ox0 ox0Var = this.h;
        if (ox0Var.get(str) == 0) {
            lqk0 lqk0Var = this.b.c;
            iol0.U(lqk0Var);
            rpk0 rpk0VarM0 = lqk0Var.m0(str);
            ox0 ox0Var2 = this.n;
            ox0 ox0Var3 = this.m;
            ox0 ox0Var4 = this.l;
            ox0 ox0Var5 = this.d;
            if (rpk0VarM0 != null) {
                g4l0 g4l0Var = (g4l0) p(str, rpk0VarM0.a).k();
                n(str, g4l0Var);
                ox0Var5.put(str, q((i4l0) g4l0Var.i()));
                ox0Var.put(str, (i4l0) g4l0Var.i());
                o(str, (i4l0) g4l0Var.i());
                ox0Var4.put(str, ((i4l0) g4l0Var.b).B());
                ox0Var3.put(str, rpk0VarM0.b);
                ox0Var2.put(str, rpk0VarM0.c);
                return;
            }
            ox0Var5.put(str, null);
            this.f.put(str, null);
            this.e.put(str, null);
            this.g.put(str, null);
            ox0Var.put(str, null);
            ox0Var4.put(str, null);
            ox0Var3.put(str, null);
            ox0Var2.put(str, null);
            this.i.put(str, null);
        }
    }

    public final void n(String str, g4l0 g4l0Var) {
        HashSet hashSet = new HashSet();
        ox0 ox0Var = new ox0();
        ox0 ox0Var2 = new ox0();
        ox0 ox0Var3 = new ox0();
        Iterator it = Collections.unmodifiableList(((i4l0) g4l0Var.b).A()).iterator();
        while (it.hasNext()) {
            hashSet.add(((a4l0) it.next()).q());
        }
        for (int i = 0; i < ((i4l0) g4l0Var.b).v(); i++) {
            c4l0 c4l0Var = (c4l0) ((i4l0) g4l0Var.b).w(i).k();
            boolean zIsEmpty = c4l0Var.l().isEmpty();
            k8l0 k8l0Var = this.a;
            if (zIsEmpty) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.i.a("EventConfig contained null event name");
            } else {
                String strL = c4l0Var.l();
                String strB = ggl0.b(c4l0Var.l(), lbl0.a, lbl0.c);
                if (!TextUtils.isEmpty(strB)) {
                    c4l0Var.g();
                    ((e4l0) c4l0Var.b).x(strB);
                    g4l0Var.g();
                    ((i4l0) g4l0Var.b).I(i, (e4l0) c4l0Var.i());
                }
                if (((e4l0) c4l0Var.b).r() && ((e4l0) c4l0Var.b).s()) {
                    ox0Var.put(strL, Boolean.TRUE);
                }
                if (((e4l0) c4l0Var.b).t() && ((e4l0) c4l0Var.b).u()) {
                    ox0Var2.put(c4l0Var.l(), Boolean.TRUE);
                }
                if (((e4l0) c4l0Var.b).v()) {
                    if (((e4l0) c4l0Var.b).w() < 2 || ((e4l0) c4l0Var.b).w() > 65535) {
                        y4l0 y4l0Var2 = k8l0Var.f;
                        k8l0.m(y4l0Var2);
                        y4l0Var2.i.c(c4l0Var.l(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(((e4l0) c4l0Var.b).w()));
                    } else {
                        ox0Var3.put(c4l0Var.l(), Integer.valueOf(((e4l0) c4l0Var.b).w()));
                    }
                }
            }
        }
        this.e.put(str, hashSet);
        this.f.put(str, ox0Var);
        this.g.put(str, ox0Var2);
        this.i.put(str, ox0Var3);
    }

    public final void o(final String str, i4l0 i4l0Var) {
        int iZ = i4l0Var.z();
        r6l0 r6l0Var = this.j;
        if (iZ == 0) {
            r6l0Var.d(str);
            return;
        }
        k8l0 k8l0Var = this.a;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        y4l0Var.n.b(Integer.valueOf(i4l0Var.z()), "EES programs found");
        pal0 pal0Var = (pal0) i4l0Var.y().get(0);
        try {
            muk0 muk0Var = new muk0();
            j1l0 j1l0Var = muk0Var.a;
            j1l0Var.d.a.put("internal.remoteConfig", new Callable() { // from class: c7l0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    u6l0 u6l0Var = new u6l0(this.a, str);
                    gjl0 gjl0Var = new gjl0("internal.remoteConfig");
                    gjl0Var.b.put("getValue", new ehl0(gjl0Var, u6l0Var));
                    return gjl0Var;
                }
            });
            j1l0Var.d.a.put("internal.appMetadata", new Callable() { // from class: w6l0
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new ssl0(new a7l0(this.a, str));
                }
            });
            j1l0Var.d.a.put("internal.logger", new Callable() { // from class: y6l0
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new jsl0(this.a.k);
                }
            });
            muk0Var.b(pal0Var);
            r6l0Var.c(str, muk0Var);
            k8l0.m(y4l0Var);
            u4l0 u4l0Var = y4l0Var.n;
            u4l0Var.c(str, "EES program loaded for appId, activities", Integer.valueOf(pal0Var.r().r()));
            for (aal0 aal0Var : pal0Var.r().q()) {
                k8l0.m(y4l0Var);
                u4l0Var.b(aal0Var.q(), "EES program activity");
            }
        } catch (wwk0 unused) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.b(str, "Failed to load EES program. appId");
        }
    }

    public final i4l0 p(String str, byte[] bArr) {
        k8l0 k8l0Var = this.a;
        if (bArr == null) {
            return i4l0.H();
        }
        try {
            i4l0 i4l0Var = (i4l0) ((g4l0) pol0.O(i4l0.G(), bArr)).i();
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.n.c(i4l0Var.q() ? Long.valueOf(i4l0Var.r()) : null, "Parsed config. version, gmp_app_id", i4l0Var.s() ? i4l0Var.t() : null);
            return i4l0Var;
        } catch (RuntimeException e) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.i.c(y4l0.k(str), "Unable to merge remote config. appId", e);
            return i4l0.H();
        } catch (oil0 e2) {
            y4l0 y4l0Var3 = k8l0Var.f;
            k8l0.m(y4l0Var3);
            y4l0Var3.i.c(y4l0.k(str), "Unable to merge remote config. appId", e2);
            return i4l0.H();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i4l0 s(String str) {
        h();
        g();
        hm20.e(str);
        m(str);
        return (i4l0) this.h.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String t(String str) {
        g();
        m(str);
        return (String) this.l.get(str);
    }

    public final boolean v(String str, String str2) {
        Boolean bool;
        g();
        m(str);
        if ("1".equals(f(str, "measurement.upload.blacklist_internal")) && yol0.F(str2)) {
            return true;
        }
        if ("1".equals(f(str, "measurement.upload.blacklist_public")) && yol0.f0(str2)) {
            return true;
        }
        Map map = (Map) this.f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean w(String str, String str2) {
        Boolean bool;
        g();
        m(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int x(String str, String str2) {
        Integer num;
        g();
        m(str);
        Map map = (Map) this.i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean y(String str) {
        g();
        m(str);
        ox0 ox0Var = this.e;
        if (ox0Var.get(str) != 0) {
            return ((Set) ox0Var.get(str)).contains(PublisherMetadata.OS_VERSION) || ((Set) ox0Var.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean z(String str) {
        g();
        m(str);
        ox0 ox0Var = this.e;
        return ox0Var.get(str) != 0 && ((Set) ox0Var.get(str)).contains("app_instance_id");
    }

    public final void u(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        g4l0 g4l0Var;
        byte[] bArrE;
        int i;
        int i2;
        boolean z;
        h();
        g();
        hm20.e(str);
        g4l0 g4l0Var2 = (g4l0) p(str, bArr).k();
        n(str, g4l0Var2);
        o(str, (i4l0) g4l0Var2.i());
        i4l0 i4l0Var = (i4l0) g4l0Var2.i();
        ox0 ox0Var = this.h;
        ox0Var.put(str, i4l0Var);
        this.l.put(str, ((i4l0) g4l0Var2.b).B());
        this.m.put(str, str2);
        this.n.put(str, str3);
        this.d.put(str, q((i4l0) g4l0Var2.i()));
        iol0 iol0Var = this.b;
        lqk0 lqk0Var = iol0Var.c;
        iol0.U(lqk0Var);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((i4l0) g4l0Var2.b).x()));
        k8l0 k8l0Var = lqk0Var.a;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            t1l0 t1l0Var = (t1l0) ((u1l0) arrayList.get(i3)).k();
            ox0 ox0Var2 = ox0Var;
            if (((u1l0) t1l0Var.b).w() != 0) {
                int i4 = 0;
                while (i4 < ((u1l0) t1l0Var.b).w()) {
                    v1l0 v1l0Var = (v1l0) ((u1l0) t1l0Var.b).x(i4).k();
                    v1l0 v1l0Var2 = (v1l0) v1l0Var.clone();
                    iol0 iol0Var2 = iol0Var;
                    g4l0 g4l0Var3 = g4l0Var2;
                    String strB = ggl0.b(((w1l0) v1l0Var.b).s(), lbl0.a, lbl0.c);
                    if (strB != null) {
                        v1l0Var2.g();
                        ((w1l0) v1l0Var2.b).D(strB);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i5 = 0;
                    while (i5 < ((w1l0) v1l0Var.b).u()) {
                        z1l0 z1l0VarV = ((w1l0) v1l0Var.b).v(i5);
                        boolean z2 = z;
                        v1l0 v1l0Var3 = v1l0Var;
                        String strB2 = ggl0.b(z1l0VarV.x(), l29.b, l29.c);
                        if (strB2 != null) {
                            x1l0 x1l0Var = (x1l0) z1l0VarV.k();
                            x1l0Var.g();
                            ((z1l0) x1l0Var.b).z(strB2);
                            z1l0 z1l0Var = (z1l0) x1l0Var.i();
                            v1l0Var2.g();
                            ((w1l0) v1l0Var2.b).E(i5, z1l0Var);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i5++;
                        v1l0Var = v1l0Var3;
                    }
                    if (z) {
                        t1l0Var.g();
                        ((u1l0) t1l0Var.b).z(i4, (w1l0) v1l0Var2.i());
                        arrayList.set(i3, (u1l0) t1l0Var.i());
                    }
                    i4++;
                    iol0Var = iol0Var2;
                    g4l0Var2 = g4l0Var3;
                }
            }
            g4l0 g4l0Var4 = g4l0Var2;
            iol0 iol0Var3 = iol0Var;
            if (((u1l0) t1l0Var.b).t() != 0) {
                for (int i6 = 0; i6 < ((u1l0) t1l0Var.b).t(); i6++) {
                    g2l0 g2l0VarU = ((u1l0) t1l0Var.b).u(i6);
                    String strB3 = ggl0.b(g2l0VarU.s(), obl0.a, obl0.b);
                    if (strB3 != null) {
                        f2l0 f2l0Var = (f2l0) g2l0VarU.k();
                        f2l0Var.g();
                        ((g2l0) f2l0Var.b).z(strB3);
                        t1l0Var.g();
                        ((u1l0) t1l0Var.b).y(i6, (g2l0) f2l0Var.i());
                        arrayList.set(i3, (u1l0) t1l0Var.i());
                    }
                }
            }
            i3++;
            ox0Var = ox0Var2;
            iol0Var = iol0Var3;
            g4l0Var2 = g4l0Var4;
        }
        g4l0 g4l0Var5 = g4l0Var2;
        ox0 ox0Var3 = ox0Var;
        iol0 iol0Var4 = iol0Var;
        lqk0Var.h();
        lqk0Var.g();
        hm20.e(str);
        SQLiteDatabase sQLiteDatabaseV = lqk0Var.V();
        sQLiteDatabaseV.beginTransaction();
        try {
            lqk0Var.h();
            lqk0Var.g();
            hm20.e(str);
            SQLiteDatabase sQLiteDatabaseV2 = lqk0Var.V();
            sQLiteDatabaseV2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseV2.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i8 = i7 + 1;
                u1l0 u1l0Var = (u1l0) arrayList.get(i7);
                lqk0Var.h();
                lqk0Var.g();
                hm20.e(str);
                hm20.h(u1l0Var);
                if (u1l0Var.q()) {
                    int iR = u1l0Var.r();
                    Iterator it = u1l0Var.v().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = u1l0Var.s().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator it3 = u1l0Var.v().iterator();
                                    while (true) {
                                        boolean zHasNext = it3.hasNext();
                                        String str4 = QQWMbKFOuTf.NsMPUfujuIvHOqY;
                                        Iterator it4 = it3;
                                        String str5 = "filter_id";
                                        sQLiteDatabase = sQLiteDatabaseV;
                                        i = size;
                                        String str6 = PublisherMetadata.APP_ID;
                                        if (!zHasNext) {
                                            i2 = i8;
                                            Iterator it5 = u1l0Var.s().iterator();
                                            while (it5.hasNext()) {
                                                g2l0 g2l0Var = (g2l0) it5.next();
                                                lqk0Var.h();
                                                lqk0Var.g();
                                                hm20.e(str);
                                                hm20.h(g2l0Var);
                                                if (g2l0Var.s().isEmpty()) {
                                                    y4l0 y4l0Var = k8l0Var.f;
                                                    k8l0.m(y4l0Var);
                                                    y4l0Var.i.d(y4l0.k(str), "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", Integer.valueOf(iR), String.valueOf(g2l0Var.q() ? Integer.valueOf(g2l0Var.r()) : null));
                                                } else {
                                                    byte[] bArrE2 = g2l0Var.e();
                                                    Iterator it6 = it5;
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str6, str);
                                                    String str7 = str6;
                                                    contentValues.put("audience_id", Integer.valueOf(iR));
                                                    contentValues.put(str5, g2l0Var.q() ? Integer.valueOf(g2l0Var.r()) : null);
                                                    String str8 = str5;
                                                    contentValues.put("property_name", g2l0Var.s());
                                                    contentValues.put("session_scoped", g2l0Var.w() ? Boolean.valueOf(g2l0Var.x()) : null);
                                                    contentValues.put(str4, bArrE2);
                                                    try {
                                                        if (lqk0Var.V().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            y4l0 y4l0Var2 = k8l0Var.f;
                                                            k8l0.m(y4l0Var2);
                                                            y4l0Var2.f.b(y4l0.k(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            it5 = it6;
                                                            str6 = str7;
                                                            str5 = str8;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        y4l0 y4l0Var3 = k8l0Var.f;
                                                        k8l0.m(y4l0Var3);
                                                        y4l0Var3.f.c(y4l0.k(str), "Error storing property filter. appId", e);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            w1l0 w1l0Var = (w1l0) it4.next();
                                            lqk0Var.h();
                                            lqk0Var.g();
                                            hm20.e(str);
                                            hm20.h(w1l0Var);
                                            if (w1l0Var.s().isEmpty()) {
                                                y4l0 y4l0Var4 = k8l0Var.f;
                                                k8l0.m(y4l0Var4);
                                                y4l0Var4.i.d(y4l0.k(str), "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", Integer.valueOf(iR), String.valueOf(w1l0Var.q() ? Integer.valueOf(w1l0Var.r()) : null));
                                                i2 = i8;
                                            } else {
                                                u1l0 u1l0Var2 = u1l0Var;
                                                byte[] bArrE3 = w1l0Var.e();
                                                i2 = i8;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put(PublisherMetadata.APP_ID, str);
                                                contentValues2.put("audience_id", Integer.valueOf(iR));
                                                contentValues2.put("filter_id", w1l0Var.q() ? Integer.valueOf(w1l0Var.r()) : null);
                                                contentValues2.put("event_name", w1l0Var.s());
                                                contentValues2.put("session_scoped", w1l0Var.A() ? Boolean.valueOf(w1l0Var.B()) : null);
                                                contentValues2.put(str4, bArrE3);
                                                try {
                                                    if (lqk0Var.V().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        y4l0 y4l0Var5 = k8l0Var.f;
                                                        k8l0.m(y4l0Var5);
                                                        y4l0Var5.f.b(y4l0.k(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    it3 = it4;
                                                    sQLiteDatabaseV = sQLiteDatabase;
                                                    size = i;
                                                    u1l0Var = u1l0Var2;
                                                    i8 = i2;
                                                } catch (SQLiteException e2) {
                                                    y4l0 y4l0Var6 = k8l0Var.f;
                                                    k8l0.m(y4l0Var6);
                                                    y4l0Var6.f.c(y4l0.k(str), "Error storing event filter. appId", e2);
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        lqk0Var.h();
                                        lqk0Var.g();
                                        hm20.e(str);
                                        SQLiteDatabase sQLiteDatabaseV3 = lqk0Var.V();
                                        sQLiteDatabaseV3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iR)});
                                        sQLiteDatabaseV3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iR)});
                                        break;
                                    }
                                    sQLiteDatabaseV = sQLiteDatabase;
                                    size = i;
                                    i7 = i2;
                                    break;
                                }
                                if (!((g2l0) it2.next()).q()) {
                                    y4l0 y4l0Var7 = k8l0Var.f;
                                    k8l0.m(y4l0Var7);
                                    y4l0Var7.i.c(y4l0.k(str), "Property filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iR));
                                }
                            }
                        } else if (!((w1l0) it.next()).q()) {
                            y4l0 y4l0Var8 = k8l0Var.f;
                            k8l0.m(y4l0Var8);
                            y4l0Var8.i.c(y4l0.k(str), "Event filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iR));
                        }
                    }
                } else {
                    y4l0 y4l0Var9 = k8l0Var.f;
                    k8l0.m(y4l0Var9);
                    y4l0Var9.i.b(y4l0.k(str), "Audience with no ID. appId");
                }
                i7 = i8;
            }
            sQLiteDatabase = sQLiteDatabaseV;
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj = arrayList.get(i9);
                i9++;
                u1l0 u1l0Var3 = (u1l0) obj;
                arrayList2.add(u1l0Var3.q() ? Integer.valueOf(u1l0Var3.r()) : null);
            }
            hm20.e(str);
            lqk0Var.h();
            lqk0Var.g();
            SQLiteDatabase sQLiteDatabaseV4 = lqk0Var.V();
            try {
                long jQ = lqk0Var.Q("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, k8l0Var.d.o(str, v2l0.U)));
                if (jQ > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseV4.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i10);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i10++;
                    }
                }
            } catch (SQLiteException e3) {
                y4l0 y4l0Var10 = k8l0Var.f;
                k8l0.m(y4l0Var10);
                y4l0Var10.f.c(y4l0.k(str), "Database error querying filters. appId", e3);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                g4l0Var5.g();
                g4l0Var = g4l0Var5;
                try {
                    ((i4l0) g4l0Var.b).J();
                    bArrE = ((i4l0) g4l0Var.i()).e();
                } catch (RuntimeException e4) {
                    e = e4;
                    y4l0 y4l0Var11 = this.a.f;
                    k8l0.m(y4l0Var11);
                    y4l0Var11.i.c(y4l0.k(str), "Unable to serialize reduced-size config. Storing full config instead. appId", e);
                    bArrE = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                g4l0Var = g4l0Var5;
            }
            lqk0 lqk0Var2 = iol0Var4.c;
            iol0.U(lqk0Var2);
            k8l0 k8l0Var2 = lqk0Var2.a;
            hm20.e(str);
            lqk0Var2.g();
            lqk0Var2.h();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrE);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (lqk0Var2.V().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    y4l0 y4l0Var12 = k8l0Var2.f;
                    k8l0.m(y4l0Var12);
                    y4l0Var12.f.b(y4l0.k(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                y4l0 y4l0Var13 = k8l0Var2.f;
                k8l0.m(y4l0Var13);
                y4l0Var13.f.c(y4l0.k(str), "Error storing remote config. appId", e6);
            }
            g4l0Var.g();
            ((i4l0) g4l0Var.b).K();
            ox0Var3.put(str, (i4l0) g4l0Var.i());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseV;
        }
    }
}
