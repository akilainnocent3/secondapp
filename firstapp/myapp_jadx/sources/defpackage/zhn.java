package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface zhn<T> {
    T create(Context context);

    List<Class<? extends zhn<?>>> dependencies();
}
