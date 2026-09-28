package defpackage;

import com.sportybet.android.bookingcode.presentation.widget.BookingCodePanel;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h05 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h05(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = BookingCodePanel.e0;
                ij40 ij40Var = ((BookingCodePanel) obj).Q;
                if (ij40Var != null) {
                    ij40Var.a();
                }
                return Unit.a;
            default:
                return a.c((a5d.a) obj);
        }
    }
}
