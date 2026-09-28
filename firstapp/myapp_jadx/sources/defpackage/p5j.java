package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.plugin.realsports.event.viewholder.PlayerThreeColumnViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p5j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
                appCompatImageView.setVisibility(0);
                appCompatImageView.setAlpha(0.0f);
                appCompatImageView.animate().alpha(1.0f).setDuration(500L).withEndAction(new Runnable() { // from class: b6j
                    @Override // java.lang.Runnable
                    public final void run() {
                        appCompatImageView.animate().alpha(0.0f).setDuration(1000L);
                    }
                });
                return Unit.a;
            case 1:
                String str = (String) ((pgx) obj).l.getValue();
                if (str != null) {
                    return new Regex(str, ns40.IGNORE_CASE);
                }
                return null;
            case 2:
                return PlayerThreeColumnViewHolder.setupShowMoreButton$lambda$0$1((PlayerThreeColumnViewHolder) obj);
            default:
                ((osw) obj).k(2);
                return Unit.a;
        }
    }
}
