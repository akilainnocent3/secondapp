package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.core.model.bet.edit.ErrorDataInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class nnf {
    public final ComposeView a;
    public final ytw<Boolean> b;
    public a c;

    public interface a {
        void a(ErrorDataInfo errorDataInfo);
    }

    public nnf(ComposeView composeView) {
        composeView.getClass();
        this.a = composeView;
        this.b = m.b(Boolean.FALSE);
        composeView.setViewCompositionStrategy(u6i0.c.a);
    }

    public final void a(final ErrorDataInfo errorDataInfo) {
        ((x5a0) this.b).setValue(Boolean.TRUE);
        this.a.setContent(new op8(-1329307211, new Function2() { // from class: lnf
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final nnf nnfVar = this;
                    boolean zBooleanValue = ((Boolean) ((x5a0) nnfVar.b).getValue()).booleanValue();
                    boolean zA = aVar.A(nnfVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new e02(nnfVar, 1);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(nnfVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: mnf
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                ErrorDataInfo errorDataInfo2 = (ErrorDataInfo) obj3;
                                errorDataInfo2.getClass();
                                nnf.a aVar2 = nnfVar.c;
                                if (aVar2 != null) {
                                    aVar2.a(errorDataInfo2);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    knf.a(errorDataInfo, zBooleanValue, function0, (Function1) objY2, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
