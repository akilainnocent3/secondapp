package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.bookingcode.presentation.uistate.HighLiabilityItemUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bri implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bri(int i, int i2, Function0 function0) {
        this.c = function0;
        this.b = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Function0 function0 = (Function0) this.c;
                ((Integer) obj2).getClass();
                tri.b(qj40.a(1), this.b, (a) obj, function0);
                break;
            default:
                ((Integer) obj2).intValue();
                b2a0.d((HighLiabilityItemUiState) this.c, (a) obj, qj40.a(this.b | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bri(HighLiabilityItemUiState highLiabilityItemUiState, int i) {
        this.c = highLiabilityItemUiState;
        this.b = i;
    }
}
