package defpackage;

import com.sportybet.android.multimaker.data.dto.MultiMakerLeagueOptionDto;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class shw {
    public final String a;
    public final List<RegularMarketRule> b;
    public final List<String> c;
    public final List<MultiMakerLeagueOptionDto> d;
    public final List<String> e;
    public final xvf0 f;

    /* JADX WARN: Multi-variable type inference failed */
    public shw(String str, List<? extends RegularMarketRule> list, List<String> list2, List<MultiMakerLeagueOptionDto> list3, List<String> list4, xvf0 xvf0Var) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = xvf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof shw) {
            shw shwVar = (shw) obj;
            return this.a.equals(shwVar.a) && Intrinsics.g(this.b, shwVar.b) && Intrinsics.g(this.c, shwVar.c) && Intrinsics.g(this.d, shwVar.d) && Intrinsics.g(this.e, shwVar.e) && this.f == shwVar.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ai50.a(ai50.a(ai50.a(ai50.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiMakerSettings(sportId=");
        sb.append(this.a);
        sb.append(", markets=");
        sb.append(this.b);
        sb.append(", marketIds=");
        qpu.a(", leagues=", ", leagueIds=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", timeRange=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
