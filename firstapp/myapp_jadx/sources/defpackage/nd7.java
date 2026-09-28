package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.chat.data.ChatMessage;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nd7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nd7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final td7 td7Var = (td7) obj2;
                List<ChatMessage> list = (List) obj;
                list.getClass();
                td7Var.r0(list);
                if (td7Var.m0().c0) {
                    qrr qrrVar = td7Var.a;
                    qrrVar.getClass();
                    qrrVar.v.postDelayed(new Runnable() { // from class: gd7
                        @Override // java.lang.Runnable
                        public final void run() {
                            td7 td7Var2 = td7Var;
                            if (td7Var2.isAdded()) {
                                qrr qrrVar2 = td7Var2.a;
                                qrrVar2.getClass();
                                RecyclerView.o layoutManager = qrrVar2.v.getLayoutManager();
                                if (layoutManager != null) {
                                    layoutManager.H0(td7Var2.i.getItemCount() - 1);
                                }
                            }
                        }
                    }, 500L);
                }
                return Unit.a;
            case 1:
                fgb fgbVar = (fgb) obj2;
                String str = (String) obj;
                str.getClass();
                fgbVar.o1 = str;
                ((x5a0) fgbVar.k1).setValue(Boolean.TRUE);
                fgbVar.n2();
                return Unit.a;
            default:
                ((AlertDialogCallbackType) obj).getClass();
                vtw<a> vtwVar = ((xqj0) obj2).l;
                if (vtwVar != null) {
                    b.b(vtwVar);
                    return Unit.a;
                }
                Intrinsics.n("commonUiEventFlow");
                throw null;
        }
    }
}
