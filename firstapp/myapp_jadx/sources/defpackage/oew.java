package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.android.multimaker.presentation.widget.filter.FilterTabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oew implements Function1 {
    public final /* synthetic */ MultiMakerActivity a;

    public /* synthetic */ oew(MultiMakerActivity multiMakerActivity) {
        this.a = multiMakerActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xvf0 xvf0Var = (xvf0) obj;
        int i = MultiMakerActivity.E;
        xvf0Var.getClass();
        MultiMakerActivity multiMakerActivity = this.a;
        kid0 kid0Var = multiMakerActivity.f;
        if (kid0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FilterTabLayout filterTabLayout = kid0Var.e;
        String str = xvf0Var.b;
        str.getClass();
        StringUiText stringUiText = vch0.a;
        filterTabLayout.I(new StringUiText(str));
        tjw tjwVarZ1 = multiMakerActivity.z1();
        ej5.c(o8i0.d(tjwVarZ1), null, null, new tiw(tjwVarZ1, xvf0Var, null), 3);
        return Unit.a;
    }
}
