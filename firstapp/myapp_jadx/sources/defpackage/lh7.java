package defpackage;

import com.sportygames.compose.chat.data.model.ChatErrorResponse;
import com.sportygames.compose.chat.data.model.ChatListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.ui.ChatViewModel$fetchInitialMessages$1", f = "ChatViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class lh7 extends tje0 implements Function2<jj50<? extends List<? extends ChatListResponse>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hh7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh7(hh7 hh7Var, v1b<? super lh7> v1bVar) {
        super(2, v1bVar);
        this.b = hh7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lh7 lh7Var = new lh7(this.b, v1bVar);
        lh7Var.a = obj;
        return lh7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jj50<? extends List<? extends ChatListResponse>> jj50Var, v1b<? super Unit> v1bVar) {
        return ((lh7) create(jj50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        hh7 hh7Var = this.b;
        wwd0 wwd0Var = hh7Var.A;
        jj50 jj50Var = (jj50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (jj50Var instanceof jj50.c) {
            wwd0Var.getClass();
            wwd0Var.k(null, bh7.c.a);
            hh7Var.C.setValue(((jj50.c) jj50Var).a);
        } else if (jj50Var instanceof jj50.a) {
            StringBuilder sb = new StringBuilder("Error fetching messages: ");
            ChatErrorResponse chatErrorResponse = ((jj50.a) jj50Var).b;
            sb.append(chatErrorResponse != null ? chatErrorResponse.getErrorName() : null);
            bh7.a aVar = new bh7.a(sb.toString());
            wwd0Var.getClass();
            wwd0Var.k(null, aVar);
        } else {
            if (!(jj50Var instanceof jj50.b)) {
                uhc.a();
                return null;
            }
            bh7.a aVar2 = new bh7.a("Network error fetching messages");
            wwd0Var.getClass();
            wwd0Var.k(null, aVar2);
        }
        return Unit.a;
    }
}
