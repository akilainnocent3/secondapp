package f2;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface n0 {
    void addMenuProvider(@NonNull u0 u0Var);

    void addMenuProvider(@NonNull u0 u0Var, @NonNull androidx.lifecycle.b0 b0Var);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(@NonNull u0 u0Var, @NonNull androidx.lifecycle.b0 b0Var, @NonNull androidx.lifecycle.r.b bVar);

    void invalidateMenu();

    void removeMenuProvider(@NonNull u0 u0Var);
}
