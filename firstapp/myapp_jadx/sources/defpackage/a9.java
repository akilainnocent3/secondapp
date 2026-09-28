package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a9 implements Function0 {
    public final /* synthetic */ d9 a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ a9(d9 d9Var, Activity activity) {
        this.a = d9Var;
        this.b = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ble.a(this.b, this.a.e, 2000);
        return Unit.a;
    }
}
