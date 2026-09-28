package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class z40 extends qlr implements Function1<v5b, r90> {
    public final /* synthetic */ AndroidComposeView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(AndroidComposeView androidComposeView) {
        super(1);
        this.a = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final r90 invoke(v5b v5bVar) {
        AndroidComposeView androidComposeView = this.a;
        return new r90(androidComposeView, androidComposeView.getTextInputService(), v5bVar);
    }
}
