package f2;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82303b;

    public d1(@NonNull ViewGroup viewGroup) {
    }

    public int a() {
        return this.f82302a | this.f82303b;
    }

    public void b(@NonNull View view, @NonNull View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(@NonNull View view, @NonNull View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f82303b = i10;
        } else {
            this.f82302a = i10;
        }
    }

    public void d(@NonNull View view) {
        e(view, 0);
    }

    public void e(@NonNull View view, int i10) {
        if (i10 == 1) {
            this.f82303b = 0;
        } else {
            this.f82302a = 0;
        }
    }
}
