package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yp10 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        OutcomeButton outcomeButton = new OutcomeButton(context);
        outcomeButton.setBackgroundResource(R.drawable.bg_filled_brand_secondary_variable_type1_with_brand_secondary);
        outcomeButton.setTextColor(o0b.b(context, R.color.text_color_custom_brand_secondary_variable_type2_type3_with_brand_tertiary));
        outcomeButton.setTextSize(1, 14.0f);
        outcomeButton.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        return outcomeButton;
    }
}
