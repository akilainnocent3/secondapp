package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import com.sportybet.android.auth.SportyAccountManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tkk implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ tkk(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                TextView textView = (TextView) obj;
                textView.getClass();
                Spanned spannedFromHtml = Html.fromHtml(str, 0);
                spannedFromHtml.getClass();
                textView.setText(StringsKt.t0(spannedFromHtml));
                return Unit.a;
            default:
                return SportyAccountManagerImpl.setLoginType$lambda$0(str, (t8) obj);
        }
    }
}
