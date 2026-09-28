package defpackage;

import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rah implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rah(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ssw<LoadingState<List<GameDetails>>> sswVar;
        String str;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bbh bbhVar = (bbh) obj2;
                znz<GameDetails> znzVar = (znz) obj;
                int i2 = 0;
                bbhVar.B[0] = 0;
                bbhVar.C[0] = 0;
                jah jahVar = bbhVar.c;
                if (jahVar != null) {
                    jahVar.j(znzVar);
                }
                jct jctVar = (jct) bbhVar.a;
                if (jctVar != null && (sswVar = jctVar.d) != null) {
                    sswVar.f(bbhVar.getViewLifecycleOwner(), new bbh.f(new sah(bbhVar, i2)));
                }
                break;
            default:
                w540 w540Var = (w540) obj2;
                int iIntValue = ((Integer) obj).intValue();
                w540.j(w540Var, iIntValue);
                t640 t640VarJ = w540.j(w540Var, iIntValue);
                if (t640VarJ != null && (str = t640VarJ.a) != null) {
                    w540Var.A.invoke(str);
                }
                break;
        }
        return Unit.a;
    }
}
