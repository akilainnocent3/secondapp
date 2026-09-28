package defpackage;

import android.util.Log;
import androidx.navigation.fragment.a;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rwi implements Function1 {
    public final /* synthetic */ a a;

    public /* synthetic */ rwi(a aVar) {
        this.a = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final ifx ifxVar = (ifx) obj;
        ifxVar.getClass();
        final a aVar = this.a;
        return new cbs() { // from class: swi
            @Override // defpackage.cbs
            public final void F0(ibs ibsVar, s9s.a aVar2) {
                s9s.a aVar3 = s9s.a.ON_RESUME;
                a aVar4 = aVar;
                ifx ifxVar2 = ifxVar;
                String str = ACKxwYRsuWyGz.mDeGidTWvUrDJ;
                if (aVar2 == aVar3 && ((List) aVar4.b().e.a.getValue()).contains(ifxVar2)) {
                    if (a.n()) {
                        Log.v("FragmentNavigator", str + ifxVar2 + " due to fragment " + ibsVar + " view lifecycle reaching RESUMED");
                    }
                    aVar4.b().b(ifxVar2);
                }
                if (aVar2 == s9s.a.ON_DESTROY) {
                    if (a.n()) {
                        Log.v("FragmentNavigator", str + ifxVar2 + " due to fragment " + ibsVar + " view lifecycle reaching DESTROYED");
                    }
                    aVar4.b().b(ifxVar2);
                }
            }
        };
    }
}
