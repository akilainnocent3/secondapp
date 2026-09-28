package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z4j implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ z4j(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) fragment;
                u6jVar.d1(u6jVar.getActivity());
                break;
            default:
                ((qvs) fragment).dismiss();
                break;
        }
    }
}
