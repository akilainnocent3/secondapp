package defpackage;

import android.widget.Checkable;
import defpackage.ubv;

/* JADX INFO: loaded from: classes4.dex */
public interface ubv<T extends ubv<T>> extends Checkable {

    public interface a<C> {
    }

    int getId();

    void setInternalOnCheckedChangeListener(a<T> aVar);
}
