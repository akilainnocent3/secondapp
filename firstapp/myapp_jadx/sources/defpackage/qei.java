package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public interface qei {

    public static final class a implements qei {
        public static final a a = new a();

        @Override // defpackage.qei
        public final ResourceUiText a() {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.bet_history__lost);
        }

        @Override // defpackage.qei
        public final int b() {
            return R.drawable.ic__feature__match_status_lost;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -252691867;
        }

        public final String toString() {
            return "Miss";
        }
    }

    ResourceUiText a();

    int b();
}
