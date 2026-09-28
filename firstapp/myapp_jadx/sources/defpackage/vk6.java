package defpackage;

import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.cashoutphase3.h;
import com.sportybet.plugin.realsports.data.Bet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$observeCcfState$2", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vk6 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk6(b bVar, v1b<? super vk6> v1bVar) {
        super(2, v1bVar);
        this.a = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vk6(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((vk6) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b bVar = this.a;
        h hVarS0 = bVar.s0();
        xh6 xh6Var = bVar.c0;
        if (xh6Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = xh6Var.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Bet bet = ((pl6) obj2).a;
            if (bet != null) {
                hashSet.add(bet);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Function1) hVarS0.C0.getValue()).invoke((Bet) it.next());
        }
        return Unit.a;
    }
}
