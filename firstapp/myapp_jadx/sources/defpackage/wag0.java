package defpackage;

import androidx.compose.runtime.j;
import androidx.compose.runtime.m;
import com.sportybet.android.gp.tz.R;
import com.sportygames.campaign.data.model.TournamentConfigVO;
import com.sportygames.campaign.data.model.TournamentHistoryResponse;
import com.sportygames.campaign.data.model.TournamentRankListResponse;
import com.sportygames.campaign.data.model.UserPlayInfo;
import com.sportygames.campaign.presentation.TournamentBannerConfig;
import com.sportygames.campaign.presentation.TournamentEligibilityCriteria;
import com.sportygames.campaign.presentation.TournamentUserPlayInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class wag0 {
    public static final ssw<List<TournamentConfigVO>> a = new ssw<>();
    public static final ssw<Pair<Long, String>> b = new ssw<>();
    public static final ssw<List<UserPlayInfo>> c = new ssw<>();
    public static final ssw<TournamentHistoryResponse> d = new ssw<>();
    public static final ssw<HashMap<Long, String>> e = new ssw<>();
    public static final ytw<HashMap<Long, String>> f = m.b(new HashMap());
    public static final ytw<HashMap<Long, TournamentRankListResponse>> g = m.b(new HashMap());
    public static final ytw<Boolean> h;
    public static final ytw<Boolean> i;
    public static final isw j;
    public static final ytw<Integer> k;
    public static final ytw<Boolean> l;
    public static final ytw<a> m;
    public static final ytw<b> n;

    static {
        Boolean bool = Boolean.FALSE;
        h = m.b(bool);
        i = m.b(bool);
        j = j.a(0.0f);
        k = m.b(Integer.valueOf(R.dimen._42ssp));
        l = m.b(bool);
        m = m.b(new a(null, null));
        n = m.b(new b(0));
    }

    public static ArrayList a(double d2, boolean z) {
        Long id;
        TournamentEligibilityCriteria tournamentEligibilityCriteria;
        String lowerCase;
        b bVar = (b) ((x5a0) n).getValue();
        List<TournamentBannerConfig> list = bVar.a;
        Iterable iterable = bVar.b;
        list.getClass();
        if (d2 != 0.0d && !z) {
            if (iterable == null) {
                iterable = m2g.a;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Long tournamentId = ((TournamentUserPlayInfo) it.next()).getTournamentId();
                if (tournamentId != null) {
                    arrayList.add(tournamentId);
                }
            }
            Set setE0 = CollectionsKt.E0(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (TournamentBannerConfig tournamentBannerConfig : list) {
                List<TournamentEligibilityCriteria> eligibilityCriteria = tournamentBannerConfig.getEligibilityCriteria();
                if (eligibilityCriteria != null && !eligibilityCriteria.isEmpty() && (id = tournamentBannerConfig.getId()) != null) {
                    long jLongValue = id.longValue();
                    if (jLongValue != 0 && tournamentBannerConfig.getStatus() != null && (tournamentEligibilityCriteria = (TournamentEligibilityCriteria) CollectionsKt.firstOrNull(tournamentBannerConfig.getEligibilityCriteria())) != null) {
                        boolean zContains = setE0.contains(id);
                        if (Intrinsics.g(tournamentEligibilityCriteria.getPointsCriteriaField(), "CASHOUT_COEFFICIENT")) {
                            Double minimumThreshold = tournamentEligibilityCriteria.getMinimumThreshold();
                            if (d2 >= (minimumThreshold != null ? minimumThreshold.doubleValue() : 1.0d) && zContains) {
                                String status = tournamentBannerConfig.getStatus();
                                if (status != null) {
                                    lowerCase = status.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                } else {
                                    lowerCase = null;
                                }
                                if (Intrinsics.g(lowerCase, "active")) {
                                    String startTime = tournamentBannerConfig.getStartTime();
                                    if (startTime == null) {
                                        startTime = "";
                                    }
                                    if (t69.a(startTime)) {
                                        arrayList2.add(String.valueOf(jLongValue));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        }
        return null;
    }

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultiplierUiState(currentMultiplier=");
            sb.append(this.a);
            sb.append(", messageType=");
            return j26.a(sb, this.b, ')');
        }

        public a() {
            this(null, null);
        }
    }

    public static final class b {
        public final List<TournamentBannerConfig> a;
        public final List<TournamentUserPlayInfo> b;

        public b(List<TournamentBannerConfig> list, List<TournamentUserPlayInfo> list2) {
            list.getClass();
            this.a = list;
            this.b = list2;
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
            int iHashCode = this.a.hashCode() * 31;
            List<TournamentUserPlayInfo> list = this.b;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TournamentSnapshot(tournaments=");
            sb.append(this.a);
            sb.append(", userPlayInfo=");
            return o8i.a(sb, this.b, ')');
        }

        public b() {
            this(0);
        }

        public b(int i) {
            this(m2g.a, null);
        }
    }
}
