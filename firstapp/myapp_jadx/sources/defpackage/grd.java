package defpackage;

import com.sporty.android.common_ui.widgets.ClearEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class grd extends saj implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        ClearEditText clearEditTextR0 = ((lrd) this.receiver).r0();
        if (clearEditTextR0 != null) {
            clearEditTextR0.setError(str2);
        }
        return Unit.a;
    }
}
