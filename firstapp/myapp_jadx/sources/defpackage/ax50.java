package defpackage;

import com.sportygames.roulette.activities.RouletteActivity;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class ax50 implements lfy<Long> {
    public final /* synthetic */ RouletteActivity a;

    public ax50(RouletteActivity rouletteActivity) {
        this.a = rouletteActivity;
    }

    @Override // defpackage.lfy
    public final void u1(Long l) {
        RouletteActivity rouletteActivity = this.a;
        HashSet hashSet = rouletteActivity.x0;
        if (hashSet.remove(l) && hashSet.isEmpty()) {
            rouletteActivity.D1();
        }
    }
}
