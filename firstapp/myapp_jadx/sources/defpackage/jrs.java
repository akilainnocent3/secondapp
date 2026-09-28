package defpackage;

import com.sportybet.plugin.realsports.home.LivePanel;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jrs implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = LivePanel.c0;
        return !((OutcomeButton) obj).isAttachedToWindow();
    }
}
