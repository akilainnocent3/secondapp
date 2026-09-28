package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class gr60 {
    public static final void a(View view, Function1<? super View, Unit> function1) {
        view.getClass();
        view.setOnClickListener(new er60(new fr60(function1, 0)));
    }
}
