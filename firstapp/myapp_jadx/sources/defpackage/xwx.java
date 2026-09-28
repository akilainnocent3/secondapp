package defpackage;

import androidx.compose.ui.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xwx extends qlr implements Function1<d.b, Boolean> {
    public final /* synthetic */ duw<d.b> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwx(duw<d.b> duwVar) {
        super(1);
        this.a = duwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(d.b bVar) {
        this.a.b(bVar);
        return Boolean.TRUE;
    }
}
