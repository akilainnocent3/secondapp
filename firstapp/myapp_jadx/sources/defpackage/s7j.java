package defpackage;

import android.os.Bundle;
import androidx.appcompat.widget.AppCompatTextView;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.header.snc.OdQr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment$onResultRotten$2", f = "FruitHuntFragment.kt", l = {1520}, m = "invokeSuspend", v = 1)
public final class s7j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u6j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7j(u6j u6jVar, v1b<? super s7j> v1bVar) {
        super(2, v1bVar);
        this.b = u6jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s7j(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s7j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(300L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(OdQr.TpbxMcZJBPGlmjU);
                return null;
            }
            uj50.b(obj);
        }
        final u6j u6jVar = this.b;
        djh djhVar = u6jVar.b;
        if (djhVar != null) {
            AppCompatTextView appCompatTextView = djhVar.w.C;
            appCompatTextView.setScaleX(0.0f);
            appCompatTextView.setScaleY(0.0f);
            appCompatTextView.setAlpha(0.75f);
            appCompatTextView.setVisibility(0);
            appCompatTextView.animate().scaleX(1.0f).setDuration(400L).setListener(null);
            appCompatTextView.animate().scaleY(1.0f).setDuration(400L).setListener(null);
        }
        r750.a(u6jVar.t0(), new Function0() { // from class: r7j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str;
                zj60 bridge;
                u6j u6jVar2 = u6jVar;
                u6jVar2.t0().y1();
                if (u6jVar2.f != null) {
                    int iIntValue = ((Number) u6jVar2.t0().L.getValue()).intValue();
                    double dDoubleValue = ((Number) u6jVar2.t0().I.a.getValue()).doubleValue();
                    Bundle bundle = new Bundle();
                    bundle.putString("chipvalue", String.valueOf(dDoubleValue));
                    if (iIntValue != -1) {
                        str = iIntValue != 1 ? "centre" : "right";
                    } else {
                        str = "left";
                    }
                    bundle.putString("aimPosition", str);
                    SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                    if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                        ((bk60) bridge).a("RottenHit", bundle);
                    }
                }
                return Unit.a;
            }
        });
        return Unit.a;
    }
}
