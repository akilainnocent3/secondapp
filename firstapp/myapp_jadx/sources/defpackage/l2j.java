package defpackage;

import com.sportygames.roulette.activities.RouletteActivity;
import com.sportygames.roulette.widget.TableGrid;
import java.security.SecureRandom;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l2j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l2j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                n2j n2jVar = (n2j) obj;
                djh djhVar = n2jVar.b;
                if (djhVar != null) {
                    djhVar.f.c.setAlpha(1.0f);
                }
                djh djhVar2 = n2jVar.b;
                if (djhVar2 != null) {
                    djhVar2.f.d.setVisibility(8);
                }
                djh djhVar3 = n2jVar.b;
                if (djhVar3 != null) {
                    djhVar3.f.f.setVisibility(8);
                }
                djh djhVar4 = n2jVar.b;
                if (djhVar4 != null) {
                    djhVar4.f.i.setVisibility(8);
                }
                djh djhVar5 = n2jVar.b;
                if (djhVar5 != null) {
                    djhVar5.f.e.setVisibility(0);
                }
                djh djhVar6 = n2jVar.b;
                if (djhVar6 != null) {
                    djhVar6.f.b.setVisibility(0);
                }
                return Unit.a;
            default:
                RouletteActivity rouletteActivity = (RouletteActivity) obj;
                int[] iArr = RouletteActivity.A0;
                SecureRandom secureRandomA = n380.a();
                TableGrid[] tableGridArr = rouletteActivity.c;
                TableGrid tableGrid = tableGridArr[secureRandomA.nextInt(tableGridArr.length)];
                int i2 = rouletteActivity.F;
                tableGrid.a(i2, rouletteActivity.B.get(i2).longValue(), true);
                rouletteActivity.I = rouletteActivity.B.get(rouletteActivity.F).longValue() + rouletteActivity.I;
                rouletteActivity.K1();
                return null;
        }
    }
}
