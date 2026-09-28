package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class n7i0 extends qlr implements Function0<Object> {
    public final /* synthetic */ ViewFactoryHolder<View> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7i0(ViewFactoryHolder<View> viewFactoryHolder) {
        super(0);
        this.a = viewFactoryHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.a.P.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
