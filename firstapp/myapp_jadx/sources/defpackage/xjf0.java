package defpackage;

import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class xjf0 extends qlr implements Function0<BaseInputConnection> {
    public final /* synthetic */ wjf0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjf0(wjf0 wjf0Var) {
        super(0);
        this.a = wjf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.a.a, false);
    }
}
