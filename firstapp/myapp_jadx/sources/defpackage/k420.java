package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.home.MainActivity;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class k420 extends ClickableSpan {
    public final /* synthetic */ i420 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Activity d;

    public k420(i420 i420Var, String str, int i, Activity activity) {
        this.a = i420Var;
        this.b = str;
        this.c = i;
        this.d = activity;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Object next;
        view.getClass();
        this.a.i.a(new a91(this.b), k00.d, k00.c);
        wae waeVar = wae.AUTO_BET;
        l91.d.getClass();
        Iterator<T> it = l91.z.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((l91) next).a != this.c);
        l91 l91Var = (l91) next;
        Uri uriB = o7d.b(waeVar, new Pair[]{new Pair(AnalyticsParam.EVENT_STATUS, l91Var != null ? l91Var.c : l91.Ongoing.c)});
        uriB.getClass();
        Activity activity = this.d;
        Intent intent = new Intent(activity, (Class<?>) MainActivity.class);
        intent.setData(uriB);
        intent.setFlags(268435456);
        intent.putExtra("tab", 0);
        intent.putExtra("tab_tag", "Home");
        activity.startActivity(intent);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setUnderlineText(true);
    }
}
