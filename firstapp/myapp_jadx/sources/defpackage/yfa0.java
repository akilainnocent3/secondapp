package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.android.social.domain.entity.SocialMineType;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yfa0 {
    public final String a;
    public final SocialMineType b;
    public final rfa0 c;
    public final uf00<qfa0> d;

    public yfa0(String str, SocialMineType socialMineType, rfa0 rfa0Var) {
        int i;
        uag uagVar = rfa0.d;
        ArrayList arrayList = new ArrayList(l48.r(uagVar, 10));
        q3.b bVar = new q3.b();
        while (bVar.hasNext()) {
            rfa0 rfa0Var2 = (rfa0) bVar.next();
            int iOrdinal = rfa0Var2.ordinal();
            if (iOrdinal == 0) {
                i = R.string.personal_page__followers;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    throw null;
                }
                i = R.string.personal_page__following;
            }
            arrayList.add(new qfa0(rfa0Var2, i));
        }
        this(str, socialMineType, rfa0Var, a4h.f(arrayList));
    }

    public static yfa0 a(yfa0 yfa0Var, SocialMineType socialMineType, rfa0 rfa0Var, int i) {
        String str = yfa0Var.a;
        if ((i & 2) != 0) {
            socialMineType = yfa0Var.b;
        }
        if ((i & 4) != 0) {
            rfa0Var = yfa0Var.c;
        }
        uf00<qfa0> uf00Var = yfa0Var.d;
        yfa0Var.getClass();
        str.getClass();
        socialMineType.getClass();
        rfa0Var.getClass();
        uf00Var.getClass();
        return new yfa0(str, socialMineType, rfa0Var, uf00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfa0)) {
            return false;
        }
        yfa0 yfa0Var = (yfa0) obj;
        return Intrinsics.g(this.a, yfa0Var.a) && this.b == yfa0Var.b && this.c == yfa0Var.c && Intrinsics.g(this.d, yfa0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SocialNetworkViewState(username=" + this.a + ", mineType=" + this.b + ", selectedTab=" + this.c + ", tabList=" + this.d + ")";
    }

    public yfa0(String str, SocialMineType socialMineType, rfa0 rfa0Var, uf00<qfa0> uf00Var) {
        str.getClass();
        socialMineType.getClass();
        rfa0Var.getClass();
        uf00Var.getClass();
        this.a = str;
        this.b = socialMineType;
        this.c = rfa0Var;
        this.d = uf00Var;
    }
}
