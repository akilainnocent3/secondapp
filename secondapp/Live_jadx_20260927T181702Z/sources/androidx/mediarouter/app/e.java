package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.y0;
import r7.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e extends androidx.fragment.app.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17762e = "selector";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17763b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Dialog f17764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h1 f17765d;

    public e() {
        setCancelable(true);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.f17764c;
        if (dialog == null) {
            return;
        }
        if (this.f17763b) {
            ((k) dialog).k();
        } else {
            ((d) dialog).o();
        }
    }

    @Override // androidx.fragment.app.k
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (this.f17763b) {
            k kVarS = s(getContext());
            this.f17764c = kVarS;
            kVarS.j(q());
        } else {
            d dVarR = r(getContext(), bundle);
            this.f17764c = dVarR;
            dVarR.n(q());
        }
        return this.f17764c;
    }

    public final void p() {
        if (this.f17765d == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f17765d = h1.d(arguments.getBundle("selector"));
            }
            if (this.f17765d == null) {
                this.f17765d = h1.f123799d;
            }
        }
    }

    @NonNull
    public h1 q() {
        p();
        return this.f17765d;
    }

    @NonNull
    public d r(@NonNull Context context, @Nullable Bundle bundle) {
        return new d(context);
    }

    @NonNull
    @y0({y0.a.LIBRARY})
    public k s(@NonNull Context context) {
        return new k(context);
    }

    public void t(@NonNull h1 h1Var) {
        if (h1Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        p();
        if (this.f17765d.equals(h1Var)) {
            return;
        }
        this.f17765d = h1Var;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", h1Var.a());
        setArguments(arguments);
        Dialog dialog = this.f17764c;
        if (dialog != null) {
            if (this.f17763b) {
                ((k) dialog).j(h1Var);
            } else {
                ((d) dialog).n(h1Var);
            }
        }
    }

    public void u(boolean z10) {
        if (this.f17764c != null) {
            throw new IllegalStateException("This must be called before creating dialog");
        }
        this.f17763b = z10;
    }
}
