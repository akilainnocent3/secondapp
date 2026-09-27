package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class cm {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1360 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1363;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private dp f1364;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private List<cq> f1365 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private dh f1366;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private az f1367;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private db f1368;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Context f1369;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private bd f1370;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1362 = {'n', 2941, 5708, 8509, 11270, 14313, 17130, 19894, 22665, 25496, 28543, 31313, 'E', 2898, 5753, 8470, 11324, 14281, 17132, 'D', 2901, 5739, 8469, 11314, 14272, 17133, 19840};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f1361 = -1433742800500225252L;

    public cm(Context context, dh dhVar, az azVar, db dbVar, bd bdVar) {
        this.f1366 = dhVar;
        this.f1367 = azVar;
        this.f1368 = dbVar;
        this.f1370 = bdVar;
        this.f1369 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized List<cq> m1545() {
        f1360 = (f1363 + 89) % 128;
        if (this.f1365 != null) {
            return new ArrayList(this.f1365);
        }
        ArrayList arrayList = new ArrayList();
        int i10 = f1360 + 57;
        f1363 = i10 % 128;
        if (i10 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m1546(cm cmVar) {
        int i10 = f1360 + 51;
        int i11 = i10 % 128;
        f1363 = i11;
        int i12 = i10 % 2;
        List<cq> list = cmVar.f1365;
        if (i12 != 0) {
            int i13 = 90 / 0;
        }
        int i14 = i11 + 61;
        f1360 = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 32 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private hs m1547(dn dnVar) {
        f1360 = (f1363 + 61) % 128;
        if (dnVar == null) {
            return null;
        }
        hs hsVar = new hs(dnVar, m1547(this.f1366.m1869().get(dnVar.m1975())));
        int i10 = f1360 + 5;
        f1363 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 84 / 0;
        }
        return hsVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized void m1552(dp dpVar) {
        try {
            int i10 = f1363;
            int i11 = i10 + 33;
            f1360 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (dpVar != null) {
                this.f1364 = dpVar;
            }
            int i12 = i10 + 5;
            f1360 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 66 / 0;
                return;
            }
            return;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public final synchronized boolean m1553() {
        boolean zMo766;
        try {
            int i10 = f1363 + 47;
            f1360 = i10 % 128;
            if (i10 % 2 == 0) {
                zMo766 = this.f1370.mo766();
                int i11 = 71 / 0;
            } else {
                zMo766 = this.f1370.mo766();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zMo766;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final Context m1554() {
        int i10 = (f1360 + 101) % 128;
        f1363 = i10;
        Context context = this.f1369;
        f1360 = (i10 + 25) % 128;
        return context;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public final az m1555() {
        int i10 = f1360;
        az azVar = this.f1367;
        int i11 = i10 + 3;
        f1363 = i11 % 128;
        if (i11 % 2 == 0) {
            return azVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final synchronized dp m1556() {
        dp dpVar;
        int i10 = f1360;
        dpVar = this.f1364;
        int i11 = i10 + 71;
        f1363 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        return dpVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m1557() {
        f1363 = (f1360 + 27) % 128;
        String strMo774 = this.f1370.mo774();
        int i10 = f1363 + 89;
        f1360 = i10 % 128;
        if (i10 % 2 != 0) {
            return strMo774;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m1558() {
        int i10 = f1360 + 125;
        f1363 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1370.m772();
        }
        int i11 = 14 / 0;
        return this.f1370.m772();
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final String m1559() {
        f1363 = (f1360 + 33) % 128;
        String strM1872 = this.f1366.m1872();
        f1360 = (f1363 + 101) % 128;
        return strM1872;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m1560() {
        f1363 = (f1360 + 113) % 128;
        String strM1873 = this.f1366.m1873();
        int i10 = f1360 + 15;
        f1363 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 57 / 0;
        }
        return strM1873;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m1561() {
        int i10 = f1363 + 103;
        f1360 = i10 % 128;
        if (i10 % 2 == 0) {
            TextUtils.isEmpty(m1558());
            throw null;
        }
        String strM1558 = m1558();
        if (TextUtils.isEmpty(strM1558) || m1551((ViewConfiguration.getScrollBarSize() >> 8) + 12, (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7).intern().equals(strM1558) || m1551((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, (char) Color.argb(0, 0, 0, 0), 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern().equals(strM1558)) {
            return null;
        }
        String strM1876 = this.f1366.m1876(m1558());
        f1363 = (f1360 + 97) % 128;
        return strM1876;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0099 A[PHI: r1
      0x0099: PHI (r1v15 com.ironsource.adqualitysdk.sdk.i.dn) = (r1v14 com.ironsource.adqualitysdk.sdk.i.dn), (r1v23 com.ironsource.adqualitysdk.sdk.i.dn) binds: [B:17:0x0097, B:13:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m1564() {
        dn dnVar;
        dp dpVarM1871 = this.f1366.m1871();
        if (dpVarM1871 != null) {
            m1550(dpVarM1871);
            if (this.f1370.mo765()) {
                f1360 = (f1363 + 53) % 128;
                jp.m2662(dpVarM1871);
            }
        }
        this.f1366.m1870().m2064(m1551(ExpandableListView.getPackedPositionType(0L), (char) ExpandableListView.getPackedPositionType(0L), 12 - Color.green(0)).intern(), this.f1370);
        Iterator<String> it = this.f1366.m1869().keySet().iterator();
        while (it.hasNext()) {
            int i10 = f1363 + 49;
            f1360 = i10 % 128;
            if (i10 % 2 == 0) {
                dnVar = this.f1366.m1869().get(it.next());
                int i11 = 13 / 0;
                if (!dnVar.m1973()) {
                    m1548(new cq(this, this.f1368, this.f1370, m1547(dnVar), this.f1366.m1870()));
                }
            } else {
                dnVar = this.f1366.m1869().get(it.next());
                if (!dnVar.m1973()) {
                    m1548(new cq(this, this.f1368, this.f1370, m1547(dnVar), this.f1366.m1870()));
                }
            }
            f1363 = (f1360 + 105) % 128;
        }
        m1549(this.f1366, this.f1370);
        int i12 = f1363 + 67;
        f1360 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m1566() {
        f1360 = (f1363 + 49) % 128;
        String strM1877 = this.f1366.m1877();
        f1360 = (f1363 + 55) % 128;
        return strM1877;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1551(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1362[i10 + i12]) ^ (((long) i12) * f1361)) ^ ((long) c10));
                        d.f1652 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m1562() {
        int i10 = f1363 + 115;
        f1360 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1365.iterator();
            throw null;
        }
        Iterator<cq> it = this.f1365.iterator();
        while (it.hasNext()) {
            int i11 = f1363 + 87;
            f1360 = i11 % 128;
            if (i11 % 2 == 0) {
                it.next().m1636();
                throw null;
            }
            it.next().m1636();
        }
        t.m2955(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cm.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo231() {
                cm.m1546(cm.this).clear();
            }
        });
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1563() {
        int i10 = f1360 + 111;
        f1363 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f1366.m1874();
            throw null;
        }
        String strM1874 = this.f1366.m1874();
        int i11 = f1363 + 57;
        f1360 = i11 % 128;
        if (i11 % 2 != 0) {
            return strM1874;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1548(cq cqVar) {
        f1360 = (f1363 + 91) % 128;
        this.f1365.add(cqVar);
        int i10 = f1363 + 15;
        f1360 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1567() {
        f1363 = (f1360 + 121) % 128;
        String strM1875 = this.f1366.m1875();
        f1360 = (f1363 + 119) % 128;
        return strM1875;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1550(dp dpVar) {
        f1360 = (f1363 + 41) % 128;
        m1552(dpVar);
        int i10 = f1363 + 103;
        f1360 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m1549(dh dhVar, bd bdVar) {
        if (bdVar.mo766()) {
            f1363 = (f1360 + 53) % 128;
            for (cq cqVar : m1545()) {
                f1363 = (f1360 + 111) % 128;
                dhVar.m1870().m2063().m2064(cqVar.m1643().m2293(), cqVar);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m1565(String str, List<Object> list) {
        f1360 = (f1363 + 23) % 128;
        Iterator<cq> it = m1545().iterator();
        while (it.hasNext()) {
            f1360 = (f1363 + 7) % 128;
            it.next().m1649(str, list);
        }
    }
}
