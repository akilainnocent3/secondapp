package defpackage;

import android.content.Intent;
import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hl20 implements jpy {
    public final /* synthetic */ PreMatchSportActivity a;

    @Override // defpackage.jpy
    public final void a(String str, String str2) {
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        str.getClass();
        str2.getClass();
        PreMatchSportActivity preMatchSportActivity = this.a;
        String str3 = preMatchSportActivity.I1().e;
        str3.getClass();
        Intent intent = new Intent(preMatchSportActivity, (Class<?>) OutrightsActivity.class);
        intent.putExtra("EXTRA_EVENT_ID", str);
        intent.putExtra("key_sport_id", str3);
        preMatchSportActivity.startActivity(intent);
    }
}
