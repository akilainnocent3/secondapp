package defpackage;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import com.sporty.android.common_ui.widgets.IconTextSelectorButton;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class p77 {
    public static final void a(IconTextSelectorButton iconTextSelectorButton, o77 o77Var) {
        if (o77Var == null) {
            Context context = iconTextSelectorButton.getContext();
            context.getClass();
            iconTextSelectorButton.setText(sn5.b(context, R.string.page_payment__select_your_mobile_provider, new Object[0]));
            iconTextSelectorButton.getIconImageView().setImageDrawable(null);
            c8i0.f(iconTextSelectorButton.getIconImageView());
            return;
        }
        iconTextSelectorButton.setText(o77Var.a);
        AppCompatImageView iconImageView = iconTextSelectorButton.getIconImageView();
        String str = o77Var.c;
        String str2 = StringsKt.U(str) ? null : str;
        m9n m9nVarA = qw90.a(iconImageView.getContext());
        nan.a aVar = new nan.a(iconImageView.getContext());
        aVar.c = str2;
        abn.f(aVar, iconImageView);
        final int i = o77Var.b;
        aVar.p = new Function1() { // from class: wan
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zbn.b(r1b.a(((nan) obj).a, i));
            }
        };
        abn.e(aVar, R.drawable.icon_default);
        abn.b(aVar, R.drawable.icon_default);
        uan.a(aVar);
        m9nVarA.a(aVar.a());
        c8i0.n(iconTextSelectorButton.getIconImageView());
    }
}
