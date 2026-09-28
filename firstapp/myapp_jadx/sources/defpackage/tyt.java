package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public abstract class tyt {
    public final int a;
    public final String b;
    public final boolean c;

    public static final class a extends tyt {
        public static final a d = new a(R.string.page_loyalty__event_tab_name, AnalyticsEvent.BI_TRACKING_KIND_EVENT, false);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 567580522;
        }

        public final String toString() {
            return "CurrentEvent";
        }
    }

    public static final class b extends tyt {
        public final boolean d;

        public b(boolean z) {
            super(R.string.page_loyalty__benefit_tab_name, "benefit", z);
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.d == ((b) obj).d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d);
        }

        public final String toString() {
            return b6c.a("CurrentReward(hasNewDobReward=", ")", this.d);
        }
    }

    public static final class c extends tyt {
        public final boolean d;

        public c(boolean z) {
            super(R.string.page_loyalty__mission, "mission", z);
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.d == ((c) obj).d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d);
        }

        public final String toString() {
            return b6c.a("Mission(hasNewMission=", ")", this.d);
        }
    }

    public tyt(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }
}
