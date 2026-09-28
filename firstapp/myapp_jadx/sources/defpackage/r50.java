package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r50 extends qlr implements Function1<Configuration, Unit> {
    public final /* synthetic */ ytw<Configuration> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r50(ytw<Configuration> ytwVar) {
        super(1);
        this.a = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Configuration configuration) {
        Configuration configuration2 = new Configuration(configuration);
        chf chfVar = AndroidCompositionLocals_androidKt.a;
        this.a.setValue(configuration2);
        return Unit.a;
    }
}
