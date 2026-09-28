package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ly2 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                az2.h((d) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                String str = (String) obj2;
                e eVar = ((EventActivity) obj3).E0;
                if (eVar == null) {
                    Intrinsics.n("eventViewModel");
                    throw null;
                }
                if (iIntValue > 0 && !StringsKt.U(eVar.Q)) {
                    eVar.F.a(new qfd0(eVar.Q, iIntValue, str), k00.d);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ly2(EventActivity eventActivity) {
        this.b = eventActivity;
    }
}
