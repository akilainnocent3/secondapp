package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nef0 {

    public /* synthetic */ class a extends saj implements Function1<Function1<? super ydf0, ? extends Boolean>, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function1<? super ydf0, ? extends Boolean> function1) {
            ((xdf0) this.receiver).b.g(function1);
            return Unit.a;
        }
    }

    public static final aef0 a(okd okdVar) {
        sef0 sef0Var;
        xdf0 xdf0Var = new xdf0();
        final a aVar = new a(1, xdf0Var, xdf0.class, "addFilter", "addFilter$foundation_release(Lkotlin/jvm/functions/Function1;)V", 0);
        final lef0 lef0Var = new lef0(xdf0Var);
        obl0.b(okdVar, cef0.a, new Function1() { // from class: mef0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hvg0 hvg0Var = (hvg0) obj;
                if (hvg0Var instanceof ok) {
                    lef0Var.invoke(((ok) hvg0Var).D);
                } else {
                    if (!(hvg0Var instanceof fnh)) {
                        ib5.a("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                        return null;
                    }
                    aVar.invoke(null);
                }
                return Boolean.TRUE;
            }
        });
        etw etwVar = new etw((Object) null);
        etw<ydf0> etwVar2 = xdf0Var.a;
        Object[] objArr = etwVar2.a;
        int i = etwVar2.b;
        ydf0 ydf0Var = null;
        int i2 = 0;
        boolean z = true;
        while (true) {
            sef0Var = sef0.b;
            if (i2 >= i) {
                break;
            }
            ydf0 ydf0Var2 = (ydf0) objArr[i2];
            if (!z || ydf0Var2 != sef0Var) {
                if (ydf0Var2 == sef0Var && ydf0Var == sef0Var) {
                    z = false;
                } else {
                    if (ydf0Var2 != sef0Var) {
                        etw<Function1<ydf0, Boolean>> etwVar3 = xdf0Var.b;
                        Object[] objArr2 = etwVar3.a;
                        int i3 = etwVar3.b;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (((Boolean) ((Function1) objArr2[i4]).invoke(ydf0Var2)).booleanValue()) {
                                    i4++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    etwVar.g(ydf0Var2);
                    z = false;
                    ydf0Var = ydf0Var2;
                }
            }
            i2++;
        }
        if (((ydf0) (etwVar.d() ? null : etwVar.a[etwVar.b - 1])) == sef0Var) {
            etwVar.k(etwVar.b - 1);
        }
        List list = etwVar.c;
        List list2 = list;
        if (list == null) {
            etw.b<E> bVar = new etw.b<>(etwVar);
            etwVar.c = bVar;
            list2 = bVar;
        }
        return new aef0(list2);
    }
}
