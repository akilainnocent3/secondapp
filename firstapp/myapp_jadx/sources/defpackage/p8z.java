package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p8z implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ p8z(SportyGamesManager.b bVar) {
        this.b = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                r8z.a((String) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                return SportyGamesManager.lambda$getUserSegmentOnce$0((SportyGamesManager.b) obj3, obj, (v1b) obj2);
        }
    }
}
