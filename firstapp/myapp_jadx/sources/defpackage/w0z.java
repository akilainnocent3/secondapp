package defpackage;

import android.content.DialogInterface;
import com.sportybet.android.instantwin.presentation.openbet.OpenBetsActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w0z implements DialogInterface.OnClickListener {
    public final /* synthetic */ OpenBetsActivity a;

    public /* synthetic */ w0z(OpenBetsActivity openBetsActivity) {
        this.a = openBetsActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = OpenBetsActivity.J;
        this.a.I1();
    }
}
