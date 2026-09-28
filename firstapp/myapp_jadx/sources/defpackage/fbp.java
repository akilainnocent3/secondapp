package defpackage;

import com.sporty.android.core.model.orders.JokerInfo;
import com.sportybet.plugin.realsports.data.RSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lfbp;", "Lj8i0;", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fbp extends j8i0 {
    public final kbp a;
    public final String b;
    public final wwd0 c;
    public final v340 d;

    /* JADX INFO: loaded from: classes4.dex */
    public interface a {
        fbp a(String str);
    }

    @c0d(c = "com.sportybet.android.joker.presentation.reveal.JokerSelectionsViewModel$uiState$1", f = "JokerSelectionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super vap>, v1b<? super Unit>, Object> {
        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fbp.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super vap> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            fbp fbpVar = fbp.this;
            ej5.c(o8i0.d(fbpVar), null, null, new gbp(fbpVar, null), 3);
            return Unit.a;
        }
    }

    public fbp(kbp kbpVar, String str) {
        str.getClass();
        this.a = kbpVar;
        this.b = str;
        vap.b bVar = vap.b.a;
        wwd0 wwd0VarA = xwd0.a(bVar);
        this.c = wwd0VarA;
        this.d = e1i.e(new xzh(wwd0VarA, new b(null)), o8i0.d(this), q490.a.b, bVar);
    }

    public static ArrayList x1(List list) {
        String actualOutcomeOdds;
        Double dH;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            RSelection rSelection = (RSelection) obj;
            JokerInfo jokerInfo = rSelection.joker;
            if (jokerInfo != null && (actualOutcomeOdds = jokerInfo.getActualOutcomeOdds()) != null && (dH = kotlin.text.b.h(actualOutcomeOdds)) != null) {
                double dDoubleValue = dH.doubleValue();
                String str = rSelection.odds;
                str.getClass();
                Double dH2 = kotlin.text.b.h(str);
                if (dH2 != null && dH2.doubleValue() < dDoubleValue) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList y1(List list) {
        String actualOutcomeOdds;
        Double dH;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            RSelection rSelection = (RSelection) obj;
            JokerInfo jokerInfo = rSelection.joker;
            if (jokerInfo != null && (actualOutcomeOdds = jokerInfo.getActualOutcomeOdds()) != null && (dH = kotlin.text.b.h(actualOutcomeOdds)) != null) {
                double dDoubleValue = dH.doubleValue();
                String str = rSelection.odds;
                str.getClass();
                Double dH2 = kotlin.text.b.h(str);
                if (dH2 != null && dH2.doubleValue() >= dDoubleValue) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
