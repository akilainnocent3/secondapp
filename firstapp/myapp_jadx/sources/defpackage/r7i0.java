package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class r7i0 implements Sequence<View> {
    final /* synthetic */ ViewGroup a;

    public r7i0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<View> iterator() {
        return new t7i0(this.a);
    }
}
