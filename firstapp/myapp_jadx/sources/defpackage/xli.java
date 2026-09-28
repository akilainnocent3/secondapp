package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xli implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xli(d dVar, String str, imf0 imf0Var, hfs hfsVar, ix80 ix80Var, int i) {
        this.b = dVar;
        this.c = str;
        this.d = imf0Var;
        this.e = hfsVar;
        this.f = ix80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(3073);
                mmi.g(this.b, (String) obj6, (imf0) obj5, (hfs) obj4, (ix80) obj3, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = qj40.a(1);
                lv90.a((Event) obj6, (Market) obj5, (Set) obj4, (iaj) obj3, this.b, (a) obj, iA2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xli(Event event, Market market, Set set, iaj iajVar, d dVar, int i) {
        this.c = event;
        this.d = market;
        this.e = set;
        this.f = iajVar;
        this.b = dVar;
    }
}
