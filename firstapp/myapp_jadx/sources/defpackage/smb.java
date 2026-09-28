package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class smb implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((String) obj).getClass();
                return Unit.a;
            case 1:
                xma xmaVar = (xma) obj;
                int i = a90.a;
                Context context = (Context) xmaVar.a(AndroidCompositionLocals_androidKt.b);
                mmd mmdVar = (mmd) xmaVar.a(kna.h);
                pfz pfzVar = (pfz) xmaVar.a(rfz.a);
                if (pfzVar == null) {
                    return null;
                }
                return new e70(context, mmdVar, pfzVar.a, pfzVar.b);
            default:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
        }
    }
}
