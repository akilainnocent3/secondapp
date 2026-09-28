package defpackage;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes7.dex */
public class jr10 extends Fragment {
    public boolean a;

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.a && oti.c().v == 0) {
            ((br3) mmc.a(hp0.A, br3.class)).U().a(requireActivity(), false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        boolean z = this instanceof wym;
        this.a = z;
        if (z) {
            if (oti.c().v == 1) {
                ((br3) mmc.a(hp0.A, br3.class)).U().a(requireActivity(), true);
            }
            b3.b = getClass().getSimpleName();
        }
    }
}
