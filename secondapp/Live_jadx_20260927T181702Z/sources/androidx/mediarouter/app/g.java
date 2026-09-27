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
public class g extends androidx.fragment.app.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17842e = "selector";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17843b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Dialog f17844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h1 f17845d;

    public g() {
        setCancelable(true);
    }

    private void p() {
        if (this.f17845d == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f17845d = h1.d(arguments.getBundle("selector"));
            }
            if (this.f17845d == null) {
                this.f17845d = h1.f123799d;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.f17844c;
        if (dialog != null) {
            if (this.f17843b) {
                ((l) dialog).s();
            } else {
                ((f) dialog).Z();
            }
        }
    }

    @Override // androidx.fragment.app.k
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (this.f17843b) {
            l lVarS = s(getContext());
            this.f17844c = lVarS;
            lVarS.q(this.f17845d);
        } else {
            this.f17844c = r(getContext(), bundle);
        }
        return this.f17844c;
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f17844c;
        if (dialog == null || this.f17843b) {
            return;
        }
        ((f) dialog).x(false);
    }

    @NonNull
    @y0({y0.a.LIBRARY})
    public h1 q() {
        p();
        return this.f17845d;
    }

    @NonNull
    public f r(@NonNull Context context, @Nullable Bundle bundle) {
        return new f(context);
    }

    @NonNull
    @y0({y0.a.LIBRARY})
    public l s(@NonNull Context context) {
        return new l(context);
    }

    @y0({y0.a.LIBRARY})
    public void t(@NonNull h1 h1Var) {
        if (h1Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        p();
        if (this.f17845d.equals(h1Var)) {
            return;
        }
        this.f17845d = h1Var;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", h1Var.a());
        setArguments(arguments);
        Dialog dialog = this.f17844c;
        if (dialog == null || !this.f17843b) {
            return;
        }
        ((l) dialog).q(h1Var);
    }

    public void u(boolean z10) {
        if (this.f17844c != null) {
            throw new IllegalStateException("This must be called before creating dialog");
        }
        this.f17843b = z10;
    }
}
