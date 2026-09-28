package defpackage;

import androidx.compose.ui.layout.y;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lzp implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lzp(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                y.a aVar = (y.a) obj;
                aVar.getClass();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    y.a.A(aVar, (y) obj4, 0, 0);
                }
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj5 = arrayList2.get(i3);
                    i3++;
                    y.a.A(aVar, (y) obj5, 0, 0);
                }
                return Unit.a;
            default:
                xqj0 xqj0Var = (xqj0) obj3;
                xoj0 xoj0Var = (xoj0) obj2;
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                    vtw<kqj0> vtwVar = xqj0Var.p;
                    if (vtwVar == null) {
                        Intrinsics.n("withdrawUiEventFlow");
                        throw null;
                    }
                    vtwVar.a(kqj0.a.a);
                    vtw<m480> vtwVar2 = xqj0Var.n;
                    if (vtwVar2 == null) {
                        Intrinsics.n("securityUiEventFlow");
                        throw null;
                    }
                    vtwVar2.a(new m480.g(((xoj0.d.s) xoj0Var).b));
                } else if (alertDialogCallbackType instanceof AlertDialogCallbackType.Negative) {
                    vtw<kqj0> vtwVar3 = xqj0Var.p;
                    if (vtwVar3 == null) {
                        Intrinsics.n("withdrawUiEventFlow");
                        throw null;
                    }
                    vtwVar3.a(kqj0.a.a);
                }
                return Unit.a;
        }
    }
}
