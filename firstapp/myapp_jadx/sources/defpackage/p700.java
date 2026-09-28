package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p700 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        eo20[] eo20VarArr = eo20.a;
        LinkedHashSet linkedHashSet = q390.a;
        return b.k(q390.a(context, "sporty_payment", linkedHashSet), q390.a(context, "sporty_bank", linkedHashSet), q390.a(context, "sporty_bank_failed_bvn", linkedHashSet));
    }
}
