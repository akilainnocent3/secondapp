package defpackage;

import android.util.AttributeSet;
import androidx.compose.runtime.m;
import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.sportssoccer.expandview.TimeFilterPopupView;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class pmh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pmh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        AttributeSet attributeSet = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                final ymh ymhVar = (ymh) obj;
                int i2 = 0;
                TimeFilterPopupView timeFilterPopupView = new TimeFilterPopupView(ymhVar.a, attributeSet, 6, i2);
                timeFilterPopupView.setDismissListener(new mmh(ymhVar, i2));
                timeFilterPopupView.c(ymhVar.k);
                timeFilterPopupView.setOnCustomTimeRangeChanged(new Function1() { // from class: nmh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        xvf0 xvf0Var = (xvf0) obj2;
                        xvf0Var.getClass();
                        PreMatchSportActivity.b bVar = ymhVar.b;
                        if (bVar != null) {
                            PreMatchSportActivity preMatchSportActivity = bVar.a;
                            LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                            preMatchSportActivity.I1().A1(xvf0Var, true);
                        }
                        return Unit.a;
                    }
                });
                timeFilterPopupView.setOnSelectListener(new omh(ymhVar, i2));
                return timeFilterPopupView;
            case 1:
                return m.b((k130) obj);
            case 2:
                ((nn40) obj).v0(null);
                return Unit.a;
            default:
                ((Function1) obj).invoke(b.a.g.a);
                return Unit.a;
        }
    }
}
