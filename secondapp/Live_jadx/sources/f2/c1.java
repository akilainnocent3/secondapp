package f2;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface c1 {
    int getNestedScrollAxes();

    boolean onNestedFling(@NonNull View view, float f10, float f11, boolean z10);

    boolean onNestedPreFling(@NonNull View view, float f10, float f11);

    void onNestedPreScroll(@NonNull View view, int i10, int i11, @NonNull int[] iArr);

    void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13);

    void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i10);

    boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i10);

    void onStopNestedScroll(@NonNull View view);
}
