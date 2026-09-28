package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hp3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ hp3(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Fragment fragment = this.b;
        switch (i2) {
            case 0:
                jp3.a aVar = jp3.c0;
                ((jp3) fragment).requireActivity().finish();
                break;
            default:
                dfm dfmVar = (dfm) fragment;
                List<String> list = dfm.v2;
                iim iimVar = dfmVar.w1;
                Context contextRequireContext = dfmVar.requireContext();
                iimVar.getClass();
                contextRequireContext.getClass();
                ej5.c(o8i0.d(iimVar), null, null, new cjm(iimVar, contextRequireContext, false, null), 3);
                break;
        }
    }
}
