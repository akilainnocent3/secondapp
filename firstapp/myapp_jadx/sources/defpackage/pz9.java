package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class pz9 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i5i0.a(cb40.a(R.string.dedicated_team_pages__video_settings_playback_speed, new Object[0], aVar), Integer.valueOf(R.drawable.ic_video_settings_playback_speed), false, aVar, 0, 4);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                return (ytm) qn4.a((qn70) obj, (wrz) obj2, wkj.class, null, null);
        }
    }
}
