package defpackage;

import com.sporty.android.core.model.ads.RealSportsAdSpots;
import com.sportybet.plugin.realsports.data.PopularAndSportData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class fq1 {
    public final List<RealSportsAdSpots> a;
    public final ArrayList b;
    public final PopularAndSportData c;

    public fq1(List list, ArrayList arrayList, PopularAndSportData popularAndSportData) {
        popularAndSportData.getClass();
        this.a = list;
        this.b = arrayList;
        this.c = popularAndSportData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq1)) {
            return false;
        }
        fq1 fq1Var = (fq1) obj;
        return Intrinsics.g(this.a, fq1Var.a) && this.b.equals(fq1Var.b) && Intrinsics.g(this.c, fq1Var.c);
    }

    public final int hashCode() {
        List<RealSportsAdSpots> list = this.a;
        return this.c.hashCode() + vt5.a(this.b, (list == null ? 0 : list.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "AzMenuData(ads=" + this.a + ", liveSports=" + this.b + ", popularAndSportData=" + this.c + ")";
    }
}
