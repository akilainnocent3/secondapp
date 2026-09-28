package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class uln extends InputConnectionWrapper {
    public final /* synthetic */ tln a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uln(InputConnection inputConnection, tln tlnVar) {
        super(inputConnection, false);
        this.a = tlnVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        wln wlnVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            wlnVar = new wln(new wln.a(inputContentInfo));
        }
        if (this.a.a(wlnVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
