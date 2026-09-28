package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class tuv implements tse {
    public final /* synthetic */ Function1 a;

    public tuv(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.invoke(Boolean.FALSE);
    }
}
