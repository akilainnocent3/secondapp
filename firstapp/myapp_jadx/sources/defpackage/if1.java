package defpackage;

import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class if1 {
    public final long a;
    public final long b;
    public final long c;

    public if1(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long j4 = omf0.c;
        if (omf0.a(j, j4)) {
            hb5.a("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
            throw null;
        }
        if (omf0.a(j2, j4)) {
            hb5.a("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
            throw null;
        }
        if (omf0.a(j3, j4)) {
            hb5.a("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
            throw null;
        }
        if (pmf0.a(omf0.b(j), omf0.b(j2))) {
            d2l.b(j, j2);
            if (Float.compare(omf0.c(j), omf0.c(j2)) > 0) {
                this.a = j2;
                j = j2;
            }
        }
        if (pmf0.a(omf0.b(j3), 4294967296L)) {
            long jG = d2l.g(1.0E-4f, 4294967296L);
            d2l.b(j3, jG);
            if (Float.compare(omf0.c(j3), omf0.c(jG)) < 0) {
                hb5.a("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                throw null;
            }
        }
        if (omf0.c(j) < 0.0f) {
            hb5.a("AutoSize.StepBased: minFontSize must not be negative");
            throw null;
        }
        if (omf0.c(j2) >= 0.0f) {
            return;
        }
        hb5.a("AutoSize.StepBased: maxFontSize must not be negative");
        throw null;
    }

    public static boolean a(ukf0 ukf0Var) {
        int i = ukf0Var.a.f;
        if (i == 1 || i == 3) {
            return ukf0Var.e() || ukf0Var.d();
        }
        if (i != 4 && i != 5 && i != 2) {
            d9h0.a(yn70.d(ukf0Var.a.f), "TextOverflow type ", " is not supported.");
            return false;
        }
        zjw zjwVar = ukf0Var.b;
        int i2 = zjwVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                zjwVar.l(0);
                ArrayList arrayList = zjwVar.h;
                Layout layout = ((jrz) arrayList.get(kf9.c(0, arrayList))).a.d.f;
                idf0 idf0Var = wkf0.a;
                if (layout.getEllipsisCount(0) > 0) {
                    return true;
                }
            } else {
                if (i == 4 || i == 5) {
                    return ukf0Var.e() || ukf0Var.d();
                }
                if (i == 2) {
                    int i3 = i2 - 1;
                    zjwVar.l(i3);
                    ArrayList arrayList2 = zjwVar.h;
                    Layout layout2 = ((jrz) arrayList2.get(kf9.c(i3, arrayList2))).a.d.f;
                    idf0 idf0Var2 = wkf0.a;
                    return layout2.getEllipsisCount(i3) > 0;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof if1)) {
            return false;
        }
        if1 if1Var = (if1) obj;
        return omf0.a(if1Var.a, this.a) && omf0.a(if1Var.b, this.b) && omf0.a(if1Var.c, this.c);
    }

    public final int hashCode() {
        pmf0[] pmf0VarArr = omf0.b;
        return Long.hashCode(this.c) + f87.a(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
