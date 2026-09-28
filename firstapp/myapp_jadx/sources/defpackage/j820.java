package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes7.dex */
public final class j820 implements g6i0 {
    public final LinearLayoutCompat a;
    public final LinearLayoutCompat b;
    public final TextView c;
    public final TextView d;
    public final MaterialButton e;

    public j820(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, TextView textView, TextView textView2, MaterialButton materialButton) {
        this.a = linearLayoutCompat;
        this.b = linearLayoutCompat2;
        this.c = textView;
        this.d = textView2;
        this.e = materialButton;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
