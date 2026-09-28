package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gjk0 extends x9s implements DialogInterface.OnCancelListener {
    public volatile boolean a;
    public final AtomicReference b;
    public final ljk0 c;
    public final v4l d;

    public gjk0(dbs dbsVar, v4l v4lVar) {
        super(dbsVar);
        this.b = new AtomicReference(null);
        this.c = new ljk0(Looper.getMainLooper());
        this.d = v4lVar;
    }

    public final void a(ConnectionResult connectionResult, int i) {
        this.b.set(null);
        ((ufk0) this).f.h(connectionResult, i);
    }

    @Override // defpackage.x9s
    public final void onActivityResult(int i, int i2, Intent intent) {
        AtomicReference atomicReference = this.b;
        uik0 uik0Var = (uik0) atomicReference.get();
        if (i != 1) {
            if (i == 2) {
                int iC = this.d.c(getActivity(), w4l.a);
                if (iC == 0) {
                    atomicReference.set(null);
                    ljk0 ljk0Var = ((ufk0) this).f.C;
                    ljk0Var.sendMessage(ljk0Var.obtainMessage(3));
                    return;
                } else {
                    if (uik0Var == null) {
                        return;
                    }
                    if (uik0Var.b.b == 18 && iC == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            atomicReference.set(null);
            ljk0 ljk0Var2 = ((ufk0) this).f.C;
            ljk0Var2.sendMessage(ljk0Var2.obtainMessage(3));
            return;
        } else if (i2 == 0) {
            if (uik0Var != null) {
                a(new ConnectionResult(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, uik0Var.b.toString()), uik0Var.a);
                return;
            }
            return;
        }
        if (uik0Var != null) {
            a(uik0Var.b, uik0Var.a);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        uik0 uik0Var = (uik0) this.b.get();
        a(connectionResult, uik0Var == null ? -1 : uik0Var.a);
    }

    @Override // defpackage.x9s
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b.set(bundle.getBoolean("resolving_error", false) ? new uik0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // defpackage.x9s
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        uik0 uik0Var = (uik0) this.b.get();
        if (uik0Var == null) {
            return;
        }
        ConnectionResult connectionResult = uik0Var.b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", uik0Var.a);
        bundle.putInt("failed_status", connectionResult.b);
        bundle.putParcelable("failed_resolution", connectionResult.c);
    }

    @Override // defpackage.x9s
    public void onStart() {
        super.onStart();
        this.a = true;
    }

    @Override // defpackage.x9s
    public void onStop() {
        super.onStop();
        this.a = false;
    }
}
