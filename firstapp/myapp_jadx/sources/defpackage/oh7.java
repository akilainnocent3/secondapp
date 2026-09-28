package defpackage;

import com.sportygames.compose.chat.data.model.ChatListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.ui.ChatViewModel$leaveGroup$1", f = "ChatViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class oh7 extends tje0 implements Function2<jj50<? extends ChatListResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hh7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh7(hh7 hh7Var, v1b<? super oh7> v1bVar) {
        super(2, v1bVar);
        this.b = hh7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        oh7 oh7Var = new oh7(this.b, v1bVar);
        oh7Var.a = obj;
        return oh7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jj50<? extends ChatListResponse> jj50Var, v1b<? super Unit> v1bVar) {
        return ((oh7) create(jj50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jj50 jj50Var = (jj50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = jj50Var instanceof jj50.c;
        bh7.b bVar = bh7.b.a;
        hh7 hh7Var = this.b;
        if (z) {
            hh7Var.C.setValue(m2g.a);
            wwd0 wwd0Var = hh7Var.A;
            wwd0Var.getClass();
            wwd0Var.k(null, bVar);
        } else if (jj50Var instanceof jj50.a) {
            wwd0 wwd0Var2 = hh7Var.A;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bVar);
        } else {
            if (!(jj50Var instanceof jj50.b)) {
                uhc.a();
                return null;
            }
            wwd0 wwd0Var3 = hh7Var.A;
            wwd0Var3.getClass();
            wwd0Var3.k(null, bVar);
        }
        return Unit.a;
    }
}
