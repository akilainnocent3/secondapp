package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b08 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ d d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b08(int i, d dVar, String str, Function0 function0, boolean z) {
        this.e = str;
        this.b = z;
        this.c = function0;
        this.d = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                c08.a((WorldCupTeam) this.e, this.c, this.b, this.d, (a) obj, iA);
                break;
            default:
                String str = (String) this.e;
                ((Integer) obj2).getClass();
                egq.c(qj40.a(1), (a) obj, this.d, str, this.c, this.b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ b08(WorldCupTeam worldCupTeam, Function0 function0, boolean z, d dVar, int i) {
        this.e = worldCupTeam;
        this.c = function0;
        this.b = z;
        this.d = dVar;
    }
}
