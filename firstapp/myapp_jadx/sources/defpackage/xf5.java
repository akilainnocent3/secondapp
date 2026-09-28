package defpackage;

import android.os.Bundle;
import com.sportybet.android.virtual.presentation.dialog.BuildAndGoRunningPageDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xf5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xf5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle arguments = ((BuildAndGoRunningPageDialog) obj).getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("ARG_SHOW_CAROUSEL", true) : true);
            case 1:
                n2j n2jVar = (n2j) obj;
                djh djhVar = n2jVar.b;
                if (djhVar != null) {
                    djhVar.f.c.setVisibility(8);
                }
                djh djhVar2 = n2jVar.b;
                if (djhVar2 != null) {
                    djhVar2.B.setVisibility(8);
                }
                return Unit.a;
            default:
                ((ytw) obj).setValue(Boolean.TRUE);
                return Unit.a;
        }
    }
}
