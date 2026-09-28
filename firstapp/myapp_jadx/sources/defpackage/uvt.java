package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uvt implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextAppearance(R.style.B1_R);
        textView.setLineSpacing(0.0f, 1.5f);
        return textView;
    }
}
