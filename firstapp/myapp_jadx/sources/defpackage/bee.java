package defpackage;

import android.view.View;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bee implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bee(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                break;
            default:
                final u6j u6jVar = (u6j) obj;
                ibs viewLifecycleOwner = u6jVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                ebs.a(viewLifecycleOwner.getLifecycle()).b(new r2j(u6jVar, null));
                ibs viewLifecycleOwner2 = u6jVar.getViewLifecycleOwner();
                viewLifecycleOwner2.getClass();
                ebs.a(viewLifecycleOwner2.getLifecycle()).b(new s2j(u6jVar, null));
                ibs viewLifecycleOwner3 = u6jVar.getViewLifecycleOwner();
                viewLifecycleOwner3.getClass();
                ebs.a(viewLifecycleOwner3.getLifecycle()).b(new w2j(u6jVar, null));
                ibs viewLifecycleOwner4 = u6jVar.getViewLifecycleOwner();
                viewLifecycleOwner4.getClass();
                ebs.a(viewLifecycleOwner4.getLifecycle()).b(new a3j(u6jVar, null));
                ibs viewLifecycleOwner5 = u6jVar.getViewLifecycleOwner();
                viewLifecycleOwner5.getClass();
                ebs.a(viewLifecycleOwner5.getLifecycle()).b(new c3j(u6jVar, null));
                ibs viewLifecycleOwner6 = u6jVar.getViewLifecycleOwner();
                viewLifecycleOwner6.getClass();
                ebs.a(viewLifecycleOwner6.getLifecycle()).b(new d3j(u6jVar, null));
                ibs viewLifecycleOwner7 = u6jVar.getViewLifecycleOwner();
                viewLifecycleOwner7.getClass();
                ebs.a(viewLifecycleOwner7.getLifecycle()).b(new e3j(u6jVar, null));
                ibs viewLifecycleOwner8 = u6jVar.getViewLifecycleOwner();
                viewLifecycleOwner8.getClass();
                ebs.a(viewLifecycleOwner8.getLifecycle()).b(new f3j(u6jVar, null));
                ibs viewLifecycleOwner9 = u6jVar.getViewLifecycleOwner();
                viewLifecycleOwner9.getClass();
                ebs.a(viewLifecycleOwner9.getLifecycle()).b(new d7j(u6jVar, null));
                ibs viewLifecycleOwner10 = u6jVar.getViewLifecycleOwner();
                viewLifecycleOwner10.getClass();
                ebs.a(viewLifecycleOwner10.getLifecycle()).b(new f7j(u6jVar, null));
                ibs viewLifecycleOwner11 = u6jVar.getViewLifecycleOwner();
                viewLifecycleOwner11.getClass();
                ebs.a(viewLifecycleOwner11.getLifecycle()).b(new h7j(u6jVar, null));
                ibs viewLifecycleOwner12 = u6jVar.getViewLifecycleOwner();
                viewLifecycleOwner12.getClass();
                ebs.a(viewLifecycleOwner12.getLifecycle()).b(new j7j(u6jVar, null));
                GameDetails gameDetails = u6jVar.c;
                if (gameDetails != null) {
                    gameDetails.getName();
                }
                u6jVar.f = new rso();
                r750.d(u6jVar.t0(), new Function0() { // from class: t0j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        final n2j n2jVar = u6jVar;
                        djh djhVar = n2jVar.b;
                        if (djhVar != null) {
                            gr60.a(djhVar.f.b, new Function1() { // from class: l1j
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    ((View) obj2).getClass();
                                    n2j n2jVar2 = n2jVar;
                                    if (n2jVar2.t0().N.getValue() == khp.b || n2jVar2.t0().N.getValue() == khp.e) {
                                        r750.a(n2jVar2.t0(), new r1j(n2jVar2, 0));
                                    }
                                    return Unit.a;
                                }
                            });
                        }
                        djh djhVar2 = n2jVar.b;
                        if (djhVar2 != null) {
                            djhVar2.f.d.setOnClickListener(new View.OnClickListener() { // from class: m1j
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    n2j n2jVar2 = n2jVar;
                                    if (n2jVar2.t0().N.getValue() == khp.c || n2jVar2.t0().N.getValue() == khp.d) {
                                        return;
                                    }
                                    GameDetails gameDetails2 = n2jVar2.c;
                                    String name = gameDetails2 != null ? gameDetails2.getName() : null;
                                    if (name == null) {
                                        name = "";
                                    }
                                    wz.a("FBGRemoved", name, new String[0]);
                                    n2jVar2.Q0();
                                }
                            });
                        }
                        return Unit.a;
                    }
                });
                break;
        }
        return Unit.a;
    }
}
