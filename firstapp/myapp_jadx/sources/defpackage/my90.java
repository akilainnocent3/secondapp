package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class my90 implements a75 {
    public final List<String> a;
    public final String b;
    public final double c;

    public my90(String str) {
        List<String> list = Collections.EMPTY_LIST;
        this.a = (list == null || list.isEmpty()) ? Collections.singletonList("default") : list;
        this.b = str;
        this.c = 0.1d;
    }

    @Override // defpackage.a75
    public final p65 a(kb0 kb0Var) {
        double d;
        double d2;
        double d3;
        double d4;
        tx90 tx90Var = kb0Var.a;
        zi0 zi0Var = kb0Var.c;
        mx90 mx90Var = kb0Var.b;
        ly90 ly90Var = mx90Var.j;
        ly90 ly90Var2 = new ly90("custom-skin");
        Iterator<String> it = this.a.iterator();
        while (it.hasNext()) {
            ly90 ly90VarF = tx90Var.f(it.next());
            if (ly90VarF != null) {
                mw0.b<mh4> it2 = ly90VarF.c.iterator();
                while (it2.hasNext()) {
                    mh4 next = it2.next();
                    mw0<mh4> mw0Var = ly90Var2.c;
                    if (!mw0Var.contains(next)) {
                        mw0Var.a(next);
                    }
                }
                mw0.b<gwa> it3 = ly90VarF.d.iterator();
                while (it3.hasNext()) {
                    gwa next2 = it3.next();
                    mw0<gwa> mw0Var2 = ly90Var2.d;
                    if (!mw0Var2.contains(next2)) {
                        mw0Var2.a(next2);
                    }
                }
                mw0.b<ly90.a> it4 = ly90VarF.b.w.iterator();
                while (it4.hasNext()) {
                    ly90.a next3 = it4.next();
                    ly90Var2.b(next3.a, next3.b, next3.c);
                }
            }
        }
        mx90Var.b(ly90Var2);
        mx90Var.e();
        String str = this.b;
        lh0 lh0VarA = str != null ? tx90Var.a(str) : null;
        if (lh0VarA == null) {
            p65 p65Var = new p65(mx90Var);
            double d5 = p65Var.c;
            double d6 = p65Var.a;
            d2 = d5 + d6;
            double d7 = p65Var.d;
            double d8 = p65Var.b;
            d4 = d7 + d8;
            d3 = d6;
            d = d8;
        } else {
            int i = 0;
            zi0Var.l(0, lh0VarA, false);
            double d9 = lh0VarA.d;
            double d10 = this.c;
            int iMax = (int) Math.max(d9 / d10, 1.0d);
            double dMax = Double.NEGATIVE_INFINITY;
            double dMin = Double.POSITIVE_INFINITY;
            double dMax2 = Double.NEGATIVE_INFINITY;
            double dMin2 = Double.POSITIVE_INFINITY;
            while (i < iMax) {
                kb0Var.b(i > 0 ? (float) d10 : 0.0f);
                p65 p65Var2 = new p65(mx90Var);
                dMin = Math.min(dMin, p65Var2.a);
                dMin2 = Math.min(dMin2, p65Var2.b);
                dMax = Math.max(dMax, p65Var2.c + dMin);
                dMax2 = Math.max(dMax2, p65Var2.d + dMin2);
                i++;
                d10 = d10;
            }
            d = dMin2;
            d2 = dMax;
            d3 = dMin;
            d4 = dMax2;
        }
        mx90Var.c("default");
        zi0Var.h();
        if (ly90Var != null) {
            mx90Var.b(ly90Var);
        }
        mx90Var.e();
        kb0Var.b(0.0f);
        return new p65(d3, d, d2 - d3, d4 - d);
    }
}
