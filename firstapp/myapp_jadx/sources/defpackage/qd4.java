package defpackage;

import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import androidx.fragment.app.Fragment;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class qd4 {

    public static class b {
        public final c a;
        public final int b;

        public b(c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }
    }

    public static class d {
        public final String a;
        public final CharSequence b;
        public final String c;

        public d(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    public static vd4 a(Fragment fragment, boolean z) {
        w8i0 activity = z ? fragment.getActivity() : null;
        if (activity == null) {
            activity = fragment.getParentFragment();
        }
        if (activity == null) {
            ib5.a("view model not found");
            return null;
        }
        v8i0 viewModelStore = activity.getViewModelStore();
        boolean z2 = activity instanceof iel;
        r8i0.c defaultViewModelProviderFactory = z2 ? ((iel) activity).getDefaultViewModelProviderFactory() : fjd.a;
        cyb defaultViewModelCreationExtras = z2 ? ((iel) activity).getDefaultViewModelCreationExtras() : cyb.a.b;
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(vd4.class);
        String strI = dq7VarA.i();
        if (strI != null) {
            return (vd4) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        }
        hb5.a("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static class c {
        public final Signature a;
        public final Cipher b;
        public final Mac c;
        public final IdentityCredential d;
        public final PresentationSession e;

        public c(Signature signature) {
            this.a = signature;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public c(Cipher cipher) {
            this.a = null;
            this.b = cipher;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public c(Mac mac) {
            this.a = null;
            this.b = null;
            this.c = mac;
            this.d = null;
            this.e = null;
        }

        public c(IdentityCredential identityCredential) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = identityCredential;
            this.e = null;
        }

        public c(PresentationSession presentationSession) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = presentationSession;
        }
    }

    public static abstract class a {
        public void b() {
        }

        public void c(b bVar) {
        }

        public void a(int i, CharSequence charSequence) {
        }
    }
}
