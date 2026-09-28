package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class tr8 {
    public static final op8 a = new op8(-1347499266, a.a, false);

    public static final class a implements iaj<m75, j58, androidx.compose.runtime.a, Integer, Unit> {
        public static final a a = new a();

        @Override // defpackage.iaj
        public final Unit d(m75 m75Var, j58 j58Var, androidx.compose.runtime.a aVar, Integer num) {
            long j = j58Var.a;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            m75Var.getClass();
            if (aVar2.q(iIntValue & 1, (iIntValue & 129) != 128)) {
                h9n.a(erz.a(R.drawable.wd_close_icon, 0, aVar2), AnalyticsParam.STORY_SKIP_REASON_CLOSE, j.r(d.a.b, 11.33f), null, null, 0.0f, new gf4(j58.f, 5), aVar2, 1573296, 56);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }
}
