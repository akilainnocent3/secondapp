package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class qz9 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i5i0.a(cb40.a(R.string.dedicated_team_pages__video_settings_playback_speed, new Object[0], aVar), null, false, aVar, 0, 6);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new shn((lzm) qn70Var.a(jq40.a(lzm.class), null, null), (msm) qn70Var.a(jq40.a(msm.class), null, null), (itm) qn70Var.a(jq40.a(itm.class), null, null), (wqm) qn70Var.a(jq40.a(wqm.class), null, null), (zsm) qn70Var.a(jq40.a(zsm.class), null, null), (kum) qn70Var.a(jq40.a(kum.class), null, null));
        }
    }
}
