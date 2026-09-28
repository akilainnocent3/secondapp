package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a03 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.l(false);
                return Unit.a;
            default:
                Selection selection = (Selection) obj;
                selection.getClass();
                return selection.b.specifier;
        }
    }
}
