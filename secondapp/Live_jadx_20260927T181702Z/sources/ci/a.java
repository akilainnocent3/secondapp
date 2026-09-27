package ci;

import android.animation.Animator;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Animator f23288a;

    public void a() {
        Animator animator = this.f23288a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f23288a = null;
    }

    public void c(Animator animator) {
        a();
        this.f23288a = animator;
    }
}
