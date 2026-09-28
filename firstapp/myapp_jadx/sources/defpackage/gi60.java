package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.sportygames.commons.components.a;
import com.sportygames.spin2win.model.local.LocalGameDetailsEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gi60 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ gi60(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                a aVar = (a) fragment;
                ((View) obj).getClass();
                aVar.v.invoke(Boolean.TRUE);
                String str = aVar.b;
                mn80 mn80Var = aVar.y;
                if (mn80Var != null) {
                    a.j0(str, mn80Var.d.getText().toString(), aVar.c);
                    return Unit.a;
                }
                Intrinsics.n("binding");
                throw null;
            default:
                return Boolean.valueOf(((a1b0) fragment).o0((LocalGameDetailsEntity) obj));
        }
    }
}
