package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.window.PopupLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class da0 implements aiv {
    public final /* synthetic */ PopupLayout a;
    public final /* synthetic */ asr b;

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            return Unit.a;
        }
    }

    public da0(PopupLayout popupLayout, asr asrVar) {
        this.a = popupLayout;
        this.b = asrVar;
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        this.a.setParentLayoutDirection(this.b);
        return t.z1(tVar, 0, 0, a.a);
    }
}
