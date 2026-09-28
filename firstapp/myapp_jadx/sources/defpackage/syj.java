package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class syj {
    public static ryj a(long j, long j2, long j3, ak5 ak5Var, ak5 ak5Var2, a aVar, int i) {
        ak5 ak5VarA;
        if ((i & 1) != 0) {
            j = c68.a(R.color.bg_primary_d_base, aVar);
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = c68.a(R.color.text_primary, aVar);
        }
        long j5 = j2;
        long jA = (i & 4) != 0 ? c68.a(R.color.text_primary, aVar) : j3;
        ak5 ak5VarA2 = (i & 8) != 0 ? qdf0.a(384, 3, 0L, aVar) : ak5Var;
        if ((i & 16) != 0) {
            alb0 alb0Var = qdf0.a;
            ak5VarA = qdf0.a(384, 2, c68.a(R.color.text_secondary, aVar), aVar);
        } else {
            ak5VarA = ak5Var2;
        }
        return new ryj(j4, jA, j5, ak5VarA2, ak5VarA);
    }
}
