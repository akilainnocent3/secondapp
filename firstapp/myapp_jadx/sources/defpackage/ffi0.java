package defpackage;

import android.view.View;
import com.sportybet.android.virtual.presentation.activity.VirtualGameActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class ffi0 implements View.OnClickListener {
    public final /* synthetic */ VirtualGameActivity a;

    public ffi0(VirtualGameActivity virtualGameActivity) {
        this.a = virtualGameActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.finish();
    }
}
