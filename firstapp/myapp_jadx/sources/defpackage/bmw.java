package defpackage;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bmw extends FileObserver {
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public final CopyOnWriteArrayList<Function1<String, Unit>> a;

    public bmw(String str) {
        super(str, 128);
        this.a = new CopyOnWriteArrayList<>();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        Iterator<Function1<String, Unit>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().invoke(str);
        }
    }
}
