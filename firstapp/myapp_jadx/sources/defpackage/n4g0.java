package defpackage;

import com.sportygames.campaign.presentation.TournamentBannerConfig;
import com.sportygames.campaign.presentation.TournamentUserPlayInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface n4g0 {

    public static final class a implements n4g0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1500564080;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    public static final class b implements n4g0 {
        public final List<TournamentBannerConfig> a;
        public final List<TournamentUserPlayInfo> b;
        public final boolean c;

        public b(List<TournamentBannerConfig> list, List<TournamentUserPlayInfo> list2, boolean z) {
            list.getClass();
            this.a = list;
            this.b = list2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            List<TournamentUserPlayInfo> list = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VisibleWithData(userTournamentList=");
            sb.append(this.a);
            sb.append(", userPlayInfo=");
            sb.append(this.b);
            sb.append(", logBannerDisplayedForFirstCall=");
            return ruw.a(sb, this.c, ')');
        }
    }
}
