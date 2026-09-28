package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vk20 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        view.getClass();
        return Boolean.valueOf(Intrinsics.g(view.getTag(), "footer_pinned_view"));
    }
}
