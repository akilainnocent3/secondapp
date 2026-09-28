package com.sportygames.newcms;

import defpackage.co5;
import defpackage.n1a0;
import defpackage.qcn;
import defpackage.scn;
import defpackage.spa0;
import defpackage.wf00;
import defpackage.xf00;
import defpackage.zi50;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public final scn<CMSRes.Id, String> a;
    public final qcn<co5> b;

    public b(wf00 wf00Var, qcn qcnVar) {
        wf00Var.getClass();
        qcnVar.getClass();
        this.a = wf00Var;
        this.b = qcnVar;
    }

    public final String a(CMSRes cMSRes, String... strArr) {
        Object bVar;
        cMSRes.getClass();
        String strB = b(cMSRes, "");
        if (strArr.length == 0) {
            return strB;
        }
        try {
            zi50.a aVar = zi50.b;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            bVar = String.format(strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        String str = (String) bVar;
        return str == null ? "" : str;
    }

    public final String b(CMSRes cMSRes, String str) {
        cMSRes.getClass();
        str.getClass();
        String strE = c.e(this, cMSRes, new String[0]);
        return strE == null ? str : strE;
    }

    public final void c(CMSRes cMSRes) {
        co5 next;
        Integer num;
        cMSRes.getClass();
        Iterator<co5> it = this.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof spa0));
        co5 co5Var = next;
        if (co5Var != null) {
            spa0 spa0Var = co5Var instanceof spa0 ? (spa0) co5Var : null;
            if (spa0Var == null) {
                return;
            }
            String strB = b(cMSRes, "");
            String str = StringsKt.U(strB) ? null : strB;
            if (str == null || (num = spa0Var.a.get(str)) == null) {
                return;
            }
            spa0Var.b.play(num.intValue(), 0.99f, 0.99f, 1, 0, 1.0f);
        }
    }

    public final void d() {
        Iterator<co5> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CMSResource(cmsMap=" + this.a + ", mediaList=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i) {
        xf00 xf00Var = xf00.i;
        xf00Var.getClass();
        this(xf00Var, n1a0.c);
    }

    public b() {
        this(0);
    }
}
