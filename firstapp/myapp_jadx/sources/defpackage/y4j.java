package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y4j implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ y4j(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                ((u6j) fragment).o1(1);
                break;
            default:
                ((qvs) fragment).dismiss();
                break;
        }
    }
}
