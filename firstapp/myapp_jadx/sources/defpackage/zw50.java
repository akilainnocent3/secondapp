package defpackage;

import com.sportygames.roulette.activities.RouletteActivity;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class zw50 implements lfy<Set<Long>> {
    public final /* synthetic */ RouletteActivity a;

    public zw50(RouletteActivity rouletteActivity) {
        this.a = rouletteActivity;
    }

    @Override // defpackage.lfy
    public final void u1(Set<Long> set) {
        this.a.x0.addAll(set);
    }
}
