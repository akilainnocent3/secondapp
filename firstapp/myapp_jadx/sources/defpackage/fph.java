package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fph implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }
}
