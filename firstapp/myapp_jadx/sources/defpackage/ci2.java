package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ci2 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ci2(ei2 ei2Var, Function0 function0, int i) {
        this.b = ei2Var;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                di2.a((ei2) obj4, (Function0) obj3, (a) obj, qj40.a(9));
                return Unit.a;
            default:
                return SportyGamesManager.lambda$getUserSegmentOnce$1((lyh) obj4, (SportyGamesManager.b) obj3, (v5b) obj, (v1b) obj2);
        }
    }

    public /* synthetic */ ci2(lyh lyhVar, SportyGamesManager.b bVar) {
        this.b = lyhVar;
        this.c = bVar;
    }
}
