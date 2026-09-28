package defpackage;

import android.view.View;
import com.sportygames.pocketrocket.component.PrHeaderContainer;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class bz10 implements View.OnLayoutChangeListener {
    public final /* synthetic */ PrHeaderContainer a;
    public final /* synthetic */ zy10 b;

    public bz10(PrHeaderContainer prHeaderContainer, zy10 zy10Var) {
        this.a = prHeaderContainer;
        this.b = zy10Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        l8j0 l8j0VarA = r6i0.e.a(view);
        if (l8j0VarA != null) {
            zy10.n0(this.b, l8j0VarA, this.a);
        }
    }
}
