package defpackage;

import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class qbt implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qbt(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                LobbyV2ViewModel lobbyV2ViewModel = (LobbyV2ViewModel) obj;
                List<Integer> list = lobbyV2ViewModel.Z;
                list.getClass();
                return new LobbyV2ViewModel.b(new LobbyV2ViewModel.c(LobbyV2ViewModel.d.d, null, list, 2), lobbyV2ViewModel.a);
            default:
                final i120 i120Var = (i120) obj;
                sd80 sd80VarB = vd80.b("kotlinx.serialization.Polymorphic", f120.a.a, new pd80[0], new Function1() { // from class: h120
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        eq7 eq7Var = (eq7) obj2;
                        eq7Var.getClass();
                        hj5.b(k9e0.a);
                        eq7.a(eq7Var, "type", gae0.b);
                        StringBuilder sb = new StringBuilder("kotlinx.serialization.Polymorphic<");
                        i120 i120Var2 = i120Var;
                        sb.append(i120Var2.a.k());
                        sb.append('>');
                        eq7.a(eq7Var, "value", vd80.c(sb.toString(), yd80.a.a, new pd80[0]));
                        m2g m2gVar = i120Var2.b;
                        m2gVar.getClass();
                        eq7Var.b = m2gVar;
                        return Unit.a;
                    }
                });
                ygp<T> ygpVar = i120Var.a;
                ygpVar.getClass();
                return new q0b(sd80VarB, ygpVar);
        }
    }
}
